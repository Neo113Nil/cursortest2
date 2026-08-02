package util.h.xy.aw;

/* loaded from: classes5.dex */
public final class mb {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static short[] getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static java.util.List<java.lang.Integer> getHighSpeedVideoSizesFor;
    private static byte[] getInputFormats;
    private static byte[] getInputSizeshNQ4ISI;
    private static int getOutputFormats;
    private static android.util.SparseArray<int[]> getOutputMinFrameDuration;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final java.security.SecureRandom f882;

    static {
        int i;
        getHighSpeedVideoFpsRangesFor();
        getInputSizeshNQ4ISI = new byte[48];
        getHighSpeedVideoSizesFor = new java.util.ArrayList();
        getOutputMinFrameDuration = new android.util.SparseArray<>();
        int i2 = (getHighResolutionOutputSizeshNQ4ISI + 17) % 128;
        getOutputFormats = i2;
        getHighResolutionOutputSizeshNQ4ISI = ((i2 ^ 23) + ((i2 & 23) << 1)) % 128;
        try {
            int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
            int currentTimeMillis = (int) java.lang.System.currentTimeMillis();
            int i3 = packedPositionChild * 677;
            int i4 = (i3 ^ (-697925896)) + ((i3 & (-697925896)) << 1);
            int i5 = (packedPositionChild ^ currentTimeMillis) | (packedPositionChild & currentTimeMillis);
            int i6 = ((i5 ^ 1914203303) | (i5 & 1914203303)) * (-676);
            int i7 = ~((packedPositionChild ^ 1914203303) | (packedPositionChild & 1914203303));
            int i8 = ~currentTimeMillis;
            int i9 = ~((i8 ^ packedPositionChild) | (i8 & packedPositionChild));
            int i10 = ~packedPositionChild;
            int i11 = ~((i10 ^ 1914203303) | (i10 & 1914203303));
            int i12 = ~((1914203303 ^ i8) | (i8 & 1914203303));
            int i13 = (i12 ^ i11) | (i11 & i12);
            int i14 = (packedPositionChild ^ (-1914203304)) | (packedPositionChild & (-1914203304));
            int i15 = ~((i14 ^ currentTimeMillis) | (i14 & currentTimeMillis));
            boolean z = false;
            short resolveSize = (short) android.view.View.resolveSize(0, 0);
            byte lastIndexOf = (byte) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 70);
            int doubleTapTimeout = android.view.ViewConfiguration.getDoubleTapTimeout() >> 16;
            int i16 = (i4 ^ i6) + ((i6 & i4) << 1) + (((i7 & i9) | (i7 ^ i9)) * 676) + (((i15 ^ i13) | (i15 & i13)) * 676);
            int i17 = 829987157 - (~(-(android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))));
            util.h.xz.b.me meVar = new util.h.xz.b.me();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int i18 = (doubleTapTimeout ^ (-51)) + ((doubleTapTimeout & (-51)) << 1) + ((int) (getHighSpeedVideoFpsRangesFor ^ (-2689713159175858216L)));
            int i19 = i18 == -1 ? 1 : 0;
            if (i19 != 0) {
                byte[] bArr = getInputFormats;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i20 = 0;
                    while (i20 < length) {
                        bArr2[i20] = (byte) (bArr[i20] ^ (-2689713159175858216L));
                        i20++;
                        bArr = bArr;
                    }
                    bArr = bArr2;
                }
                i18 = bArr != null ? (byte) (((byte) (getInputFormats[((int) (getHighSpeedVideoSizes ^ (-2689713159175858216L))) + i16] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoFpsRangesFor ^ (-2689713159175858216L)))) : (short) (((short) (getHighSpeedVideoFpsRanges[((int) (getHighSpeedVideoSizes ^ (-2689713159175858216L))) + i16] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoFpsRangesFor ^ (-2689713159175858216L))));
            }
            if (i18 > 0) {
                meVar.f2647 = ((i16 + i18) - 2) + ((int) (getHighSpeedVideoSizes ^ (-2689713159175858216L))) + i19;
                meVar.f2644 = (char) (i17 + ((int) (Camera2StreamConfigurationMap ^ (-2689713159175858216L))));
                sb.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                byte[] bArr3 = getInputFormats;
                if (bArr3 != null) {
                    int length2 = bArr3.length;
                    byte[] bArr4 = new byte[length2];
                    for (int i21 = 0; i21 < length2; i21++) {
                        bArr4[i21] = (byte) (bArr3[i21] ^ (-2689713159175858216L));
                    }
                    bArr3 = bArr4;
                }
                if (bArr3 != null) {
                    i = 1;
                    z = true;
                } else {
                    i = 1;
                }
                meVar.f2645 = i;
                while (meVar.f2645 < i18) {
                    if (z) {
                        byte[] bArr5 = getInputFormats;
                        meVar.f2647 = meVar.f2647 - 1;
                        meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r3] ^ (-2689713159175858216L))) + resolveSize)) ^ lastIndexOf));
                    } else {
                        short[] sArr = getHighSpeedVideoFpsRanges;
                        meVar.f2647 = meVar.f2647 - 1;
                        meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r3] ^ (-2689713159175858216L))) + resolveSize)) ^ lastIndexOf));
                    }
                    sb.append(meVar.f2644);
                    meVar.f2646 = meVar.f2644;
                    meVar.f2645++;
                }
            }
            java.lang.String obj = sb.toString();
            java.lang.String str = obj;
            f882 = (java.security.SecureRandom) java.lang.Class.forName(obj).getDeclaredConstructor(null).newInstance(null);
            getHighResolutionOutputSizeshNQ4ISI = (getOutputFormats + 81) % 128;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static java.util.List<java.lang.Integer> m25246() {
        java.util.List<java.lang.Integer> list;
        synchronized (util.h.xy.aw.mb.class) {
            int i = (getHighResolutionOutputSizeshNQ4ISI + 75) % 128;
            getOutputFormats = i;
            list = getHighSpeedVideoSizesFor;
            int i2 = i + 3;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        }
        return list;
    }

    public static android.util.SparseArray<int[]> d_() {
        android.util.SparseArray<int[]> sparseArray;
        synchronized (util.h.xy.aw.mb.class) {
            int i = getHighResolutionOutputSizeshNQ4ISI;
            getOutputFormats = (i + 47) % 128;
            sparseArray = getOutputMinFrameDuration;
            int i2 = (i & 93) + (i | 93);
            getOutputFormats = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.NullPointerException();
            }
        }
        return sparseArray;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m25247() {
        int i = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = (((i | 65) << 1) - (i ^ 65)) % 128;
        getOutputFormats = i2;
        byte[] bArr = getInputSizeshNQ4ISI;
        getHighResolutionOutputSizeshNQ4ISI = (i2 + 13) % 128;
        return bArr;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoSizes = -1783006351;
        getHighSpeedVideoFpsRangesFor = -408873067;
        Camera2StreamConfigurationMap = 690385101;
        getInputFormats = new byte[]{99, -106, 107, -112, -110, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 110, com.visa.cbp.getEncExpo.IResultReceiver2, -113, 99, -113, -72, 40, -104, -106, 106, com.visa.cbp.getEncExpo.IResultReceiver2, -113, 99, 111, -40, 80, 118, -120, 106, -40};
    }
}
