package org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline;

import androidx.core.view.InputDeviceCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.modelmapper.internal.bytebuddy.ClassFileVersion;
import org.modelmapper.internal.bytebuddy.build.HashCodeAndEqualsPlugin;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationList;
import org.modelmapper.internal.bytebuddy.description.annotation.AnnotationValue;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterDescription;
import org.modelmapper.internal.bytebuddy.description.method.ParameterList;
import org.modelmapper.internal.bytebuddy.description.type.TypeDefinition;
import org.modelmapper.internal.bytebuddy.description.type.TypeDescription;
import org.modelmapper.internal.bytebuddy.description.type.TypeList;
import org.modelmapper.internal.bytebuddy.dynamic.DynamicType;
import org.modelmapper.internal.bytebuddy.implementation.MethodAccessorFactory;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.AuxiliaryType;
import org.modelmapper.internal.bytebuddy.implementation.auxiliary.TrivialType;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.StackManipulation;
import org.modelmapper.internal.bytebuddy.implementation.bytecode.constant.NullConstant;
import org.modelmapper.internal.bytebuddy.matcher.ElementMatchers;
import org.modelmapper.internal.bytebuddy.utility.CompoundList;

/* loaded from: classes4.dex */
public interface MethodRebaseResolver {
    Map<MethodDescription.SignatureToken, Resolution> asTokenMap();

    List<DynamicType> getAuxiliaryTypes();

    Resolution resolve(MethodDescription.InDefinedShape inDefinedShape);

