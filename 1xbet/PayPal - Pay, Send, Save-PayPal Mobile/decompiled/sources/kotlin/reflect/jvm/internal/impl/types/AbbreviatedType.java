package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class AbbreviatedType extends kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType {
    private final kotlin.reflect.jvm.internal.impl.types.SimpleType getHighSpeedVideoFpsRangesFor;
    private final kotlin.reflect.jvm.internal.impl.types.SimpleType getHighSpeedVideoSizes;

    public AbbreviatedType(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType2, "");
        this.getHighSpeedVideoFpsRangesFor = simpleType;
        this.getHighSpeedVideoSizes = simpleType2;
    }

    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getAbbreviation() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    protected final kotlin.reflect.jvm.internal.impl.types.SimpleType getDelegate() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.UnwrappedType replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        return replaceAttributes(typeAttributes);
    }

    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getExpandedType() {
        return getDelegate();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        return new kotlin.reflect.jvm.internal.impl.types.AbbreviatedType(getDelegate().replaceAttributes(typeAttributes), this.getHighSpeedVideoSizes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final kotlin.reflect.jvm.internal.impl.types.AbbreviatedType makeNullableAsSpecified(boolean z) {
        return new kotlin.reflect.jvm.internal.impl.types.AbbreviatedType(getDelegate().makeNullableAsSpecified(z), this.getHighSpeedVideoSizes.makeNullableAsSpecified(z));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final kotlin.reflect.jvm.internal.impl.types.AbbreviatedType replaceDelegate(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType, "");
        return new kotlin.reflect.jvm.internal.impl.types.AbbreviatedType(simpleType, this.getHighSpeedVideoSizes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.types.AbbreviatedType refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        kotlin.reflect.jvm.internal.impl.types.KotlinType refineType = kotlinTypeRefiner.refineType((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) getDelegate());
        kotlin.jvm.internal.Intrinsics.checkNotNull(refineType, "");
        kotlin.reflect.jvm.internal.impl.types.KotlinType refineType2 = kotlinTypeRefiner.refineType((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) this.getHighSpeedVideoSizes);
        kotlin.jvm.internal.Intrinsics.checkNotNull(refineType2, "");
        return new kotlin.reflect.jvm.internal.impl.types.AbbreviatedType((kotlin.reflect.jvm.internal.impl.types.SimpleType) refineType, (kotlin.reflect.jvm.internal.impl.types.SimpleType) refineType2);
    }
}
