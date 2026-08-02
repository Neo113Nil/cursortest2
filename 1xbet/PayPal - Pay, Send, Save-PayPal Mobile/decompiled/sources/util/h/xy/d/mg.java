package util.h.xy.d;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class mg {
    private static char Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static char getHighSpeedVideoFpsRanges = 0;
    private static char getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 0;
    private static char getHighSpeedVideoSizesFor = 0;
    private static int getInputSizeshNQ4ISI = 0;
    private static int getOutputFormats = 1;
    private static final /* synthetic */ util.h.xy.d.mg[] getOutputMinFrameDuration;

    /* renamed from: ˋ, reason: contains not printable characters */
    public static final util.h.xy.d.mg f1144;

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static final util.h.xy.d.mg f1145;
    private final byte getInputFormats;
    private java.lang.String getOutputStallDuration;

    public static util.h.xy.d.mg valueOf(java.lang.String str) {
        getOutputFormats = (getInputSizeshNQ4ISI + 113) % 128;
        util.h.xy.d.mg mgVar = (util.h.xy.d.mg) java.lang.Enum.valueOf(util.h.xy.d.mg.class, str);
        int i = getInputSizeshNQ4ISI + 113;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            return mgVar;
        }
        throw null;
    }

    public static util.h.xy.d.mg[] values() {
        getOutputFormats = (getInputSizeshNQ4ISI + 49) % 128;
        util.h.xy.d.mg[] mgVarArr = (util.h.xy.d.mg[]) getOutputMinFrameDuration.clone();
        int i = getInputSizeshNQ4ISI + 73;
        getOutputFormats = i % 128;
        if (i % 2 != 0) {
            return mgVarArr;
        }
        throw null;
    }

    static {
        getHighSpeedVideoFpsRangesFor();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("\ud888㊍忘ꃗ", android.graphics.Color.red(0) + 3, objArr);
        util.h.xy.d.mg mgVar = new util.h.xy.d.mg(((java.lang.String) objArr[0]).intern(), 0, (byte) 17, util.h.xy.al.ma.f218);
        f1145 = mgVar;
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes("螇\ue760忘ꃗ", 2 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr2);
        util.h.xy.d.mg mgVar2 = new util.h.xy.d.mg(((java.lang.String) objArr2[0]).intern(), 1, (byte) 34, util.h.xy.al.ma.f239);
        f1144 = mgVar2;
        int i = (getOutputFormats + 83) % 128;
        getInputSizeshNQ4ISI = i;
        util.h.xy.d.mg[] mgVarArr = {mgVar, mgVar2};
        int i2 = i + 21;
        getOutputFormats = i2 % 128;
        if (i2 % 2 != 0) {
            getOutputMinFrameDuration = mgVarArr;
            getOutputFormats = (i + 25) % 128;
            return;
        }
        throw null;
    }

    private mg(java.lang.String str, int i, byte b, java.lang.String str2) {
        this.getInputFormats = b;
        this.getOutputStallDuration = str2;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m26218() {
        byte[] bArr;
        int i = getInputSizeshNQ4ISI + 29;
        int i2 = i % 128;
        getOutputFormats = i2;
        if (i % 2 == 0) {
            bArr = new byte[0];
            bArr[1] = this.getInputFormats;
        } else {
            bArr = new byte[]{this.getInputFormats};
        }
        int i3 = i2 + 59;
        getInputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            return bArr;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // java.lang.Enum
    public final java.lang.String toString() {
        int i = getOutputFormats + 41;
        getInputSizeshNQ4ISI = i % 128;
        java.lang.String str = this.getOutputStallDuration;
        if (i % 2 == 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = getHighResolutionOutputSizeshNQ4ISI + 107;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            cArr2[0] = charArray[eVar.f2630];
            cArr2[1] = charArray[eVar.f2630 + 1];
            int i3 = 58224;
            int i4 = 0;
            while (i4 < 16) {
                int i5 = getHighSpeedVideoSizes;
                getHighResolutionOutputSizeshNQ4ISI = (i5 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (getHighSpeedVideoFpsRangesFor ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (Camera2StreamConfigurationMap ^ 3155153533016530592L))) ^ (c3 + i3)) ^ ((c3 >>> 5) + ((char) (getHighSpeedVideoFpsRanges ^ 3155153533016530592L)))));
                i3 -= 40503;
                i4++;
                getHighResolutionOutputSizeshNQ4ISI = (i5 + 97) % 128;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        java.lang.String str2 = new java.lang.String(cArr, 0, i);
        int i6 = getHighSpeedVideoSizes + 113;
        getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
        if (i6 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        objArr[0] = str2;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        Camera2StreamConfigurationMap = (char) 23100;
        getHighSpeedVideoFpsRanges = (char) 63797;
        getHighSpeedVideoFpsRangesFor = (char) 8195;
        getHighSpeedVideoSizesFor = (char) 19547;
    }
}
