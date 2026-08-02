package codec.language;

/* loaded from: classes7.dex */
public class RefinedSoundex implements codec.StringEncoder {
    public static final java.lang.String US_ENGLISH_MAPPING_STRING = "01360240043788015936020505";

    /* renamed from: a, reason: collision with root package name */
    public final char[] f2788a;
    public static final char[] b = "01360240043788015936020505".toCharArray();
    public static final codec.language.RefinedSoundex US_ENGLISH = new codec.language.RefinedSoundex();

    public RefinedSoundex() {
        this.f2788a = b;
    }

    public int difference(java.lang.String str, java.lang.String str2) throws codec.EncoderException {
        return com.payair.csdk.q2.a(this, str, str2);
    }

    @Override // codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws codec.EncoderException {
        if (obj instanceof java.lang.String) {
            return soundex((java.lang.String) obj);
        }
        throw new codec.EncoderException("Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
    }

    public java.lang.String soundex(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String a2 = com.payair.csdk.q2.a(str);
        if (a2.length() == 0) {
            return a2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(a2.charAt(0));
        char c = '*';
        for (int i = 0; i < a2.length(); i++) {
            char c2 = !java.lang.Character.isLetter(a2.charAt(i)) ? (char) 0 : this.f2788a[java.lang.Character.toUpperCase(r4) - 'A'];
            if (c2 != c) {
                if (c2 != 0) {
                    sb.append(c2);
                }
                c = c2;
            }
        }
        return sb.toString();
    }

    public RefinedSoundex(char[] cArr) {
        char[] cArr2 = new char[cArr.length];
        this.f2788a = cArr2;
        java.lang.System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    public RefinedSoundex(java.lang.String str) {
        this.f2788a = str.toCharArray();
    }

    @Override // codec.StringEncoder
    public java.lang.String encode(java.lang.String str) {
        return soundex(str);
    }
}
