package kotlin.reflect.jvm.internal.impl.types;

/* loaded from: classes5.dex */
final class NullableSimpleType extends kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleTypeImpl {
    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType, kotlin.reflect.jvm.internal.impl.types.KotlinType
    public final boolean isMarkedNullable() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NullableSimpleType(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType) {
        super(simpleType);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType, "");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType
    public final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.DelegatingSimpleType replaceDelegate(kotlin.reflect.jvm.internal.impl.types.SimpleType simpleType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(simpleType, "");
        return new kotlin.reflect.jvm.internal.impl.types.NullableSimpleType(simpleType);
    }
}
