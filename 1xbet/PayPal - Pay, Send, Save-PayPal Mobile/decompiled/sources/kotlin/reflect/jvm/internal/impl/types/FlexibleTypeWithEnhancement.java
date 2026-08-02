package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class FlexibleTypeWithEnhancement extends kotlin.reflect.jvm.internal.impl.types.FlexibleType implements kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement {
    private final kotlin.reflect.jvm.internal.impl.types.FlexibleType getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.types.KotlinType getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    public final kotlin.reflect.jvm.internal.impl.types.FlexibleType getOrigin() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getEnhancement() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleTypeWithEnhancement(kotlin.reflect.jvm.internal.impl.types.FlexibleType flexibleType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        super(flexibleType.getLowerBound(), flexibleType.getUpperBound());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flexibleType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        this.getHighResolutionOutputSizeshNQ4ISI = flexibleType;
        this.getHighSpeedVideoFpsRangesFor = kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final kotlin.reflect.jvm.internal.impl.types.UnwrappedType replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        return kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.wrapEnhancement(getOrigin().replaceAttributes(typeAttributes), getEnhancement());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final kotlin.reflect.jvm.internal.impl.types.UnwrappedType makeNullableAsSpecified(boolean z) {
        return kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.wrapEnhancement(getOrigin().makeNullableAsSpecified(z), getEnhancement().unwrap().makeNullableAsSpecified(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final java.lang.String render(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer descriptorRenderer, kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorRenderer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorRendererOptions, "");
        if (descriptorRendererOptions.getEnhancedTypes()) {
            return descriptorRenderer.renderType(getEnhancement());
        }
        return getOrigin().render(descriptorRenderer, descriptorRendererOptions);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getDelegate() {
        return getOrigin().getDelegate();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.types.FlexibleTypeWithEnhancement refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        kotlin.reflect.jvm.internal.impl.types.KotlinType refineType = kotlinTypeRefiner.refineType((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) getOrigin());
        kotlin.jvm.internal.Intrinsics.checkNotNull(refineType, "");
        return new kotlin.reflect.jvm.internal.impl.types.FlexibleTypeWithEnhancement((kotlin.reflect.jvm.internal.impl.types.FlexibleType) refineType, kotlinTypeRefiner.refineType((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) getEnhancement()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[@EnhancedForWarnings(");
        sb.append(getEnhancement());
        sb.append(")] ");
        sb.append(getOrigin());
        return sb.toString();
    }
}
