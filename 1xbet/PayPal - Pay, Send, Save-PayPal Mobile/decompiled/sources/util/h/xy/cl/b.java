package util.h.xy.cl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class b {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static boolean getHighSpeedVideoFpsRanges = false;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static boolean getHighSpeedVideoSizesFor;
    private static final /* synthetic */ util.h.xy.cl.b[] getInputFormats;
    private static int getInputSizeshNQ4ISI;
    private static char[] getOutputMinFrameDuration;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.cl.b f1117;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final util.h.xy.cl.b f1118;

    private b(java.lang.String str, int i) {
    }

    public static util.h.xy.cl.b valueOf(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor + 25;
        getHighSpeedVideoSizes = i % 128;
        util.h.xy.cl.b bVar = (util.h.xy.cl.b) java.lang.Enum.valueOf(util.h.xy.cl.b.class, str);
        if (i % 2 == 0) {
            throw null;
        }
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 103) % 128;
        return bVar;
    }

    public static util.h.xy.cl.b[] values() {
        int i = getHighSpeedVideoFpsRangesFor + 55;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.cl.b[] bVarArr = (util.h.xy.cl.b[]) getInputFormats.clone();
        int i2 = getHighSpeedVideoSizes + 45;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 == 0) {
            return bVarArr;
        }
        throw null;
    }

    static {
        util.h.xy.cl.b[] bVarArr;
        getHighSpeedVideoFpsRangesFor();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, "\u0088\u0087\u0084\u0086\u0081\u0085\u0084\u0083\u0082\u0082\u0081", objArr);
        util.h.xy.cl.b bVar = new util.h.xy.cl.b(((java.lang.String) objArr[0]).intern(), 0);
        f1117 = bVar;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(175 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), "\u0088\u0084\u0089\u0087\u0083", objArr2);
        util.h.xy.cl.b bVar2 = new util.h.xy.cl.b(((java.lang.String) objArr2[0]).intern(), 1);
        f1118 = bVar2;
        int i = getHighSpeedVideoFpsRangesFor;
        int i2 = i + 101;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            bVarArr = new util.h.xy.cl.b[3];
            bVarArr[1] = bVar;
            bVarArr[1] = bVar2;
        } else {
            bVarArr = new util.h.xy.cl.b[]{bVar, bVar2};
        }
        getInputFormats = bVarArr;
        int i3 = i + 3;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
    }

    private static void Camera2StreamConfigurationMap(int i, java.lang.String str, java.lang.Object[] objArr) {
        char[] cArr;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.md mdVar = new util.h.xz.b.md();
        char[] cArr2 = getOutputMinFrameDuration;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i2 = 0; i2 < length; i2++) {
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 67) % 128;
                cArr3[i2] = (char) (cArr2[i2] ^ (-3299939579226817547L));
            }
            cArr2 = cArr3;
        }
        int i3 = (int) ((-3299939579226817547L) ^ getInputSizeshNQ4ISI);
        if (!getHighSpeedVideoFpsRanges) {
            if (!getHighSpeedVideoSizesFor) {
                throw null;
            }
            int i4 = getHighResolutionOutputSizeshNQ4ISI + 63;
            Camera2StreamConfigurationMap = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
            throw null;
        }
        int i5 = getHighResolutionOutputSizeshNQ4ISI + 109;
        Camera2StreamConfigurationMap = i5 % 128;
        if (i5 % 2 != 0) {
            mdVar.f2642 = bytes.length;
            cArr = new char[mdVar.f2642];
            mdVar.f2643 = 1;
        } else {
            mdVar.f2642 = bytes.length;
            cArr = new char[mdVar.f2642];
            mdVar.f2643 = 0;
        }
        while (mdVar.f2643 < mdVar.f2642) {
            cArr[mdVar.f2643] = (char) (cArr2[bytes[(mdVar.f2642 - 1) - mdVar.f2643] + i] - i3);
            mdVar.f2643++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getOutputMinFrameDuration = new char[]{64311, 64292, 64312, 64319, 64305, 64288, 64293, 64314, 64317};
        getInputSizeshNQ4ISI = -1074857100;
        getHighSpeedVideoSizesFor = true;
        getHighSpeedVideoFpsRanges = true;
    }
}
