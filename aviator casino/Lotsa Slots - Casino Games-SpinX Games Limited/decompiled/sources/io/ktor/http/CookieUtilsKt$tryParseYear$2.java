package io.ktor.http;

/* compiled from: CookieUtils.kt */
@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes6.dex */
public final class CookieUtilsKt$tryParseYear$2 implements kotlin.jvm.functions.Function1<java.lang.Character, java.lang.Boolean> {
    public static final io.ktor.http.CookieUtilsKt$tryParseYear$2 INSTANCE = new io.ktor.http.CookieUtilsKt$tryParseYear$2();

    public final java.lang.Boolean invoke(char c) {
        return java.lang.Boolean.valueOf(io.ktor.http.CookieUtilsKt.isOctet(c));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ java.lang.Boolean invoke(java.lang.Character ch) {
        return invoke(ch.charValue());
    }
}
