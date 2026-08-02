package org.modelmapper.internal.bytebuddy.implementation.bytecode.constant;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.modelmapper.internal.asm.MethodVisitor;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.implementation.Implementation;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.PrivilegedMemberLookupAction;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TypeProxy;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.Duplication;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.TypeCreation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.assign.TypeCasting;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.collection.ArrayFactory;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.FieldAccess;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.member.MethodInvocation;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;

/* loaded from: classes4.dex */
public abstract class MethodConstant implements StackManipulation {
    protected final MethodDescription.InDefinedShape methodDescription;

    public interface CanCache extends StackManipulation {
        StackManipulation cached();
    }

    protected abstract MethodDescription.InDefinedShape accessorMethod();

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public boolean isValid() {
        return true;
    }

    protected abstract StackManipulation methodName();

    protected MethodConstant(MethodDescription.InDefinedShape inDefinedShape) {
        this.methodDescription = inDefinedShape;
    }

    public static CanCache of(MethodDescription.InDefinedShape inDefinedShape) {
        if (inDefinedShape.isTypeInitializer()) {
            return CanCacheIllegal.INSTANCE;
        }
        if (inDefinedShape.isConstructor()) {
            return new ForConstructor(inDefinedShape);
        }
        return new ForMethod(inDefinedShape);
    }

    public static CanCache ofPrivileged(MethodDescription.InDefinedShape inDefinedShape) {
        if (inDefinedShape.isTypeInitializer()) {
            return CanCacheIllegal.INSTANCE;
        }
        if (inDefinedShape.isConstructor()) {
            return new ForConstructor(inDefinedShape).privileged();
        }
        return new ForMethod(inDefinedShape).privileged();
    }

