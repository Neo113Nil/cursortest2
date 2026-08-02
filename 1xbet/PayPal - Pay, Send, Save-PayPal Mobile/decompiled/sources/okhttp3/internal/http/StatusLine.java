package okhttp3.internal.http;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0011\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0011\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\u000e"}, d2 = {"Lokhttp3/internal/http/StatusLine;", "", "Lokhttp3/Protocol;", "protocol", "", "code", "", "message", "<init>", "(Lokhttp3/Protocol;ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "Lokhttp3/Protocol;", com.visa.cbp.getEncExpo.warmup, "Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StatusLine {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final okhttp3.internal.http.StatusLine.Companion INSTANCE = new okhttp3.internal.http.StatusLine.Companion(null);
    public final int code;
    public final java.lang.String message;
    public final okhttp3.Protocol protocol;

    public StatusLine(okhttp3.Protocol protocol, int i, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(protocol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.protocol = protocol;
        this.code = i;
        this.message = str;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.protocol == okhttp3.Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.code);
        sb.append(' ');
        sb.append(this.message);
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lokhttp3/internal/http/StatusLine$Companion;", "", "<init>", "()V", "Lokhttp3/Response;", "response", "Lokhttp3/internal/http/StatusLine;", "get", "(Lokhttp3/Response;)Lokhttp3/internal/http/StatusLine;", "", "statusLine", "parse", "(Ljava/lang/String;)Lokhttp3/internal/http/StatusLine;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final okhttp3.internal.http.StatusLine get(okhttp3.Response response) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(response, "");
            return new okhttp3.internal.http.StatusLine(response.protocol(), response.code(), response.message());
        }

        public final okhttp3.internal.http.StatusLine parse(java.lang.String statusLine) throws java.io.IOException {
            okhttp3.Protocol protocol;
            int i;
            java.lang.String str = "";
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statusLine, "");
            if (kotlin.text.StringsKt.startsWith$default(statusLine, "HTTP/1.", false, 2, (java.lang.Object) null)) {
                i = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new java.net.ProtocolException("Unexpected status line: ".concat(java.lang.String.valueOf(statusLine)));
                }
                int charAt = statusLine.charAt(7) - '0';
                if (charAt == 0) {
                    protocol = okhttp3.Protocol.HTTP_1_0;
                } else if (charAt == 1) {
                    protocol = okhttp3.Protocol.HTTP_1_1;
                } else {
                    throw new java.net.ProtocolException("Unexpected status line: ".concat(java.lang.String.valueOf(statusLine)));
                }
            } else if (kotlin.text.StringsKt.startsWith$default(statusLine, "ICY ", false, 2, (java.lang.Object) null)) {
                protocol = okhttp3.Protocol.HTTP_1_0;
                i = 4;
            } else if (kotlin.text.StringsKt.startsWith$default(statusLine, "SOURCETABLE ", false, 2, (java.lang.Object) null)) {
                protocol = okhttp3.Protocol.HTTP_1_1;
                i = 12;
            } else {
                throw new java.net.ProtocolException("Unexpected status line: ".concat(java.lang.String.valueOf(statusLine)));
            }
            int i2 = i + 3;
            if (statusLine.length() < i2) {
                throw new java.net.ProtocolException("Unexpected status line: ".concat(java.lang.String.valueOf(statusLine)));
            }
            java.lang.String substring = statusLine.substring(i, i2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            java.lang.Integer intOrNull = kotlin.text.StringsKt.toIntOrNull(substring);
            if (intOrNull == null) {
                throw new java.net.ProtocolException("Unexpected status line: ".concat(java.lang.String.valueOf(statusLine)));
            }
            int intValue = intOrNull.intValue();
            if (statusLine.length() > i2) {
                if (statusLine.charAt(i2) != ' ') {
                    throw new java.net.ProtocolException("Unexpected status line: ".concat(java.lang.String.valueOf(statusLine)));
                }
                java.lang.String substring2 = statusLine.substring(i + 4);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring2, "");
                str = substring2;
            }
            return new okhttp3.internal.http.StatusLine(protocol, intValue, str);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
