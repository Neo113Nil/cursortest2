package kotlin.reflect;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class ParameterizedTypeImpl$getTypeName$1$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.reflect.Type, java.lang.String> {
    public static final kotlin.reflect.ParameterizedTypeImpl$getTypeName$1$1 getHighSpeedVideoFpsRanges = new kotlin.reflect.ParameterizedTypeImpl$getTypeName$1$1();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.String invoke(java.lang.reflect.Type type) {
        java.lang.reflect.Type type2 = type;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type2, "");
        return kotlin.reflect.TypesJVMKt.access$typeToString(type2);
    }

    ParameterizedTypeImpl$getTypeName$1$1() {
        super(1, kotlin.reflect.TypesJVMKt.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
    }
}
