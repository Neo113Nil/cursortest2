package util.h.xy.au;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ˏ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes18.dex */
public final class rd {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static char[] getHighSpeedVideoFpsRangesFor;
    private static long getHighSpeedVideoSizes;
    private static final /* synthetic */ util.h.xy.au.rd[] getHighSpeedVideoSizesFor;
    private static int getInputFormats;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.au.rd f879;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final util.h.xy.au.rd f880;

    private rd(java.lang.String str, int i) {
    }

    public static util.h.xy.au.rd valueOf(java.lang.String str) {
        int i = getInputFormats + 65;
        Camera2StreamConfigurationMap = i % 128;
        util.h.xy.au.rd rdVar = (util.h.xy.au.rd) java.lang.Enum.valueOf(util.h.xy.au.rd.class, str);
        if (i % 2 == 0) {
            throw null;
        }
        Camera2StreamConfigurationMap = (getInputFormats + 65) % 128;
        return rdVar;
    }

    public static util.h.xy.au.rd[] values() {
        getInputFormats = (Camera2StreamConfigurationMap + 111) % 128;
        util.h.xy.au.rd[] rdVarArr = (util.h.xy.au.rd[]) getHighSpeedVideoSizesFor.clone();
        getInputFormats = (Camera2StreamConfigurationMap + 53) % 128;
        return rdVarArr;
    }

    static {
        Camera2StreamConfigurationMap();
        float scrollFriction = android.view.ViewConfiguration.getScrollFriction();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(9 - (scrollFriction > 0.0f ? 1 : (scrollFriction == 0.0f ? 0 : -1)), (-1) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), (char) (((byte) android.view.KeyEvent.getModifierMetaStateMask()) + com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME), objArr);
        util.h.xy.au.rd rdVar = new util.h.xy.au.rd(((java.lang.String) objArr[0]).intern(), 0);
        f880 = rdVar;
        int mode = android.view.View.MeasureSpec.getMode(0);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(11 - mode, 8 - android.view.KeyEvent.keyCodeFromString(""), (char) android.graphics.Color.alpha(0), objArr2);
        util.h.xy.au.rd rdVar2 = new util.h.xy.au.rd(((java.lang.String) objArr2[0]).intern(), 1);
        f879 = rdVar2;
        int i = Camera2StreamConfigurationMap;
        getInputFormats = (i + 33) % 128;
        int i2 = (i + 35) % 128;
        getInputFormats = i2;
        getHighSpeedVideoSizesFor = new util.h.xy.au.rd[]{rdVar, rdVar2};
        int i3 = i2 + 87;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static void Camera2StreamConfigurationMap(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 17) % 128;
        while (rbVar.f2651 < i) {
            jArr[rbVar.f2651] = (((char) (getHighSpeedVideoFpsRangesFor[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getHighSpeedVideoSizes))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 125) % 128;
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static void Camera2StreamConfigurationMap() {
        getHighSpeedVideoFpsRangesFor = new char[]{4383, 15885, 20277, 40002, 44361, 64106, 2961, 22730, 40027, 45904, 49788, 4379, 8202, 30512, 34504, 54783, 58616, 15243, 19124};
        getHighSpeedVideoSizes = 867924441156268822L;
    }
}
