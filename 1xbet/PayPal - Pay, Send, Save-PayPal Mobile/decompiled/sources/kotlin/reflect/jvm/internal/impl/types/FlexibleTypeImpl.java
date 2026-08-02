package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class FlexibleTypeImpl extends kotlin.reflect.jvm.internal.impl.types.FlexibleType implements kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter {
    public static final kotlin.reflect.jvm.internal.impl.types.FlexibleTypeImpl.Companion Companion = new kotlin.reflect.jvm.internal.impl.types.FlexibleTypeImpl.Companion(null);
    public static boolean RUN_SLOW_ASSERTIONS;
    private boolean getHighSpeedVideoSizes;

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleTypeImpl(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType2) {
        super(simpleType, simpleType2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType2, "");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public final boolean isTypeParameter() {
        return (getLowerBound().getConstructor().mo23898getDeclarationDescriptor() instanceof kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor) && kotlin.jvm.internal.Intrinsics.areEqual(getLowerBound().getConstructor(), getUpperBound().getConstructor());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.CustomTypeParameter
    public final kotlin.reflect.jvm.internal.impl.types.KotlinType substitutionResult(kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType flexibleType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType unwrap = kotlinType.unwrap();
        if (unwrap instanceof kotlin.reflect.jvm.internal.impl.types.FlexibleType) {
            flexibleType = unwrap;
        } else {
            if (!(unwrap instanceof kotlin.reflect.jvm.internal.impl.types.SimpleType)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType = (kotlin.reflect.jvm.internal.impl.types.SimpleType) unwrap;
            flexibleType = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(simpleType, simpleType.makeNullableAsSpecified(true));
        }
        return kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.inheritEnhancement(flexibleType, unwrap);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final kotlin.reflect.jvm.internal.impl.types.UnwrappedType replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(getLowerBound().replaceAttributes(typeAttributes), getUpperBound().replaceAttributes(typeAttributes));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final java.lang.String render(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer descriptorRenderer, kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorRenderer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorRendererOptions, "");
        if (descriptorRendererOptions.getDebugMode()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
            sb.append(descriptorRenderer.renderType(getLowerBound()));
            sb.append("..");
            sb.append(descriptorRenderer.renderType(getUpperBound()));
            sb.append(')');
            return sb.toString();
        }
        return descriptorRenderer.renderFlexibleType(descriptorRenderer.renderType(getLowerBound()), descriptorRenderer.renderType(getUpperBound()), kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getBuiltIns(this));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(getLowerBound());
        sb.append("..");
        sb.append(getUpperBound());
        sb.append(')');
        return sb.toString();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final kotlin.reflect.jvm.internal.impl.types.UnwrappedType makeNullableAsSpecified(boolean z) {
        return kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.flexibleType(getLowerBound().makeNullableAsSpecified(z), getUpperBound().makeNullableAsSpecified(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.types.FlexibleType refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        kotlin.reflect.jvm.internal.impl.types.KotlinType refineType = kotlinTypeRefiner.refineType((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) getLowerBound());
        kotlin.jvm.internal.Intrinsics.checkNotNull(refineType, "");
        kotlin.reflect.jvm.internal.impl.types.KotlinType refineType2 = kotlinTypeRefiner.refineType((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) getUpperBound());
        kotlin.jvm.internal.Intrinsics.checkNotNull(refineType2, "");
        return new kotlin.reflect.jvm.internal.impl.types.FlexibleTypeImpl((kotlin.reflect.jvm.internal.impl.types.SimpleType) refineType, (kotlin.reflect.jvm.internal.impl.types.SimpleType) refineType2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getDelegate() {
        if (RUN_SLOW_ASSERTIONS && !this.getHighSpeedVideoSizes) {
            this.getHighSpeedVideoSizes = true;
            kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.isFlexible(getLowerBound());
            kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt.isFlexible(getUpperBound());
            kotlin.jvm.internal.Intrinsics.areEqual(getLowerBound(), getUpperBound());
            kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeChecker.DEFAULT.isSubtypeOf(getLowerBound(), getUpperBound());
        }
        return getLowerBound();
    }
}
