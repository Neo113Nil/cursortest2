package util.h.xy.cm;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class ra {
    private static int Camera2StreamConfigurationMap = 1;
    private static final /* synthetic */ util.h.xy.cm.ra[] getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static char getHighSpeedVideoSizesFor;
    private static long getInputSizeshNQ4ISI;
    private static int getOutputMinFrameDuration;

    /* renamed from: ˎ, reason: contains not printable characters */
    public static final util.h.xy.cm.ra f1119;

    private ra(java.lang.String str) {
    }

    public static util.h.xy.cm.ra valueOf(java.lang.String str) {
        int i = getHighSpeedVideoFpsRanges + 97;
        Camera2StreamConfigurationMap = i % 128;
        util.h.xy.cm.ra raVar = (util.h.xy.cm.ra) java.lang.Enum.valueOf(util.h.xy.cm.ra.class, str);
        if (i % 2 != 0) {
            return raVar;
        }
        throw null;
    }

    public static util.h.xy.cm.ra[] values() {
        int i = getHighSpeedVideoFpsRanges + 85;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        util.h.xy.cm.ra[] raVarArr = (util.h.xy.cm.ra[]) getHighResolutionOutputSizeshNQ4ISI.clone();
        getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 85) % 128;
        return raVarArr;
    }

    static {
        Camera2StreamConfigurationMap();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("懫鄄", (char) (328 - android.graphics.Color.green(0)), android.graphics.Color.blue(0), "괍ᘈ䡠\u0601", "\u0000\u0000\u0000\u0000", objArr);
        util.h.xy.cm.ra raVar = new util.h.xy.cm.ra(((java.lang.String) objArr[0]).intern());
        f1119 = raVar;
        int i = getHighSpeedVideoFpsRanges;
        Camera2StreamConfigurationMap = (i + 99) % 128;
        util.h.xy.cm.ra[] raVarArr = {raVar};
        int i2 = i + 13;
        int i3 = i2 % 128;
        Camera2StreamConfigurationMap = i3;
        if (i2 % 2 != 0) {
            getHighResolutionOutputSizeshNQ4ISI = raVarArr;
            int i4 = i3 + 49;
            getHighSpeedVideoFpsRanges = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            return;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final java.lang.String m25970() {
        java.lang.Object obj;
        int i = Camera2StreamConfigurationMap + 13;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("懫鄄", (char) (10026 << android.text.TextUtils.lastIndexOf("", 'W', 1)), (android.media.AudioTrack.getMinVolume() > 2.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 2.0f ? 0 : -1)), "괍ᘈ䡠\u0601", "\u0000\u0000\u0000\u0000", objArr);
            obj = objArr[0];
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("懫鄄", (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 329), (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "괍ᘈ䡠\u0601", "\u0000\u0000\u0000\u0000", objArr2);
            obj = objArr2[0];
        }
        return ((java.lang.String) obj).intern();
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 89) % 128;
        char[] charArray = str3.toCharArray();
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 47) % 128;
        char[] charArray2 = str2.toCharArray();
        char[] charArray3 = str.toCharArray();
        util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
        int length = charArray2.length;
        char[] cArr = new char[length];
        int length2 = charArray.length;
        char[] cArr2 = new char[length2];
        java.lang.System.arraycopy(charArray2, 0, cArr, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c);
        cArr2[2] = (char) (cArr2[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr3 = new char[length3];
        rcVar.f2652 = 0;
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 49) % 128;
        while (rcVar.f2652 < length3) {
            int i2 = (rcVar.f2652 + 2) % 4;
            int i3 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i2]) % 65535);
            cArr2[i3] = (char) (((cArr[i3] * 32718) + cArr2[i2]) / 65535);
            cArr[i3] = rcVar.f2653;
            cArr3[rcVar.f2652] = (char) ((((cArr[i3] ^ charArray3[rcVar.f2652]) ^ (getInputSizeshNQ4ISI ^ 2457411417541981002L)) ^ ((int) (getOutputMinFrameDuration ^ 2457411417541981002L))) ^ ((char) (getHighSpeedVideoSizesFor ^ 2457411417541981002L)));
            rcVar.f2652++;
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 31) % 128;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void Camera2StreamConfigurationMap() {
        getInputSizeshNQ4ISI = 2457411417541981002L;
        getOutputMinFrameDuration = 294925130;
        getHighSpeedVideoSizesFor = (char) 25187;
    }
}
