package org.modelmapper.internal.bytebuddy.implementation;

import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.enumeration.EnumerationDescription;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodList;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterList;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.FieldLocator;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType;
import org.modelmapper.internal.bytebuddy.dynamic.scaffold.MethodGraph;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.LoadedTypeInitializer;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Duplication;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Removal;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.TypeCreation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.Assigner;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.collection.ArrayAccess;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.collection.ArrayFactory;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.ClassConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.DoubleConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.FloatConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.IntegerConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.JavaConstantValue;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.LongConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.NullConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.TextConstant;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.FieldAccess;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodReturn;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodVariableAccess;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;
import org.modelmapper.internal.bytebuddy.utility.CompoundList;
import org.modelmapper.internal.bytebuddy.utility.JavaConstant;
import org.modelmapper.internal.bytebuddy.utility.JavaType;
import org.modelmapper.internal.bytebuddy.utility.RandomString;

@HashCodeAndEqualsPlugin.Enhance
/* loaded from: classes4.dex */
public class MethodCall implements Implementation.Composable {
    protected final List<ArgumentLoader.Factory> argumentLoaders;
    protected final Assigner assigner;
    protected final MethodInvoker methodInvoker;
    protected final MethodLocator methodLocator;
    protected final TargetHandler targetHandler;
    protected final TerminationHandler terminationHandler;
    protected final Assigner.Typing typing;

    protected enum TerminationHandler {
        RETURNING { // from class: org.modelmapper.internal.bytebuddy.implementation.MethodCall.TerminationHandler.1
            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.TerminationHandler
            public StackManipulation resolve(MethodDescription methodDescription, MethodDescription methodDescription2, Assigner assigner, Assigner.Typing typing) {
                TypeDescription.Generic returnType;
                if (methodDescription.isConstructor()) {
                    returnType = methodDescription.getDeclaringType().asGenericType();
                } else {
                    returnType = methodDescription.getReturnType();
                }
                StackManipulation assign = assigner.assign(returnType, methodDescription2.getReturnType(), typing);
                if (!assign.isValid()) {
                    throw new IllegalStateException("Cannot return " + methodDescription.getReturnType() + " from " + methodDescription2);
                }
                return new StackManipulation.Compound(assign, MethodReturn.of(methodDescription2.getReturnType()));
            }
        },
        DROPPING { // from class: org.modelmapper.internal.bytebuddy.implementation.MethodCall.TerminationHandler.2
            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.TerminationHandler
            protected StackManipulation resolve(MethodDescription methodDescription, MethodDescription methodDescription2, Assigner assigner, Assigner.Typing typing) {
                TypeDefinition returnType;
                if (methodDescription.isConstructor()) {
                    returnType = methodDescription.getDeclaringType();
                } else {
                    returnType = methodDescription.getReturnType();
                }
                return Removal.of(returnType);
            }
        };

        protected abstract StackManipulation resolve(MethodDescription methodDescription, MethodDescription methodDescription2, Assigner assigner, Assigner.Typing typing);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MethodCall methodCall = (MethodCall) obj;
        return this.methodLocator.equals(methodCall.methodLocator) && this.targetHandler.equals(methodCall.targetHandler) && this.argumentLoaders.equals(methodCall.argumentLoaders) && this.methodInvoker.equals(methodCall.methodInvoker) && this.terminationHandler.equals(methodCall.terminationHandler) && this.assigner.equals(methodCall.assigner) && this.typing.equals(methodCall.typing);
    }

