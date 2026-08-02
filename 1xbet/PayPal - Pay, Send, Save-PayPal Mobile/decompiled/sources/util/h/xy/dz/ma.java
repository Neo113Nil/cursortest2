package util.h.xy.dz;

/* loaded from: classes5.dex */
public final class ma {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static short[] getHighSpeedVideoSizesFor = null;
    private static int getInputFormats = -1939415756;
    private static int getInputSizeshNQ4ISI = -408873038;
    private static int getOutputFormats = -584565225;
    private static byte[] getOutputMinFrameDuration = {64, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, 114, -94, 92, -19, -86, com.google.common.base.Ascii.CAN, -3, 64, -81, -86, 89, -94, com.google.common.base.Ascii.RS, -29, -90, 89, 80, 82, -84, 72, 109, -29, com.google.common.base.Ascii.ETB, -24, 85, -89, -28, -26, -18, 17, -17, com.google.common.base.Ascii.NAK, -30, com.google.common.base.Ascii.RS, -18, com.google.common.base.Ascii.SUB, 17, com.google.common.base.Ascii.RS, com.visa.cbp.getEncExpo.addOnTrimMemoryListener, -86, -32, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardAdditionalPaymentData.TAG_PAYMENT_OPTION, -89, -28, -23, com.google.common.base.Ascii.ESC, 9, -22, 75, -24, com.google.common.base.Ascii.SYN, 109, -122, 126, 116, 59, -63, -126, 124, -120, 113, -120, 116, 56, -52, 124, org.apache.commons.imaging.formats.pnm.PnmConstants.PPM_TEXT_CODE, -48, 111, -124, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_RAW_CODE, -58, -115, 116, 118, -106, 43, -45, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4, Byte.MIN_VALUE, -119, 88, 104, -34, -19, com.visa.cbp.getEncExpo.startTransaction, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -53, 118, -118, kotlin.io.encoding.Base64.padSymbol, 113, -127, -63, kotlin.io.encoding.Base64.padSymbol, kotlin.io.encoding.Base64.padSymbol, -51, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE, -51, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 125, -118, com.visa.cbp.getEncExpo.kernelVersion, 48, 57, 59, -59, -63, 64, com.visa.cbp.getEncExpo.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4};
    private static int getHighSpeedVideoSizes = -1231763827;

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 103) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr = new char[i];
        raVar.f2649 = 0;
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 25) % 128;
        while (raVar.f2649 < i) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 105) % 128;
            raVar.f2650 = charArray[raVar.f2649];
            cArr[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i4 = raVar.f2649;
            cArr[i4] = (char) (cArr[i4] - ((int) (getHighSpeedVideoSizes ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            raVar.f2648 = i2;
            char[] cArr2 = new char[i];
            java.lang.System.arraycopy(cArr, 0, cArr2, 0, i);
            java.lang.System.arraycopy(cArr2, 0, cArr, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr2, raVar.f2648, cArr, 0, i - raVar.f2648);
        }
        if (z) {
            char[] cArr3 = new char[i];
            raVar.f2649 = 0;
            while (raVar.f2649 < i) {
                cArr3[raVar.f2649] = cArr[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            cArr = cArr3;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static void getHighSpeedVideoFpsRanges(int i, short s, byte b, int i2, int i3, java.lang.Object[] objArr) {
        boolean z;
        util.h.xz.b.me meVar = new util.h.xz.b.me();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int i4 = i2 + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L)));
        int i5 = i4 == -1 ? 1 : 0;
        if (i5 != 0) {
            byte[] bArr = getOutputMinFrameDuration;
            if (bArr != null) {
                int length = bArr.length;
                byte[] bArr2 = new byte[length];
                for (int i6 = 0; i6 < length; i6++) {
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 55) % 128;
                    bArr2[i6] = (byte) (bArr[i6] ^ (-2689713159175858216L));
                }
                bArr = bArr2;
            }
            if (bArr != null) {
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 121) % 128;
                i4 = (byte) (((byte) (getOutputMinFrameDuration[((int) (getOutputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))));
            } else {
                i4 = (short) (((short) (getHighSpeedVideoSizesFor[((int) (getOutputFormats ^ (-2689713159175858216L))) + i] ^ (-2689713159175858216L))) + ((int) (getInputSizeshNQ4ISI ^ (-2689713159175858216L))));
            }
        }
        if (i4 > 0) {
            meVar.f2647 = ((i + i4) - 2) + ((int) (getOutputFormats ^ (-2689713159175858216L))) + i5;
            meVar.f2644 = (char) (i3 + ((int) (getInputFormats ^ (-2689713159175858216L))));
            sb.append(meVar.f2644);
            meVar.f2646 = meVar.f2644;
            byte[] bArr3 = getOutputMinFrameDuration;
            if (bArr3 != null) {
                int length2 = bArr3.length;
                byte[] bArr4 = new byte[length2];
                for (int i7 = 0; i7 < length2; i7++) {
                    bArr4[i7] = (byte) (bArr3[i7] ^ (-2689713159175858216L));
                }
                bArr3 = bArr4;
            }
            if (bArr3 != null) {
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 79) % 128;
                z = true;
            } else {
                z = false;
            }
            meVar.f2645 = 1;
            while (meVar.f2645 < i4) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 13) % 128;
                if (z) {
                    byte[] bArr5 = getOutputMinFrameDuration;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((byte) (((byte) (bArr5[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                } else {
                    short[] sArr = getHighSpeedVideoSizesFor;
                    meVar.f2647 = meVar.f2647 - 1;
                    meVar.f2644 = (char) (meVar.f2646 + (((short) (((short) (sArr[r9] ^ (-2689713159175858216L))) + s)) ^ b));
                    Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 125) % 128;
                }
                sb.append(meVar.f2644);
                meVar.f2646 = meVar.f2644;
                meVar.f2645++;
            }
        }
        objArr[0] = sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b4 A[RETURN] */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m26454(util.h.xy.dw.ra raVar, util.h.xy.dw.ra raVar2) {
        if (raVar.m26445() != raVar2.m26445()) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 103;
            int i2 = i % 128;
            getHighSpeedVideoFpsRanges = i2;
            boolean z = i % 2 == 0;
            getHighResolutionOutputSizeshNQ4ISI = (i2 + 69) % 128;
            return z;
        }
        util.h.xy.dw.ma[] m26444 = raVar.m26444();
        util.h.xy.dw.ma[] m264442 = raVar2.m26444();
        if (m26444.length != m264442.length) {
            int i3 = getHighResolutionOutputSizeshNQ4ISI + 57;
            getHighSpeedVideoFpsRanges = i3 % 128;
            return i3 % 2 == 0;
        }
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 45) % 128;
        for (int i4 = 0; i4 != m26444.length; i4++) {
            int i5 = getHighResolutionOutputSizeshNQ4ISI;
            int i6 = (i5 + 59) % 128;
            getHighSpeedVideoFpsRanges = i6;
            util.h.xy.dw.ma maVar = m26444[i4];
            util.h.xy.dw.ma maVar2 = m264442[i4];
            if (maVar == maVar2) {
                getHighSpeedVideoFpsRanges = (i5 + 19) % 128;
            } else {
                if (maVar != null) {
                    int i7 = i6 + 69;
                    getHighResolutionOutputSizeshNQ4ISI = i7 % 128;
                    if (i7 % 2 != 0) {
                        throw null;
                    }
                    if (maVar2 != null) {
                        if (!maVar.m26434().m26325(maVar2.m26434())) {
                            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 59) % 128;
                        } else if (!m26448(maVar.m26433()).equals(m26448(maVar2.m26433()))) {
                        }
                        int i8 = getHighSpeedVideoFpsRanges + 55;
                        getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
                        return i8 % 2 == 0;
                    }
                }
                int i9 = i6 + 81;
                getHighResolutionOutputSizeshNQ4ISI = i9 % 128;
                if (i9 % 2 != 0) {
                    throw null;
                }
                int i82 = getHighSpeedVideoFpsRanges + 55;
                getHighResolutionOutputSizeshNQ4ISI = i82 % 128;
                if (i82 % 2 == 0) {
                }
            }
        }
        return true;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static java.lang.String m26449(java.lang.String str) {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 25) % 128;
        int deadChar = android.view.KeyEvent.getDeadChar(0, 0);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((-982067553) - deadChar, (short) (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) ((-87) - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1))), (-107) - (android.view.ViewConfiguration.getEdgeSlop() >> 16), (-1808255693) - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
        if (str.indexOf(((java.lang.String) objArr[0]).intern()) < 0) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 19;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 != 0) {
                return str;
            }
            throw null;
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        char charAt = str.charAt(0);
        stringBuffer.append(charAt);
        for (int i2 = 1; i2 < str.length(); i2++) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 7) % 128;
            char charAt2 = str.charAt(i2);
            if (charAt != ' ' || charAt2 != ' ') {
                stringBuffer.append(charAt2);
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    private static util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        int i = getHighResolutionOutputSizeshNQ4ISI + 11;
        getHighSpeedVideoFpsRanges = i % 128;
        try {
            return i % 2 == 0 ? util.h.xy.dh.mi.m26324(util.h.xy.fa.d.m26804(str, 1, str.length())) : util.h.xy.dh.mi.m26324(util.h.xy.fa.d.m26804(str, 1, str.length() - 1));
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(android.graphics.ImageFormat.getBitsPerPixel(0) - 982067578, (short) (1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (byte) ((android.view.ViewConfiguration.getJumpTapTimeout() >> 16) - 32), (-107) - (android.view.ViewConfiguration.getEdgeSlop() >> 16), android.text.TextUtils.getOffsetAfter("", 0) - 1808255607, objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e);
            throw new java.lang.IllegalStateException(sb.toString());
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static java.lang.String m26448(util.h.xy.dh.c cVar) {
        int i = getHighSpeedVideoFpsRanges + 31;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        java.lang.String m26452 = m26452(cVar);
        if (i % 2 != 0) {
            m26455(m26452);
            throw null;
        }
        java.lang.String m26455 = m26455(m26452);
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 81) % 128;
        return m26455;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
    
        if (r4 >= r0) goto L31;
     */
    /* renamed from: ᐝ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String m26455(java.lang.String str) {
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 23) % 128;
        int i = 0;
        if (str.length() > 0) {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 83) % 128;
            if (str.charAt(0) == '#') {
                util.h.xy.dh.c highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(str);
                if (highSpeedVideoFpsRangesFor instanceof util.h.xy.dh.m) {
                    str = ((util.h.xy.dh.m) highSpeedVideoFpsRangesFor).mo26276();
                }
            }
        }
        java.lang.String m26857 = util.h.xy.fb.rd.m26857(str);
        int length = m26857.length();
        if (length < 2) {
            return m26857;
        }
        int i2 = length - 1;
        while (i < i2 && m26857.charAt(i) == '\\') {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 3) % 128;
            if (m26857.charAt(i + 1) != ' ') {
                break;
            }
            i += 2;
        }
        int i3 = i2;
        while (i3 > i + 1 && m26857.charAt(i3 - 1) == '\\' && m26857.charAt(i3) == ' ') {
            i3 -= 2;
        }
        m26857 = m26857.substring(i, i3 + 1);
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 87) % 128;
        return m26449(m26857);
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static java.lang.String m26452(util.h.xy.dh.c cVar) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        if (!(cVar instanceof util.h.xy.dh.m) || (cVar instanceof util.h.xy.dh.mo)) {
            try {
                stringBuffer.append('#');
                util.h.xy.dh.mi mo26279 = cVar.mo26279();
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes("￼\t\ufffb", 3 - android.graphics.Color.red(0), 2 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 99, false, objArr);
                stringBuffer.append(util.h.xy.fa.d.m26805(mo26279.m26322(((java.lang.String) objArr[0]).intern())));
            } catch (java.io.IOException unused) {
                try {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(android.view.KeyEvent.normalizeMetaState(0) - 982067610, (short) (android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 1), (byte) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22) - 91), android.view.KeyEvent.normalizeMetaState(0) - 107, (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) - 1808255644, objArr2);
                    throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        } else {
            java.lang.String mo26276 = ((util.h.xy.dh.m) cVar).mo26276();
            if (mo26276.length() > 0 && mo26276.charAt(0) == '#') {
                stringBuffer.append('\\');
            }
            stringBuffer.append(mo26276);
        }
        int length = stringBuffer.length();
        int i = (stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#') ? 2 : 0;
        while (i != length) {
            char charAt = stringBuffer.charAt(i);
            if (charAt != '\"' && charAt != '\\' && charAt != '+' && charAt != ',') {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i++;
                        break;
                }
            }
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoSizes("\u0000", android.graphics.Color.red(0) + 1, 1 - android.widget.ExpandableListView.getPackedPositionType(0L), 119 - android.text.TextUtils.getTrimmedLength(""), false, objArr3);
            stringBuffer.insert(i, ((java.lang.String) objArr3[0]).intern());
            i += 2;
            length++;
        }
        if (stringBuffer.length() > 0) {
            for (int i2 = 0; stringBuffer.length() > i2 && stringBuffer.charAt(i2) == ' '; i2 += 2) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoSizes("\u0000", (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1, android.graphics.Color.alpha(0) + 119, false, objArr4);
                stringBuffer.insert(i2, ((java.lang.String) objArr4[0]).intern());
            }
        }
        for (int length2 = stringBuffer.length() - 1; length2 >= 0 && stringBuffer.charAt(length2) == ' '; length2--) {
            stringBuffer.insert(length2, '\\');
        }
        return stringBuffer.toString();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static void m26450(java.lang.StringBuffer stringBuffer, util.h.xy.dw.ma maVar, java.util.Hashtable hashtable) {
        java.lang.String str = (java.lang.String) hashtable.get(maVar.m26434());
        if (str != null) {
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            stringBuffer.append(str);
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 31) % 128;
        } else {
            stringBuffer.append(maVar.m26434().m26298());
        }
        stringBuffer.append('=');
        stringBuffer.append(m26452(maVar.m26433()));
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 21) % 128;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m26457(java.lang.StringBuffer stringBuffer, util.h.xy.dw.ra raVar, java.util.Hashtable hashtable) {
        if (!raVar.m26443()) {
            if (raVar.m26442() != null) {
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 25) % 128;
                m26450(stringBuffer, raVar.m26442(), hashtable);
                return;
            }
            return;
        }
        util.h.xy.dw.ma[] m26444 = raVar.m26444();
        boolean z = true;
        for (int i = 0; i != m26444.length; i++) {
            int i2 = getHighSpeedVideoFpsRanges;
            getHighResolutionOutputSizeshNQ4ISI = (i2 + 15) % 128;
            if (z) {
                getHighResolutionOutputSizeshNQ4ISI = (i2 + 39) % 128;
                z = false;
            } else {
                stringBuffer.append('+');
            }
            m26450(stringBuffer, m26444[i], hashtable);
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.dh.c m26453(java.lang.String str, int i) throws java.io.IOException {
        int length = (str.length() - i) / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 != length; i2++) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 65) % 128;
            int i3 = (i2 * 2) + i;
            char charAt = str.charAt(i3);
            bArr[i2] = (byte) (Camera2StreamConfigurationMap(str.charAt(i3 + 1)) | (Camera2StreamConfigurationMap(charAt) << 4));
        }
        util.h.xy.dh.mi m26324 = util.h.xy.dh.mi.m26324(bArr);
        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 63) % 128;
        return m26324;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.dh.i m26456(java.lang.String str, java.util.Hashtable hashtable) {
        java.lang.String m26854 = util.h.xy.fb.rd.m26854(str);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("\r￬\u0002\u0007", 5 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 93, true, objArr);
        if (m26854.startsWith(((java.lang.String) objArr[0]).intern())) {
            return new util.h.xy.dh.i(str.substring(4));
        }
        if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
            return new util.h.xy.dh.i(str);
        }
        util.h.xy.dh.i iVar = (util.h.xy.dh.i) hashtable.get(util.h.xy.fb.rd.m26857(str));
        if (iVar != null) {
            return iVar;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges((-982067661) - (android.view.ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (short) (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (byte) ((android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 119), android.view.Gravity.getAbsoluteGravity(0, 0) - 107, (-1808255639) - android.text.TextUtils.getCapsMode("", 0, 0), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(str);
        try {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges((-982067642) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), (short) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), (byte) (android.graphics.Color.alpha(0) - 61), (-107) - android.view.View.getDefaultSize(0, 0), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1808255693, objArr3);
            sb.append(((java.lang.String) objArr3[0]).intern());
            throw new java.lang.IllegalArgumentException(sb.toString());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0189 A[SYNTHETIC] */
    /* renamed from: ˎ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static util.h.xy.dw.ra[] m26451(java.lang.String str, util.h.xy.dw.mb mbVar) {
        java.lang.String m26447;
        util.h.xy.dz.b bVar;
        util.h.xy.dz.b bVar2;
        util.h.xy.dz.b bVar3 = new util.h.xy.dz.b(str);
        util.h.xy.dw.a aVar = new util.h.xy.dw.a(mbVar);
        int i = getHighSpeedVideoFpsRanges + 13;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        int i2 = i % 2;
        while (bVar3.m26446()) {
            int i3 = getHighResolutionOutputSizeshNQ4ISI + 75;
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 == 0) {
                m26447 = bVar3.m26447();
                if (m26447.indexOf(97) > 0) {
                    util.h.xy.dz.b bVar4 = new util.h.xy.dz.b(m26447, '+');
                    bVar2 = new util.h.xy.dz.b(bVar4.m26447(), '=');
                    java.lang.String m264472 = bVar2.m26447();
                    if (bVar2.m26446()) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoSizes("\u0000\u0005\u000e\u0001\uffff\u0010\u000b\u000e\u0015ﾼ\u000f\u0010\u000e\u0005\n\u0003\ufffe�\u0000\b\u0015ﾼ\u0002\u000b\u000e\t�\u0010\u0010\u0001\u0000ﾼ", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 32, 16 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 127 - android.text.TextUtils.getOffsetAfter("", 0), false, objArr);
                        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
                    }
                    java.lang.String m264473 = bVar2.m26447();
                    util.h.xy.dh.i mo26436 = mbVar.mo26436(m264472.trim());
                    if (bVar4.m26446()) {
                        java.util.Vector vector = new java.util.Vector();
                        java.util.Vector vector2 = new java.util.Vector();
                        while (true) {
                            vector.addElement(mo26436);
                            vector2.addElement(getHighSpeedVideoFpsRanges(m264473));
                            if (bVar4.m26446()) {
                                util.h.xy.dz.b bVar5 = new util.h.xy.dz.b(bVar4.m26447(), '=');
                                java.lang.String m264474 = bVar5.m26447();
                                if (!bVar5.m26446()) {
                                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                                    getHighSpeedVideoSizes("\u0000\u0005\u000e\u0001\uffff\u0010\u000b\u000e\u0015ﾼ\u000f\u0010\u000e\u0005\n\u0003\ufffe�\u0000\b\u0015ﾼ\u0002\u000b\u000e\t�\u0010\u0010\u0001\u0000ﾼ", 32 - android.view.View.combineMeasuredStates(0, 0), 16 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 127 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), false, objArr2);
                                    throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
                                }
                                m264473 = bVar5.m26447();
                                mo26436 = mbVar.mo26436(m264474.trim());
                            } else {
                                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 17) % 128;
                                int size = vector.size();
                                util.h.xy.dh.i[] iVarArr = new util.h.xy.dh.i[size];
                                for (int i4 = 0; i4 != size; i4++) {
                                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 87) % 128;
                                    iVarArr[i4] = (util.h.xy.dh.i) vector.elementAt(i4);
                                }
                                getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 25) % 128;
                                int size2 = vector2.size();
                                java.lang.String[] strArr = new java.lang.String[size2];
                                for (int i5 = 0; i5 != size2; i5++) {
                                    strArr[i5] = (java.lang.String) vector2.elementAt(i5);
                                }
                                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 107) % 128;
                                aVar.m26429(iVarArr, strArr);
                                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 25) % 128;
                            }
                        }
                    } else {
                        aVar.m26426(mo26436, getHighSpeedVideoFpsRanges(m264473));
                    }
                } else {
                    bVar = new util.h.xy.dz.b(m26447, '=');
                    java.lang.String m264475 = bVar.m26447();
                    if (bVar.m26446()) {
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        getHighSpeedVideoSizes("\u0000\u0005\u000e\u0001\uffff\u0010\u000b\u000e\u0015ﾼ\u000f\u0010\u000e\u0005\n\u0003\ufffe�\u0000\b\u0015ﾼ\u0002\u000b\u000e\t�\u0010\u0010\u0001\u0000ﾼ", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 32, 16 - android.text.TextUtils.getCapsMode("", 0, 0), (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 126, false, objArr3);
                        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr3[0]).intern());
                    }
                    aVar.m26426(mbVar.mo26436(m264475.trim()), getHighSpeedVideoFpsRanges(bVar.m26447()));
                }
            } else {
                m26447 = bVar3.m26447();
                if (m26447.indexOf(43) > 0) {
                    util.h.xy.dz.b bVar42 = new util.h.xy.dz.b(m26447, '+');
                    bVar2 = new util.h.xy.dz.b(bVar42.m26447(), '=');
                    java.lang.String m2644722 = bVar2.m26447();
                    if (bVar2.m26446()) {
                    }
                } else {
                    bVar = new util.h.xy.dz.b(m26447, '=');
                    java.lang.String m2644752 = bVar.m26447();
                    if (bVar.m26446()) {
                    }
                }
            }
        }
        return aVar.m26427().m26431();
    }

    private static int Camera2StreamConfigurationMap(char c) {
        if ('0' <= c) {
            int i = getHighResolutionOutputSizeshNQ4ISI + 99;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 != 0 ? c <= '9' : c <= 2) {
                return c - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
            }
        }
        if ('a' <= c) {
            int i2 = getHighResolutionOutputSizeshNQ4ISI;
            int i3 = i2 + 51;
            getHighSpeedVideoFpsRanges = i3 % 128;
            if (i3 % 2 != 0 ? c <= 'f' : c <= 'O') {
                getHighSpeedVideoFpsRanges = (i2 + 97) % 128;
                return c - 'W';
            }
        }
        return c - '7';
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x012f, code lost:
    
        if (r15 > 'f') goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0121, code lost:
    
        if (r15 > '9') goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0144  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String str) {
        int i;
        boolean z;
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 117) % 128;
        if (str.length() != 0) {
            char c = '\"';
            if (str.indexOf(92) >= 0 || str.indexOf(34) >= 0) {
                char[] charArray = str.toCharArray();
                java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(str.length());
                boolean z2 = true;
                if (charArray[0] == '\\' && charArray[1] == '#') {
                    getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 83) % 128;
                    try {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRanges((-982067662) - (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (short) android.text.TextUtils.getCapsMode("", 0, 0), (byte) ((android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 110), (-107) - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) - 1808255631, objArr);
                        stringBuffer.append(((java.lang.String) objArr[0]).intern());
                        i = 2;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else {
                    i = 0;
                }
                boolean z3 = false;
                boolean z4 = false;
                int i2 = 0;
                boolean z5 = false;
                char c2 = 0;
                while (i != charArray.length) {
                    char c3 = charArray[i];
                    if (c3 != ' ') {
                        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 79) % 128;
                        z5 = z2;
                    }
                    if (c3 == c) {
                        int i3 = getHighResolutionOutputSizeshNQ4ISI;
                        int i4 = i3 + 29;
                        getHighSpeedVideoFpsRanges = i4 % 128;
                        if (i4 % 2 == 0) {
                            throw null;
                        }
                        if (z3) {
                            stringBuffer.append(c3);
                        } else if (z4) {
                            z4 = false;
                        } else {
                            getHighSpeedVideoFpsRanges = (i3 + 121) % 128;
                            z4 = true;
                        }
                        getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 93) % 128;
                    } else {
                        if (c3 != '\\' || z3 || z4) {
                            if (c3 == ' ') {
                                getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 83) % 128;
                                if (!z3 && !z5) {
                                }
                            }
                            if (z3) {
                                int i5 = getHighSpeedVideoFpsRanges;
                                int i6 = i5 + 69;
                                getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
                                if (i6 % 2 == 0 ? '0' <= c3 : '}' <= c3) {
                                }
                                if ('a' <= c3) {
                                    getHighResolutionOutputSizeshNQ4ISI = (i5 + 25) % 128;
                                }
                                if ('A' > c3 || c3 > 'F') {
                                    z = false;
                                    getHighResolutionOutputSizeshNQ4ISI = (i5 + 31) % 128;
                                    if (z) {
                                        if (c2 != 0) {
                                            int i7 = i5 + 27;
                                            getHighResolutionOutputSizeshNQ4ISI = i7 % 128;
                                            if (i7 % 2 != 0) {
                                                stringBuffer.append((char) ((Camera2StreamConfigurationMap(c2) % 75) * Camera2StreamConfigurationMap(c3)));
                                                c2 = 1;
                                            } else {
                                                stringBuffer.append((char) ((Camera2StreamConfigurationMap(c2) * 16) + Camera2StreamConfigurationMap(c3)));
                                                z3 = false;
                                                c2 = 0;
                                            }
                                        } else {
                                            c2 = c3;
                                        }
                                    }
                                }
                                z = true;
                                getHighResolutionOutputSizeshNQ4ISI = (i5 + 31) % 128;
                                if (z) {
                                }
                            }
                            stringBuffer.append(c3);
                        } else {
                            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 109) % 128;
                            i2 = stringBuffer.length();
                            z3 = true;
                        }
                        i++;
                        c = '\"';
                        z2 = true;
                    }
                    z3 = false;
                    i++;
                    c = '\"';
                    z2 = true;
                }
                if (stringBuffer.length() > 0) {
                    while (stringBuffer.charAt(stringBuffer.length() - 1) == ' ' && i2 != stringBuffer.length() - 1) {
                        int i8 = getHighResolutionOutputSizeshNQ4ISI + 121;
                        getHighSpeedVideoFpsRanges = i8 % 128;
                        stringBuffer.setLength(i8 % 2 == 0 ? stringBuffer.length() >> 1 : stringBuffer.length() - 1);
                    }
                }
                return stringBuffer.toString();
            }
        }
        return str.trim();
    }
}
