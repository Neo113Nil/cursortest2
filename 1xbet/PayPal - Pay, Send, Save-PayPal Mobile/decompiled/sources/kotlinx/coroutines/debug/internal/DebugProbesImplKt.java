package kotlinx.coroutines.debug.internal;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DebugProbesImplKt {
    public static final /* synthetic */ java.lang.String access$repr(java.lang.String str) {
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
}
