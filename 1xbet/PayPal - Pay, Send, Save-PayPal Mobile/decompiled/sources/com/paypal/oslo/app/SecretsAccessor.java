package com.paypal.oslo.app;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/app/SecretsAccessor;", "", "<init>", "()V", "", "googleMapsApiKey", "()Ljava/lang/String;", "paypalAdsApiKeyProd", "paypalAdsApiKeyStaging", "googleWebClientId", "dyscanApiKey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SecretsAccessor {
    public static final int $stable = 0;
    public static final com.paypal.oslo.app.SecretsAccessor INSTANCE;
    private static char[] getHighSpeedVideoFpsRanges;
    private static int getHighSpeedVideoSizes;
    private static final byte[] $$a = {18, 108, -5, 118};
    private static final int $$b = 76;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:4:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String $$c(int i, byte b, short s) {
        int i2;
        int i3 = i * 3;
        int i4 = 116 - b;
        byte[] bArr = $$a;
        int i5 = 4 - (s * 2);
        byte[] bArr2 = new byte[i3 + 1];
        if (bArr == null) {
            int i6 = i4;
            i2 = 0;
            i4 = i3;
            i4 += i6;
            i5++;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
                return new java.lang.String(bArr2, 0);
            }
            i6 = bArr[i5];
            i2++;
            i4 += i6;
            i5++;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i4;
            if (i2 == i3) {
            }
        }
    }

    private SecretsAccessor() {
    }

    public final java.lang.String googleMapsApiKey() {
        int i = 2 % 2;
        int i2 = Camera2StreamConfigurationMap + 103;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(null, true, new int[]{60, 39, 105, 14}, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int i4 = getHighSpeedVideoFpsRangesFor + 111;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            return intern;
        }
        throw null;
    }

    public final java.lang.String paypalAdsApiKeyProd() {
        java.lang.Object obj;
        int i = 2 % 2;
        int i2 = Camera2StreamConfigurationMap + 99;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            a(new byte[]{0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0}, false, new int[]{171, 43, 69, 0}, objArr);
            obj = objArr[0];
        } else {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            a(new byte[]{0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0}, true, new int[]{171, 43, 69, 0}, objArr2);
            obj = objArr2[0];
        }
        return ((java.lang.String) obj).intern();
    }

    public final java.lang.String paypalAdsApiKeyStaging() {
        int i = 2 % 2;
        int i2 = getHighSpeedVideoFpsRangesFor + 69;
        Camera2StreamConfigurationMap = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new byte[]{0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0}, true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PIN_VALUE, 11, 86, 0}, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int i4 = Camera2StreamConfigurationMap + 79;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    public final java.lang.String googleWebClientId() {
        int i = 2 % 2;
        int i2 = getHighSpeedVideoFpsRangesFor + 55;
        Camera2StreamConfigurationMap = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 0}, false, new int[]{99, 72, 0, 0}, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int i4 = getHighSpeedVideoFpsRangesFor + 15;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            return intern;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final java.lang.String dyscanApiKey() {
        int i = 2 % 2;
        int i2 = getHighSpeedVideoFpsRangesFor + 85;
        Camera2StreamConfigurationMap = i2 % 128;
        int i3 = i2 % 2;
        java.lang.Object[] objArr = new java.lang.Object[1];
        a(new byte[]{0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 0, 0}, false, new int[]{0, 60, 0, 0}, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        int i4 = Camera2StreamConfigurationMap + 99;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    private static void a(byte[] bArr, boolean z, int[] iArr, java.lang.Object[] objArr) {
        int i;
        int i2 = 2 % 2;
        o.getOutputSizeshNQ4ISI getoutputsizeshnq4isi = new o.getOutputSizeshNQ4ISI();
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = getHighSpeedVideoFpsRanges;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[i3] = java.lang.Integer.valueOf(cArr[i8]);
                    java.lang.Object Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-998931894);
                    if (Camera2StreamConfigurationMap2 == null) {
                        char c = (char) ((android.os.SystemClock.uptimeMillis() > j ? 1 : (android.os.SystemClock.uptimeMillis() == j ? 0 : -1)) + 12847);
                        int edgeSlop = (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 451;
                        int resolveSize = android.view.View.resolveSize(i3, i3) + 17;
                        byte length2 = (byte) $$a.length;
                        Camera2StreamConfigurationMap2 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(c, edgeSlop, resolveSize, 1500857162, false, $$c((byte) i3, length2, (byte) (length2 - 4)), new java.lang.Class[]{java.lang.Integer.TYPE});
                    }
                    cArr2[i8] = ((java.lang.Character) ((java.lang.reflect.Method) Camera2StreamConfigurationMap2).invoke(null, objArr2)).charValue();
                    i8++;
                    i3 = 0;
                    j = 0;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i5];
        java.lang.System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            getoutputsizeshnq4isi.getHighSpeedVideoFpsRanges = 0;
            char c2 = 0;
            while (getoutputsizeshnq4isi.getHighSpeedVideoFpsRanges < i5) {
                int i9 = $10 + 117;
                $11 = i9 % 128;
                if (i9 % 2 != 0 ? bArr[getoutputsizeshnq4isi.getHighSpeedVideoFpsRanges] == 1 : bArr[getoutputsizeshnq4isi.getHighSpeedVideoFpsRanges] == 1) {
                    int i10 = getoutputsizeshnq4isi.getHighSpeedVideoFpsRanges;
                    try {
                        java.lang.Object[] objArr3 = {java.lang.Integer.valueOf(cArr3[getoutputsizeshnq4isi.getHighSpeedVideoFpsRanges]), java.lang.Integer.valueOf(c2)};
                        java.lang.Object Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(1762496182);
                        if (Camera2StreamConfigurationMap3 == null) {
                            byte b = (byte) 0;
                            byte b2 = (byte) (b + 2);
                            Camera2StreamConfigurationMap3 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 440 - android.view.View.getDefaultSize(0, 0), 11 - android.graphics.Color.red(0), -200454218, false, $$c(b, b2, (byte) (b2 - 2)), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                        }
                        cArr4[i10] = ((java.lang.Character) ((java.lang.reflect.Method) Camera2StreamConfigurationMap3).invoke(null, objArr3)).charValue();
                    } catch (java.lang.Throwable th2) {
                        java.lang.Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i11 = getoutputsizeshnq4isi.getHighSpeedVideoFpsRanges;
                    java.lang.Object[] objArr4 = {java.lang.Integer.valueOf(cArr3[getoutputsizeshnq4isi.getHighSpeedVideoFpsRanges]), java.lang.Integer.valueOf(c2)};
                    java.lang.Object Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(-1246667023);
                    if (Camera2StreamConfigurationMap4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        Camera2StreamConfigurationMap4 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (android.graphics.Color.alpha(0) + 22522), android.text.TextUtils.getCapsMode("", 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE, (android.view.ViewConfiguration.getScrollBarSize() >> 8) + 12, 682729457, false, $$c(b3, b4, b4), new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE});
                    }
                    cArr4[i11] = ((java.lang.Character) ((java.lang.reflect.Method) Camera2StreamConfigurationMap4).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[getoutputsizeshnq4isi.getHighSpeedVideoFpsRanges];
                java.lang.Object[] objArr5 = {getoutputsizeshnq4isi, getoutputsizeshnq4isi};
                java.lang.Object Camera2StreamConfigurationMap5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap(539633453);
                if (Camera2StreamConfigurationMap5 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 + 3);
                    Camera2StreamConfigurationMap5 = o.CoroutineDebuggingKt.Camera2StreamConfigurationMap((char) (35580 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), android.graphics.Color.rgb(0, 0, 0) + 16777407, 3 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), -1121262035, false, $$c(b5, b6, (byte) (b6 - 3)), new java.lang.Class[]{java.lang.Object.class, java.lang.Object.class});
                }
                ((java.lang.reflect.Method) Camera2StreamConfigurationMap5).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            int i12 = $10 + 125;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                char[] cArr5 = new char[i5];
                java.lang.System.arraycopy(cArr3, 1, cArr5, 1, i5);
                java.lang.System.arraycopy(cArr5, 1, cArr3, i5 + i7, i7);
                i = 0;
                java.lang.System.arraycopy(cArr5, i7, cArr3, 0, i5 * i7);
            } else {
                i = 0;
                char[] cArr6 = new char[i5];
                java.lang.System.arraycopy(cArr3, 0, cArr6, 0, i5);
                int i13 = i5 - i7;
                java.lang.System.arraycopy(cArr6, 0, cArr3, i13, i7);
                java.lang.System.arraycopy(cArr6, i7, cArr3, 0, i13);
            }
        } else {
            i = 0;
        }
        if (z) {
            char[] cArr7 = new char[i5];
            getoutputsizeshnq4isi.getHighSpeedVideoFpsRanges = i;
            while (getoutputsizeshnq4isi.getHighSpeedVideoFpsRanges < i5) {
                cArr7[getoutputsizeshnq4isi.getHighSpeedVideoFpsRanges] = cArr3[(i5 - getoutputsizeshnq4isi.getHighSpeedVideoFpsRanges) - 1];
                getoutputsizeshnq4isi.getHighSpeedVideoFpsRanges++;
            }
            cArr3 = cArr7;
        }
        if (i6 > 0) {
            int i14 = $11 + 47;
            $10 = i14 % 128;
            if (i14 % 2 != 0) {
                getoutputsizeshnq4isi.getHighSpeedVideoFpsRanges = 1;
            } else {
                getoutputsizeshnq4isi.getHighSpeedVideoFpsRanges = 0;
            }
            while (getoutputsizeshnq4isi.getHighSpeedVideoFpsRanges < i5) {
                cArr3[getoutputsizeshnq4isi.getHighSpeedVideoFpsRanges] = (char) (cArr3[getoutputsizeshnq4isi.getHighSpeedVideoFpsRanges] - iArr[2]);
                getoutputsizeshnq4isi.getHighSpeedVideoFpsRanges++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoFpsRanges = new char[]{12512, 12428, 12442, 12439, 12516, 12515, 12513, 12512, 12513, 12432, 12437, 12444, 12419, 12428, 12477, 12424, 12467, 12468, 12440, 12420, 12420, 12445, 12440, 12437, 12517, 12422, 12475, 12427, 12446, 12432, 12434, 12439, 12417, 12476, 12464, 12421, 12417, 12478, 12440, 12523, 12436, 12428, 12450, 12455, 12426, 12470, 12464, 12441, 12446, 12443, 12436, 12418, 12424, 12523, 12513, 12439, 12420, 12418, 12423, 12427, 12399, 12309, 12410, 12397, 12388, 12342, 12364, 12411, 12340, 12394, 12316, 12341, 12388, 12412, 12302, 12384, 12309, 12391, 12301, 12412, 12363, 12309, 12390, 12404, 12292, 12413, 12386, 12387, 12399, 12311, 12410, 12406, 12392, 12293, 12408, 12406, 12407, 12391, 12386, 12493, 12515, 12514, 12517, 12514, 12512, 12513, 12515, 12519, 12514, 12526, 12527, 12517, 12445, 12443, 12515, 12423, 12464, 12469, 12467, 12465, 12422, 12419, 12455, 12421, 12421, 12421, 12420, 12441, 12442, 12465, 12443, 12444, 12442, 12445, 12468, 12443, 12442, 12479, 12453, 12418, 12515, 12420, 12455, 12452, 12441, 12433, 12478, 12454, 12455, 12422, 12444, 12477, 12473, 12477, 12479, 12478, 12475, 12450, 12474, 12477, 12476, 12479, 12472, 12455, 12474, 12479, 12455, 12423, 12446, 12479, 12472, 12426, 12389, 12409, 12412, 12367, 12404, 12390, 12357, 12461, 12362, 12364, 12354, 12405, 12355, 12383, 12366, 12385, 12406, 12362, 12411, 12407, 12414, 12412, 12413, 12390, 12352, 12362, 12407, 12360, 12412, 12389, 12412, 12402, 12361, 12377, 12356, 12377, 12406, 12391, 12400, 12359, 12407, 12395, 12418, 12407, 12364, 12360, 12405, 12407, 12362, 12364, 12366, 12362, 12402};
    }

    static {
        getHighSpeedVideoSizes = 1;
        getHighSpeedVideoFpsRangesFor();
        INSTANCE = new com.paypal.oslo.app.SecretsAccessor();
        int i = getHighResolutionOutputSizeshNQ4ISI + 9;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            return;
        }
        java.lang.Object obj = null;
        obj.hashCode();
        throw null;
    }
}
