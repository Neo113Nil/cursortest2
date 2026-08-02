package codec.language;

/* loaded from: classes7.dex */
public class Soundex implements codec.StringEncoder {
    public static final char SILENT_MARKER = '-';
    public static final java.lang.String US_ENGLISH_MAPPING_STRING = "01230120022455012623010202";

    /* renamed from: a, reason: collision with root package name */
    public int f2789a;
    public final char[] b;
    public final boolean c;
    public static final char[] d = "01230120022455012623010202".toCharArray();
    public static final codec.language.Soundex US_ENGLISH = new codec.language.Soundex();
    public static final codec.language.Soundex US_ENGLISH_SIMPLIFIED = new codec.language.Soundex("01230120022455012623010202", false);
    public static final codec.language.Soundex US_ENGLISH_GENEALOGY = new codec.language.Soundex("-123-12--22455-12623-1-2-2");

    public Soundex() {
        this.f2789a = 4;
        this.b = d;
        this.c = true;
    }

    public int difference(java.lang.String str, java.lang.String str2) throws codec.EncoderException {
        return com.payair.csdk.q2.a(this, str, str2);
    }

    @Override // codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws codec.EncoderException {
        if (obj instanceof java.lang.String) {
            return soundex((java.lang.String) obj);
        }
        throw new codec.EncoderException("Parameter supplied to Soundex encode is not of type java.lang.String");
    }

    @java.lang.Deprecated
    public int getMaxLength() {
        return this.f2789a;
    }

    @java.lang.Deprecated
    public void setMaxLength(int i) {
        this.f2789a = i;
    }

    public java.lang.String soundex(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String a2 = com.payair.csdk.q2.a(str);
        if (a2.length() == 0) {
            return a2;
        }
        char[] cArr = {com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask};
        char charAt = a2.charAt(0);
        cArr[0] = charAt;
        int i = charAt - 'A';
        if (i >= 0) {
            char[] cArr2 = this.b;
            if (i < cArr2.length) {
                char c = cArr2[i];
                int i2 = 1;
                for (int i3 = 1; i3 < a2.length() && i2 < 4; i3++) {
                    char charAt2 = a2.charAt(i3);
                    if (!this.c || (charAt2 != 'H' && charAt2 != 'W')) {
                        int i4 = charAt2 - 'A';
                        if (i4 >= 0) {
                            char[] cArr3 = this.b;
                            if (i4 < cArr3.length) {
                                char c2 = cArr3[i4];
                                if (c2 != '-') {
                                    if (c2 != '0' && c2 != c) {
                                        cArr[i2] = c2;
                                        i2++;
                                    }
                                    c = c2;
                                }
                            }
                        }
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("The character is not mapped: ");
                        sb.append(charAt2);
                        sb.append(" (index=");
                        sb.append(i4);
                        sb.append(")");
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                }
                return new java.lang.String(cArr);
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("The character is not mapped: ");
        sb2.append(charAt);
        sb2.append(" (index=");
        sb2.append(i);
        sb2.append(")");
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    @Override // codec.StringEncoder
    public java.lang.String encode(java.lang.String str) {
        return soundex(str);
    }

    public Soundex(char[] cArr) {
        this.f2789a = 4;
        int length = cArr.length;
        char[] cArr2 = new char[length];
        this.b = cArr2;
        boolean z = false;
        java.lang.System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (cArr2[i] == '-') {
                z = true;
                break;
            }
            i++;
        }
        this.c = !z;
    }

    public Soundex(java.lang.String str) {
        this.f2789a = 4;
        char[] charArray = str.toCharArray();
        this.b = charArray;
        int length = charArray.length;
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (charArray[i] == '-') {
                z = true;
                break;
            }
            i++;
        }
        this.c = !z;
    }

    public Soundex(java.lang.String str, boolean z) {
        this.f2789a = 4;
        this.b = str.toCharArray();
        this.c = z;
    }
}
