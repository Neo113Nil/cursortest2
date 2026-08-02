package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ContentDispositionKt {
    public static final /* synthetic */ java.lang.String access$encodeContentDispositionAttribute(java.lang.String str, java.lang.String str2) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, io.ktor.http.ContentDisposition.Parameters.FileNameAsterisk) && !kotlin.text.StringsKt.startsWith(str2, "utf-8''", true)) {
            java.lang.String str3 = str2;
            for (int i = 0; i < str3.length(); i++) {
                if (!io.ktor.http.CodecsKt.getATTRIBUTE_CHARACTERS().contains(java.lang.Character.valueOf(str3.charAt(i)))) {
                    return "utf-8''".concat(java.lang.String.valueOf(io.ktor.http.CodecsKt.percentEncode(str2, io.ktor.http.CodecsKt.getATTRIBUTE_CHARACTERS())));
                }
            }
        }
        return str2;
    }
}
