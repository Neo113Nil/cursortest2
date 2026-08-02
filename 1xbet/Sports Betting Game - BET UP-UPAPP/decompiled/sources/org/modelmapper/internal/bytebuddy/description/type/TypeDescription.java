package org.modelmapper.internal.bytebuddy.description.type;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.GenericSignatureFormatError;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.text.Typography;
import org.modelmapper.internal.asm.signature.SignatureVisitor;
import org.modelmapper.internal.asm.signature.SignatureWriter;
import org.modelmapper.internal.bytebuddy.ClassFileVersion;
import org.modelmapper.internal.bytebuddy.build.CachedReturnPlugin;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.ByteCodeElement;
import org.modelmapper.internal.bytebuddy.description.ModifierReviewable;
import org.modelmapper.internal.bytebuddy.description.TypeVariableSource;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationDescription;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationList;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource;
import org.modelmapper.internal.bytebuddy.description.enumeration.EnumerationDescription;
import org.modelmapper.internal.bytebuddy.description.field.FieldDescription;
import org.modelmapper.internal.bytebuddy.description.field.FieldList;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.MethodList;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.type.PackageDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeList;
import org.modelmapper.internal.bytebuddy.dynamic.TargetType;
import org.modelmapper.internal.bytebuddy.implementation.MethodDelegation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackSize;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatcher;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;
import org.modelmapper.internal.bytebuddy.pool.TypePool;
import org.modelmapper.internal.bytebuddy.utility.CompoundList;
import org.modelmapper.internal.bytebuddy.utility.privilege.GetSystemPropertyAction;

/* loaded from: classes4.dex */
public interface TypeDescription extends TypeDefinition, ByteCodeElement, TypeVariableSource {
    public static final TypeDescription OBJECT = new ForLoadedType(Object.class);
    public static final TypeDescription STRING = new ForLoadedType(String.class);
    public static final TypeDescription CLASS = new ForLoadedType(Class.class);
    public static final TypeDescription THROWABLE = new ForLoadedType(Throwable.class);
    public static final TypeDescription VOID = new ForLoadedType(Void.TYPE);
    public static final TypeList.Generic ARRAY_INTERFACES = new TypeList.Generic.ForLoadedTypes(Cloneable.class, Serializable.class);
    public static final TypeDescription UNDEFINED = null;

    TypeDescription asBoxed();

    TypeDescription asUnboxed();

    int getActualModifiers(boolean z);

    String getCanonicalName();

    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
    TypeDescription getComponentType();

    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
    FieldList<FieldDescription.InDefinedShape> getDeclaredFields();

    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
    MethodList<MethodDescription.InDefinedShape> getDeclaredMethods();

    TypeList getDeclaredTypes();

    @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
    TypeDescription getDeclaringType();

    Object getDefaultValue();

    MethodDescription.InDefinedShape getEnclosingMethod();

    TypeDescription getEnclosingType();

    AnnotationList getInheritedAnnotations();

    int getInnerClassCount();

    TypeDescription getNestHost();

    TypeList getNestMembers();

    PackageDescription getPackage();

    String getSimpleName();

    boolean isAnnotationReturnType();

    boolean isAnnotationValue();

    boolean isAnnotationValue(Object obj);

    boolean isAnonymousType();

    boolean isAssignableFrom(Class<?> cls);

    boolean isAssignableFrom(TypeDescription typeDescription);

    boolean isAssignableTo(Class<?> cls);

    boolean isAssignableTo(TypeDescription typeDescription);

    boolean isInHierarchyWith(Class<?> cls);

    boolean isInHierarchyWith(TypeDescription typeDescription);

    boolean isInnerClass();

    boolean isInstance(Object obj);

    boolean isLocalType();

    boolean isMemberType();

    boolean isNestHost();

    boolean isNestMateOf(Class<?> cls);

    boolean isNestMateOf(TypeDescription typeDescription);

    boolean isNestedClass();

    boolean isPackageType();

    boolean isPrimitiveWrapper();

    boolean isSamePackage(TypeDescription typeDescription);

    public interface Generic extends TypeDefinition, AnnotationSource {
        public static final Generic OBJECT = new OfNonGenericType.ForLoadedType(Object.class);
        public static final Generic CLASS = new OfNonGenericType.ForLoadedType(Class.class);
        public static final Generic VOID = new OfNonGenericType.ForLoadedType(Void.TYPE);
        public static final Generic ANNOTATION = new OfNonGenericType.ForLoadedType(Annotation.class);
        public static final Generic UNDEFINED = null;

        <T> T accept(Visitor<T> visitor);

        Generic asRawType();

        Generic findBindingOf(Generic generic);

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        Generic getComponentType();

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        FieldList<FieldDescription.InGenericShape> getDeclaredFields();

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        MethodList<MethodDescription.InGenericShape> getDeclaredMethods();

        TypeList.Generic getLowerBounds();

        Generic getOwnerType();

        String getSymbol();

        TypeList.Generic getTypeArguments();

        TypeVariableSource getTypeVariableSource();

        TypeList.Generic getUpperBounds();

        public interface Visitor<T> {

