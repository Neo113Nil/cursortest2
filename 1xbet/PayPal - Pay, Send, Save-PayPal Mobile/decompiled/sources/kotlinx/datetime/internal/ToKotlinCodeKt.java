package kotlinx.datetime.internal;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\f\n\u0000\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0003H\u0000¢\u0006\u0004\b\u0001\u0010\u0004"}, d2 = {"", "toKotlinCode", "(Ljava/lang/String;)Ljava/lang/String;", "", "(C)Ljava/lang/String;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ToKotlinCodeKt {
    public static final java.lang.String toKotlinCode(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\"");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt != '\r') {
                if (charAt != '\"') {
                    if (charAt == '\\') {
                        sb.append("\\\\");
                    } else {
                        switch (charAt) {
                            case '\b':
                                sb.append("\\b");
                                break;
                            case '\t':
                                sb.append("\\t");
                                break;
                            case '\n':
                                sb.append("\\n");
                                break;
                            default:
                                sb.append(charAt);
                                break;
                        }
                    }
                } else {
                    sb.append("\\\"");
                }
            } else {
                sb.append("\\r");
            }
        }
        sb.append('\"');
        return sb.toString();
    }

    public static final java.lang.String toKotlinCode(char c) {
        if (c == '\'') {
            return "'\\''";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("'");
        sb.append(c);
        sb.append('\'');
        return sb.toString();
    }
}
