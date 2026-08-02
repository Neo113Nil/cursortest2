package util.h.xy.eq;

/* loaded from: classes18.dex */
public final class a {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static short[] getHighSpeedVideoFpsRanges = null;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private static byte[] getHighSpeedVideoSizesFor;
    private static int getInputFormats;
    private static final short[] getInputSizeshNQ4ISI;
    private static int getOutputFormats;
    private static int getOutputMinFrameDuration;

    /* JADX WARN: Code restructure failed: missing block: B:19:0x008b, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009c, code lost:
    
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x009a, code lost:
    
        r3 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0098, code lost:
    
        if (r3 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void getHighSpeedVideoSizes(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        boolean z;
        int i4;
        int i5;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i6 = i2 + ((int) (getOutputFormats ^ (-2689713159175858216L)));
        if (i6 == -1) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 69) % 128;
            z = true;
        } else {
            z = false;
        }
        if (z) {
            byte[] bArr = getHighSpeedVideoSizesFor;
            if (bArr != null) {
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 105) % 128;
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i7 = 0; i7 < length; i7++) {
                    bArr2[i7] = (byte) (bArr[i7] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            i6 = bArr != null ? (byte) (((byte) (getHighSpeedVideoSizesFor[((int) (getInputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputFormats ^ (-2689713159175858216L)))) : (short) (((short) (getHighSpeedVideoFpsRanges[((int) (getInputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getOutputFormats ^ (-2689713159175858216L))));
        }
        if (i6 > 0) {
            int i8 = Camera2StreamConfigurationMap + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
            if (i8 % 2 == 0) {
                i4 = ((i >>> i6) << 2) >>> ((int) (getInputFormats | (-2689713159175858216L)));
            } else {
                i4 = ((i + i6) - 2) + ((int) (getInputFormats ^ (-2689713159175858216L)));
            }
            meVar.f2647 = i4 + i5;
            meVar.f2644 = (char) (i3 + ((int) (getHighSpeedVideoSizes ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getHighSpeedVideoSizesFor;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                int i9 = 0;
                while (i9 < length2) {
                    int i10 = getHighResolutionOutputSizeshNQ4ISI + 47;
                    Camera2StreamConfigurationMap = i10 % 128;
                    if (i10 % 2 != 0) {
                        bArr4[i9] = (byte) (bArr3[i9] / (-2689713159175858216L));
                    } else {
                        bArr4[i9] = (byte) (bArr3[i9] ^ (-2689713159175858216L));
                        i9++;
                    }
                }
                bArr3 = bArr4;
            }
            boolean z2 = bArr3 != null;
            meVar.f2645 = 1;
            while (meVar.f2645 < i6) {
                Camera2StreamConfigurationMap = (getHighResolutionOutputSizeshNQ4ISI + 111) % 128;
                if (z2) {
                    byte[] bArr5 = getHighSpeedVideoSizesFor;
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
        Camera2StreamConfigurationMap();
        getInputSizeshNQ4ISI = new short[]{93, 190, 155, 139, 17, 153, 110, 77, 89, 243, 133, 166, 63, 183, 131, 197, 228, 115, 107, 58, 104, 90, 192, 71, 160, 100, 52, 12, 241, 208, 82, com.visa.cbp.setDeviceName._CREATION, 185, 30, 150, 67, 65, 216, 212, 44, 219, 248, 7, 119, 42, 202, 235, 239, 16, 28, 22, 13, 56, 114, 47, 137, 193, 249, 128, 196, 109, 174, 48, 61, 206, 32, 99, 254, 230, 26, 199, 184, 80, 232, 36, 23, 252, 37, com.visa.cbp.setDeviceName.getHighResolutionOutputSizeshNQ4ISI, 187, 106, 163, 68, 83, 217, 162, 1, 171, 188, 182, 31, 152, 238, 154, 167, 45, 79, 158, 142, 172, 224, 198, 73, 70, 41, 244, com.visa.cbp.setDeviceName.coroutineBoundary, 138, 175, 225, 91, 195, 179, 123, 87, 209, 124, 156, 237, com.visa.cbp.setDeviceName.unwrapAs, 64, 140, 226, 203, com.visa.cbp.setDeviceName.isOutputSupportedFor, 20, 201, 97, 46, 229, 204, 246, 94, 168, 92, 214, 117, 141, 98, 149, 88, 105, 118, 161, 74, 181, 85, 9, 120, 51, 130, 215, 221, 121, 245, 27, 11, 222, 38, 33, 40, 116, 4, 151, 86, 223, 60, 240, 55, 57, 220, 255, 6, com.visa.cbp.getEncExpo.ResultReceiverMyResultReceiver, 234, 66, 8, 218, 180, 113, 176, 207, 18, 122, 78, 250, 108, 29, com.visa.cbp.setDeviceName.getHighSpeedVideoFpsRanges, 0, 200, 127, com.visa.cbp.setDeviceName.getHighSpeedVideoSizesFor, 69, 170, 43, 194, 177, com.visa.cbp.setDeviceName.getOutputSizeshNQ4ISI, 213, 186, 242, 173, 25, com.visa.cbp.getEncExpo.invoke, 103, 54, 247, 15, 10, com.visa.cbp.setDeviceName.getOutputStallDurationlomOqCM, 125, 227, 157, 233, com.visa.cbp.setDeviceName.Camera2StreamConfigurationMap, 62, 35, 39, 102, 19, 236, 129, 21, 189, 34, 191, 159, 126, 169, 81, 75, 76, 251, 2, 211, 112, 134, 49, 231, 59, 5, 3, 84, 96, 72, 101, 24, 210, 205, 95, 50, 136, 14, 53, 253};
        int i = getHighSpeedVideoFpsRangesFor + 21;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.em.ra m26686(java.io.OutputStream outputStream, java.lang.Object obj) {
        getOutputMinFrameDuration = (getHighSpeedVideoFpsRangesFor + 25) % 128;
        if (obj instanceof util.h.xy.ef.b) {
            util.h.xy.em.ra raVar = new util.h.xy.em.ra(outputStream, (util.h.xy.ef.b) obj);
            int i = getOutputMinFrameDuration + 117;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 != 0) {
                return raVar;
            }
            throw new java.lang.ArithmeticException();
        }
        if (obj instanceof util.h.xy.ef.rg) {
            return new util.h.xy.em.ra(outputStream, (util.h.xy.ef.rg) obj);
        }
        if (obj instanceof util.h.xy.eo.mb) {
            return new util.h.xy.em.ra(outputStream, (util.h.xy.eo.mb) obj);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes(android.view.KeyEvent.normalizeMetaState(0) + 2077503804, (short) ((-16777268) - android.graphics.Color.rgb(0, 0, 0)), (byte) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 31, 807302735 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(obj);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    private static util.h.xy.eo.mb getHighSpeedVideoFpsRanges(util.h.xy.dh.i iVar) {
        int i = getOutputMinFrameDuration + 61;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            util.h.xy.dq.mb.f1507.m26325(iVar);
            throw new java.lang.ArithmeticException();
        }
        if (!util.h.xy.dq.mb.f1507.m26325(iVar) && !util.h.xy.dq.mb.f1457.m26325(iVar)) {
            getOutputMinFrameDuration = (getHighSpeedVideoFpsRangesFor + 17) % 128;
            if (!util.h.xy.dq.mb.f1490.m26325(iVar)) {
                if (!util.h.xy.dq.mb.f1503.m26325(iVar) && !util.h.xy.dq.mb.f1476.m26325(iVar)) {
                    getHighSpeedVideoFpsRangesFor = (getOutputMinFrameDuration + 99) % 128;
                    if (!util.h.xy.dq.mb.f1511.m26325(iVar)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoSizes(2077503780 - android.graphics.Color.argb(0, 0, 0, 0), (short) ((-103) - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), (byte) (1 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), (android.view.KeyEvent.getMaxKeyCode() >> 16) - 30, 807302716 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr);
                        sb.append(((java.lang.String) objArr[0]).intern());
                        sb.append(iVar);
                        throw new java.lang.IllegalArgumentException(sb.toString());
                    }
                }
                return new util.h.xy.eo.b(new util.h.xy.ej.ma());
            }
        }
        return new util.h.xy.eo.ra(new util.h.xy.ej.ma());
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static java.lang.Object m26685(boolean z, util.h.xy.ef.mb mbVar, util.h.xy.ed.a aVar) throws java.lang.IllegalArgumentException {
        util.h.xy.eo.a aVar2;
        util.h.xy.et.a aVar3;
        util.h.xy.dh.mi mo26279;
        util.h.xy.dh.i m26494 = aVar.m26494();
        if (m26494.m26325(util.h.xy.du.ra.f1723)) {
            util.h.xy.ej.rc rcVar = new util.h.xy.ej.rc();
            rcVar.mo26569(z, mbVar);
            return rcVar;
        }
        if (m26494.m26325(util.h.xy.dq.mb.f1507) || m26494.m26325(util.h.xy.dq.mb.f1457) || m26494.m26325(util.h.xy.dq.mb.f1490)) {
            util.h.xy.eo.mb highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(aVar.m26494());
            util.h.xy.es.mb m26706 = util.h.xy.es.mb.m26706(aVar.m26493());
            if (mbVar instanceof util.h.xy.ep.mc) {
                highSpeedVideoFpsRanges.mo26637(z, new util.h.xy.ep.ra((util.h.xy.ep.mc) mbVar, m26706.m26708() * 8, m26706.m26707()));
                return highSpeedVideoFpsRanges;
            }
            try {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes(2077503713 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (short) (14 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22)), (byte) (android.view.MotionEvent.axisFromString("") + 1), (-11) - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), 807302725 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            } catch (java.lang.Throwable th) {
                java.lang.Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (m26494.m26325(util.h.xy.dq.mb.f1503) || m26494.m26325(util.h.xy.dq.mb.f1476) || m26494.m26325(util.h.xy.dq.mb.f1511)) {
            util.h.xy.eo.mb highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(aVar.m26494());
            util.h.xy.es.a m26703 = util.h.xy.es.a.m26703(aVar.m26493());
            if (mbVar instanceof util.h.xy.ep.mc) {
                highSpeedVideoFpsRanges2.mo26637(z, new util.h.xy.ep.ra((util.h.xy.ep.mc) mbVar, m26703.m26704() * 8, m26703.m26705()));
                return highSpeedVideoFpsRanges2;
            }
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes(android.view.View.resolveSizeAndState(0, 0, 0) + 2077503714, (short) (android.view.View.combineMeasuredStates(0, 0) + 14), (byte) android.text.TextUtils.getOffsetAfter("", 0), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) - 10, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 807302725, objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        util.h.xy.dh.i m264942 = aVar.m26494();
        if (!util.h.xy.dq.mb.f1479.m26325(m264942)) {
            getOutputMinFrameDuration = (getHighSpeedVideoFpsRangesFor + 65) % 128;
            if (!util.h.xy.dq.mb.f1516.m26325(m264942)) {
                getHighSpeedVideoFpsRangesFor = (getOutputMinFrameDuration + 53) % 128;
                if (!util.h.xy.dq.mb.f1492.m26325(m264942)) {
                    if (util.h.xy.du.ra.f1735.m26325(m264942)) {
                        aVar2 = new util.h.xy.eo.a(new util.h.xy.ej.ra());
                    } else if (util.h.xy.dr.mb.f1524.m26325(m264942)) {
                        aVar2 = new util.h.xy.eo.a(new util.h.xy.ej.a());
                    } else if (util.h.xy.du.ra.f1726.m26325(m264942)) {
                        aVar2 = new util.h.xy.eo.a(new util.h.xy.ej.mb());
                        getOutputMinFrameDuration = (getHighSpeedVideoFpsRangesFor + 79) % 128;
                    } else {
                        if (!util.h.xy.dt.ma.f1539.m26325(m264942)) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighSpeedVideoSizes(2077503780 - android.view.View.resolveSizeAndState(0, 0, 0), (short) ((-103) - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16)), (byte) android.view.KeyEvent.keyCodeFromString(""), (-30) - android.text.TextUtils.getTrimmedLength(""), android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 807302718, objArr3);
                            sb.append(((java.lang.String) objArr3[0]).intern());
                            sb.append(m264942);
                            throw new java.lang.IllegalArgumentException(sb.toString());
                        }
                        aVar2 = new util.h.xy.eo.a(new util.h.xy.ej.b());
                    }
                    aVar3 = new util.h.xy.et.a(aVar2, new util.h.xy.et.b());
                    mo26279 = aVar.m26493().mo26279();
                    if (mo26279 != null || (mo26279 instanceof util.h.xy.dh.g)) {
                        if (!m26494.m26325(util.h.xy.du.ra.f1735) || m26494.m26325(util.h.xy.eq.ma.getHighSpeedVideoSizes) || m26494.m26325(util.h.xy.eq.ma.getHighSpeedVideoFpsRanges)) {
                            aVar3.mo26537(z, new util.h.xy.ep.e(mbVar, new byte[8]));
                            return aVar3;
                        }
                        aVar3.mo26537(z, mbVar);
                        return aVar3;
                    }
                    if (m26494.m26325(util.h.xy.du.ra.f1735) || m26494.m26325(util.h.xy.eq.ma.getHighSpeedVideoSizes) || m26494.m26325(util.h.xy.dq.mb.f1479) || m26494.m26325(util.h.xy.dq.mb.f1516) || m26494.m26325(util.h.xy.dq.mb.f1492) || m26494.m26325(util.h.xy.ds.b.f1534) || m26494.m26325(util.h.xy.ds.b.f1535) || m26494.m26325(util.h.xy.ds.b.f1532) || m26494.m26325(util.h.xy.dn.mb.f1386) || m26494.m26325(util.h.xy.dr.mb.f1524)) {
                        aVar3.mo26537(z, new util.h.xy.ep.e(mbVar, util.h.xy.dh.rh.m26335(mo26279).m26337()));
                        return aVar3;
                    }
                    if (m26494.m26325(util.h.xy.eq.ma.getHighSpeedVideoFpsRanges)) {
                        aVar3.mo26537(z, new util.h.xy.ep.e(mbVar, util.h.xy.dt.ra.m26413(mo26279).m26414()));
                        return aVar3;
                    }
                    if (m26494.m26325(util.h.xy.du.ra.f1726)) {
                        util.h.xy.du.b m26418 = util.h.xy.du.b.m26418(mo26279);
                        aVar3.mo26537(z, new util.h.xy.ep.e(new util.h.xy.ep.rd(((util.h.xy.ep.mc) mbVar).m26663(), getInputSizeshNQ4ISI[m26418.m26419().intValue()]), m26418.m26420()));
                        return aVar3;
                    }
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(2077503758 - android.graphics.Color.green(0), (short) ((-63) - (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (byte) ((-1) - android.view.MotionEvent.axisFromString("")), (-32) - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 807302717 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr4);
                    throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
                }
            }
        }
        aVar2 = new util.h.xy.eo.a(new util.h.xy.ej.ma());
        aVar3 = new util.h.xy.et.a(aVar2, new util.h.xy.et.b());
        mo26279 = aVar.m26493().mo26279();
        if (mo26279 != null) {
        }
        if (m26494.m26325(util.h.xy.du.ra.f1735)) {
        }
        aVar3.mo26537(z, new util.h.xy.ep.e(mbVar, new byte[8]));
        return aVar3;
    }

    static void Camera2StreamConfigurationMap() {
        getInputFormats = 1670043846;
        getOutputFormats = -408872977;
        getHighSpeedVideoSizes = 675323390;
        getHighSpeedVideoSizesFor = new byte[]{41, 32, 63, -35, 57, 39, 63, 43, com.visa.cbp.getEncExpo.registerForActivityResult, com.google.common.base.Ascii.GS, 36, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_RAW_CODE, -63, 120, 45, 35, -32, 117, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 36, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, 48, 42, -40, 44, 42, 44, -21, 117, 45, -20, 70, 43, 40, 34, -25, 105, 7, -35, org.apache.commons.imaging.formats.pnm.PnmConstants.PAM_RAW_CODE, -18, 65, -34, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -104, -108, -24, -106, -17, -109, -10, -120, -24, 87, 47, -100, -10, -118, -21, 84, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -100, -104, -25, -108, -27, -107, -9, -84, org.bouncycastle.crypto.signers.PSSSigner.TRAILER_IMPLICIT, -121, -74, -75, 114, -6, -127, -87, -70, -74, -121, -85, -67, -126, 97, -53, -76, -80, com.visa.cbp.getEncExpo.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, -84, -67, -62, 34, -99, -22, -9, -28, -1, 91, 58, com.visa.cbp.getEncExpo.registerForActivityResult, -23, -12, -29, -30, -81, 62, -13, -28, -19, -17, -23, -11, -40, -40, -40, -40};
    }
}
