package kotlin.reflect;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class TypesJVMKt$typeToString$unwrap$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.Class<?>, java.lang.Class<?>> {
    public static final kotlin.reflect.TypesJVMKt$typeToString$unwrap$1 getHighResolutionOutputSizeshNQ4ISI = new kotlin.reflect.TypesJVMKt$typeToString$unwrap$1();

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public final java.lang.Class<?> invoke(java.lang.Class<?> cls) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cls, "");
        return cls.getComponentType();
    }

    TypesJVMKt$typeToString$unwrap$1() {
        super(1, java.lang.Class.class, "getComponentType", "getComponentType()Ljava/lang/Class;", 0);
    }
}
