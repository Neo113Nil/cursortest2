package codec.language;

/* loaded from: classes7.dex */
public class ColognePhonetic implements codec.StringEncoder {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f2780a = {'A', 'E', 'I', 'J', 'O', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_UT, io.ktor.util.date.GMTDateParser.YEAR};
    public static final char[] b = {'C', 'S', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_ZERO};
    public static final char[] c = {'F', 'P', 'V', 'W'};
    public static final char[] d = {'G', 'K', 'Q'};
    public static final char[] e = {'C', 'K', 'Q'};
    public static final char[] f = {'A', 'H', 'K', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_LT, 'O', 'Q', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_REGULAR, org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_UT, 'X'};
    public static final char[] g = {'S', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_ZERO};
    public static final char[] h = {'A', 'H', 'K', 'O', 'Q', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_UT, 'X'};
    public static final char[] i = {'D', 'T', 'X'};

    public static boolean a(char[] cArr, char c2) {
        for (char c3 : cArr) {
            if (c3 == c2) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String colognePhonetic(java.lang.String str) {
        if (str == null) {
            return null;
        }
        char[] charArray = str.toUpperCase(java.util.Locale.GERMAN).toCharArray();
        for (int i2 = 0; i2 < charArray.length; i2++) {
            char c2 = charArray[i2];
            if (c2 == 196) {
                charArray[i2] = 'A';
            } else if (c2 == 214) {
                charArray[i2] = 'O';
            } else if (c2 == 220) {
                charArray[i2] = org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_RANDOM_UT;
            }
        }
        int length = charArray.length;
        codec.language.b bVar = new codec.language.b(length * 2);
        char c3 = '-';
        while (length > 0) {
            char c4 = charArray[charArray.length - length];
            length--;
            char c5 = length > 0 ? charArray[charArray.length - length] : '-';
            if (c4 >= 'A' && c4 <= 'Z') {
                if (a(f2780a, c4)) {
                    bVar.a(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                } else if (c4 == 'B' || (c4 == 'P' && c5 != 'H')) {
                    bVar.a('1');
                } else if ((c4 == 'D' || c4 == 'T') && !a(b, c5)) {
                    bVar.a('2');
                } else if (a(c, c4)) {
                    bVar.a('3');
                } else if (a(d, c4)) {
                    bVar.a('4');
                } else if (c4 == 'X' && !a(e, c3)) {
                    bVar.a('4');
                    bVar.a('8');
                } else if (c4 == 'S' || c4 == 'Z') {
                    bVar.a('8');
                } else if (c4 == 'C') {
                    if (bVar.b == 0) {
                        if (a(f, c5)) {
                            bVar.a('4');
                        } else {
                            bVar.a('8');
                        }
                    } else if (a(g, c3) || !a(h, c5)) {
                        bVar.a('8');
                    } else {
                        bVar.a('4');
                    }
                } else if (a(i, c4)) {
                    bVar.a('8');
                } else if (c4 == 'R') {
                    bVar.a('7');
                } else if (c4 == 'L') {
                    bVar.a('5');
                } else if (c4 == 'M' || c4 == 'N') {
                    bVar.a('6');
                } else if (c4 == 'H') {
                    bVar.c = '-';
                }
                c3 = c4;
            }
        }
        return bVar.toString();
    }

    @Override // codec.Encoder
    public java.lang.Object encode(java.lang.Object obj) throws codec.EncoderException {
        if (obj instanceof java.lang.String) {
            return encode((java.lang.String) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("This method's parameter was expected to be of the type ");
        sb.append(java.lang.String.class.getName());
        sb.append(". But actually it was of the type ");
        sb.append(obj.getClass().getName());
        sb.append(".");
        throw new codec.EncoderException(sb.toString());
    }

    public boolean isEncodeEqual(java.lang.String str, java.lang.String str2) {
        return colognePhonetic(str).equals(colognePhonetic(str2));
    }

    @Override // codec.StringEncoder
    public java.lang.String encode(java.lang.String str) {
        return colognePhonetic(str);
    }
}
