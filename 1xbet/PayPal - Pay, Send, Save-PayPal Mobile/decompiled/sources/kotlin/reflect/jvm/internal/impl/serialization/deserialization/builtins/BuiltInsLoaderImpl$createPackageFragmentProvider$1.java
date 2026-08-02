package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

/* loaded from: classes17.dex */
final /* synthetic */ class BuiltInsLoaderImpl$createPackageFragmentProvider$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, java.io.InputStream> {
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.io.InputStream invoke(java.lang.String str) {
        java.lang.String str2 = str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return ((kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader) this.receiver).loadResource(str2);
    }

    BuiltInsLoaderImpl$createPackageFragmentProvider$1(java.lang.Object obj) {
        super(1, obj, kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader.class, "loadResource", "loadResource(Ljava/lang/String;)Ljava/io/InputStream;", 0);
    }
}
