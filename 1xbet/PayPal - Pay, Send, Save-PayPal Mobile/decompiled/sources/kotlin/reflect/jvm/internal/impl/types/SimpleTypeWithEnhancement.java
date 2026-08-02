package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class SimpleTypeWithEnhancement extends kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType implements kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement {
    private final kotlin.reflect.jvm.internal.impl.types.KotlinType getHighSpeedVideoFpsRanges;
    private final kotlin.reflect.jvm.internal.impl.types.SimpleType getHighSpeedVideoFpsRangesFor;

    public SimpleTypeWithEnhancement(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType kotlinType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinType, "");
        this.getHighSpeedVideoFpsRangesFor = simpleType;
        this.getHighSpeedVideoFpsRanges = kotlinType;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.UnwrappedType makeNullableAsSpecified(boolean z) {
        return makeNullableAsSpecified(z);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.UnwrappedType replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        return replaceAttributes(typeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    protected final kotlin.reflect.jvm.internal.impl.types.SimpleType getDelegate() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    public final kotlin.reflect.jvm.internal.impl.types.KotlinType getEnhancement() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancement
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getOrigin() {
        return getDelegate();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType wrapEnhancement = kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.wrapEnhancement(getOrigin().replaceAttributes(typeAttributes), getEnhancement());
        kotlin.jvm.internal.Intrinsics.checkNotNull(wrapEnhancement, "");
        return (kotlin.reflect.jvm.internal.impl.types.SimpleType) wrapEnhancement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType makeNullableAsSpecified(boolean z) {
        kotlin.reflect.jvm.internal.impl.types.UnwrappedType wrapEnhancement = kotlin.reflect.jvm.internal.impl.types.TypeWithEnhancementKt.wrapEnhancement(getOrigin().makeNullableAsSpecified(z), getEnhancement().unwrap().makeNullableAsSpecified(z));
        kotlin.jvm.internal.Intrinsics.checkNotNull(wrapEnhancement, "");
        return (kotlin.reflect.jvm.internal.impl.types.SimpleType) wrapEnhancement;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithEnhancement replaceDelegate(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType, "");
        return new kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithEnhancement(simpleType, getEnhancement());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithEnhancement refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        kotlin.reflect.jvm.internal.impl.types.KotlinType refineType = kotlinTypeRefiner.refineType((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) getDelegate());
        kotlin.jvm.internal.Intrinsics.checkNotNull(refineType, "");
        return new kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithEnhancement((kotlin.reflect.jvm.internal.impl.types.SimpleType) refineType, kotlinTypeRefiner.refineType((kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker) getEnhancement()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.SimpleType
    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("[@EnhancedForWarnings(");
        sb.append(getEnhancement());
        sb.append(")] ");
        sb.append(getOrigin());
        return sb.toString();
    }
}
