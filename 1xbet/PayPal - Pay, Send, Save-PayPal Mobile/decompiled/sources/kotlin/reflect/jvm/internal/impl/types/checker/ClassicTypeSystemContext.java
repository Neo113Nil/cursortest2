package kotlin.reflect.jvm.internal.impl.types.checker;

/* loaded from: classes5.dex */
public interface ClassicTypeSystemContext extends kotlin.reflect.jvm.internal.impl.types.TypeSystemCommonBackendContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSystemInferenceExtensionContext {
    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker asCapturedType(kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker asRigidType(kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker);

    kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker createFlexibleType(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker2);

    kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns();

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    boolean isSingleClassifierType(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    boolean isStarProjection(kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker typeArgumentMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker lowerBound(kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker flexibleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker upperBound(kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker flexibleTypeMarker);

    @Override // kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext
    kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker withNullability(kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, boolean z);

    public static final class DefaultImpls {
        public static boolean isK2(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext) {
            return false;
        }

        public static boolean isDenotable(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
            if (typeConstructorMarker instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                return ((kotlin.reflect.jvm.internal.impl.types.TypeConstructor) typeConstructorMarker).isDenotable();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static boolean isIntegerLiteralTypeConstructor(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
            if (typeConstructorMarker instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                return typeConstructorMarker instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker getTypeParameter(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeVariableTypeConstructorMarker typeVariableTypeConstructorMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeVariableTypeConstructorMarker, "");
            if (typeVariableTypeConstructorMarker instanceof kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor) {
                return ((kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor) typeVariableTypeConstructorMarker).getOriginalTypeParameter();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeVariableTypeConstructorMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeVariableTypeConstructorMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static java.util.Collection<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> possibleIntegerTypes(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
            kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor = classicTypeSystemContext.typeConstructor(rigidTypeMarker);
            if (typeConstructor instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor) {
                return ((kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor) typeConstructor).getPossibleTypes();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(rigidTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker withNullability(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
            if (rigidTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
                return ((kotlin.reflect.jvm.internal.impl.types.SimpleType) rigidTypeMarker).makeNullableAsSpecified(z);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(rigidTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static boolean isError(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
            if (kotlinTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType) {
                return kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError((kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlinTypeMarker);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isStubType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
            if (rigidTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
                return kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isStubType((kotlin.reflect.jvm.internal.impl.types.KotlinType) rigidTypeMarker);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(rigidTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isStubTypeForBuilderInference(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
            if (rigidTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
                return kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.isStubTypeForBuilderInference((kotlin.reflect.jvm.internal.impl.types.KotlinType) rigidTypeMarker);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(rigidTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker lowerType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker capturedTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capturedTypeMarker, "");
            if (capturedTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType) {
                return ((kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType) capturedTypeMarker).getLowerType();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(capturedTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static boolean isIntersection(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
            if (typeConstructorMarker instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                return typeConstructorMarker instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static boolean identicalArguments(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker2, "");
            if (rigidTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
                if (rigidTypeMarker2 instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
                    return ((kotlin.reflect.jvm.internal.impl.types.SimpleType) rigidTypeMarker).getArguments() == ((kotlin.reflect.jvm.internal.impl.types.SimpleType) rigidTypeMarker2).getArguments();
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(rigidTypeMarker2);
                sb.append(", ");
                sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(rigidTypeMarker2.getClass()));
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(rigidTypeMarker);
            sb2.append(", ");
            sb2.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(rigidTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker asRigidType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
            if (kotlinTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType) {
                kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap = ((kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlinTypeMarker).unwrap();
                return unwrap instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType ? (kotlin.reflect.jvm.internal.impl.types.SimpleType) unwrap : null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker asFlexibleType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
            if (kotlinTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType) {
                kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap = ((kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlinTypeMarker).unwrap();
                return unwrap instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType ? (kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrap : null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker asDynamicType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker flexibleTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flexibleTypeMarker, "");
            if (flexibleTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
                return flexibleTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.DynamicType ? (kotlin.reflect.jvm.internal.impl.types.DynamicType) flexibleTypeMarker : null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(flexibleTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(flexibleTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static boolean isRawType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
            if (kotlinTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType) {
                return kotlinTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.RawType;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker upperBound(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker flexibleTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flexibleTypeMarker, "");
            if (flexibleTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
                return ((kotlin.reflect.jvm.internal.impl.types.FlexibleType) flexibleTypeMarker).getUpperBound();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(flexibleTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(flexibleTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker lowerBound(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker flexibleTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flexibleTypeMarker, "");
            if (flexibleTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
                return ((kotlin.reflect.jvm.internal.impl.types.FlexibleType) flexibleTypeMarker).getLowerBound();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(flexibleTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(flexibleTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker asCapturedType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleTypeMarker, "");
            if (simpleTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
                if (simpleTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithEnhancement) {
                    return classicTypeSystemContext.asCapturedType(((kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithEnhancement) simpleTypeMarker).getOrigin());
                }
                return simpleTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType ? (kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType) simpleTypeMarker : null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(simpleTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(simpleTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker asDefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
            if (rigidTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
                return rigidTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType ? (kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType) rigidTypeMarker : null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(rigidTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static boolean isNotNullTypeParameter(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
            return kotlinTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.NotNullTypeParameter;
        }

        public static boolean isMarkedNullable(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
            return (kotlinTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) && ((kotlin.reflect.jvm.internal.impl.types.SimpleType) kotlinTypeMarker).isMarkedNullable();
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructor(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
            if (rigidTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
                return ((kotlin.reflect.jvm.internal.impl.types.SimpleType) rigidTypeMarker).getConstructor();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(rigidTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker typeConstructor(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker capturedTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capturedTypeMarker, "");
            if (capturedTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType) {
                return ((kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType) capturedTypeMarker).getConstructor();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(capturedTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker projection(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeConstructorMarker capturedTypeConstructorMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capturedTypeConstructorMarker, "");
            if (capturedTypeConstructorMarker instanceof kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor) {
                return ((kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor) capturedTypeConstructorMarker).getProjection();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeConstructorMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(capturedTypeConstructorMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static int argumentsCount(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
            if (kotlinTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType) {
                return ((kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlinTypeMarker).getArguments().size();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker getArgument(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
            if (kotlinTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType) {
                return ((kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlinTypeMarker).getArguments().get(i);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static java.util.List<kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker> getArguments(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
            if (kotlinTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType) {
                return ((kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlinTypeMarker).getArguments();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static boolean isStarProjection(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker typeArgumentMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeArgumentMarker, "");
            if (typeArgumentMarker instanceof kotlin.reflect.jvm.internal.impl.types.TypeProjection) {
                return ((kotlin.reflect.jvm.internal.impl.types.TypeProjection) typeArgumentMarker).isStarProjection();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeArgumentMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeArgumentMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.TypeVariance getVariance(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker typeArgumentMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeArgumentMarker, "");
            if (typeArgumentMarker instanceof kotlin.reflect.jvm.internal.impl.types.TypeProjection) {
                kotlin.reflect.jvm.internal.impl.types.Variance projectionKind = ((kotlin.reflect.jvm.internal.impl.types.TypeProjection) typeArgumentMarker).getProjectionKind();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(projectionKind, "");
                return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextKt.convertVariance(projectionKind);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeArgumentMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeArgumentMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker getType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker typeArgumentMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeArgumentMarker, "");
            if (classicTypeSystemContext.isStarProjection(typeArgumentMarker)) {
                return null;
            }
            if (typeArgumentMarker instanceof kotlin.reflect.jvm.internal.impl.types.TypeProjection) {
                return ((kotlin.reflect.jvm.internal.impl.types.TypeProjection) typeArgumentMarker).getType().unwrap();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeArgumentMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeArgumentMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static int parametersCount(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
            if (typeConstructorMarker instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                return ((kotlin.reflect.jvm.internal.impl.types.TypeConstructor) typeConstructorMarker).getParameters().size();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker getParameter(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker, int i) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
            if (typeConstructorMarker instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = ((kotlin.reflect.jvm.internal.impl.types.TypeConstructor) typeConstructorMarker).getParameters().get(i);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeParameterDescriptor, "");
                return typeParameterDescriptor;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static java.util.List<kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker> getParameters(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
            if (typeConstructorMarker instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor> parameters = ((kotlin.reflect.jvm.internal.impl.types.TypeConstructor) typeConstructorMarker).getParameters();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameters, "");
                return parameters;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static java.util.Collection<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> supertypes(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
            if (typeConstructorMarker instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                java.util.Collection<kotlin.reflect.jvm.internal.impl.types.KotlinType> supertypes = ((kotlin.reflect.jvm.internal.impl.types.TypeConstructor) typeConstructorMarker).getSupertypes();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(supertypes, "");
                return supertypes;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.TypeVariance getVariance(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterMarker, "");
            if (typeParameterMarker instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
                kotlin.reflect.jvm.internal.impl.types.Variance variance = ((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) typeParameterMarker).getVariance();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(variance, "");
                return kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContextKt.convertVariance(variance);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeParameterMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeParameterMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static java.util.List<kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> getUpperBounds(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterMarker, "");
            if (typeParameterMarker instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
                java.util.List<kotlin.reflect.jvm.internal.impl.types.KotlinType> upperBounds = ((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) typeParameterMarker).getUpperBounds();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperBounds, "");
                return upperBounds;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeParameterMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeParameterMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker getTypeConstructor(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterMarker, "");
            if (typeParameterMarker instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor typeConstructor = ((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) typeParameterMarker).getTypeConstructor();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(typeConstructor, "");
                return typeConstructor;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeParameterMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeParameterMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static boolean hasRecursiveBounds(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterMarker, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterMarker, "");
            if (typeParameterMarker instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
                kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor typeParameterDescriptor = (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) typeParameterMarker;
                if (typeConstructorMarker == null ? true : typeConstructorMarker instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                    return kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.hasTypeParameterRecursiveBounds$default(typeParameterDescriptor, (kotlin.reflect.jvm.internal.impl.types.TypeConstructor) typeConstructorMarker, null, 4, null);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(typeParameterDescriptor);
                sb.append(", ");
                sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeParameterDescriptor.getClass()));
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeParameterMarker);
            sb2.append(", ");
            sb2.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeParameterMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }

        public static boolean areEqualTypeConstructors(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker2, "");
            if (typeConstructorMarker instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                if (typeConstructorMarker2 instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                    return kotlin.jvm.internal.Intrinsics.areEqual(typeConstructorMarker, typeConstructorMarker2);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(typeConstructorMarker2);
                sb.append(", ");
                sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeConstructorMarker2.getClass()));
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(typeConstructorMarker);
            sb2.append(", ");
            sb2.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }

        public static boolean isClassTypeConstructor(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
            if (typeConstructorMarker instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                return ((kotlin.reflect.jvm.internal.impl.types.TypeConstructor) typeConstructorMarker).mo23898getDeclarationDescriptor() instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static boolean isCommonFinalClassConstructor(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
            if (typeConstructorMarker instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = ((kotlin.reflect.jvm.internal.impl.types.TypeConstructor) typeConstructorMarker).mo23898getDeclarationDescriptor();
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor : null;
                return (classDescriptor == null || !kotlin.reflect.jvm.internal.impl.descriptors.ModalityUtilsKt.isFinalClass(classDescriptor) || classDescriptor.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY || classDescriptor.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS) ? false : true;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker asArgumentList(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
            if (rigidTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
                return (kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentListMarker) rigidTypeMarker;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(rigidTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.SimpleType captureFromArguments(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus captureStatus) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureStatus, "");
            if (rigidTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
                return kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeKt.captureFromArguments((kotlin.reflect.jvm.internal.impl.types.SimpleType) rigidTypeMarker, captureStatus);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(rigidTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static boolean isAnyConstructor(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
            if (typeConstructorMarker instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                return kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isTypeConstructorForGivenClass((kotlin.reflect.jvm.internal.impl.types.TypeConstructor) typeConstructorMarker, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.any);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static boolean isNothingConstructor(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
            if (typeConstructorMarker instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                return kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isTypeConstructorForGivenClass((kotlin.reflect.jvm.internal.impl.types.TypeConstructor) typeConstructorMarker, kotlin.reflect.jvm.internal.impl.builtins.StandardNames.FqNames.nothing);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.TypeArgumentMarker asTypeArgument(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
            if (kotlinTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType) {
                return kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.asTypeProjection((kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlinTypeMarker);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isSingleClassifierType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
            if (rigidTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
                if (kotlin.reflect.jvm.internal.impl.types.KotlinTypeKt.isError((kotlin.reflect.jvm.internal.impl.types.KotlinType) rigidTypeMarker)) {
                    return false;
                }
                kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = (kotlin.reflect.jvm.internal.impl.types.SimpleType) rigidTypeMarker;
                if (simpleType.getConstructor().mo23898getDeclarationDescriptor() instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor) {
                    return false;
                }
                if (simpleType.getConstructor().mo23898getDeclarationDescriptor() != null || (rigidTypeMarker instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType) || (rigidTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType) || (rigidTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType) || (simpleType.getConstructor() instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor)) {
                    return true;
                }
                kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker = (kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker) rigidTypeMarker;
                return (simpleTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithEnhancement) && classicTypeSystemContext.isSingleClassifierType(((kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithEnhancement) simpleTypeMarker).getOrigin());
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(rigidTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker intersectTypes(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> collection) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(collection, "");
            return kotlin.reflect.jvm.internal.impl.types.checker.IntersectionTypeKt.intersectTypes(collection);
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker createFlexibleType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker2, "");
            if (rigidTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
                if (rigidTypeMarker2 instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
                    return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType((kotlin.reflect.jvm.internal.impl.types.SimpleType) rigidTypeMarker, (kotlin.reflect.jvm.internal.impl.types.SimpleType) rigidTypeMarker2);
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(classicTypeSystemContext);
                sb.append(", ");
                sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(classicTypeSystemContext.getClass()));
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(classicTypeSystemContext);
            sb2.append(", ");
            sb2.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(classicTypeSystemContext.getClass()));
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker withNullability(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
            if (kotlinTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker) {
                return classicTypeSystemContext.withNullability((kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker) kotlinTypeMarker, z);
            }
            if (!(kotlinTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker)) {
                throw new java.lang.IllegalStateException("sealed".toString());
            }
            kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker flexibleTypeMarker = (kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker) kotlinTypeMarker;
            return classicTypeSystemContext.createFlexibleType(classicTypeSystemContext.withNullability((kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker) classicTypeSystemContext.lowerBound(flexibleTypeMarker), z), classicTypeSystemContext.withNullability((kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker) classicTypeSystemContext.upperBound(flexibleTypeMarker), z));
        }

        public static kotlin.reflect.jvm.internal.impl.types.TypeCheckerState newTypeCheckerState(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, boolean z, boolean z2, boolean z3) {
            return kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeCheckerStateKt.createClassicTypeCheckerState$default(z, z2, classicTypeSystemContext, null, null, 24, null);
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker nullableAnyType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext) {
            kotlin.reflect.jvm.internal.impl.types.SimpleType nullableAnyType = classicTypeSystemContext.getBuiltIns().getNullableAnyType();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nullableAnyType, "");
            return nullableAnyType;
        }

        public static kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns getBuiltIns(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext) {
            throw new java.lang.UnsupportedOperationException("Not supported");
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker makeDefinitelyNotNullOrNotNull(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, boolean z) {
            kotlin.reflect.jvm.internal.impl.types.UnwrappedType makeDefinitelyNotNullOrNotNull$default;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
            if (!(kotlinTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.UnwrappedType)) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(kotlinTypeMarker);
                sb.append(", ");
                sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinTypeMarker.getClass()));
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            makeDefinitelyNotNullOrNotNull$default = kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt.makeDefinitelyNotNullOrNotNull$default((kotlin.reflect.jvm.internal.impl.types.UnwrappedType) kotlinTypeMarker, false, 1, null);
            return makeDefinitelyNotNullOrNotNull$default;
        }

        public static boolean isProjectionNotNull(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker capturedTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capturedTypeMarker, "");
            if (capturedTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType) {
                return ((kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType) capturedTypeMarker).isProjectionNotNull();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(capturedTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus captureStatus(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker capturedTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capturedTypeMarker, "");
            if (capturedTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType) {
                return ((kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType) capturedTypeMarker).getCaptureStatus();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(capturedTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(capturedTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static boolean isOldCapturedType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.CapturedTypeMarker capturedTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(capturedTypeMarker, "");
            return capturedTypeMarker instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedType;
        }

        public static boolean isNullableType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
            if (kotlinTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType) {
                return kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType((kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlinTypeMarker);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker original(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker definitelyNotNullTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(definitelyNotNullTypeMarker, "");
            if (definitelyNotNullTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType) {
                return ((kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType) definitelyNotNullTypeMarker).getOriginal();
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(definitelyNotNullTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(definitelyNotNullTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker safeSubstitute(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeSubstitutorMarker typeSubstitutorMarker, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeSubstitutorMarker, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
            if (kotlinTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.UnwrappedType) {
                if (typeSubstitutorMarker instanceof kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor) {
                    kotlin.reflect.jvm.internal.impl.types.KotlinType safeSubstitute = ((kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor) typeSubstitutorMarker).safeSubstitute((kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlinTypeMarker, kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(safeSubstitute, "");
                    return safeSubstitute;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                sb.append(typeSubstitutorMarker);
                sb.append(", ");
                sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeSubstitutorMarker.getClass()));
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb2.append(kotlinTypeMarker);
            sb2.append(", ");
            sb2.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean isPrimitiveType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker simpleTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleTypeMarker, "");
            if (simpleTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType) {
                return kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isPrimitiveType((kotlin.reflect.jvm.internal.impl.types.KotlinType) simpleTypeMarker);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(simpleTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(simpleTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker arrayType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
            if (kotlinTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType) {
                kotlin.reflect.jvm.internal.impl.types.SimpleType arrayType = classicTypeSystemContext.getBuiltIns().getArrayType(kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT, (kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlinTypeMarker);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(arrayType, "");
                return arrayType;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(classicTypeSystemContext);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(classicTypeSystemContext.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static boolean isArrayOrNullableArray(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
            if (kotlinTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType) {
                return kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isArray((kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlinTypeMarker);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static boolean hasAnnotation(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker, kotlin.reflect.jvm.internal.impl.name.FqName fqName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fqName, "");
            if (kotlinTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType) {
                return ((kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlinTypeMarker).getAnnotations().hasAnnotation(fqName);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker getTypeParameterClassifier(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
            if (typeConstructorMarker instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = ((kotlin.reflect.jvm.internal.impl.types.TypeConstructor) typeConstructorMarker).mo23898getDeclarationDescriptor();
                return mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) mo23898getDeclarationDescriptor : null;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static boolean isInlineClass(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
            if (typeConstructorMarker instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = ((kotlin.reflect.jvm.internal.impl.types.TypeConstructor) typeConstructorMarker).mo23898getDeclarationDescriptor();
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor classDescriptor = mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor ? (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor : null;
                return (classDescriptor != null ? classDescriptor.getValueClassRepresentation() : null) instanceof kotlin.reflect.jvm.internal.impl.descriptors.InlineClassRepresentation;
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker getRepresentativeUpperBound(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeParameterMarker typeParameterMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeParameterMarker, "");
            if (typeParameterMarker instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) {
                return kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getRepresentativeUpperBound((kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) typeParameterMarker);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeParameterMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeParameterMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker getUnsubstitutedUnderlyingType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
            if (kotlinTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.KotlinType) {
                return kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt.unsubstitutedUnderlyingType((kotlin.reflect.jvm.internal.impl.types.KotlinType) kotlinTypeMarker);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(kotlinTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(kotlinTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType getPrimitiveType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
            if (typeConstructorMarker instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = ((kotlin.reflect.jvm.internal.impl.types.TypeConstructor) typeConstructorMarker).mo23898getDeclarationDescriptor();
                kotlin.jvm.internal.Intrinsics.checkNotNull(mo23898getDeclarationDescriptor, "");
                return kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.getPrimitiveType((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType getPrimitiveArrayType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
            if (typeConstructorMarker instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = ((kotlin.reflect.jvm.internal.impl.types.TypeConstructor) typeConstructorMarker).mo23898getDeclarationDescriptor();
                kotlin.jvm.internal.Intrinsics.checkNotNull(mo23898getDeclarationDescriptor, "");
                return kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.getPrimitiveArrayType((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static boolean isUnderKotlinPackage(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
            if (typeConstructorMarker instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = ((kotlin.reflect.jvm.internal.impl.types.TypeConstructor) typeConstructorMarker).mo23898getDeclarationDescriptor();
                return mo23898getDeclarationDescriptor != null && kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isUnderKotlinPackage(mo23898getDeclarationDescriptor);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe getClassFqNameUnsafe(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker typeConstructorMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeConstructorMarker, "");
            if (typeConstructorMarker instanceof kotlin.reflect.jvm.internal.impl.types.TypeConstructor) {
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = ((kotlin.reflect.jvm.internal.impl.types.TypeConstructor) typeConstructorMarker).mo23898getDeclarationDescriptor();
                kotlin.jvm.internal.Intrinsics.checkNotNull(mo23898getDeclarationDescriptor, "");
                return kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameUnsafe((kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) mo23898getDeclarationDescriptor);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(typeConstructorMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(typeConstructorMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy substitutionSupertypePolicy(final kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker rigidTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rigidTypeMarker, "");
            if (rigidTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType) {
                final kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor buildSubstitutor = kotlin.reflect.jvm.internal.impl.types.TypeConstructorSubstitution.Companion.create((kotlin.reflect.jvm.internal.impl.types.KotlinType) rigidTypeMarker).buildSubstitutor();
                return new kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy.DoCustomTransform() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext$substitutionSupertypePolicy$2
                    @Override // kotlin.reflect.jvm.internal.impl.types.TypeCheckerState.SupertypesPolicy
                    /* renamed from: transformType */
                    public final kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker mo23901transformType(kotlin.reflect.jvm.internal.impl.types.TypeCheckerState typeCheckerState, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeCheckerState, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
                        kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext2 = kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext.this;
                        kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor typeSubstitutor = buildSubstitutor;
                        java.lang.Object lowerBoundIfFlexible = classicTypeSystemContext2.lowerBoundIfFlexible(kotlinTypeMarker);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(lowerBoundIfFlexible, "");
                        kotlin.reflect.jvm.internal.impl.types.KotlinType safeSubstitute = typeSubstitutor.safeSubstitute((kotlin.reflect.jvm.internal.impl.types.KotlinType) lowerBoundIfFlexible, kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT);
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(safeSubstitute, "");
                        kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker asRigidType = classicTypeSystemContext2.asRigidType((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) safeSubstitute);
                        kotlin.jvm.internal.Intrinsics.checkNotNull(asRigidType);
                        return asRigidType;
                    }
                };
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(rigidTypeMarker);
            sb.append(", ");
            sb.append(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(rigidTypeMarker.getClass()));
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }

        public static boolean isTypeVariableType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker kotlinTypeMarker) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeMarker, "");
            return (kotlinTypeMarker instanceof kotlin.reflect.jvm.internal.impl.types.UnwrappedType) && (((kotlin.reflect.jvm.internal.impl.types.UnwrappedType) kotlinTypeMarker).getConstructor() instanceof kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor);
        }

        public static kotlin.reflect.jvm.internal.impl.types.model.TypeSubstitutorMarker typeSubstitutorForUnderlyingType(kotlin.reflect.jvm.internal.impl.types.checker.ClassicTypeSystemContext classicTypeSystemContext, java.util.Map<kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker, ? extends kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
            for (java.util.Map.Entry<kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker, ? extends kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker> entry : map.entrySet()) {
                kotlin.reflect.jvm.internal.impl.types.model.TypeConstructorMarker key = entry.getKey();
                kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker value = entry.getValue();
                kotlin.jvm.internal.Intrinsics.checkNotNull(key, "");
                kotlin.jvm.internal.Intrinsics.checkNotNull(value, "");
                arrayList.add(kotlin.TuplesKt.to((kotlin.reflect.jvm.internal.impl.types.TypeConstructor) key, kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.asTypeProjection((kotlin.reflect.jvm.internal.impl.types.KotlinType) value)));
            }
            kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor create = kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor.create((java.util.Map<kotlin.reflect.jvm.internal.impl.types.TypeConstructor, kotlin.reflect.jvm.internal.impl.types.TypeProjection>) kotlin.collections.MapsKt.toMap(arrayList));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
            return create;
        }
    }
}
