package util.h.xy.dh;

/* loaded from: classes5.dex */
public class ro extends util.h.xy.dh.mi {
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static short[] getHighSpeedVideoFpsRanges = null;
    static final util.h.xy.dh.p getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 1;
    private static int getInputFormats;
    private static int getInputSizeshNQ4ISI;
    private static int getOutputFormats;
    private static int getOutputMinFrameDuration;
    private static long getOutputSizeshNQ4ISI;
    private static byte[] getOutputStallDuration;
    final byte[] Camera2StreamConfigurationMap;

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            int i3 = getHighResolutionOutputSizeshNQ4ISI + 79;
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 != 0) {
                jArr[dVar.f2629] = charArray[dVar.f2629] | (dVar.f2629 ^ dVar.f2628) | (getOutputSizeshNQ4ISI - 7508379876853140581L);
                i2 = dVar.f2629 >>> 1;
            } else {
                jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ ((-7508379876853140581L) ^ getOutputSizeshNQ4ISI);
                i2 = dVar.f2629 + 1;
            }
            dVar.f2629 = i2;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 83) % 128;
        while (dVar.f2629 < charArray.length) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 91) % 128;
            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
            dVar.f2629++;
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 33) % 128;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        if (r3 != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bb, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b7, code lost:
    
        if (r3 != false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoSizes(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int i5;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = i2 + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L)));
        boolean z = i6 == -1;
        if (z) {
            int i7 = (getHighSpeedVideoSizes + 13) % 128;
            getHighResolutionOutputSizeshNQ4ISI = i7;
            byte[] bArr = getOutputStallDuration;
            if (bArr != null) {
                getHighSpeedVideoSizes = (i7 + 37) % 128;
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i8 = 0; i8 < length; i8++) {
                    bArr2[i8] = (byte) (bArr[i8] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                int i9 = getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
                getHighSpeedVideoSizes = i9 % 128;
                i6 = (byte) (i9 % 2 != 0 ? ((byte) (getOutputStallDuration[((int) (getOutputFormats | (-2689713159175858216L))) + i] / (-2689713159175858216L))) / ((int) (getInputSizeshNQ4ISI * (-2689713159175858216L))) : ((byte) (getOutputStallDuration[((int) (getOutputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))));
            } else {
                i6 = (short) (((short) (getHighSpeedVideoFpsRanges[((int) (getOutputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))));
            }
        }
        if (i6 > 0) {
            int i10 = getHighSpeedVideoSizes + 91;
            getHighResolutionOutputSizeshNQ4ISI = i10 % 128;
            if (i10 % 2 == 0) {
                i4 = ((i % i6) << 2) << ((int) (getOutputFormats / (-2689713159175858216L)));
            } else {
                i4 = ((i + i6) - 2) + ((int) (getOutputFormats ^ (-2689713159175858216L)));
            }
            meVar.f2647 = i4 + i5;
            meVar.f2644 = (char) (i3 + ((int) (getInputFormats ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getOutputStallDuration;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 89) % 128;
                for (int i11 = 0; i11 < length2; i11++) {
                    bArr4[i11] = (byte) (bArr3[i11] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            boolean z2 = bArr3 != null;
            meVar.f2645 = 1;
            while (meVar.f2645 < i6) {
                if (z2) {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 93) % 128;
                    byte[] bArr5 = getOutputStallDuration;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getHighSpeedVideoFpsRanges;
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

    static {
        getHighSpeedVideoSizes();
        getHighSpeedVideoFpsRangesFor = new util.h.xy.dh.p(util.h.xy.dh.ro.class) { // from class: util.h.xy.dh.ro.2
            private static int getHighResolutionOutputSizeshNQ4ISI = 0;
            private static int getHighSpeedVideoSizes = 1;

            @Override // util.h.xy.dh.p
            final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(util.h.xy.dh.mz mzVar) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 125) % 128;
                util.h.xy.dh.ro highSpeedVideoSizes = util.h.xy.dh.ro.getHighSpeedVideoSizes(mzVar.m26337());
                int i = getHighSpeedVideoSizes;
                int i2 = (i & 77) + (i | 77);
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                if (i2 % 2 == 0) {
                    return highSpeedVideoSizes;
                }
                throw null;
            }
        };
        int i = getHighSpeedVideoSizesFor + 5;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    static util.h.xy.dh.ro getHighSpeedVideoSizes(byte[] bArr) {
        util.h.xy.dh.ro roVar = new util.h.xy.dh.ro(bArr);
        getHighSpeedVideoSizesFor = (getOutputMinFrameDuration + 49) % 128;
        return roVar;
    }

    public java.lang.String toString() {
        getHighSpeedVideoSizesFor = (getOutputMinFrameDuration + 79) % 128;
        java.lang.String m26855 = util.h.xy.fb.rd.m26855(this.Camera2StreamConfigurationMap);
        int i = getOutputMinFrameDuration + 53;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            return m26855;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mi, util.h.xy.dh.mh
    public int hashCode() {
        getHighSpeedVideoSizesFor = (getOutputMinFrameDuration + 57) % 128;
        int m26817 = util.h.xy.fb.a.m26817(this.Camera2StreamConfigurationMap);
        int i = getHighSpeedVideoSizesFor + 43;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            return m26817;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar) {
        if (!(miVar instanceof util.h.xy.dh.ro)) {
            getHighSpeedVideoSizesFor = (getOutputMinFrameDuration + 17) % 128;
            return false;
        }
        boolean m26820 = util.h.xy.fb.a.m26820(this.Camera2StreamConfigurationMap, ((util.h.xy.dh.ro) miVar).Camera2StreamConfigurationMap);
        int i = getHighSpeedVideoSizesFor + 57;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            return m26820;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        int i = getHighSpeedVideoSizesFor + 85;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            rjVar.getHighSpeedVideoSizes(z, 106, this.Camera2StreamConfigurationMap);
        } else {
            rjVar.getHighSpeedVideoSizes(z, 23, this.Camera2StreamConfigurationMap);
        }
        int i2 = getHighSpeedVideoSizesFor + 95;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    @Override // util.h.xy.dh.mi
    final int getHighSpeedVideoFpsRanges(boolean z) {
        getOutputMinFrameDuration = (getHighSpeedVideoSizesFor + 35) % 128;
        int highSpeedVideoFpsRangesFor = util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, this.Camera2StreamConfigurationMap.length);
        int i = getOutputMinFrameDuration + 5;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            return highSpeedVideoFpsRangesFor;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = getHighSpeedVideoSizesFor;
        getOutputMinFrameDuration = (i + 27) % 128;
        getOutputMinFrameDuration = (i + 85) % 128;
        return false;
    }

    private boolean getHighSpeedVideoFpsRanges(int i) {
        boolean z;
        int i2 = getHighSpeedVideoSizesFor + 77;
        int i3 = i2 % 128;
        getOutputMinFrameDuration = i3;
        if (i2 % 2 != 0) {
            int length = this.Camera2StreamConfigurationMap.length;
            throw new java.lang.ArithmeticException();
        }
        byte[] bArr = this.Camera2StreamConfigurationMap;
        if (bArr.length > i) {
            getHighSpeedVideoSizesFor = (i3 + 11) % 128;
            byte b = bArr[i];
            if (b >= 48 && b <= 57) {
                z = true;
                getHighSpeedVideoSizesFor = (i3 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                return z;
            }
        }
        getHighSpeedVideoSizesFor = (i3 + 119) % 128;
        z = false;
        getHighSpeedVideoSizesFor = (i3 + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        r1 = new java.lang.Object[1];
        getHighSpeedVideoSizes(2065386152 - r6, (short) (91 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22)), (byte) ((-15) - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16)), (-68) - android.text.TextUtils.indexOf("", "", 0), 27679357 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), r1);
        r5.append(((java.lang.String) r1[0]).intern());
        r5.append(r0);
        r0 = r5.toString();
        r1 = util.h.xy.dh.ro.getOutputMinFrameDuration + 59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0088, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0089, code lost:
    
        r1 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008d, code lost:
    
        if (r1 != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008f, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0090, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0027, code lost:
    
        if (r0.charAt(0) < '5') goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r0.charAt(0) < ';') goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0091, code lost:
    
        r2 = new java.lang.StringBuilder();
        r1 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("䅱羆", android.text.TextUtils.indexOf("", "", 0) + 16127, r1);
        r2.append(((java.lang.String) r1[0]).intern());
        r2.append(r0);
        r0 = r2.toString();
        r1 = util.h.xy.dh.ro.getOutputMinFrameDuration + 41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        r5 = new java.lang.StringBuilder();
        r6 = android.graphics.Color.alpha(0);
     */
    /* renamed from: ʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String m26348() {
        java.lang.String m26347;
        java.lang.String obj;
        int i;
        int i2 = getHighSpeedVideoSizesFor + 75;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 != 0) {
            m26347 = m26347();
        } else {
            m26347 = m26347();
        }
        getHighSpeedVideoSizesFor = i % 128;
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0117, code lost:
    
        r5 = new java.lang.StringBuilder();
        r5.append(r0);
        r12 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("䅰ꩁ", 60209 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), r12);
        r5.append(((java.lang.String) r12[0]).intern());
        r0 = r5.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0143, code lost:
    
        if (r6 != 10) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0145, code lost:
    
        r2 = new java.lang.StringBuilder();
        r2.append(r0.substring(0, 10));
        r4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("䅰衍퍽᪺无", android.graphics.Color.green(0) + 51517, r4);
        r2.append(((java.lang.String) r4[0]).intern());
        r2.append(r0.substring(10, 13));
        r6 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("䅺", (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3119, r6);
        r2.append(((java.lang.String) r6[0]).intern());
        r0 = r0.substring(13, 15);
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0204, code lost:
    
        r5.append(r0);
        r2 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x020c, code lost:
    
        return r2.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0192, code lost:
    
        r6 = new java.lang.StringBuilder();
        r6.append(r0.substring(0, 12));
        r2 = new java.lang.Object[1];
        getHighSpeedVideoSizes(2065386149 + android.graphics.Color.green(0), (short) ((-8) - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), (byte) (android.graphics.Color.blue(0) + 108), (-69) - android.view.MotionEvent.axisFromString(""), (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 27679378, r2);
        r6.append(((java.lang.String) r2[0]).intern());
        r6.append(r0.substring(12, 15));
        r4 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("䅺", 3118 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)), r4);
        r6.append(((java.lang.String) r4[0]).intern());
        r0 = r0.substring(15, 17);
        r5 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        if (r0.indexOf(43) >= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
    
        if (r0.length() != 11) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0046, code lost:
    
        r5 = new java.lang.StringBuilder();
        r5.append(r0.substring(0, 10));
        r3 = new java.lang.Object[1];
        getHighSpeedVideoSizes(2065386129 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (short) ((-19) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), (byte) ((-25) - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) - 68, 27679356 - android.widget.ExpandableListView.getPackedPositionGroup(0), r3);
        r0 = ((java.lang.String) r3[0]).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        r2 = new java.lang.StringBuilder();
        r2.append(r0.substring(0, 12));
        r0 = android.view.View.MeasureSpec.getMode(0);
        util.h.xy.dh.ro.getOutputMinFrameDuration = (util.h.xy.dh.ro.getHighSpeedVideoSizesFor + 103) % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00be, code lost:
    
        r5 = new java.lang.Object[1];
        getHighSpeedVideoSizes(r0 + 2065386140, (short) (4 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22)), (byte) ((-35) - android.view.View.MeasureSpec.getSize(0)), (-68) - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), android.graphics.Color.blue(0) + 27679379, r5);
        r2.append(((java.lang.String) r5[0]).intern());
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f5, code lost:
    
        r2 = r0.getCause();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f9, code lost:
    
        if (r2 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00fb, code lost:
    
        throw r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fc, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0036, code lost:
    
        if (r0.indexOf(45) < 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0029, code lost:
    
        if (r0.indexOf(75) < 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x00fd, code lost:
    
        r6 = r0.indexOf(45);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0101, code lost:
    
        if (r6 >= 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0103, code lost:
    
        util.h.xy.dh.ro.getHighSpeedVideoSizesFor = (util.h.xy.dh.ro.getOutputMinFrameDuration + 63) % 128;
        r6 = r0.indexOf(43);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0115, code lost:
    
        if (r6 != (r0.length() - 3)) goto L28;
     */
    /* renamed from: ʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String m26347() {
        java.lang.String m26855;
        int i = getOutputMinFrameDuration + 5;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            m26855 = util.h.xy.fb.rd.m26855(this.Camera2StreamConfigurationMap);
        } else {
            m26855 = util.h.xy.fb.rd.m26855(this.Camera2StreamConfigurationMap);
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public java.util.Date m26349() throws java.text.ParseException {
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 2065386116, (short) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) - 36), (byte) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 108), (-68) - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 27679429, objArr);
            return util.h.xy.dh.az.getHighSpeedVideoFpsRangesFor(new java.text.SimpleDateFormat(((java.lang.String) objArr[0]).intern()).parse(m26347()));
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private ro(byte[] bArr) {
        if (bArr.length >= 2) {
            this.Camera2StreamConfigurationMap = bArr;
            if (getHighSpeedVideoFpsRanges(0) && getHighSpeedVideoFpsRanges(1)) {
                return;
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("䄩\ue347\u05faꙤ좋洶辮ㆍ剻\uf4ebᤏ뮫\udc25繌ꃮ애枂蠨⫦䳘\uf172Ꭷ됧횉笋鵧㿷恤芑❿䦹\uebc1\u0c52껢팘疆", 41579 - android.view.View.getDefaultSize(0, 0), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes(2065386092 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), (short) (82 - (android.view.ViewConfiguration.getJumpTapTimeout() >> 16)), (byte) ((-67) - android.graphics.Color.green(0)), (android.view.ViewConfiguration.getLongPressTimeout() >> 16) - 68, android.view.KeyEvent.getDeadChar(0, 0) + 27679393, objArr2);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
    }

    public ro(java.lang.String str) {
        this.Camera2StreamConfigurationMap = util.h.xy.fb.rd.m26856(str);
        try {
            m26349();
        } catch (java.text.ParseException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            float maxVolume = android.media.AudioTrack.getMaxVolume();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((maxVolume > 0.0f ? 1 : (maxVolume == 0.0f ? 0 : -1)) + 2065386070, (short) ((-73) - android.graphics.ImageFormat.getBitsPerPixel(0)), (byte) ((-79) - android.view.KeyEvent.getDeadChar(0, 0)), (-68) - (android.view.ViewConfiguration.getScrollBarSize() >> 8), 27679412 - android.view.MotionEvent.axisFromString(""), objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e.getMessage());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    static void getHighSpeedVideoSizes() {
        getOutputFormats = 1665507953;
        getInputSizeshNQ4ISI = -408873061;
        getInputFormats = 435729004;
        getOutputStallDuration = new byte[]{10, 71, 114, 72, 36, 86, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 32, -14, -118, 80, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, 76, -27, -115, 74, 76, -38, 122, -39, 36, 13, -75, -76, -80, 46, 68, 98, -77, 44, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, 106, 42, -66, 32, 41, -78, 68, 108, 43, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -114, -126, -40, 40, 18, 87, 72, 86, 72, -75, 72, 116, 72, 71, 72, 4, 72, 16, 33, -5, 39, 33, 44, -102, 42, 43, -38, 33, com.google.common.base.Ascii.RS, 1, -1, com.google.common.base.Ascii.VT, 1, com.google.common.base.Ascii.FF, -34, 14, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.CAN, -85, -86, 103, 108};
        getOutputSizeshNQ4ISI = -1822222283148266789L;
    }
}
