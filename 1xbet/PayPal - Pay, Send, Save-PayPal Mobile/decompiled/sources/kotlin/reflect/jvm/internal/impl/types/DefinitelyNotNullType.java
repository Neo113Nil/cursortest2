package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class DefinitelyNotNullType extends kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType implements kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter, kotlin.reflect.jvm.internal.impl.types.model.DefinitelyNotNullTypeMarker {
    public static final kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType.Companion Companion = new kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType.Companion(null);
    private final kotlin.reflect.jvm.internal.impl.types.SimpleType getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoSizes;

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean isMarkedNullable() {
        return false;
    }

    private DefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = simpleType;
        this.getHighSpeedVideoSizes = z;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.UnwrappedType makeNullableAsSpecified(boolean z) {
        return makeNullableAsSpecified(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.UnwrappedType replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        return replaceAttributes(typeAttributes);
    }

    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getOriginal() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType makeDefinitelyNotNull$default(kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType.Companion companion, kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = false;
            }
            return companion.makeDefinitelyNotNull(unwrappedType, z, z2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
        
            if (r5 == false) goto L34;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType makeDefinitelyNotNull(kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrappedType, boolean z, boolean z2) {
            boolean z3;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unwrappedType, "");
            if (unwrappedType instanceof kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType) {
                return (kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType) unwrappedType;
            }
            kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
            if (!z2) {
                if ((unwrappedType.getConstructor() instanceof kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor) || (unwrappedType.getConstructor().mo23898getDeclarationDescriptor() instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) || (unwrappedType instanceof kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedType) || (unwrappedType instanceof kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference)) {
                    if (unwrappedType instanceof kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference) {
                        z3 = kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(unwrappedType);
                    } else {
                        kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor mo23898getDeclarationDescriptor = unwrappedType.getConstructor().mo23898getDeclarationDescriptor();
                        kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl typeParameterDescriptorImpl = mo23898getDeclarationDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl ? (kotlin.reflect.jvm.internal.impl.descriptors.impl.TypeParameterDescriptorImpl) mo23898getDeclarationDescriptor : null;
                        if (typeParameterDescriptorImpl == null || typeParameterDescriptorImpl.isInitialized()) {
                            if (z && (unwrappedType.getConstructor().mo23898getDeclarationDescriptor() instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor)) {
                                z3 = kotlin.reflect.jvm.internal.impl.types.TypeUtils.isNullableType(unwrappedType);
                            } else {
                                z3 = !kotlin.reflect.jvm.internal.impl.types.checker.NullabilityChecker.INSTANCE.isSubtypeOfAny(unwrappedType);
                            }
                        }
                    }
                }
                return null;
            }
            if (unwrappedType instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
                kotlin.reflect.jvm.internal.impl.types.FlexibleType flexibleType = (kotlin.reflect.jvm.internal.impl.types.FlexibleType) unwrappedType;
                kotlin.jvm.internal.Intrinsics.areEqual(flexibleType.getLowerBound().getConstructor(), flexibleType.getUpperBound().getConstructor());
            }
            return new kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.lowerIfFlexible(unwrappedType).makeNullableAsSpecified(false), z, defaultConstructorMarker);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    protected final kotlin.reflect.jvm.internal.impl.types.SimpleType getDelegate() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public final boolean isTypeParameter() {
        return (getDelegate().getConstructor() instanceof kotlin.reflect.jvm.internal.impl.types.checker.NewTypeVariableConstructor) || (getDelegate().getConstructor().mo23898getDeclarationDescriptor() instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public final kotlin.reflect.jvm.internal.impl.types.KotlinType substitutionResult(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        return kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt.makeDefinitelyNotNullOrNotNull(kotlinType.unwrap(), this.getHighSpeedVideoSizes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        return new kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType(getDelegate().replaceAttributes(typeAttributes), this.getHighSpeedVideoSizes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType makeNullableAsSpecified(boolean z) {
        return z ? getDelegate().makeNullableAsSpecified(z) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getDelegate());
        sb.append(" & Any");
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType replaceDelegate(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType, "");
        return new kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType(simpleType, this.getHighSpeedVideoSizes);
    }

    public /* synthetic */ DefinitelyNotNullType(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(simpleType, z);
    }
}
