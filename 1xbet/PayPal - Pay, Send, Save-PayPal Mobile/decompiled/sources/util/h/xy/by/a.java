package util.h.xy.by;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class a {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static short[] getHighSpeedVideoFpsRangesFor = null;
    private static int getHighSpeedVideoSizes = 1;
    private static byte[] getHighSpeedVideoSizesFor = null;
    private static final /* synthetic */ util.h.xy.by.a[] getInputFormats;
    private static int getInputSizeshNQ4ISI = 1;
    private static int getOutputFormats;
    private static final java.lang.String getOutputMinFrameDuration;
    private static int getOutputSizes;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.by.a f1065;
    private util.h.xy.da.ra getOutputStallDurationlomOqCM;

    private a(java.lang.String str) {
    }

    public static util.h.xy.by.a valueOf(java.lang.String str) {
        int i = getInputSizeshNQ4ISI + 61;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        util.h.xy.by.a aVar = (util.h.xy.by.a) java.lang.Enum.valueOf(util.h.xy.by.a.class, str);
        if (i % 2 != 0) {
            throw null;
        }
        getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 21) % 128;
        return aVar;
    }

    public static util.h.xy.by.a[] values() {
        getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 17) % 128;
        util.h.xy.by.a[] aVarArr = (util.h.xy.by.a[]) getInputFormats.clone();
        getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 31) % 128;
        return aVarArr;
    }

    static {
        util.h.xy.by.a[] aVarArr;
        getHighResolutionOutputSizeshNQ4ISI();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes(60701 - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (short) (android.text.TextUtils.getOffsetAfter("", 0) - 122), (byte) (android.widget.ExpandableListView.getPackedPositionGroup(0L) + 30), (-18) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), android.graphics.Color.green(0) + 551545589, objArr);
        util.h.xy.by.a aVar = new util.h.xy.by.a(((java.lang.String) objArr[0]).intern());
        f1065 = aVar;
        int i = getHighResolutionOutputSizeshNQ4ISI + 7;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            aVarArr = new util.h.xy.by.a[0];
            aVarArr[0] = aVar;
        } else {
            aVarArr = new util.h.xy.by.a[]{aVar};
        }
        getInputFormats = aVarArr;
        getOutputMinFrameDuration = util.h.xy.by.a.class.getName();
        int i2 = getInputSizeshNQ4ISI + 105;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final boolean m25792() {
        getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 23) % 128;
        try {
            Camera2StreamConfigurationMap();
            boolean mo26079 = this.getOutputStallDurationlomOqCM.mo26079();
            int i = getInputSizeshNQ4ISI + 91;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                return mo26079;
            }
            throw new java.lang.ArithmeticException();
        } catch (util.h.xy.da.b unused) {
            return false;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25791() {
        int i = getHighResolutionOutputSizeshNQ4ISI + 59;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            Camera2StreamConfigurationMap();
            util.h.xy.ak.d.m24967(this.getOutputStallDurationlomOqCM);
            getInputSizeshNQ4ISI = (getHighResolutionOutputSizeshNQ4ISI + 1) % 128;
            int i2 = getHighResolutionOutputSizeshNQ4ISI + 1;
            getInputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            return;
        }
        Camera2StreamConfigurationMap();
        util.h.xy.ak.d.m24967(this.getOutputStallDurationlomOqCM);
        throw new java.lang.NullPointerException();
    }

    private void Camera2StreamConfigurationMap() throws util.h.xy.da.b {
        if (this.getOutputStallDurationlomOqCM == null) {
            getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 93) % 128;
            util.h.xy.da.ma maVar = util.h.xy.da.ma.f1156;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(413396197 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), (short) (android.graphics.Color.blue(0) + 112), (byte) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 121), (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) - 17, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 551545631, objArr);
            this.getOutputStallDurationlomOqCM = util.h.xy.da.d.m26260(maVar, ((java.lang.String) objArr[0]).intern());
        }
        int i = getInputSizeshNQ4ISI + 113;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    private static void getHighSpeedVideoSizes(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        boolean z;
        int i4;
        boolean z2;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i5 = i2 + ((int) (getOutputSizes ^ (-2689713159175858216L)));
        if (i5 == -1) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 117) % 128;
            z = true;
        } else {
            getHighSpeedVideoSizes = (getHighSpeedVideoFpsRanges + 39) % 128;
            z = false;
        }
        if (z) {
            byte[] bArr = getHighSpeedVideoSizesFor;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                int i7 = getHighSpeedVideoSizes + 29;
                getHighSpeedVideoFpsRanges = i7 % 128;
                i5 = (byte) (i7 % 2 != 0 ? ((byte) (getHighSpeedVideoSizesFor[i - ((int) (getOutputFormats - 2689713159175858216L))] / (-2689713159175858216L))) / ((int) (getOutputSizes * (-2689713159175858216L))) : ((byte) (getHighSpeedVideoSizesFor[((int) (getOutputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputSizes ^ (-2689713159175858216L))));
            } else {
                i5 = (short) (((short) (getHighSpeedVideoFpsRangesFor[((int) (getOutputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputSizes ^ (-2689713159175858216L))));
            }
        }
        if (i5 > 0) {
            int i8 = (int) (getOutputFormats ^ (-2689713159175858216L));
            if (z) {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 3) % 128;
                i4 = 1;
            } else {
                i4 = 0;
            }
            meVar.f2647 = ((i + i5) - 2) + i8 + i4;
            meVar.f2644 = (char) (i3 + ((int) (Camera2StreamConfigurationMap ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getHighSpeedVideoSizesFor;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i9 = 0; i9 < length2; i9++) {
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 77) % 128;
                    bArr4[i9] = (byte) (bArr3[i9] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoSizes + 39) % 128;
                z2 = true;
            } else {
                z2 = false;
            }
            meVar.f2645 = 1;
            while (meVar.f2645 < i5) {
                if (z2) {
                    byte[] bArr5 = getHighSpeedVideoSizesFor;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getHighSpeedVideoFpsRangesFor;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                }
                sb.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                meVar.f2645++;
            }
        }
        objArr[0] = sb.toString();
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getOutputFormats = 16581826;
        getOutputSizes = -408873016;
        Camera2StreamConfigurationMap = 947978892;
        getHighSpeedVideoSizesFor = new byte[]{47, -57, com.visa.cbp.getEncExpo.kernelVersion, -50, -58, -46, -34, 32, 78, -67, 85, -75, 65, 77, 77};
    }
}
