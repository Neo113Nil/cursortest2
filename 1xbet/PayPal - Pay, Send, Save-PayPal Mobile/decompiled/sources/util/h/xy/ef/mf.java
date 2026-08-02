package util.h.xy.ef;

/* loaded from: classes18.dex */
public abstract class mf implements util.h.xy.ef.ra, util.h.xy.ef.rg {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = -1231763916;
    private final util.h.xy.ef.ra getOutputFormats;

    /* renamed from: ˋ, reason: contains not printable characters */
    protected abstract byte mo26551(byte b);

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, int i2, int i3, java.lang.Object[] objArr) {
        int i4 = (getHighResolutionOutputSizeshNQ4ISI + 103) % 128;
        Camera2StreamConfigurationMap = i4;
        getHighResolutionOutputSizeshNQ4ISI = (i4 + 41) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i5 = raVar.f2649;
            cArr[i5] = (char) (cArr[i5] - ((int) (getHighSpeedVideoSizes ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 109) % 128;
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
        }
        char[] cArr3 = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
            raVar.f2649++;
            Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 39) % 128;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @Override // util.h.xy.ef.rg
    /* renamed from: ᐝ, reason: contains not printable characters */
    public int mo26553(byte[] bArr, int i, int i2, byte[] bArr2, int i3) throws util.h.xy.ef.mc {
        int i4;
        int i5;
        int i6 = i + i2;
        if (i6 > bArr.length) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("\u0012ﾾ\u0010\u0003\u0004\u0004\u0013\u0000ﾾ\u0012\u0013\u000e\f\u0007\n\n\uffff\u000b\u0011ﾾ\r\r", 22 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 14, 260 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16), objArr);
            throw new util.h.xy.ef.mc(((java.lang.String) objArr[0]).intern());
        }
        if (i3 + i2 > bArr2.length) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes("ﾼ\u000b\u000b\u0010ﾼ\u000e\u0001\u0002\u0002\u0011\ufffeﾼ\u0010\u0011\f\u0010\u0011\u000b\u0010\u000e\u000b\u0004\u000f", android.graphics.Color.rgb(0, 0, 0) + 16777239, 18 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 261 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr2);
            throw new util.h.xy.ef.f(((java.lang.String) objArr2[0]).intern());
        }
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 61) % 128;
        while (i < i6) {
            int i7 = getHighSpeedVideoFpsRangesFor + 91;
            getHighSpeedVideoFpsRanges = i7 % 128;
            if (i7 % 2 != 0) {
                i4 = i3 + 52;
                i5 = i + 52;
                bArr2[i3] = mo26551(bArr[i]);
            } else {
                i4 = i3 + 1;
                i5 = i + 1;
                bArr2[i3] = mo26551(bArr[i]);
            }
            i3 = i4;
            i = i5;
        }
        int i8 = getHighSpeedVideoFpsRanges + 59;
        getHighSpeedVideoFpsRangesFor = i8 % 128;
        if (i8 % 2 != 0) {
            return i2;
        }
        throw null;
    }

    @Override // util.h.xy.ef.rg
    /* renamed from: ᐝ, reason: contains not printable characters */
    public final byte mo26552(byte b) {
        int i = getHighSpeedVideoFpsRanges + 93;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return mo26551(b);
        }
        mo26551(b);
        throw null;
    }

    public mf(util.h.xy.ef.ra raVar) {
        this.getOutputFormats = raVar;
    }
}