    public int hashCode() {
        return ((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodLocator.hashCode()) * 31) + this.targetHandler.hashCode()) * 31) + this.argumentLoaders.hashCode()) * 31) + this.methodInvoker.hashCode()) * 31) + this.terminationHandler.hashCode()) * 31) + this.assigner.hashCode()) * 31) + this.typing.hashCode();
    }

    protected MethodCall(MethodLocator methodLocator, TargetHandler targetHandler, List<ArgumentLoader.Factory> list, MethodInvoker methodInvoker, TerminationHandler terminationHandler, Assigner assigner, Assigner.Typing typing) {
        this.methodLocator = methodLocator;
        this.targetHandler = targetHandler;
        this.argumentLoaders = list;
        this.methodInvoker = methodInvoker;
        this.terminationHandler = terminationHandler;
        this.assigner = assigner;
        this.typing = typing;
    }

    public static WithoutSpecifiedTarget invoke(Method method) {
        return invoke(new MethodDescription.ForLoadedMethod(method));
    }

    public static WithoutSpecifiedTarget invoke(Constructor<?> constructor) {
        return invoke(new MethodDescription.ForLoadedConstructor(constructor));
    }

    public static WithoutSpecifiedTarget invoke(MethodDescription methodDescription) {
        return invoke(new MethodLocator.ForExplicitMethod(methodDescription));
    }

    public static WithoutSpecifiedTarget invoke(ElementMatcher<? super MethodDescription> elementMatcher) {
        return invoke(elementMatcher, MethodGraph.Compiler.DEFAULT);
    }

    public static WithoutSpecifiedTarget invoke(ElementMatcher<? super MethodDescription> elementMatcher, MethodGraph.Compiler compiler) {
        return invoke(new MethodLocator.ForElementMatcher(elementMatcher, compiler));
    }

    public static WithoutSpecifiedTarget invoke(MethodLocator methodLocator) {
        return new WithoutSpecifiedTarget(methodLocator);
    }

    public static WithoutSpecifiedTarget invokeSelf() {
        return new WithoutSpecifiedTarget(MethodLocator.ForInstrumentedMethod.INSTANCE);
    }

    public static MethodCall invokeSuper() {
        return invokeSelf().onSuper();
    }

    public static Implementation.Composable call(Callable<?> callable) {
        try {
            return invoke(Callable.class.getMethod(NotificationCompat.CATEGORY_CALL, new Class[0])).on(callable, Callable.class).withAssigner(Assigner.DEFAULT, Assigner.Typing.DYNAMIC);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Could not locate Callable::call method", e);
        }
    }

    public static Implementation.Composable run(Runnable runnable) {
        try {
            return invoke(Runnable.class.getMethod("run", new Class[0])).on(runnable, Runnable.class).withAssigner(Assigner.DEFAULT, Assigner.Typing.DYNAMIC);
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException("Could not locate Runnable::run method", e);
        }
    }

    public static MethodCall construct(Constructor<?> constructor) {
        return construct(new MethodDescription.ForLoadedConstructor(constructor));
    }

    public static MethodCall construct(MethodDescription methodDescription) {
        if (!methodDescription.isConstructor()) {
            throw new IllegalArgumentException("Not a constructor: " + methodDescription);
        }
        return new MethodCall(new MethodLocator.ForExplicitMethod(methodDescription), TargetHandler.ForConstructingInvocation.INSTANCE, Collections.emptyList(), MethodInvoker.ForContextualInvocation.INSTANCE, TerminationHandler.RETURNING, Assigner.DEFAULT, Assigner.Typing.STATIC);
    }

    public MethodCall with(Object... objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            arrayList.add(ArgumentLoader.ForStackManipulation.of(obj));
        }
        return with(arrayList);
    }

    public MethodCall with(TypeDescription... typeDescriptionArr) {
        ArrayList arrayList = new ArrayList(typeDescriptionArr.length);
        for (TypeDescription typeDescription : typeDescriptionArr) {
            arrayList.add(new ArgumentLoader.ForStackManipulation(ClassConstant.of(typeDescription), Class.class));
        }
        return with(arrayList);
    }

    public MethodCall with(EnumerationDescription... enumerationDescriptionArr) {
        ArrayList arrayList = new ArrayList(enumerationDescriptionArr.length);
        for (EnumerationDescription enumerationDescription : enumerationDescriptionArr) {
            arrayList.add(new ArgumentLoader.ForStackManipulation(FieldAccess.forEnumeration(enumerationDescription), enumerationDescription.getEnumerationType()));
        }
        return with(arrayList);
    }

    public MethodCall with(JavaConstant... javaConstantArr) {
        ArrayList arrayList = new ArrayList(javaConstantArr.length);
        for (JavaConstant javaConstant : javaConstantArr) {
            arrayList.add(new ArgumentLoader.ForStackManipulation(new JavaConstantValue(javaConstant), javaConstant.getType()));
        }
        return with(arrayList);
    }

    public MethodCall withReference(Object... objArr) {
        ArrayList arrayList = new ArrayList(objArr.length);
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            arrayList.add(obj == null ? ArgumentLoader.ForNullConstant.INSTANCE : new ArgumentLoader.ForInstance.Factory(obj));
        }
        return with(arrayList);
    }

    public MethodCall withArgument(int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            if (i < 0) {
                throw new IllegalArgumentException("Negative index: " + i);
            }
            arrayList.add(new ArgumentLoader.ForMethodParameter.Factory(i));
        }
        return with(arrayList);
    }

    public MethodCall withAllArguments() {
        return with(ArgumentLoader.ForMethodParameter.OfInstrumentedMethod.INSTANCE);
    }

    public MethodCall withArgumentArray() {
        return with(ArgumentLoader.ForMethodParameterArray.ForInstrumentedMethod.INSTANCE);
    }

    public MethodCall withArgumentArrayElements(int i) {
        if (i >= 0) {
            return with(new ArgumentLoader.ForMethodParameterArrayElement.OfInvokedMethod(i));
        }
        throw new IllegalArgumentException("A parameter index cannot be negative: " + i);
    }

    public MethodCall withArgumentArrayElements(int i, int i2) {
        return withArgumentArrayElements(i, 0, i2);
    }

    public MethodCall withArgumentArrayElements(int i, int i2, int i3) {
        if (i < 0) {
            throw new IllegalArgumentException("A parameter index cannot be negative: " + i);
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("An array index cannot be negative: " + i2);
        }
        if (i3 == 0) {
            return this;
        }
        if (i3 < 0) {
            throw new IllegalArgumentException("Size cannot be negative: " + i3);
        }
        ArrayList arrayList = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add(new ArgumentLoader.ForMethodParameterArrayElement.OfParameter(i, i2 + i4));
        }
        return with(arrayList);
    }

    public MethodCall withThis() {
        return with(ArgumentLoader.ForThisReference.Factory.INSTANCE);
    }

    public MethodCall withOwnType() {
        return with(ArgumentLoader.ForInstrumentedType.Factory.INSTANCE);
    }

    public MethodCall withField(String... strArr) {
        return withField(FieldLocator.ForClassHierarchy.Factory.INSTANCE, strArr);
    }

    public MethodCall withField(FieldLocator.Factory factory, String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new ArgumentLoader.ForField.Factory(str, factory));
        }
        return with(arrayList);
    }

    public MethodCall withMethodCall(MethodCall methodCall) {
        return with(new ArgumentLoader.ForMethodCall.Factory(methodCall));
    }

    public MethodCall with(StackManipulation stackManipulation, Type type) {
        return with(stackManipulation, TypeDefinition.Sort.describe(type));
    }

    public MethodCall with(StackManipulation stackManipulation, TypeDefinition typeDefinition) {
        return with(new ArgumentLoader.ForStackManipulation(stackManipulation, typeDefinition));
    }

    public MethodCall with(ArgumentLoader.Factory... factoryArr) {
        return with(Arrays.asList(factoryArr));
    }

    public MethodCall with(List<? extends ArgumentLoader.Factory> list) {
        return new MethodCall(this.methodLocator, this.targetHandler, CompoundList.of((List) this.argumentLoaders, (List) list), this.methodInvoker, this.terminationHandler, this.assigner, this.typing);
    }

    public Implementation.Composable withAssigner(Assigner assigner, Assigner.Typing typing) {
        return new MethodCall(this.methodLocator, this.targetHandler, this.argumentLoaders, this.methodInvoker, this.terminationHandler, assigner, typing);
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Composable
    public Implementation andThen(Implementation implementation) {
        return new Implementation.Compound(new MethodCall(this.methodLocator, this.targetHandler, this.argumentLoaders, this.methodInvoker, TerminationHandler.DROPPING, this.assigner, this.typing), implementation);
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation.Composable
    public Implementation.Composable andThen(Implementation.Composable composable) {
        return new Implementation.Compound.Composable(new MethodCall(this.methodLocator, this.targetHandler, this.argumentLoaders, this.methodInvoker, TerminationHandler.DROPPING, this.assigner, this.typing), composable);
    }

    @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
    public InstrumentedType prepare(InstrumentedType instrumentedType) {
        Iterator<ArgumentLoader.Factory> it = this.argumentLoaders.iterator();
        while (it.hasNext()) {
            instrumentedType = it.next().prepare(instrumentedType);
        }
        return this.targetHandler.prepare(instrumentedType);
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.Implementation
    public ByteCodeAppender appender(Implementation.Target target) {
        return new Appender(target);
    }

    public interface MethodLocator {

        public enum ForInstrumentedMethod implements MethodLocator {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.MethodLocator
            public MethodDescription resolve(TypeDescription typeDescription, TypeDescription typeDescription2, MethodDescription methodDescription) {
                return methodDescription;
            }
        }

        MethodDescription resolve(TypeDescription typeDescription, TypeDescription typeDescription2, MethodDescription methodDescription);

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForExplicitMethod implements MethodLocator {
            private final MethodDescription methodDescription;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.methodDescription.equals(((ForExplicitMethod) obj).methodDescription);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodDescription.hashCode();
            }

            protected ForExplicitMethod(MethodDescription methodDescription) {
                this.methodDescription = methodDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.MethodLocator
            public MethodDescription resolve(TypeDescription typeDescription, TypeDescription typeDescription2, MethodDescription methodDescription) {
                return this.methodDescription;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForElementMatcher implements MethodLocator {
            private final ElementMatcher<? super MethodDescription> matcher;
            private final MethodGraph.Compiler methodGraphCompiler;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForElementMatcher forElementMatcher = (ForElementMatcher) obj;
                return this.matcher.equals(forElementMatcher.matcher) && this.methodGraphCompiler.equals(forElementMatcher.methodGraphCompiler);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.matcher.hashCode()) * 31) + this.methodGraphCompiler.hashCode();
            }

            protected ForElementMatcher(ElementMatcher<? super MethodDescription> elementMatcher, MethodGraph.Compiler compiler) {
                this.matcher = elementMatcher;
                this.methodGraphCompiler = compiler;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.MethodLocator
            public MethodDescription resolve(TypeDescription typeDescription, TypeDescription typeDescription2, MethodDescription methodDescription) {
                MethodList filter = this.methodGraphCompiler.compile(typeDescription2, typeDescription).listNodes().asMethodList().filter(this.matcher);
                if (filter.size() == 1) {
                    return (MethodDescription) filter.getOnly();
                }
                throw new IllegalStateException(typeDescription + " does not define exactly one virtual method for " + this.matcher);
            }
        }
    }

    public interface ArgumentLoader {

        public interface Factory {
            List<ArgumentLoader> make(Implementation.Target target, TypeDescription typeDescription, MethodDescription methodDescription, MethodDescription methodDescription2);

            InstrumentedType prepare(InstrumentedType instrumentedType);
        }

        StackManipulation resolve(ParameterDescription parameterDescription, Assigner assigner, Assigner.Typing typing);

        public enum ForNullConstant implements ArgumentLoader, Factory {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                return instrumentedType;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
            public List<ArgumentLoader> make(Implementation.Target target, TypeDescription typeDescription, MethodDescription methodDescription, MethodDescription methodDescription2) {
                return Collections.singletonList(this);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader
            public StackManipulation resolve(ParameterDescription parameterDescription, Assigner assigner, Assigner.Typing typing) {
                if (parameterDescription.getType().isPrimitive()) {
                    throw new IllegalStateException("Cannot assign null to " + parameterDescription);
                }
                return NullConstant.INSTANCE;
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForThisReference implements ArgumentLoader {
            private final TypeDescription instrumentedType;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.instrumentedType.equals(((ForThisReference) obj).instrumentedType);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentedType.hashCode();
            }

            public ForThisReference(TypeDescription typeDescription) {
                this.instrumentedType = typeDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader
            public StackManipulation resolve(ParameterDescription parameterDescription, Assigner assigner, Assigner.Typing typing) {
                StackManipulation.Compound compound = new StackManipulation.Compound(MethodVariableAccess.loadThis(), assigner.assign(this.instrumentedType.asGenericType(), parameterDescription.getType(), typing));
                if (compound.isValid()) {
                    return compound;
                }
                throw new IllegalStateException("Cannot assign " + this.instrumentedType + " to " + parameterDescription);
            }

            public enum Factory implements Factory {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public List<ArgumentLoader> make(Implementation.Target target, TypeDescription typeDescription, MethodDescription methodDescription, MethodDescription methodDescription2) {
                    if (methodDescription.isStatic()) {
                        throw new IllegalStateException(methodDescription + " is static and cannot supply an invoker instance");
                    }
                    return Collections.singletonList(new ForThisReference(typeDescription));
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForInstrumentedType implements ArgumentLoader {
            private final TypeDescription instrumentedType;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.instrumentedType.equals(((ForInstrumentedType) obj).instrumentedType);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.instrumentedType.hashCode();
            }

            public ForInstrumentedType(TypeDescription typeDescription) {
                this.instrumentedType = typeDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader
            public StackManipulation resolve(ParameterDescription parameterDescription, Assigner assigner, Assigner.Typing typing) {
                StackManipulation.Compound compound = new StackManipulation.Compound(ClassConstant.of(this.instrumentedType), assigner.assign(TypeDescription.Generic.OfNonGenericType.ForLoadedType.CLASS, parameterDescription.getType(), typing));
                if (compound.isValid()) {
                    return compound;
                }
                throw new IllegalStateException("Cannot assign Class value to " + parameterDescription);
            }

            public enum Factory implements Factory {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public List<ArgumentLoader> make(Implementation.Target target, TypeDescription typeDescription, MethodDescription methodDescription, MethodDescription methodDescription2) {
                    return Collections.singletonList(new ForInstrumentedType(typeDescription));
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForMethodParameter implements ArgumentLoader {
            private final int index;
            private final MethodDescription instrumentedMethod;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForMethodParameter forMethodParameter = (ForMethodParameter) obj;
                return this.index == forMethodParameter.index && this.instrumentedMethod.equals(forMethodParameter.instrumentedMethod);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.index) * 31) + this.instrumentedMethod.hashCode();
            }

            public ForMethodParameter(int i, MethodDescription methodDescription) {
                this.index = i;
                this.instrumentedMethod = methodDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader
            public StackManipulation resolve(ParameterDescription parameterDescription, Assigner assigner, Assigner.Typing typing) {
                ParameterDescription parameterDescription2 = (ParameterDescription) this.instrumentedMethod.getParameters().get(this.index);
                StackManipulation.Compound compound = new StackManipulation.Compound(MethodVariableAccess.load(parameterDescription2), assigner.assign(parameterDescription2.getType(), parameterDescription.getType(), typing));
                if (compound.isValid()) {
                    return compound;
                }
                throw new IllegalStateException("Cannot assign " + parameterDescription2 + " to " + parameterDescription + " for " + this.instrumentedMethod);
            }

            protected enum OfInstrumentedMethod implements Factory {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public List<ArgumentLoader> make(Implementation.Target target, TypeDescription typeDescription, MethodDescription methodDescription, MethodDescription methodDescription2) {
                    ArrayList arrayList = new ArrayList(methodDescription.getParameters().size());
                    Iterator it = methodDescription.getParameters().iterator();
                    while (it.hasNext()) {
                        arrayList.add(new ForMethodParameter(((ParameterDescription) it.next()).getIndex(), methodDescription));
                    }
                    return arrayList;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class Factory implements Factory {
                private final int index;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.index == ((Factory) obj).index;
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.index;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                public Factory(int i) {
                    this.index = i;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public List<ArgumentLoader> make(Implementation.Target target, TypeDescription typeDescription, MethodDescription methodDescription, MethodDescription methodDescription2) {
                    if (this.index >= methodDescription.getParameters().size()) {
                        throw new IllegalStateException(methodDescription + " does not have a parameter with index " + this.index);
                    }
                    return Collections.singletonList(new ForMethodParameter(this.index, methodDescription));
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForMethodParameterArray implements ArgumentLoader {
            private final ParameterList<?> parameters;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.parameters.equals(((ForMethodParameterArray) obj).parameters);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.parameters.hashCode();
            }

            public ForMethodParameterArray(ParameterList<?> parameterList) {
                this.parameters = parameterList;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader
            public StackManipulation resolve(ParameterDescription parameterDescription, Assigner assigner, Assigner.Typing typing) {
                TypeDescription.Generic componentType;
                if (parameterDescription.getType().represents(Object.class)) {
                    componentType = TypeDescription.Generic.OBJECT;
                } else if (parameterDescription.getType().isArray()) {
                    componentType = parameterDescription.getType().getComponentType();
                } else {
                    throw new IllegalStateException();
                }
                ArrayList arrayList = new ArrayList(this.parameters.size());
                Iterator it = this.parameters.iterator();
                while (it.hasNext()) {
                    ParameterDescription parameterDescription2 = (ParameterDescription) it.next();
                    StackManipulation.Compound compound = new StackManipulation.Compound(MethodVariableAccess.load(parameterDescription2), assigner.assign(parameterDescription2.getType(), componentType, typing));
                    if (compound.isValid()) {
                        arrayList.add(compound);
                    } else {
                        throw new IllegalStateException("Cannot assign " + parameterDescription2 + " to " + componentType);
                    }
                }
                return new StackManipulation.Compound(ArrayFactory.forType(componentType).withValues(arrayList));
            }

            public enum ForInstrumentedMethod implements Factory {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public List<ArgumentLoader> make(Implementation.Target target, TypeDescription typeDescription, MethodDescription methodDescription, MethodDescription methodDescription2) {
                    return Collections.singletonList(new ForMethodParameterArray(methodDescription.getParameters()));
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForMethodParameterArrayElement implements ArgumentLoader {
            private final int index;
            private final ParameterDescription parameterDescription;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForMethodParameterArrayElement forMethodParameterArrayElement = (ForMethodParameterArrayElement) obj;
                return this.parameterDescription.equals(forMethodParameterArrayElement.parameterDescription) && this.index == forMethodParameterArrayElement.index;
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.parameterDescription.hashCode()) * 31) + this.index;
            }

            public ForMethodParameterArrayElement(ParameterDescription parameterDescription, int i) {
                this.parameterDescription = parameterDescription;
                this.index = i;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader
            public StackManipulation resolve(ParameterDescription parameterDescription, Assigner assigner, Assigner.Typing typing) {
                StackManipulation.Compound compound = new StackManipulation.Compound(MethodVariableAccess.load(this.parameterDescription), IntegerConstant.forValue(this.index), ArrayAccess.of(this.parameterDescription.getType().getComponentType()).load(), assigner.assign(this.parameterDescription.getType().getComponentType(), parameterDescription.getType(), typing));
                if (compound.isValid()) {
                    return compound;
                }
                throw new IllegalStateException("Cannot assign " + this.parameterDescription.getType().getComponentType() + " to " + parameterDescription);
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class OfParameter implements Factory {
                private final int arrayIndex;
                private final int index;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    OfParameter ofParameter = (OfParameter) obj;
                    return this.index == ofParameter.index && this.arrayIndex == ofParameter.arrayIndex;
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.index) * 31) + this.arrayIndex;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                public OfParameter(int i, int i2) {
                    this.index = i;
                    this.arrayIndex = i2;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public List<ArgumentLoader> make(Implementation.Target target, TypeDescription typeDescription, MethodDescription methodDescription, MethodDescription methodDescription2) {
                    if (methodDescription.getParameters().size() <= this.index) {
                        throw new IllegalStateException(methodDescription + " does not declare a parameter with index " + this.index);
                    }
                    if (!((ParameterDescription) methodDescription.getParameters().get(this.index)).getType().isArray()) {
                        throw new IllegalStateException("Cannot access an item from non-array parameter " + methodDescription.getParameters().get(this.index));
                    }
                    return Collections.singletonList(new ForMethodParameterArrayElement((ParameterDescription) methodDescription.getParameters().get(this.index), this.arrayIndex));
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class OfInvokedMethod implements Factory {
                private final int index;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.index == ((OfInvokedMethod) obj).index;
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.index;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                public OfInvokedMethod(int i) {
                    this.index = i;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public List<ArgumentLoader> make(Implementation.Target target, TypeDescription typeDescription, MethodDescription methodDescription, MethodDescription methodDescription2) {
                    if (methodDescription.getParameters().size() <= this.index) {
                        throw new IllegalStateException(methodDescription + " does not declare a parameter with index " + this.index);
                    }
                    if (!((ParameterDescription) methodDescription.getParameters().get(this.index)).getType().isArray()) {
                        throw new IllegalStateException("Cannot access an item from non-array parameter " + methodDescription.getParameters().get(this.index));
                    }
                    ArrayList arrayList = new ArrayList(methodDescription.getParameters().size());
                    for (int i = 0; i < methodDescription2.getParameters().size(); i += 2) {
                        arrayList.add(new ForMethodParameterArrayElement((ParameterDescription) methodDescription.getParameters().get(this.index), i));
                    }
                    return arrayList;
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForInstance implements ArgumentLoader {
            private final FieldDescription fieldDescription;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.fieldDescription.equals(((ForInstance) obj).fieldDescription);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fieldDescription.hashCode();
            }

            public ForInstance(FieldDescription fieldDescription) {
                this.fieldDescription = fieldDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader
            public StackManipulation resolve(ParameterDescription parameterDescription, Assigner assigner, Assigner.Typing typing) {
                StackManipulation.Compound compound = new StackManipulation.Compound(FieldAccess.forField(this.fieldDescription).read(), assigner.assign(this.fieldDescription.getType(), parameterDescription.getType(), typing));
                if (compound.isValid()) {
                    return compound;
                }
                throw new IllegalStateException("Cannot assign " + this.fieldDescription.getType() + " to " + parameterDescription);
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class Factory implements Factory {
                private static final String FIELD_PREFIX = "methodCall";

                @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
                private final String name = "methodCall$" + RandomString.make();
                private final Object value;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.value.equals(((Factory) obj).value);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.value.hashCode();
                }

                public Factory(Object obj) {
                    this.value = obj;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType.withField(new FieldDescription.Token(this.name, 4105, TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(this.value.getClass()))).withInitializer(new LoadedTypeInitializer.ForStaticField(this.name, this.value));
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public List<ArgumentLoader> make(Implementation.Target target, TypeDescription typeDescription, MethodDescription methodDescription, MethodDescription methodDescription2) {
                    return Collections.singletonList(new ForInstance((FieldDescription) typeDescription.getDeclaredFields().filter(ElementMatchers.named(this.name)).getOnly()));
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForField implements ArgumentLoader {
            private final FieldDescription fieldDescription;
            private final MethodDescription instrumentedMethod;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForField forField = (ForField) obj;
                return this.fieldDescription.equals(forField.fieldDescription) && this.instrumentedMethod.equals(forField.instrumentedMethod);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.fieldDescription.hashCode()) * 31) + this.instrumentedMethod.hashCode();
            }

            public ForField(FieldDescription fieldDescription, MethodDescription methodDescription) {
                this.fieldDescription = fieldDescription;
                this.instrumentedMethod = methodDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader
            public StackManipulation resolve(ParameterDescription parameterDescription, Assigner assigner, Assigner.Typing typing) {
                if (!this.fieldDescription.isStatic() && this.instrumentedMethod.isStatic()) {
                    throw new IllegalStateException("Cannot access non-static " + this.fieldDescription + " from " + this.instrumentedMethod);
                }
                StackManipulation[] stackManipulationArr = new StackManipulation[3];
                stackManipulationArr[0] = this.fieldDescription.isStatic() ? StackManipulation.Trivial.INSTANCE : MethodVariableAccess.loadThis();
                stackManipulationArr[1] = FieldAccess.forField(this.fieldDescription).read();
                stackManipulationArr[2] = assigner.assign(this.fieldDescription.getType(), parameterDescription.getType(), typing);
                StackManipulation.Compound compound = new StackManipulation.Compound(stackManipulationArr);
                if (compound.isValid()) {
                    return compound;
                }
                throw new IllegalStateException("Cannot assign " + this.fieldDescription + " to " + parameterDescription);
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class Factory implements Factory {
                private final FieldLocator.Factory fieldLocatorFactory;
                private final String name;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Factory factory = (Factory) obj;
                    return this.name.equals(factory.name) && this.fieldLocatorFactory.equals(factory.fieldLocatorFactory);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.name.hashCode()) * 31) + this.fieldLocatorFactory.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                public Factory(String str, FieldLocator.Factory factory) {
                    this.name = str;
                    this.fieldLocatorFactory = factory;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public List<ArgumentLoader> make(Implementation.Target target, TypeDescription typeDescription, MethodDescription methodDescription, MethodDescription methodDescription2) {
                    FieldLocator.Resolution locate = this.fieldLocatorFactory.make(typeDescription).locate(this.name);
                    if (!locate.isResolved()) {
                        throw new IllegalStateException("Could not locate field '" + this.name + "' on " + typeDescription);
                    }
                    return Collections.singletonList(new ForField(locate.getField(), methodDescription));
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForMethodCall implements ArgumentLoader {
            private Implementation.Target implementationTarget;
            private MethodDescription instrumentedMethod;
            private final MethodCall methodCall;
            private final MethodDescription methodDescription;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForMethodCall forMethodCall = (ForMethodCall) obj;
                return this.methodDescription.equals(forMethodCall.methodDescription) && this.instrumentedMethod.equals(forMethodCall.instrumentedMethod) && this.implementationTarget.equals(forMethodCall.implementationTarget) && this.methodCall.equals(forMethodCall.methodCall);
            }

            public int hashCode() {
                return ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodDescription.hashCode()) * 31) + this.instrumentedMethod.hashCode()) * 31) + this.implementationTarget.hashCode()) * 31) + this.methodCall.hashCode();
            }

            public ForMethodCall(Implementation.Target target, MethodCall methodCall, MethodDescription methodDescription, MethodDescription methodDescription2) {
                this.methodCall = methodCall;
                this.methodDescription = methodDescription;
                this.instrumentedMethod = methodDescription2;
                this.implementationTarget = target;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader
            public StackManipulation resolve(ParameterDescription parameterDescription, Assigner assigner, Assigner.Typing typing) {
                if (!this.methodDescription.isStatic() && this.instrumentedMethod.isStatic()) {
                    throw new IllegalStateException("Cannot access non-static " + this.methodDescription + " from " + this.instrumentedMethod);
                }
                StackManipulation.Compound compound = new StackManipulation.Compound(this.methodCall.toStackManipulation(this.implementationTarget, this.instrumentedMethod, false), assigner.assign(this.methodDescription.getReturnType(), parameterDescription.getType(), typing));
                if (compound.isValid()) {
                    return compound;
                }
                throw new IllegalStateException("Cannot assign " + this.methodDescription + " to " + parameterDescription);
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class Factory implements Factory {
                private final MethodCall methodCall;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.methodCall.equals(((Factory) obj).methodCall);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodCall.hashCode();
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public InstrumentedType prepare(InstrumentedType instrumentedType) {
                    return instrumentedType;
                }

                public Factory(MethodCall methodCall) {
                    this.methodCall = methodCall;
                }

                @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
                public List<ArgumentLoader> make(Implementation.Target target, TypeDescription typeDescription, MethodDescription methodDescription, MethodDescription methodDescription2) {
                    MethodCall methodCall = this.methodCall;
                    return Collections.singletonList(new ForMethodCall(target, methodCall, methodCall.methodLocator.resolve(typeDescription, this.methodCall.targetHandler.resolve(typeDescription, methodDescription), methodDescription), methodDescription));
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForStackManipulation implements ArgumentLoader, Factory {
            private final StackManipulation stackManipulation;
            private final TypeDefinition typeDefinition;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForStackManipulation forStackManipulation = (ForStackManipulation) obj;
                return this.stackManipulation.equals(forStackManipulation.stackManipulation) && this.typeDefinition.equals(forStackManipulation.typeDefinition);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.stackManipulation.hashCode()) * 31) + this.typeDefinition.hashCode();
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                return instrumentedType;
            }

            public ForStackManipulation(StackManipulation stackManipulation, Type type) {
                this(stackManipulation, TypeDefinition.Sort.describe(type));
            }

            public ForStackManipulation(StackManipulation stackManipulation, TypeDefinition typeDefinition) {
                this.stackManipulation = stackManipulation;
                this.typeDefinition = typeDefinition;
            }

            public static Factory of(Object obj) {
                if (obj == null) {
                    return ForNullConstant.INSTANCE;
                }
                if (obj instanceof String) {
                    return new ForStackManipulation(new TextConstant((String) obj), String.class);
                }
                if (obj instanceof Boolean) {
                    return new ForStackManipulation(IntegerConstant.forValue(((Boolean) obj).booleanValue()), Boolean.TYPE);
                }
                if (obj instanceof Byte) {
                    return new ForStackManipulation(IntegerConstant.forValue(((Byte) obj).byteValue()), Byte.TYPE);
                }
                if (obj instanceof Short) {
                    return new ForStackManipulation(IntegerConstant.forValue(((Short) obj).shortValue()), Short.TYPE);
                }
                if (obj instanceof Character) {
                    return new ForStackManipulation(IntegerConstant.forValue(((Character) obj).charValue()), Character.TYPE);
                }
                if (obj instanceof Integer) {
                    return new ForStackManipulation(IntegerConstant.forValue(((Integer) obj).intValue()), Integer.TYPE);
                }
                if (obj instanceof Long) {
                    return new ForStackManipulation(LongConstant.forValue(((Long) obj).longValue()), Long.TYPE);
                }
                if (obj instanceof Float) {
                    return new ForStackManipulation(FloatConstant.forValue(((Float) obj).floatValue()), Float.TYPE);
                }
                if (obj instanceof Double) {
                    return new ForStackManipulation(DoubleConstant.forValue(((Double) obj).doubleValue()), Double.TYPE);
                }
                if (obj instanceof Class) {
                    return new ForStackManipulation(ClassConstant.of(TypeDescription.ForLoadedType.of((Class) obj)), Class.class);
                }
                if (JavaType.METHOD_HANDLE.getTypeStub().isInstance(obj)) {
                    return new ForStackManipulation(new JavaConstantValue(JavaConstant.MethodHandle.ofLoaded(obj)), JavaType.METHOD_HANDLE.getTypeStub());
                }
                if (JavaType.METHOD_TYPE.getTypeStub().isInstance(obj)) {
                    return new ForStackManipulation(new JavaConstantValue(JavaConstant.MethodType.ofLoaded(obj)), JavaType.METHOD_TYPE.getTypeStub());
                }
                if (obj instanceof Enum) {
                    EnumerationDescription.ForLoadedEnumeration forLoadedEnumeration = new EnumerationDescription.ForLoadedEnumeration((Enum) obj);
                    return new ForStackManipulation(FieldAccess.forEnumeration(forLoadedEnumeration), forLoadedEnumeration.getEnumerationType());
                }
                return new ForInstance.Factory(obj);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader.Factory
            public List<ArgumentLoader> make(Implementation.Target target, TypeDescription typeDescription, MethodDescription methodDescription, MethodDescription methodDescription2) {
                return Collections.singletonList(this);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.ArgumentLoader
            public StackManipulation resolve(ParameterDescription parameterDescription, Assigner assigner, Assigner.Typing typing) {
                StackManipulation assign = assigner.assign(this.typeDefinition.asGenericType(), parameterDescription.getType(), typing);
                if (!assign.isValid()) {
                    throw new IllegalStateException("Cannot assign " + parameterDescription + " to " + this.typeDefinition);
                }
                return new StackManipulation.Compound(this.stackManipulation, assign);
            }
        }
    }

    protected interface TargetHandler extends InstrumentedType.Prepareable {
        TypeDescription resolve(TypeDescription typeDescription, MethodDescription methodDescription);

        StackManipulation resolve(Implementation.Target target, MethodDescription methodDescription, MethodDescription methodDescription2, TypeDescription typeDescription, Assigner assigner, Assigner.Typing typing);

        public enum ForSelfOrStaticInvocation implements TargetHandler {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                return instrumentedType;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.TargetHandler
            public TypeDescription resolve(TypeDescription typeDescription, MethodDescription methodDescription) {
                return typeDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.TargetHandler
            public StackManipulation resolve(Implementation.Target target, MethodDescription methodDescription, MethodDescription methodDescription2, TypeDescription typeDescription, Assigner assigner, Assigner.Typing typing) {
                if (methodDescription2.isStatic() && !methodDescription.isStatic() && !methodDescription.isConstructor()) {
                    throw new IllegalStateException("Cannot invoke " + methodDescription + " from " + methodDescription2);
                }
                if (methodDescription.isConstructor() && (!methodDescription2.isConstructor() || (!typeDescription.equals(methodDescription.getDeclaringType().asErasure()) && !typeDescription.getSuperClass().asErasure().equals(methodDescription.getDeclaringType().asErasure())))) {
                    throw new IllegalStateException("Cannot invoke " + methodDescription + " from " + methodDescription2 + " in " + typeDescription);
                }
                StackManipulation[] stackManipulationArr = new StackManipulation[2];
                stackManipulationArr[0] = methodDescription.isStatic() ? StackManipulation.Trivial.INSTANCE : MethodVariableAccess.loadThis();
                stackManipulationArr[1] = methodDescription.isConstructor() ? Duplication.SINGLE : StackManipulation.Trivial.INSTANCE;
                return new StackManipulation.Compound(stackManipulationArr);
            }
        }

        public enum ForConstructingInvocation implements TargetHandler {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                return instrumentedType;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.TargetHandler
            public TypeDescription resolve(TypeDescription typeDescription, MethodDescription methodDescription) {
                return typeDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.TargetHandler
            public StackManipulation resolve(Implementation.Target target, MethodDescription methodDescription, MethodDescription methodDescription2, TypeDescription typeDescription, Assigner assigner, Assigner.Typing typing) {
                return new StackManipulation.Compound(TypeCreation.of(methodDescription.getDeclaringType().asErasure()), Duplication.SINGLE);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForValue implements TargetHandler {
            private static final String FIELD_PREFIX = "invocationTarget";
            private final TypeDescription.Generic fieldType;

            @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.IGNORE)
            private final String name = "invocationTarget$" + RandomString.make();
            private final Object target;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForValue forValue = (ForValue) obj;
                return this.target.equals(forValue.target) && this.fieldType.equals(forValue.fieldType);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.target.hashCode()) * 31) + this.fieldType.hashCode();
            }

            protected ForValue(Object obj, TypeDescription.Generic generic) {
                this.target = obj;
                this.fieldType = generic;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.TargetHandler
            public StackManipulation resolve(Implementation.Target target, MethodDescription methodDescription, MethodDescription methodDescription2, TypeDescription typeDescription, Assigner assigner, Assigner.Typing typing) {
                StackManipulation assign = assigner.assign(this.fieldType, methodDescription.getDeclaringType().asGenericType(), typing);
                if (!assign.isValid()) {
                    throw new IllegalStateException("Cannot invoke " + methodDescription + " on " + this.fieldType);
                }
                return new StackManipulation.Compound(FieldAccess.forField((FieldDescription.InDefinedShape) typeDescription.getDeclaredFields().filter(ElementMatchers.named(this.name)).getOnly()).read(), assign);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.TargetHandler
            public TypeDescription resolve(TypeDescription typeDescription, MethodDescription methodDescription) {
                return this.fieldType.asErasure();
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                return instrumentedType.withField(new FieldDescription.Token(this.name, 4169, this.fieldType)).withInitializer(new LoadedTypeInitializer.ForStaticField(this.name, this.target));
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForField implements TargetHandler {
            private final FieldLocator.Factory fieldLocatorFactory;
            private final String name;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                ForField forField = (ForField) obj;
                return this.name.equals(forField.name) && this.fieldLocatorFactory.equals(forField.fieldLocatorFactory);
            }

            public int hashCode() {
                return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.name.hashCode()) * 31) + this.fieldLocatorFactory.hashCode();
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                return instrumentedType;
            }

            protected ForField(String str, FieldLocator.Factory factory) {
                this.name = str;
                this.fieldLocatorFactory = factory;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.TargetHandler
            public StackManipulation resolve(Implementation.Target target, MethodDescription methodDescription, MethodDescription methodDescription2, TypeDescription typeDescription, Assigner assigner, Assigner.Typing typing) {
                StackManipulation stackManipulation;
                FieldLocator.Resolution locate = this.fieldLocatorFactory.make(typeDescription).locate(this.name);
                if (!locate.isResolved()) {
                    throw new IllegalStateException("Could not locate field name " + this.name + " on " + typeDescription);
                }
                if (!locate.getField().isStatic() && !typeDescription.isAssignableTo(locate.getField().getDeclaringType().asErasure())) {
                    throw new IllegalStateException("Cannot access " + locate.getField() + " from " + typeDescription);
                }
                if (!methodDescription.isInvokableOn(locate.getField().getType().asErasure())) {
                    throw new IllegalStateException("Cannot invoke " + methodDescription + " on " + locate.getField());
                }
                if (!methodDescription.isAccessibleTo(typeDescription)) {
                    throw new IllegalStateException("Cannot access " + methodDescription + " from " + typeDescription);
                }
                StackManipulation assign = assigner.assign(locate.getField().getType(), methodDescription.getDeclaringType().asGenericType(), typing);
                if (!assign.isValid()) {
                    throw new IllegalStateException("Cannot invoke " + methodDescription + " on " + locate.getField());
                }
                StackManipulation[] stackManipulationArr = new StackManipulation[3];
                if (methodDescription.isStatic() || locate.getField().isStatic()) {
                    stackManipulation = StackManipulation.Trivial.INSTANCE;
                } else {
                    stackManipulation = MethodVariableAccess.loadThis();
                }
                stackManipulationArr[0] = stackManipulation;
                stackManipulationArr[1] = FieldAccess.forField(locate.getField()).read();
                stackManipulationArr[2] = assign;
                return new StackManipulation.Compound(stackManipulationArr);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.TargetHandler
            public TypeDescription resolve(TypeDescription typeDescription, MethodDescription methodDescription) {
                FieldLocator.Resolution locate = this.fieldLocatorFactory.make(typeDescription).locate(this.name);
                if (!locate.isResolved()) {
                    throw new IllegalStateException("Could not locate field name " + this.name + " on " + typeDescription);
                }
                if (!locate.getField().isStatic() && !typeDescription.isAssignableTo(locate.getField().getDeclaringType().asErasure())) {
                    throw new IllegalStateException("Cannot access " + locate.getField() + " from " + typeDescription);
                }
                return locate.getField().getType().asErasure();
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForMethodParameter implements TargetHandler {
            private final int index;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.index == ((ForMethodParameter) obj).index;
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.index;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                return instrumentedType;
            }

            protected ForMethodParameter(int i) {
                this.index = i;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.TargetHandler
            public StackManipulation resolve(Implementation.Target target, MethodDescription methodDescription, MethodDescription methodDescription2, TypeDescription typeDescription, Assigner assigner, Assigner.Typing typing) {
                if (methodDescription2.getParameters().size() < this.index) {
                    throw new IllegalArgumentException(methodDescription2 + " does not have a parameter with index " + this.index);
                }
                ParameterDescription parameterDescription = (ParameterDescription) methodDescription2.getParameters().get(this.index);
                StackManipulation assign = assigner.assign(parameterDescription.getType(), methodDescription.getDeclaringType().asGenericType(), typing);
                if (!assign.isValid()) {
                    throw new IllegalStateException("Cannot invoke " + methodDescription + " on " + parameterDescription.getType());
                }
                return new StackManipulation.Compound(MethodVariableAccess.load(parameterDescription), assign);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.TargetHandler
            public TypeDescription resolve(TypeDescription typeDescription, MethodDescription methodDescription) {
                if (methodDescription.getParameters().size() < this.index) {
                    throw new IllegalArgumentException(methodDescription + " does not have a parameter with index " + this.index);
                }
                return ((ParameterDescription) methodDescription.getParameters().get(this.index)).getType().asErasure();
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForMethodCall implements TargetHandler {
            private final MethodCall methodCall;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.methodCall.equals(((ForMethodCall) obj).methodCall);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodCall.hashCode();
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.InstrumentedType.Prepareable
            public InstrumentedType prepare(InstrumentedType instrumentedType) {
                return instrumentedType;
            }

            protected ForMethodCall(MethodCall methodCall) {
                this.methodCall = methodCall;
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.TargetHandler
            public StackManipulation resolve(Implementation.Target target, MethodDescription methodDescription, MethodDescription methodDescription2, TypeDescription typeDescription, Assigner assigner, Assigner.Typing typing) {
                MethodDescription resolve = this.methodCall.methodLocator.resolve(typeDescription, this.methodCall.targetHandler.resolve(typeDescription, methodDescription2), methodDescription2);
                StackManipulation assign = assigner.assign(resolve.getReturnType(), methodDescription.getDeclaringType().asGenericType(), typing);
                if (!assign.isValid()) {
                    throw new IllegalStateException("Cannot invoke " + methodDescription + " on " + resolve.getReturnType());
                }
                return new StackManipulation.Compound(this.methodCall.toStackManipulation(target, methodDescription2, false), assign);
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.TargetHandler
            public TypeDescription resolve(TypeDescription typeDescription, MethodDescription methodDescription) {
                return this.methodCall.methodLocator.resolve(typeDescription, this.methodCall.targetHandler.resolve(typeDescription, methodDescription), methodDescription).getReturnType().asErasure();
            }
        }
    }

    protected interface MethodInvoker {
        StackManipulation invoke(MethodDescription methodDescription, Implementation.Target target);

        public enum ForContextualInvocation implements MethodInvoker {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.MethodInvoker
            public StackManipulation invoke(MethodDescription methodDescription, Implementation.Target target) {
                if (methodDescription.isVirtual() && !methodDescription.isInvokableOn(target.getInstrumentedType())) {
                    throw new IllegalStateException("Cannot invoke " + methodDescription + " on " + target.getInstrumentedType());
                }
                if (methodDescription.isVirtual()) {
                    return MethodInvocation.invoke(methodDescription).virtual(target.getInstrumentedType());
                }
                return MethodInvocation.invoke(methodDescription);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForVirtualInvocation implements MethodInvoker {
            private final TypeDescription typeDescription;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((ForVirtualInvocation) obj).typeDescription);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode();
            }

            protected ForVirtualInvocation(TypeDescription typeDescription) {
                this.typeDescription = typeDescription;
            }

            protected ForVirtualInvocation(Class<?> cls) {
                this(TypeDescription.ForLoadedType.of(cls));
            }

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.MethodInvoker
            public StackManipulation invoke(MethodDescription methodDescription, Implementation.Target target) {
                if (!methodDescription.isVirtual()) {
                    throw new IllegalStateException("Cannot invoke " + methodDescription + " virtually");
                }
                if (!methodDescription.isInvokableOn(this.typeDescription.asErasure())) {
                    throw new IllegalStateException("Cannot invoke " + methodDescription + " on " + this.typeDescription);
                }
                if (!this.typeDescription.asErasure().isAccessibleTo(target.getInstrumentedType())) {
                    throw new IllegalStateException(this.typeDescription + " is not accessible to " + target.getInstrumentedType());
                }
                return MethodInvocation.invoke(methodDescription).virtual(this.typeDescription.asErasure());
            }

            public enum WithImplicitType implements MethodInvoker {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.MethodInvoker
                public StackManipulation invoke(MethodDescription methodDescription, Implementation.Target target) {
                    if (!methodDescription.isVirtual()) {
                        throw new IllegalStateException("Cannot invoke " + methodDescription + " virtually");
                    }
                    return MethodInvocation.invoke(methodDescription);
                }
            }
        }

        public enum ForSuperMethodInvocation implements MethodInvoker {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.MethodInvoker
            public StackManipulation invoke(MethodDescription methodDescription, Implementation.Target target) {
                if (target.getInstrumentedType().getSuperClass() == null) {
                    throw new IllegalStateException("Cannot invoke super method for " + target.getInstrumentedType());
                }
                if (!methodDescription.isInvokableOn(target.getOriginType().asErasure())) {
                    throw new IllegalStateException("Cannot invoke " + methodDescription + " as super method of " + target.getInstrumentedType());
                }
                Implementation.SpecialMethodInvocation invokeDominant = target.invokeDominant(methodDescription.asSignatureToken());
                if (invokeDominant.isValid()) {
                    return invokeDominant;
                }
                throw new IllegalStateException("Cannot invoke " + methodDescription + " as a super method");
            }
        }

        public enum ForDefaultMethodInvocation implements MethodInvoker {
            INSTANCE;

            @Override // org.modelmapper.internal.bytebuddy.implementation.MethodCall.MethodInvoker
            public StackManipulation invoke(MethodDescription methodDescription, Implementation.Target target) {
                if (!methodDescription.isInvokableOn(target.getInstrumentedType())) {
                    throw new IllegalStateException("Cannot invoke " + methodDescription + " as default method of " + target.getInstrumentedType());
                }
                Implementation.SpecialMethodInvocation invokeDefault = target.invokeDefault(methodDescription.asSignatureToken(), methodDescription.getDeclaringType().asErasure());
                if (invokeDefault.isValid()) {
                    return invokeDefault;
                }
                throw new IllegalStateException("Cannot invoke " + methodDescription + " on " + target.getInstrumentedType());
            }
        }
    }

    public static class WithoutSpecifiedTarget extends MethodCall {
        protected WithoutSpecifiedTarget(MethodLocator methodLocator) {
            super(methodLocator, TargetHandler.ForSelfOrStaticInvocation.INSTANCE, Collections.emptyList(), MethodInvoker.ForContextualInvocation.INSTANCE, TerminationHandler.RETURNING, Assigner.DEFAULT, Assigner.Typing.STATIC);
        }

        public MethodCall on(Object obj) {
            return on(obj, obj.getClass());
        }

        public <T> MethodCall on(T t, Class<? super T> cls) {
            return new MethodCall(this.methodLocator, new TargetHandler.ForValue(t, TypeDescription.Generic.OfNonGenericType.ForLoadedType.of(cls)), this.argumentLoaders, new MethodInvoker.ForVirtualInvocation(cls), this.terminationHandler, this.assigner, this.typing);
        }

        public MethodCall onArgument(int i) {
            if (i < 0) {
                throw new IllegalArgumentException("An argument index cannot be negative: " + i);
            }
            return new MethodCall(this.methodLocator, new TargetHandler.ForMethodParameter(i), this.argumentLoaders, MethodInvoker.ForVirtualInvocation.WithImplicitType.INSTANCE, this.terminationHandler, this.assigner, this.typing);
        }

        public MethodCall onField(String str) {
            return onField(str, FieldLocator.ForClassHierarchy.Factory.INSTANCE);
        }

        public MethodCall onField(String str, FieldLocator.Factory factory) {
            return new MethodCall(this.methodLocator, new TargetHandler.ForField(str, factory), this.argumentLoaders, MethodInvoker.ForVirtualInvocation.WithImplicitType.INSTANCE, this.terminationHandler, this.assigner, this.typing);
        }

        public MethodCall onMethodCall(MethodCall methodCall) {
            return new MethodCall(this.methodLocator, new TargetHandler.ForMethodCall(methodCall), this.argumentLoaders, MethodInvoker.ForVirtualInvocation.WithImplicitType.INSTANCE, this.terminationHandler, this.assigner, this.typing);
        }

        public MethodCall onSuper() {
            return new MethodCall(this.methodLocator, TargetHandler.ForSelfOrStaticInvocation.INSTANCE, this.argumentLoaders, MethodInvoker.ForSuperMethodInvocation.INSTANCE, this.terminationHandler, this.assigner, this.typing);
        }

        public MethodCall onDefault() {
            return new MethodCall(this.methodLocator, TargetHandler.ForSelfOrStaticInvocation.INSTANCE, this.argumentLoaders, MethodInvoker.ForDefaultMethodInvocation.INSTANCE, this.terminationHandler, this.assigner, this.typing);
        }
    }

    protected StackManipulation toStackManipulation(Implementation.Target target, MethodDescription methodDescription, boolean z) {
        MethodDescription resolve = this.methodLocator.resolve(target.getInstrumentedType(), this.targetHandler.resolve(target.getInstrumentedType(), methodDescription), methodDescription);
        if (!resolve.isVisibleTo(target.getInstrumentedType())) {
            throw new IllegalStateException("Cannot invoke " + resolve + " from " + target.getInstrumentedType());
        }
        ArrayList arrayList = new ArrayList(this.argumentLoaders.size());
        Iterator<ArgumentLoader.Factory> it = this.argumentLoaders.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().make(target, target.getInstrumentedType(), methodDescription, resolve));
        }
        ParameterList<?> parameters = resolve.getParameters();
        if (parameters.size() != arrayList.size()) {
            throw new IllegalStateException(resolve + " does not take " + arrayList.size() + " arguments");
        }
        Iterator it2 = parameters.iterator();
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((ArgumentLoader) it3.next()).resolve((ParameterDescription) it2.next(), this.assigner, this.typing));
        }
        StackManipulation[] stackManipulationArr = new StackManipulation[4];
        stackManipulationArr[0] = this.targetHandler.resolve(target, resolve, methodDescription, target.getInstrumentedType(), this.assigner, this.typing);
        stackManipulationArr[1] = new StackManipulation.Compound(arrayList2);
        stackManipulationArr[2] = this.methodInvoker.invoke(resolve, target);
        stackManipulationArr[3] = z ? this.terminationHandler.resolve(resolve, methodDescription, this.assigner, this.typing) : StackManipulation.Trivial.INSTANCE;
        return new StackManipulation.Compound(stackManipulationArr);
    }

    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
    protected class Appender implements ByteCodeAppender {
        private final Implementation.Target implementationTarget;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Appender appender = (Appender) obj;
            return this.implementationTarget.equals(appender.implementationTarget) && MethodCall.this.equals(MethodCall.this);
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.implementationTarget.hashCode()) * 31) + MethodCall.this.hashCode();
        }

        protected Appender(Implementation.Target target) {
            this.implementationTarget = target;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.ByteCodeAppender
        public ByteCodeAppender.Size apply(MethodVisitor methodVisitor, Implementation.Context context, MethodDescription methodDescription) {
            return new ByteCodeAppender.Size(MethodCall.this.toStackManipulation(this.implementationTarget, methodDescription, true).apply(methodVisitor, context).getMaximalSize(), methodDescription.getStackSize());
        }
    }
}
