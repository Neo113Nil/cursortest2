package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
public final class DynamicType extends kotlin.reflect.jvm.internal.impl.types.FlexibleType implements kotlin.reflect.jvm.internal.impl.types.model.DynamicTypeMarker {
    private final kotlin.reflect.jvm.internal.impl.types.TypeAttributes getHighSpeedVideoFpsRangesFor;

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean isMarkedNullable() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final kotlin.reflect.jvm.internal.impl.types.DynamicType makeNullableAsSpecified(boolean z) {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.types.TypeAttributes getAttributes() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DynamicType(kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns kotlinBuiltIns, kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        super(r1, r3);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinBuiltIns, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        kotlin.reflect.jvm.internal.impl.types.SimpleType nothingType = kotlinBuiltIns.getNothingType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nothingType, "");
        kotlin.reflect.jvm.internal.impl.types.SimpleType nullableAnyType = kotlinBuiltIns.getNullableAnyType();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(nullableAnyType, "");
        this.getHighSpeedVideoFpsRangesFor = typeAttributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final kotlin.reflect.jvm.internal.impl.types.SimpleType getDelegate() {
        return getUpperBound();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType
    public final kotlin.reflect.jvm.internal.impl.types.DynamicType replaceAttributes(kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        return new kotlin.reflect.jvm.internal.impl.types.DynamicType(kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.getBuiltIns(getDelegate()), typeAttributes);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.FlexibleType
    public final java.lang.String render(kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer descriptorRenderer, kotlin.reflect.jvm.internal.impl.renderer.DescriptorRendererOptions descriptorRendererOptions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorRenderer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptorRendererOptions, "");
        return "dynamic";
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.UnwrappedType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.types.DynamicType refine(kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner kotlinTypeRefiner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "");
        return this;
    }
}
