package io.ktor.http;

/* compiled from: ContentDisposition.kt */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u001f\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", com.ironsource.X3.i.W, "value", "encodeContentDispositionAttribute", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ContentDispositionKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.String encodeContentDispositionAttribute(java.lang.String str, java.lang.String str2) {
        if (!kotlin.jvm.internal.Intrinsics.areEqual(str, io.ktor.http.ContentDisposition.Parameters.FileNameAsterisk) || kotlin.text.StringsKt.startsWith(str2, "utf-8''", true)) {
            return str2;
        }
        java.lang.String str3 = str2;
        for (int i = 0; i < str3.length(); i++) {
            if (!io.ktor.http.CodecsKt.getATTRIBUTE_CHARACTERS().contains(java.lang.Character.valueOf(str3.charAt(i)))) {
                return "utf-8''" + io.ktor.http.CodecsKt.percentEncode(str2, io.ktor.http.CodecsKt.getATTRIBUTE_CHARACTERS());
            }
        }
        return str2;
    }
}
