package util.h.xy.cn;

/* loaded from: classes5.dex */
public final class rb {
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private final util.h.xy.cn.rb.ra[] getHighResolutionOutputSizeshNQ4ISI = new util.h.xy.cn.rb.ra[0];

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class ra {
        private static int Camera2StreamConfigurationMap = 0;
        private static byte[] getHighResolutionOutputSizeshNQ4ISI = null;
        private static int getHighSpeedVideoFpsRanges = 1;
        private static int getHighSpeedVideoFpsRangesFor = 1;
        private static short[] getHighSpeedVideoSizes;
        private static final /* synthetic */ util.h.xy.cn.rb.ra[] getHighSpeedVideoSizesFor;
        private static int getInputFormats;
        private static int getInputSizeshNQ4ISI;
        private static int getOutputFormats;
        private static int getOutputMinFrameDuration;

        /* renamed from: ˊ, reason: contains not printable characters */
        public static final util.h.xy.cn.rb.ra f1120;

        /* renamed from: ˋ, reason: contains not printable characters */
        public static final util.h.xy.cn.rb.ra f1121;

        private ra(java.lang.String str, int i) {
        }

        public static util.h.xy.cn.rb.ra valueOf(java.lang.String str) {
            int i = getOutputFormats + 87;
            getHighSpeedVideoFpsRanges = i % 128;
            util.h.xy.cn.rb.ra raVar = (util.h.xy.cn.rb.ra) java.lang.Enum.valueOf(util.h.xy.cn.rb.ra.class, str);
            if (i % 2 != 0) {
                return raVar;
            }
            throw null;
        }

        public static util.h.xy.cn.rb.ra[] values() {
            getOutputFormats = (getHighSpeedVideoFpsRanges + 105) % 128;
            util.h.xy.cn.rb.ra[] raVarArr = (util.h.xy.cn.rb.ra[]) getHighSpeedVideoSizesFor.clone();
            getOutputFormats = (getHighSpeedVideoFpsRanges + 91) % 128;
            return raVarArr;
        }

        static {
            getHighSpeedVideoFpsRangesFor();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(1922727281 + (android.view.KeyEvent.getMaxKeyCode() >> 16), (short) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (byte) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 92), android.text.TextUtils.indexOf("", "") - 126, (android.view.ViewConfiguration.getTouchSlop() >> 8) - 1953477753, objArr);
            util.h.xy.cn.rb.ra raVar = new util.h.xy.cn.rb.ra(((java.lang.String) objArr[0]).intern(), 0);
            f1121 = raVar;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(1922727301 - android.view.View.MeasureSpec.getSize(0), (short) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (byte) ((android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) - 16), (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) - 126, android.view.View.resolveSize(0, 0) - 1953477765, objArr2);
            util.h.xy.cn.rb.ra raVar2 = new util.h.xy.cn.rb.ra(((java.lang.String) objArr2[0]).intern(), 1);
            f1120 = raVar2;
            int i = (getOutputFormats + 125) % 128;
            getHighSpeedVideoFpsRanges = i;
            util.h.xy.cn.rb.ra[] raVarArr = {raVar, raVar2};
            int i2 = i + 45;
            getOutputFormats = i2 % 128;
            if (i2 % 2 == 0) {
                getHighSpeedVideoSizesFor = raVarArr;
                int i3 = i + 55;
                getOutputFormats = i3 % 128;
                if (i3 % 2 != 0) {
                    throw null;
                }
                return;
            }
            throw null;
        }

