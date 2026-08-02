package util.h.xy.dh;

/* loaded from: classes5.dex */
public class i extends util.h.xy.dh.mi {
    private static int Camera2StreamConfigurationMap = 1;
    static final util.h.xy.dh.p getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private static final java.util.concurrent.ConcurrentMap<util.h.xy.dh.i.mb, util.h.xy.dh.i> getHighSpeedVideoSizesFor;
    private static char[] getInputFormats;
    private static long getOutputFormats;
    private final java.lang.String getInputSizeshNQ4ISI;
    private byte[] getOutputMinFrameDuration;

    private static void getHighSpeedVideoFpsRanges(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 73) % 128;
        while (rbVar.f2651 < i) {
            getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 55) % 128;
            jArr[rbVar.f2651] = (((char) (getInputFormats[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ getOutputFormats))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static {
        getHighSpeedVideoFpsRanges();
        getHighResolutionOutputSizeshNQ4ISI = new util.h.xy.dh.p(util.h.xy.dh.i.class) { // from class: util.h.xy.dh.i.2
            private static int Camera2StreamConfigurationMap = 1;
            private static int getHighSpeedVideoSizes;

            @Override // util.h.xy.dh.p
            final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(util.h.xy.dh.mz mzVar) {
                int i = Camera2StreamConfigurationMap + 55;
                getHighSpeedVideoSizes = i % 128;
                return util.h.xy.dh.i.getHighSpeedVideoFpsRanges(mzVar.m26337(), i % 2 != 0);
            }
        };
        getHighSpeedVideoSizesFor = new java.util.concurrent.ConcurrentHashMap();
        int i = Camera2StreamConfigurationMap + 27;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static util.h.xy.dh.i getHighSpeedVideoFpsRanges(byte[] bArr, boolean z) {
        util.h.xy.dh.i iVar = getHighSpeedVideoSizesFor.get(new util.h.xy.dh.i.mb(bArr));
        if (iVar == null) {
            return new util.h.xy.dh.i(bArr, z);
        }
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 65) % 128;
        return iVar;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public util.h.xy.dh.i m26300() {
        util.h.xy.dh.i.mb mbVar = new util.h.xy.dh.i.mb(getHighSpeedVideoSizes());
        java.util.concurrent.ConcurrentMap<util.h.xy.dh.i.mb, util.h.xy.dh.i> concurrentMap = getHighSpeedVideoSizesFor;
        util.h.xy.dh.i iVar = concurrentMap.get(mbVar);
        if (iVar != null) {
            return iVar;
        }
        int i = getHighSpeedVideoSizes + 119;
        Camera2StreamConfigurationMap = i % 128;
        util.h.xy.dh.i putIfAbsent = concurrentMap.putIfAbsent(mbVar, this);
        if (i % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        if (putIfAbsent != null) {
            return putIfAbsent;
        }
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 45) % 128;
        return this;
    }

    public java.lang.String toString() {
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 91) % 128;
        java.lang.String m26298 = m26298();
        int i = Camera2StreamConfigurationMap + 109;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            return m26298;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar) {
        int i = (Camera2StreamConfigurationMap + 57) % 128;
        getHighSpeedVideoSizes = i;
        if (miVar == this) {
            int i2 = i + 113;
            Camera2StreamConfigurationMap = i2 % 128;
            return i2 % 2 != 0;
        }
        if (miVar instanceof util.h.xy.dh.i) {
            return this.getInputSizeshNQ4ISI.equals(((util.h.xy.dh.i) miVar).getInputSizeshNQ4ISI);
        }
        return false;
    }

    @Override // util.h.xy.dh.mi, util.h.xy.dh.mh
    public int hashCode() {
        int i = Camera2StreamConfigurationMap + 45;
        getHighSpeedVideoSizes = i % 128;
        java.lang.String str = this.getInputSizeshNQ4ISI;
        if (i % 2 == 0) {
            return str.hashCode();
        }
        str.hashCode();
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 59) % 128;
        rjVar.getHighSpeedVideoSizes(z, 6, getHighSpeedVideoSizes());
        int i = getHighSpeedVideoSizes + 27;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) {
        int i = Camera2StreamConfigurationMap + 71;
        getHighSpeedVideoSizes = i % 128;
        byte[] highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (i % 2 == 0) {
            return util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, highSpeedVideoSizes.length);
        }
        util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, highSpeedVideoSizes.length);
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = Camera2StreamConfigurationMap + 81;
        getHighSpeedVideoSizes = i % 128;
        return i % 2 != 0;
    }

    private byte[] getHighSpeedVideoSizes() {
        byte[] bArr;
        synchronized (this) {
            if (this.getOutputMinFrameDuration == null) {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                util.h.xy.dh.bc bcVar = new util.h.xy.dh.bc(this.getInputSizeshNQ4ISI);
                int parseInt = java.lang.Integer.parseInt(bcVar.m26283()) * 40;
                java.lang.String m26283 = bcVar.m26283();
                if (m26283.length() <= 18) {
                    util.h.xy.dh.k.getHighSpeedVideoFpsRangesFor(byteArrayOutputStream, parseInt + java.lang.Long.parseLong(m26283));
                } else {
                    util.h.xy.dh.k.getHighSpeedVideoFpsRangesFor(byteArrayOutputStream, new java.math.BigInteger(m26283).add(java.math.BigInteger.valueOf(parseInt)));
                }
                while (bcVar.m26284()) {
                    java.lang.String m262832 = bcVar.m26283();
                    if (m262832.length() <= 18) {
                        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 125) % 128;
                        util.h.xy.dh.k.getHighSpeedVideoFpsRangesFor(byteArrayOutputStream, java.lang.Long.parseLong(m262832));
                        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 49) % 128;
                    } else {
                        util.h.xy.dh.k.getHighSpeedVideoFpsRangesFor(byteArrayOutputStream, new java.math.BigInteger(m262832));
                    }
                }
                this.getOutputMinFrameDuration = byteArrayOutputStream.toByteArray();
                int i = Camera2StreamConfigurationMap + 113;
                getHighSpeedVideoSizes = i % 128;
                int i2 = i % 2;
            }
            bArr = this.getOutputMinFrameDuration;
            int i3 = Camera2StreamConfigurationMap + 13;
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 != 0) {
                throw new java.lang.NullPointerException();
            }
        }
        return bArr;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public util.h.xy.dh.i m26299(java.lang.String str) {
        util.h.xy.dh.i iVar = new util.h.xy.dh.i(this, str);
        int i = Camera2StreamConfigurationMap + 81;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            return iVar;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public java.lang.String m26298() {
        int i = getHighSpeedVideoSizes;
        Camera2StreamConfigurationMap = (i + 55) % 128;
        java.lang.String str = this.getInputSizeshNQ4ISI;
        Camera2StreamConfigurationMap = (i + 95) % 128;
        return str;
    }

    static final class mb {
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoFpsRanges = 1;
        private final byte[] Camera2StreamConfigurationMap;
        private final int getHighSpeedVideoSizes;

        public final boolean equals(java.lang.Object obj) {
            int i = getHighSpeedVideoFpsRanges + 77;
            int i2 = i % 128;
            getHighResolutionOutputSizeshNQ4ISI = i2;
            if (i % 2 != 0) {
                throw null;
            }
            if (!(obj instanceof util.h.xy.dh.i.mb)) {
                int i3 = (i2 & 45) + (i2 | 45);
                getHighSpeedVideoFpsRanges = i3 % 128;
                if (i3 % 2 != 0) {
                    return false;
                }
                throw null;
            }
            boolean m26820 = util.h.xy.fb.a.m26820(this.Camera2StreamConfigurationMap, ((util.h.xy.dh.i.mb) obj).Camera2StreamConfigurationMap);
            int i4 = getHighResolutionOutputSizeshNQ4ISI;
            int i5 = (i4 ^ 107) + ((i4 & 107) << 1);
            getHighSpeedVideoFpsRanges = i5 % 128;
            if (i5 % 2 != 0) {
                return m26820;
            }
            throw null;
        }

        public final int hashCode() {
            int i = getHighSpeedVideoFpsRanges;
            int i2 = ((i | 57) << 1) - (i ^ 57);
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
            int i3 = this.getHighSpeedVideoSizes;
            getHighResolutionOutputSizeshNQ4ISI = ((i & 25) + (i | 25)) % 128;
            return i3;
        }

        mb(byte[] bArr) {
            this.getHighSpeedVideoSizes = util.h.xy.fb.a.m26817(bArr);
            this.Camera2StreamConfigurationMap = bArr;
        }
    }

    private i(util.h.xy.dh.i iVar, java.lang.String str) {
        if (!util.h.xy.dh.k.Camera2StreamConfigurationMap(str, 0)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7, 109 - android.text.TextUtils.getOffsetAfter("", 0), (char) (21615 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(str);
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(23 - android.text.TextUtils.indexOf("", "", 0, 0), 127 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), (char) android.graphics.Color.alpha(0), objArr2);
            sb.append(((java.lang.String) objArr2[0]).intern());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(iVar.m26298());
        try {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.view.View.MeasureSpec.getSize(0) + 1, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 150, (char) (1149 - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), objArr3);
            sb2.append(((java.lang.String) objArr3[0]).intern());
            sb2.append(str);
            this.getInputSizeshNQ4ISI = sb2.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public i(java.lang.String str) {
        if (str == null) {
            int bitsPerPixel = android.graphics.ImageFormat.getBitsPerPixel(0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(26 - bitsPerPixel, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 81, (char) (1876 - android.graphics.Color.argb(0, 0, 0, 0)), objArr);
            throw new java.lang.NullPointerException(((java.lang.String) objArr[0]).intern());
        }
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 71) % 128;
        try {
            if (str.length() >= 3) {
                int i = getHighSpeedVideoSizes + 81;
                Camera2StreamConfigurationMap = i % 128;
                if (i % 2 != 0 ? str.charAt(1) == '.' : str.charAt(0) == 'q') {
                    char charAt = str.charAt(0);
                    if (charAt >= '0') {
                        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 109) % 128;
                        if (charAt <= '2' && util.h.xy.dh.k.Camera2StreamConfigurationMap(str, 2)) {
                            this.getInputSizeshNQ4ISI = str;
                            return;
                        }
                    }
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    float minVolume = android.media.AudioTrack.getMinVolume();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(7 - (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)), 110 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), (char) (21615 - android.graphics.Color.red(0)), objArr2);
                    sb.append(((java.lang.String) objArr2[0]).intern());
                    sb.append(str);
                    int packedPositionChild = android.widget.ExpandableListView.getPackedPositionChild(0L);
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(10 - packedPositionChild, 116 - android.text.TextUtils.indexOf("", "", 0), (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 20145), objArr3);
                    sb.append(((java.lang.String) objArr3[0]).intern());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
            }
            java.lang.Object[] objArr22 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(7 - (minVolume > 0.0f ? 1 : (minVolume == 0.0f ? 0 : -1)), 110 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), (char) (21615 - android.graphics.Color.red(0)), objArr22);
            sb.append(((java.lang.String) objArr22[0]).intern());
            sb.append(str);
            int packedPositionChild2 = android.widget.ExpandableListView.getPackedPositionChild(0L);
            java.lang.Object[] objArr32 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(10 - packedPositionChild2, 116 - android.text.TextUtils.indexOf("", "", 0), (char) (android.view.View.resolveSizeAndState(0, 0, 0) + 20145), objArr32);
            sb.append(((java.lang.String) objArr32[0]).intern());
            throw new java.lang.IllegalArgumentException(sb.toString());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 39) % 128;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        float minVolume2 = android.media.AudioTrack.getMinVolume();
    }

    private i(byte[] bArr, boolean z) {
        byte[] bArr2 = bArr;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        boolean z2 = true;
        java.math.BigInteger bigInteger = null;
        long j = 0;
        for (int i = 0; i != bArr2.length; i++) {
            byte b = bArr2[i];
            if (j <= 72057594037927808L) {
                long j2 = j + (b & Byte.MAX_VALUE);
                if ((b & 128) == 0) {
                    if (z2) {
                        if (j2 < 40) {
                            stringBuffer.append(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
                        } else if (j2 < 80) {
                            stringBuffer.append('1');
                            j2 -= 40;
                        } else {
                            stringBuffer.append('2');
                            j2 -= 80;
                        }
                        z2 = false;
                    }
                    stringBuffer.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    stringBuffer.append(j2);
                    j = 0;
                } else {
                    j = j2 << 7;
                }
            } else {
                java.math.BigInteger or = (bigInteger == null ? java.math.BigInteger.valueOf(j) : bigInteger).or(java.math.BigInteger.valueOf(b & Byte.MAX_VALUE));
                if ((b & 128) == 0) {
                    if (z2) {
                        stringBuffer.append('2');
                        or = or.subtract(java.math.BigInteger.valueOf(80L));
                        z2 = false;
                    }
                    stringBuffer.append(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
                    stringBuffer.append(or);
                    bigInteger = null;
                    j = 0;
                } else {
                    bigInteger = or.shiftLeft(7);
                }
            }
        }
        this.getInputSizeshNQ4ISI = stringBuffer.toString();
        this.getOutputMinFrameDuration = z ? util.h.xy.fb.a.m26821(bArr) : bArr2;
    }

    static void getHighSpeedVideoFpsRanges() {
        getInputFormats = new char[]{40039, 31315, 20494, 12020, 1192, 58010, 63763, 55056, 44534, 35818, 24988, 30815, 22027, 11493, 2751, 57486, 65348, 54529, 46051, 35304, 26514, 32332, 21513, 13041, 2218, 59022, 64783, 56073, 45553, 36771, 26005, 31832, 23048, 12532, 3758, 58525, 50015, 55678, 47093, 36278, 27542, 16967, 22655, 14066, 3260, 60034, 49486, 57095, 46540, 37880, 27095, 10069, 49507, 60214, 38336, 49047, 22946, 16994, 27769, 5835, 12437, 55976, 50024, 60731, 38879, 45526, 23464, 17506, 28287, 2253, 12944, 56500, 50522, 61232, 35290, 45952, 23974, 18044, 24638, 2765, 13505, 57062, 39794, 32015, 22359, 10665, 1015, 58846, 65038, 53334, 43684, 36091, 26329, 32579, 20753, 11169, 3582, 59334, 63499, 53849, 46263, 36540, 24779, 31007, 21271, 13742, 4072, 57794, 64023, 51229, 11817, 1146, 31390, 20684, 46838, 44412, 53904, 13549, 7865, 24669, 19036, 44078, 47084, 39413, 58215, 50482, 12042, 39969, 31324, 20488, 12012, 1261, 58015, 63763, 55058, 44536, 35750, 24982, 30804, 22085, 11481, 2690, 57528, 65297, 54528, 46053, 35241, 26515, 32333, 21515, 38993};
        getOutputFormats = -4370636346436715982L;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.dh.i m26297(java.lang.Object obj) {
        if (obj == null || (obj instanceof util.h.xy.dh.i)) {
            util.h.xy.dh.i iVar = (util.h.xy.dh.i) obj;
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 69) % 128;
            return iVar;
        }
        if (obj instanceof util.h.xy.dh.c) {
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 63) % 128;
            util.h.xy.dh.mi mo26279 = ((util.h.xy.dh.c) obj).mo26279();
            if (mo26279 instanceof util.h.xy.dh.i) {
                return (util.h.xy.dh.i) mo26279;
            }
        } else if (obj instanceof byte[]) {
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 25) % 128;
            try {
                return (util.h.xy.dh.i) getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges((byte[]) obj);
            } catch (java.io.IOException e) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int maximumFlingVelocity = android.view.ViewConfiguration.getMaximumFlingVelocity();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges((maximumFlingVelocity >> 16) + 51, android.view.ViewConfiguration.getPressedStateDuration() >> 16, (char) android.graphics.Color.argb(0, 0, 0, 0), objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(e.getMessage());
                throw new java.lang.IllegalArgumentException(sb.toString());
            }
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        int lastIndexOf = android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(30 - lastIndexOf, 51 - android.text.TextUtils.getOffsetBefore("", 0), (char) (47933 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), objArr2);
        sb2.append(((java.lang.String) objArr2[0]).intern());
        sb2.append(obj.getClass().getName());
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }
}
