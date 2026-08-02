package util.h.xy.ee;

/* loaded from: classes5.dex */
public final class a {
    private static int Camera2StreamConfigurationMap = -1403186617;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static short[] getHighSpeedVideoSizes = null;
    private static int getHighSpeedVideoSizesFor = -408873026;
    private static int getInputFormats = -1027296634;
    private static byte[] getOutputFormats = {-108, -66, -115, 116, -124, com.visa.cbp.getEncExpo.IResultReceiver, 123, -125, -114, 97, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -55, 115, -121, 126, -121, 123, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -34, com.visa.cbp.getEncExpo.IResultReceiver, 115, 114, Byte.MAX_VALUE, -116, Byte.MAX_VALUE, 113, -115, -97, Byte.MAX_VALUE, -117, 114, 122, -33, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, 125, -97, 114, 118, -113, 113, 121, -114, -127, -114, com.visa.cbp.getEncExpo.kernelVersion, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -114, 98, -99, 121, 113, -114, -36, 32, -119, -115, -116, -127, 114, -125, -113, -40, -40, -40};
    private static int getOutputMinFrameDuration;
    private util.h.xy.ed.re getInputSizeshNQ4ISI;
    private util.h.xy.ed.b getOutputStallDurationlomOqCM;

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighResolutionOutputSizeshNQ4ISI(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        int i4;
        boolean z;
        int i5;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = i2 + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L)));
        boolean z2 = i6 == -1;
        if (z2) {
            byte[] bArr = getOutputFormats;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i7 = 0; i7 < length; i7++) {
                    bArr2[i7] = (byte) (bArr[i7] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            i6 = bArr != null ? (byte) (((byte) (getOutputFormats[((int) (Camera2StreamConfigurationMap ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L)))) : (short) (((short) (getHighSpeedVideoSizes[((int) (Camera2StreamConfigurationMap ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getHighSpeedVideoSizesFor ^ (-2689713159175858216L))));
        }
        if (i6 > 0) {
            int i8 = (int) (Camera2StreamConfigurationMap ^ (-2689713159175858216L));
            if (z2) {
                i4 = 1;
            } else {
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 27) % 128;
                i4 = 0;
            }
            meVar.f2647 = ((i + i6) - 2) + i8 + i4;
            meVar.f2644 = (char) (i3 + ((int) (getInputFormats ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getOutputFormats;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                int i9 = 0;
                while (i9 < length2) {
                    int i10 = getHighSpeedVideoFpsRangesFor + 85;
                    getHighSpeedVideoFpsRanges = i10 % 128;
                    if (i10 % 2 != 0) {
                        bArr4[i9] = (byte) (bArr3[i9] + 2689713159175858216L);
                    } else {
                        bArr4[i9] = (byte) (bArr3[i9] ^ (-2689713159175858216L));
                        i9++;
                    }
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                int i11 = getHighSpeedVideoFpsRangesFor + 79;
                getHighSpeedVideoFpsRanges = i11 % 128;
                if (i11 % 2 == 0) {
                    z = true;
                    meVar.f2645 = 1;
                    while (meVar.f2645 < i6) {
                        int i12 = (getHighSpeedVideoFpsRangesFor + 57) % 128;
                        getHighSpeedVideoFpsRanges = i12;
                        if (z) {
                            int i13 = i12 + 27;
                            getHighSpeedVideoFpsRangesFor = i13 % 128;
                            if (i13 % 2 == 0) {
                                byte[] bArr5 = getOutputFormats;
                                meVar.f2647 = meVar.f2647;
                                i5 = meVar.f2646 - (((byte) (((byte) (bArr5[r11] + 2689713159175858216L)) / s)) ^ b);
                            } else {
                                byte[] bArr6 = getOutputFormats;
                                meVar.f2647 = meVar.f2647 - 1;
                                i5 = meVar.f2646 + (((byte) (((byte) (bArr6[r11] ^ (-2689713159175858216L))) + s)) ^ b);
                            }
                            meVar.f2644 = (char) i5;
                        } else {
                            short[] sArr = getHighSpeedVideoSizes;
                            meVar.f2647 = meVar.f2647 - 1;
                            meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r11] ^ (-2689713159175858216L))) + s)) ^ b));
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

    private static byte[] getHighSpeedVideoFpsRanges(util.h.xy.ew.ma maVar, util.h.xy.dh.mh mhVar) throws java.io.IOException {
        getOutputMinFrameDuration = (getHighResolutionOutputSizeshNQ4ISI + 101) % 128;
        java.io.OutputStream mo26725 = maVar.mo26725();
        int argb = android.graphics.Color.argb(0, 0, 0, 0);
        getOutputMinFrameDuration = (getHighResolutionOutputSizeshNQ4ISI + 3) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI((-1274807652) - argb, (short) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 1), (byte) (86 - android.text.TextUtils.indexOf("", "", 0)), (-99) - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (-627418394) - android.view.View.resolveSizeAndState(0, 0, 0), objArr);
            mhVar.mo26323(mo26725, ((java.lang.String) objArr[0]).intern());
            mo26725.close();
            return maVar.mo26724();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final util.h.xy.ee.b m26530(util.h.xy.ew.ma maVar) {
        getHighResolutionOutputSizeshNQ4ISI = (getOutputMinFrameDuration + 85) % 128;
        this.getInputSizeshNQ4ISI.m26520(maVar.mo26726());
        if (!this.getOutputStallDurationlomOqCM.m26498()) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 69;
            getOutputMinFrameDuration = i % 128;
            util.h.xy.ed.re reVar = this.getInputSizeshNQ4ISI;
            if (i % 2 != 0) {
                reVar.m26525(this.getOutputStallDurationlomOqCM.m26496());
                throw new java.lang.ArithmeticException();
            }
            reVar.m26525(this.getOutputStallDurationlomOqCM.m26496());
        }
        try {
            util.h.xy.ed.d m26524 = this.getInputSizeshNQ4ISI.m26524();
            util.h.xy.ed.a mo26726 = maVar.mo26726();
            byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(maVar, m26524);
            util.h.xy.dh.d dVar = new util.h.xy.dh.d();
            dVar.m26290(m26524);
            dVar.m26290(mo26726);
            dVar.m26290(new util.h.xy.dh.rw(highSpeedVideoFpsRanges));
            util.h.xy.ed.mb m26510 = util.h.xy.ed.mb.m26510(new util.h.xy.dh.aa(dVar));
            int i2 = getOutputMinFrameDuration + 93;
            getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
            if (i2 % 2 != 0) {
                return new util.h.xy.ee.b(m26510);
            }
            throw new java.lang.ArithmeticException();
        } catch (java.io.IOException unused) {
            int size = android.view.View.MeasureSpec.getSize(0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(size - 1274807687, (short) ((-1) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0)), (byte) (android.text.TextUtils.indexOf("", "", 0, 0) + 84), (-66) - (android.view.ViewConfiguration.getScrollBarSize() >> 8), android.widget.ExpandableListView.getPackedPositionChild(0L) - 627418362, objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final util.h.xy.ee.a m26529(util.h.xy.dh.i iVar, boolean z, util.h.xy.dh.c cVar) throws util.h.xy.ee.ra {
        try {
            this.getOutputStallDurationlomOqCM.m26495(iVar, z, cVar);
            return this;
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI((-1274807711) - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (short) android.text.TextUtils.getCapsMode("", 0, 0), (byte) ((-86) - android.view.KeyEvent.getDeadChar(0, 0)), ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) - 77, (-627418362) - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr);
                sb.append(((java.lang.String) objArr[0]).intern());
                sb.append(e.getMessage());
                throw new util.h.xy.ee.ra(sb.toString(), e);
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
    }

    public a(util.h.xy.dw.b bVar, java.math.BigInteger bigInteger, util.h.xy.ed.rb rbVar, util.h.xy.ed.rb rbVar2, util.h.xy.dw.b bVar2, util.h.xy.ed.mc mcVar) {
        util.h.xy.ed.re reVar = new util.h.xy.ed.re();
        this.getInputSizeshNQ4ISI = reVar;
        reVar.m26527(new util.h.xy.dh.f(bigInteger));
        this.getInputSizeshNQ4ISI.m26522(bVar);
        this.getInputSizeshNQ4ISI.m26528(rbVar);
        this.getInputSizeshNQ4ISI.m26526(rbVar2);
        this.getInputSizeshNQ4ISI.m26521(bVar2);
        this.getInputSizeshNQ4ISI.m26523(mcVar);
        this.getOutputStallDurationlomOqCM = new util.h.xy.ed.b();
    }

    public a(util.h.xy.dw.b bVar, java.math.BigInteger bigInteger, java.util.Date date, java.util.Date date2, java.util.Locale locale, util.h.xy.dw.b bVar2, util.h.xy.ed.mc mcVar) {
        this(bVar, bigInteger, new util.h.xy.ed.rb(date, locale), new util.h.xy.ed.rb(date2, locale), bVar2, mcVar);
    }
}
