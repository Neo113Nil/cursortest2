package R4;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f2725a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f2726b;

    static {
        String[] strArr = new String[93];
        for (int i2 = 0; i2 < 32; i2++) {
            strArr[i2] = "\\u" + b(i2 >> 12) + b(i2 >> 8) + b(i2 >> 4) + b(i2);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f2725a = strArr;
        byte[] bArr = new byte[93];
        for (int i3 = 0; i3 < 32; i3++) {
            bArr[i3] = 1;
        }
        bArr[34] = 34;
        bArr[92] = 92;
        bArr[9] = 116;
        bArr[8] = 98;
        bArr[10] = 110;
        bArr[13] = 114;
        bArr[12] = 102;
        f2726b = bArr;
    }

    public static final void a(StringBuilder sb, String value) {
        kotlin.jvm.internal.i.e(value, "value");
        sb.append('\"');
        int length = value.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = value.charAt(i3);
            String[] strArr = f2725a;
            if (charAt < strArr.length && strArr[charAt] != null) {
                sb.append((CharSequence) value, i2, i3);
                sb.append(strArr[charAt]);
                i2 = i3 + 1;
            }
        }
        if (i2 != 0) {
            sb.append((CharSequence) value, i2, value.length());
        } else {
            sb.append(value);
        }
        sb.append('\"');
    }

    public static final char b(int i2) {
        int i3 = i2 & 15;
        return (char) (i3 < 10 ? i3 + 48 : i3 + 87);
    }
}
