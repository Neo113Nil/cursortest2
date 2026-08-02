package kotlinx.serialization.json.internal;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007*\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\"(\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n8\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\"\u001a\u0010\u0012\u001a\u00020\u00118\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Ljava/lang/StringBuilder;", "Lkotlin/text/getHighSpeedVideoSizes;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "printQuoted", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "", "toBooleanStrictOrNull", "(Ljava/lang/String;)Ljava/lang/Boolean;", "", "ESCAPE_STRINGS", "[Ljava/lang/String;", "getESCAPE_STRINGS", "()[Ljava/lang/String;", "getESCAPE_STRINGS$annotations", "()V", "", "ESCAPE_MARKERS", "[B", "getESCAPE_MARKERS", "()[B"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StringOpsKt {
    private static final byte[] ESCAPE_MARKERS;
    private static final java.lang.String[] ESCAPE_STRINGS;

    @kotlinx.serialization.json.internal.JsonFriendModuleApi
    public static /* synthetic */ void getESCAPE_STRINGS$annotations() {
    }

    static {
        java.lang.String[] strArr = new java.lang.String[93];
        for (int i = 0; i < 32; i++) {
            int i2 = (i >> 12) & 15;
            char c = (char) (i2 < 10 ? i2 + 48 : i2 + 87);
            int i3 = (i >> 8) & 15;
            char c2 = (char) (i3 < 10 ? i3 + 48 : i3 + 87);
            int i4 = (i >> 4) & 15;
            char c3 = (char) (i4 < 10 ? i4 + 48 : i4 + 87);
            int i5 = i & 15;
            char c4 = (char) (i5 < 10 ? i5 + 48 : i5 + 87);
            java.lang.StringBuilder sb = new java.lang.StringBuilder("\\u");
            sb.append(c);
            sb.append(c2);
            sb.append(c3);
            sb.append(c4);
            strArr[i] = sb.toString();
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        ESCAPE_STRINGS = strArr;
        byte[] bArr = new byte[93];
        for (int i6 = 0; i6 < 32; i6++) {
            bArr[i6] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        ESCAPE_MARKERS = bArr;
    }

    public static final java.lang.String[] getESCAPE_STRINGS() {
        return ESCAPE_STRINGS;
    }

    public static final byte[] getESCAPE_MARKERS() {
        return ESCAPE_MARKERS;
    }

    public static final void printQuoted(java.lang.StringBuilder sb, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        sb.append('\"');
        java.lang.String str2 = str;
        int length = str2.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            java.lang.String[] strArr = ESCAPE_STRINGS;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb.append((java.lang.CharSequence) str2, i, i2);
                sb.append(strArr[charAt]);
                i = i2 + 1;
            }
        }
        if (i != 0) {
            sb.append((java.lang.CharSequence) str2, i, str.length());
        } else {
            sb.append(str);
        }
        sb.append('\"');
    }

    public static final java.lang.Boolean toBooleanStrictOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (kotlin.text.StringsKt.equals(str, "true", true)) {
            return java.lang.Boolean.TRUE;
        }
        if (kotlin.text.StringsKt.equals(str, "false", true)) {
            return java.lang.Boolean.FALSE;
        }
        return null;
    }
}
