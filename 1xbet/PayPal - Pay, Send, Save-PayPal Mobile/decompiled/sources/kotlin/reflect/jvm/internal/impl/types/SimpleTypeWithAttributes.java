package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
final class SimpleTypeWithAttributes extends kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleTypeImpl {
    private final kotlin.reflect.jvm.internal.impl.types.TypeAttributes getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleTypeWithAttributes(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType, kotlin.reflect.jvm.internal.impl.types.TypeAttributes typeAttributes) {
        super(simpleType);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(typeAttributes, "");
        this.getHighResolutionOutputSizeshNQ4ISI = typeAttributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType replaceDelegate(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType, "");
        return new kotlin.reflect.jvm.internal.impl.types.SimpleTypeWithAttributes(simpleType, getAttributes());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final kotlin.reflect.jvm.internal.impl.types.TypeAttributes getAttributes() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }
}
