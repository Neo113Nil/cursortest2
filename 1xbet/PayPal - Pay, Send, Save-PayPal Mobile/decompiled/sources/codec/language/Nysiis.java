package codec.language;

/* loaded from: classes7.dex */
public class Nysiis implements codec.StringEncoder {
    public static final char[] b = {'A'};
    public static final char[] c = {'A', 'F'};
    public static final char[] d = {'C'};
    public static final char[] e = {'F', 'F'};
    public static final char[] f = {'G'};
    public static final char[] g = {'N'};
    public static final char[] h = {'N', 'N'};
    public static final char[] i = {'S'};
    public static final char[] j = {'S', 'S', 'S'};
    public static final java.util.regex.Pattern k = java.util.regex.Pattern.compile("^MAC");
    public static final java.util.regex.Pattern l = java.util.regex.Pattern.compile("^KN");
    public static final java.util.regex.Pattern m = java.util.regex.Pattern.compile("^K");
    public static final java.util.regex.Pattern n = java.util.regex.Pattern.compile("^(PH|PF)");

    /* renamed from: o, reason: collision with root package name */
    public static final java.util.regex.Pattern f2786o = java.util.regex.Pattern.compile("^SCH");
    public static final java.util.regex.Pattern p = java.util.regex.Pattern.compile("(EE|IE)$");
    public static final java.util.regex.Pattern q = java.util.regex.Pattern.compile("(DT|RT|RD|NT|ND)$");

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2787a;

    public Nysiis() {
        this(true);
    }

    public static boolean a(char c2) {
        return c2 == 'A' || c2 == 'E' || c2 == 'I' || c2 == 'O' || c2 == 'U';
    }

    @Override // codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws codec.EncoderException {
        if (obj instanceof java.lang.String) {
            return nysiis((java.lang.String) obj);
        }
        throw new codec.EncoderException("Parameter supplied to Nysiis encode is not of type java.lang.String");
    }

    public boolean isStrict() {
        return this.f2787a;
    }

    public java.lang.String nysiis(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String a2 = com.payair.csdk.q2.a(str);
        if (a2.length() == 0) {
            return a2;
        }
        java.lang.String replaceFirst = q.matcher(p.matcher(f2786o.matcher(n.matcher(m.matcher(l.matcher(k.matcher(a2).replaceFirst("MCC")).replaceFirst("NN")).replaceFirst(com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.CORDOVA)).replaceFirst("FF")).replaceFirst("SSS")).replaceFirst("Y")).replaceFirst("D");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(replaceFirst.length());
        sb.append(replaceFirst.charAt(0));
        char[] charArray = replaceFirst.toCharArray();
        int length = charArray.length;
        int i2 = 1;
        while (i2 < length) {
            char c2 = i2 < length + (-1) ? charArray[i2 + 1] : ' ';
            char c3 = i2 < length + (-2) ? charArray[i2 + 2] : ' ';
            int i3 = i2 - 1;
            char c4 = charArray[i3];
            char c5 = charArray[i2];
            char[] cArr = (c5 == 'E' && c2 == 'V') ? c : a(c5) ? b : c5 == 'Q' ? f : c5 == 'Z' ? i : c5 == 'M' ? g : c5 == 'K' ? c2 == 'N' ? h : d : (c5 == 'S' && c2 == 'C' && c3 == 'H') ? j : (c5 == 'P' && c2 == 'H') ? e : (c5 != 'H' || (a(c4) && a(c2))) ? (c5 == 'W' && a(c4)) ? new char[]{c4} : new char[]{c5} : new char[]{c4};
            java.lang.System.arraycopy(cArr, 0, charArray, i2, cArr.length);
            char c6 = charArray[i2];
            if (c6 != charArray[i3]) {
                sb.append(c6);
            }
            i2++;
        }
        if (sb.length() > 1) {
            char charAt = sb.charAt(sb.length() - 1);
            if (charAt == 'S') {
                sb.deleteCharAt(sb.length() - 1);
                charAt = sb.charAt(sb.length() - 1);
            }
            if (sb.length() > 2 && sb.charAt(sb.length() - 2) == 'A' && charAt == 'Y') {
                sb.deleteCharAt(sb.length() - 2);
            }
            if (charAt == 'A') {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        java.lang.String obj = sb.toString();
        return isStrict() ? obj.substring(0, java.lang.Math.min(6, obj.length())) : obj;
    }

    public Nysiis(boolean z) {
        this.f2787a = z;
    }

    @Override // codec.StringEncoder
    public java.lang.String encode(java.lang.String str) {
        return nysiis(str);
    }
}
