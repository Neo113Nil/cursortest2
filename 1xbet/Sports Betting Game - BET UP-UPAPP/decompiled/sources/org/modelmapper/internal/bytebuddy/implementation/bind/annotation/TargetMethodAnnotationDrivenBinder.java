package org.modelmapper.internal.bytebuddy.implementation.bind.annotation;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldLocator;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.AllArguments;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Argument;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Default;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.DefaultCall;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.DefaultMethod;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Empty;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.FieldValue;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.IgnoreForBinding;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Origin;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.RuntimeType;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.StubValue;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Super;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.SuperCall;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.SuperMethod;
import org.modelmapper.internal.bytebuddy.implementation.bind.annotation.This;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.ClassConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.DefaultValue;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.DoubleConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.FloatConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.JavaConstantValue;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.LongConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.TextConstant;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;
import org.modelmapper.internal.bytebuddy.utility.JavaConstant;
import org.modelmapper.internal.bytebuddy.utility.JavaType;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class TargetMethodAnnotationDrivenBinder implements MethodDelegationBinder {
    private final DelegationProcessor delegationProcessor;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.delegationProcessor.equals(((TargetMethodAnnotationDrivenBinder) obj).delegationProcessor);
    }

    public int hashCode() {
        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.delegationProcessor.hashCode();
    }

    protected TargetMethodAnnotationDrivenBinder(DelegationProcessor delegationProcessor) {
        this.delegationProcessor = delegationProcessor;
    }

    public static MethodDelegationBinder of(List<? extends ParameterBinder<?>> list) {
        return new TargetMethodAnnotationDrivenBinder(DelegationProcessor.of(list));
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder
    public MethodDelegationBinder.Record compile(MethodDescription methodDescription) {
        if (IgnoreForBinding.Verifier.check(methodDescription)) {
            return MethodDelegationBinder.Record.Illegal.INSTANCE;
        }
        ArrayList arrayList = new ArrayList(methodDescription.getParameters().size());
        Iterator it = methodDescription.getParameters().iterator();
        while (it.hasNext()) {
            arrayList.add(this.delegationProcessor.prepare((ParameterDescription) it.next()));
        }
        return new Record(methodDescription, arrayList, RuntimeType.Verifier.check(methodDescription));
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class Record implements MethodDelegationBinder.Record {
        private final MethodDescription candidate;
        private final List<DelegationProcessor.Handler> handlers;
        private final Assigner.Typing typing;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Record record = (Record) obj;
            return this.candidate.equals(record.candidate) && this.handlers.equals(record.handlers) && this.typing.equals(record.typing);
        }

        public int hashCode() {
            return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.candidate.hashCode()) * 31) + this.handlers.hashCode()) * 31) + this.typing.hashCode();
        }

        protected Record(MethodDescription methodDescription, List<DelegationProcessor.Handler> list, Assigner.Typing typing) {
            this.candidate = methodDescription;
            this.handlers = list;
            this.typing = typing;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bind.MethodDelegationBinder.Record
        public MethodDelegationBinder.MethodBinding bind(Implementation.Target target, MethodDescription methodDescription, MethodDelegationBinder.TerminationHandler terminationHandler, MethodDelegationBinder.MethodInvoker methodInvoker, Assigner assigner) {
            if (!this.candidate.isAccessibleTo(target.getInstrumentedType())) {
                return MethodDelegationBinder.MethodBinding.Illegal.INSTANCE;
            }
            StackManipulation resolve = terminationHandler.resolve(assigner, this.typing, methodDescription, this.candidate);
            if (!resolve.isValid()) {
                return MethodDelegationBinder.MethodBinding.Illegal.INSTANCE;
            }
            MethodDelegationBinder.MethodBinding.Builder builder = new MethodDelegationBinder.MethodBinding.Builder(methodInvoker, this.candidate);
            Iterator<DelegationProcessor.Handler> it = this.handlers.iterator();
            while (it.hasNext()) {
                MethodDelegationBinder.ParameterBinding<?> bind = it.next().bind(methodDescription, target, assigner);
                if (!bind.isValid() || !builder.append(bind)) {
                    return MethodDelegationBinder.MethodBinding.Illegal.INSTANCE;
                }
            }
            return builder.build(resolve);
        }

        public String toString() {
            return this.candidate.toString();
        }
    }

    public interface ParameterBinder<T extends Annotation> {
        public static final List<ParameterBinder<?>> DEFAULTS = Collections.unmodifiableList(Arrays.asList(Argument.Binder.INSTANCE, AllArguments.Binder.INSTANCE, Origin.Binder.INSTANCE, This.Binder.INSTANCE, Super.Binder.INSTANCE, Default.Binder.INSTANCE, SuperCall.Binder.INSTANCE, DefaultCall.Binder.INSTANCE, SuperMethod.Binder.INSTANCE, DefaultMethod.Binder.INSTANCE, FieldValue.Binder.INSTANCE, StubValue.Binder.INSTANCE, Empty.Binder.INSTANCE));

        MethodDelegationBinder.ParameterBinding<?> bind(AnnotationDescription.Loadable<T> loadable, MethodDescription methodDescription, ParameterDescription parameterDescription, Implementation.Target target, Assigner assigner, Assigner.Typing typing);

        Class<T> getHandledType();

        public static abstract class ForFixedValue<S extends Annotation> implements ParameterBinder<S> {
            protected abstract Object bind(AnnotationDescription.Loadable<S> loadable, MethodDescription methodDescription, ParameterDescription parameterDescription);

            @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
            public MethodDelegationBinder.ParameterBinding<?> bind(AnnotationDescription.Loadable<S> loadable, MethodDescription methodDescription, ParameterDescription parameterDescription, Implementation.Target target, Assigner assigner, Assigner.Typing typing) {
                StackManipulation javaConstantValue;
                TypeDescription typeStub;
                StackManipulation of;
                TypeDescription typeDescription;
                Object bind = bind(loadable, methodDescription, parameterDescription);
                if (bind == null) {
                    return new MethodDelegationBinder.ParameterBinding.Anonymous(DefaultValue.of(parameterDescription.getType()));
                }
                if (bind instanceof Boolean) {
                    of = IntegerConstant.forValue(((Boolean) bind).booleanValue());
                    typeDescription = TypeDescription.ForLoadedType.of(Boolean.TYPE);
                } else if (bind instanceof Byte) {
                    of = IntegerConstant.forValue(((Byte) bind).byteValue());
                    typeDescription = TypeDescription.ForLoadedType.of(Byte.TYPE);
                } else if (bind instanceof Short) {
                    of = IntegerConstant.forValue(((Short) bind).shortValue());
                    typeDescription = TypeDescription.ForLoadedType.of(Short.TYPE);
                } else if (bind instanceof Character) {
                    of = IntegerConstant.forValue(((Character) bind).charValue());
                    typeDescription = TypeDescription.ForLoadedType.of(Character.TYPE);
                } else if (bind instanceof Integer) {
                    of = IntegerConstant.forValue(((Integer) bind).intValue());
                    typeDescription = TypeDescription.ForLoadedType.of(Integer.TYPE);
                } else if (bind instanceof Long) {
                    of = LongConstant.forValue(((Long) bind).longValue());
                    typeDescription = TypeDescription.ForLoadedType.of(Long.TYPE);
                } else if (bind instanceof Float) {
                    of = FloatConstant.forValue(((Float) bind).floatValue());
                    typeDescription = TypeDescription.ForLoadedType.of(Float.TYPE);
                } else if (bind instanceof Double) {
                    of = DoubleConstant.forValue(((Double) bind).doubleValue());
                    typeDescription = TypeDescription.ForLoadedType.of(Double.TYPE);
                } else {
                    if (bind instanceof String) {
                        javaConstantValue = new TextConstant((String) bind);
                        typeStub = TypeDescription.STRING;
                    } else if (bind instanceof Class) {
                        of = ClassConstant.of(TypeDescription.ForLoadedType.of((Class) bind));
                        typeDescription = TypeDescription.CLASS;
                    } else if (bind instanceof TypeDescription) {
                        of = ClassConstant.of((TypeDescription) bind);
                        typeDescription = TypeDescription.CLASS;
                    } else if (JavaType.METHOD_HANDLE.getTypeStub().isInstance(bind)) {
                        javaConstantValue = new JavaConstantValue(JavaConstant.MethodHandle.ofLoaded(bind));
                        typeStub = JavaType.METHOD_HANDLE.getTypeStub();
                    } else if (bind instanceof JavaConstant.MethodHandle) {
                        javaConstantValue = new JavaConstantValue((JavaConstant.MethodHandle) bind);
                        typeStub = JavaType.METHOD_HANDLE.getTypeStub();
                    } else if (JavaType.METHOD_TYPE.getTypeStub().isInstance(bind)) {
                        javaConstantValue = new JavaConstantValue(JavaConstant.MethodType.ofLoaded(bind));
                        typeStub = JavaType.METHOD_HANDLE.getTypeStub();
                    } else if (bind instanceof JavaConstant.MethodType) {
                        javaConstantValue = new JavaConstantValue((JavaConstant.MethodType) bind);
                        typeStub = JavaType.METHOD_HANDLE.getTypeStub();
                    } else {
                        throw new IllegalStateException("Not able to save in class's constant pool: " + bind);
                    }
                    StackManipulation stackManipulation = javaConstantValue;
                    typeDescription = typeStub;
                    of = stackManipulation;
                }
                return new MethodDelegationBinder.ParameterBinding.Anonymous(new StackManipulation.Compound(of, assigner.assign(typeDescription.asGenericType(), parameterDescription.getType(), typing)));
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class OfConstant<U extends Annotation> extends ForFixedValue<U> {
                private final Class<U> type;

                @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                private final Object value;

                /* JADX WARN: Removed duplicated region for block: B:20:0x0032 A[RETURN] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    OfConstant ofConstant = (OfConstant) obj;
                    if (!this.type.equals(ofConstant.type)) {
                        return false;
                    }
                    Object obj2 = this.value;
                    Object obj3 = ofConstant.value;
                    if (obj3 != null) {
                        return obj2 != null && obj2.equals(obj3);
                    }
                    if (obj2 != null) {
                        return false;
                    }
                }

                public int hashCode() {
                    int hashCode = (IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.type.hashCode()) * 31;
                    Object obj = this.value;
                    return obj != null ? hashCode + obj.hashCode() : hashCode;
                }

                protected OfConstant(Class<U> cls, Object obj) {
                    this.type = cls;
                    this.value = obj;
                }

                public static <V extends Annotation> ParameterBinder<V> of(Class<V> cls, Object obj) {
                    return new OfConstant(cls, obj);
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
                public Class<U> getHandledType() {
                    return this.type;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder.ForFixedValue
                protected Object bind(AnnotationDescription.Loadable<U> loadable, MethodDescription methodDescription, ParameterDescription parameterDescription) {
                    return this.value;
                }
            }
        }

        public static abstract class ForFieldBinding<S extends Annotation> implements ParameterBinder<S> {
            protected static final String BEAN_PROPERTY = "";

            protected abstract MethodDelegationBinder.ParameterBinding<?> bind(FieldDescription fieldDescription, AnnotationDescription.Loadable<S> loadable, MethodDescription methodDescription, ParameterDescription parameterDescription, Implementation.Target target, Assigner assigner);

            protected abstract TypeDescription declaringType(AnnotationDescription.Loadable<S> loadable);

            protected abstract String fieldName(AnnotationDescription.Loadable<S> loadable);

            private static FieldLocator.Resolution resolveAccessor(FieldLocator fieldLocator, MethodDescription methodDescription) {
                String substring;
                if (ElementMatchers.isSetter().matches(methodDescription)) {
                    substring = methodDescription.getInternalName().substring(3);
                } else if (ElementMatchers.isGetter().matches(methodDescription)) {
                    substring = methodDescription.getInternalName().substring(methodDescription.getInternalName().startsWith("is") ? 2 : 3);
                } else {
                    return FieldLocator.Resolution.Illegal.INSTANCE;
                }
                return fieldLocator.locate(Character.toLowerCase(substring.charAt(0)) + substring.substring(1));
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.ParameterBinder
            public MethodDelegationBinder.ParameterBinding<?> bind(AnnotationDescription.Loadable<S> loadable, MethodDescription methodDescription, ParameterDescription parameterDescription, Implementation.Target target, Assigner assigner, Assigner.Typing typing) {
                FieldLocator forExactType;
                FieldLocator.Resolution locate;
                if (!declaringType(loadable).represents(Void.TYPE)) {
                    if (declaringType(loadable).isPrimitive() || declaringType(loadable).isArray()) {
                        throw new IllegalStateException("A primitive type or array type cannot declare a field: " + methodDescription);
                    }
                    if (!target.getInstrumentedType().isAssignableTo(declaringType(loadable))) {
                        return MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE;
                    }
                }
                if (declaringType(loadable).represents(Void.TYPE)) {
                    forExactType = new FieldLocator.ForClassHierarchy(target.getInstrumentedType());
                } else {
                    forExactType = new FieldLocator.ForExactType(declaringType(loadable), target.getInstrumentedType());
                }
                if (fieldName(loadable).equals("")) {
                    locate = resolveAccessor(forExactType, methodDescription);
                } else {
                    locate = forExactType.locate(fieldName(loadable));
                }
                return (!locate.isResolved() || (methodDescription.isStatic() && !locate.getField().isStatic())) ? MethodDelegationBinder.ParameterBinding.Illegal.INSTANCE : bind(locate.getField(), loadable, methodDescription, parameterDescription, target, assigner);
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    protected static class DelegationProcessor {
        private final Map<? extends TypeDescription, ? extends ParameterBinder<?>> parameterBinders;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.parameterBinders.equals(((DelegationProcessor) obj).parameterBinders);
        }

        public int hashCode() {
            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.parameterBinders.hashCode();
        }

        protected DelegationProcessor(Map<? extends TypeDescription, ? extends ParameterBinder<?>> map) {
            this.parameterBinders = map;
        }

        protected static DelegationProcessor of(List<? extends ParameterBinder<?>> list) {
            HashMap hashMap = new HashMap();
            for (ParameterBinder<?> parameterBinder : list) {
                if (hashMap.put(TypeDescription.ForLoadedType.of(parameterBinder.getHandledType()), parameterBinder) != null) {
                    throw new IllegalArgumentException("Attempt to bind two handlers to " + parameterBinder.getHandledType());
                }
            }
            return new DelegationProcessor(hashMap);
        }

        protected Handler prepare(ParameterDescription parameterDescription) {
            Assigner.Typing check = RuntimeType.Verifier.check(parameterDescription);
            Handler unbound = new Handler.Unbound(parameterDescription, check);
            for (AnnotationDescription annotationDescription : parameterDescription.getDeclaredAnnotations()) {
                ParameterBinder<?> parameterBinder = this.parameterBinders.get(annotationDescription.getAnnotationType());
                if (parameterBinder != null && unbound.isBound()) {
                    throw new IllegalStateException("Ambiguous binding for parameter annotated with two handled annotation types");
                }
                if (parameterBinder != null) {
                    unbound = Handler.Bound.of(parameterDescription, parameterBinder, annotationDescription, check);
                }
            }
            return unbound;
        }

        protected interface Handler {
            MethodDelegationBinder.ParameterBinding<?> bind(MethodDescription methodDescription, Implementation.Target target, Assigner assigner);

            boolean isBound();

            @HashCodeAndEqualsPlugin.Enhance
            public static class Unbound implements Handler {
                private final ParameterDescription target;
                private final Assigner.Typing typing;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Unbound unbound = (Unbound) obj;
                    return this.target.equals(unbound.target) && this.typing.equals(unbound.typing);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.target.hashCode()) * 31) + this.typing.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.DelegationProcessor.Handler
                public boolean isBound() {
                    return false;
                }

                protected Unbound(ParameterDescription parameterDescription, Assigner.Typing typing) {
                    this.target = parameterDescription;
                    this.typing = typing;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.DelegationProcessor.Handler
                public MethodDelegationBinder.ParameterBinding<?> bind(MethodDescription methodDescription, Implementation.Target target, Assigner assigner) {
                    return Argument.Binder.INSTANCE.bind(AnnotationDescription.ForLoadedAnnotation.of(new DefaultArgument(this.target.getIndex())), methodDescription, this.target, target, assigner, this.typing);
                }

                protected static class DefaultArgument implements Argument {
                    private static final String BINDING_MECHANIC = "bindingMechanic";
                    private static final String VALUE = "value";
                    private final int parameterIndex;

                    protected DefaultArgument(int i) {
                        this.parameterIndex = i;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Argument
                    public int value() {
                        return this.parameterIndex;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.Argument
                    public Argument.BindingMechanic bindingMechanic() {
                        return Argument.BindingMechanic.UNIQUE;
                    }

                    @Override // java.lang.annotation.Annotation
                    public Class<Argument> annotationType() {
                        return Argument.class;
                    }

                    @Override // java.lang.annotation.Annotation
                    public boolean equals(Object obj) {
                        return this == obj || ((obj instanceof Argument) && this.parameterIndex == ((Argument) obj).value());
                    }

                    @Override // java.lang.annotation.Annotation
                    public int hashCode() {
                        return ((BINDING_MECHANIC.hashCode() * 127) ^ Argument.BindingMechanic.UNIQUE.hashCode()) + (("value".hashCode() * 127) ^ this.parameterIndex);
                    }

                    @Override // java.lang.annotation.Annotation
                    public String toString() {
                        return "@" + Argument.class.getName() + "(bindingMechanic=" + Argument.BindingMechanic.UNIQUE.toString() + ", value=" + this.parameterIndex + ")";
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Bound<T extends Annotation> implements Handler {
                private final AnnotationDescription.Loadable<T> annotation;
                private final ParameterBinder<T> parameterBinder;
                private final ParameterDescription target;
                private final Assigner.Typing typing;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Bound bound = (Bound) obj;
                    return this.target.equals(bound.target) && this.parameterBinder.equals(bound.parameterBinder) && this.annotation.equals(bound.annotation) && this.typing.equals(bound.typing);
                }

                public int hashCode() {
                    return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.target.hashCode()) * 31) + this.parameterBinder.hashCode()) * 31) + this.annotation.hashCode()) * 31) + this.typing.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.DelegationProcessor.Handler
                public boolean isBound() {
                    return true;
                }

                protected Bound(ParameterDescription parameterDescription, ParameterBinder<T> parameterBinder, AnnotationDescription.Loadable<T> loadable, Assigner.Typing typing) {
                    this.target = parameterDescription;
                    this.parameterBinder = parameterBinder;
                    this.annotation = loadable;
                    this.typing = typing;
                }

                protected static Handler of(ParameterDescription parameterDescription, ParameterBinder<?> parameterBinder, AnnotationDescription annotationDescription, Assigner.Typing typing) {
                    return new Bound(parameterDescription, parameterBinder, annotationDescription.prepare(parameterBinder.getHandledType()), typing);
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.bind.annotation.TargetMethodAnnotationDrivenBinder.DelegationProcessor.Handler
                public MethodDelegationBinder.ParameterBinding<?> bind(MethodDescription methodDescription, Implementation.Target target, Assigner assigner) {
                    return this.parameterBinder.bind(this.annotation, methodDescription, this.target, target, assigner, this.typing);
                }
            }
        }
    }
}
