package util.h.xy.au;

/* loaded from: classes5.dex */
public final class rg {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static char[] getHighSpeedVideoSizesFor = null;
    private static final java.lang.String getInputFormats;
    private static util.h.xy.au.rg getInputSizeshNQ4ISI = null;
    private static int getOutputFormats = 0;
    private static int getOutputMinFrameDuration = 1;
    private static byte[] getOutputSizes;
    private static short[] getOutputStallDuration;
    private static char getOutputStallDurationlomOqCM;
    private util.h.xy.da.ra getOutputSizeshNQ4ISI;

    static {
        getHighSpeedVideoFpsRangesFor();
        getInputFormats = "rg";
        getOutputMinFrameDuration = (getOutputFormats + 35) % 128;
    }

    private rg(android.content.Context context) throws util.h.xy.da.b {
        getOutputMinFrameDuration = (getOutputFormats + 35) % 128;
        try {
            util.h.xy.da.mc.m26263(context);
            util.h.xy.da.ma maVar = util.h.xy.da.ma.f1154;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor((byte) (android.text.TextUtils.getTrimmedLength("") + 23), "\r\u0007!\u0010㗹㗹\u001e\u000b", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 9, objArr);
            this.getOutputSizeshNQ4ISI = util.h.xy.da.d.m26260(maVar, ((java.lang.String) objArr[0]).intern());
            getOutputMinFrameDuration = (getOutputFormats + 29) % 128;
        } catch (util.h.xy.da.b e) {
            e.getMessage();
            throw e;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.au.rg m25213(android.content.Context context) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        util.h.xy.au.rg rgVar;
        synchronized (util.h.xy.au.rg.class) {
            if (getInputSizeshNQ4ISI == null) {
                int i = (getOutputFormats + 63) % 128;
                getOutputMinFrameDuration = i;
                if (context == null) {
                    int i2 = i + 65;
                    getOutputFormats = i2 % 128;
                    if (i2 % 2 != 0) {
                        util.h.xy.bh.ra.m25484().m25485();
                        throw new java.lang.NullPointerException();
                    }
                    context = util.h.xy.bh.ra.m25484().m25485();
                }
                try {
                    getInputSizeshNQ4ISI = new util.h.xy.au.rg(context);
                } catch (util.h.xy.da.b e) {
                    e.getMessage();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((byte) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 63), "\u0007\u0003\r \u0001\u0002\u0010\u0013\n\u0018\u0005\u0018\u001f\u0004\u0013\u0007㘨㘨\u0018\u0004㗠", 22 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
                    sb.append(((java.lang.String) objArr[0]).intern());
                    sb.append(e.getMessage());
                    throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(sb.toString());
                }
            }
            rgVar = getInputSizeshNQ4ISI;
        }
        return rgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cd  */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getHighSpeedVideoFpsRanges(android.content.Context context) throws util.h.xy.da.b {
        java.lang.Throwable th;
        byte[] bArr;
        util.h.xy.da.b e;
        java.lang.IllegalArgumentException e2;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4 = null;
        r1 = 0;
        r1 = null;
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        try {
            try {
                util.h.xy.da.ra raVar = this.getOutputSizeshNQ4ISI;
                if (raVar != null) {
                    getOutputFormats = (getOutputMinFrameDuration + 107) % 128;
                    if (!raVar.mo26080()) {
                        android.content.ContentResolver contentResolver = context.getContentResolver();
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((byte) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 85), "\u0018\u001a\u0005\u0001\u0018\u0016\u0002\u001c\u0016\u0000", 10 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr);
                        java.lang.String string = android.provider.Settings.Secure.getString(contentResolver, ((java.lang.String) objArr[0]).intern());
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(context.getPackageName());
                        sb.append(string);
                        bArr2 = sb.toString().getBytes();
                        try {
                            bArr5 = new byte[bArr2.length];
                            for (int i = 0; i < bArr2.length; i++) {
                                getOutputMinFrameDuration = (getOutputFormats + 65) % 128;
                                bArr5[i] = (byte) (bArr2[i] ^ 67);
                            }
                            this.getOutputSizeshNQ4ISI.mo26073(util.h.xy.da.mb.m26261(util.h.xy.bh.mb.m25470(string.getBytes(), bArr5)).mo26090(util.h.xy.da.a.f1152).mo26094());
                            bArr6 = bArr2;
                            bArr3 = bArr5;
                            if (bArr6 != null) {
                                java.util.Arrays.fill(bArr6, (byte) 0);
                            }
                            if (bArr3 == null) {
                                java.util.Arrays.fill(bArr3, (byte) 0);
                                return;
                            }
                            return;
                        } catch (java.lang.IllegalArgumentException e3) {
                            e2 = e3;
                            e2.getMessage();
                            throw new util.h.xy.da.b(e2.getMessage());
                        } catch (util.h.xy.da.b e4) {
                            e = e4;
                            e.getMessage();
                            throw e;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            byte[] bArr7 = bArr5;
                            bArr4 = bArr2;
                            bArr = bArr7;
                            if (bArr4 != null) {
                                java.util.Arrays.fill(bArr4, (byte) 0);
                            }
                            if (bArr != null) {
                                java.util.Arrays.fill(bArr, (byte) 0);
                            }
                            throw th;
                        }
                    }
                }
                bArr3 = null;
                if (bArr6 != null) {
                }
                if (bArr3 == null) {
                }
            } catch (java.lang.Throwable th3) {
                th = th3;
                bArr5 = context;
                bArr2 = null;
            }
        } catch (java.lang.IllegalArgumentException e5) {
            e2 = e5;
        } catch (util.h.xy.da.b e6) {
            e = e6;
        } catch (java.lang.Throwable th4) {
            th = th4;
            bArr = null;
            if (bArr4 != null) {
            }
            if (bArr != null) {
            }
            throw th;
        }
    }

    private void Camera2StreamConfigurationMap() throws util.h.xy.da.b {
        int i = getOutputFormats + 37;
        getOutputMinFrameDuration = i % 128;
        try {
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            util.h.xy.da.ra raVar = this.getOutputSizeshNQ4ISI;
            if (raVar != null && raVar.mo26080()) {
                int i2 = getOutputFormats + 45;
                getOutputMinFrameDuration = i2 % 128;
                if (i2 % 2 != 0) {
                    this.getOutputSizeshNQ4ISI.mo26074();
                } else {
                    this.getOutputSizeshNQ4ISI.mo26074();
                    throw new java.lang.NullPointerException();
                }
            }
            getOutputFormats = (getOutputMinFrameDuration + 11) % 128;
        } catch (util.h.xy.da.b e) {
            e.getMessage();
            throw e;
        }
    }

    private byte[] getHighSpeedVideoFpsRanges(byte[] bArr) throws util.h.xy.da.b {
        getOutputFormats = (getOutputMinFrameDuration + 115) % 128;
        try {
            byte[] mo26081 = this.getOutputSizeshNQ4ISI.mo26081(bArr);
            int i = getOutputFormats + 69;
            getOutputMinFrameDuration = i % 128;
            if (i % 2 != 0) {
                return mo26081;
            }
            throw null;
        } catch (util.h.xy.da.b e) {
            e.getMessage();
            throw e;
        }
    }

    private void getHighSpeedVideoSizes(byte[] bArr, byte[] bArr2) throws util.h.xy.da.b {
        try {
            this.getOutputSizeshNQ4ISI.mo26077(bArr, bArr2);
            int i = getOutputFormats;
            getOutputMinFrameDuration = (i + 73) % 128;
            getOutputMinFrameDuration = (i + 79) % 128;
        } catch (util.h.xy.da.b e) {
            e.getMessage();
            throw e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0083, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0094, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0090, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoSizes(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        int i5;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = i2 + ((int) (getHighSpeedVideoFpsRangesFor ^ (-2689713159175858216L)));
        boolean z = i6 == -1;
        if (z) {
            byte[] bArr = getOutputSizes;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 5) % 128;
                for (int i7 = 0; i7 < length; i7++) {
                    bArr2[i7] = (byte) (bArr[i7] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            i6 = bArr != null ? (byte) (((byte) (getOutputSizes[((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoFpsRangesFor ^ (-2689713159175858216L)))) : (short) (((short) (getOutputStallDuration[((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoFpsRangesFor ^ (-2689713159175858216L))));
        }
        if (i6 > 0) {
            int i8 = Camera2StreamConfigurationMap + 39;
            getHighSpeedVideoSizes = i8 % 128;
            if (i8 % 2 == 0) {
                i4 = ((i % i6) * 5) << ((int) (getHighSpeedVideoFpsRanges / (-2689713159175858216L)));
            } else {
                i4 = ((i + i6) - 2) + ((int) (getHighSpeedVideoFpsRanges ^ (-2689713159175858216L)));
            }
            meVar.f2647 = i4 + i5;
            meVar.f2644 = (char) (i3 + ((int) (getHighResolutionOutputSizeshNQ4ISI ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getOutputSizes;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i9 = 0; i9 < length2; i9++) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 3) % 128;
                    bArr4[i9] = (byte) (bArr3[i9] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            boolean z2 = bArr3 != null;
            meVar.f2645 = 1;
            while (meVar.f2645 < i6) {
                if (z2) {
                    getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 63) % 128;
                    byte[] bArr5 = getOutputSizes;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getOutputStallDuration;
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

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25222(android.content.Context context) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        synchronized (this) {
            int i = getOutputFormats + 5;
            getOutputMinFrameDuration = i % 128;
            try {
                if (i % 2 != 0) {
                    this.getOutputSizeshNQ4ISI.mo26075();
                    getInputSizeshNQ4ISI = null;
                    m25213(context);
                    int i2 = getOutputFormats + 57;
                    getOutputMinFrameDuration = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw new java.lang.ArithmeticException();
                    }
                } else {
                    this.getOutputSizeshNQ4ISI.mo26075();
                    getInputSizeshNQ4ISI = null;
                    m25213(context);
                    throw null;
                }
            } catch (util.h.xy.da.b e) {
                e.getMessage();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes(packedPositionGroup - 924962855, (short) (112 - android.graphics.Color.argb(0, 0, 0, 0)), (byte) (64 - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (-16777213) - android.graphics.Color.rgb(0, 0, 0), 1630998865 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(e.getMessage());
                throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(sb.toString());
            }
        }
    }

    private byte[] getHighSpeedVideoFpsRanges(java.lang.String str, boolean z, android.content.Context context) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        try {
            try {
                if (android.text.TextUtils.isEmpty(str)) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((byte) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 67), "\u0013\u0002\u0007\u0010\u0013\u0017\f\u0013\u001a\u001f\u001c\u0011\u0016\u0000", 14 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
                    throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(((java.lang.String) objArr[0]).intern());
                }
                getHighSpeedVideoFpsRanges(context);
                byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str.getBytes());
                if (!z) {
                    getOutputMinFrameDuration = (getOutputFormats + 57) % 128;
                    if (highSpeedVideoFpsRanges == null || highSpeedVideoFpsRanges.length <= 0) {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((byte) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 38), "\u000b\u001a\u000b\u0018\u000e\u0001\u0004\u0018\u0013\u000f\u0012\n\u0018\u0004\u001c#\u0007\u0013\u0013\u0017\u0013\u0007\u0012\u000f\u0007\u000b㗚", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 27, objArr2);
                        throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(((java.lang.String) objArr2[0]).intern());
                    }
                }
                try {
                    Camera2StreamConfigurationMap();
                    int i = getOutputFormats;
                    int i2 = i + 1;
                    getOutputMinFrameDuration = i2 % 128;
                    if (i2 % 2 == 0) {
                        throw new java.lang.ArithmeticException();
                    }
                    int i3 = i + 87;
                    getOutputMinFrameDuration = i3 % 128;
                    if (i3 % 2 != 0) {
                        return highSpeedVideoFpsRanges;
                    }
                    throw null;
                } catch (util.h.xy.da.b e) {
                    e.getMessage();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((byte) (8 - android.view.KeyEvent.getDeadChar(0, 0)), "\u0006\u0005\u0004\u0018\u0001\f\u0015\u0019\u0016\f\u0007\u0013\u0003\u0002\b\f\u0018\u0015\u001c\u001f\u0010\u0001\u0018\u000b\u0019\u0011\u0003\u0001\u001b\u0016\u000f\u0007\n\u0018\u0005\u0018\u001f\u0004\u000f\u0001\u000e\f\"\n\u0007\u0013\u0015\u0005㖨", 49 - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr3);
                    sb.append(((java.lang.String) objArr3[0]).intern());
                    sb.append(e.getMessage());
                    throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(sb.toString(), e);
                }
            } catch (util.h.xy.da.b e2) {
                e2.getMessage();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                int touchSlop = android.view.ViewConfiguration.getTouchSlop();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoSizes((touchSlop >> 8) - 924962816, (short) ((-99) - android.widget.ExpandableListView.getPackedPositionType(0L)), (byte) ((-111) - android.view.KeyEvent.keyCodeFromString("")), (-16777204) - android.graphics.Color.rgb(0, 0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 1630998865, objArr4);
                sb2.append(((java.lang.String) objArr4[0]).intern());
                sb2.append(e2.getMessage());
                throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(sb2.toString(), e2);
            }
        } catch (java.lang.Throwable th) {
            try {
                Camera2StreamConfigurationMap();
                throw th;
            } catch (util.h.xy.da.b e3) {
                e3.getMessage();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor((byte) (8 - android.graphics.Color.green(0)), "\u0006\u0005\u0004\u0018\u0001\f\u0015\u0019\u0016\f\u0007\u0013\u0003\u0002\b\f\u0018\u0015\u001c\u001f\u0010\u0001\u0018\u000b\u0019\u0011\u0003\u0001\u001b\u0016\u000f\u0007\n\u0018\u0005\u0018\u001f\u0004\u000f\u0001\u000e\f\"\n\u0007\u0013\u0015\u0005㖨", android.view.View.resolveSizeAndState(0, 0, 0) + 49, objArr5);
                sb3.append(((java.lang.String) objArr5[0]).intern());
                sb3.append(e3.getMessage());
                throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(sb3.toString(), e3);
            }
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 7) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = getHighSpeedVideoSizesFor;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                int i4 = Camera2StreamConfigurationMap + 115;
                getHighSpeedVideoSizes = i4 % 128;
                if (i4 % 2 == 0) {
                    cArr2[i3] = (char) (cArr[i3] ^ 4042185467053315654L);
                } else {
                    cArr2[i3] = (char) (cArr[i3] ^ 4042185467053315654L);
                    i3++;
                }
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ getOutputStallDurationlomOqCM);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 83) % 128;
            mcVar.f2638 = 0;
            while (mcVar.f2638 < i2) {
                mcVar.f2641 = charArray[mcVar.f2638];
                mcVar.f2636 = charArray[mcVar.f2638 + 1];
                if (mcVar.f2641 == mcVar.f2636) {
                    cArr3[mcVar.f2638] = (char) (mcVar.f2641 - b);
                    cArr3[mcVar.f2638 + 1] = (char) (mcVar.f2636 - b);
                } else {
                    mcVar.f2639 = mcVar.f2641 / c;
                    mcVar.f2640 = mcVar.f2641 % c;
                    mcVar.f2637 = mcVar.f2636 / c;
                    mcVar.f2635 = mcVar.f2636 % c;
                    if (mcVar.f2640 == mcVar.f2635) {
                        mcVar.f2639 = ((mcVar.f2639 + c) - 1) % c;
                        mcVar.f2637 = ((mcVar.f2637 + c) - 1) % c;
                        int i5 = mcVar.f2639;
                        int i6 = mcVar.f2640;
                        int i7 = mcVar.f2637;
                        int i8 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i5 * c) + i6];
                        cArr3[mcVar.f2638 + 1] = cArr[(i7 * c) + i8];
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i9 = mcVar.f2639;
                        int i10 = mcVar.f2640;
                        int i11 = mcVar.f2637;
                        int i12 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i9 * c) + i10];
                        cArr3[mcVar.f2638 + 1] = cArr[(i11 * c) + i12];
                    } else {
                        int i13 = mcVar.f2639;
                        int i14 = mcVar.f2635;
                        int i15 = mcVar.f2637;
                        int i16 = mcVar.f2640;
                        cArr3[mcVar.f2638] = cArr[(i13 * c) + i14];
                        cArr3[mcVar.f2638 + 1] = cArr[(i15 * c) + i16];
                    }
                }
                mcVar.f2638 += 2;
            }
        }
        int i17 = 0;
        while (i17 < i) {
            int i18 = Camera2StreamConfigurationMap + 99;
            getHighSpeedVideoSizes = i18 % 128;
            if (i18 % 2 == 0) {
                cArr3[i17] = (char) (cArr3[i17] ^ 7904);
                i17 += 80;
            } else {
                cArr3[i17] = (char) (cArr3[i17] ^ 13722);
                i17++;
            }
        }
        java.lang.String str2 = new java.lang.String(cArr3);
        getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 31) % 128;
        objArr[0] = str2;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25218(java.lang.String str, byte[] bArr, android.content.Context context) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        synchronized (this) {
            try {
                try {
                    try {
                        getHighSpeedVideoFpsRanges(context);
                        getHighSpeedVideoSizes(str.getBytes(), bArr);
                        try {
                            Camera2StreamConfigurationMap();
                        } catch (util.h.xy.da.b e) {
                            e.getMessage();
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            getHighSpeedVideoSizes(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 924962767, (short) (android.graphics.ImageFormat.getBitsPerPixel(0) + 82), (byte) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) - 90), 10 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1630998866 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr);
                            sb.append(((java.lang.String) objArr[0]).intern());
                            sb.append(e.getMessage());
                            throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(sb.toString());
                        }
                    } catch (util.h.xy.da.b e2) {
                        e2.getMessage();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoSizes(android.view.Gravity.getAbsoluteGravity(0, 0) - 924962723, (short) ((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 8), (byte) (40 - android.graphics.Color.green(0)), 9 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1630998866, objArr2);
                        sb2.append(((java.lang.String) objArr2[0]).intern());
                        sb2.append(e2.getMessage());
                        throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(sb2.toString());
                    }
                } catch (java.lang.Throwable th) {
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                try {
                    Camera2StreamConfigurationMap();
                    throw th2;
                } catch (util.h.xy.da.b e3) {
                    e3.getMessage();
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    try {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoSizes((android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16) - 924962768, (short) ((android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 81), (byte) ((-90) - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 9 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 1630998865, objArr3);
                        sb3.append(((java.lang.String) objArr3[0]).intern());
                        sb3.append(e3.getMessage());
                        throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(sb3.toString());
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause = th3.getCause();
                        if (cause == null) {
                            throw th3;
                        }
                        throw cause;
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x010d A[Catch: all -> 0x0135, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:3:0x0001, B:14:0x0082, B:21:0x010d, B:47:0x0131, B:48:0x0134, B:27:0x009b), top: B:2:0x0001 }] */
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] m25220() throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        byte edgeSlop;
        int i;
        byte[] bytes;
        int i2;
        synchronized (this) {
            int i3 = getOutputFormats + 61;
            getOutputMinFrameDuration = i3 % 128;
            byte[] bArr = null;
            try {
                if (i3 % 2 == 0) {
                    edgeSlop = (byte) (109 << (android.view.ViewConfiguration.getEdgeSlop() % 71));
                    i = 2;
                } else {
                    edgeSlop = (byte) ((android.view.ViewConfiguration.getEdgeSlop() >> 16) + 113);
                    i = 4;
                }
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(edgeSlop, "\u0005\u001a\u0016\u001c㙰", i + (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr);
                    bytes = ((java.lang.String) objArr[0]).intern().getBytes();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((byte) (68 - android.view.View.MeasureSpec.getMode(0)), "\u0000\u0014\u0004\u0012\u0007\u0006\u0018\u0001\"\u0016\u000f\u0016\u0007\u001f㘲", (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15, objArr2);
                    byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(((java.lang.String) objArr2[0]).intern(), true, util.h.xy.bh.ra.m25484().m25485());
                    try {
                        try {
                            if (highSpeedVideoFpsRanges != null) {
                                int i4 = getOutputFormats + 89;
                                getOutputMinFrameDuration = i4 % 128;
                                if (i4 % 2 != 0) {
                                    if (highSpeedVideoFpsRanges.length == 0) {
                                    }
                                    if (highSpeedVideoFpsRanges != null) {
                                        getOutputFormats = (getOutputMinFrameDuration + 91) % 128;
                                        java.util.Arrays.fill(highSpeedVideoFpsRanges, (byte) 0);
                                    }
                                } else {
                                    int length = highSpeedVideoFpsRanges.length;
                                    throw new java.lang.NullPointerException();
                                }
                            }
                            if (i2 % 2 != 0) {
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor((byte) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() + 3), "\f\u0006\u0001\u0007", android.view.View.resolveSize(0, 0) * 4, objArr3);
                                bytes = ((java.lang.String) objArr3[0]).intern().getBytes();
                            } else {
                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRangesFor((byte) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 88), "\f\u0006\u0001\u0007", 4 - android.view.View.resolveSize(0, 0), objArr4);
                                bytes = ((java.lang.String) objArr4[0]).intern().getBytes();
                            }
                            if (highSpeedVideoFpsRanges != null) {
                            }
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                        i2 = getOutputMinFrameDuration + 67;
                        getOutputFormats = i2 % 128;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        bArr = highSpeedVideoFpsRanges;
                        if (bArr != null) {
                            java.util.Arrays.fill(bArr, (byte) 0);
                        }
                        throw th;
                    }
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause2 = th3.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th3;
                }
            } catch (java.lang.Throwable th4) {
                th = th4;
            }
        }
        return bytes;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25221() throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        synchronized (this) {
            try {
                try {
                    try {
                        getHighSpeedVideoFpsRanges(util.h.xy.bh.ra.m25484().m25485());
                        try {
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((byte) (android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 68), "\u0000\u0014\u0004\u0012\u0007\u0006\u0018\u0001\"\u0016\u000f\u0016\u0007\u001f㘲", 15 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), objArr);
                            byte[] bytes = ((java.lang.String) objArr[0]).intern().getBytes();
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((byte) (113 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0)), "\u0005\u001a\u0016\u001c㙰", android.widget.ExpandableListView.getPackedPositionType(0L) + 5, objArr2);
                            getHighSpeedVideoSizes(bytes, ((java.lang.String) objArr2[0]).intern().getBytes());
                            try {
                                Camera2StreamConfigurationMap();
                            } catch (util.h.xy.da.b e) {
                                e.getMessage();
                                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                getHighSpeedVideoSizes(android.graphics.Color.red(0) - 924962678, (short) (android.view.KeyEvent.getDeadChar(0, 0) - 34), (byte) (81 - (android.view.KeyEvent.getMaxKeyCode() >> 16)), android.view.View.combineMeasuredStates(0, 0) + 7, 1630998864 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr3);
                                sb.append(((java.lang.String) objArr3[0]).intern());
                                sb.append(e.getMessage());
                                throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(sb.toString());
                            }
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } catch (util.h.xy.da.b e2) {
                        e2.getMessage();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoSizes((android.view.ViewConfiguration.getTouchSlop() >> 8) - 924962635, (short) (android.graphics.Color.blue(0) + 86), (byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 39), 6 - android.view.MotionEvent.axisFromString(""), 1630998866 + ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr4);
                        sb2.append(((java.lang.String) objArr4[0]).intern());
                        sb2.append(e2.getMessage());
                        throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(sb2.toString());
                    }
                } catch (java.lang.Throwable th2) {
                    throw th2;
                }
            } catch (java.lang.Throwable th3) {
                try {
                    Camera2StreamConfigurationMap();
                    throw th3;
                } catch (util.h.xy.da.b e3) {
                    e3.getMessage();
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    try {
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        getHighSpeedVideoSizes((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) - 924962678, (short) ((-34) - android.graphics.Color.argb(0, 0, 0, 0)), (byte) (80 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), 7 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 1630998865, objArr5);
                        sb3.append(((java.lang.String) objArr5[0]).intern());
                        sb3.append(e3.getMessage());
                        throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(sb3.toString());
                    } catch (java.lang.Throwable th4) {
                        java.lang.Throwable cause2 = th4.getCause();
                        if (cause2 == null) {
                            throw th4;
                        }
                        throw cause2;
                    }
                }
            }
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] m25225(java.lang.String str, boolean z, android.content.Context context) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        byte[] highSpeedVideoFpsRanges;
        synchronized (this) {
            getOutputMinFrameDuration = (getOutputFormats + 125) % 128;
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(str, z, context);
            int i = getOutputMinFrameDuration + 43;
            getOutputFormats = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
        }
        return highSpeedVideoFpsRanges;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m25216(java.lang.String str) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        byte[] m25217;
        synchronized (this) {
            getOutputFormats = (getOutputMinFrameDuration + 111) % 128;
            m25217 = m25217(str, false);
            getOutputFormats = (getOutputMinFrameDuration + 19) % 128;
        }
        return m25217;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m25217(java.lang.String str, boolean z) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        byte[] highSpeedVideoFpsRanges;
        synchronized (this) {
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(new java.lang.String(util.h.xy.bh.mb.m25473(str), java.nio.charset.StandardCharsets.UTF_8), z, util.h.xy.bh.ra.m25484().m25485());
            getOutputMinFrameDuration = (getOutputFormats + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        }
        return highSpeedVideoFpsRanges;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final byte[] m25226() throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        byte[] highSpeedVideoFpsRanges;
        synchronized (this) {
            getOutputMinFrameDuration = (getOutputFormats + 115) % 128;
            int alpha = android.graphics.Color.alpha(0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes((-924962592) - alpha, (short) (54 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16)), (byte) ((android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 28), (-12) - android.view.View.getDefaultSize(0, 0), android.widget.ExpandableListView.getPackedPositionGroup(0L) + 1630998908, objArr);
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(((java.lang.String) objArr[0]).intern(), true, util.h.xy.bh.ra.m25484().m25485());
            int i = getOutputFormats + 81;
            getOutputMinFrameDuration = i % 128;
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
        }
        return highSpeedVideoFpsRanges;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25224(byte[] bArr) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        synchronized (this) {
            getOutputMinFrameDuration = (getOutputFormats + 51) % 128;
            try {
                try {
                    getHighSpeedVideoFpsRanges(util.h.xy.bh.ra.m25484().m25485());
                    int windowTouchSlop = android.view.ViewConfiguration.getWindowTouchSlop();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes((windowTouchSlop >> 8) - 924962592, (short) (android.text.TextUtils.indexOf("", "") + 54), (byte) (28 - android.graphics.Color.alpha(0)), (-12) - (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1630998907, objArr);
                    getHighSpeedVideoSizes(((java.lang.String) objArr[0]).intern().getBytes(), bArr);
                    try {
                        Camera2StreamConfigurationMap();
                        getOutputFormats = (getOutputMinFrameDuration + 55) % 128;
                    } catch (util.h.xy.da.b e) {
                        e.getMessage();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((byte) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 115), "\u0006\u0005\u0004\u0018\u0001\f\u0015\u0019\u0016\f\u0007\u0013\u0012\n\u0018\u0004\u0013\u0018\u001f\u0010\u0005\u001c\u000b\u0018\f\u0013\u001f\u0013\n\u0007\u0018\u0004\u001c#\u0007\u0013\u0001\u000f\u000e\f\"\n\u0007\u0013㘛", 46 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), objArr2);
                        sb.append(((java.lang.String) objArr2[0]).intern());
                        sb.append(e.getMessage());
                        throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(sb.toString());
                    }
                } catch (java.lang.Throwable th) {
                    try {
                        Camera2StreamConfigurationMap();
                        throw th;
                    } catch (util.h.xy.da.b e2) {
                        e2.getMessage();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((byte) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 115), "\u0006\u0005\u0004\u0018\u0001\f\u0015\u0019\u0016\f\u0007\u0013\u0012\n\u0018\u0004\u0013\u0018\u001f\u0010\u0005\u001c\u000b\u0018\f\u0013\u001f\u0013\n\u0007\u0018\u0004\u001c#\u0007\u0013\u0001\u000f\u000e\f\"\n\u0007\u0013㘛", 44 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr3);
                        sb2.append(((java.lang.String) objArr3[0]).intern());
                        sb2.append(e2.getMessage());
                        throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(sb2.toString());
                    }
                }
            } catch (util.h.xy.da.b e3) {
                e3.getMessage();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                int touchSlop = android.view.ViewConfiguration.getTouchSlop();
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoSizes((touchSlop >> 8) - 924962635, (short) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 86), (byte) (38 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 7, (android.view.ViewConfiguration.getWindowTouchSlop() >> 8) + 1630998865, objArr4);
                sb3.append(((java.lang.String) objArr4[0]).intern());
                sb3.append(e3.getMessage());
                throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(sb3.toString());
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25214(java.lang.String str, byte[] bArr) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        synchronized (this) {
            int i = getOutputFormats + 25;
            getOutputMinFrameDuration = i % 128;
            try {
                try {
                    try {
                        if (i % 2 != 0) {
                            getHighSpeedVideoFpsRanges(util.h.xy.bh.ra.m25484().m25485());
                            getHighSpeedVideoSizes(util.h.xy.bh.mb.m25473(str), bArr);
                            Camera2StreamConfigurationMap();
                            int i2 = getOutputFormats + 59;
                            getOutputMinFrameDuration = i2 % 128;
                            int i3 = i2 % 2;
                        } else {
                            getHighSpeedVideoFpsRanges(util.h.xy.bh.ra.m25484().m25485());
                            getHighSpeedVideoSizes(util.h.xy.bh.mb.m25473(str), bArr);
                            Camera2StreamConfigurationMap();
                            throw null;
                        }
                    } catch (java.lang.Throwable th) {
                        try {
                            Camera2StreamConfigurationMap();
                            throw th;
                        } catch (util.h.xy.da.b e) {
                            e.getMessage();
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((byte) (116 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), "\u0006\u0005\u0004\u0018\u0001\f\u0015\u0019\u0016\f\u0007\u0013\u0012\n\u0018\u0004\u0013\u0018\u001f\u0010\u0005\u001c\u000b\u0018\f\u0013\u001f\u0013\n\u0007\u0018\u0004\u001c#\u0007\u0013\u0001\u000f\u000e\f\"\n\u0007\u0013㘛", 45 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr);
                            sb.append(((java.lang.String) objArr[0]).intern());
                            sb.append(e.getMessage());
                            throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(sb.toString());
                        }
                    }
                } catch (util.h.xy.da.b e2) {
                    e2.getMessage();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor((byte) (115 - android.view.View.resolveSize(0, 0)), "\u0006\u0005\u0004\u0018\u0001\f\u0015\u0019\u0016\f\u0007\u0013\u0012\n\u0018\u0004\u0013\u0018\u001f\u0010\u0005\u001c\u000b\u0018\f\u0013\u001f\u0013\n\u0007\u0018\u0004\u001c#\u0007\u0013\u0001\u000f\u000e\f\"\n\u0007\u0013㘛", 44 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr2);
                    sb2.append(((java.lang.String) objArr2[0]).intern());
                    sb2.append(e2.getMessage());
                    throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(sb2.toString());
                }
            } catch (util.h.xy.da.b e3) {
                e3.getMessage();
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                int red = android.graphics.Color.red(0);
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes(red - 924962635, (short) (86 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16)), (byte) (37 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0)), (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 7, android.view.Gravity.getAbsoluteGravity(0, 0) + 1630998865, objArr3);
                sb3.append(((java.lang.String) objArr3[0]).intern());
                sb3.append(e3.getMessage());
                throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(sb3.toString());
            }
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25223(java.lang.String str) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        synchronized (this) {
            try {
                try {
                    try {
                        try {
                            getHighSpeedVideoFpsRanges(util.h.xy.bh.ra.m25484().m25485());
                            try {
                                this.getOutputSizeshNQ4ISI.mo26076(util.h.xy.bh.mb.m25473(str));
                                int i = getOutputFormats + 69;
                                int i2 = i % 128;
                                getOutputMinFrameDuration = i2;
                                if (i % 2 == 0) {
                                    int i3 = 2 / 4;
                                }
                                getOutputFormats = (i2 + 5) % 128;
                                try {
                                    Camera2StreamConfigurationMap();
                                } catch (util.h.xy.da.b e) {
                                    e.getMessage();
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    java.lang.Object[] objArr = new java.lang.Object[1];
                                    getHighSpeedVideoSizes((-924962569) - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), (short) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 9), (byte) (android.view.MotionEvent.axisFromString("") + 22), 10 - android.view.KeyEvent.keyCodeFromString(""), 1630998865 - android.view.View.resolveSizeAndState(0, 0, 0), objArr);
                                    sb.append(((java.lang.String) objArr[0]).intern());
                                    sb.append(e.getMessage());
                                    throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(sb.toString());
                                }
                            } catch (util.h.xy.da.b e2) {
                                e2.getMessage();
                                throw e2;
                            }
                        } catch (java.lang.Throwable th) {
                            try {
                                Camera2StreamConfigurationMap();
                                throw th;
                            } catch (util.h.xy.da.b e3) {
                                e3.getMessage();
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                getHighSpeedVideoSizes((-924962568) - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), (short) ((-10) - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue()), (byte) ((android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 21), 10 - android.text.TextUtils.getTrimmedLength(""), ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 1630998865, objArr2);
                                sb2.append(((java.lang.String) objArr2[0]).intern());
                                sb2.append(e3.getMessage());
                                throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(sb2.toString());
                            }
                        }
                    } catch (util.h.xy.da.b e4) {
                        e4.getMessage();
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        try {
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighSpeedVideoSizes((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 924962724, (short) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 8), (byte) (39 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 9, 1630998865 - android.view.View.combineMeasuredStates(0, 0), objArr3);
                            sb3.append(((java.lang.String) objArr3[0]).intern());
                            sb3.append(e4.getMessage());
                            throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(sb3.toString());
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause = th2.getCause();
                            if (cause == null) {
                                throw th2;
                            }
                            throw cause;
                        }
                    }
                } catch (java.lang.Throwable th3) {
                    throw th3;
                }
            } catch (java.lang.Throwable th4) {
                java.lang.Throwable cause2 = th4.getCause();
                if (cause2 == null) {
                    throw th4;
                }
                throw cause2;
            }
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25219(byte[] bArr) throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        synchronized (this) {
            try {
                try {
                    try {
                        getHighSpeedVideoFpsRanges(util.h.xy.bh.ra.m25484().m25485());
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoSizes(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 924962521, (short) (android.graphics.Color.green(0) + 26), (byte) ('1' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) - 22, 1630998896 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr);
                        getHighSpeedVideoSizes(((java.lang.String) objArr[0]).intern().getBytes(), bArr);
                        try {
                            Camera2StreamConfigurationMap();
                        } catch (util.h.xy.da.b e) {
                            e.getMessage();
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor((byte) (115 - android.view.View.MeasureSpec.getSize(0)), "\u0006\u0005\u0004\u0018\u0001\f\u0015\u0019\u0016\f\u0007\u0013\u0012\n\u0018\u0004\u0013\u0018\u001f\u0010\u0005\u001c\u000b\u0018\f\u0013\u001f\u0013\n\u0007\u0018\u0004\u001c#\u0007\u0013\u0001\u000f\u000e\f\"\n\u0007\u0013㘛", 45 - android.view.View.resolveSizeAndState(0, 0, 0), objArr2);
                            sb.append(((java.lang.String) objArr2[0]).intern());
                            sb.append(e.getMessage());
                            throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(sb.toString());
                        }
                    } catch (util.h.xy.da.b e2) {
                        e2.getMessage();
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                        try {
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighSpeedVideoSizes((android.view.ViewConfiguration.getPressedStateDuration() >> 16) - 924962635, (short) ((android.view.ViewConfiguration.getTouchSlop() >> 8) + 86), (byte) (38 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16)), 7 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), 1630998865 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr3);
                            sb2.append(((java.lang.String) objArr3[0]).intern());
                            sb2.append(e2.getMessage());
                            throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(sb2.toString());
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                } catch (java.lang.Throwable th2) {
                    try {
                        Camera2StreamConfigurationMap();
                        throw th2;
                    } catch (util.h.xy.da.b e3) {
                        e3.getMessage();
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor((byte) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 116), "\u0006\u0005\u0004\u0018\u0001\f\u0015\u0019\u0016\f\u0007\u0013\u0012\n\u0018\u0004\u0013\u0018\u001f\u0010\u0005\u001c\u000b\u0018\f\u0013\u001f\u0013\n\u0007\u0018\u0004\u001c#\u0007\u0013\u0001\u000f\u000e\f\"\n\u0007\u0013㘛", 46 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr4);
                        sb3.append(((java.lang.String) objArr4[0]).intern());
                        sb3.append(e3.getMessage());
                        throw new com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException(sb3.toString());
                    }
                }
            } catch (java.lang.Throwable th3) {
                throw th3;
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m25215() throws com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException {
        byte[] highSpeedVideoFpsRanges;
        synchronized (this) {
            getOutputMinFrameDuration = (getOutputFormats + 93) % 128;
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) - 924962521, (short) ((android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26), (byte) ((android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1), android.view.View.combineMeasuredStates(0, 0) - 22, android.graphics.Color.red(0) + 1630998896, objArr);
            highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(((java.lang.String) objArr[0]).intern(), true, util.h.xy.bh.ra.m25484().m25485());
            int i = getOutputFormats + 69;
            getOutputMinFrameDuration = i % 128;
            if (i % 2 == 0) {
                throw null;
            }
        }
        return highSpeedVideoFpsRanges;
    }

    static void getHighSpeedVideoFpsRangesFor() {
        getHighSpeedVideoSizesFor = new char[]{41902, 41913, 41914, 41958, 41912, 41901, 41896, 41862, 41880, 41871, 41893, 41881, 41900, 41980, 41919, 41876, 41904, 41887, 41909, 41899, 41879, 41905, 41903, 41966, 41970, 41906, 41859, 41908, 41907, 41917, 41892, 41897, 41898, 41910, 41915, 41882};
        getOutputStallDurationlomOqCM = (char) 38464;
        getHighSpeedVideoFpsRanges = -796866561;
        getHighSpeedVideoFpsRangesFor = -408872963;
        getHighResolutionOutputSizeshNQ4ISI = 2036988204;
        getOutputSizes = new byte[]{9, 0, 56, 82, 8, -100, 37, 42, -17, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 82, -105, com.google.common.base.Ascii.SI, -26, 10, -110, 40, -38, 80, -112, com.google.common.base.Ascii.FF, -100, 9, 6, -101, 7, -102, 123, 82, -112, 10, 8, -104, 126, -89, 10, -108, 9, 36, 44, 35, 59, 85, 43, com.google.common.base.Ascii.US, -8, -51, 2, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, 85, 10, 34, 57, 45, com.google.common.base.Ascii.NAK, -53, -35, 93, 10, com.google.common.base.Ascii.ETB, -40, -30, 73, 7, kotlin.io.encoding.Base64.padSymbol, com.google.common.base.Ascii.ETB, -32, 83, 19, 47, 43, 47, 57, -39, 9, -30, 85, 19, 45, 43, com.google.common.base.Ascii.ESC, -15, 122, 45, com.google.common.base.Ascii.ETB, 44, -57, -115, -123, -69, com.google.common.base.Ascii.DC4, -114, -38, -31, -20, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -77, com.google.common.base.Ascii.DC4, -33, -105, 32, -116, -44, -18, -100, com.google.common.base.Ascii.ESC, -118, 70, 16, 34, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -46, 73, com.google.common.base.Ascii.SYN, -42, -118, -40, -116, -44, -114, 124, com.google.common.base.Ascii.DC4, -42, -116, -114, -34, 120, 111, -116, -46, -115, -30, -8, -63, -23, 83, -7, 13, 36, -37, com.google.common.base.Ascii.RS, -14, 83, com.google.common.base.Ascii.SYN, -2, 103, -5, 19, -39, -53, 74, -3, -127, 87, 101, -21, com.google.common.base.Ascii.NAK, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, 81, 17, -3, com.google.common.base.Ascii.SI, -5, 19, -7, -85, 83, 17, -5, -7, 9, -81, -90, -5, com.google.common.base.Ascii.NAK, -8, 37, -67, -44, -86, com.google.common.base.Ascii.RS, 71, 76, 1, -75, -44, 9, -95, 56, -84, com.google.common.base.Ascii.DC4, 74, 92, -35, -82, -30, -56, 6, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, com.google.common.base.Ascii.SYN, -17, -46, 18, -82, 16, -84, com.google.common.base.Ascii.DC4, -86, -4, -44, 18, -84, -86, com.google.common.base.Ascii.SUB, com.visa.cbp.getEncExpo.onUnminimized, -7, -84, com.google.common.base.Ascii.SYN, -85, 70, 57, -97, 9, -91, 108, com.visa.cbp.getEncExpo.IResultReceiver, -78, 62, -97, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, 18, -85, com.google.common.base.Ascii.ETB, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 105, 103, -26, com.google.common.base.Ascii.NAK, -63, -101, -83, 7, 93, -44, -111, 81, com.google.common.base.Ascii.NAK, -93, com.google.common.base.Ascii.ETB, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 9, -57, -97, 81, com.google.common.base.Ascii.ETB, 9, 89, -61, -22, com.google.common.base.Ascii.ETB, 93, 8, 109, 63, 56, 19, 84, 117, 60, 107, 1, com.google.common.base.Ascii.EM, 3, 107, com.google.common.base.Ascii.SI, -48, 83, com.visa.cbp.getEncExpo.IResultReceiver2, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.DC4, 82, com.visa.cbp.getEncExpo.IResultReceiver, 59, 59, 108, 7, 107, -58, -2, -56, 111, -59, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, -102, -25, -58, 36, com.visa.cbp.getEncExpo.startTransaction, 111, 44, -60, -37, -57, 47, -27, -9, 104, -63, -67, 107, -39, -41, 41, -126, 109, 45, -63, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -57, 47, -59, -105, 111, 45, -57, -59, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -109, com.google.common.base.Ascii.FS, -57, 41, -58, com.visa.cbp.getEncExpo.registerForActivityResult, 62, 41, -38, com.google.common.base.Ascii.ETB, 1, 46, -35, 100, 40, 10, 40, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, kotlin.io.encoding.Base64.padSymbol, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -40, -40, -40, -40, -40, -40, -40, -40, -40};
    }
}
