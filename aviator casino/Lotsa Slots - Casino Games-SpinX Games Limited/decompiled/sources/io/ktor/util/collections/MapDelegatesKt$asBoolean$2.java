package io.ktor.util.collections;

/* compiled from: MapDelegates.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class MapDelegatesKt$asBoolean$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, java.lang.Boolean> {
    public static final io.ktor.util.collections.MapDelegatesKt$asBoolean$2 INSTANCE = new io.ktor.util.collections.MapDelegatesKt$asBoolean$2();

    MapDelegatesKt$asBoolean$2() {
        super(1, kotlin.text.StringsKt.class, "toBoolean", "toBoolean(Ljava/lang/String;)Z", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Boolean invoke(java.lang.String p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "p0");
        return java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(p0));
    }
}