    protected static List<StackManipulation> typeConstantsFor(List<TypeDescription> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<TypeDescription> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(ClassConstant.of(it.next()));
        }
        return arrayList;
    }

    @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
    public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
        return new StackManipulation.Compound(ClassConstant.of(this.methodDescription.getDeclaringType()), methodName(), ArrayFactory.forType(TypeDescription.Generic.OfNonGenericType.CLASS).withValues(typeConstantsFor(this.methodDescription.getParameters().asTypeList().asErasures())), MethodInvocation.invoke(accessorMethod())).apply(methodVisitor, context);
    }

    protected CanCache privileged() {
        return new PrivilegedLookup(this.methodDescription, methodName());
    }

    public int hashCode() {
        return this.methodDescription.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.methodDescription.equals(((MethodConstant) obj).methodDescription);
    }

    protected enum CanCacheIllegal implements CanCache {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return false;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCache
        public StackManipulation cached() {
            return StackManipulation.Illegal.INSTANCE;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            return StackManipulation.Illegal.INSTANCE.apply(methodVisitor, context);
        }
    }

    protected static class ForMethod extends MethodConstant implements CanCache {
        private static final MethodDescription.InDefinedShape GET_DECLARED_METHOD;
        private static final MethodDescription.InDefinedShape GET_METHOD;

        static {
            try {
                GET_METHOD = new MethodDescription.ForLoadedMethod(Class.class.getMethod("getMethod", String.class, Class[].class));
                GET_DECLARED_METHOD = new MethodDescription.ForLoadedMethod(Class.class.getMethod("getDeclaredMethod", String.class, Class[].class));
            } catch (NoSuchMethodException e) {
                throw new IllegalStateException("Could not locate method lookup", e);
            }
        }

        protected ForMethod(MethodDescription.InDefinedShape inDefinedShape) {
            super(inDefinedShape);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.MethodConstant
        protected StackManipulation methodName() {
            return new TextConstant(this.methodDescription.getInternalName());
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.MethodConstant
        protected MethodDescription.InDefinedShape accessorMethod() {
            return this.methodDescription.isPublic() ? GET_METHOD : GET_DECLARED_METHOD;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCache
        public StackManipulation cached() {
            return new CachedMethod(this);
        }
    }

    protected static class ForConstructor extends MethodConstant implements CanCache {
        private static final MethodDescription.InDefinedShape GET_CONSTRUCTOR;
        private static final MethodDescription.InDefinedShape GET_DECLARED_CONSTRUCTOR;

        static {
            try {
                GET_CONSTRUCTOR = new MethodDescription.ForLoadedMethod(Class.class.getMethod("getConstructor", Class[].class));
                GET_DECLARED_CONSTRUCTOR = new MethodDescription.ForLoadedMethod(Class.class.getMethod(TypeProxy.SilentConstruction.Appender.GET_DECLARED_CONSTRUCTOR_METHOD_NAME, Class[].class));
            } catch (NoSuchMethodException e) {
                throw new IllegalStateException("Could not locate Class::getDeclaredConstructor", e);
            }
        }

        protected ForConstructor(MethodDescription.InDefinedShape inDefinedShape) {
            super(inDefinedShape);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.MethodConstant
        protected StackManipulation methodName() {
            return StackManipulation.Trivial.INSTANCE;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.MethodConstant
        protected MethodDescription.InDefinedShape accessorMethod() {
            return this.methodDescription.isPublic() ? GET_CONSTRUCTOR : GET_DECLARED_CONSTRUCTOR;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCache
        public StackManipulation cached() {
            return new CachedConstructor(this);
        }
    }

    protected static class PrivilegedLookup implements StackManipulation, CanCache {
        private static final MethodDescription.InDefinedShape DO_PRIVILEGED;
        private final MethodDescription.InDefinedShape methodDescription;
        private final StackManipulation methodName;

        static {
            try {
                DO_PRIVILEGED = new MethodDescription.ForLoadedMethod(AccessController.class.getMethod("doPrivileged", PrivilegedExceptionAction.class));
            } catch (NoSuchMethodException e) {
                throw new IllegalStateException("Cannot locate AccessController::doPrivileged", e);
            }
        }

        protected PrivilegedLookup(MethodDescription.InDefinedShape inDefinedShape, StackManipulation stackManipulation) {
            this.methodDescription = inDefinedShape;
            this.methodName = stackManipulation;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return this.methodName.isValid();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            TypeDescription register = context.register(PrivilegedMemberLookupAction.of(this.methodDescription));
            StackManipulation[] stackManipulationArr = new StackManipulation[8];
            stackManipulationArr[0] = TypeCreation.of(register);
            stackManipulationArr[1] = Duplication.SINGLE;
            stackManipulationArr[2] = ClassConstant.of(this.methodDescription.getDeclaringType());
            stackManipulationArr[3] = this.methodName;
            stackManipulationArr[4] = ArrayFactory.forType(TypeDescription.Generic.OfNonGenericType.CLASS).withValues(MethodConstant.typeConstantsFor(this.methodDescription.getParameters().asTypeList().asErasures()));
            stackManipulationArr[5] = MethodInvocation.invoke((MethodDescription.InDefinedShape) register.getDeclaredMethods().filter(ElementMatchers.isConstructor()).getOnly());
            stackManipulationArr[6] = MethodInvocation.invoke(DO_PRIVILEGED);
            stackManipulationArr[7] = TypeCasting.to(TypeDescription.ForLoadedType.of(this.methodDescription.isConstructor() ? Constructor.class : Method.class));
            return new StackManipulation.Compound(stackManipulationArr).apply(methodVisitor, context);
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.MethodConstant.CanCache
        public StackManipulation cached() {
            return this.methodDescription.isConstructor() ? new CachedConstructor(this) : new CachedMethod(this);
        }

        public int hashCode() {
            return this.methodDescription.hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.methodDescription.equals(((PrivilegedLookup) obj).methodDescription);
        }
    }

    protected static class CachedMethod implements StackManipulation {
        private static final TypeDescription METHOD_TYPE = TypeDescription.ForLoadedType.of(Method.class);
        private final StackManipulation methodConstant;

        protected CachedMethod(StackManipulation stackManipulation) {
            this.methodConstant = stackManipulation;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return this.methodConstant.isValid();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            return FieldAccess.forField(context.cache(this.methodConstant, METHOD_TYPE)).read().apply(methodVisitor, context);
        }

        public int hashCode() {
            return this.methodConstant.hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.methodConstant.equals(((CachedMethod) obj).methodConstant);
        }
    }

    protected static class CachedConstructor implements StackManipulation {
        private static final TypeDescription CONSTRUCTOR_TYPE = TypeDescription.ForLoadedType.of(Constructor.class);
        private final StackManipulation constructorConstant;

        protected CachedConstructor(StackManipulation stackManipulation) {
            this.constructorConstant = stackManipulation;
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public boolean isValid() {
            return this.constructorConstant.isValid();
        }

        @Override // org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation
        public StackManipulation.Size apply(MethodVisitor methodVisitor, Implementation.Context context) {
            return FieldAccess.forField(context.cache(this.constructorConstant, CONSTRUCTOR_TYPE)).read().apply(methodVisitor, context);
        }

        public int hashCode() {
            return this.constructorConstant.hashCode();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.constructorConstant.equals(((CachedConstructor) obj).constructorConstant);
        }
    }
}
