package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public abstract class FlexibleType extends kotlin.reflect.jvm.internal.impl.types.UnwrappedType implements kotlin.reflect.jvm.internal.impl.types.model.FlexibleTypeMarker {
    private final kotlin.reflect.jvm.internal.impl.types.SimpleType getHighResolutionOutputSizeshNQ4ISI;
    private final kotlin.reflect.jvm.internal.impl.types.SimpleType getHighSpeedVideoFpsRangesFor;

    public abstract kotlin.reflect.jvm.internal.impl.types.SimpleType getDelegate();

    public abstract java.lang.String render(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer descriptorRenderer, kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlexibleType(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType2) {
        super(null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType2, "");
        this.getHighSpeedVideoFpsRangesFor = simpleType;
        this.getHighResolutionOutputSizeshNQ4ISI = simpleType2;
    }

    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getLowerBound() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getUpperBound() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public kotlin.reflect.jvm.internal.impl.types.TypeAttributes getAttributes() {
        return getDelegate().getAttributes();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public kotlin.reflect.jvm.internal.impl.types.TypeConstructor getConstructor() {
        return getDelegate().getConstructor();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public java.util.List<kotlin.reflect.jvm.internal.impl.types.TypeProjection> getArguments() {
        return getDelegate().getArguments();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public boolean isMarkedNullable() {
        return getDelegate().isMarkedNullable();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.KotlinType
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope getMemberScope() {
        return getDelegate().getMemberScope();
    }

    public java.lang.String toString() {
        return kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer.DEBUG_TEXT.renderType(this);
    }
}
