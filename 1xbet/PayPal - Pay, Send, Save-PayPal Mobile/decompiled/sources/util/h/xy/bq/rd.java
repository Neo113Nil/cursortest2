package util.h.xy.bq;

/* loaded from: classes18.dex */
public class rd extends util.h.xy.bq.a {
    private static int Camera2StreamConfigurationMap = 0;
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static char getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static char[] getHighSpeedVideoSizesFor;
    private static int getOutputMinFrameDuration;
    private boolean getInputSizeshNQ4ISI;
    private util.h.xy.ap.ma getOutputFormats;

    static /* synthetic */ void Camera2StreamConfigurationMap(util.h.xy.bq.rd rdVar) {
        int i = (getOutputMinFrameDuration + 91) % 128;
        getHighSpeedVideoSizes = i;
        getOutputMinFrameDuration = (i + 105) % 128;
        try {
            util.h.xy.m.mb.m26975(util.h.xy.ag.a.m24556().m24558()).mo26173();
            rdVar.m25590(true);
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            e.getMessage();
        }
        int i2 = getHighSpeedVideoSizes;
        getOutputMinFrameDuration = (i2 + 125) % 128;
        int i3 = i2 + 65;
        getOutputMinFrameDuration = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ void Camera2StreamConfigurationMap(util.h.xy.bq.rd rdVar, final java.lang.String str) {
        int i = getHighSpeedVideoSizes + 91;
        getOutputMinFrameDuration = i % 128;
        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bq.rd.4
            private static int getHighSpeedVideoFpsRanges = 0;
            private static int getHighSpeedVideoFpsRangesFor = 1;
            private static int getHighSpeedVideoSizes = 1;
            private static int getInputSizeshNQ4ISI = -1231763801;
            private static int getOutputMinFrameDuration;

            private static void getHighSpeedVideoFpsRanges(java.lang.String str2, int i2, int i3, int i4, java.lang.Object[] objArr) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 27) % 128;
                char[] charArray = str2.toCharArray();
                util.h.xz.b.ra raVar = new util.h.xz.b.ra();
                char[] cArr = new char[i2];
                raVar.f2649 = 0;
                while (raVar.f2649 < i2) {
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 43) % 128;
                    raVar.f2650 = charArray[raVar.f2649];
                    cArr[raVar.f2649] = (char) (raVar.f2650 + i4);
                    int i5 = raVar.f2649;
                    cArr[i5] = (char) (cArr[i5] - ((int) (getInputSizeshNQ4ISI ^ (-4839292868003314026L))));
                    raVar.f2649++;
                }
                if (i3 > 0) {
                    raVar.f2648 = i3;
                    char[] cArr2 = new char[i2];
                    java.lang.System.arraycopy(cArr, 0, cArr2, 0, i2);
                    java.lang.System.arraycopy(cArr2, 0, cArr, i2 - raVar.f2648, raVar.f2648);
                    java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i2 - raVar.f2648);
                    getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 75) % 128;
                }
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 107) % 128;
                char[] cArr3 = new char[i2];
                raVar.f2649 = 0;
                while (raVar.f2649 < i2) {
                    cArr3[raVar.f2649] = cArr[(i2 - raVar.f2649) - 1];
                    raVar.f2649++;
                }
                java.lang.String str3 = new java.lang.String(cArr3);
                int i6 = getHighSpeedVideoFpsRangesFor + 67;
                getHighSpeedVideoFpsRanges = i6 % 128;
                if (i6 % 2 != 0) {
                    throw null;
                }
                objArr[0] = str3;
            }

            @Override // java.lang.Runnable
            public final void run() {
                com.gemalto.mfs.mwsdk.payment.engine.QRCodePaymentServiceListener qRCodePaymentServiceListener;
                int i2;
                int green;
                int i3;
                try {
                } catch (java.lang.Throwable th) {
                    util.h.xy.bq.rd.getOutputMinFrameDuration();
                    th.getMessage();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("\uffff\u0006\u0002\ufff9", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3, android.graphics.Color.red(0) + 3, 123 - android.view.View.resolveSizeAndState(0, 0, 0), objArr);
                    java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("￦\u000b\b\u000f��\u0007￦\u0004\u000b\b", 11 - android.view.View.MeasureSpec.getMode(0), 4 - android.view.View.getDefaultSize(0, 0), 121 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr2);
                    util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                }
                if (util.h.xy.bq.rd.this.f992 == com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
                    util.h.xy.bf.ma.m25415((com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener) util.h.xy.bq.rd.this.getPaymentServiceListener(), com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.INTERNAL_ERROR, str);
                    return;
                }
                if (util.h.xy.bq.rd.this.f992 != com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) {
                    com.gemalto.mfs.mwsdk.payment.engine.RemotePaymentServiceListener remotePaymentServiceListener = (com.gemalto.mfs.mwsdk.payment.engine.RemotePaymentServiceListener) util.h.xy.bq.rd.this.getPaymentServiceListener();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("\uffff\u0006\u0002\ufff9", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 3, 4 - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, objArr3);
                    java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                    float length = android.graphics.PointF.length(0.0f, 0.0f);
                    try {
                        int intValue = ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue();
                        int i4 = getHighSpeedVideoSizes + 61;
                        getOutputMinFrameDuration = i4 % 128;
                        if (i4 % 2 != 0) {
                            int i5 = 3 / 5;
                        }
                        try {
                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges("￦\u0004\u000b\b￦\u000b\b\u000f�\u0007￼", 11 - (length > 0.0f ? 1 : (length == 0.0f ? 0 : -1)), 8 - (intValue >> 22), 122 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr4);
                            util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
                            if (remotePaymentServiceListener != null) {
                                remotePaymentServiceListener.onError(util.h.xy.bf.mc.m25434(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.INTERNAL_ERROR, str));
                                return;
                            } else {
                                util.h.xy.bq.rd.getOutputMinFrameDuration();
                                return;
                            }
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause = th2.getCause();
                            if (cause == null) {
                                throw th2;
                            }
                            throw cause;
                        }
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause2 = th3.getCause();
                        if (cause2 == null) {
                            throw th3;
                        }
                        throw cause2;
                    }
                }
                int i6 = getOutputMinFrameDuration + 69;
                getHighSpeedVideoSizes = i6 % 128;
                if (i6 % 2 == 0) {
                    qRCodePaymentServiceListener = (com.gemalto.mfs.mwsdk.payment.engine.QRCodePaymentServiceListener) util.h.xy.bq.rd.this.getPaymentServiceListener();
                    i2 = 3 - (android.media.AudioTrack.getMinVolume() > 2.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 2.0f ? 0 : -1));
                    green = 2 / android.graphics.Color.green(1);
                    i3 = 127;
                } else {
                    qRCodePaymentServiceListener = (com.gemalto.mfs.mwsdk.payment.engine.QRCodePaymentServiceListener) util.h.xy.bq.rd.this.getPaymentServiceListener();
                    i2 = (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 4;
                    green = android.graphics.Color.green(0) + 3;
                    i3 = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE;
                }
                try {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("\uffff\u0006\u0002\ufff9", i2, green, i3 - (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)), objArr5);
                    java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("\u0007\u000e￼\u0006\b￥\u0003\n\u0007￥\n", 10 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), 2 - android.view.View.combineMeasuredStates(0, 0), 122 - android.view.KeyEvent.getDeadChar(0, 0), objArr6);
                    util.h.xy.am.ma.m25027(intern3, ((java.lang.String) objArr6[0]).intern());
                    if (qRCodePaymentServiceListener != null) {
                        qRCodePaymentServiceListener.onError(util.h.xy.bf.mc.m25434(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.INTERNAL_ERROR, str));
                        getOutputMinFrameDuration = (getHighSpeedVideoSizes + 97) % 128;
                        return;
                    } else {
                        util.h.xy.bq.rd.getOutputMinFrameDuration();
                        return;
                    }
                } catch (java.lang.Throwable th4) {
                    java.lang.Throwable cause3 = th4.getCause();
                    if (cause3 == null) {
                        throw th4;
                    }
                    throw cause3;
                }
                util.h.xy.bq.rd.getOutputMinFrameDuration();
                th.getMessage();
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\uffff\u0006\u0002\ufff9", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 3, android.graphics.Color.red(0) + 3, 123 - android.view.View.resolveSizeAndState(0, 0, 0), objArr7);
                java.lang.String intern4 = ((java.lang.String) objArr7[0]).intern();
                java.lang.Object[] objArr22 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("￦\u000b\b\u000f��\u0007￦\u0004\u000b\b", 11 - android.view.View.MeasureSpec.getMode(0), 4 - android.view.View.getDefaultSize(0, 0), 121 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr22);
                util.h.xy.am.ma.m25027(intern4, ((java.lang.String) objArr22[0]).intern());
            }
        });
        int i2 = getHighSpeedVideoSizes + 99;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    static /* synthetic */ boolean getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bq.rd rdVar) {
        int i = getOutputMinFrameDuration + 99;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        boolean z = rdVar.getInputSizeshNQ4ISI;
        if (i % 2 == 0) {
            throw null;
        }
        getOutputMinFrameDuration = (i2 + 49) % 128;
        return z;
    }

    static /* synthetic */ util.h.xy.ap.ma getHighSpeedVideoFpsRanges(util.h.xy.bq.rd rdVar) {
        int i = getHighSpeedVideoSizes + 45;
        getOutputMinFrameDuration = i % 128;
        util.h.xy.ap.ma maVar = rdVar.getOutputFormats;
        if (i % 2 == 0) {
            return maVar;
        }
        throw null;
    }

    static /* synthetic */ void getHighSpeedVideoFpsRanges(util.h.xy.bq.rd rdVar, final com.gemalto.mfs.mwsdk.sdkconfig.SDKError sDKError) {
        int i = getOutputMinFrameDuration + 101;
        getHighSpeedVideoSizes = i % 128;
        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bq.rd.1
            private static short[] Camera2StreamConfigurationMap = null;
            private static int getHighSpeedVideoFpsRanges = 1;
            private static int getHighSpeedVideoFpsRangesFor = 0;
            private static int getHighSpeedVideoSizesFor = -393021568;
            private static int getInputFormats = 0;
            private static byte[] getInputSizeshNQ4ISI = {108, -25, com.google.common.base.Ascii.DC4, -23, 100, -38, 39, 40, 62, -54, -47, 43, 10, -13, 43, -47, 101, 36, -42, 43, 36, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -58, -35, 39, 6, -1, 39, -35};
            private static int getOutputFormats = -408873080;
            private static int getOutputMinFrameDuration = -919475136;
            private static int getOutputMinFrameDurationlomOqCM = 1;

            /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            private static void getHighSpeedVideoFpsRanges(int i2, short s, byte b, int i3, int i4, java.lang.Object[] objArr) {
                int i5;
                boolean z;
                util.h.xz.b.me meVar = new util.h.xz.b.me();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                int i6 = i3 + ((int) (getOutputFormats ^ (-2689713159175858216L)));
                if (i6 == -1) {
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 15) % 128;
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                if (i5 != 0) {
                    byte[] bArr = getInputSizeshNQ4ISI;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        for (int i7 = 0; i7 < length; i7++) {
                            bArr2[i7] = (byte) (bArr[i7] ^ (-2689713159175858216L));
                        }
                        bArr = bArr2;
                    }
                    if (bArr == null) {
                        i6 = (short) (((short) (Camera2StreamConfigurationMap[((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))) + i2] ^ (-2689713159175858216L))) + ((int) (getOutputFormats ^ (-2689713159175858216L))));
                    } else {
                        int i8 = getHighSpeedVideoFpsRanges + 125;
                        getHighSpeedVideoFpsRangesFor = i8 % 128;
                        i6 = (byte) (i8 % 2 != 0 ? ((byte) (getInputSizeshNQ4ISI[i2 << ((int) (getHighSpeedVideoSizesFor - 2689713159175858216L))] / (-2689713159175858216L))) >>> ((int) (getOutputFormats | (-2689713159175858216L))) : ((byte) (getInputSizeshNQ4ISI[((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))) + i2] ^ (-2689713159175858216L))) + ((int) (getOutputFormats ^ (-2689713159175858216L))));
                    }
                }
                if (i6 > 0) {
                    meVar.f2647 = ((i2 + i6) - 2) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))) + i5;
                    meVar.f2644 = (char) (i4 + ((int) (getOutputMinFrameDuration ^ (-2689713159175858216L))));
                    sb.append(meVar.f2644);
                    meVar.f2646 = meVar.f2644;
                    byte[] bArr3 = getInputSizeshNQ4ISI;
                    if (bArr3 != null) {
                        int length2 = bArr3.length;
                        byte[] bArr4 = new byte[length2];
                        for (int i9 = 0; i9 < length2; i9++) {
                            bArr4[i9] = (byte) (bArr3[i9] ^ (-2689713159175858216L));
                        }
                        bArr3 = bArr4;
                    }
                    if (bArr3 != null) {
                        int i10 = getHighSpeedVideoFpsRangesFor + 89;
                        getHighSpeedVideoFpsRanges = i10 % 128;
                        if (i10 % 2 != 0) {
                            z = true;
                            meVar.f2645 = 1;
                            while (meVar.f2645 < i6) {
                                if (z) {
                                    byte[] bArr5 = getInputSizeshNQ4ISI;
                                    meVar.f2647 = meVar.f2647 - 1;
                                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                                } else {
                                    short[] sArr = Camera2StreamConfigurationMap;
                                    meVar.f2647 = meVar.f2647 - 1;
                                    meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                                }
                                sb.append(meVar.f2644);
                                meVar.f2646 = meVar.f2644;
                                meVar.f2645++;
                            }
                        }
                    }
                    z = false;
                    meVar.f2645 = 1;
                    while (meVar.f2645 < i6) {
                    }
                }
                objArr[0] = sb.toString();
            }

            @Override // java.lang.Runnable
            public final void run() {
                try {
                    com.gemalto.mfs.mwsdk.payment.engine.RemotePaymentServiceListener remotePaymentServiceListener = (com.gemalto.mfs.mwsdk.payment.engine.RemotePaymentServiceListener) util.h.xy.bq.rd.this.getPaymentServiceListener();
                    getOutputMinFrameDurationlomOqCM = (getInputFormats + 95) % 128;
                    try {
                        long longValue = ((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue();
                        getOutputMinFrameDurationlomOqCM = (getInputFormats + 35) % 128;
                        try {
                            java.lang.Object[] objArr = new java.lang.Object[1];
                            getHighSpeedVideoFpsRanges((-255058007) - (longValue > 0L ? 1 : (longValue == 0L ? 0 : -1)), (short) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), (byte) ((android.view.ViewConfiguration.getScrollBarSize() >> 8) + 53), (-81) - android.view.Gravity.getAbsoluteGravity(0, 0), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 781253451, objArr);
                            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                            try {
                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                getHighSpeedVideoFpsRanges((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) - 255058004, (short) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) ((android.view.ViewConfiguration.getPressedStateDuration() >> 16) - 16), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 82, (-781253440) - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
                                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                                if (remotePaymentServiceListener == null) {
                                    util.h.xy.bq.rd.getOutputMinFrameDuration();
                                } else {
                                    getInputFormats = (getOutputMinFrameDurationlomOqCM + 47) % 128;
                                    remotePaymentServiceListener.onError(sDKError);
                                }
                            } catch (java.lang.Throwable th) {
                                java.lang.Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } catch (java.lang.Throwable th2) {
                            java.lang.Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (java.lang.Throwable th3) {
                        java.lang.Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } catch (java.lang.Throwable th4) {
                    util.h.xy.bq.rd.getOutputMinFrameDuration();
                    th4.getMessage();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((-255058008) - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) (android.graphics.ImageFormat.getBitsPerPixel(0) + 1), (byte) ((android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 53), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 80, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 781253452, objArr3);
                    java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges((-255057992) - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), (short) ((android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (byte) ((-3) - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (android.view.ViewConfiguration.getTouchSlop() >> 8) - 81, (-781253440) - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr4);
                    util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
                }
            }
        });
        int i2 = getHighSpeedVideoSizes;
        int i3 = i2 + 37;
        getOutputMinFrameDuration = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (i % 2 == 0) {
            throw null;
        }
        int i4 = i2 + 93;
        getOutputMinFrameDuration = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static /* synthetic */ boolean getHighSpeedVideoFpsRanges(util.h.xy.bq.rd rdVar, boolean z) {
        int i = getHighSpeedVideoSizes + 15;
        int i2 = i % 128;
        getOutputMinFrameDuration = i2;
        rdVar.getInputSizeshNQ4ISI = z;
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        getHighSpeedVideoSizes = (i2 + 91) % 128;
        return z;
    }

    static /* synthetic */ void getHighSpeedVideoSizes(util.h.xy.bq.rd rdVar, final com.gemalto.mfs.mwsdk.sdkconfig.SDKError sDKError) {
        getHighSpeedVideoSizes = (getOutputMinFrameDuration + 105) % 128;
        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bq.rd.2
            private static int Camera2StreamConfigurationMap = 0;
            private static char getHighResolutionOutputSizeshNQ4ISI = 61306;
            private static int getHighSpeedVideoFpsRangesFor = 1;
            private static char getHighSpeedVideoSizesFor = 61605;
            private static int getInputFormats = 0;
            private static int getInputSizeshNQ4ISI = 1;
            private static char getOutputFormats = 29874;
            private static char getOutputMinFrameDuration = 43687;

            private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
                char[] charArray = str.toCharArray();
                util.h.xz.b.e eVar = new util.h.xz.b.e();
                char[] cArr = new char[charArray.length];
                eVar.f2630 = 0;
                char[] cArr2 = new char[2];
                while (eVar.f2630 < charArray.length) {
                    cArr2[0] = charArray[eVar.f2630];
                    cArr2[1] = charArray[eVar.f2630 + 1];
                    int i2 = getHighSpeedVideoFpsRangesFor + 37;
                    Camera2StreamConfigurationMap = i2 % 128;
                    int i3 = i2 % 2;
                    int i4 = 58224;
                    int i5 = 0;
                    while (i5 < 16) {
                        int i6 = getHighSpeedVideoFpsRangesFor;
                        Camera2StreamConfigurationMap = (i6 + 59) % 128;
                        char c = cArr2[1];
                        char c2 = cArr2[0];
                        char c3 = (char) (c - (((c2 + i4) ^ ((c2 << 4) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getHighResolutionOutputSizeshNQ4ISI ^ 3155153533016530592L)))));
                        cArr2[1] = c3;
                        cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L))) ^ (c3 + i4)) ^ ((c3 >>> 5) + ((char) (getOutputFormats ^ 3155153533016530592L)))));
                        i4 -= 40503;
                        i5++;
                        Camera2StreamConfigurationMap = (i6 + 109) % 128;
                    }
                    cArr[eVar.f2630] = cArr2[0];
                    cArr[eVar.f2630 + 1] = cArr2[1];
                    eVar.f2630 += 2;
                }
                objArr[0] = new java.lang.String(cArr, 0, i);
            }

            @Override // java.lang.Runnable
            public final void run() {
                getInputSizeshNQ4ISI = (getInputFormats + 71) % 128;
                try {
                    com.gemalto.mfs.mwsdk.payment.engine.QRCodePaymentServiceListener qRCodePaymentServiceListener = (com.gemalto.mfs.mwsdk.payment.engine.QRCodePaymentServiceListener) util.h.xy.bq.rd.this.getPaymentServiceListener();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("왇诖〞飹", 3 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr);
                    java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("ច콼䚑ﺢᆆ\ue3fb電ㄮ驍＾ᴜಷ", 11 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), objArr2);
                    util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                    if (qRCodePaymentServiceListener == null) {
                        util.h.xy.bq.rd.getOutputMinFrameDuration();
                    } else {
                        getInputSizeshNQ4ISI = (getInputFormats + 89) % 128;
                        qRCodePaymentServiceListener.onError(sDKError);
                    }
                } catch (java.lang.Throwable th) {
                    util.h.xy.bq.rd.getOutputMinFrameDuration();
                    th.getMessage();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("왇诖〞飹", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 5, objArr3);
                    java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("ច콼䚑ﺢᆆ\ue3fb電ㄮ驍＾ᴜಷ컉䢷", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 13, objArr4);
                    util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
                }
            }
        });
        int i = getHighSpeedVideoSizes;
        int i2 = i + 75;
        getOutputMinFrameDuration = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        getOutputMinFrameDuration = (i + 73) % 128;
    }

    static /* synthetic */ java.lang.String getOutputMinFrameDuration() {
        int i = getOutputMinFrameDuration;
        getHighSpeedVideoSizes = (i + 21) % 128;
        java.lang.String str = getHighResolutionOutputSizeshNQ4ISI;
        int i2 = i + 17;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0) {
            return str;
        }
        throw null;
    }

    static {
        getHighSpeedVideoSizes();
        getHighResolutionOutputSizeshNQ4ISI = util.h.xy.bq.rd.class.getName();
        int i = getHighSpeedVideoSizes + 91;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    public rd(com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener, util.h.xy.bw.mb mbVar, boolean z) {
        super(paymentServiceListener, mbVar, z);
        this.getInputSizeshNQ4ISI = false;
        this.f990 = com.gemalto.mfs.mwsdk.payment.chverification.CHVerificationManager.INSTANCE.getCVMethod().getResult();
    }

    @Override // util.h.xy.bq.b
    /* renamed from: ˎ */
    public boolean mo25562(com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType, util.h.xy.d.md mdVar) {
        int i = getOutputMinFrameDuration + 73;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            this.f993 = mdVar;
            return super.mo25562(paymentType, mdVar);
        }
        this.f993 = mdVar;
        super.mo25562(paymentType, mdVar);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if (r2.f992 == com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r2.f992 == com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        m25551();
        m25548();
        r0 = util.h.xy.bq.rd.getOutputMinFrameDuration + 65;
        util.h.xy.bq.rd.getHighSpeedVideoSizes = r0 % 128;
        r0 = r0 % 2;
     */
    @Override // util.h.xy.bq.a
    /* renamed from: ˊ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo25547() {
        int i = getOutputMinFrameDuration + 99;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            this.getInputSizeshNQ4ISI = true;
        } else {
            this.getInputSizeshNQ4ISI = true;
        }
        util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bq.rd.3
            private static int getHighResolutionOutputSizeshNQ4ISI = 1;
            private static int getHighSpeedVideoFpsRanges = 0;
            private static int getHighSpeedVideoFpsRangesFor = 1;
            private static int getHighSpeedVideoSizes;
            private static char[] getInputSizeshNQ4ISI = {42363, 42259, 42257, 42267, 42356, 42260, 42261, 42339, 42336, 42258, 42252, 42338, 42269, 42252, 42254, 42358, 42254, 42252, 42269, 42338, 42252, 42258, 42336, 42339, 42261, 42260, 42262};

            @Override // java.lang.Runnable
            public final void run() {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 11) % 128;
                try {
                    util.h.xy.bq.rd.getOutputMinFrameDuration();
                    util.h.xy.bq.rd.getOutputMinFrameDuration();
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes(false, new int[]{0, 4, 0, 0}, "\u0000\u0000\u0001\u0000", objArr);
                    java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(true, new int[]{4, 11, 0, 0}, "\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001", objArr2);
                    util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
                    util.h.xy.f.b.f2201.m26746();
                    com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener = util.h.xy.bq.rd.this.getPaymentServiceListener();
                    util.h.xy.bq.rd rdVar = util.h.xy.bq.rd.this;
                    paymentServiceListener.onAuthenticationRequired(rdVar, rdVar.f990, util.h.xy.bq.a.f987);
                    getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 61) % 128;
                } catch (java.lang.Throwable th) {
                    util.h.xy.bq.rd.getOutputMinFrameDuration();
                    th.getMessage();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(false, new int[]{0, 4, 0, 0}, "\u0000\u0000\u0001\u0000", objArr3);
                    java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(false, new int[]{15, 12, 0, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001", objArr4);
                    util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
                }
            }

            private static void getHighSpeedVideoSizes(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                byte[] bytes = str.getBytes("ISO-8859-1");
                util.h.xz.b.ma maVar = new util.h.xz.b.ma();
                int i2 = iArr[0];
                int i3 = iArr[1];
                int i4 = iArr[2];
                int i5 = iArr[3];
                char[] cArr = getInputSizeshNQ4ISI;
                if (cArr != null) {
                    int length = cArr.length;
                    char[] cArr2 = new char[length];
                    for (int i6 = 0; i6 < length; i6++) {
                        cArr2[i6] = (char) (cArr[i6] ^ (-8125198844289309347L));
                    }
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 59) % 128;
                    cArr = cArr2;
                }
                char[] cArr3 = new char[i3];
                java.lang.System.arraycopy(cArr, i2, cArr3, 0, i3);
                if (bytes != null) {
                    char[] cArr4 = new char[i3];
                    maVar.f2631 = 0;
                    char c = 0;
                    while (maVar.f2631 < i3) {
                        int i7 = getHighResolutionOutputSizeshNQ4ISI + 21;
                        getHighSpeedVideoSizes = i7 % 128;
                        if (i7 % 2 == 0 ? bytes[maVar.f2631] != 1 : bytes[maVar.f2631] != 1) {
                            cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                        } else {
                            cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                        }
                        c = cArr4[maVar.f2631];
                        maVar.f2631++;
                    }
                    cArr3 = cArr4;
                }
                if (i5 > 0) {
                    char[] cArr5 = new char[i3];
                    java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i3);
                    int i8 = i3 - i5;
                    java.lang.System.arraycopy(cArr5, 0, cArr3, i8, i5);
                    java.lang.System.arraycopy(cArr5, i5, cArr3, 0, i8);
                }
                if (z) {
                    getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 15) % 128;
                    char[] cArr6 = new char[i3];
                    maVar.f2631 = 0;
                    while (maVar.f2631 < i3) {
                        cArr6[maVar.f2631] = cArr3[(i3 - maVar.f2631) - 1];
                        maVar.f2631++;
                        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 35) % 128;
                    }
                    cArr3 = cArr6;
                }
                if (i4 > 0) {
                    maVar.f2631 = 0;
                    int i9 = getHighResolutionOutputSizeshNQ4ISI + 5;
                    getHighSpeedVideoSizes = i9 % 128;
                    if (i9 % 2 != 0) {
                        int i10 = 3 / 3;
                    }
                    while (maVar.f2631 < i3) {
                        cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                        maVar.f2631++;
                    }
                }
                objArr[0] = new java.lang.String(cArr3);
            }
        });
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.payment.engine.TransactionContext m25590(boolean z) {
        com.gemalto.mfs.mwsdk.payment.engine.TransactionContext mo25546;
        synchronized (this) {
            getOutputMinFrameDuration = (getHighSpeedVideoSizes + 119) % 128;
            mo25546 = mo25546(z, false);
            getOutputMinFrameDuration = (getHighSpeedVideoSizes + 11) % 128;
        }
        return mo25546;
    }

    @Override // util.h.xy.bq.a, util.h.xy.bq.b
    /* renamed from: ˊ */
    public final com.gemalto.mfs.mwsdk.payment.engine.TransactionContext mo25546(boolean z, boolean z2) {
        com.gemalto.mfs.mwsdk.payment.engine.TransactionContext mo25546;
        synchronized (this) {
            int i = getOutputMinFrameDuration + 81;
            getHighSpeedVideoSizes = i % 128;
            if (i % 2 == 0) {
                util.h.xy.bf.mb.f938.m25426();
                throw new java.lang.ArithmeticException();
            }
            if (util.h.xy.bf.mb.f938.m25426() == null) {
                mo25546 = super.mo25546(z, z2);
            } else if (util.h.xy.bf.mb.f938.m25426().m25393()) {
                getHighSpeedVideoSizes = (getOutputMinFrameDuration + 31) % 128;
                mo25546 = super.mo25546(z, z2);
                util.h.xy.bf.mb.f938.m25426().m25390(false);
                getOutputMinFrameDuration = (getHighSpeedVideoSizes + 67) % 128;
            } else {
                mo25546 = super.mo25546(false, z2);
            }
        }
        return mo25546;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(byte b, java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        char[] charArray = str.toCharArray();
        util.h.xz.b.mc mcVar = new util.h.xz.b.mc();
        char[] cArr = getHighSpeedVideoSizesFor;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                cArr2[i3] = (char) (cArr[i3] ^ 4042185467053315654L);
            }
            cArr = cArr2;
        }
        char c = (char) (4042185467053315654L ^ getHighSpeedVideoFpsRangesFor);
        char[] cArr3 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr3[i2] = (char) (charArray[i2] - b);
            int i4 = Camera2StreamConfigurationMap + 119;
            getHighSpeedVideoFpsRanges = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 4 / 5;
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            mcVar.f2638 = 0;
            while (mcVar.f2638 < i2) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 117) % 128;
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
                        int i6 = mcVar.f2639;
                        int i7 = mcVar.f2640;
                        int i8 = mcVar.f2637;
                        int i9 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i6 * c) + i7];
                        cArr3[mcVar.f2638 + 1] = cArr[(i8 * c) + i9];
                    } else if (mcVar.f2639 == mcVar.f2637) {
                        mcVar.f2640 = ((mcVar.f2640 + c) - 1) % c;
                        mcVar.f2635 = ((mcVar.f2635 + c) - 1) % c;
                        int i10 = mcVar.f2639;
                        int i11 = mcVar.f2640;
                        int i12 = mcVar.f2637;
                        int i13 = mcVar.f2635;
                        cArr3[mcVar.f2638] = cArr[(i10 * c) + i11];
                        cArr3[mcVar.f2638 + 1] = cArr[(i12 * c) + i13];
                    } else {
                        int i14 = mcVar.f2639;
                        int i15 = mcVar.f2635;
                        int i16 = mcVar.f2637;
                        int i17 = mcVar.f2640;
                        cArr3[mcVar.f2638] = cArr[(i14 * c) + i15];
                        cArr3[mcVar.f2638 + 1] = cArr[(i16 * c) + i17];
                    }
                }
                mcVar.f2638 += 2;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr3[i18] = (char) (cArr3[i18] ^ 13722);
        }
        java.lang.String str2 = new java.lang.String(cArr3);
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 1) % 128;
        objArr[0] = str2;
    }

    @Override // util.h.xy.bq.a
    @util.h.xy.a.a
    final java.lang.Object Camera2StreamConfigurationMap(com.gemalto.mfs.mwsdk.payment.CHVerificationMethod cHVerificationMethod) {
        int i = getHighSpeedVideoSizes + 17;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            if (!this.getInputSizeshNQ4ISI) {
                com.gemalto.mfs.mwsdk.payment.PaymentServiceListener paymentServiceListener = getPaymentServiceListener();
                com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.OPERATION_NOT_ALLOWED;
                try {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI((byte) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 50), "\u0018\u0017\b\r\u0004\u0018\u0017\u0006\u0015\u0006\t\u0005\u0013\u0012\t\r\u0001\u0011\u0012\u0011\u0005\u0006\t\u0007\u0013\u0010\u0007\u0012\u0017\u0002\u0005\u0017\u0001\u000e\u0006\u0012\u0005\b\f\u000f㗦", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 40, objArr);
                    util.h.xy.bf.ma.m25415(paymentServiceListener, paymentServiceErrorCode, ((java.lang.String) objArr[0]).intern());
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
            com.gemalto.mfs.mwsdk.payment.PaymentBusinessManager.getPaymentBusinessService();
            util.h.xy.ap.ma maVar = (util.h.xy.ap.ma) new util.h.xy.bw.b().m25783(new util.h.xy.at.mb() { // from class: util.h.xy.bq.rd.5
                private static int[] getHighSpeedVideoFpsRanges = {1098442753, -236026931, -947932598, -586237706, 2012478780, 242405384, 997630228, -766099927, 347957520, -1390670620, -618462256, -1749368314, 744962551, 948355560, -1891648879, -1644920193, -896922878, 1119343288};
                private static int getHighSpeedVideoFpsRangesFor = 0;
                private static int getHighSpeedVideoSizes = 1;

                private static void Camera2StreamConfigurationMap(int[] iArr, int i2, java.lang.Object[] objArr2) {
                    int i3;
                    int length;
                    int[] iArr2;
                    int i4;
                    util.h.xz.b.c cVar = new util.h.xz.b.c();
                    char[] cArr = new char[4];
                    char[] cArr2 = new char[iArr.length * 2];
                    int[] iArr3 = getHighSpeedVideoFpsRanges;
                    if (iArr3 != null) {
                        int i5 = getHighSpeedVideoFpsRangesFor + 7;
                        getHighSpeedVideoSizes = i5 % 128;
                        if (i5 % 2 == 0) {
                            length = iArr3.length;
                            iArr2 = new int[length];
                            i4 = 1;
                        } else {
                            length = iArr3.length;
                            iArr2 = new int[length];
                            i4 = 0;
                        }
                        while (i4 < length) {
                            int i6 = getHighSpeedVideoSizes;
                            getHighSpeedVideoFpsRangesFor = (i6 + 67) % 128;
                            iArr2[i4] = (int) (iArr3[i4] ^ (-5569649899877129369L));
                            i4++;
                            getHighSpeedVideoFpsRangesFor = (i6 + 1) % 128;
                        }
                        iArr3 = iArr2;
                    }
                    int length2 = iArr3.length;
                    int[] iArr4 = new int[length2];
                    int[] iArr5 = getHighSpeedVideoFpsRanges;
                    if (iArr5 != null) {
                        int length3 = iArr5.length;
                        int[] iArr6 = new int[length3];
                        int i7 = 0;
                        while (i7 < length3) {
                            iArr6[i7] = (int) (iArr5[i7] ^ (-5569649899877129369L));
                            i7++;
                            length2 = length2;
                        }
                        i3 = length2;
                        iArr5 = iArr6;
                    } else {
                        i3 = length2;
                    }
                    java.lang.System.arraycopy(iArr5, 0, iArr4, 0, i3);
                    cVar.f2626 = 0;
                    while (cVar.f2626 < iArr.length) {
                        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 83) % 128;
                        cArr[0] = (char) (iArr[cVar.f2626] >> 16);
                        cArr[1] = (char) iArr[cVar.f2626];
                        cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
                        cArr[3] = (char) iArr[cVar.f2626 + 1];
                        cVar.f2627 = (cArr[0] << 16) + cArr[1];
                        cVar.f2625 = (cArr[2] << 16) + cArr[3];
                        util.h.xz.b.c.m27723(iArr4);
                        for (int i8 = 0; i8 < 16; i8++) {
                            cVar.f2627 ^= iArr4[i8];
                            cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                            int i9 = cVar.f2627;
                            cVar.f2627 = cVar.f2625;
                            cVar.f2625 = i9;
                        }
                        int i10 = cVar.f2627;
                        cVar.f2627 = cVar.f2625;
                        cVar.f2625 = i10;
                        cVar.f2625 ^= iArr4[16];
                        cVar.f2627 ^= iArr4[17];
                        int i11 = cVar.f2627;
                        int i12 = cVar.f2625;
                        cArr[0] = (char) (cVar.f2627 >>> 16);
                        cArr[1] = (char) cVar.f2627;
                        cArr[2] = (char) (cVar.f2625 >>> 16);
                        cArr[3] = (char) cVar.f2625;
                        util.h.xz.b.c.m27723(iArr4);
                        cArr2[cVar.f2626 * 2] = cArr[0];
                        cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
                        cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
                        cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
                        cVar.f2626 += 2;
                    }
                    objArr2[0] = new java.lang.String(cArr2, 0, i2);
                }

                @Override // util.h.xy.at.mb
                /* renamed from: ᐝ */
                public final void mo25118(byte[] bArr) {
                    if (bArr == null || bArr.length == 0) {
                        util.h.xy.bq.rd.getOutputMinFrameDuration();
                        return;
                    }
                    synchronized (util.h.xy.bq.rd.class) {
                        util.h.xy.bq.rd.getOutputMinFrameDuration();
                        if (util.h.xy.bq.rd.getHighResolutionOutputSizeshNQ4ISI(util.h.xy.bq.rd.this)) {
                            util.h.xy.bq.rd.getHighSpeedVideoFpsRanges(util.h.xy.bq.rd.this, false);
                            util.h.xy.bq.rd.this.f991 = true;
                            if (util.h.xy.f.b.f2201.m26765(bArr)) {
                                util.h.xy.bq.rd.this.m25563();
                                util.h.xy.bf.mb.f938.m25426().m25394(true);
                                util.h.xy.bf.mb.f938.m25426().m25400();
                                com.gemalto.mfs.mwsdk.dcm.PaymentType paymentType = util.h.xy.bq.rd.this.f992;
                                if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS) {
                                    util.h.xy.bq.rd rdVar = util.h.xy.bq.rd.this;
                                    rdVar.m25550(rdVar, util.h.xy.bq.a.f987);
                                    util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bq.rd.5.1
                                        private static int Camera2StreamConfigurationMap = 0;
                                        private static int getHighSpeedVideoFpsRanges = 0;
                                        private static int getHighSpeedVideoFpsRangesFor = 1;
                                        private static int getOutputMinFrameDuration = 1;
                                        private static char[] getHighResolutionOutputSizeshNQ4ISI = {64311, 64307, 64330, 64332, 64312, 64316, 64337, 64304, 64317, 64319, 64334};
                                        private static int getInputFormats = -1074857085;
                                        private static boolean getHighSpeedVideoSizesFor = true;
                                        private static boolean getOutputFormats = true;

                                        private static void getHighSpeedVideoFpsRanges(int i2, java.lang.String str, java.lang.Object[] objArr2) {
                                            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 105) % 128;
                                            byte[] bytes = str.getBytes("ISO-8859-1");
                                            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 61) % 128;
                                            byte[] bArr2 = bytes;
                                            util.h.xz.b.md mdVar = new util.h.xz.b.md();
                                            char[] cArr = getHighResolutionOutputSizeshNQ4ISI;
                                            if (cArr != null) {
                                                int length = cArr.length;
                                                char[] cArr2 = new char[length];
                                                for (int i3 = 0; i3 < length; i3++) {
                                                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 47) % 128;
                                                    cArr2[i3] = (char) (cArr[i3] ^ (-3299939579226817547L));
                                                }
                                                cArr = cArr2;
                                            }
                                            int i4 = (int) ((-3299939579226817547L) ^ getInputFormats);
                                            if (!getOutputFormats) {
                                                if (!getHighSpeedVideoSizesFor) {
                                                    throw null;
                                                }
                                                throw null;
                                            }
                                            getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 27) % 128;
                                            mdVar.f2642 = bArr2.length;
                                            char[] cArr3 = new char[mdVar.f2642];
                                            mdVar.f2643 = 0;
                                            while (mdVar.f2643 < mdVar.f2642) {
                                                cArr3[mdVar.f2643] = (char) (cArr[bArr2[(mdVar.f2642 - 1) - mdVar.f2643] + i2] - i4);
                                                mdVar.f2643++;
                                            }
                                            objArr2[0] = new java.lang.String(cArr3);
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            getHighSpeedVideoFpsRanges = (getOutputMinFrameDuration + 7) % 128;
                                            try {
                                                util.h.xy.bq.rd.getOutputMinFrameDuration();
                                                com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener contactlessPaymentServiceListener = (com.gemalto.mfs.mwsdk.payment.engine.ContactlessPaymentServiceListener) util.h.xy.bq.rd.this.getPaymentServiceListener();
                                                java.lang.Object[] objArr2 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRanges((android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 127, "\u0084\u0083\u0082\u0081", objArr2);
                                                java.lang.String intern = ((java.lang.String) objArr2[0]).intern();
                                                java.lang.Object[] objArr3 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRanges(127 - android.view.View.MeasureSpec.getMode(0), "\u008a\u0089\u0088\u0087\u0081\u0086\u0082\u0087\u0086\u0082\u0085", objArr3);
                                                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr3[0]).intern());
                                                if (contactlessPaymentServiceListener == null) {
                                                    util.h.xy.bq.rd.getOutputMinFrameDuration();
                                                } else {
                                                    getOutputMinFrameDuration = (getHighSpeedVideoFpsRanges + 1) % 128;
                                                    contactlessPaymentServiceListener.onReadyToTap(util.h.xy.bq.rd.this);
                                                }
                                            } catch (java.lang.Throwable th2) {
                                                util.h.xy.bq.rd.getOutputMinFrameDuration();
                                                th2.getMessage();
                                                java.lang.Object[] objArr4 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRanges(127 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0084\u0083\u0082\u0081", objArr4);
                                                java.lang.String intern2 = ((java.lang.String) objArr4[0]).intern();
                                                java.lang.Object[] objArr5 = new java.lang.Object[1];
                                                getHighSpeedVideoFpsRanges((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) + 127, "\u008b\u008a\u0089\u0088\u0087\u0081\u0086\u0082\u0087\u0086\u0082\u0085", objArr5);
                                                util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr5[0]).intern());
                                            }
                                        }
                                    });
                                } else if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.QR) {
                                    try {
                                        byte[] m25521 = util.h.xy.bo.a.m25521(util.h.xy.bu.c.f1051.m25648());
                                        int m24554 = util.h.xy.af.mb.m24551().m24554();
                                        if (m24554 != -91) {
                                            util.h.xy.bq.rd.getOutputMinFrameDuration();
                                            util.h.xy.bq.rd.getHighSpeedVideoSizes(util.h.xy.bq.rd.this, util.h.xy.bf.mc.m25432(m24554));
                                            util.h.xy.bu.b.f1050.m25641(99);
                                            return;
                                        }
                                        util.h.xy.bu.c.f1051.m25652();
                                        com.gemalto.mfs.mwsdk.payment.engine.qrcode.QRCodeData m25519 = util.h.xy.bo.a.m25519(m25521);
                                        if (m25519 == null) {
                                            util.h.xy.bq.rd.getOutputMinFrameDuration();
                                            util.h.xy.bq.rd rdVar2 = util.h.xy.bq.rd.this;
                                            com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode2 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.QR_CODE_OUTPUT_INVALID;
                                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                                            Camera2StreamConfigurationMap(new int[]{-45461902, 1752540686, 1822793170, 1730021440, 1627615724, -1086329913, 1181967017, 546803138, 1620517665, 1065371622, -1277371860, 44806627, 1406029075, 366568455}, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 24, objArr2);
                                            util.h.xy.bq.rd.getHighSpeedVideoSizes(rdVar2, util.h.xy.bf.mc.m25434(paymentServiceErrorCode2, ((java.lang.String) objArr2[0]).intern()));
                                            util.h.xy.bu.b.f1050.m25641(99);
                                        } else {
                                            util.h.xy.bq.rd.this.m25553(m25519);
                                            if (util.h.xy.bf.mb.f938.m25426() != null) {
                                                util.h.xy.bq.rd.getOutputMinFrameDuration();
                                                util.h.xy.bf.mb.f938.m25426().m25390(true);
                                            } else {
                                                util.h.xy.bq.rd.getOutputMinFrameDuration();
                                            }
                                            final com.gemalto.mfs.mwsdk.payment.engine.TransactionContext m25641 = util.h.xy.bu.b.f1050.m25641(100);
                                            util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bq.rd.5.5
                                                private static int Camera2StreamConfigurationMap = 0;
                                                private static int getHighResolutionOutputSizeshNQ4ISI = 0;
                                                private static int getHighSpeedVideoSizes = 1;
                                                private static long getHighSpeedVideoSizesFor = -6126517447700599790L;
                                                private static int getInputSizeshNQ4ISI = 1;

                                                private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i2, java.lang.Object[] objArr3) {
                                                    int i3;
                                                    int i4;
                                                    Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 75) % 128;
                                                    char[] charArray = str.toCharArray();
                                                    util.h.xz.b.d dVar = new util.h.xz.b.d();
                                                    dVar.f2628 = i2;
                                                    int length = charArray.length;
                                                    long[] jArr = new long[length];
                                                    dVar.f2629 = 0;
                                                    while (dVar.f2629 < charArray.length) {
                                                        int i5 = getHighSpeedVideoSizes + 113;
                                                        Camera2StreamConfigurationMap = i5 % 128;
                                                        if (i5 % 2 != 0) {
                                                            jArr[dVar.f2629] = (charArray[dVar.f2629] / (dVar.f2629 + dVar.f2628)) % ((-7508379876853140581L) & getHighSpeedVideoSizesFor);
                                                            i4 = dVar.f2629;
                                                        } else {
                                                            jArr[dVar.f2629] = ((-7508379876853140581L) ^ getHighSpeedVideoSizesFor) ^ (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628));
                                                            i4 = dVar.f2629 + 1;
                                                        }
                                                        dVar.f2629 = i4;
                                                    }
                                                    char[] cArr = new char[length];
                                                    dVar.f2629 = 0;
                                                    while (dVar.f2629 < charArray.length) {
                                                        int i6 = Camera2StreamConfigurationMap + 73;
                                                        getHighSpeedVideoSizes = i6 % 128;
                                                        if (i6 % 2 == 0) {
                                                            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                                                            i3 = dVar.f2629 % 1;
                                                        } else {
                                                            cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                                                            i3 = dVar.f2629 + 1;
                                                        }
                                                        dVar.f2629 = i3;
                                                    }
                                                    objArr3[0] = new java.lang.String(cArr);
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    getHighResolutionOutputSizeshNQ4ISI = (getInputSizeshNQ4ISI + 115) % 128;
                                                    try {
                                                        com.gemalto.mfs.mwsdk.payment.engine.QRCodePaymentServiceListener qRCodePaymentServiceListener = (com.gemalto.mfs.mwsdk.payment.engine.QRCodePaymentServiceListener) util.h.xy.bq.rd.this.getPaymentServiceListener();
                                                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                                                        getHighResolutionOutputSizeshNQ4ISI("鿅뫾햎\uf0af", 9512 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr3);
                                                        java.lang.String intern = ((java.lang.String) objArr3[0]).intern();
                                                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                                                        getHighResolutionOutputSizeshNQ4ISI("鿞됤젣ᰭこ䐷頣갰쀱ᐽ⠹", 11261 - android.text.TextUtils.getOffsetAfter("", 0), objArr4);
                                                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr4[0]).intern());
                                                        util.h.xy.f.b.f2201.m26747();
                                                        if (qRCodePaymentServiceListener == null) {
                                                            util.h.xy.bq.rd.getOutputMinFrameDuration();
                                                            return;
                                                        }
                                                        int i2 = getInputSizeshNQ4ISI + 17;
                                                        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                                                        if (i2 % 2 == 0) {
                                                            qRCodePaymentServiceListener.onDataReadyForPayment(util.h.xy.bq.rd.this, m25641);
                                                        } else {
                                                            qRCodePaymentServiceListener.onDataReadyForPayment(util.h.xy.bq.rd.this, m25641);
                                                            throw null;
                                                        }
                                                    } catch (java.lang.Throwable th2) {
                                                        util.h.xy.bq.rd.getOutputMinFrameDuration();
                                                        th2.getMessage();
                                                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                                                        getHighResolutionOutputSizeshNQ4ISI("鿅뫾햎\uf0af", 9511 - android.graphics.Color.red(0), objArr5);
                                                        java.lang.String intern2 = ((java.lang.String) objArr5[0]).intern();
                                                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                                                        getHighResolutionOutputSizeshNQ4ISI("鿞犠䔫垱⩃㲛༛\ue194\uf411욙\ud961\uabff", (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 60793, objArr6);
                                                        util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr6[0]).intern());
                                                    }
                                                }
                                            });
                                        }
                                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                                        util.h.xy.bq.rd.getOutputMinFrameDuration();
                                        e.getMessage();
                                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                        sb.append(e.getMessage());
                                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                                        Camera2StreamConfigurationMap(new int[]{1553614659, 96978970}, 3 - android.graphics.Color.argb(0, 0, 0, 0), objArr3);
                                        sb.append(((java.lang.String) objArr3[0]).intern());
                                        sb.append(e.getmErrorCode());
                                        util.h.xy.bq.rd.getHighSpeedVideoSizes(util.h.xy.bq.rd.this, util.h.xy.bf.mc.m25434(com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.QR_CODE_INPUT_INVALID, sb.toString()));
                                        util.h.xy.bu.b.f1050.m25641(99);
                                    }
                                } else if (paymentType == com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP) {
                                    try {
                                        byte[] m25545 = util.h.xy.bp.ra.m25545(util.h.xy.bu.c.f1051.m25654());
                                        int m245542 = util.h.xy.af.mb.m24551().m24554();
                                        if (m245542 != -91) {
                                            util.h.xy.bq.rd.getOutputMinFrameDuration();
                                            util.h.xy.bq.rd.getHighSpeedVideoFpsRanges(util.h.xy.bq.rd.this, util.h.xy.bf.mc.m25432(m245542));
                                            util.h.xy.bu.b.f1050.m25641(99);
                                            return;
                                        }
                                        util.h.xy.bu.c.f1051.m25649();
                                        com.gemalto.mfs.mwsdk.payment.engine.remote.RemotePaymentOutputData m25543 = util.h.xy.bp.ra.m25543(m25545);
                                        if (m25543 == null) {
                                            util.h.xy.bq.rd.getOutputMinFrameDuration();
                                            util.h.xy.bq.rd rdVar3 = util.h.xy.bq.rd.this;
                                            com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode3 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.REMOTE_PAYMENT_OUTPUT_INVALID;
                                            java.lang.Object[] objArr4 = new java.lang.Object[1];
                                            Camera2StreamConfigurationMap(new int[]{-1108937411, -167881481, 943972433, -1350723356, -1063918948, 2041452998, 357524439, 1365371512, 59271264, -1353530417, -378921283, -1078434632, 1617191799, -1924692252, 1926951272, 605234821}, 32 - android.view.KeyEvent.keyCodeFromString(""), objArr4);
                                            util.h.xy.bq.rd.getHighSpeedVideoFpsRanges(rdVar3, util.h.xy.bf.mc.m25434(paymentServiceErrorCode3, ((java.lang.String) objArr4[0]).intern()));
                                            util.h.xy.bu.b.f1050.m25641(99);
                                        } else {
                                            util.h.xy.bq.rd.getOutputMinFrameDuration();
                                            util.h.xy.bq.rd.this.m25554(m25543);
                                            if (util.h.xy.bf.mb.f938.m25426() != null) {
                                                util.h.xy.bq.rd.getOutputMinFrameDuration();
                                                util.h.xy.bf.mb.f938.m25426().m25390(true);
                                            } else {
                                                util.h.xy.bq.rd.getOutputMinFrameDuration();
                                            }
                                            final com.gemalto.mfs.mwsdk.payment.engine.TransactionContext m256412 = util.h.xy.bu.b.f1050.m25641(100);
                                            util.h.xy.ag.a.m24556().m24557(new java.lang.Runnable() { // from class: util.h.xy.bq.rd.5.2
                                                private static char[] getHighResolutionOutputSizeshNQ4ISI = {42356, 42259, 42257, 42259, 42249, 42484, 42487, 42494, 42495, 42484, 42494, 42492, 42443, 42437, 42484, 42485, 42486, 42358, 42254, 42253, 42252, 42269, 42339, 42260, 42262, 42252, 42263, 42262, 42255, 42252, 42263};
                                                private static int getHighSpeedVideoFpsRangesFor = 1;
                                                private static int getHighSpeedVideoSizes = 0;
                                                private static int getInputSizeshNQ4ISI = 0;
                                                private static int getOutputMinFrameDuration = 1;

                                                private static void Camera2StreamConfigurationMap(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr5) {
                                                    util.h.xz.b.ma maVar2;
                                                    util.h.xz.b.ma maVar3;
                                                    util.h.xz.b.ma maVar4;
                                                    int i2 = getHighSpeedVideoSizes + 65;
                                                    getHighSpeedVideoFpsRangesFor = i2 % 128;
                                                    int i3 = 2;
                                                    if (i2 % 2 == 0) {
                                                        throw null;
                                                    }
                                                    byte[] bytes = str.getBytes("ISO-8859-1");
                                                    util.h.xz.b.ma maVar5 = new util.h.xz.b.ma();
                                                    int i4 = iArr[0];
                                                    int i5 = iArr[1];
                                                    int i6 = iArr[2];
                                                    int i7 = iArr[3];
                                                    char[] cArr = getHighResolutionOutputSizeshNQ4ISI;
                                                    if (cArr != null) {
                                                        int length = cArr.length;
                                                        char[] cArr2 = new char[length];
                                                        int i8 = 0;
                                                        while (i8 < length) {
                                                            int i9 = getHighSpeedVideoSizes + 77;
                                                            getHighSpeedVideoFpsRangesFor = i9 % 128;
                                                            if (i9 % i3 == 0) {
                                                                maVar4 = maVar5;
                                                                cArr2[i8] = (char) (cArr[i8] * (-8125198844289309347L));
                                                                i8 <<= 1;
                                                            } else {
                                                                maVar4 = maVar5;
                                                                cArr2[i8] = (char) (cArr[i8] ^ (-8125198844289309347L));
                                                                i8++;
                                                            }
                                                            maVar5 = maVar4;
                                                            i3 = 2;
                                                        }
                                                        maVar2 = maVar5;
                                                        cArr = cArr2;
                                                    } else {
                                                        maVar2 = maVar5;
                                                    }
                                                    char[] cArr3 = new char[i5];
                                                    java.lang.System.arraycopy(cArr, i4, cArr3, 0, i5);
                                                    if (bytes != null) {
                                                        char[] cArr4 = new char[i5];
                                                        maVar3 = maVar2;
                                                        maVar3.f2631 = 0;
                                                        char c = 0;
                                                        while (maVar3.f2631 < i5) {
                                                            if (bytes[maVar3.f2631] == 1) {
                                                                int i10 = getHighSpeedVideoFpsRangesFor + 101;
                                                                getHighSpeedVideoSizes = i10 % 128;
                                                                if (i10 % 2 != 0) {
                                                                    int i11 = maVar3.f2631;
                                                                    char c2 = cArr3[maVar3.f2631];
                                                                    throw new java.lang.ArithmeticException();
                                                                }
                                                                cArr4[maVar3.f2631] = (char) (((cArr3[maVar3.f2631] * 2) + 1) - c);
                                                            } else {
                                                                cArr4[maVar3.f2631] = (char) ((cArr3[maVar3.f2631] * 2) - c);
                                                            }
                                                            c = cArr4[maVar3.f2631];
                                                            maVar3.f2631++;
                                                        }
                                                        cArr3 = cArr4;
                                                    } else {
                                                        maVar3 = maVar2;
                                                    }
                                                    if (i7 > 0) {
                                                        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 97) % 128;
                                                        char[] cArr5 = new char[i5];
                                                        java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i5);
                                                        int i12 = i5 - i7;
                                                        java.lang.System.arraycopy(cArr5, 0, cArr3, i12, i7);
                                                        java.lang.System.arraycopy(cArr5, i7, cArr3, 0, i12);
                                                    }
                                                    if (z) {
                                                        char[] cArr6 = new char[i5];
                                                        maVar3.f2631 = 0;
                                                        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 111) % 128;
                                                        while (maVar3.f2631 < i5) {
                                                            cArr6[maVar3.f2631] = cArr3[(i5 - maVar3.f2631) - 1];
                                                            maVar3.f2631++;
                                                        }
                                                        cArr3 = cArr6;
                                                    }
                                                    if (i6 > 0) {
                                                        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 83) % 128;
                                                        maVar3.f2631 = 0;
                                                        while (maVar3.f2631 < i5) {
                                                            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 55) % 128;
                                                            cArr3[maVar3.f2631] = (char) (cArr3[maVar3.f2631] - iArr[2]);
                                                            maVar3.f2631++;
                                                        }
                                                    }
                                                    objArr5[0] = new java.lang.String(cArr3);
                                                }

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    getInputSizeshNQ4ISI = (getOutputMinFrameDuration + 53) % 128;
                                                    try {
                                                        com.gemalto.mfs.mwsdk.payment.engine.RemotePaymentServiceListener remotePaymentServiceListener = (com.gemalto.mfs.mwsdk.payment.engine.RemotePaymentServiceListener) util.h.xy.bq.rd.this.getPaymentServiceListener();
                                                        util.h.xy.bq.rd.getOutputMinFrameDuration();
                                                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                                                        Camera2StreamConfigurationMap(true, new int[]{0, 4, 0, 0}, "\u0001\u0000\u0001\u0000", objArr5);
                                                        java.lang.String intern = ((java.lang.String) objArr5[0]).intern();
                                                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                                                        Camera2StreamConfigurationMap(true, new int[]{4, 13, 88, 0}, "\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001", objArr6);
                                                        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr6[0]).intern());
                                                        util.h.xy.f.b.f2201.m26747();
                                                        if (remotePaymentServiceListener == null) {
                                                            util.h.xy.bq.rd.getOutputMinFrameDuration();
                                                            return;
                                                        }
                                                        int i2 = getOutputMinFrameDuration + 95;
                                                        getInputSizeshNQ4ISI = i2 % 128;
                                                        if (i2 % 2 == 0) {
                                                            remotePaymentServiceListener.onDataReadyForPayment(util.h.xy.bq.rd.this, m256412);
                                                        } else {
                                                            remotePaymentServiceListener.onDataReadyForPayment(util.h.xy.bq.rd.this, m256412);
                                                            throw null;
                                                        }
                                                    } catch (java.lang.Throwable th2) {
                                                        util.h.xy.bq.rd.getOutputMinFrameDuration();
                                                        th2.getMessage();
                                                        java.lang.Object[] objArr7 = new java.lang.Object[1];
                                                        Camera2StreamConfigurationMap(true, new int[]{0, 4, 0, 0}, "\u0001\u0000\u0001\u0000", objArr7);
                                                        java.lang.String intern2 = ((java.lang.String) objArr7[0]).intern();
                                                        java.lang.Object[] objArr8 = new java.lang.Object[1];
                                                        Camera2StreamConfigurationMap(false, new int[]{17, 14, 0, 0}, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001", objArr8);
                                                        util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr8[0]).intern());
                                                    }
                                                }
                                            });
                                        }
                                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException unused) {
                                        util.h.xy.bq.rd rdVar4 = util.h.xy.bq.rd.this;
                                        com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode paymentServiceErrorCode4 = com.gemalto.mfs.mwsdk.payment.PaymentServiceErrorCode.REMOTE_PAYMENT_OUTPUT_INVALID;
                                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                                        Camera2StreamConfigurationMap(new int[]{-1108937411, -167881481, 943972433, -1350723356, -1063918948, 2041452998, 357524439, 1365371512, 59271264, -1353530417, -378921283, -1078434632, 1617191799, -1924692252, 1926951272, 605234821}, 33 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr5);
                                        util.h.xy.bq.rd.getHighSpeedVideoFpsRanges(rdVar4, util.h.xy.bf.mc.m25434(paymentServiceErrorCode4, ((java.lang.String) objArr5[0]).intern()));
                                        util.h.xy.bu.b.f1050.m25641(99);
                                    }
                                }
                            } else {
                                util.h.xy.bq.rd.getOutputMinFrameDuration();
                                com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifierListener m25036 = util.h.xy.bq.rd.getHighSpeedVideoFpsRanges(util.h.xy.bq.rd.this).m25036();
                                if (m25036 != null) {
                                    util.h.xy.bq.rd.getHighSpeedVideoFpsRanges(util.h.xy.bq.rd.this, true);
                                    byte[] m26758 = util.h.xy.f.b.f2201.m26758(util.h.xy.f.ma.f2204, false);
                                    java.lang.Byte b = new java.lang.Byte(m26758[1]);
                                    if (m26758[0] == 0) {
                                        util.h.xy.bq.rd rdVar5 = util.h.xy.bq.rd.this;
                                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                                        Camera2StreamConfigurationMap(new int[]{633989502, -882771851, -239593670, 1932677760, -63439502, -697877293, 238892610, 876383853, 900562081, 1451152247, 1766380138, 879365381, -1906193760, 193074527, -471502735, 2023100875}, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 30, objArr6);
                                        util.h.xy.bq.rd.Camera2StreamConfigurationMap(rdVar5, ((java.lang.String) objArr6[0]).intern());
                                    } else if (b.intValue() == 0) {
                                        util.h.xy.bq.rd.getHighSpeedVideoFpsRanges(util.h.xy.bq.rd.this, false);
                                        util.h.xy.bq.rd.Camera2StreamConfigurationMap(util.h.xy.bq.rd.this);
                                        try {
                                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                                            Camera2StreamConfigurationMap(new int[]{30117266, -1316592507}, 4 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), objArr7);
                                            java.lang.String intern = ((java.lang.String) objArr7[0]).intern();
                                            java.lang.Object[] objArr8 = new java.lang.Object[1];
                                            Camera2StreamConfigurationMap(new int[]{642377325, 2075703444, -492602773, -179929202, -721497828, 95475651}, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, objArr8);
                                            util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr8[0]).intern());
                                            m25036.maxRetryReached();
                                        } catch (java.lang.Throwable th2) {
                                            java.lang.Throwable cause2 = th2.getCause();
                                            if (cause2 == null) {
                                                throw th2;
                                            }
                                            throw cause2;
                                        }
                                    } else {
                                        java.lang.Object[] objArr9 = new java.lang.Object[1];
                                        Camera2StreamConfigurationMap(new int[]{30117266, -1316592507}, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4, objArr9);
                                        java.lang.String intern2 = ((java.lang.String) objArr9[0]).intern();
                                        java.lang.Object[] objArr10 = new java.lang.Object[1];
                                        Camera2StreamConfigurationMap(new int[]{642377325, 2075703444, -492602773, -179929202, 2106908873, -472541498}, (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11, objArr10);
                                        util.h.xy.am.ma.m25029(intern2, ((java.lang.String) objArr10[0]).intern());
                                        com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifierErrorCode cHCodeVerifierErrorCode = com.gemalto.mfs.mwsdk.utils.chcodeverifier.CHCodeVerifierErrorCode.WRONG_PIN;
                                        java.lang.Object[] objArr11 = new java.lang.Object[1];
                                        Camera2StreamConfigurationMap(new int[]{2065699575, -1572287881, -1624166063, 1326154894, -1018563555, -1221347817, -1584101411, 1337550681, -1862045449, 722595698}, android.view.View.combineMeasuredStates(0, 0) + 19, objArr11);
                                        m25036.onVerificationError(b.intValue(), new util.h.xy.v.mc(cHCodeVerifierErrorCode, ((java.lang.String) objArr11[0]).intern()));
                                    }
                                }
                            }
                        } else {
                            util.h.xy.bq.rd.getOutputMinFrameDuration();
                        }
                    }
                }
            }, m25549()).getResult();
            this.getOutputFormats = maVar;
            int i2 = getHighSpeedVideoSizes + 5;
            getOutputMinFrameDuration = i2 % 128;
            if (i2 % 2 == 0) {
                return maVar;
            }
            throw new java.lang.ArithmeticException();
        }
        throw new java.lang.ArithmeticException();
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoSizesFor = new char[]{41970, 41903, 41917, 41913, 41877, 41915, 41914, 41900, 41980, 41906, 41897, 41874, 41971, 41968, 41899, 41902, 41909, 41896, 41907, 41880, 41868, 41879, 41908, 41864, 41871};
        getHighSpeedVideoFpsRangesFor = (char) 38467;
    }
}
