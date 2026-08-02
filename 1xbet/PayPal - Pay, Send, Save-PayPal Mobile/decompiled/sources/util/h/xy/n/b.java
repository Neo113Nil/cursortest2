package util.h.xy.n;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes5.dex */
public final class b {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private static byte[] getHighSpeedVideoSizesFor;
    private static final /* synthetic */ util.h.xy.n.b[] getInputFormats;
    private static short[] getInputSizeshNQ4ISI;
    private static int getOutputFormats;
    private static int getOutputMinFrameDuration;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.n.b f2245;

    /* renamed from: ˏ, reason: contains not printable characters */
    public static final util.h.xy.n.b f2246;

    private b(java.lang.String str, int i) {
    }

    public static util.h.xy.n.b valueOf(java.lang.String str) {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 61) % 128;
        util.h.xy.n.b bVar = (util.h.xy.n.b) java.lang.Enum.valueOf(util.h.xy.n.b.class, str);
        int i = getHighSpeedVideoFpsRangesFor + 117;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            return bVar;
        }
        throw null;
    }

    public static util.h.xy.n.b[] values() {
        int i = getHighSpeedVideoFpsRangesFor + 71;
        getHighSpeedVideoSizes = i % 128;
        util.h.xy.n.b[] bVarArr = getInputFormats;
        if (i % 2 == 0) {
            return (util.h.xy.n.b[]) bVarArr.clone();
        }
        throw null;
    }

    static {
        getHighSpeedVideoSizes();
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((-1566903450) - android.view.MotionEvent.axisFromString(""), (short) android.widget.ExpandableListView.getPackedPositionType(0L), (byte) (119 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), (-28) - android.view.View.MeasureSpec.getSize(0), android.graphics.Color.red(0) - 1395014273, objArr);
            util.h.xy.n.b bVar = new util.h.xy.n.b(((java.lang.String) objArr[0]).intern(), 0);
            f2245 = bVar;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((-1566903446) - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (short) android.widget.ExpandableListView.getPackedPositionGroup(0L), (byte) ((android.view.KeyEvent.getMaxKeyCode() >> 16) + 100), android.graphics.Color.red(0) - 23, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) - 1395014274, objArr2);
            util.h.xy.n.b bVar2 = new util.h.xy.n.b(((java.lang.String) objArr2[0]).intern(), 1);
            f2246 = bVar2;
            int i = (getHighSpeedVideoSizes + 83) % 128;
            getHighSpeedVideoFpsRangesFor = i;
            getHighSpeedVideoSizes = (i + 19) % 128;
            getInputFormats = new util.h.xy.n.b[]{bVar, bVar2};
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i5 = i2 + ((int) (getOutputFormats ^ (-2689713159175858216L)));
        boolean z = i5 == -1;
        if (z) {
            byte[] bArr = getHighSpeedVideoSizesFor;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                }
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 31) % 128;
                bArr = bArr2;
            }
            i5 = bArr != null ? (byte) (((byte) (getHighSpeedVideoSizesFor[((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputFormats ^ (-2689713159175858216L)))) : (short) (((short) (getInputSizeshNQ4ISI[((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputFormats ^ (-2689713159175858216L))));
        }
        if (i5 > 0) {
            int i7 = (int) (getOutputMinFrameDuration ^ (-2689713159175858216L));
            if (z) {
                getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 119) % 128;
                i4 = 1;
            } else {
                i4 = 0;
            }
            meVar.f2647 = ((i + i5) - 2) + i7 + i4;
            meVar.f2644 = (char) (i3 + ((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getHighSpeedVideoSizesFor;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                int i8 = 0;
                while (i8 < length2) {
                    int i9 = getHighResolutionOutputSizeshNQ4ISI + 121;
                    Camera2StreamConfigurationMap = i9 % 128;
                    if (i9 % 2 == 0) {
                        bArr4[i8] = (byte) (bArr3[i8] | (-2689713159175858216L));
                        i8 >>>= 1;
                    } else {
                        bArr4[i8] = (byte) (bArr3[i8] ^ (-2689713159175858216L));
                        i8++;
                    }
                }
                bArr3 = bArr4;
            }
            boolean z2 = bArr3 != null;
            meVar.f2645 = 1;
            while (meVar.f2645 < i5) {
                int i10 = Camera2StreamConfigurationMap + 97;
                getHighResolutionOutputSizeshNQ4ISI = i10 % 128;
                if (i10 % 2 != 0) {
                    throw null;
                }
                if (z2) {
                    byte[] bArr5 = getHighSpeedVideoSizesFor;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                    getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 61) % 128;
                } else {
                    short[] sArr = getInputSizeshNQ4ISI;
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

    static void getHighSpeedVideoSizes() {
        getOutputMinFrameDuration = -1161553087;
        getOutputFormats = -408872968;
        getHighSpeedVideoFpsRanges = -1266209509;
        getHighSpeedVideoSizesFor = new byte[]{-90, 94, -77, 69, -74, -67, 73, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -76, 87, -87, -40, -40};
    }
}