            public enum NoOp implements Visitor<Generic> {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onGenericArray(Generic generic) {
                    return generic;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onNonGenericType(Generic generic) {
                    return generic;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onParameterizedType(Generic generic) {
                    return generic;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onTypeVariable(Generic generic) {
                    return generic;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onWildcard(Generic generic) {
                    return generic;
                }
            }

            T onGenericArray(Generic generic);

            T onNonGenericType(Generic generic);

            T onParameterizedType(Generic generic);

            T onTypeVariable(Generic generic);

            T onWildcard(Generic generic);

            public enum TypeErasing implements Visitor<Generic> {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onGenericArray(Generic generic) {
                    return generic.asRawType();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onWildcard(Generic generic) {
                    throw new IllegalArgumentException("Cannot erase a wildcard type: " + generic);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onParameterizedType(Generic generic) {
                    return generic.asRawType();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onTypeVariable(Generic generic) {
                    return generic.asRawType();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onNonGenericType(Generic generic) {
                    return generic.asRawType();
                }
            }

            public enum AnnotationStripper implements Visitor<Generic> {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onGenericArray(Generic generic) {
                    return new OfGenericArray.Latent((Generic) generic.getComponentType().accept(this), AnnotationSource.Empty.INSTANCE);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onWildcard(Generic generic) {
                    return new OfWildcardType.Latent(generic.getUpperBounds().accept(this), generic.getLowerBounds().accept(this), AnnotationSource.Empty.INSTANCE);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onParameterizedType(Generic generic) {
                    Generic ownerType = generic.getOwnerType();
                    return new OfParameterizedType.Latent(generic.asErasure(), ownerType == null ? Generic.UNDEFINED : (Generic) ownerType.accept(this), generic.getTypeArguments().accept(this), AnnotationSource.Empty.INSTANCE);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onTypeVariable(Generic generic) {
                    return new NonAnnotatedTypeVariable(generic);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onNonGenericType(Generic generic) {
                    if (generic.isArray()) {
                        return new OfGenericArray.Latent(onNonGenericType(generic.getComponentType()), AnnotationSource.Empty.INSTANCE);
                    }
                    return new OfNonGenericType.Latent(generic.asErasure(), AnnotationSource.Empty.INSTANCE);
                }

                protected static class NonAnnotatedTypeVariable extends OfTypeVariable {
                    private final Generic typeVariable;

                    protected NonAnnotatedTypeVariable(Generic generic) {
                        this.typeVariable = generic;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                    public TypeList.Generic getUpperBounds() {
                        return this.typeVariable.getUpperBounds();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                    public TypeVariableSource getTypeVariableSource() {
                        return this.typeVariable.getTypeVariableSource();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                    public String getSymbol() {
                        return this.typeVariable.getSymbol();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                    public AnnotationList getDeclaredAnnotations() {
                        return new AnnotationList.Empty();
                    }
                }
            }

            public enum Assigner implements Visitor<Dispatcher> {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Dispatcher onGenericArray(Generic generic) {
                    return new Dispatcher.ForGenericArray(generic);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Dispatcher onWildcard(Generic generic) {
                    throw new IllegalArgumentException("A wildcard is not a first level type: " + this);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Dispatcher onParameterizedType(Generic generic) {
                    return new Dispatcher.ForParameterizedType(generic);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Dispatcher onTypeVariable(Generic generic) {
                    return new Dispatcher.ForTypeVariable(generic);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Dispatcher onNonGenericType(Generic generic) {
                    return new Dispatcher.ForNonGenericType(generic.asErasure());
                }

                public interface Dispatcher {
                    boolean isAssignableFrom(Generic generic);

                    public static abstract class AbstractBase implements Dispatcher, Visitor<Boolean> {
                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher
                        public boolean isAssignableFrom(Generic generic) {
                            return ((Boolean) generic.accept(this)).booleanValue();
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class ForNonGenericType extends AbstractBase {
                        private final TypeDescription typeDescription;

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((ForNonGenericType) obj).typeDescription);
                        }

                        public int hashCode() {
                            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode();
                        }

                        protected ForNonGenericType(TypeDescription typeDescription) {
                            this.typeDescription = typeDescription;
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public Boolean onGenericArray(Generic generic) {
                            boolean z;
                            if (this.typeDescription.isArray()) {
                                z = ((Boolean) generic.getComponentType().accept(new ForNonGenericType(this.typeDescription.getComponentType()))).booleanValue();
                            } else {
                                z = this.typeDescription.represents(Object.class) || TypeDescription.ARRAY_INTERFACES.contains(this.typeDescription.asGenericType());
                            }
                            return Boolean.valueOf(z);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public Boolean onWildcard(Generic generic) {
                            throw new IllegalArgumentException("A wildcard is not a first-level type: " + generic);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public Boolean onParameterizedType(Generic generic) {
                            if (this.typeDescription.equals(generic.asErasure())) {
                                return true;
                            }
                            Generic superClass = generic.getSuperClass();
                            if (superClass != null && isAssignableFrom(superClass)) {
                                return true;
                            }
                            Iterator it = generic.getInterfaces().iterator();
                            while (it.hasNext()) {
                                if (isAssignableFrom((Generic) it.next())) {
                                    return true;
                                }
                            }
                            return Boolean.valueOf(this.typeDescription.represents(Object.class));
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public Boolean onTypeVariable(Generic generic) {
                            Iterator it = generic.getUpperBounds().iterator();
                            while (it.hasNext()) {
                                if (isAssignableFrom((Generic) it.next())) {
                                    return true;
                                }
                            }
                            return false;
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public Boolean onNonGenericType(Generic generic) {
                            return Boolean.valueOf(this.typeDescription.isAssignableFrom(generic.asErasure()));
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class ForTypeVariable extends AbstractBase {
                        private final Generic typeVariable;

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return obj != null && getClass() == obj.getClass() && this.typeVariable.equals(((ForTypeVariable) obj).typeVariable);
                        }

                        public int hashCode() {
                            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeVariable.hashCode();
                        }

                        protected ForTypeVariable(Generic generic) {
                            this.typeVariable = generic;
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public Boolean onGenericArray(Generic generic) {
                            return false;
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public Boolean onWildcard(Generic generic) {
                            throw new IllegalArgumentException("A wildcard is not a first-level type: " + generic);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public Boolean onParameterizedType(Generic generic) {
                            return false;
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public Boolean onTypeVariable(Generic generic) {
                            if (generic.equals(this.typeVariable)) {
                                return true;
                            }
                            Iterator it = generic.getUpperBounds().iterator();
                            while (it.hasNext()) {
                                if (isAssignableFrom((Generic) it.next())) {
                                    return true;
                                }
                            }
                            return false;
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public Boolean onNonGenericType(Generic generic) {
                            return false;
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class ForParameterizedType extends AbstractBase {
                        private final Generic parameterizedType;

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return obj != null && getClass() == obj.getClass() && this.parameterizedType.equals(((ForParameterizedType) obj).parameterizedType);
                        }

                        public int hashCode() {
                            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.parameterizedType.hashCode();
                        }

                        protected ForParameterizedType(Generic generic) {
                            this.parameterizedType = generic;
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public Boolean onGenericArray(Generic generic) {
                            return false;
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public Boolean onWildcard(Generic generic) {
                            throw new IllegalArgumentException("A wildcard is not a first-level type: " + generic);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public Boolean onParameterizedType(Generic generic) {
                            if (this.parameterizedType.asErasure().equals(generic.asErasure())) {
                                Generic ownerType = this.parameterizedType.getOwnerType();
                                Generic ownerType2 = generic.getOwnerType();
                                if (ownerType == null || ownerType2 == null || ((Dispatcher) ownerType.accept(Assigner.INSTANCE)).isAssignableFrom(ownerType2)) {
                                    TypeList.Generic typeArguments = this.parameterizedType.getTypeArguments();
                                    TypeList.Generic typeArguments2 = generic.getTypeArguments();
                                    if (typeArguments.size() == typeArguments2.size()) {
                                        for (int i = 0; i < typeArguments.size(); i++) {
                                            if (!((Dispatcher) ((Generic) typeArguments.get(i)).accept(ParameterAssigner.INSTANCE)).isAssignableFrom((Generic) typeArguments2.get(i))) {
                                                return false;
                                            }
                                        }
                                        return true;
                                    }
                                    throw new IllegalArgumentException("Incompatible generic types: " + generic + " and " + this.parameterizedType);
                                }
                                return false;
                            }
                            Generic superClass = generic.getSuperClass();
                            if (superClass != null && isAssignableFrom(superClass)) {
                                return true;
                            }
                            Iterator it = generic.getInterfaces().iterator();
                            while (it.hasNext()) {
                                if (isAssignableFrom((Generic) it.next())) {
                                    return true;
                                }
                            }
                            return false;
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public Boolean onTypeVariable(Generic generic) {
                            Iterator it = generic.getUpperBounds().iterator();
                            while (it.hasNext()) {
                                if (isAssignableFrom((Generic) it.next())) {
                                    return true;
                                }
                            }
                            return false;
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public Boolean onNonGenericType(Generic generic) {
                            if (this.parameterizedType.asErasure().equals(generic.asErasure())) {
                                return true;
                            }
                            Generic superClass = generic.getSuperClass();
                            if (superClass != null && isAssignableFrom(superClass)) {
                                return true;
                            }
                            Iterator it = generic.getInterfaces().iterator();
                            while (it.hasNext()) {
                                if (isAssignableFrom((Generic) it.next())) {
                                    return true;
                                }
                            }
                            return false;
                        }

                        protected enum ParameterAssigner implements Visitor<Dispatcher> {
                            INSTANCE;

                            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                            public Dispatcher onGenericArray(Generic generic) {
                                return new InvariantBinding(generic);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                            public Dispatcher onWildcard(Generic generic) {
                                TypeList.Generic lowerBounds = generic.getLowerBounds();
                                if (lowerBounds.isEmpty()) {
                                    return new CovariantBinding(generic.getUpperBounds().getOnly());
                                }
                                return new ContravariantBinding(lowerBounds.getOnly());
                            }

                            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                            public Dispatcher onParameterizedType(Generic generic) {
                                return new InvariantBinding(generic);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                            public Dispatcher onTypeVariable(Generic generic) {
                                return new InvariantBinding(generic);
                            }

                            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                            public Dispatcher onNonGenericType(Generic generic) {
                                return new InvariantBinding(generic);
                            }

                            @HashCodeAndEqualsPlugin.Enhance
                            protected static class InvariantBinding implements Dispatcher {
                                private final Generic typeDescription;

                                public boolean equals(Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((InvariantBinding) obj).typeDescription);
                                }

                                public int hashCode() {
                                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode();
                                }

                                protected InvariantBinding(Generic generic) {
                                    this.typeDescription = generic;
                                }

                                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher
                                public boolean isAssignableFrom(Generic generic) {
                                    return generic.equals(this.typeDescription);
                                }
                            }

                            @HashCodeAndEqualsPlugin.Enhance
                            protected static class CovariantBinding implements Dispatcher {
                                private final Generic upperBound;

                                public boolean equals(Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    return obj != null && getClass() == obj.getClass() && this.upperBound.equals(((CovariantBinding) obj).upperBound);
                                }

                                public int hashCode() {
                                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.upperBound.hashCode();
                                }

                                protected CovariantBinding(Generic generic) {
                                    this.upperBound = generic;
                                }

                                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher
                                public boolean isAssignableFrom(Generic generic) {
                                    if (generic.getSort().isWildcard()) {
                                        return generic.getLowerBounds().isEmpty() && ((Dispatcher) this.upperBound.accept(Assigner.INSTANCE)).isAssignableFrom(generic.getUpperBounds().getOnly());
                                    }
                                    return ((Dispatcher) this.upperBound.accept(Assigner.INSTANCE)).isAssignableFrom(generic);
                                }
                            }

                            @HashCodeAndEqualsPlugin.Enhance
                            protected static class ContravariantBinding implements Dispatcher {
                                private final Generic lowerBound;

                                public boolean equals(Object obj) {
                                    if (this == obj) {
                                        return true;
                                    }
                                    return obj != null && getClass() == obj.getClass() && this.lowerBound.equals(((ContravariantBinding) obj).lowerBound);
                                }

                                public int hashCode() {
                                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.lowerBound.hashCode();
                                }

                                protected ContravariantBinding(Generic generic) {
                                    this.lowerBound = generic;
                                }

                                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Assigner.Dispatcher
                                public boolean isAssignableFrom(Generic generic) {
                                    if (!generic.getSort().isWildcard()) {
                                        return generic.getSort().isWildcard() || ((Dispatcher) generic.accept(Assigner.INSTANCE)).isAssignableFrom(this.lowerBound);
                                    }
                                    TypeList.Generic lowerBounds = generic.getLowerBounds();
                                    return !lowerBounds.isEmpty() && ((Dispatcher) lowerBounds.getOnly().accept(Assigner.INSTANCE)).isAssignableFrom(this.lowerBound);
                                }
                            }
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    public static class ForGenericArray extends AbstractBase {
                        private final Generic genericArray;

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return obj != null && getClass() == obj.getClass() && this.genericArray.equals(((ForGenericArray) obj).genericArray);
                        }

                        public int hashCode() {
                            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.genericArray.hashCode();
                        }

                        protected ForGenericArray(Generic generic) {
                            this.genericArray = generic;
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public Boolean onGenericArray(Generic generic) {
                            return Boolean.valueOf(((Dispatcher) this.genericArray.getComponentType().accept(Assigner.INSTANCE)).isAssignableFrom(generic.getComponentType()));
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public Boolean onWildcard(Generic generic) {
                            throw new IllegalArgumentException("A wildcard is not a first-level type: " + generic);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public Boolean onParameterizedType(Generic generic) {
                            return false;
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public Boolean onTypeVariable(Generic generic) {
                            return false;
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                        public Boolean onNonGenericType(Generic generic) {
                            return Boolean.valueOf(generic.isArray() && ((Dispatcher) this.genericArray.getComponentType().accept(Assigner.INSTANCE)).isAssignableFrom(generic.getComponentType()));
                        }
                    }
                }
            }

            public enum Validator implements Visitor<Boolean> {
                SUPER_CLASS(false, false, false, false) { // from class: org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.1
                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Boolean onGenericArray(Generic generic) {
                        return super.onGenericArray(generic);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Boolean onTypeVariable(Generic generic) {
                        return super.onTypeVariable(generic);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Boolean onWildcard(Generic generic) {
                        return super.onWildcard(generic);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public Boolean onNonGenericType(Generic generic) {
                        return Boolean.valueOf(super.onNonGenericType(generic).booleanValue() && !generic.isInterface());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public Boolean onParameterizedType(Generic generic) {
                        return Boolean.valueOf(!generic.isInterface());
                    }
                },
                INTERFACE(false, false, false, false) { // from class: org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.2
                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Boolean onGenericArray(Generic generic) {
                        return super.onGenericArray(generic);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Boolean onTypeVariable(Generic generic) {
                        return super.onTypeVariable(generic);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Boolean onWildcard(Generic generic) {
                        return super.onWildcard(generic);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public Boolean onNonGenericType(Generic generic) {
                        return Boolean.valueOf(super.onNonGenericType(generic).booleanValue() && generic.isInterface());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public Boolean onParameterizedType(Generic generic) {
                        return Boolean.valueOf(generic.isInterface());
                    }
                },
                TYPE_VARIABLE(false, false, true, false),
                FIELD(true, true, true, false),
                METHOD_RETURN(true, true, true, true),
                METHOD_PARAMETER(true, true, true, false),
                EXCEPTION(false, false, true, false) { // from class: org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator.3
                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Boolean onGenericArray(Generic generic) {
                        return super.onGenericArray(generic);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Boolean onWildcard(Generic generic) {
                        return super.onWildcard(generic);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public Boolean onParameterizedType(Generic generic) {
                        return false;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public Boolean onTypeVariable(Generic generic) {
                        Iterator it = generic.getUpperBounds().iterator();
                        while (it.hasNext()) {
                            if (((Boolean) ((Generic) it.next()).accept(this)).booleanValue()) {
                                return true;
                            }
                        }
                        return false;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Validator, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public Boolean onNonGenericType(Generic generic) {
                        return Boolean.valueOf(generic.asErasure().isAssignableTo(Throwable.class));
                    }
                },
                RECEIVER(false, false, false, false);

                private final boolean acceptsArray;
                private final boolean acceptsPrimitive;
                private final boolean acceptsVariable;
                private final boolean acceptsVoid;

                Validator(boolean z, boolean z2, boolean z3, boolean z4) {
                    this.acceptsArray = z;
                    this.acceptsPrimitive = z2;
                    this.acceptsVariable = z3;
                    this.acceptsVoid = z4;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Boolean onGenericArray(Generic generic) {
                    return Boolean.valueOf(this.acceptsArray);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Boolean onWildcard(Generic generic) {
                    return false;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Boolean onParameterizedType(Generic generic) {
                    return true;
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Boolean onTypeVariable(Generic generic) {
                    return Boolean.valueOf(this.acceptsVariable);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Boolean onNonGenericType(Generic generic) {
                    return Boolean.valueOf((this.acceptsArray || !generic.isArray()) && (this.acceptsPrimitive || !generic.isPrimitive()) && (this.acceptsVoid || !generic.represents(Void.TYPE)));
                }

                public enum ForTypeAnnotations implements Visitor<Boolean> {
                    INSTANCE;

                    private final ElementType typeParameter;
                    private final ElementType typeUse;

                    ForTypeAnnotations() {
                        ElementType elementType;
                        ElementType elementType2;
                        try {
                            elementType = (ElementType) Enum.valueOf(ElementType.class, "TYPE_USE");
                            elementType2 = (ElementType) Enum.valueOf(ElementType.class, "TYPE_PARAMETER");
                        } catch (IllegalArgumentException unused) {
                            elementType = null;
                            elementType2 = null;
                        }
                        this.typeUse = elementType;
                        this.typeParameter = elementType2;
                    }

                    public static boolean ofFormalTypeVariable(Generic generic) {
                        HashSet hashSet = new HashSet();
                        for (AnnotationDescription annotationDescription : generic.getDeclaredAnnotations()) {
                            if (!annotationDescription.getElementTypes().contains(INSTANCE.typeParameter) || !hashSet.add(annotationDescription.getAnnotationType())) {
                                return false;
                            }
                        }
                        return true;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public Boolean onGenericArray(Generic generic) {
                        return Boolean.valueOf(isValid(generic) && ((Boolean) generic.getComponentType().accept(this)).booleanValue());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public Boolean onWildcard(Generic generic) {
                        if (!isValid(generic)) {
                            return false;
                        }
                        TypeList.Generic lowerBounds = generic.getLowerBounds();
                        if (lowerBounds.isEmpty()) {
                            lowerBounds = generic.getUpperBounds();
                        }
                        return (Boolean) lowerBounds.getOnly().accept(this);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public Boolean onParameterizedType(Generic generic) {
                        if (!isValid(generic)) {
                            return false;
                        }
                        Generic ownerType = generic.getOwnerType();
                        if (ownerType != null && !((Boolean) ownerType.accept(this)).booleanValue()) {
                            return false;
                        }
                        Iterator it = generic.getTypeArguments().iterator();
                        while (it.hasNext()) {
                            if (!((Boolean) ((Generic) it.next()).accept(this)).booleanValue()) {
                                return false;
                            }
                        }
                        return true;
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public Boolean onTypeVariable(Generic generic) {
                        return Boolean.valueOf(isValid(generic));
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public Boolean onNonGenericType(Generic generic) {
                        return Boolean.valueOf(isValid(generic) && (!generic.isArray() || ((Boolean) generic.getComponentType().accept(this)).booleanValue()));
                    }

                    private boolean isValid(Generic generic) {
                        HashSet hashSet = new HashSet();
                        for (AnnotationDescription annotationDescription : generic.getDeclaredAnnotations()) {
                            if (!annotationDescription.getElementTypes().contains(this.typeUse) || !hashSet.add(annotationDescription.getAnnotationType())) {
                                return false;
                            }
                        }
                        return true;
                    }
                }
            }

            public enum Reifying implements Visitor<Generic> {
                INITIATING { // from class: org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying.1
                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public Generic onParameterizedType(Generic generic) {
                        return generic;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Generic onGenericArray(Generic generic) {
                        return super.onGenericArray(generic);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Generic onNonGenericType(Generic generic) {
                        return super.onNonGenericType(generic);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Generic onTypeVariable(Generic generic) {
                        return super.onTypeVariable(generic);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Generic onWildcard(Generic generic) {
                        return super.onWildcard(generic);
                    }
                },
                INHERITING { // from class: org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying.2
                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Generic onGenericArray(Generic generic) {
                        return super.onGenericArray(generic);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Generic onNonGenericType(Generic generic) {
                        return super.onNonGenericType(generic);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Generic onTypeVariable(Generic generic) {
                        return super.onTypeVariable(generic);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Reifying, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Generic onWildcard(Generic generic) {
                        return super.onWildcard(generic);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public Generic onParameterizedType(Generic generic) {
                        return new OfParameterizedType.ForReifiedType(generic);
                    }
                };

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onGenericArray(Generic generic) {
                    throw new IllegalArgumentException("Cannot reify a generic array: " + generic);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onWildcard(Generic generic) {
                    throw new IllegalArgumentException("Cannot reify a wildcard: " + generic);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onTypeVariable(Generic generic) {
                    throw new IllegalArgumentException("Cannot reify a type variable: " + generic);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onNonGenericType(Generic generic) {
                    TypeDescription asErasure = generic.asErasure();
                    return asErasure.isGenerified() ? new OfNonGenericType.ForReifiedErasure(asErasure) : generic;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForSignatureVisitor implements Visitor<SignatureVisitor> {
                private static final int ONLY_CHARACTER = 0;
                protected final SignatureVisitor signatureVisitor;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.signatureVisitor.equals(((ForSignatureVisitor) obj).signatureVisitor);
                }

                public int hashCode() {
                    return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.signatureVisitor.hashCode();
                }

                public ForSignatureVisitor(SignatureVisitor signatureVisitor) {
                    this.signatureVisitor = signatureVisitor;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public SignatureVisitor onGenericArray(Generic generic) {
                    generic.getComponentType().accept(new ForSignatureVisitor(this.signatureVisitor.visitArrayType()));
                    return this.signatureVisitor;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public SignatureVisitor onWildcard(Generic generic) {
                    throw new IllegalStateException("Unexpected wildcard: " + generic);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public SignatureVisitor onParameterizedType(Generic generic) {
                    onOwnableType(generic);
                    this.signatureVisitor.visitEnd();
                    return this.signatureVisitor;
                }

                private void onOwnableType(Generic generic) {
                    Generic ownerType = generic.getOwnerType();
                    if (ownerType != null && ownerType.getSort().isParameterized()) {
                        onOwnableType(ownerType);
                        this.signatureVisitor.visitInnerClassType(generic.asErasure().getSimpleName());
                    } else {
                        this.signatureVisitor.visitClassType(generic.asErasure().getInternalName());
                    }
                    Iterator it = generic.getTypeArguments().iterator();
                    while (it.hasNext()) {
                        ((Generic) it.next()).accept(new OfTypeArgument(this.signatureVisitor));
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public SignatureVisitor onTypeVariable(Generic generic) {
                    this.signatureVisitor.visitTypeVariable(generic.getSymbol());
                    return this.signatureVisitor;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public SignatureVisitor onNonGenericType(Generic generic) {
                    if (generic.isArray()) {
                        generic.getComponentType().accept(new ForSignatureVisitor(this.signatureVisitor.visitArrayType()));
                    } else if (generic.isPrimitive()) {
                        this.signatureVisitor.visitBaseType(generic.asErasure().getDescriptor().charAt(0));
                    } else {
                        this.signatureVisitor.visitClassType(generic.asErasure().getInternalName());
                        this.signatureVisitor.visitEnd();
                    }
                    return this.signatureVisitor;
                }

                protected static class OfTypeArgument extends ForSignatureVisitor {
                    protected OfTypeArgument(SignatureVisitor signatureVisitor) {
                        super(signatureVisitor);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.ForSignatureVisitor, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public SignatureVisitor onWildcard(Generic generic) {
                        TypeList.Generic upperBounds = generic.getUpperBounds();
                        TypeList.Generic lowerBounds = generic.getLowerBounds();
                        if (lowerBounds.isEmpty() && upperBounds.getOnly().represents(Object.class)) {
                            this.signatureVisitor.visitTypeArgument();
                        } else if (!lowerBounds.isEmpty()) {
                            lowerBounds.getOnly().accept(new ForSignatureVisitor(this.signatureVisitor.visitTypeArgument(SignatureVisitor.SUPER)));
                        } else {
                            upperBounds.getOnly().accept(new ForSignatureVisitor(this.signatureVisitor.visitTypeArgument(SignatureVisitor.EXTENDS)));
                        }
                        return this.signatureVisitor;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.ForSignatureVisitor, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public SignatureVisitor onGenericArray(Generic generic) {
                        generic.accept(new ForSignatureVisitor(this.signatureVisitor.visitTypeArgument('=')));
                        return this.signatureVisitor;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.ForSignatureVisitor, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public SignatureVisitor onParameterizedType(Generic generic) {
                        generic.accept(new ForSignatureVisitor(this.signatureVisitor.visitTypeArgument('=')));
                        return this.signatureVisitor;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.ForSignatureVisitor, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public SignatureVisitor onTypeVariable(Generic generic) {
                        generic.accept(new ForSignatureVisitor(this.signatureVisitor.visitTypeArgument('=')));
                        return this.signatureVisitor;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.ForSignatureVisitor, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public SignatureVisitor onNonGenericType(Generic generic) {
                        generic.accept(new ForSignatureVisitor(this.signatureVisitor.visitTypeArgument('=')));
                        return this.signatureVisitor;
                    }
                }
            }

            public static abstract class Substitutor implements Visitor<Generic> {
                protected abstract Generic onSimpleType(Generic generic);

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onParameterizedType(Generic generic) {
                    Generic ownerType = generic.getOwnerType();
                    ArrayList arrayList = new ArrayList(generic.getTypeArguments().size());
                    Iterator it = generic.getTypeArguments().iterator();
                    while (it.hasNext()) {
                        arrayList.add(((Generic) it.next()).accept(this));
                    }
                    return new OfParameterizedType.Latent(((Generic) generic.asRawType().accept(this)).asErasure(), ownerType == null ? Generic.UNDEFINED : (Generic) ownerType.accept(this), arrayList, generic);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onGenericArray(Generic generic) {
                    return new OfGenericArray.Latent((Generic) generic.getComponentType().accept(this), generic);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onWildcard(Generic generic) {
                    return new OfWildcardType.Latent(generic.getUpperBounds().accept(this), generic.getLowerBounds().accept(this), generic);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onNonGenericType(Generic generic) {
                    if (generic.isArray()) {
                        return new OfGenericArray.Latent((Generic) generic.getComponentType().accept(this), generic);
                    }
                    return onSimpleType(generic);
                }

                public static abstract class WithoutTypeSubstitution extends Substitutor {
                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public Generic onNonGenericType(Generic generic) {
                        return generic;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor
                    protected Generic onSimpleType(Generic generic) {
                        return generic;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Generic onGenericArray(Generic generic) {
                        return super.onGenericArray(generic);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Generic onParameterizedType(Generic generic) {
                        return super.onParameterizedType(generic);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Generic onWildcard(Generic generic) {
                        return super.onWildcard(generic);
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForAttachment extends Substitutor {
                    private final TypeDescription declaringType;
                    private final TypeVariableSource typeVariableSource;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        ForAttachment forAttachment = (ForAttachment) obj;
                        return this.declaringType.equals(forAttachment.declaringType) && this.typeVariableSource.equals(forAttachment.typeVariableSource);
                    }

                    public int hashCode() {
                        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.declaringType.hashCode()) * 31) + this.typeVariableSource.hashCode();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Generic onGenericArray(Generic generic) {
                        return super.onGenericArray(generic);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Generic onNonGenericType(Generic generic) {
                        return super.onNonGenericType(generic);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Generic onParameterizedType(Generic generic) {
                        return super.onParameterizedType(generic);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Generic onWildcard(Generic generic) {
                        return super.onWildcard(generic);
                    }

                    protected ForAttachment(TypeDefinition typeDefinition, TypeVariableSource typeVariableSource) {
                        this(typeDefinition.asErasure(), typeVariableSource);
                    }

                    protected ForAttachment(TypeDescription typeDescription, TypeVariableSource typeVariableSource) {
                        this.declaringType = typeDescription;
                        this.typeVariableSource = typeVariableSource;
                    }

                    public static ForAttachment of(FieldDescription fieldDescription) {
                        return new ForAttachment(fieldDescription.getDeclaringType(), fieldDescription.getDeclaringType().asErasure());
                    }

                    public static ForAttachment of(MethodDescription methodDescription) {
                        return new ForAttachment(methodDescription.getDeclaringType(), methodDescription);
                    }

                    public static ForAttachment of(ParameterDescription parameterDescription) {
                        return new ForAttachment(parameterDescription.getDeclaringMethod().getDeclaringType(), parameterDescription.getDeclaringMethod());
                    }

                    public static ForAttachment of(TypeDescription typeDescription) {
                        return new ForAttachment(typeDescription, (TypeVariableSource) typeDescription);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public Generic onTypeVariable(Generic generic) {
                        Generic findVariable = this.typeVariableSource.findVariable(generic.getSymbol());
                        if (findVariable == null) {
                            throw new IllegalArgumentException("Cannot attach undefined variable: " + generic);
                        }
                        return new OfTypeVariable.WithAnnotationOverlay(findVariable, generic);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor
                    protected Generic onSimpleType(Generic generic) {
                        return generic.represents(TargetType.class) ? new OfNonGenericType.Latent(this.declaringType, generic) : generic;
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForDetachment extends Substitutor {
                    private final ElementMatcher<? super TypeDescription> typeMatcher;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.typeMatcher.equals(((ForDetachment) obj).typeMatcher);
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeMatcher.hashCode();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Generic onGenericArray(Generic generic) {
                        return super.onGenericArray(generic);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Generic onNonGenericType(Generic generic) {
                        return super.onNonGenericType(generic);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Generic onParameterizedType(Generic generic) {
                        return super.onParameterizedType(generic);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Generic onWildcard(Generic generic) {
                        return super.onWildcard(generic);
                    }

                    public ForDetachment(ElementMatcher<? super TypeDescription> elementMatcher) {
                        this.typeMatcher = elementMatcher;
                    }

                    public static Visitor<Generic> of(TypeDefinition typeDefinition) {
                        return new ForDetachment(ElementMatchers.is(typeDefinition));
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public Generic onTypeVariable(Generic generic) {
                        return new OfTypeVariable.Symbolic(generic.getSymbol(), generic);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor
                    protected Generic onSimpleType(Generic generic) {
                        return this.typeMatcher.matches(generic.asErasure()) ? new OfNonGenericType.Latent(TargetType.DESCRIPTION, generic.getOwnerType(), generic) : generic;
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForTypeVariableBinding extends WithoutTypeSubstitution {
                    private final Generic parameterizedType;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.parameterizedType.equals(((ForTypeVariableBinding) obj).parameterizedType);
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.parameterizedType.hashCode();
                    }

                    protected ForTypeVariableBinding(Generic generic) {
                        this.parameterizedType = generic;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public Generic onTypeVariable(Generic generic) {
                        return (Generic) generic.getTypeVariableSource().accept(new TypeVariableSubstitutor(generic));
                    }

                    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    protected class TypeVariableSubstitutor implements TypeVariableSource.Visitor<Generic> {
                        private final Generic typeVariable;

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj == null || getClass() != obj.getClass()) {
                                return false;
                            }
                            TypeVariableSubstitutor typeVariableSubstitutor = (TypeVariableSubstitutor) obj;
                            return this.typeVariable.equals(typeVariableSubstitutor.typeVariable) && ForTypeVariableBinding.this.equals(ForTypeVariableBinding.this);
                        }

                        public int hashCode() {
                            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeVariable.hashCode()) * 31) + ForTypeVariableBinding.this.hashCode();
                        }

                        protected TypeVariableSubstitutor(Generic generic) {
                            this.typeVariable = generic;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource.Visitor
                        public Generic onType(TypeDescription typeDescription) {
                            Generic findBindingOf = ForTypeVariableBinding.this.parameterizedType.findBindingOf(this.typeVariable);
                            return findBindingOf == null ? this.typeVariable.asRawType() : findBindingOf;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource.Visitor
                        public Generic onMethod(MethodDescription.InDefinedShape inDefinedShape) {
                            return ForTypeVariableBinding.this.new RetainedMethodTypeVariable(this.typeVariable);
                        }
                    }

                    protected class RetainedMethodTypeVariable extends OfTypeVariable {
                        private final Generic typeVariable;

                        protected RetainedMethodTypeVariable(Generic generic) {
                            this.typeVariable = generic;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                        public TypeList.Generic getUpperBounds() {
                            return this.typeVariable.getUpperBounds().accept(ForTypeVariableBinding.this);
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                        public TypeVariableSource getTypeVariableSource() {
                            return this.typeVariable.getTypeVariableSource();
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                        public String getSymbol() {
                            return this.typeVariable.getSymbol();
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                        public AnnotationList getDeclaredAnnotations() {
                            return this.typeVariable.getDeclaredAnnotations();
                        }
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForTokenNormalization extends Substitutor {
                    private final TypeDescription typeDescription;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.typeDescription.equals(((ForTokenNormalization) obj).typeDescription);
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeDescription.hashCode();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Generic onGenericArray(Generic generic) {
                        return super.onGenericArray(generic);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Generic onNonGenericType(Generic generic) {
                        return super.onNonGenericType(generic);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Generic onParameterizedType(Generic generic) {
                        return super.onParameterizedType(generic);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public /* bridge */ /* synthetic */ Generic onWildcard(Generic generic) {
                        return super.onWildcard(generic);
                    }

                    public ForTokenNormalization(TypeDescription typeDescription) {
                        this.typeDescription = typeDescription;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor.Substitutor
                    protected Generic onSimpleType(Generic generic) {
                        return generic.represents(TargetType.class) ? new OfNonGenericType.Latent(this.typeDescription, generic) : generic;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                    public Generic onTypeVariable(Generic generic) {
                        return new OfTypeVariable.Symbolic(generic.getSymbol(), generic);
                    }
                }
            }

            public static class ForRawType implements Visitor<Generic> {
                private final TypeDescription declaringType;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onNonGenericType(Generic generic) {
                    return generic;
                }

                public ForRawType(TypeDescription typeDescription) {
                    this.declaringType = typeDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onGenericArray(Generic generic) {
                    return this.declaringType.isGenerified() ? new OfNonGenericType.Latent(generic.asErasure(), generic) : generic;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onWildcard(Generic generic) {
                    throw new IllegalStateException("Did not expect wildcard on top-level: " + generic);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onParameterizedType(Generic generic) {
                    return this.declaringType.isGenerified() ? new OfNonGenericType.Latent(generic.asErasure(), generic) : generic;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public Generic onTypeVariable(Generic generic) {
                    return this.declaringType.isGenerified() ? new OfNonGenericType.Latent(generic.asErasure(), generic) : generic;
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class Reducing implements Visitor<TypeDescription> {
                private final TypeDescription declaringType;
                private final List<? extends TypeVariableToken> typeVariableTokens;

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    Reducing reducing = (Reducing) obj;
                    return this.declaringType.equals(reducing.declaringType) && this.typeVariableTokens.equals(reducing.typeVariableTokens);
                }

                public int hashCode() {
                    return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.declaringType.hashCode()) * 31) + this.typeVariableTokens.hashCode();
                }

                public Reducing(TypeDescription typeDescription, TypeVariableToken... typeVariableTokenArr) {
                    this(typeDescription, (List<? extends TypeVariableToken>) Arrays.asList(typeVariableTokenArr));
                }

                public Reducing(TypeDescription typeDescription, List<? extends TypeVariableToken> list) {
                    this.declaringType = typeDescription;
                    this.typeVariableTokens = list;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public TypeDescription onGenericArray(Generic generic) {
                    return TargetType.resolve(generic.asErasure(), this.declaringType);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public TypeDescription onWildcard(Generic generic) {
                    throw new IllegalStateException("A wildcard cannot be a top-level type: " + generic);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public TypeDescription onParameterizedType(Generic generic) {
                    return TargetType.resolve(generic.asErasure(), this.declaringType);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public TypeDescription onTypeVariable(Generic generic) {
                    for (TypeVariableToken typeVariableToken : this.typeVariableTokens) {
                        if (generic.getSymbol().equals(typeVariableToken.getSymbol())) {
                            return (TypeDescription) ((Generic) typeVariableToken.getBounds().get(0)).accept(this);
                        }
                    }
                    return TargetType.resolve(this.declaringType.findVariable(generic.getSymbol()).asErasure(), this.declaringType);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Visitor
                public TypeDescription onNonGenericType(Generic generic) {
                    return TargetType.resolve(generic.asErasure(), this.declaringType);
                }
            }
        }

        public interface AnnotationReader {
            public static final Dispatcher DISPATCHER = (Dispatcher) AccessController.doPrivileged(Dispatcher.CreationAction.INSTANCE);

            AnnotationList asList();

            AnnotationReader ofComponentType();

            AnnotationReader ofOuterClass();

            AnnotationReader ofOwnerType();

            AnnotationReader ofTypeArgument(int i);

            AnnotationReader ofTypeVariableBoundType(int i);

            AnnotationReader ofWildcardLowerBoundType(int i);

            AnnotationReader ofWildcardUpperBoundType(int i);

            AnnotatedElement resolve();

            public interface Dispatcher {
                public static final Object[] NO_ARGUMENTS = new Object[0];

                Generic resolve(AnnotatedElement annotatedElement);

                AnnotationReader resolveExceptionType(AccessibleObject accessibleObject, int i);

                AnnotationReader resolveFieldType(Field field);

                AnnotationReader resolveInterfaceType(Class<?> cls, int i);

                AnnotationReader resolveParameterType(AccessibleObject accessibleObject, int i);

                Generic resolveReceiverType(AccessibleObject accessibleObject);

                AnnotationReader resolveReturnType(Method method);

                AnnotationReader resolveSuperClassType(Class<?> cls);

                AnnotationReader resolveTypeVariable(TypeVariable<?> typeVariable);

                public enum CreationAction implements PrivilegedAction<Dispatcher> {
                    INSTANCE;

                    @Override // java.security.PrivilegedAction
                    public Dispatcher run() {
                        try {
                            return new ForJava8CapableVm(Class.class.getMethod("getAnnotatedSuperclass", new Class[0]), Class.class.getMethod("getAnnotatedInterfaces", new Class[0]), Field.class.getMethod("getAnnotatedType", new Class[0]), Method.class.getMethod("getAnnotatedReturnType", new Class[0]), Class.forName("java.lang.reflect.Executable").getMethod("getAnnotatedParameterTypes", new Class[0]), Class.forName("java.lang.reflect.Executable").getMethod("getAnnotatedExceptionTypes", new Class[0]), Class.forName("java.lang.reflect.Executable").getMethod("getAnnotatedReceiverType", new Class[0]), Class.forName("java.lang.reflect.AnnotatedType").getMethod("getType", new Class[0]));
                        } catch (RuntimeException e) {
                            throw e;
                        } catch (Exception unused) {
                            return ForLegacyVm.INSTANCE;
                        }
                    }
                }

                public enum ForLegacyVm implements Dispatcher {
                    INSTANCE;

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Dispatcher
                    public AnnotationReader resolveTypeVariable(TypeVariable<?> typeVariable) {
                        return NoOp.INSTANCE;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Dispatcher
                    public AnnotationReader resolveSuperClassType(Class<?> cls) {
                        return NoOp.INSTANCE;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Dispatcher
                    public AnnotationReader resolveInterfaceType(Class<?> cls, int i) {
                        return NoOp.INSTANCE;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Dispatcher
                    public AnnotationReader resolveFieldType(Field field) {
                        return NoOp.INSTANCE;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Dispatcher
                    public AnnotationReader resolveReturnType(Method method) {
                        return NoOp.INSTANCE;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Dispatcher
                    public AnnotationReader resolveParameterType(AccessibleObject accessibleObject, int i) {
                        return NoOp.INSTANCE;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Dispatcher
                    public AnnotationReader resolveExceptionType(AccessibleObject accessibleObject, int i) {
                        return NoOp.INSTANCE;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Dispatcher
                    public Generic resolveReceiverType(AccessibleObject accessibleObject) {
                        return Generic.UNDEFINED;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Dispatcher
                    public Generic resolve(AnnotatedElement annotatedElement) {
                        throw new IllegalStateException("Loaded annotated type cannot be represented on this VM");
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                public static class ForJava8CapableVm implements Dispatcher {
                    private final Method getAnnotatedExceptionTypes;
                    private final Method getAnnotatedInterfaces;
                    private final Method getAnnotatedParameterTypes;
                    private final Method getAnnotatedReceiverType;
                    private final Method getAnnotatedReturnType;
                    private final Method getAnnotatedSuperclass;
                    private final Method getAnnotatedType;
                    private final Method getType;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        ForJava8CapableVm forJava8CapableVm = (ForJava8CapableVm) obj;
                        return this.getAnnotatedSuperclass.equals(forJava8CapableVm.getAnnotatedSuperclass) && this.getAnnotatedInterfaces.equals(forJava8CapableVm.getAnnotatedInterfaces) && this.getAnnotatedType.equals(forJava8CapableVm.getAnnotatedType) && this.getAnnotatedReturnType.equals(forJava8CapableVm.getAnnotatedReturnType) && this.getAnnotatedParameterTypes.equals(forJava8CapableVm.getAnnotatedParameterTypes) && this.getAnnotatedExceptionTypes.equals(forJava8CapableVm.getAnnotatedExceptionTypes) && this.getAnnotatedReceiverType.equals(forJava8CapableVm.getAnnotatedReceiverType) && this.getType.equals(forJava8CapableVm.getType);
                    }

                    public int hashCode() {
                        return ((((((((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.getAnnotatedSuperclass.hashCode()) * 31) + this.getAnnotatedInterfaces.hashCode()) * 31) + this.getAnnotatedType.hashCode()) * 31) + this.getAnnotatedReturnType.hashCode()) * 31) + this.getAnnotatedParameterTypes.hashCode()) * 31) + this.getAnnotatedExceptionTypes.hashCode()) * 31) + this.getAnnotatedReceiverType.hashCode()) * 31) + this.getType.hashCode();
                    }

                    protected ForJava8CapableVm(Method method, Method method2, Method method3, Method method4, Method method5, Method method6, Method method7, Method method8) {
                        this.getAnnotatedSuperclass = method;
                        this.getAnnotatedInterfaces = method2;
                        this.getAnnotatedType = method3;
                        this.getAnnotatedReturnType = method4;
                        this.getAnnotatedParameterTypes = method5;
                        this.getAnnotatedExceptionTypes = method6;
                        this.getAnnotatedReceiverType = method7;
                        this.getType = method8;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Dispatcher
                    public AnnotationReader resolveTypeVariable(TypeVariable<?> typeVariable) {
                        return new AnnotatedTypeVariableType(typeVariable);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Dispatcher
                    public AnnotationReader resolveSuperClassType(Class<?> cls) {
                        return new AnnotatedSuperClass(cls);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Dispatcher
                    public AnnotationReader resolveInterfaceType(Class<?> cls, int i) {
                        return new AnnotatedInterfaceType(cls, i);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Dispatcher
                    public AnnotationReader resolveFieldType(Field field) {
                        return new AnnotatedFieldType(field);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Dispatcher
                    public AnnotationReader resolveReturnType(Method method) {
                        return new AnnotatedReturnType(method);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Dispatcher
                    public AnnotationReader resolveParameterType(AccessibleObject accessibleObject, int i) {
                        return new AnnotatedParameterizedType(accessibleObject, i);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Dispatcher
                    public AnnotationReader resolveExceptionType(AccessibleObject accessibleObject, int i) {
                        return new AnnotatedExceptionType(accessibleObject, i);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Dispatcher
                    public Generic resolveReceiverType(AccessibleObject accessibleObject) {
                        try {
                            return resolve((AnnotatedElement) this.getAnnotatedReceiverType.invoke(accessibleObject, NO_ARGUMENTS));
                        } catch (IllegalAccessException e) {
                            throw new IllegalStateException("Cannot access java.lang.reflect.Executable#getAnnotatedReceiverType", e);
                        } catch (InvocationTargetException e2) {
                            throw new IllegalStateException("Error invoking java.lang.reflect.Executable#getAnnotatedReceiverType", e2.getCause());
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Dispatcher
                    public Generic resolve(AnnotatedElement annotatedElement) {
                        Generic describe;
                        try {
                            if (annotatedElement == null) {
                                describe = Generic.UNDEFINED;
                            } else {
                                describe = TypeDefinition.Sort.describe((Type) this.getType.invoke(annotatedElement, NO_ARGUMENTS), new Resolved(annotatedElement));
                            }
                            return describe;
                        } catch (IllegalAccessException e) {
                            throw new IllegalStateException("Cannot access java.lang.reflect.AnnotatedType#getType", e);
                        } catch (InvocationTargetException e2) {
                            throw new IllegalStateException("Error invoking java.lang.reflect.AnnotatedType#getType", e2.getCause());
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    protected static class Resolved extends Delegator {
                        private final AnnotatedElement annotatedElement;

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return obj != null && getClass() == obj.getClass() && this.annotatedElement.equals(((Resolved) obj).annotatedElement);
                        }

                        public int hashCode() {
                            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.annotatedElement.hashCode();
                        }

                        protected Resolved(AnnotatedElement annotatedElement) {
                            this.annotatedElement = annotatedElement;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                        public AnnotatedElement resolve() {
                            return this.annotatedElement;
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance
                    protected static class AnnotatedTypeVariableType extends Delegator {
                        private final TypeVariable<?> typeVariable;

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            return obj != null && getClass() == obj.getClass() && this.typeVariable.equals(((AnnotatedTypeVariableType) obj).typeVariable);
                        }

                        public int hashCode() {
                            return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeVariable.hashCode();
                        }

                        protected AnnotatedTypeVariableType(TypeVariable<?> typeVariable) {
                            this.typeVariable = typeVariable;
                        }

                        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.AnnotatedElement, java.lang.reflect.TypeVariable<?>] */
                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                        public AnnotatedElement resolve() {
                            return this.typeVariable;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                        public AnnotationReader ofTypeVariableBoundType(int i) {
                            return new ForTypeVariableBoundType.OfFormalTypeVariable(this.typeVariable, i);
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    protected class AnnotatedSuperClass extends Delegator {
                        private final Class<?> type;

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj == null || getClass() != obj.getClass()) {
                                return false;
                            }
                            AnnotatedSuperClass annotatedSuperClass = (AnnotatedSuperClass) obj;
                            return this.type.equals(annotatedSuperClass.type) && ForJava8CapableVm.this.equals(ForJava8CapableVm.this);
                        }

                        public int hashCode() {
                            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.type.hashCode()) * 31) + ForJava8CapableVm.this.hashCode();
                        }

                        protected AnnotatedSuperClass(Class<?> cls) {
                            this.type = cls;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                        public AnnotatedElement resolve() {
                            try {
                                return (AnnotatedElement) ForJava8CapableVm.this.getAnnotatedSuperclass.invoke(this.type, NO_ARGUMENTS);
                            } catch (IllegalAccessException e) {
                                throw new IllegalStateException("Cannot access java.lang.Class#getAnnotatedSuperclass", e);
                            } catch (InvocationTargetException e2) {
                                throw new IllegalStateException("Error invoking java.lang.Class#getAnnotatedSuperclass", e2.getCause());
                            }
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    protected class AnnotatedInterfaceType extends Delegator {
                        private final int index;
                        private final Class<?> type;

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj == null || getClass() != obj.getClass()) {
                                return false;
                            }
                            AnnotatedInterfaceType annotatedInterfaceType = (AnnotatedInterfaceType) obj;
                            return this.type.equals(annotatedInterfaceType.type) && this.index == annotatedInterfaceType.index && ForJava8CapableVm.this.equals(ForJava8CapableVm.this);
                        }

                        public int hashCode() {
                            return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.type.hashCode()) * 31) + this.index) * 31) + ForJava8CapableVm.this.hashCode();
                        }

                        protected AnnotatedInterfaceType(Class<?> cls, int i) {
                            this.type = cls;
                            this.index = i;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                        public AnnotatedElement resolve() {
                            try {
                                return (AnnotatedElement) Array.get(ForJava8CapableVm.this.getAnnotatedInterfaces.invoke(this.type, new Object[0]), this.index);
                            } catch (IllegalAccessException e) {
                                throw new IllegalStateException("Cannot access java.lang.Class#getAnnotatedInterfaces", e);
                            } catch (InvocationTargetException e2) {
                                throw new IllegalStateException("Error invoking java.lang.Class#getAnnotatedInterfaces", e2.getCause());
                            }
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    protected class AnnotatedFieldType extends Delegator {
                        private final Field field;

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj == null || getClass() != obj.getClass()) {
                                return false;
                            }
                            AnnotatedFieldType annotatedFieldType = (AnnotatedFieldType) obj;
                            return this.field.equals(annotatedFieldType.field) && ForJava8CapableVm.this.equals(ForJava8CapableVm.this);
                        }

                        public int hashCode() {
                            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.field.hashCode()) * 31) + ForJava8CapableVm.this.hashCode();
                        }

                        protected AnnotatedFieldType(Field field) {
                            this.field = field;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                        public AnnotatedElement resolve() {
                            try {
                                return (AnnotatedElement) ForJava8CapableVm.this.getAnnotatedType.invoke(this.field, NO_ARGUMENTS);
                            } catch (IllegalAccessException e) {
                                throw new IllegalStateException("Cannot access java.lang.reflect.Field#getAnnotatedType", e);
                            } catch (InvocationTargetException e2) {
                                throw new IllegalStateException("Error invoking java.lang.reflect.Field#getAnnotatedType", e2.getCause());
                            }
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    protected class AnnotatedReturnType extends Delegator {
                        private final Method method;

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj == null || getClass() != obj.getClass()) {
                                return false;
                            }
                            AnnotatedReturnType annotatedReturnType = (AnnotatedReturnType) obj;
                            return this.method.equals(annotatedReturnType.method) && ForJava8CapableVm.this.equals(ForJava8CapableVm.this);
                        }

                        public int hashCode() {
                            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.method.hashCode()) * 31) + ForJava8CapableVm.this.hashCode();
                        }

                        protected AnnotatedReturnType(Method method) {
                            this.method = method;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                        public AnnotatedElement resolve() {
                            try {
                                return (AnnotatedElement) ForJava8CapableVm.this.getAnnotatedReturnType.invoke(this.method, NO_ARGUMENTS);
                            } catch (IllegalAccessException e) {
                                throw new IllegalStateException("Cannot access java.lang.reflect.Method#getAnnotatedReturnType", e);
                            } catch (InvocationTargetException e2) {
                                throw new IllegalStateException("Error invoking java.lang.reflect.Method#getAnnotatedReturnType", e2.getCause());
                            }
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    protected class AnnotatedParameterizedType extends Delegator {
                        private final AccessibleObject executable;
                        private final int index;

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj == null || getClass() != obj.getClass()) {
                                return false;
                            }
                            AnnotatedParameterizedType annotatedParameterizedType = (AnnotatedParameterizedType) obj;
                            return this.executable.equals(annotatedParameterizedType.executable) && this.index == annotatedParameterizedType.index && ForJava8CapableVm.this.equals(ForJava8CapableVm.this);
                        }

                        public int hashCode() {
                            return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.executable.hashCode()) * 31) + this.index) * 31) + ForJava8CapableVm.this.hashCode();
                        }

                        protected AnnotatedParameterizedType(AccessibleObject accessibleObject, int i) {
                            this.executable = accessibleObject;
                            this.index = i;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                        public AnnotatedElement resolve() {
                            try {
                                return (AnnotatedElement) Array.get(ForJava8CapableVm.this.getAnnotatedParameterTypes.invoke(this.executable, NO_ARGUMENTS), this.index);
                            } catch (IllegalAccessException e) {
                                throw new IllegalStateException("Cannot access java.lang.reflect.Executable#getAnnotatedParameterTypes", e);
                            } catch (InvocationTargetException e2) {
                                throw new IllegalStateException("Error invoking java.lang.reflect.Executable#getAnnotatedParameterTypes", e2.getCause());
                            }
                        }
                    }

                    @HashCodeAndEqualsPlugin.Enhance(includeSyntheticFields = true)
                    protected class AnnotatedExceptionType extends Delegator {
                        private final AccessibleObject executable;
                        private final int index;

                        public boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (obj == null || getClass() != obj.getClass()) {
                                return false;
                            }
                            AnnotatedExceptionType annotatedExceptionType = (AnnotatedExceptionType) obj;
                            return this.executable.equals(annotatedExceptionType.executable) && this.index == annotatedExceptionType.index && ForJava8CapableVm.this.equals(ForJava8CapableVm.this);
                        }

                        public int hashCode() {
                            return ((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.executable.hashCode()) * 31) + this.index) * 31) + ForJava8CapableVm.this.hashCode();
                        }

                        protected AnnotatedExceptionType(AccessibleObject accessibleObject, int i) {
                            this.executable = accessibleObject;
                            this.index = i;
                        }

                        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                        public AnnotatedElement resolve() {
                            try {
                                return (AnnotatedElement) Array.get(ForJava8CapableVm.this.getAnnotatedExceptionTypes.invoke(this.executable, NO_ARGUMENTS), this.index);
                            } catch (IllegalAccessException e) {
                                throw new IllegalStateException("Cannot access java.lang.reflect.Executable#getAnnotatedExceptionTypes", e);
                            } catch (InvocationTargetException e2) {
                                throw new IllegalStateException("Error invoking java.lang.reflect.Executable#getAnnotatedExceptionTypes", e2.getCause());
                            }
                        }
                    }
                }
            }

            public enum NoOp implements AnnotationReader, AnnotatedElement {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public AnnotationReader ofComponentType() {
                    return this;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public AnnotationReader ofOuterClass() {
                    return this;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public AnnotationReader ofOwnerType() {
                    return this;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public AnnotationReader ofTypeArgument(int i) {
                    return this;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public AnnotationReader ofTypeVariableBoundType(int i) {
                    return this;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public AnnotationReader ofWildcardLowerBoundType(int i) {
                    return this;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public AnnotationReader ofWildcardUpperBoundType(int i) {
                    return this;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public AnnotatedElement resolve() {
                    return this;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public AnnotationList asList() {
                    return new AnnotationList.Empty();
                }

                @Override // java.lang.reflect.AnnotatedElement
                public boolean isAnnotationPresent(Class<? extends Annotation> cls) {
                    throw new IllegalStateException("Cannot resolve annotations for no-op reader: " + this);
                }

                @Override // java.lang.reflect.AnnotatedElement
                public <T extends Annotation> T getAnnotation(Class<T> cls) {
                    throw new IllegalStateException("Cannot resolve annotations for no-op reader: " + this);
                }

                @Override // java.lang.reflect.AnnotatedElement
                public Annotation[] getAnnotations() {
                    throw new IllegalStateException("Cannot resolve annotations for no-op reader: " + this);
                }

                @Override // java.lang.reflect.AnnotatedElement
                public Annotation[] getDeclaredAnnotations() {
                    return new Annotation[0];
                }
            }

            public static abstract class Delegator implements AnnotationReader {
                protected static final Object[] NO_ARGUMENTS = new Object[0];

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public AnnotationReader ofWildcardUpperBoundType(int i) {
                    return new ForWildcardUpperBoundType(this, i);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public AnnotationReader ofWildcardLowerBoundType(int i) {
                    return new ForWildcardLowerBoundType(this, i);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public AnnotationReader ofTypeVariableBoundType(int i) {
                    return new ForTypeVariableBoundType(this, i);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public AnnotationReader ofTypeArgument(int i) {
                    return new ForTypeArgument(this, i);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public AnnotationReader ofOwnerType() {
                    return ForOwnerType.of(this);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public AnnotationReader ofOuterClass() {
                    return ForOwnerType.of(this);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public AnnotationReader ofComponentType() {
                    return new ForComponentType(this);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public AnnotationList asList() {
                    return new AnnotationList.ForLoadedAnnotations(resolve().getDeclaredAnnotations());
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static abstract class Chained extends Delegator {
                    protected static final Method NOT_AVAILABLE = null;
                    protected final AnnotationReader annotationReader;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return obj != null && getClass() == obj.getClass() && this.annotationReader.equals(((Chained) obj).annotationReader);
                    }

                    public int hashCode() {
                        return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.annotationReader.hashCode();
                    }

                    protected abstract AnnotatedElement resolve(AnnotatedElement annotatedElement);

                    protected Chained(AnnotationReader annotationReader) {
                        this.annotationReader = annotationReader;
                    }

                    protected static Method of(String str, String str2) {
                        try {
                            return Class.forName(str).getMethod(str2, new Class[0]);
                        } catch (Exception unused) {
                            return NOT_AVAILABLE;
                        }
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                    public AnnotatedElement resolve() {
                        return resolve(this.annotationReader.resolve());
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForWildcardUpperBoundType extends Delegator.Chained {
                private static final Method GET_ANNOTATED_UPPER_BOUNDS = of("java.lang.reflect.AnnotatedWildcardType", "getAnnotatedUpperBounds");
                private final int index;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
                public boolean equals(Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.index == ((ForWildcardUpperBoundType) obj).index;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
                public int hashCode() {
                    return (super.hashCode() * 31) + this.index;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public /* bridge */ /* synthetic */ AnnotatedElement resolve() {
                    return super.resolve();
                }

                protected ForWildcardUpperBoundType(AnnotationReader annotationReader, int i) {
                    super(annotationReader);
                    this.index = i;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
                protected AnnotatedElement resolve(AnnotatedElement annotatedElement) {
                    try {
                        Object invoke = GET_ANNOTATED_UPPER_BOUNDS.invoke(annotatedElement, NO_ARGUMENTS);
                        return Array.getLength(invoke) == 0 ? NoOp.INSTANCE : (AnnotatedElement) Array.get(invoke, this.index);
                    } catch (ClassCastException unused) {
                        return NoOp.INSTANCE;
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.reflect.AnnotatedWildcardType#getAnnotatedUpperBounds", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.reflect.AnnotatedWildcardType#getAnnotatedUpperBounds", e2.getCause());
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForWildcardLowerBoundType extends Delegator.Chained {
                private static final Method GET_ANNOTATED_LOWER_BOUNDS = of("java.lang.reflect.AnnotatedWildcardType", "getAnnotatedLowerBounds");
                private final int index;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
                public boolean equals(Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.index == ((ForWildcardLowerBoundType) obj).index;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
                public int hashCode() {
                    return (super.hashCode() * 31) + this.index;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public /* bridge */ /* synthetic */ AnnotatedElement resolve() {
                    return super.resolve();
                }

                protected ForWildcardLowerBoundType(AnnotationReader annotationReader, int i) {
                    super(annotationReader);
                    this.index = i;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
                protected AnnotatedElement resolve(AnnotatedElement annotatedElement) {
                    try {
                        return (AnnotatedElement) Array.get(GET_ANNOTATED_LOWER_BOUNDS.invoke(annotatedElement, NO_ARGUMENTS), this.index);
                    } catch (ClassCastException unused) {
                        return NoOp.INSTANCE;
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.reflect.AnnotatedWildcardType#getAnnotatedLowerBounds", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.reflect.AnnotatedWildcardType#getAnnotatedLowerBounds", e2.getCause());
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForTypeVariableBoundType extends Delegator.Chained {
                private static final Method GET_ANNOTATED_BOUNDS = of("java.lang.reflect.AnnotatedTypeVariable", "getAnnotatedBounds");
                private final int index;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
                public boolean equals(Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.index == ((ForTypeVariableBoundType) obj).index;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
                public int hashCode() {
                    return (super.hashCode() * 31) + this.index;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public /* bridge */ /* synthetic */ AnnotatedElement resolve() {
                    return super.resolve();
                }

                protected ForTypeVariableBoundType(AnnotationReader annotationReader, int i) {
                    super(annotationReader);
                    this.index = i;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
                protected AnnotatedElement resolve(AnnotatedElement annotatedElement) {
                    try {
                        return (AnnotatedElement) Array.get(GET_ANNOTATED_BOUNDS.invoke(annotatedElement, NO_ARGUMENTS), this.index);
                    } catch (ClassCastException unused) {
                        return NoOp.INSTANCE;
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.reflect.AnnotatedTypeVariable#getAnnotatedBounds", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.reflect.AnnotatedTypeVariable#getAnnotatedBounds", e2.getCause());
                    }
                }

                @HashCodeAndEqualsPlugin.Enhance
                protected static class OfFormalTypeVariable extends Delegator {
                    private static final Method GET_ANNOTATED_BOUNDS = Delegator.Chained.of(TypeVariable.class.getName(), "getAnnotatedBounds");
                    private final int index;
                    private final TypeVariable<?> typeVariable;

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (obj == null || getClass() != obj.getClass()) {
                            return false;
                        }
                        OfFormalTypeVariable ofFormalTypeVariable = (OfFormalTypeVariable) obj;
                        return this.typeVariable.equals(ofFormalTypeVariable.typeVariable) && this.index == ofFormalTypeVariable.index;
                    }

                    public int hashCode() {
                        return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.typeVariable.hashCode()) * 31) + this.index;
                    }

                    protected OfFormalTypeVariable(TypeVariable<?> typeVariable, int i) {
                        this.typeVariable = typeVariable;
                        this.index = i;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                    public AnnotatedElement resolve() {
                        try {
                            return (AnnotatedElement) Array.get(GET_ANNOTATED_BOUNDS.invoke(this.typeVariable, NO_ARGUMENTS), this.index);
                        } catch (ClassCastException unused) {
                            return NoOp.INSTANCE;
                        } catch (IllegalAccessException e) {
                            throw new IllegalStateException("Cannot access java.lang.reflect.TypeVariable#getAnnotatedBounds", e);
                        } catch (InvocationTargetException e2) {
                            throw new IllegalStateException("Error invoking java.lang.reflect.TypeVariable#getAnnotatedBounds", e2.getCause());
                        }
                    }
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            public static class ForTypeArgument extends Delegator.Chained {
                private static final Method GET_ANNOTATED_ACTUAL_TYPE_ARGUMENTS = of("java.lang.reflect.AnnotatedParameterizedType", "getAnnotatedActualTypeArguments");
                private final int index;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
                public boolean equals(Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.index == ((ForTypeArgument) obj).index;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
                public int hashCode() {
                    return (super.hashCode() * 31) + this.index;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public /* bridge */ /* synthetic */ AnnotatedElement resolve() {
                    return super.resolve();
                }

                protected ForTypeArgument(AnnotationReader annotationReader, int i) {
                    super(annotationReader);
                    this.index = i;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
                protected AnnotatedElement resolve(AnnotatedElement annotatedElement) {
                    try {
                        return (AnnotatedElement) Array.get(GET_ANNOTATED_ACTUAL_TYPE_ARGUMENTS.invoke(annotatedElement, NO_ARGUMENTS), this.index);
                    } catch (ClassCastException unused) {
                        return NoOp.INSTANCE;
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.reflect.AnnotatedParameterizedType#getAnnotatedActualTypeArguments", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.reflect.AnnotatedParameterizedType#getAnnotatedActualTypeArguments", e2.getCause());
                    }
                }
            }

            public static class ForComponentType extends Delegator.Chained {
                private static final Method GET_ANNOTATED_GENERIC_COMPONENT_TYPE = of("java.lang.reflect.AnnotatedArrayType", "getAnnotatedGenericComponentType");

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public /* bridge */ /* synthetic */ AnnotatedElement resolve() {
                    return super.resolve();
                }

                protected ForComponentType(AnnotationReader annotationReader) {
                    super(annotationReader);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
                protected AnnotatedElement resolve(AnnotatedElement annotatedElement) {
                    try {
                        return (AnnotatedElement) GET_ANNOTATED_GENERIC_COMPONENT_TYPE.invoke(annotatedElement, NO_ARGUMENTS);
                    } catch (ClassCastException unused) {
                        return NoOp.INSTANCE;
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.reflect.AnnotatedArrayType#getAnnotatedGenericComponentType", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.reflect.AnnotatedArrayType#getAnnotatedGenericComponentType", e2.getCause());
                    }
                }
            }

            public static class ForOwnerType extends Delegator.Chained {
                private static final Method GET_ANNOTATED_OWNER_TYPE = of("java.lang.reflect.AnnotatedType", "getAnnotatedOwnerType");

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader
                public /* bridge */ /* synthetic */ AnnotatedElement resolve() {
                    return super.resolve();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static AnnotationReader of(AnnotationReader annotationReader) {
                    return GET_ANNOTATED_OWNER_TYPE == null ? NoOp.INSTANCE : new ForOwnerType(annotationReader);
                }

                protected ForOwnerType(AnnotationReader annotationReader) {
                    super(annotationReader);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AnnotationReader.Delegator.Chained
                protected AnnotatedElement resolve(AnnotatedElement annotatedElement) {
                    try {
                        AnnotatedElement annotatedElement2 = (AnnotatedElement) GET_ANNOTATED_OWNER_TYPE.invoke(annotatedElement, NO_ARGUMENTS);
                        return annotatedElement2 == null ? NoOp.INSTANCE : annotatedElement2;
                    } catch (ClassCastException unused) {
                        return NoOp.INSTANCE;
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Cannot access java.lang.reflect.AnnotatedType#getAnnotatedOwnerType", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Error invoking java.lang.reflect.AnnotatedType#getAnnotatedOwnerType", e2.getCause());
                    }
                }
            }
        }

        public static abstract class AbstractBase extends ModifierReviewable.AbstractBase implements Generic {
            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public Generic asGenericType() {
                return this;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
            public int getModifiers() {
                return asErasure().getModifiers();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public Generic asRawType() {
                return asErasure().asGenericType();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public boolean represents(Type type) {
                return equals(TypeDefinition.Sort.describe(type));
            }
        }

        public static abstract class OfNonGenericType extends AbstractBase {
            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public TypeDefinition.Sort getSort() {
                return TypeDefinition.Sort.NON_GENERIC;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public Generic getSuperClass() {
                TypeDescription asErasure = asErasure();
                Generic superClass = asErasure.getSuperClass();
                return AbstractBase.RAW_TYPES ? superClass : superClass == null ? Generic.UNDEFINED : new LazyProjection.WithResolvedErasure(superClass, new Visitor.ForRawType(asErasure), AnnotationSource.Empty.INSTANCE);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public TypeList.Generic getInterfaces() {
                TypeDescription asErasure = asErasure();
                if (AbstractBase.RAW_TYPES) {
                    return asErasure.getInterfaces();
                }
                return new TypeList.Generic.ForDetachedTypes.WithResolvedErasure(asErasure.getInterfaces(), new Visitor.ForRawType(asErasure));
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public FieldList<FieldDescription.InGenericShape> getDeclaredFields() {
                TypeDescription asErasure = asErasure();
                return new FieldList.TypeSubstituting(this, asErasure.getDeclaredFields(), AbstractBase.RAW_TYPES ? Visitor.NoOp.INSTANCE : new Visitor.ForRawType(asErasure));
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public MethodList<MethodDescription.InGenericShape> getDeclaredMethods() {
                TypeDescription asErasure = asErasure();
                return new MethodList.TypeSubstituting(this, asErasure.getDeclaredMethods(), AbstractBase.RAW_TYPES ? Visitor.NoOp.INSTANCE : new Visitor.ForRawType(asErasure));
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public TypeList.Generic getTypeArguments() {
                throw new IllegalStateException("A non-generic type does not imply type arguments: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public Generic findBindingOf(Generic generic) {
                throw new IllegalStateException("A non-generic type does not imply type arguments: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public <T> T accept(Visitor<T> visitor) {
                return visitor.onNonGenericType(this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public String getTypeName() {
                return asErasure().getTypeName();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public TypeList.Generic getUpperBounds() {
                throw new IllegalStateException("A non-generic type does not imply upper type bounds: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public TypeList.Generic getLowerBounds() {
                throw new IllegalStateException("A non-generic type does not imply lower type bounds: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public TypeVariableSource getTypeVariableSource() {
                throw new IllegalStateException("A non-generic type does not imply a type variable source: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public String getSymbol() {
                throw new IllegalStateException("A non-generic type does not imply a symbol: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public StackSize getStackSize() {
                return asErasure().getStackSize();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.NamedElement
            public String getActualName() {
                return asErasure().getActualName();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public boolean isArray() {
                return asErasure().isArray();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public boolean isPrimitive() {
                return asErasure().isPrimitive();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public boolean represents(Type type) {
                return asErasure().represents(type);
            }

            @Override // java.lang.Iterable
            public Iterator<TypeDefinition> iterator() {
                return new TypeDefinition.SuperClassIterator(this);
            }

            public int hashCode() {
                return asErasure().hashCode();
            }

            public boolean equals(Object obj) {
                return this == obj || asErasure().equals(obj);
            }

            public String toString() {
                return asErasure().toString();
            }

            public static class ForLoadedType extends OfNonGenericType {
                private static final Map<Class<?>, Generic> TYPE_CACHE;
                private final AnnotationReader annotationReader;
                private final Class<?> type;

                static {
                    HashMap hashMap = new HashMap();
                    TYPE_CACHE = hashMap;
                    hashMap.put(TargetType.class, new ForLoadedType(TargetType.class));
                    hashMap.put(Object.class, new ForLoadedType(Object.class));
                    hashMap.put(String.class, new ForLoadedType(String.class));
                    hashMap.put(Boolean.class, new ForLoadedType(Boolean.class));
                    hashMap.put(Byte.class, new ForLoadedType(Byte.class));
                    hashMap.put(Short.class, new ForLoadedType(Short.class));
                    hashMap.put(Character.class, new ForLoadedType(Character.class));
                    hashMap.put(Integer.class, new ForLoadedType(Integer.class));
                    hashMap.put(Long.class, new ForLoadedType(Long.class));
                    hashMap.put(Float.class, new ForLoadedType(Float.class));
                    hashMap.put(Double.class, new ForLoadedType(Double.class));
                    hashMap.put(Void.TYPE, new ForLoadedType(Void.TYPE));
                    hashMap.put(Boolean.TYPE, new ForLoadedType(Boolean.TYPE));
                    hashMap.put(Byte.TYPE, new ForLoadedType(Byte.TYPE));
                    hashMap.put(Short.TYPE, new ForLoadedType(Short.TYPE));
                    hashMap.put(Character.TYPE, new ForLoadedType(Character.TYPE));
                    hashMap.put(Integer.TYPE, new ForLoadedType(Integer.TYPE));
                    hashMap.put(Long.TYPE, new ForLoadedType(Long.TYPE));
                    hashMap.put(Float.TYPE, new ForLoadedType(Float.TYPE));
                    hashMap.put(Double.TYPE, new ForLoadedType(Double.TYPE));
                }

                public ForLoadedType(Class<?> cls) {
                    this(cls, AnnotationReader.NoOp.INSTANCE);
                }

                protected ForLoadedType(Class<?> cls, AnnotationReader annotationReader) {
                    this.type = cls;
                    this.annotationReader = annotationReader;
                }

                public static Generic of(Class<?> cls) {
                    Generic generic = TYPE_CACHE.get(cls);
                    return generic == null ? new ForLoadedType(cls) : generic;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public TypeDescription asErasure() {
                    return ForLoadedType.of(this.type);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public Generic getOwnerType() {
                    Class<?> declaringClass = this.type.getDeclaringClass();
                    if (declaringClass == null) {
                        return Generic.UNDEFINED;
                    }
                    return new ForLoadedType(declaringClass, this.annotationReader.ofOuterClass());
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public Generic getComponentType() {
                    Class<?> componentType = this.type.getComponentType();
                    if (componentType == null) {
                        return Generic.UNDEFINED;
                    }
                    return new ForLoadedType(componentType, this.annotationReader.ofComponentType());
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return this.annotationReader.asList();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public boolean represents(Type type) {
                    return this.type == type || super.represents(type);
                }
            }

            public static class ForErasure extends OfNonGenericType {
                private final TypeDescription typeDescription;

                public ForErasure(TypeDescription typeDescription) {
                    this.typeDescription = typeDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public TypeDescription asErasure() {
                    return this.typeDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public Generic getOwnerType() {
                    TypeDescription declaringType = this.typeDescription.getDeclaringType();
                    if (declaringType == null) {
                        return Generic.UNDEFINED;
                    }
                    return declaringType.asGenericType();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public Generic getComponentType() {
                    TypeDescription componentType = this.typeDescription.getComponentType();
                    if (componentType == null) {
                        return Generic.UNDEFINED;
                    }
                    return componentType.asGenericType();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return new AnnotationList.Empty();
                }
            }

            public static class Latent extends OfNonGenericType {
                private final AnnotationSource annotationSource;
                private final Generic declaringType;
                private final TypeDescription typeDescription;

                public Latent(TypeDescription typeDescription, AnnotationSource annotationSource) {
                    this(typeDescription, typeDescription.getDeclaringType(), annotationSource);
                }

                /* JADX WARN: Illegal instructions before constructor call */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private Latent(TypeDescription typeDescription, TypeDescription typeDescription2, AnnotationSource annotationSource) {
                    this(typeDescription, r2, annotationSource);
                    Generic asGenericType;
                    if (typeDescription2 == null) {
                        asGenericType = Generic.UNDEFINED;
                    } else {
                        asGenericType = typeDescription2.asGenericType();
                    }
                }

                protected Latent(TypeDescription typeDescription, Generic generic, AnnotationSource annotationSource) {
                    this.typeDescription = typeDescription;
                    this.declaringType = generic;
                    this.annotationSource = annotationSource;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public Generic getOwnerType() {
                    return this.declaringType;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public Generic getComponentType() {
                    TypeDescription componentType = this.typeDescription.getComponentType();
                    if (componentType == null) {
                        return Generic.UNDEFINED;
                    }
                    return componentType.asGenericType();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return this.annotationSource.getDeclaredAnnotations();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public TypeDescription asErasure() {
                    return this.typeDescription;
                }
            }

            public static class ForReifiedErasure extends OfNonGenericType {
                private final TypeDescription typeDescription;

                protected ForReifiedErasure(TypeDescription typeDescription) {
                    this.typeDescription = typeDescription;
                }

                protected static Generic of(TypeDescription typeDescription) {
                    return typeDescription.isGenerified() ? new ForReifiedErasure(typeDescription) : new ForErasure(typeDescription);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public Generic getSuperClass() {
                    Generic superClass = this.typeDescription.getSuperClass();
                    return superClass == null ? Generic.UNDEFINED : new LazyProjection.WithResolvedErasure(superClass, Visitor.Reifying.INHERITING);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public TypeList.Generic getInterfaces() {
                    return new TypeList.Generic.ForDetachedTypes.WithResolvedErasure(this.typeDescription.getInterfaces(), Visitor.Reifying.INHERITING);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public FieldList<FieldDescription.InGenericShape> getDeclaredFields() {
                    return new FieldList.TypeSubstituting(this, this.typeDescription.getDeclaredFields(), Visitor.TypeErasing.INSTANCE);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.OfNonGenericType, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public MethodList<MethodDescription.InGenericShape> getDeclaredMethods() {
                    return new MethodList.TypeSubstituting(this, this.typeDescription.getDeclaredMethods(), Visitor.TypeErasing.INSTANCE);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public TypeDescription asErasure() {
                    return this.typeDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public Generic getOwnerType() {
                    TypeDescription declaringType = this.typeDescription.getDeclaringType();
                    if (declaringType == null) {
                        return Generic.UNDEFINED;
                    }
                    return of(declaringType);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public Generic getComponentType() {
                    TypeDescription componentType = this.typeDescription.getComponentType();
                    if (componentType == null) {
                        return Generic.UNDEFINED;
                    }
                    return of(componentType);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return new AnnotationList.Empty();
                }
            }
        }

        public static abstract class OfGenericArray extends AbstractBase {
            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public boolean isArray() {
                return true;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public boolean isPrimitive() {
                return false;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public TypeDefinition.Sort getSort() {
                return getComponentType().getSort().isNonGeneric() ? TypeDefinition.Sort.NON_GENERIC : TypeDefinition.Sort.GENERIC_ARRAY;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public TypeDescription asErasure() {
                return ArrayProjection.of(getComponentType().asErasure(), 1);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public Generic getSuperClass() {
                return Generic.OBJECT;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public TypeList.Generic getInterfaces() {
                return TypeDescription.ARRAY_INTERFACES;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public FieldList<FieldDescription.InGenericShape> getDeclaredFields() {
                return new FieldList.Empty();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public MethodList<MethodDescription.InGenericShape> getDeclaredMethods() {
                return new MethodList.Empty();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public TypeList.Generic getUpperBounds() {
                throw new IllegalStateException("A generic array type does not imply upper type bounds: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public TypeList.Generic getLowerBounds() {
                throw new IllegalStateException("A generic array type does not imply lower type bounds: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public TypeVariableSource getTypeVariableSource() {
                throw new IllegalStateException("A generic array type does not imply a type variable source: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public TypeList.Generic getTypeArguments() {
                throw new IllegalStateException("A generic array type does not imply type arguments: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public Generic findBindingOf(Generic generic) {
                throw new IllegalStateException("A generic array type does not imply type arguments: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public Generic getOwnerType() {
                return Generic.UNDEFINED;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public String getSymbol() {
                throw new IllegalStateException("A generic array type does not imply a symbol: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public String getTypeName() {
                if (getSort().isNonGeneric()) {
                    return asErasure().getTypeName();
                }
                return toString();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.NamedElement
            public String getActualName() {
                if (getSort().isNonGeneric()) {
                    return asErasure().getActualName();
                }
                return toString();
            }

            @Override // java.lang.Iterable
            public Iterator<TypeDefinition> iterator() {
                return new TypeDefinition.SuperClassIterator(this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public <T> T accept(Visitor<T> visitor) {
                if (getSort().isNonGeneric()) {
                    return visitor.onNonGenericType(this);
                }
                return visitor.onGenericArray(this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public StackSize getStackSize() {
                return StackSize.SINGLE;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (getSort().isNonGeneric()) {
                    return asErasure().equals(obj);
                }
                if (!(obj instanceof Generic)) {
                    return false;
                }
                Generic generic = (Generic) obj;
                return generic.getSort().isGenericArray() && getComponentType().equals(generic.getComponentType());
            }

            public int hashCode() {
                if (getSort().isNonGeneric()) {
                    return asErasure().hashCode();
                }
                return getComponentType().hashCode();
            }

            public String toString() {
                if (getSort().isNonGeneric()) {
                    return asErasure().toString();
                }
                return getComponentType().getTypeName() + "[]";
            }

            public static class ForLoadedType extends OfGenericArray {
                private final AnnotationReader annotationReader;
                private final GenericArrayType genericArrayType;

                public ForLoadedType(GenericArrayType genericArrayType) {
                    this(genericArrayType, AnnotationReader.NoOp.INSTANCE);
                }

                protected ForLoadedType(GenericArrayType genericArrayType, AnnotationReader annotationReader) {
                    this.genericArrayType = genericArrayType;
                    this.annotationReader = annotationReader;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public Generic getComponentType() {
                    return TypeDefinition.Sort.describe(this.genericArrayType.getGenericComponentType(), this.annotationReader.ofComponentType());
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return this.annotationReader.asList();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public boolean represents(Type type) {
                    return this.genericArrayType == type || super.represents(type);
                }
            }

            public static class Latent extends OfGenericArray {
                private final AnnotationSource annotationSource;
                private final Generic componentType;

                public Latent(Generic generic, AnnotationSource annotationSource) {
                    this.componentType = generic;
                    this.annotationSource = annotationSource;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public Generic getComponentType() {
                    return this.componentType;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return this.annotationSource.getDeclaredAnnotations();
                }
            }
        }

        public static abstract class OfWildcardType extends AbstractBase {
            public static final String SYMBOL = "?";

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public boolean isArray() {
                return false;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public boolean isPrimitive() {
                return false;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public TypeDefinition.Sort getSort() {
                return TypeDefinition.Sort.WILDCARD;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public TypeDescription asErasure() {
                throw new IllegalStateException("A wildcard does not represent an erasable type: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public Generic getSuperClass() {
                throw new IllegalStateException("A wildcard does not imply a super type definition: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public TypeList.Generic getInterfaces() {
                throw new IllegalStateException("A wildcard does not imply an interface type definition: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public FieldList<FieldDescription.InGenericShape> getDeclaredFields() {
                throw new IllegalStateException("A wildcard does not imply field definitions: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public MethodList<MethodDescription.InGenericShape> getDeclaredMethods() {
                throw new IllegalStateException("A wildcard does not imply method definitions: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public Generic getComponentType() {
                throw new IllegalStateException("A wildcard does not imply a component type: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public TypeVariableSource getTypeVariableSource() {
                throw new IllegalStateException("A wildcard does not imply a type variable source: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public TypeList.Generic getTypeArguments() {
                throw new IllegalStateException("A wildcard does not imply type arguments: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public Generic findBindingOf(Generic generic) {
                throw new IllegalStateException("A wildcard does not imply type arguments: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public Generic getOwnerType() {
                throw new IllegalStateException("A wildcard does not imply an owner type: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public String getSymbol() {
                throw new IllegalStateException("A wildcard does not imply a symbol: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public String getTypeName() {
                return toString();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.NamedElement
            public String getActualName() {
                return toString();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public boolean represents(Type type) {
                return equals(TypeDefinition.Sort.describe(type));
            }

            @Override // java.lang.Iterable
            public Iterator<TypeDefinition> iterator() {
                throw new IllegalStateException("A wildcard does not imply a super type definition: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public <T> T accept(Visitor<T> visitor) {
                return visitor.onWildcard(this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public StackSize getStackSize() {
                throw new IllegalStateException("A wildcard does not imply an operand stack size: " + this);
            }

            public int hashCode() {
                Iterator it = getLowerBounds().iterator();
                int i = 1;
                int i2 = 1;
                while (it.hasNext()) {
                    i2 = (i2 * 31) + ((Generic) it.next()).hashCode();
                }
                Iterator it2 = getUpperBounds().iterator();
                while (it2.hasNext()) {
                    i = (i * 31) + ((Generic) it2.next()).hashCode();
                }
                return i2 ^ i;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Generic)) {
                    return false;
                }
                Generic generic = (Generic) obj;
                return generic.getSort().isWildcard() && getUpperBounds().equals(generic.getUpperBounds()) && getLowerBounds().equals(generic.getLowerBounds());
            }

            public String toString() {
                StringBuilder sb = new StringBuilder(SYMBOL);
                TypeList.Generic lowerBounds = getLowerBounds();
                if (!lowerBounds.isEmpty()) {
                    sb.append(" super ");
                } else {
                    lowerBounds = getUpperBounds();
                    if (lowerBounds.getOnly().equals(Generic.OBJECT)) {
                        return SYMBOL;
                    }
                    sb.append(" extends ");
                }
                return sb.append(lowerBounds.getOnly().getTypeName()).toString();
            }

            public static class ForLoadedType extends OfWildcardType {
                private final AnnotationReader annotationReader;
                private final WildcardType wildcardType;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.OfWildcardType, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public /* bridge */ /* synthetic */ TypeDefinition getComponentType() {
                    return super.getComponentType();
                }

                public ForLoadedType(WildcardType wildcardType) {
                    this(wildcardType, AnnotationReader.NoOp.INSTANCE);
                }

                protected ForLoadedType(WildcardType wildcardType, AnnotationReader annotationReader) {
                    this.wildcardType = wildcardType;
                    this.annotationReader = annotationReader;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public TypeList.Generic getUpperBounds() {
                    return new WildcardUpperBoundTypeList(this.wildcardType.getUpperBounds(), this.annotationReader);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public TypeList.Generic getLowerBounds() {
                    return new WildcardLowerBoundTypeList(this.wildcardType.getLowerBounds(), this.annotationReader);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return this.annotationReader.asList();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.OfWildcardType, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public boolean represents(Type type) {
                    return this.wildcardType == type || super.represents(type);
                }

                protected static class WildcardUpperBoundTypeList extends TypeList.Generic.AbstractBase {
                    private final AnnotationReader annotationReader;
                    private final Type[] upperBound;

                    protected WildcardUpperBoundTypeList(Type[] typeArr, AnnotationReader annotationReader) {
                        this.upperBound = typeArr;
                        this.annotationReader = annotationReader;
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public Generic get(int i) {
                        return TypeDefinition.Sort.describe(this.upperBound[i], this.annotationReader.ofWildcardUpperBoundType(i));
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                        return this.upperBound.length;
                    }
                }

                protected static class WildcardLowerBoundTypeList extends TypeList.Generic.AbstractBase {
                    private final AnnotationReader annotationReader;
                    private final Type[] lowerBound;

                    protected WildcardLowerBoundTypeList(Type[] typeArr, AnnotationReader annotationReader) {
                        this.lowerBound = typeArr;
                        this.annotationReader = annotationReader;
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public Generic get(int i) {
                        return TypeDefinition.Sort.describe(this.lowerBound[i], this.annotationReader.ofWildcardLowerBoundType(i));
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                        return this.lowerBound.length;
                    }
                }
            }

            public static class Latent extends OfWildcardType {
                private final AnnotationSource annotationSource;
                private final List<? extends Generic> lowerBounds;
                private final List<? extends Generic> upperBounds;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.OfWildcardType, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public /* bridge */ /* synthetic */ TypeDefinition getComponentType() {
                    return super.getComponentType();
                }

                protected Latent(List<? extends Generic> list, List<? extends Generic> list2, AnnotationSource annotationSource) {
                    this.upperBounds = list;
                    this.lowerBounds = list2;
                    this.annotationSource = annotationSource;
                }

                public static Generic unbounded(AnnotationSource annotationSource) {
                    return new Latent(Collections.singletonList(Generic.OBJECT), Collections.emptyList(), annotationSource);
                }

                public static Generic boundedAbove(Generic generic, AnnotationSource annotationSource) {
                    return new Latent(Collections.singletonList(generic), Collections.emptyList(), annotationSource);
                }

                public static Generic boundedBelow(Generic generic, AnnotationSource annotationSource) {
                    return new Latent(Collections.singletonList(Generic.OBJECT), Collections.singletonList(generic), annotationSource);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public TypeList.Generic getUpperBounds() {
                    return new TypeList.Generic.Explicit(this.upperBounds);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public TypeList.Generic getLowerBounds() {
                    return new TypeList.Generic.Explicit(this.lowerBounds);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return this.annotationSource.getDeclaredAnnotations();
                }
            }
        }

        public static abstract class OfParameterizedType extends AbstractBase {
            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public boolean isArray() {
                return false;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public boolean isPrimitive() {
                return false;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public TypeDefinition.Sort getSort() {
                return TypeDefinition.Sort.PARAMETERIZED;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public Generic getSuperClass() {
                Generic superClass = asErasure().getSuperClass();
                return superClass == null ? Generic.UNDEFINED : new LazyProjection.WithResolvedErasure(superClass, new Visitor.Substitutor.ForTypeVariableBinding(this));
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public TypeList.Generic getInterfaces() {
                return new TypeList.Generic.ForDetachedTypes.WithResolvedErasure(asErasure().getInterfaces(), new Visitor.Substitutor.ForTypeVariableBinding(this));
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public FieldList<FieldDescription.InGenericShape> getDeclaredFields() {
                return new FieldList.TypeSubstituting(this, asErasure().getDeclaredFields(), new Visitor.Substitutor.ForTypeVariableBinding(this));
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public MethodList<MethodDescription.InGenericShape> getDeclaredMethods() {
                return new MethodList.TypeSubstituting(this, asErasure().getDeclaredMethods(), new Visitor.Substitutor.ForTypeVariableBinding(this));
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public Generic findBindingOf(Generic generic) {
                Generic generic2 = this;
                do {
                    TypeList.Generic typeArguments = generic2.getTypeArguments();
                    TypeList.Generic typeVariables = generic2.asErasure().getTypeVariables();
                    for (int i = 0; i < Math.min(typeArguments.size(), typeVariables.size()); i++) {
                        if (generic.equals(typeVariables.get(i))) {
                            return (Generic) typeArguments.get(i);
                        }
                    }
                    generic2 = generic2.getOwnerType();
                    if (generic2 == null) {
                        break;
                    }
                } while (generic2.getSort().isParameterized());
                return Generic.UNDEFINED;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public TypeList.Generic getUpperBounds() {
                throw new IllegalStateException("A parameterized type does not imply upper bounds: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public TypeList.Generic getLowerBounds() {
                throw new IllegalStateException("A parameterized type does not imply lower bounds: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public Generic getComponentType() {
                throw new IllegalStateException("A parameterized type does not imply a component type: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public TypeVariableSource getTypeVariableSource() {
                throw new IllegalStateException("A parameterized type does not imply a type variable source: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public String getSymbol() {
                throw new IllegalStateException("A parameterized type does not imply a symbol: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public String getTypeName() {
                return toString();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.NamedElement
            public String getActualName() {
                return toString();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public boolean represents(Type type) {
                return equals(TypeDefinition.Sort.describe(type));
            }

            @Override // java.lang.Iterable
            public Iterator<TypeDefinition> iterator() {
                return new TypeDefinition.SuperClassIterator(this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public <T> T accept(Visitor<T> visitor) {
                return visitor.onParameterizedType(this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public StackSize getStackSize() {
                return StackSize.SINGLE;
            }

            public int hashCode() {
                int hashCode;
                Iterator it = getTypeArguments().iterator();
                int i = 1;
                while (it.hasNext()) {
                    i = (i * 31) + ((Generic) it.next()).hashCode();
                }
                Generic ownerType = getOwnerType();
                if (ownerType == null) {
                    hashCode = asErasure().hashCode();
                } else {
                    hashCode = ownerType.hashCode();
                }
                return hashCode ^ i;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Generic)) {
                    return false;
                }
                Generic generic = (Generic) obj;
                if (!generic.getSort().isParameterized()) {
                    return false;
                }
                Generic ownerType = getOwnerType();
                Generic ownerType2 = generic.getOwnerType();
                return asErasure().equals(generic.asErasure()) && (ownerType != null || ownerType2 == null) && ((ownerType == null || ownerType.equals(ownerType2)) && getTypeArguments().equals(generic.getTypeArguments()));
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                RenderingDelegate.CURRENT.apply(sb, asErasure(), getOwnerType());
                TypeList.Generic<Generic> typeArguments = getTypeArguments();
                if (!typeArguments.isEmpty()) {
                    sb.append(Typography.less);
                    boolean z = false;
                    for (Generic generic : typeArguments) {
                        if (z) {
                            sb.append(", ");
                        }
                        sb.append(generic.getTypeName());
                        z = true;
                    }
                    sb.append(Typography.greater);
                }
                return sb.toString();
            }

            protected enum RenderingDelegate {
                FOR_LEGACY_VM { // from class: org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType.RenderingDelegate.1
                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType.RenderingDelegate
                    protected void apply(StringBuilder sb, TypeDescription typeDescription, Generic generic) {
                        String name;
                        if (generic != null) {
                            StringBuilder append = sb.append(generic.getTypeName()).append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                            if (generic.getSort().isParameterized()) {
                                name = typeDescription.getSimpleName();
                            } else {
                                name = typeDescription.getName();
                            }
                            append.append(name);
                            return;
                        }
                        sb.append(typeDescription.getName());
                    }
                },
                FOR_JAVA_8_CAPABLE_VM { // from class: org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType.RenderingDelegate.2
                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType.RenderingDelegate
                    protected void apply(StringBuilder sb, TypeDescription typeDescription, Generic generic) {
                        if (generic != null) {
                            sb.append(generic.getTypeName()).append(Typography.dollar);
                            if (generic.getSort().isParameterized()) {
                                sb.append(typeDescription.getName().replace(generic.asErasure().getName() + "$", ""));
                                return;
                            } else {
                                sb.append(typeDescription.getSimpleName());
                                return;
                            }
                        }
                        sb.append(typeDescription.getName());
                    }
                };

                protected static final RenderingDelegate CURRENT;

                protected abstract void apply(StringBuilder sb, TypeDescription typeDescription, Generic generic);

                static {
                    RenderingDelegate renderingDelegate = FOR_LEGACY_VM;
                    CURRENT = ClassFileVersion.ofThisVm(ClassFileVersion.JAVA_V6).isAtLeast(ClassFileVersion.JAVA_V8) ? FOR_JAVA_8_CAPABLE_VM : renderingDelegate;
                }
            }

            public static class ForLoadedType extends OfParameterizedType {
                private final AnnotationReader annotationReader;
                private final ParameterizedType parameterizedType;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public /* bridge */ /* synthetic */ TypeDefinition getComponentType() {
                    return super.getComponentType();
                }

                public ForLoadedType(ParameterizedType parameterizedType) {
                    this(parameterizedType, AnnotationReader.NoOp.INSTANCE);
                }

                protected ForLoadedType(ParameterizedType parameterizedType, AnnotationReader annotationReader) {
                    this.parameterizedType = parameterizedType;
                    this.annotationReader = annotationReader;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public TypeList.Generic getTypeArguments() {
                    return new ParameterArgumentTypeList(this.parameterizedType.getActualTypeArguments(), this.annotationReader);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public Generic getOwnerType() {
                    Type ownerType = this.parameterizedType.getOwnerType();
                    if (ownerType == null) {
                        return Generic.UNDEFINED;
                    }
                    return TypeDefinition.Sort.describe(ownerType, this.annotationReader.ofOwnerType());
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public TypeDescription asErasure() {
                    return ForLoadedType.of((Class) this.parameterizedType.getRawType());
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return this.annotationReader.asList();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public boolean represents(Type type) {
                    return this.parameterizedType == type || super.represents(type);
                }

                protected static class ParameterArgumentTypeList extends TypeList.Generic.AbstractBase {
                    private final AnnotationReader annotationReader;
                    private final Type[] argumentType;

                    protected ParameterArgumentTypeList(Type[] typeArr, AnnotationReader annotationReader) {
                        this.argumentType = typeArr;
                        this.annotationReader = annotationReader;
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public Generic get(int i) {
                        return TypeDefinition.Sort.describe(this.argumentType[i], this.annotationReader.ofTypeArgument(i));
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                        return this.argumentType.length;
                    }
                }
            }

            public static class Latent extends OfParameterizedType {
                private final AnnotationSource annotationSource;
                private final Generic ownerType;
                private final List<? extends Generic> parameters;
                private final TypeDescription rawType;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public /* bridge */ /* synthetic */ TypeDefinition getComponentType() {
                    return super.getComponentType();
                }

                public Latent(TypeDescription typeDescription, Generic generic, List<? extends Generic> list, AnnotationSource annotationSource) {
                    this.rawType = typeDescription;
                    this.ownerType = generic;
                    this.parameters = list;
                    this.annotationSource = annotationSource;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public TypeDescription asErasure() {
                    return this.rawType;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public Generic getOwnerType() {
                    return this.ownerType;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public TypeList.Generic getTypeArguments() {
                    return new TypeList.Generic.Explicit(this.parameters);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return this.annotationSource.getDeclaredAnnotations();
                }
            }

            public static class ForReifiedType extends OfParameterizedType {
                private final Generic parameterizedType;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public /* bridge */ /* synthetic */ TypeDefinition getComponentType() {
                    return super.getComponentType();
                }

                protected ForReifiedType(Generic generic) {
                    this.parameterizedType = generic;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public Generic getSuperClass() {
                    Generic superClass = super.getSuperClass();
                    return superClass == null ? Generic.UNDEFINED : new LazyProjection.WithResolvedErasure(superClass, Visitor.Reifying.INHERITING);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public TypeList.Generic getInterfaces() {
                    return new TypeList.Generic.ForDetachedTypes.WithResolvedErasure(super.getInterfaces(), Visitor.Reifying.INHERITING);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public FieldList<FieldDescription.InGenericShape> getDeclaredFields() {
                    return new FieldList.TypeSubstituting(this, super.getDeclaredFields(), Visitor.TypeErasing.INSTANCE);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public MethodList<MethodDescription.InGenericShape> getDeclaredMethods() {
                    return new MethodList.TypeSubstituting(this, super.getDeclaredMethods(), Visitor.TypeErasing.INSTANCE);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public TypeList.Generic getTypeArguments() {
                    return new TypeList.Generic.ForDetachedTypes(this.parameterizedType.getTypeArguments(), Visitor.TypeErasing.INSTANCE);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public Generic getOwnerType() {
                    Generic ownerType = this.parameterizedType.getOwnerType();
                    if (ownerType == null) {
                        return Generic.UNDEFINED;
                    }
                    return (Generic) ownerType.accept(Visitor.Reifying.INHERITING);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public TypeDescription asErasure() {
                    return this.parameterizedType.asErasure();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return new AnnotationList.Empty();
                }
            }

            public static class ForGenerifiedErasure extends OfParameterizedType {
                private final TypeDescription typeDescription;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.OfParameterizedType, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public /* bridge */ /* synthetic */ TypeDefinition getComponentType() {
                    return super.getComponentType();
                }

                protected ForGenerifiedErasure(TypeDescription typeDescription) {
                    this.typeDescription = typeDescription;
                }

                public static Generic of(TypeDescription typeDescription) {
                    return typeDescription.isGenerified() ? new ForGenerifiedErasure(typeDescription) : new OfNonGenericType.ForErasure(typeDescription);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public TypeDescription asErasure() {
                    return this.typeDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public TypeList.Generic getTypeArguments() {
                    return new TypeList.Generic.ForDetachedTypes(this.typeDescription.getTypeVariables(), Visitor.AnnotationStripper.INSTANCE);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public Generic getOwnerType() {
                    TypeDescription declaringType = this.typeDescription.getDeclaringType();
                    if (declaringType == null) {
                        return Generic.UNDEFINED;
                    }
                    return of(declaringType);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return new AnnotationList.Empty();
                }
            }
        }

        public static abstract class OfTypeVariable extends AbstractBase {
            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public boolean isArray() {
                return false;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public boolean isPrimitive() {
                return false;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public TypeDefinition.Sort getSort() {
                return TypeDefinition.Sort.VARIABLE;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public TypeDescription asErasure() {
                TypeList.Generic upperBounds = getUpperBounds();
                return upperBounds.isEmpty() ? TypeDescription.OBJECT : ((Generic) upperBounds.get(0)).asErasure();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public Generic getSuperClass() {
                throw new IllegalStateException("A type variable does not imply a super type definition: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public TypeList.Generic getInterfaces() {
                throw new IllegalStateException("A type variable does not imply an interface type definition: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public FieldList<FieldDescription.InGenericShape> getDeclaredFields() {
                throw new IllegalStateException("A type variable does not imply field definitions: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public MethodList<MethodDescription.InGenericShape> getDeclaredMethods() {
                throw new IllegalStateException("A type variable does not imply method definitions: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public Generic getComponentType() {
                throw new IllegalStateException("A type variable does not imply a component type: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public TypeList.Generic getTypeArguments() {
                throw new IllegalStateException("A type variable does not imply type arguments: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public Generic findBindingOf(Generic generic) {
                throw new IllegalStateException("A type variable does not imply type arguments: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public TypeList.Generic getLowerBounds() {
                throw new IllegalStateException("A type variable does not imply lower bounds: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public Generic getOwnerType() {
                throw new IllegalStateException("A type variable does not imply an owner type: " + this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public String getTypeName() {
                return toString();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.NamedElement
            public String getActualName() {
                return getSymbol();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public <T> T accept(Visitor<T> visitor) {
                return visitor.onTypeVariable(this);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public StackSize getStackSize() {
                return StackSize.SINGLE;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public boolean represents(Type type) {
                return equals(TypeDefinition.Sort.describe(type));
            }

            @Override // java.lang.Iterable
            public Iterator<TypeDefinition> iterator() {
                throw new IllegalStateException("A type variable does not imply a super type definition: " + this);
            }

            public int hashCode() {
                return getTypeVariableSource().hashCode() ^ getSymbol().hashCode();
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Generic)) {
                    return false;
                }
                Generic generic = (Generic) obj;
                return generic.getSort().isTypeVariable() && getSymbol().equals(generic.getSymbol()) && getTypeVariableSource().equals(generic.getTypeVariableSource());
            }

            public String toString() {
                return getSymbol();
            }

            public static class Symbolic extends AbstractBase {
                private final AnnotationSource annotationSource;
                private final String symbol;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public boolean isArray() {
                    return false;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public boolean isPrimitive() {
                    return false;
                }

                public Symbolic(String str, AnnotationSource annotationSource) {
                    this.symbol = str;
                    this.annotationSource = annotationSource;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public TypeDefinition.Sort getSort() {
                    return TypeDefinition.Sort.VARIABLE_SYMBOLIC;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public String getSymbol() {
                    return this.symbol;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return this.annotationSource.getDeclaredAnnotations();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public TypeDescription asErasure() {
                    throw new IllegalStateException("A symbolic type variable does not imply an erasure: " + this);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public TypeList.Generic getUpperBounds() {
                    throw new IllegalStateException("A symbolic type variable does not imply an upper type bound: " + this);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public TypeVariableSource getTypeVariableSource() {
                    throw new IllegalStateException("A symbolic type variable does not imply a variable source: " + this);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public Generic getSuperClass() {
                    throw new IllegalStateException("A symbolic type variable does not imply a super type definition: " + this);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public TypeList.Generic getInterfaces() {
                    throw new IllegalStateException("A symbolic type variable does not imply an interface type definition: " + this);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public FieldList<FieldDescription.InGenericShape> getDeclaredFields() {
                    throw new IllegalStateException("A symbolic type variable does not imply field definitions: " + this);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public MethodList<MethodDescription.InGenericShape> getDeclaredMethods() {
                    throw new IllegalStateException("A symbolic type variable does not imply method definitions: " + this);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public Generic getComponentType() {
                    throw new IllegalStateException("A symbolic type variable does not imply a component type: " + this);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public TypeList.Generic getTypeArguments() {
                    throw new IllegalStateException("A symbolic type variable does not imply type arguments: " + this);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public Generic findBindingOf(Generic generic) {
                    throw new IllegalStateException("A symbolic type variable does not imply type arguments: " + this);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public TypeList.Generic getLowerBounds() {
                    throw new IllegalStateException("A symbolic type variable does not imply lower bounds: " + this);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public Generic getOwnerType() {
                    throw new IllegalStateException("A symbolic type variable does not imply an owner type: " + this);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public String getTypeName() {
                    return toString();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.NamedElement
                public String getActualName() {
                    return getSymbol();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public <T> T accept(Visitor<T> visitor) {
                    return visitor.onTypeVariable(this);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public StackSize getStackSize() {
                    return StackSize.SINGLE;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public boolean represents(Type type) {
                    type.getClass();
                    return false;
                }

                @Override // java.lang.Iterable
                public Iterator<TypeDefinition> iterator() {
                    throw new IllegalStateException("A symbolic type variable does not imply a super type definition: " + this);
                }

                public int hashCode() {
                    return this.symbol.hashCode();
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Generic)) {
                        return false;
                    }
                    Generic generic = (Generic) obj;
                    return generic.getSort().isTypeVariable() && getSymbol().equals(generic.getSymbol());
                }

                public String toString() {
                    return getSymbol();
                }
            }

            public static class ForLoadedType extends OfTypeVariable {
                private final AnnotationReader annotationReader;
                private final TypeVariable<?> typeVariable;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.OfTypeVariable, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public /* bridge */ /* synthetic */ TypeDefinition getComponentType() {
                    return super.getComponentType();
                }

                public ForLoadedType(TypeVariable<?> typeVariable) {
                    this(typeVariable, AnnotationReader.NoOp.INSTANCE);
                }

                protected ForLoadedType(TypeVariable<?> typeVariable, AnnotationReader annotationReader) {
                    this.typeVariable = typeVariable;
                    this.annotationReader = annotationReader;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public TypeVariableSource getTypeVariableSource() {
                    Object genericDeclaration = this.typeVariable.getGenericDeclaration();
                    if (genericDeclaration instanceof Class) {
                        return ForLoadedType.of((Class) genericDeclaration);
                    }
                    if (genericDeclaration instanceof Method) {
                        return new MethodDescription.ForLoadedMethod((Method) genericDeclaration);
                    }
                    if (genericDeclaration instanceof Constructor) {
                        return new MethodDescription.ForLoadedConstructor((Constructor) genericDeclaration);
                    }
                    throw new IllegalStateException("Unknown declaration: " + genericDeclaration);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public TypeList.Generic getUpperBounds() {
                    return new TypeVariableBoundList(this.typeVariable.getBounds(), this.annotationReader);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public String getSymbol() {
                    return this.typeVariable.getName();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return this.annotationReader.asList();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.OfTypeVariable, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public boolean represents(Type type) {
                    return this.typeVariable == type || super.represents(type);
                }

                protected static class TypeVariableBoundList extends TypeList.Generic.AbstractBase {
                    private final AnnotationReader annotationReader;
                    private final Type[] bound;

                    protected TypeVariableBoundList(Type[] typeArr, AnnotationReader annotationReader) {
                        this.bound = typeArr;
                        this.annotationReader = annotationReader;
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public Generic get(int i) {
                        return TypeDefinition.Sort.describe(this.bound[i], this.annotationReader.ofTypeVariableBoundType(i));
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                        return this.bound.length;
                    }
                }
            }

            public static class WithAnnotationOverlay extends OfTypeVariable {
                private final AnnotationSource annotationSource;
                private final Generic typeVariable;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.OfTypeVariable, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public /* bridge */ /* synthetic */ TypeDefinition getComponentType() {
                    return super.getComponentType();
                }

                public WithAnnotationOverlay(Generic generic, AnnotationSource annotationSource) {
                    this.typeVariable = generic;
                    this.annotationSource = annotationSource;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return this.annotationSource.getDeclaredAnnotations();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public TypeList.Generic getUpperBounds() {
                    return this.typeVariable.getUpperBounds();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public TypeVariableSource getTypeVariableSource() {
                    return this.typeVariable.getTypeVariableSource();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
                public String getSymbol() {
                    return this.typeVariable.getSymbol();
                }
            }
        }

        public static abstract class LazyProjection extends AbstractBase {
            protected abstract Generic resolve();

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public TypeDefinition.Sort getSort() {
                return resolve().getSort();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public FieldList<FieldDescription.InGenericShape> getDeclaredFields() {
                return resolve().getDeclaredFields();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public MethodList<MethodDescription.InGenericShape> getDeclaredMethods() {
                return resolve().getDeclaredMethods();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public TypeList.Generic getUpperBounds() {
                return resolve().getUpperBounds();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public TypeList.Generic getLowerBounds() {
                return resolve().getLowerBounds();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public Generic getComponentType() {
                return resolve().getComponentType();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public TypeList.Generic getTypeArguments() {
                return resolve().getTypeArguments();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public Generic findBindingOf(Generic generic) {
                return resolve().findBindingOf(generic);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public TypeVariableSource getTypeVariableSource() {
                return resolve().getTypeVariableSource();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public Generic getOwnerType() {
                return resolve().getOwnerType();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public String getTypeName() {
                return resolve().getTypeName();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public String getSymbol() {
                return resolve().getSymbol();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.NamedElement
            public String getActualName() {
                return resolve().getActualName();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic
            public <T> T accept(Visitor<T> visitor) {
                return (T) resolve().accept(visitor);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public StackSize getStackSize() {
                return asErasure().getStackSize();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public boolean isArray() {
                return asErasure().isArray();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public boolean isPrimitive() {
                return asErasure().isPrimitive();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public boolean represents(Type type) {
                return resolve().represents(type);
            }

            public int hashCode() {
                return resolve().hashCode();
            }

            public boolean equals(Object obj) {
                return this == obj || ((obj instanceof TypeDefinition) && resolve().equals(obj));
            }

            public String toString() {
                return resolve().toString();
            }

            public static abstract class WithLazyNavigation extends LazyProjection {
                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public /* bridge */ /* synthetic */ TypeDefinition getComponentType() {
                    return super.getComponentType();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public Generic getSuperClass() {
                    return LazySuperClass.of(this);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public TypeList.Generic getInterfaces() {
                    return LazyInterfaceList.of((LazyProjection) this);
                }

                @Override // java.lang.Iterable
                public Iterator<TypeDefinition> iterator() {
                    return new TypeDefinition.SuperClassIterator(this);
                }

                protected static class LazySuperClass extends WithLazyNavigation {
                    private final LazyProjection delegate;
                    private transient /* synthetic */ Generic resolved;

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithLazyNavigation, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                    public /* bridge */ /* synthetic */ TypeDefinition getComponentType() {
                        return super.getComponentType();
                    }

                    protected LazySuperClass(LazyProjection lazyProjection) {
                        this.delegate = lazyProjection;
                    }

                    protected static Generic of(LazyProjection lazyProjection) {
                        return lazyProjection.asErasure().getSuperClass() == null ? Generic.UNDEFINED : new LazySuperClass(lazyProjection);
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                    public AnnotationList getDeclaredAnnotations() {
                        return resolve().getDeclaredAnnotations();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                    public TypeDescription asErasure() {
                        return this.delegate.asErasure().getSuperClass().asErasure();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                    @CachedReturnPlugin.Enhance("resolved")
                    protected Generic resolve() {
                        Generic superClass = this.resolved != null ? null : this.delegate.resolve().getSuperClass();
                        if (superClass == null) {
                            return this.resolved;
                        }
                        this.resolved = superClass;
                        return superClass;
                    }
                }

                protected static class LazyInterfaceType extends WithLazyNavigation {
                    private final LazyProjection delegate;
                    private final int index;
                    private final Generic rawInterface;
                    private transient /* synthetic */ Generic resolved;

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithLazyNavigation, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                    public /* bridge */ /* synthetic */ TypeDefinition getComponentType() {
                        return super.getComponentType();
                    }

                    protected LazyInterfaceType(LazyProjection lazyProjection, int i, Generic generic) {
                        this.delegate = lazyProjection;
                        this.index = i;
                        this.rawInterface = generic;
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                    public AnnotationList getDeclaredAnnotations() {
                        return resolve().getDeclaredAnnotations();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                    public TypeDescription asErasure() {
                        return this.rawInterface.asErasure();
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                    @CachedReturnPlugin.Enhance("resolved")
                    protected Generic resolve() {
                        Generic generic = this.resolved != null ? null : (Generic) this.delegate.resolve().getInterfaces().get(this.index);
                        if (generic == null) {
                            return this.resolved;
                        }
                        this.resolved = generic;
                        return generic;
                    }
                }

                protected static class LazyInterfaceList extends TypeList.Generic.AbstractBase {
                    private final LazyProjection delegate;
                    private final TypeList.Generic rawInterfaces;

                    protected LazyInterfaceList(LazyProjection lazyProjection, TypeList.Generic generic) {
                        this.delegate = lazyProjection;
                        this.rawInterfaces = generic;
                    }

                    protected static TypeList.Generic of(LazyProjection lazyProjection) {
                        return new LazyInterfaceList(lazyProjection, lazyProjection.asErasure().getInterfaces());
                    }

                    @Override // java.util.AbstractList, java.util.List
                    public Generic get(int i) {
                        return new LazyInterfaceType(this.delegate, i, (Generic) this.rawInterfaces.get(i));
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                    public int size() {
                        return this.rawInterfaces.size();
                    }
                }

                protected static abstract class OfAnnotatedElement extends WithLazyNavigation {
                    protected abstract AnnotationReader getAnnotationReader();

                    protected OfAnnotatedElement() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithLazyNavigation, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                    public /* bridge */ /* synthetic */ TypeDefinition getComponentType() {
                        return super.getComponentType();
                    }

                    public AnnotationList getDeclaredAnnotations() {
                        return getAnnotationReader().asList();
                    }
                }
            }

            public static abstract class WithEagerNavigation extends LazyProjection {
                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public /* bridge */ /* synthetic */ TypeDefinition getComponentType() {
                    return super.getComponentType();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public Generic getSuperClass() {
                    return resolve().getSuperClass();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public TypeList.Generic getInterfaces() {
                    return resolve().getInterfaces();
                }

                @Override // java.lang.Iterable
                public Iterator<TypeDefinition> iterator() {
                    return resolve().iterator();
                }

                protected static abstract class OfAnnotatedElement extends WithEagerNavigation {
                    protected abstract AnnotationReader getAnnotationReader();

                    protected OfAnnotatedElement() {
                    }

                    @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation, org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                    public /* bridge */ /* synthetic */ TypeDefinition getComponentType() {
                        return super.getComponentType();
                    }

                    public AnnotationList getDeclaredAnnotations() {
                        return getAnnotationReader().asList();
                    }
                }
            }

            public static class ForLoadedSuperClass extends WithLazyNavigation.OfAnnotatedElement {
                private transient /* synthetic */ Generic resolved;
                private final Class<?> type;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithLazyNavigation.OfAnnotatedElement, org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public /* bridge */ /* synthetic */ AnnotationList getDeclaredAnnotations() {
                    return super.getDeclaredAnnotations();
                }

                public ForLoadedSuperClass(Class<?> cls) {
                    this.type = cls;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                @CachedReturnPlugin.Enhance("resolved")
                protected Generic resolve() {
                    Generic describe;
                    if (this.resolved != null) {
                        describe = null;
                    } else {
                        Type genericSuperclass = this.type.getGenericSuperclass();
                        if (genericSuperclass == null) {
                            describe = Generic.UNDEFINED;
                        } else {
                            describe = TypeDefinition.Sort.describe(genericSuperclass, getAnnotationReader());
                        }
                    }
                    if (describe == null) {
                        return this.resolved;
                    }
                    this.resolved = describe;
                    return describe;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public TypeDescription asErasure() {
                    Class<? super Object> superclass = this.type.getSuperclass();
                    if (superclass == null) {
                        return TypeDescription.UNDEFINED;
                    }
                    return ForLoadedType.of(superclass);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithLazyNavigation.OfAnnotatedElement
                protected AnnotationReader getAnnotationReader() {
                    return AnnotationReader.DISPATCHER.resolveSuperClassType(this.type);
                }
            }

            public static class ForLoadedFieldType extends WithEagerNavigation.OfAnnotatedElement {
                private final Field field;
                private transient /* synthetic */ Generic resolved;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement, org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public /* bridge */ /* synthetic */ AnnotationList getDeclaredAnnotations() {
                    return super.getDeclaredAnnotations();
                }

                public ForLoadedFieldType(Field field) {
                    this.field = field;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                @CachedReturnPlugin.Enhance("resolved")
                protected Generic resolve() {
                    Generic describe = this.resolved != null ? null : TypeDefinition.Sort.describe(this.field.getGenericType(), getAnnotationReader());
                    if (describe == null) {
                        return this.resolved;
                    }
                    this.resolved = describe;
                    return describe;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public TypeDescription asErasure() {
                    return ForLoadedType.of(this.field.getType());
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement
                protected AnnotationReader getAnnotationReader() {
                    return AnnotationReader.DISPATCHER.resolveFieldType(this.field);
                }
            }

            public static class ForLoadedReturnType extends WithEagerNavigation.OfAnnotatedElement {
                private final Method method;
                private transient /* synthetic */ Generic resolved;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement, org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public /* bridge */ /* synthetic */ AnnotationList getDeclaredAnnotations() {
                    return super.getDeclaredAnnotations();
                }

                public ForLoadedReturnType(Method method) {
                    this.method = method;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                @CachedReturnPlugin.Enhance("resolved")
                protected Generic resolve() {
                    Generic describe = this.resolved != null ? null : TypeDefinition.Sort.describe(this.method.getGenericReturnType(), getAnnotationReader());
                    if (describe == null) {
                        return this.resolved;
                    }
                    this.resolved = describe;
                    return describe;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public TypeDescription asErasure() {
                    return ForLoadedType.of(this.method.getReturnType());
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement
                protected AnnotationReader getAnnotationReader() {
                    return AnnotationReader.DISPATCHER.resolveReturnType(this.method);
                }
            }

            public static class OfConstructorParameter extends WithEagerNavigation.OfAnnotatedElement {
                private final Constructor<?> constructor;
                private transient /* synthetic */ Generic delegate;
                private final Class<?>[] erasure;
                private final int index;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement, org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public /* bridge */ /* synthetic */ AnnotationList getDeclaredAnnotations() {
                    return super.getDeclaredAnnotations();
                }

                public OfConstructorParameter(Constructor<?> constructor, int i, Class<?>[] clsArr) {
                    this.constructor = constructor;
                    this.index = i;
                    this.erasure = clsArr;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                @CachedReturnPlugin.Enhance(MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX)
                protected Generic resolve() {
                    Generic of;
                    if (this.delegate != null) {
                        of = null;
                    } else {
                        Type[] genericParameterTypes = this.constructor.getGenericParameterTypes();
                        Class<?>[] clsArr = this.erasure;
                        if (clsArr.length == genericParameterTypes.length) {
                            of = TypeDefinition.Sort.describe(genericParameterTypes[this.index], getAnnotationReader());
                        } else {
                            of = OfNonGenericType.ForLoadedType.of(clsArr[this.index]);
                        }
                    }
                    if (of == null) {
                        return this.delegate;
                    }
                    this.delegate = of;
                    return of;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public TypeDescription asErasure() {
                    return ForLoadedType.of(this.erasure[this.index]);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement
                protected AnnotationReader getAnnotationReader() {
                    return AnnotationReader.DISPATCHER.resolveParameterType(this.constructor, this.index);
                }
            }

            public static class OfMethodParameter extends WithEagerNavigation.OfAnnotatedElement {
                private final Class<?>[] erasure;
                private final int index;
                private final Method method;
                private transient /* synthetic */ Generic resolved;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement, org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public /* bridge */ /* synthetic */ AnnotationList getDeclaredAnnotations() {
                    return super.getDeclaredAnnotations();
                }

                public OfMethodParameter(Method method, int i, Class<?>[] clsArr) {
                    this.method = method;
                    this.index = i;
                    this.erasure = clsArr;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                @CachedReturnPlugin.Enhance("resolved")
                protected Generic resolve() {
                    Generic of;
                    if (this.resolved != null) {
                        of = null;
                    } else {
                        Type[] genericParameterTypes = this.method.getGenericParameterTypes();
                        Class<?>[] clsArr = this.erasure;
                        if (clsArr.length == genericParameterTypes.length) {
                            of = TypeDefinition.Sort.describe(genericParameterTypes[this.index], getAnnotationReader());
                        } else {
                            of = OfNonGenericType.ForLoadedType.of(clsArr[this.index]);
                        }
                    }
                    if (of == null) {
                        return this.resolved;
                    }
                    this.resolved = of;
                    return of;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public TypeDescription asErasure() {
                    return ForLoadedType.of(this.erasure[this.index]);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection.WithEagerNavigation.OfAnnotatedElement
                protected AnnotationReader getAnnotationReader() {
                    return AnnotationReader.DISPATCHER.resolveParameterType(this.method, this.index);
                }
            }

            public static class WithResolvedErasure extends WithEagerNavigation {
                private final AnnotationSource annotationSource;
                private final Generic delegate;
                private transient /* synthetic */ Generic resolved;
                private final Visitor<? extends Generic> visitor;

                public WithResolvedErasure(Generic generic, Visitor<? extends Generic> visitor) {
                    this(generic, visitor, generic);
                }

                public WithResolvedErasure(Generic generic, Visitor<? extends Generic> visitor, AnnotationSource annotationSource) {
                    this.delegate = generic;
                    this.visitor = visitor;
                    this.annotationSource = annotationSource;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return this.annotationSource.getDeclaredAnnotations();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public TypeDescription asErasure() {
                    return this.delegate.asErasure();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
                @CachedReturnPlugin.Enhance("resolved")
                protected Generic resolve() {
                    Generic generic = this.resolved != null ? null : (Generic) this.delegate.accept(this.visitor);
                    if (generic == null) {
                        return this.resolved;
                    }
                    this.resolved = generic;
                    return generic;
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static abstract class Builder {
            private static final Type UNDEFINED = null;
            protected final List<? extends AnnotationDescription> annotations;

            protected abstract Builder doAnnotate(List<? extends AnnotationDescription> list);

            protected abstract Generic doBuild();

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.annotations.equals(((Builder) obj).annotations);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.annotations.hashCode();
            }

            protected Builder(List<? extends AnnotationDescription> list) {
                this.annotations = list;
            }

            public static Builder rawType(Class<?> cls) {
                return rawType(ForLoadedType.of(cls));
            }

            public static Builder rawType(TypeDescription typeDescription) {
                return new OfNonGenericType(typeDescription);
            }

            public static Builder rawType(Class<?> cls, Generic generic) {
                return rawType(ForLoadedType.of(cls), generic);
            }

            public static Builder rawType(TypeDescription typeDescription, Generic generic) {
                TypeDescription declaringType = typeDescription.getDeclaringType();
                if (declaringType == null && generic != null) {
                    throw new IllegalArgumentException(typeDescription + " does not have a declaring type: " + generic);
                }
                if (declaringType != null && (generic == null || !declaringType.equals(generic.asErasure()))) {
                    throw new IllegalArgumentException(generic + " is not the declaring type of " + typeDescription);
                }
                return new OfNonGenericType(typeDescription, generic);
            }

            public static Generic unboundWildcard() {
                return unboundWildcard(Collections.emptySet());
            }

            public static Generic unboundWildcard(Annotation... annotationArr) {
                return unboundWildcard((List<? extends Annotation>) Arrays.asList(annotationArr));
            }

            public static Generic unboundWildcard(List<? extends Annotation> list) {
                return unboundWildcard((Collection<? extends AnnotationDescription>) new AnnotationList.ForLoadedAnnotations(list));
            }

            public static Generic unboundWildcard(AnnotationDescription... annotationDescriptionArr) {
                return unboundWildcard((Collection<? extends AnnotationDescription>) Arrays.asList(annotationDescriptionArr));
            }

            public static Generic unboundWildcard(Collection<? extends AnnotationDescription> collection) {
                return OfWildcardType.Latent.unbounded(new AnnotationSource.Explicit(new ArrayList(collection)));
            }

            public static Builder typeVariable(String str) {
                return new OfTypeVariable(str);
            }

            public static Builder parameterizedType(Class<?> cls, Type... typeArr) {
                return parameterizedType(cls, (List<? extends Type>) Arrays.asList(typeArr));
            }

            public static Builder parameterizedType(Class<?> cls, List<? extends Type> list) {
                return parameterizedType(cls, UNDEFINED, list);
            }

            public static Builder parameterizedType(Class<?> cls, Type type, List<? extends Type> list) {
                return parameterizedType(ForLoadedType.of(cls), type == null ? null : TypeDefinition.Sort.describe(type), new TypeList.Generic.ForLoadedTypes(list));
            }

            public static Builder parameterizedType(TypeDescription typeDescription, TypeDefinition... typeDefinitionArr) {
                return parameterizedType(typeDescription, Arrays.asList(typeDefinitionArr));
            }

            public static Builder parameterizedType(TypeDescription typeDescription, Collection<? extends TypeDefinition> collection) {
                return parameterizedType(typeDescription, Generic.UNDEFINED, collection);
            }

            public static Builder parameterizedType(TypeDescription typeDescription, Generic generic, Collection<? extends TypeDefinition> collection) {
                TypeDescription declaringType = typeDescription.getDeclaringType();
                if (generic == null && declaringType != null && typeDescription.isStatic()) {
                    generic = declaringType.asGenericType();
                }
                if (!typeDescription.represents(TargetType.class)) {
                    if (!typeDescription.isGenerified()) {
                        throw new IllegalArgumentException(typeDescription + " is not a parameterized type");
                    }
                    if (generic == null && declaringType != null && !typeDescription.isStatic()) {
                        throw new IllegalArgumentException(typeDescription + " requires an owner type");
                    }
                    if (generic != null && !generic.asErasure().equals(declaringType)) {
                        throw new IllegalArgumentException(generic + " does not represent required owner for " + typeDescription);
                    }
                    if (generic != null && (typeDescription.isStatic() ^ generic.getSort().isNonGeneric())) {
                        throw new IllegalArgumentException(generic + " does not define the correct parameters for owning " + typeDescription);
                    }
                    if (typeDescription.getTypeVariables().size() != collection.size()) {
                        throw new IllegalArgumentException(collection + " does not contain number of required parameters for " + typeDescription);
                    }
                }
                return new OfParameterizedType(typeDescription, generic, new TypeList.Generic.Explicit(new ArrayList(collection)));
            }

            public Generic asWildcardUpperBound() {
                return asWildcardUpperBound(Collections.emptySet());
            }

            public Generic asWildcardUpperBound(Annotation... annotationArr) {
                return asWildcardUpperBound(Arrays.asList(annotationArr));
            }

            public Generic asWildcardUpperBound(List<? extends Annotation> list) {
                return asWildcardUpperBound((Collection<? extends AnnotationDescription>) new AnnotationList.ForLoadedAnnotations(list));
            }

            public Generic asWildcardUpperBound(AnnotationDescription... annotationDescriptionArr) {
                return asWildcardUpperBound((Collection<? extends AnnotationDescription>) Arrays.asList(annotationDescriptionArr));
            }

            public Generic asWildcardUpperBound(Collection<? extends AnnotationDescription> collection) {
                return OfWildcardType.Latent.boundedAbove(build(), new AnnotationSource.Explicit(new ArrayList(collection)));
            }

            public Generic asWildcardLowerBound() {
                return asWildcardLowerBound(Collections.emptySet());
            }

            public Generic asWildcardLowerBound(Annotation... annotationArr) {
                return asWildcardLowerBound(Arrays.asList(annotationArr));
            }

            public Generic asWildcardLowerBound(List<? extends Annotation> list) {
                return asWildcardLowerBound((Collection<? extends AnnotationDescription>) new AnnotationList.ForLoadedAnnotations(list));
            }

            public Generic asWildcardLowerBound(AnnotationDescription... annotationDescriptionArr) {
                return asWildcardLowerBound((Collection<? extends AnnotationDescription>) Arrays.asList(annotationDescriptionArr));
            }

            public Generic asWildcardLowerBound(Collection<? extends AnnotationDescription> collection) {
                return OfWildcardType.Latent.boundedBelow(build(), new AnnotationSource.Explicit(new ArrayList(collection)));
            }

            public Builder asArray() {
                return asArray(1);
            }

            public Builder asArray(int i) {
                if (i < 1) {
                    throw new IllegalArgumentException("Cannot define an array of a non-positive arity: " + i);
                }
                Generic build = build();
                while (true) {
                    i--;
                    if (i > 0) {
                        build = new OfGenericArray.Latent(build, AnnotationSource.Empty.INSTANCE);
                    } else {
                        return new OfGenericArrayType(build);
                    }
                }
            }

            public Builder annotate(Annotation... annotationArr) {
                return annotate(Arrays.asList(annotationArr));
            }

            public Builder annotate(List<? extends Annotation> list) {
                return annotate((Collection<? extends AnnotationDescription>) new AnnotationList.ForLoadedAnnotations(list));
            }

            public Builder annotate(AnnotationDescription... annotationDescriptionArr) {
                return annotate((Collection<? extends AnnotationDescription>) Arrays.asList(annotationDescriptionArr));
            }

            public Builder annotate(Collection<? extends AnnotationDescription> collection) {
                return doAnnotate(new ArrayList(collection));
            }

            public Generic build() {
                return doBuild();
            }

            public Generic build(Annotation... annotationArr) {
                return build(Arrays.asList(annotationArr));
            }

            public Generic build(List<? extends Annotation> list) {
                return build((Collection<? extends AnnotationDescription>) new AnnotationList.ForLoadedAnnotations(list));
            }

            public Generic build(AnnotationDescription... annotationDescriptionArr) {
                return build((Collection<? extends AnnotationDescription>) Arrays.asList(annotationDescriptionArr));
            }

            public Generic build(Collection<? extends AnnotationDescription> collection) {
                return doAnnotate(new ArrayList(collection)).doBuild();
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class OfNonGenericType extends Builder {

                @HashCodeAndEqualsPlugin.ValueHandling(HashCodeAndEqualsPlugin.ValueHandling.Sort.REVERSE_NULLABILITY)
                private final Generic ownerType;
                private final TypeDescription typeDescription;

                /* JADX WARN: Removed duplicated region for block: B:22:0x0039 A[RETURN] */
                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Builder
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public boolean equals(Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    OfNonGenericType ofNonGenericType = (OfNonGenericType) obj;
                    if (!this.typeDescription.equals(ofNonGenericType.typeDescription)) {
                        return false;
                    }
                    Generic generic = this.ownerType;
                    Generic generic2 = ofNonGenericType.ownerType;
                    if (generic2 != null) {
                        return generic != null && generic.equals(generic2);
                    }
                    if (generic != null) {
                        return false;
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Builder
                public int hashCode() {
                    int hashCode = ((super.hashCode() * 31) + this.typeDescription.hashCode()) * 31;
                    Generic generic = this.ownerType;
                    return generic != null ? hashCode + generic.hashCode() : hashCode;
                }

                protected OfNonGenericType(TypeDescription typeDescription) {
                    this(typeDescription, typeDescription.getDeclaringType());
                }

                /* JADX WARN: Illegal instructions before constructor call */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                private OfNonGenericType(TypeDescription typeDescription, TypeDescription typeDescription2) {
                    this(typeDescription, r2);
                    Generic asGenericType;
                    if (typeDescription2 == null) {
                        asGenericType = Generic.UNDEFINED;
                    } else {
                        asGenericType = typeDescription2.asGenericType();
                    }
                }

                protected OfNonGenericType(TypeDescription typeDescription, Generic generic) {
                    this(typeDescription, generic, Collections.emptyList());
                }

                protected OfNonGenericType(TypeDescription typeDescription, Generic generic, List<? extends AnnotationDescription> list) {
                    super(list);
                    this.ownerType = generic;
                    this.typeDescription = typeDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Builder
                protected Builder doAnnotate(List<? extends AnnotationDescription> list) {
                    return new OfNonGenericType(this.typeDescription, this.ownerType, CompoundList.of((List) this.annotations, (List) list));
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Builder
                protected Generic doBuild() {
                    if (this.typeDescription.represents(Void.TYPE) && !this.annotations.isEmpty()) {
                        throw new IllegalArgumentException("The void non-type cannot be annotated");
                    }
                    return new OfNonGenericType.Latent(this.typeDescription, this.ownerType, new AnnotationSource.Explicit(this.annotations));
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class OfParameterizedType extends Builder {
                private final Generic ownerType;
                private final List<? extends Generic> parameterTypes;
                private final TypeDescription rawType;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Builder
                public boolean equals(Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    if (obj == null || getClass() != obj.getClass()) {
                        return false;
                    }
                    OfParameterizedType ofParameterizedType = (OfParameterizedType) obj;
                    return this.rawType.equals(ofParameterizedType.rawType) && this.ownerType.equals(ofParameterizedType.ownerType) && this.parameterTypes.equals(ofParameterizedType.parameterTypes);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Builder
                public int hashCode() {
                    return (((((super.hashCode() * 31) + this.rawType.hashCode()) * 31) + this.ownerType.hashCode()) * 31) + this.parameterTypes.hashCode();
                }

                protected OfParameterizedType(TypeDescription typeDescription, Generic generic, List<? extends Generic> list) {
                    this(typeDescription, generic, list, Collections.emptyList());
                }

                protected OfParameterizedType(TypeDescription typeDescription, Generic generic, List<? extends Generic> list, List<? extends AnnotationDescription> list2) {
                    super(list2);
                    this.rawType = typeDescription;
                    this.ownerType = generic;
                    this.parameterTypes = list;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Builder
                protected Builder doAnnotate(List<? extends AnnotationDescription> list) {
                    return new OfParameterizedType(this.rawType, this.ownerType, this.parameterTypes, CompoundList.of((List) this.annotations, (List) list));
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Builder
                protected Generic doBuild() {
                    return new OfParameterizedType.Latent(this.rawType, this.ownerType, this.parameterTypes, new AnnotationSource.Explicit(this.annotations));
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class OfGenericArrayType extends Builder {
                private final Generic componentType;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Builder
                public boolean equals(Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.componentType.equals(((OfGenericArrayType) obj).componentType);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Builder
                public int hashCode() {
                    return (super.hashCode() * 31) + this.componentType.hashCode();
                }

                protected OfGenericArrayType(Generic generic) {
                    this(generic, Collections.emptyList());
                }

                protected OfGenericArrayType(Generic generic, List<? extends AnnotationDescription> list) {
                    super(list);
                    this.componentType = generic;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Builder
                protected Builder doAnnotate(List<? extends AnnotationDescription> list) {
                    return new OfGenericArrayType(this.componentType, CompoundList.of((List) this.annotations, (List) list));
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Builder
                protected Generic doBuild() {
                    return new OfGenericArray.Latent(this.componentType, new AnnotationSource.Explicit(this.annotations));
                }
            }

            @HashCodeAndEqualsPlugin.Enhance
            protected static class OfTypeVariable extends Builder {
                private final String symbol;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Builder
                public boolean equals(Object obj) {
                    if (!super.equals(obj)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    return obj != null && getClass() == obj.getClass() && this.symbol.equals(((OfTypeVariable) obj).symbol);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Builder
                public int hashCode() {
                    return (super.hashCode() * 31) + this.symbol.hashCode();
                }

                protected OfTypeVariable(String str) {
                    this(str, Collections.emptyList());
                }

                protected OfTypeVariable(String str, List<? extends AnnotationDescription> list) {
                    super(list);
                    this.symbol = str;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Builder
                protected Builder doAnnotate(List<? extends AnnotationDescription> list) {
                    return new OfTypeVariable(this.symbol, CompoundList.of((List) this.annotations, (List) list));
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.Builder
                protected Generic doBuild() {
                    return new OfTypeVariable.Symbolic(this.symbol, new AnnotationSource.Explicit(this.annotations));
                }
            }
        }
    }

    public static abstract class AbstractBase extends TypeVariableSource.AbstractBase implements TypeDescription {
        public static final boolean RAW_TYPES;

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public TypeDescription asErasure() {
            return this;
        }

        static {
            boolean z;
            try {
                z = Boolean.parseBoolean((String) AccessController.doPrivileged(new GetSystemPropertyAction(TypeDefinition.RAW_TYPES_PROPERTY)));
            } catch (Exception unused) {
                z = false;
            }
            RAW_TYPES = z;
        }

        private static boolean isAssignable(TypeDescription typeDescription, TypeDescription typeDescription2) {
            if (typeDescription.equals(typeDescription2)) {
                return true;
            }
            if (typeDescription2.isArray()) {
                if (typeDescription.isArray()) {
                    return isAssignable(typeDescription.getComponentType(), typeDescription2.getComponentType());
                }
                return typeDescription.represents(Object.class) || ARRAY_INTERFACES.contains(typeDescription.asGenericType());
            }
            if (typeDescription.represents(Object.class)) {
                return !typeDescription2.isPrimitive();
            }
            Generic superClass = typeDescription2.getSuperClass();
            if (superClass != null && typeDescription.isAssignableFrom(superClass.asErasure())) {
                return true;
            }
            if (typeDescription.isInterface()) {
                Iterator it = typeDescription2.getInterfaces().asErasures().iterator();
                while (it.hasNext()) {
                    if (typeDescription.isAssignableFrom((TypeDescription) it.next())) {
                        return true;
                    }
                }
            }
            return false;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isAssignableFrom(Class<?> cls) {
            return isAssignableFrom(ForLoadedType.of(cls));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isAssignableFrom(TypeDescription typeDescription) {
            return isAssignable(this, typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isAssignableTo(Class<?> cls) {
            return isAssignableTo(ForLoadedType.of(cls));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isAssignableTo(TypeDescription typeDescription) {
            return isAssignable(typeDescription, this);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isInHierarchyWith(Class<?> cls) {
            return isAssignableTo(cls) || isAssignableFrom(cls);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isInHierarchyWith(TypeDescription typeDescription) {
            return isAssignableTo(typeDescription) || isAssignableFrom(typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public Generic asGenericType() {
            return new Generic.OfNonGenericType.ForErasure(this);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public TypeDefinition.Sort getSort() {
            return TypeDefinition.Sort.NON_GENERIC;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isInstance(Object obj) {
            return isAssignableFrom(obj.getClass());
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isAnnotationValue(Object obj) {
            if ((represents(Class.class) && (obj instanceof TypeDescription)) || (((obj instanceof AnnotationDescription) && ((AnnotationDescription) obj).getAnnotationType().equals(this)) || (((obj instanceof EnumerationDescription) && ((EnumerationDescription) obj).getEnumerationType().equals(this)) || ((represents(String.class) && (obj instanceof String)) || ((represents(Boolean.TYPE) && (obj instanceof Boolean)) || ((represents(Byte.TYPE) && (obj instanceof Byte)) || ((represents(Short.TYPE) && (obj instanceof Short)) || ((represents(Character.TYPE) && (obj instanceof Character)) || ((represents(Integer.TYPE) && (obj instanceof Integer)) || ((represents(Long.TYPE) && (obj instanceof Long)) || ((represents(Float.TYPE) && (obj instanceof Float)) || ((represents(Double.TYPE) && (obj instanceof Double)) || ((represents(String[].class) && (obj instanceof String[])) || ((represents(boolean[].class) && (obj instanceof boolean[])) || ((represents(byte[].class) && (obj instanceof byte[])) || ((represents(short[].class) && (obj instanceof short[])) || ((represents(char[].class) && (obj instanceof char[])) || ((represents(int[].class) && (obj instanceof int[])) || ((represents(long[].class) && (obj instanceof long[])) || ((represents(float[].class) && (obj instanceof float[])) || ((represents(double[].class) && (obj instanceof double[])) || (represents(Class[].class) && (obj instanceof TypeDescription[]))))))))))))))))))))))) {
                return true;
            }
            if (isAssignableTo(Annotation[].class) && (obj instanceof AnnotationDescription[])) {
                for (AnnotationDescription annotationDescription : (AnnotationDescription[]) obj) {
                    if (!annotationDescription.getAnnotationType().equals(getComponentType())) {
                        return false;
                    }
                }
                return true;
            }
            if (!isAssignableTo(Enum[].class) || !(obj instanceof EnumerationDescription[])) {
                return false;
            }
            for (EnumerationDescription enumerationDescription : (EnumerationDescription[]) obj) {
                if (!enumerationDescription.getEnumerationType().equals(getComponentType())) {
                    return false;
                }
            }
            return true;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getInternalName() {
            return getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public int getActualModifiers(boolean z) {
            int i;
            int modifiers = getModifiers() | (getDeclaredAnnotations().isAnnotationPresent(Deprecated.class) ? 131072 : 0);
            if (isPrivate()) {
                i = modifiers & (-11);
            } else {
                i = isProtected() ? (modifiers & (-13)) | 1 : modifiers & (-9);
            }
            return z ? i | 32 : i;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0087 A[Catch: GenericSignatureFormatError -> 0x00b4, TryCatch #0 {GenericSignatureFormatError -> 0x00b4, blocks: (B:2:0x0000, B:3:0x000f, B:5:0x0016, B:6:0x002b, B:8:0x0031, B:10:0x0043, B:12:0x004c, B:13:0x0048, B:18:0x0055, B:20:0x005b, B:21:0x005d, B:23:0x006b, B:27:0x0079, B:28:0x0081, B:30:0x0087, B:32:0x009b, B:45:0x00ac, B:48:0x00b1), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00ac A[Catch: GenericSignatureFormatError -> 0x00b4, TryCatch #0 {GenericSignatureFormatError -> 0x00b4, blocks: (B:2:0x0000, B:3:0x000f, B:5:0x0016, B:6:0x002b, B:8:0x0031, B:10:0x0043, B:12:0x004c, B:13:0x0048, B:18:0x0055, B:20:0x005b, B:21:0x005d, B:23:0x006b, B:27:0x0079, B:28:0x0081, B:30:0x0087, B:32:0x009b, B:45:0x00ac, B:48:0x00b1), top: B:1:0x0000 }] */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00b1 A[Catch: GenericSignatureFormatError -> 0x00b4, TRY_LEAVE, TryCatch #0 {GenericSignatureFormatError -> 0x00b4, blocks: (B:2:0x0000, B:3:0x000f, B:5:0x0016, B:6:0x002b, B:8:0x0031, B:10:0x0043, B:12:0x004c, B:13:0x0048, B:18:0x0055, B:20:0x005b, B:21:0x005d, B:23:0x006b, B:27:0x0079, B:28:0x0081, B:30:0x0087, B:32:0x009b, B:45:0x00ac, B:48:0x00b1), top: B:1:0x0000 }] */
        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public String getGenericSignature() {
            boolean z;
            SignatureVisitor visitClassBound;
            try {
                SignatureWriter signatureWriter = new SignatureWriter();
                boolean z2 = false;
                for (Generic generic : getTypeVariables()) {
                    signatureWriter.visitFormalTypeParameter(generic.getSymbol());
                    for (Generic generic2 : generic.getUpperBounds()) {
                        if (generic2.asErasure().isInterface()) {
                            visitClassBound = signatureWriter.visitInterfaceBound();
                        } else {
                            visitClassBound = signatureWriter.visitClassBound();
                        }
                        generic2.accept(new Generic.Visitor.ForSignatureVisitor(visitClassBound));
                    }
                    z2 = true;
                }
                Generic superClass = getSuperClass();
                if (superClass == null) {
                    superClass = Generic.OBJECT;
                }
                superClass.accept(new Generic.Visitor.ForSignatureVisitor(signatureWriter.visitSuperclass()));
                if (!z2 && superClass.getSort().isNonGeneric()) {
                    z = false;
                    for (Generic generic3 : getInterfaces()) {
                        generic3.accept(new Generic.Visitor.ForSignatureVisitor(signatureWriter.visitInterface()));
                        z = z || !generic3.getSort().isNonGeneric();
                    }
                    return !z ? signatureWriter.toString() : NON_GENERIC_SIGNATURE;
                }
                z = true;
                while (r3.hasNext()) {
                }
                if (!z) {
                }
            } catch (GenericSignatureFormatError unused) {
                return NON_GENERIC_SIGNATURE;
            }
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isSamePackage(TypeDescription typeDescription) {
            PackageDescription packageDescription = getPackage();
            PackageDescription packageDescription2 = typeDescription.getPackage();
            if (packageDescription == null || packageDescription2 == null) {
                return packageDescription == packageDescription2;
            }
            return packageDescription.equals(packageDescription2);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement
        public boolean isVisibleTo(TypeDescription typeDescription) {
            return isPrimitive() || (!isArray() ? !(isPublic() || isProtected() || isSamePackage(typeDescription)) : !getComponentType().isVisibleTo(typeDescription));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement
        public boolean isAccessibleTo(TypeDescription typeDescription) {
            return isPrimitive() || (!isArray() ? !(isPublic() || isSamePackage(typeDescription)) : !getComponentType().isVisibleTo(typeDescription));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public AnnotationList getInheritedAnnotations() {
            Generic superClass = getSuperClass();
            AnnotationList declaredAnnotations = getDeclaredAnnotations();
            if (superClass == null) {
                return declaredAnnotations;
            }
            HashSet hashSet = new HashSet();
            Iterator it = declaredAnnotations.iterator();
            while (it.hasNext()) {
                hashSet.add(((AnnotationDescription) it.next()).getAnnotationType());
            }
            return new AnnotationList.Explicit((List<? extends AnnotationDescription>) CompoundList.of((List) declaredAnnotations, (List) superClass.asErasure().getInheritedAnnotations().inherited(hashSet)));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement
        public String getActualName() {
            if (isArray()) {
                TypeDescription typeDescription = this;
                int i = 0;
                do {
                    i++;
                    typeDescription = typeDescription.getComponentType();
                } while (typeDescription.isArray());
                StringBuilder sb = new StringBuilder();
                sb.append(typeDescription.getActualName());
                for (int i2 = 0; i2 < i; i2++) {
                    sb.append("[]");
                }
                return sb.toString();
            }
            return getName();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isPrimitiveWrapper() {
            return represents(Boolean.class) || represents(Byte.class) || represents(Short.class) || represents(Character.class) || represents(Integer.class) || represents(Long.class) || represents(Float.class) || represents(Double.class);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isAnnotationReturnType() {
            return isPrimitive() || represents(String.class) || (isAssignableTo(Enum.class) && !represents(Enum.class)) || ((isAssignableTo(Annotation.class) && !represents(Annotation.class)) || represents(Class.class) || (isArray() && !getComponentType().isArray() && getComponentType().isAnnotationReturnType()));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isAnnotationValue() {
            return isPrimitive() || represents(String.class) || isAssignableTo(TypeDescription.class) || isAssignableTo(AnnotationDescription.class) || isAssignableTo(EnumerationDescription.class) || (isArray() && !getComponentType().isArray() && getComponentType().isAnnotationValue());
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public boolean represents(Type type) {
            return equals(TypeDefinition.Sort.describe(type));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public String getTypeName() {
            return getName();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
        public TypeVariableSource getEnclosingSource() {
            MethodDescription.InDefinedShape enclosingMethod = getEnclosingMethod();
            return enclosingMethod == null ? isStatic() ? TypeVariableSource.UNDEFINED : getEnclosingType() : enclosingMethod;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
        public <T> T accept(TypeVariableSource.Visitor<T> visitor) {
            return visitor.onType(this);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isPackageType() {
            return getSimpleName().equals(PackageDescription.PACKAGE_CLASS_NAME);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
        public boolean isGenerified() {
            if (!getTypeVariables().isEmpty()) {
                return true;
            }
            if (isStatic()) {
                return false;
            }
            TypeDescription declaringType = getDeclaringType();
            return declaringType != null && declaringType.isGenerified();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public int getInnerClassCount() {
            TypeDescription declaringType;
            if (isStatic() || (declaringType = getDeclaringType()) == null) {
                return 0;
            }
            return declaringType.getInnerClassCount() + 1;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isInnerClass() {
            return !isStatic() && isNestedClass();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isNestedClass() {
            return getDeclaringType() != null;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeDescription asBoxed() {
            if (represents(Boolean.TYPE)) {
                return ForLoadedType.of(Boolean.class);
            }
            if (represents(Byte.TYPE)) {
                return ForLoadedType.of(Byte.class);
            }
            if (represents(Short.TYPE)) {
                return ForLoadedType.of(Short.class);
            }
            if (represents(Character.TYPE)) {
                return ForLoadedType.of(Character.class);
            }
            if (represents(Integer.TYPE)) {
                return ForLoadedType.of(Integer.class);
            }
            if (represents(Long.TYPE)) {
                return ForLoadedType.of(Long.class);
            }
            if (represents(Float.TYPE)) {
                return ForLoadedType.of(Float.class);
            }
            return represents(Double.TYPE) ? ForLoadedType.of(Double.class) : this;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeDescription asUnboxed() {
            if (represents(Boolean.class)) {
                return ForLoadedType.of(Boolean.TYPE);
            }
            if (represents(Byte.class)) {
                return ForLoadedType.of(Byte.TYPE);
            }
            if (represents(Short.class)) {
                return ForLoadedType.of(Short.TYPE);
            }
            if (represents(Character.class)) {
                return ForLoadedType.of(Character.TYPE);
            }
            if (represents(Integer.class)) {
                return ForLoadedType.of(Integer.TYPE);
            }
            if (represents(Long.class)) {
                return ForLoadedType.of(Long.TYPE);
            }
            if (represents(Float.class)) {
                return ForLoadedType.of(Float.TYPE);
            }
            return represents(Double.class) ? ForLoadedType.of(Double.TYPE) : this;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public Object getDefaultValue() {
            if (represents(Boolean.TYPE)) {
                return false;
            }
            if (represents(Byte.TYPE)) {
                return (byte) 0;
            }
            if (represents(Short.TYPE)) {
                return (short) 0;
            }
            if (represents(Character.TYPE)) {
                return (char) 0;
            }
            if (represents(Integer.TYPE)) {
                return 0;
            }
            if (represents(Long.TYPE)) {
                return 0L;
            }
            if (represents(Float.TYPE)) {
                return Float.valueOf(0.0f);
            }
            if (represents(Double.TYPE)) {
                return Double.valueOf(0.0d);
            }
            return null;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isNestHost() {
            return equals(getNestHost());
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isNestMateOf(Class<?> cls) {
            return isNestMateOf(ForLoadedType.of(cls));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isNestMateOf(TypeDescription typeDescription) {
            return getNestHost().equals(typeDescription.getNestHost());
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isMemberType() {
            return (isLocalType() || isAnonymousType() || getDeclaringType() == null) ? false : true;
        }

        @Override // java.lang.Iterable
        public Iterator<TypeDefinition> iterator() {
            return new TypeDefinition.SuperClassIterator(this);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TypeDefinition)) {
                return false;
            }
            TypeDefinition typeDefinition = (TypeDefinition) obj;
            return typeDefinition.getSort().isNonGeneric() && getName().equals(typeDefinition.asErasure().getName());
        }

        public int hashCode() {
            return getName().hashCode();
        }

        public String toString() {
            String concat;
            StringBuilder sb = new StringBuilder();
            if (isPrimitive()) {
                concat = "";
            } else {
                concat = (isInterface() ? "interface" : "class").concat(" ");
            }
            return sb.append(concat).append(getName()).toString();
        }

        public static abstract class OfSimpleType extends AbstractBase {
            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public boolean isArray() {
                return false;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public boolean isPrimitive() {
                return false;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public TypeDescription getComponentType() {
                return TypeDescription.UNDEFINED;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement
            public String getDescriptor() {
                return "L" + getInternalName() + ";";
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
            public String getCanonicalName() {
                if (isAnonymousType() || isLocalType()) {
                    return NO_NAME;
                }
                String internalName = getInternalName();
                TypeDescription enclosingType = getEnclosingType();
                if (enclosingType != null && internalName.startsWith(enclosingType.getInternalName() + "$")) {
                    return enclosingType.getCanonicalName() + "." + internalName.substring(enclosingType.getInternalName().length() + 1);
                }
                return getName();
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x0042  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x004a -> B:6:0x002f). Please report as a decompilation issue!!! */
            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public String getSimpleName() {
                int lastIndexOf;
                String internalName = getInternalName();
                TypeDescription enclosingType = getEnclosingType();
                if (enclosingType != null && internalName.startsWith(enclosingType.getInternalName() + "$")) {
                    lastIndexOf = enclosingType.getInternalName().length();
                    lastIndexOf++;
                    if (lastIndexOf < internalName.length()) {
                    }
                    return internalName.substring(lastIndexOf);
                }
                lastIndexOf = internalName.lastIndexOf(47);
                if (lastIndexOf == -1) {
                    return internalName;
                }
                if (lastIndexOf < internalName.length() || Character.isLetter(internalName.charAt(lastIndexOf))) {
                    return internalName.substring(lastIndexOf);
                }
                lastIndexOf++;
                if (lastIndexOf < internalName.length()) {
                }
                return internalName.substring(lastIndexOf);
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            public StackSize getStackSize() {
                return StackSize.SINGLE;
            }

            public static abstract class WithDelegation extends OfSimpleType {
                protected abstract TypeDescription delegate();

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase.OfSimpleType, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public /* bridge */ /* synthetic */ TypeDefinition getComponentType() {
                    return super.getComponentType();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public Generic getSuperClass() {
                    return delegate().getSuperClass();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public TypeList.Generic getInterfaces() {
                    return delegate().getInterfaces();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public FieldList<FieldDescription.InDefinedShape> getDeclaredFields() {
                    return delegate().getDeclaredFields();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
                public MethodList<MethodDescription.InDefinedShape> getDeclaredMethods() {
                    return delegate().getDeclaredMethods();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
                public TypeDescription getDeclaringType() {
                    return delegate().getDeclaringType();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
                public MethodDescription.InDefinedShape getEnclosingMethod() {
                    return delegate().getEnclosingMethod();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
                public TypeDescription getEnclosingType() {
                    return delegate().getEnclosingType();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
                public TypeList getDeclaredTypes() {
                    return delegate().getDeclaredTypes();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
                public boolean isAnonymousType() {
                    return delegate().isAnonymousType();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
                public boolean isLocalType() {
                    return delegate().isLocalType();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDescription
                public boolean isMemberType() {
                    return delegate().isMemberType();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
                public PackageDescription getPackage() {
                    return delegate().getPackage();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return delegate().getDeclaredAnnotations();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
                public TypeList.Generic getTypeVariables() {
                    return delegate().getTypeVariables();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
                public int getModifiers() {
                    return delegate().getModifiers();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.ByteCodeElement
                public String getGenericSignature() {
                    return delegate().getGenericSignature();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDescription
                public int getActualModifiers(boolean z) {
                    return delegate().getActualModifiers(z);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
                public TypeDescription getNestHost() {
                    return delegate().getNestHost();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
                public TypeList getNestMembers() {
                    return delegate().getNestMembers();
                }
            }
        }
    }

    public static class ForLoadedType extends AbstractBase implements Serializable {
        private static final Dispatcher DISPATCHER = (Dispatcher) AccessController.doPrivileged(Dispatcher.CreationAction.INSTANCE);
        private static final Map<Class<?>, TypeDescription> TYPE_CACHE;
        private static final long serialVersionUID = 1;
        private transient /* synthetic */ AnnotationList declaredAnnotations;
        private transient /* synthetic */ FieldList declaredFields;
        private transient /* synthetic */ MethodList declaredMethods;
        private final Class<?> type;

        static {
            HashMap hashMap = new HashMap();
            TYPE_CACHE = hashMap;
            hashMap.put(TargetType.class, new ForLoadedType(TargetType.class));
            hashMap.put(Object.class, new ForLoadedType(Object.class));
            hashMap.put(String.class, new ForLoadedType(String.class));
            hashMap.put(Boolean.class, new ForLoadedType(Boolean.class));
            hashMap.put(Byte.class, new ForLoadedType(Byte.class));
            hashMap.put(Short.class, new ForLoadedType(Short.class));
            hashMap.put(Character.class, new ForLoadedType(Character.class));
            hashMap.put(Integer.class, new ForLoadedType(Integer.class));
            hashMap.put(Long.class, new ForLoadedType(Long.class));
            hashMap.put(Float.class, new ForLoadedType(Float.class));
            hashMap.put(Double.class, new ForLoadedType(Double.class));
            hashMap.put(Void.TYPE, new ForLoadedType(Void.TYPE));
            hashMap.put(Boolean.TYPE, new ForLoadedType(Boolean.TYPE));
            hashMap.put(Byte.TYPE, new ForLoadedType(Byte.TYPE));
            hashMap.put(Short.TYPE, new ForLoadedType(Short.TYPE));
            hashMap.put(Character.TYPE, new ForLoadedType(Character.TYPE));
            hashMap.put(Integer.TYPE, new ForLoadedType(Integer.TYPE));
            hashMap.put(Long.TYPE, new ForLoadedType(Long.TYPE));
            hashMap.put(Float.TYPE, new ForLoadedType(Float.TYPE));
            hashMap.put(Double.TYPE, new ForLoadedType(Double.TYPE));
        }

        public ForLoadedType(Class<?> cls) {
            this.type = cls;
        }

        public static String getName(Class<?> cls) {
            String name = cls.getName();
            int indexOf = name.indexOf(47);
            return indexOf == -1 ? name : name.substring(0, indexOf);
        }

        public static TypeDescription of(Class<?> cls) {
            TypeDescription typeDescription = TYPE_CACHE.get(cls);
            return typeDescription == null ? new ForLoadedType(cls) : typeDescription;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isAssignableFrom(Class<?> cls) {
            return this.type.isAssignableFrom(cls) || super.isAssignableFrom(cls);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isAssignableFrom(TypeDescription typeDescription) {
            return ((typeDescription instanceof ForLoadedType) && this.type.isAssignableFrom(((ForLoadedType) typeDescription).type)) || super.isAssignableFrom(typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isAssignableTo(Class<?> cls) {
            return cls.isAssignableFrom(this.type) || super.isAssignableTo(cls);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isAssignableTo(TypeDescription typeDescription) {
            return ((typeDescription instanceof ForLoadedType) && ((ForLoadedType) typeDescription).type.isAssignableFrom(this.type)) || super.isAssignableTo(typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isInHierarchyWith(Class<?> cls) {
            return cls.isAssignableFrom(this.type) || this.type.isAssignableFrom(cls) || super.isInHierarchyWith(cls);
        }

        /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
        
            if (r3.type.isAssignableFrom(r0.type) == false) goto L8;
         */
        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean isInHierarchyWith(TypeDescription typeDescription) {
            if (typeDescription instanceof ForLoadedType) {
                ForLoadedType forLoadedType = (ForLoadedType) typeDescription;
                if (!forLoadedType.type.isAssignableFrom(this.type)) {
                }
            }
            return super.isInHierarchyWith(typeDescription);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public boolean represents(Type type) {
            return type == this.type || super.represents(type);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public TypeDescription getComponentType() {
            Class<?> componentType = this.type.getComponentType();
            if (componentType == null) {
                return TypeDescription.UNDEFINED;
            }
            return of(componentType);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public boolean isArray() {
            return this.type.isArray();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public boolean isPrimitive() {
            return this.type.isPrimitive();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable.AbstractBase, org.modelmapper.internal.bytebuddy.description.ModifierReviewable.ForTypeDefinition
        public boolean isAnnotation() {
            return this.type.isAnnotation();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public Generic getSuperClass() {
            return RAW_TYPES ? this.type.getSuperclass() == null ? Generic.UNDEFINED : Generic.OfNonGenericType.ForLoadedType.of(this.type.getSuperclass()) : this.type.getSuperclass() == null ? Generic.UNDEFINED : new Generic.LazyProjection.ForLoadedSuperClass(this.type);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public TypeList.Generic getInterfaces() {
            return RAW_TYPES ? isArray() ? ARRAY_INTERFACES : new TypeList.Generic.ForLoadedTypes(this.type.getInterfaces()) : isArray() ? ARRAY_INTERFACES : new TypeList.Generic.OfLoadedInterfaceTypes(this.type);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
        public TypeDescription getDeclaringType() {
            Class<?> declaringClass = this.type.getDeclaringClass();
            if (declaringClass == null) {
                return TypeDescription.UNDEFINED;
            }
            return of(declaringClass);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public MethodDescription.InDefinedShape getEnclosingMethod() {
            Method enclosingMethod = this.type.getEnclosingMethod();
            Constructor<?> enclosingConstructor = this.type.getEnclosingConstructor();
            if (enclosingMethod != null) {
                return new MethodDescription.ForLoadedMethod(enclosingMethod);
            }
            if (enclosingConstructor != null) {
                return new MethodDescription.ForLoadedConstructor(enclosingConstructor);
            }
            return MethodDescription.UNDEFINED;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeDescription getEnclosingType() {
            Class<?> enclosingClass = this.type.getEnclosingClass();
            if (enclosingClass == null) {
                return TypeDescription.UNDEFINED;
            }
            return of(enclosingClass);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeList getDeclaredTypes() {
            return new TypeList.ForLoadedTypes(this.type.getDeclaredClasses());
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public String getSimpleName() {
            String simpleName = this.type.getSimpleName();
            int indexOf = simpleName.indexOf(47);
            if (indexOf == -1) {
                return simpleName;
            }
            StringBuilder sb = new StringBuilder(simpleName.substring(0, indexOf));
            for (Class<?> cls = this.type; cls.isArray(); cls = cls.getComponentType()) {
                sb.append("[]");
            }
            return sb.toString();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isAnonymousType() {
            return this.type.isAnonymousClass();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isLocalType() {
            return this.type.isLocalClass();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isMemberType() {
            return this.type.isMemberClass();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        @CachedReturnPlugin.Enhance("declaredFields")
        public FieldList<FieldDescription.InDefinedShape> getDeclaredFields() {
            FieldList.ForLoadedFields forLoadedFields = this.declaredFields != null ? null : new FieldList.ForLoadedFields(this.type.getDeclaredFields());
            if (forLoadedFields == null) {
                return this.declaredFields;
            }
            this.declaredFields = forLoadedFields;
            return forLoadedFields;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        @CachedReturnPlugin.Enhance("declaredMethods")
        public MethodList<MethodDescription.InDefinedShape> getDeclaredMethods() {
            MethodList.ForLoadedMethods forLoadedMethods = this.declaredMethods != null ? null : new MethodList.ForLoadedMethods(this.type);
            if (forLoadedMethods == null) {
                return this.declaredMethods;
            }
            this.declaredMethods = forLoadedMethods;
            return forLoadedMethods;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public PackageDescription getPackage() {
            if (this.type.isArray() || this.type.isPrimitive()) {
                return PackageDescription.UNDEFINED;
            }
            Package r0 = this.type.getPackage();
            if (r0 == null) {
                String name = this.type.getName();
                int lastIndexOf = name.lastIndexOf(46);
                if (lastIndexOf == -1) {
                    return new PackageDescription.Simple("");
                }
                return new PackageDescription.Simple(name.substring(0, lastIndexOf));
            }
            return new PackageDescription.ForLoadedPackage(r0);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public StackSize getStackSize() {
            return StackSize.of(this.type);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getName() {
            return getName(this.type);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public String getCanonicalName() {
            String canonicalName = this.type.getCanonicalName();
            if (canonicalName == null) {
                return NO_NAME;
            }
            int indexOf = canonicalName.indexOf(47);
            if (indexOf == -1) {
                return canonicalName;
            }
            StringBuilder sb = new StringBuilder(canonicalName.substring(0, indexOf));
            for (Class<?> cls = this.type; cls.isArray(); cls = cls.getComponentType()) {
                sb.append("[]");
            }
            return sb.toString();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement
        public String getDescriptor() {
            String name = this.type.getName();
            int indexOf = name.indexOf(47);
            if (indexOf == -1) {
                return org.modelmapper.internal.asm.Type.getDescriptor(this.type);
            }
            return "L" + name.substring(0, indexOf).replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + ";";
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
            return this.type.getModifiers();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
        public TypeList.Generic getTypeVariables() {
            if (RAW_TYPES) {
                return new TypeList.Generic.Empty();
            }
            return TypeList.Generic.ForLoadedTypes.OfTypeVariables.of((GenericDeclaration) this.type);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
        @CachedReturnPlugin.Enhance("declaredAnnotations")
        public AnnotationList getDeclaredAnnotations() {
            AnnotationList.ForLoadedAnnotations forLoadedAnnotations = this.declaredAnnotations != null ? null : new AnnotationList.ForLoadedAnnotations(this.type.getDeclaredAnnotations());
            if (forLoadedAnnotations == null) {
                return this.declaredAnnotations;
            }
            this.declaredAnnotations = forLoadedAnnotations;
            return forLoadedAnnotations;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public Generic asGenericType() {
            return Generic.OfNonGenericType.ForLoadedType.of(this.type);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeDescription getNestHost() {
            return of(DISPATCHER.getNestHost(this.type));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeList getNestMembers() {
            return new TypeList.ForLoadedTypes(DISPATCHER.getNestMembers(this.type));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isNestHost() {
            return DISPATCHER.getNestHost(this.type) == this.type;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isNestMateOf(Class<?> cls) {
            return DISPATCHER.isNestmateOf(this.type, cls) || super.isNestMateOf(of(cls));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isNestMateOf(TypeDescription typeDescription) {
            return ((typeDescription instanceof ForLoadedType) && DISPATCHER.isNestmateOf(this.type, ((ForLoadedType) typeDescription).type)) || super.isNestMateOf(typeDescription);
        }

        protected interface Dispatcher {
            Class<?> getNestHost(Class<?> cls);

            Class<?>[] getNestMembers(Class<?> cls);

            boolean isNestmateOf(Class<?> cls, Class<?> cls2);

            public enum CreationAction implements PrivilegedAction<Dispatcher> {
                INSTANCE;

                @Override // java.security.PrivilegedAction
                public Dispatcher run() {
                    try {
                        return new ForJava11CapableVm(Class.class.getMethod("getNestHost", new Class[0]), Class.class.getMethod("getNestMembers", new Class[0]), Class.class.getMethod("isNestmateOf", Class.class));
                    } catch (NoSuchMethodException unused) {
                        return ForLegacyVm.INSTANCE;
                    }
                }
            }

            public enum ForLegacyVm implements Dispatcher {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.ForLoadedType.Dispatcher
                public Class<?> getNestHost(Class<?> cls) {
                    return cls;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.ForLoadedType.Dispatcher
                public boolean isNestmateOf(Class<?> cls, Class<?> cls2) {
                    return cls == cls2;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.ForLoadedType.Dispatcher
                public Class<?>[] getNestMembers(Class<?> cls) {
                    return new Class[]{cls};
                }
            }

            public static class ForJava11CapableVm implements Dispatcher {
                private final Method getNestHost;
                private final Method getNestMembers;
                private final Method isNestmateOf;

                protected ForJava11CapableVm(Method method, Method method2, Method method3) {
                    this.getNestHost = method;
                    this.getNestMembers = method2;
                    this.isNestmateOf = method3;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.ForLoadedType.Dispatcher
                public Class<?> getNestHost(Class<?> cls) {
                    try {
                        return (Class) this.getNestHost.invoke(cls, new Object[0]);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Could not access Class::getNestHost", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Could not invoke Class:getNestHost", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.ForLoadedType.Dispatcher
                public Class<?>[] getNestMembers(Class<?> cls) {
                    try {
                        return (Class[]) this.getNestMembers.invoke(cls, new Object[0]);
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Could not access Class::getNestMembers", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Could not invoke Class:getNestMembers", e2.getCause());
                    }
                }

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.ForLoadedType.Dispatcher
                public boolean isNestmateOf(Class<?> cls, Class<?> cls2) {
                    try {
                        return ((Boolean) this.isNestmateOf.invoke(cls, cls2)).booleanValue();
                    } catch (IllegalAccessException e) {
                        throw new IllegalStateException("Could not access Class::isNestmateOf", e);
                    } catch (InvocationTargetException e2) {
                        throw new IllegalStateException("Could not invoke Class:isNestmateOf", e2.getCause());
                    }
                }
            }
        }
    }

    public static class ArrayProjection extends AbstractBase {
        private static final int ARRAY_EXCLUDED = 8712;
        private static final int ARRAY_IMPLIED = 1040;
        private final int arity;
        private final TypeDescription componentType;

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeDescription getNestHost() {
            return this;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isAnonymousType() {
            return false;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public boolean isArray() {
            return true;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isLocalType() {
            return false;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isMemberType() {
            return false;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public boolean isPrimitive() {
            return false;
        }

        protected ArrayProjection(TypeDescription typeDescription, int i) {
            this.componentType = typeDescription;
            this.arity = i;
        }

        public static TypeDescription of(TypeDescription typeDescription) {
            return of(typeDescription, 1);
        }

        public static TypeDescription of(TypeDescription typeDescription, int i) {
            if (i < 0) {
                throw new IllegalArgumentException("Arrays cannot have a negative arity");
            }
            while (typeDescription.isArray()) {
                typeDescription = typeDescription.getComponentType();
                i++;
            }
            return i == 0 ? typeDescription : new ArrayProjection(typeDescription, i);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public TypeDescription getComponentType() {
            int i = this.arity;
            return i == 1 ? this.componentType : new ArrayProjection(this.componentType, i - 1);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public Generic getSuperClass() {
            return Generic.OBJECT;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public TypeList.Generic getInterfaces() {
            return ARRAY_INTERFACES;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public MethodDescription.InDefinedShape getEnclosingMethod() {
            return MethodDescription.UNDEFINED;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeDescription getEnclosingType() {
            return TypeDescription.UNDEFINED;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeList getDeclaredTypes() {
            return new TypeList.Empty();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public String getSimpleName() {
            StringBuilder sb = new StringBuilder(this.componentType.getSimpleName());
            for (int i = 0; i < this.arity; i++) {
                sb.append("[]");
            }
            return sb.toString();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public String getCanonicalName() {
            String canonicalName = this.componentType.getCanonicalName();
            if (canonicalName == null) {
                return NO_NAME;
            }
            StringBuilder sb = new StringBuilder(canonicalName);
            for (int i = 0; i < this.arity; i++) {
                sb.append("[]");
            }
            return sb.toString();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public FieldList<FieldDescription.InDefinedShape> getDeclaredFields() {
            return new FieldList.Empty();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public MethodList<MethodDescription.InDefinedShape> getDeclaredMethods() {
            return new MethodList.Empty();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public StackSize getStackSize() {
            return StackSize.SINGLE;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
        public AnnotationList getDeclaredAnnotations() {
            return new AnnotationList.Empty();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public AnnotationList getInheritedAnnotations() {
            return new AnnotationList.Empty();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public PackageDescription getPackage() {
            return PackageDescription.UNDEFINED;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getName() {
            String descriptor = this.componentType.getDescriptor();
            StringBuilder sb = new StringBuilder(descriptor.length() + this.arity);
            for (int i = 0; i < this.arity; i++) {
                sb.append('[');
            }
            for (int i2 = 0; i2 < descriptor.length(); i2++) {
                char charAt = descriptor.charAt(i2);
                if (charAt == '/') {
                    charAt = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
                }
                sb.append(charAt);
            }
            return sb.toString();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement
        public String getDescriptor() {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < this.arity; i++) {
                sb.append('[');
            }
            return sb.append(this.componentType.getDescriptor()).toString();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
        public TypeDescription getDeclaringType() {
            return TypeDescription.UNDEFINED;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
            return (getComponentType().getModifiers() & (-8713)) | 1040;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
        public TypeList.Generic getTypeVariables() {
            return new TypeList.Generic.Empty();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeList getNestMembers() {
            return new TypeList.Explicit(this);
        }
    }

    public static class Latent extends AbstractBase.OfSimpleType {
        private final List<? extends Generic> interfaces;
        private final int modifiers;
        private final String name;
        private final Generic superClass;

        public Latent(String str, int i, Generic generic, Generic... genericArr) {
            this(str, i, generic, (List<? extends Generic>) Arrays.asList(genericArr));
        }

        public Latent(String str, int i, Generic generic, List<? extends Generic> list) {
            this.name = str;
            this.modifiers = i;
            this.superClass = generic;
            this.interfaces = list;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public Generic getSuperClass() {
            return this.superClass;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public TypeList.Generic getInterfaces() {
            return new TypeList.Generic.Explicit(this.interfaces);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public MethodDescription.InDefinedShape getEnclosingMethod() {
            throw new IllegalStateException("Cannot resolve enclosing method of a latent type description: " + this);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeDescription getEnclosingType() {
            throw new IllegalStateException("Cannot resolve enclosing type of a latent type description: " + this);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeList getDeclaredTypes() {
            throw new IllegalStateException("Cannot resolve inner types of a latent type description: " + this);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isAnonymousType() {
            throw new IllegalStateException("Cannot resolve anonymous type property of a latent type description: " + this);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isLocalType() {
            throw new IllegalStateException("Cannot resolve local class property of a latent type description: " + this);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public FieldList<FieldDescription.InDefinedShape> getDeclaredFields() {
            throw new IllegalStateException("Cannot resolve declared fields of a latent type description: " + this);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public MethodList<MethodDescription.InDefinedShape> getDeclaredMethods() {
            throw new IllegalStateException("Cannot resolve declared methods of a latent type description: " + this);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public PackageDescription getPackage() {
            String name = getName();
            int lastIndexOf = name.lastIndexOf(46);
            return new PackageDescription.Simple(lastIndexOf == -1 ? "" : name.substring(0, lastIndexOf));
        }

        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
        public AnnotationList getDeclaredAnnotations() {
            throw new IllegalStateException("Cannot resolve declared annotations of a latent type description: " + this);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
        public TypeDescription getDeclaringType() {
            throw new IllegalStateException("Cannot resolve declared type of a latent type description: " + this);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
            return this.modifiers;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getName() {
            return this.name;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
        public TypeList.Generic getTypeVariables() {
            throw new IllegalStateException("Cannot resolve type variables of a latent type description: " + this);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeDescription getNestHost() {
            throw new IllegalStateException("Cannot resolve nest host of a latent type description: " + this);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeList getNestMembers() {
            throw new IllegalStateException("Cannot resolve nest mates of a latent type description: " + this);
        }
    }

    public static class ForPackageDescription extends AbstractBase.OfSimpleType {
        private final PackageDescription packageDescription;

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
            return PackageDescription.PACKAGE_MODIFIERS;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeDescription getNestHost() {
            return this;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isAnonymousType() {
            return false;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isLocalType() {
            return false;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isMemberType() {
            return false;
        }

        public ForPackageDescription(PackageDescription packageDescription) {
            this.packageDescription = packageDescription;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public Generic getSuperClass() {
            return Generic.OBJECT;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public TypeList.Generic getInterfaces() {
            return new TypeList.Generic.Empty();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public MethodDescription.InDefinedShape getEnclosingMethod() {
            return MethodDescription.UNDEFINED;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeDescription getEnclosingType() {
            return TypeDescription.UNDEFINED;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeList getDeclaredTypes() {
            return new TypeList.Empty();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public FieldList<FieldDescription.InDefinedShape> getDeclaredFields() {
            return new FieldList.Empty();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public MethodList<MethodDescription.InDefinedShape> getDeclaredMethods() {
            return new MethodList.Empty();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public PackageDescription getPackage() {
            return this.packageDescription;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
        public AnnotationList getDeclaredAnnotations() {
            return this.packageDescription.getDeclaredAnnotations();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
        public TypeDescription getDeclaringType() {
            return TypeDescription.UNDEFINED;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
        public TypeList.Generic getTypeVariables() {
            return new TypeList.Generic.Empty();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getName() {
            return this.packageDescription.getName() + ".package-info";
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeList getNestMembers() {
            return new TypeList.Explicit(this);
        }
    }

    public static class SuperTypeLoading extends AbstractBase {
        private final ClassLoader classLoader;
        private final ClassLoadingDelegate classLoadingDelegate;
        private final TypeDescription delegate;

        public SuperTypeLoading(TypeDescription typeDescription, ClassLoader classLoader) {
            this(typeDescription, classLoader, ClassLoadingDelegate.Simple.INSTANCE);
        }

        public SuperTypeLoading(TypeDescription typeDescription, ClassLoader classLoader, ClassLoadingDelegate classLoadingDelegate) {
            this.delegate = typeDescription;
            this.classLoader = classLoader;
            this.classLoadingDelegate = classLoadingDelegate;
        }

        @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
        public AnnotationList getDeclaredAnnotations() {
            return this.delegate.getDeclaredAnnotations();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
        public int getModifiers() {
            return this.delegate.getModifiers();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
        public TypeList.Generic getTypeVariables() {
            return this.delegate.getTypeVariables();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.ByteCodeElement
        public String getDescriptor() {
            return this.delegate.getDescriptor();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
        public String getName() {
            return this.delegate.getName();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public Generic getSuperClass() {
            Generic superClass = this.delegate.getSuperClass();
            return superClass == null ? Generic.UNDEFINED : new ClassLoadingTypeProjection(superClass, this.classLoader, this.classLoadingDelegate);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public TypeList.Generic getInterfaces() {
            return new ClassLoadingTypeList(this.delegate.getInterfaces(), this.classLoader, this.classLoadingDelegate);
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public FieldList<FieldDescription.InDefinedShape> getDeclaredFields() {
            return this.delegate.getDeclaredFields();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription, org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public MethodList<MethodDescription.InDefinedShape> getDeclaredMethods() {
            return this.delegate.getDeclaredMethods();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public StackSize getStackSize() {
            return this.delegate.getStackSize();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public boolean isArray() {
            return this.delegate.isArray();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public boolean isPrimitive() {
            return this.delegate.isPrimitive();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
        public TypeDescription getComponentType() {
            return this.delegate.getComponentType();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
        public TypeDescription getDeclaringType() {
            return this.delegate.getDeclaringType();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeList getDeclaredTypes() {
            return this.delegate.getDeclaredTypes();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public MethodDescription.InDefinedShape getEnclosingMethod() {
            return this.delegate.getEnclosingMethod();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeDescription getEnclosingType() {
            return this.delegate.getEnclosingType();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public String getSimpleName() {
            return this.delegate.getSimpleName();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public String getCanonicalName() {
            return this.delegate.getCanonicalName();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isAnonymousType() {
            return this.delegate.isAnonymousType();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isLocalType() {
            return this.delegate.isLocalType();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.AbstractBase, org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public boolean isMemberType() {
            return this.delegate.isMemberType();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public PackageDescription getPackage() {
            return this.delegate.getPackage();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeDescription getNestHost() {
            return this.delegate.getNestHost();
        }

        @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription
        public TypeList getNestMembers() {
            return this.delegate.getNestMembers();
        }

        public interface ClassLoadingDelegate {
            Class<?> load(String str, ClassLoader classLoader) throws ClassNotFoundException;

            public enum Simple implements ClassLoadingDelegate {
                INSTANCE;

                @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.SuperTypeLoading.ClassLoadingDelegate
                public Class<?> load(String str, ClassLoader classLoader) throws ClassNotFoundException {
                    return Class.forName(str, false, classLoader);
                }
            }
        }

        protected static class ClassLoadingTypeProjection extends Generic.LazyProjection {
            private final ClassLoader classLoader;
            private final ClassLoadingDelegate classLoadingDelegate;
            private final Generic delegate;
            private transient /* synthetic */ TypeDescription erasure;
            private transient /* synthetic */ TypeList.Generic interfaces;
            private transient /* synthetic */ Generic superClass;

            protected ClassLoadingTypeProjection(Generic generic, ClassLoader classLoader, ClassLoadingDelegate classLoadingDelegate) {
                this.delegate = generic;
                this.classLoader = classLoader;
                this.classLoadingDelegate = classLoadingDelegate;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
            public AnnotationList getDeclaredAnnotations() {
                return this.delegate.getDeclaredAnnotations();
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            @CachedReturnPlugin.Enhance("erasure")
            public TypeDescription asErasure() {
                TypeDescription asErasure;
                if (this.erasure != null) {
                    asErasure = null;
                } else {
                    try {
                        asErasure = ForLoadedType.of(this.classLoadingDelegate.load(this.delegate.asErasure().getName(), this.classLoader));
                    } catch (ClassNotFoundException unused) {
                        asErasure = this.delegate.asErasure();
                    }
                }
                if (asErasure == null) {
                    return this.erasure;
                }
                this.erasure = asErasure;
                return asErasure;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDescription.Generic.LazyProjection
            protected Generic resolve() {
                return this.delegate;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            @CachedReturnPlugin.Enhance("superClass")
            public Generic getSuperClass() {
                Generic superClass;
                if (this.superClass != null) {
                    superClass = null;
                } else {
                    superClass = this.delegate.getSuperClass();
                    if (superClass == null) {
                        superClass = Generic.UNDEFINED;
                    } else {
                        try {
                            superClass = new ClassLoadingTypeProjection(superClass, this.classLoadingDelegate.load(this.delegate.asErasure().getName(), this.classLoader).getClassLoader(), this.classLoadingDelegate);
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                }
                if (superClass == null) {
                    return this.superClass;
                }
                this.superClass = superClass;
                return superClass;
            }

            @Override // org.modelmapper.internal.bytebuddy.description.type.TypeDefinition
            @CachedReturnPlugin.Enhance("interfaces")
            public TypeList.Generic getInterfaces() {
                TypeList.Generic interfaces;
                if (this.interfaces != null) {
                    interfaces = null;
                } else {
                    interfaces = this.delegate.getInterfaces();
                    try {
                        interfaces = new ClassLoadingTypeList(interfaces, this.classLoadingDelegate.load(this.delegate.asErasure().getName(), this.classLoader).getClassLoader(), this.classLoadingDelegate);
                    } catch (ClassNotFoundException unused) {
                    }
                }
                if (interfaces == null) {
                    return this.interfaces;
                }
                this.interfaces = interfaces;
                return interfaces;
            }

            @Override // java.lang.Iterable
            public Iterator<TypeDefinition> iterator() {
                return new TypeDefinition.SuperClassIterator(this);
            }
        }

        protected static class ClassLoadingTypeList extends TypeList.Generic.AbstractBase {
            private final ClassLoader classLoader;
            private final ClassLoadingDelegate classLoadingDelegate;
            private final TypeList.Generic delegate;

            protected ClassLoadingTypeList(TypeList.Generic generic, ClassLoader classLoader, ClassLoadingDelegate classLoadingDelegate) {
                this.delegate = generic;
                this.classLoader = classLoader;
                this.classLoadingDelegate = classLoadingDelegate;
            }

            @Override // java.util.AbstractList, java.util.List
            public Generic get(int i) {
                return new ClassLoadingTypeProjection((Generic) this.delegate.get(i), this.classLoader, this.classLoadingDelegate);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return this.delegate.size();
            }
        }
    }
}
