package okhttp3;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lokhttp3/Credentials;", "", "<init>", "()V", "", androidx.autofill.HintConstants.AUTOFILL_HINT_USERNAME, "password", "Ljava/nio/charset/Charset;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "basic", "(Ljava/lang/String;Ljava/lang/String;Ljava/nio/charset/Charset;)Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class Credentials {
    public static final okhttp3.Credentials INSTANCE = new okhttp3.Credentials();

    private Credentials() {
    }

    public static /* synthetic */ java.lang.String basic$default(java.lang.String str, java.lang.String str2, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            charset = kotlin.text.Charsets.ISO_8859_1;
        }
        return basic(str, str2, charset);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String basic(java.lang.String username, java.lang.String password, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(username, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(password, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(username);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON);
        sb.append(password);
        return "Basic ".concat(java.lang.String.valueOf(okio.ByteString.INSTANCE.encodeString(sb.toString(), charset).base64()));
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String basic(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return basic$default(str, str2, null, 4, null);
    }
}