    public enum Disabled implements MethodRebaseResolver {
        INSTANCE;

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver
        public Resolution resolve(MethodDescription.InDefinedShape inDefinedShape) {
            return new Resolution.Preserved(inDefinedShape);
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver
        public List<DynamicType> getAuxiliaryTypes() {
            return Collections.emptyList();
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver
        public Map<MethodDescription.SignatureToken, Resolution> asTokenMap() {
            return Collections.emptyMap();
        }
    }

    public interface Resolution {
        StackManipulation getAdditionalArguments();

        MethodDescription.InDefinedShape getResolvedMethod();

        boolean isRebased();

        @HashCodeAndEqualsPlugin.Enhance
        public static class Preserved implements Resolution {
            private final MethodDescription.InDefinedShape methodDescription;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.methodDescription.equals(((Preserved) obj).methodDescription);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodDescription.hashCode();
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution
            public boolean isRebased() {
                return false;
            }

            public Preserved(MethodDescription.InDefinedShape inDefinedShape) {
                this.methodDescription = inDefinedShape;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution
            public MethodDescription.InDefinedShape getResolvedMethod() {
                return this.methodDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution
            public StackManipulation getAdditionalArguments() {
                throw new IllegalStateException("Cannot process additional arguments for non-rebased method: " + this.methodDescription);
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForRebasedMethod implements Resolution {
            private final MethodDescription.InDefinedShape methodDescription;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.methodDescription.equals(((ForRebasedMethod) obj).methodDescription);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodDescription.hashCode();
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution
            public boolean isRebased() {
                return true;
            }

            protected ForRebasedMethod(MethodDescription.InDefinedShape inDefinedShape) {
                this.methodDescription = inDefinedShape;
            }

            public static Resolution of(TypeDescription typeDescription, MethodDescription.InDefinedShape inDefinedShape, MethodNameTransformer methodNameTransformer) {
                return new ForRebasedMethod(new RebasedMethod(typeDescription, inDefinedShape, methodNameTransformer));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution
            public MethodDescription.InDefinedShape getResolvedMethod() {
                return this.methodDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution
            public StackManipulation getAdditionalArguments() {
                return StackManipulation.Trivial.INSTANCE;
            }

            protected static class RebasedMethod extends MethodDescription.InDefinedShape.AbstractBase {
                private final TypeDescription instrumentedType;
                private final MethodDescription.InDefinedShape methodDescription;
                private final MethodNameTransformer methodNameTransformer;

                protected RebasedMethod(TypeDescription typeDescription, MethodDescription.InDefinedShape inDefinedShape, MethodNameTransformer methodNameTransformer) {
                    this.instrumentedType = typeDescription;
                    this.methodDescription = inDefinedShape;
                    this.methodNameTransformer = methodNameTransformer;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
                public TypeDescription.Generic getReturnType() {
                    return this.methodDescription.getReturnType().asRawType();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription, org.modelmapper.internal.bytebuddy.description.method.MethodDescription.InDefinedShape
                public ParameterList<ParameterDescription.InDefinedShape> getParameters() {
                    return new ParameterList.Explicit.ForTypes(this, this.methodDescription.getParameters().asTypeList().asRawTypes());
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
                public TypeList.Generic getExceptionTypes() {
                    return this.methodDescription.getExceptionTypes().asRawTypes();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
                public AnnotationValue<?, ?> getDefaultValue() {
                    return AnnotationValue.UNDEFINED;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
                public TypeList.Generic getTypeVariables() {
                    return new TypeList.Generic.Empty();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return new AnnotationList.Empty();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
                public TypeDescription getDeclaringType() {
                    return this.methodDescription.getDeclaringType();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
                public int getModifiers() {
                    return (this.methodDescription.isStatic() ? 8 : 0) | 4096 | (this.methodDescription.isNative() ? 256 : 0) | (this.instrumentedType.isInterface() ? 1 : 2);
                }

                @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
                public String getInternalName() {
                    return this.methodNameTransformer.transform(this.methodDescription);
                }
            }
        }

        @HashCodeAndEqualsPlugin.Enhance
        public static class ForRebasedConstructor implements Resolution {
            private final MethodDescription.InDefinedShape methodDescription;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && getClass() == obj.getClass() && this.methodDescription.equals(((ForRebasedConstructor) obj).methodDescription);
            }

            public int hashCode() {
                return IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.methodDescription.hashCode();
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution
            public boolean isRebased() {
                return true;
            }

            protected ForRebasedConstructor(MethodDescription.InDefinedShape inDefinedShape) {
                this.methodDescription = inDefinedShape;
            }

            public static Resolution of(MethodDescription.InDefinedShape inDefinedShape, TypeDescription typeDescription) {
                return new ForRebasedConstructor(new RebasedConstructor(inDefinedShape, typeDescription));
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution
            public MethodDescription.InDefinedShape getResolvedMethod() {
                return this.methodDescription;
            }

            @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver.Resolution
            public StackManipulation getAdditionalArguments() {
                return NullConstant.INSTANCE;
            }

            protected static class RebasedConstructor extends MethodDescription.InDefinedShape.AbstractBase {
                private final MethodDescription.InDefinedShape methodDescription;
                private final TypeDescription placeholderType;

                @Override // org.modelmapper.internal.bytebuddy.description.ModifierReviewable
                public int getModifiers() {
                    return InputDeviceCompat.SOURCE_TOUCHSCREEN;
                }

                protected RebasedConstructor(MethodDescription.InDefinedShape inDefinedShape, TypeDescription typeDescription) {
                    this.methodDescription = inDefinedShape;
                    this.placeholderType = typeDescription;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
                public TypeDescription.Generic getReturnType() {
                    return TypeDescription.Generic.VOID;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription, org.modelmapper.internal.bytebuddy.description.method.MethodDescription.InDefinedShape
                public ParameterList<ParameterDescription.InDefinedShape> getParameters() {
                    return new ParameterList.Explicit.ForTypes(this, (List<? extends TypeDefinition>) CompoundList.of(this.methodDescription.getParameters().asTypeList().asErasures(), this.placeholderType));
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
                public TypeList.Generic getExceptionTypes() {
                    return this.methodDescription.getExceptionTypes().asRawTypes();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.method.MethodDescription
                public AnnotationValue<?, ?> getDefaultValue() {
                    return AnnotationValue.UNDEFINED;
                }

                @Override // org.modelmapper.internal.bytebuddy.description.TypeVariableSource
                public TypeList.Generic getTypeVariables() {
                    return new TypeList.Generic.Empty();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.annotation.AnnotationSource
                public AnnotationList getDeclaredAnnotations() {
                    return new AnnotationList.Empty();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.DeclaredByType
                public TypeDescription getDeclaringType() {
                    return this.methodDescription.getDeclaringType();
                }

                @Override // org.modelmapper.internal.bytebuddy.description.NamedElement.WithRuntimeName
                public String getInternalName() {
                    return MethodDescription.CONSTRUCTOR_INTERNAL_NAME;
                }
            }
        }
    }

    @HashCodeAndEqualsPlugin.Enhance
    public static class Default implements MethodRebaseResolver {
        private final List<DynamicType> dynamicTypes;
        private final Map<MethodDescription.InDefinedShape, Resolution> resolutions;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Default r5 = (Default) obj;
            return this.resolutions.equals(r5.resolutions) && this.dynamicTypes.equals(r5.dynamicTypes);
        }

        public int hashCode() {
            return ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.resolutions.hashCode()) * 31) + this.dynamicTypes.hashCode();
        }

        protected Default(Map<MethodDescription.InDefinedShape, Resolution> map, List<DynamicType> list) {
            this.resolutions = map;
            this.dynamicTypes = list;
        }

        public static MethodRebaseResolver make(TypeDescription typeDescription, Set<? extends MethodDescription.Token> set, ClassFileVersion classFileVersion, AuxiliaryType.NamingStrategy namingStrategy, MethodNameTransformer methodNameTransformer) {
            Resolution of;
            HashMap hashMap = new HashMap();
            DynamicType dynamicType = null;
            for (MethodDescription.InDefinedShape inDefinedShape : typeDescription.getDeclaredMethods()) {
                if (set.contains(inDefinedShape.asToken(ElementMatchers.is(typeDescription)))) {
                    if (inDefinedShape.isConstructor()) {
                        if (dynamicType == null) {
                            dynamicType = TrivialType.SIGNATURE_RELEVANT.make(namingStrategy.name(typeDescription), classFileVersion, MethodAccessorFactory.Illegal.INSTANCE);
                        }
                        of = Resolution.ForRebasedConstructor.of(inDefinedShape, dynamicType.getTypeDescription());
                    } else {
                        of = Resolution.ForRebasedMethod.of(typeDescription, inDefinedShape, methodNameTransformer);
                    }
                    hashMap.put(inDefinedShape, of);
                }
            }
            if (dynamicType == null) {
                return new Default(hashMap, Collections.emptyList());
            }
            return new Default(hashMap, Collections.singletonList(dynamicType));
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver
        public Resolution resolve(MethodDescription.InDefinedShape inDefinedShape) {
            Resolution resolution = this.resolutions.get(inDefinedShape);
            return resolution == null ? new Resolution.Preserved(inDefinedShape) : resolution;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver
        public List<DynamicType> getAuxiliaryTypes() {
            return this.dynamicTypes;
        }

        @Override // org.modelmapper.internal.bytebuddy.dynamic.scaffold.inline.MethodRebaseResolver
        public Map<MethodDescription.SignatureToken, Resolution> asTokenMap() {
            HashMap hashMap = new HashMap();
            for (Map.Entry<MethodDescription.InDefinedShape, Resolution> entry : this.resolutions.entrySet()) {
                hashMap.put(entry.getKey().asSignatureToken(), entry.getValue());
            }
            return hashMap;
        }
    }
}
