package io.ktor.util.collections;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final /* synthetic */ class MapDelegatesKt$asBoolean$2 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, java.lang.Boolean> {
    public static final io.ktor.util.collections.MapDelegatesKt$asBoolean$2 getHighSpeedVideoFpsRanges = new io.ktor.util.collections.MapDelegatesKt$asBoolean$2();

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean invoke(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(str));
    }

    MapDelegatesKt$asBoolean$2() {
        super(1, kotlin.text.StringsKt.class, "toBoolean", "toBoolean(Ljava/lang/String;)Z", 1);
    }
}