        private static void getHighResolutionOutputSizeshNQ4ISI(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
            int i4;
            boolean z;
            util.h.xz.b.me meVar = new util.h.xz.b.me();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i5 = i2 + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L)));
            boolean z2 = i5 == -1;
            if (z2) {
                int i6 = getHighSpeedVideoFpsRangesFor + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                Camera2StreamConfigurationMap = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
                byte[] bArr = getHighResolutionOutputSizeshNQ4ISI;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i7 = 0; i7 < length; i7++) {
                        bArr2[i7] = (byte) (bArr[i7] ^ (-2689713159175858216L));
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i8 = getHighSpeedVideoFpsRangesFor + 117;
                    Camera2StreamConfigurationMap = i8 % 128;
                    i5 = (byte) (i8 % 2 != 0 ? ((byte) (getHighResolutionOutputSizeshNQ4ISI[i - ((int) (getInputSizeshNQ4ISI % (-2689713159175858216L)))] & (-2689713159175858216L))) / ((int) (getOutputMinFrameDuration * (-2689713159175858216L))) : ((byte) (getHighResolutionOutputSizeshNQ4ISI[((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))));
                } else {
                    i5 = (short) (((short) (getHighSpeedVideoSizes[((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))));
                }
            }
            if (i5 > 0) {
                int i9 = (int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L));
                if (z2) {
                    i4 = 1;
                } else {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 9) % 128;
                    i4 = 0;
                }
                meVar.f2647 = ((i + i5) - 2) + i9 + i4;
                meVar.f2644 = (char) (i3 + ((int) (getInputFormats ^ (-2689713159175858216L))));
                sb.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                byte[] bArr3 = getHighResolutionOutputSizeshNQ4ISI;
                if (bArr3 != null) {
                    getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 95) % 128;
                    int length2 = bArr3.length;
                    byte[] bArr4 = new byte[length2];
                    for (int i10 = 0; i10 < length2; i10++) {
                        bArr4[i10] = (byte) (bArr3[i10] ^ (-2689713159175858216L));
                    }
                    bArr3 = bArr4;
                }
                if (bArr3 != null) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 31) % 128;
                    z = true;
                } else {
                    z = false;
                }
                meVar.f2645 = 1;
                while (meVar.f2645 < i5) {
                    int i11 = getHighSpeedVideoFpsRangesFor + 47;
                    Camera2StreamConfigurationMap = i11 % 128;
                    if (i11 % 2 != 0) {
                        throw null;
                    }
                    if (z) {
                        byte[] bArr5 = getHighResolutionOutputSizeshNQ4ISI;
                        meVar.f2647 = meVar.f2647 - 1;
                        meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r10] ^ (-2689713159175858216L))) + s)) ^ b));
                    } else {
                        short[] sArr = getHighSpeedVideoSizes;
                        meVar.f2647 = meVar.f2647 - 1;
                        meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r10] ^ (-2689713159175858216L))) + s)) ^ b));
                    }
                    sb.append(meVar.f2644);
                    meVar.f2646 = meVar.f2644;
                    meVar.f2645++;
                }
            }
            objArr[0] = sb.toString();
        }

        static void getHighSpeedVideoFpsRangesFor() {
            getInputSizeshNQ4ISI = 1791268183;
            getOutputMinFrameDuration = -408873051;
            getInputFormats = -1815174378;
            getHighResolutionOutputSizeshNQ4ISI = new byte[]{com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -127, 123, -126, 113, -107, 122, 115, -124, 123, -120, com.visa.cbp.getEncExpo.IResultReceiver2, -98, com.visa.cbp.getEncExpo.IResultReceiver, 121, -106, 122, 118, -127, 125, 78, -39, 59, -42, -46, 43, -43, -35, 42, 37, 42, -52, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -45, -43, 35, -61, 32, 45};
        }
    }

    public rb(util.h.xy.cn.rb.ra... raVarArr) {
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final boolean m25982(util.h.xy.cn.rb.ra raVar) {
        int i = getHighSpeedVideoSizes;
        int i2 = (i & 105) + (i | 105);
        int i3 = i2 % 128;
        getHighSpeedVideoFpsRangesFor = i3;
        boolean z = i2 % 2 != 0;
        getHighSpeedVideoSizes = (((i3 | 9) << 1) - (i3 ^ 9)) % 128;
        return z;
    }
}
