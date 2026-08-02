package io.ktor.http;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes17.dex */
public final class CookieUtilsKt$tryParseTime$minute$1$1 implements kotlin.jvm.functions.Function1<java.lang.Character, java.lang.Boolean> {
    public static final io.ktor.http.CookieUtilsKt$tryParseTime$minute$1$1 INSTANCE = new io.ktor.http.CookieUtilsKt$tryParseTime$minute$1$1();

    public final java.lang.Boolean invoke(char c) {
        return java.lang.Boolean.valueOf(io.ktor.http.CookieUtilsKt.isDigit(c));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Boolean invoke(java.lang.Character ch) {
        return invoke(ch.charValue());
    }
}
