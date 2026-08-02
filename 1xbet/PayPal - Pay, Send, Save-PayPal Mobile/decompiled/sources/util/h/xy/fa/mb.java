package util.h.xy.fa;

/* loaded from: classes5.dex */
public final class mb {
    private static int Camera2StreamConfigurationMap = 0;
    private static final util.h.xy.fa.b getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static long getHighSpeedVideoSizes = 0;
    private static int getInputFormats = 1;
    private static int getOutputFormats;
    private static char getOutputMinFrameDuration;

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        char[] charArray = str3.toCharArray();
        char[] charArray2 = str2.toCharArray();
        int i2 = (getHighSpeedVideoFpsRangesFor + 111) % 128;
        Camera2StreamConfigurationMap = i2;
        char[] cArr = charArray2;
        int i3 = i2 + 119;
        getHighSpeedVideoFpsRangesFor = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray3 = str.toCharArray();
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 107) % 128;
        util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int length2 = charArray.length;
        char[] cArr3 = new char[length2];
        java.lang.System.arraycopy(cArr, 0, cArr2, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c);
        cArr3[2] = (char) (cArr3[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr4 = new char[length3];
        rcVar.f2652 = 0;
        while (rcVar.f2652 < length3) {
            int i4 = (rcVar.f2652 + 2) % 4;
            int i5 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr2[rcVar.f2652 % 4] * 32718) + cArr3[i4]) % 65535);
            cArr3[i5] = (char) (((cArr2[i5] * 32718) + cArr3[i4]) / 65535);
            cArr2[i5] = rcVar.f2653;
            cArr4[rcVar.f2652] = (char) ((((cArr2[i5] ^ r2[rcVar.f2652]) ^ (getHighSpeedVideoSizes ^ 2457411417541981002L)) ^ ((int) (getHighSpeedVideoFpsRanges ^ 2457411417541981002L))) ^ ((char) (getOutputMinFrameDuration ^ 2457411417541981002L)));
            rcVar.f2652++;
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    static {
        Camera2StreamConfigurationMap();
        getHighResolutionOutputSizeshNQ4ISI = new util.h.xy.fa.ra();
        getInputFormats = (getOutputFormats + 31) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static byte[] m26807(java.lang.String str) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            getHighResolutionOutputSizeshNQ4ISI.mo26794(str, byteArrayOutputStream);
            getInputFormats = (getOutputFormats + 63) % 128;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            getInputFormats = (getOutputFormats + 115) % 128;
            return byteArray;
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("г셖잓뒉랰\udf3cꈅ\uf237ޛ쓉蜤潫\u2432侧\ue6ad珢Ḥ䐿ૃ뼪몳Ԧ뼠巇\ue533ඦ\udb41ﲓ㮨\udaa9\ue1aa\uf370", (char) (android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 57624), android.view.View.MeasureSpec.makeMeasureSpec(0, 0), "桷潿ᠥ巡", "\ude83\uea1f\uedd6\ue5fb", objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e.getMessage());
            throw new util.h.xy.fa.a(sb.toString(), e);
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m26811(byte[] bArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream((bArr.length / 4) * 3);
        try {
            getHighResolutionOutputSizeshNQ4ISI.mo26795(bArr, 0, bArr.length, byteArrayOutputStream);
            int i = (getInputFormats + 51) % 128;
            getOutputFormats = i;
            getInputFormats = (i + 119) % 128;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            getOutputFormats = (getInputFormats + 77) % 128;
            return byteArray;
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("⣝曠\uf78d\ueaee\uf29c⤁ᑑ⊞瑎ڝ\uf3a2렸猽쪼夓⛚魼폤풸鿃ꦒﳌ㖡㊆⣸ᡖ㤗胍흈穀", (char) (47750 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), android.graphics.drawable.Drawable.resolveOpacity(0, 0), "\uf7ee魛虨蒺", "\ude83\uea1f\uedd6\ue5fb", objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e.getMessage());
            throw new util.h.xy.fa.a(sb.toString(), e);
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static byte[] m26808(byte[] bArr, int i, int i2) {
        util.h.xy.fa.b bVar = getHighResolutionOutputSizeshNQ4ISI;
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(bVar.mo26797(i2));
        try {
            bVar.mo26796(bArr, i, i2, byteArrayOutputStream);
            int i3 = getOutputFormats;
            getInputFormats = (i3 + 95) % 128;
            int i4 = i3 + 35;
            getInputFormats = i4 % 128;
            if (i4 % 2 != 0) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.toByteArray();
            throw null;
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("⪞릲肷⬍糂拐\uf89b豬䟺벻듹⟍\uef99馷\udbfe\ufae6\ueed7䊸\uf5e5熫ࣴ擱럸溚㺚줣ᕓ蕫ቁ兕訒ྞ㲈ꡲ", (char) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), android.view.KeyEvent.keyCodeFromString(""), "邬盌㗛뿭", "\ude83\uea1f\uedd6\ue5fb", objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e.getMessage());
            throw new util.h.xy.fa.ma(sb.toString(), e);
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static byte[] m26810(byte[] bArr) {
        getInputFormats = (getOutputFormats + 117) % 128;
        byte[] m26808 = m26808(bArr, 0, bArr.length);
        getOutputFormats = (getInputFormats + 103) % 128;
        return m26808;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static java.lang.String m26809(byte[] bArr, int i, int i2) {
        getInputFormats = (getOutputFormats + 115) % 128;
        java.lang.String m26855 = util.h.xy.fb.rd.m26855(m26808(bArr, i, i2));
        getInputFormats = (getOutputFormats + 19) % 128;
        return m26855;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static java.lang.String m26806(byte[] bArr) {
        getOutputFormats = (getInputFormats + 1) % 128;
        java.lang.String m26809 = m26809(bArr, 0, bArr.length);
        int i = getOutputFormats + 15;
        getInputFormats = i % 128;
        if (i % 2 != 0) {
            return m26809;
        }
        throw new java.lang.ArithmeticException();
    }

    static void Camera2StreamConfigurationMap() {
        getHighSpeedVideoSizes = -4043784427350004279L;
        getHighSpeedVideoFpsRanges = 294925130;
        getOutputMinFrameDuration = (char) 13130;
    }
}
