package util.h.xy.dh;

/* loaded from: classes5.dex */
public class me extends util.h.xy.dh.mi {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    static final util.h.xy.dh.p getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes = 1;
    private static int[] getHighSpeedVideoSizesFor;
    private static char[] getInputFormats;
    private static int getOutputMinFrameDuration;
    final byte[] getHighSpeedVideoFpsRanges;

    private static void Camera2StreamConfigurationMap(int[] iArr, int i, java.lang.Object[] objArr) {
        int length;
        int[] iArr2;
        int i2;
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = getHighSpeedVideoSizesFor;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i3 = 0;
            while (i3 < length2) {
                int i4 = (getHighResolutionOutputSizeshNQ4ISI + 15) % 128;
                Camera2StreamConfigurationMap = i4;
                iArr4[i3] = (int) (iArr3[i3] ^ (-5569649899877129369L));
                i3++;
                getHighResolutionOutputSizeshNQ4ISI = (i4 + 3) % 128;
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = getHighSpeedVideoSizesFor;
        if (iArr6 != null) {
            int i5 = Camera2StreamConfigurationMap + 35;
            getHighResolutionOutputSizeshNQ4ISI = i5 % 128;
            if (i5 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                iArr2[i2] = (int) (iArr6[i2] ^ (-5569649899877129369L));
                i2++;
                length = length;
            }
            iArr6 = iArr2;
        }
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length3);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 85) % 128;
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr5);
            for (int i6 = 0; i6 < 16; i6++) {
                cVar.f2627 ^= iArr5[i6];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i7 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i7;
            }
            int i8 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i8;
            cVar.f2625 ^= iArr5[16];
            cVar.f2627 ^= iArr5[17];
            int i9 = cVar.f2627;
            int i10 = cVar.f2625;
            cArr[0] = (char) (cVar.f2627 >>> 16);
            cArr[1] = (char) cVar.f2627;
            cArr[2] = (char) (cVar.f2625 >>> 16);
            cArr[3] = (char) cVar.f2625;
            util.h.xz.b.c.m27723(iArr5);
            cArr2[cVar.f2626 * 2] = cArr[0];
            cArr2[(cVar.f2626 * 2) + 1] = cArr[1];
            cArr2[(cVar.f2626 * 2) + 2] = cArr[2];
            cArr2[(cVar.f2626 * 2) + 3] = cArr[3];
            cVar.f2626 += 2;
        }
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    private static void getHighSpeedVideoFpsRanges(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        char[] cArr;
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr2 = getInputFormats;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                cArr3[i5] = (char) (cArr2[i5] ^ (-8125198844289309347L));
                i5++;
                int i6 = Camera2StreamConfigurationMap + 9;
                getHighResolutionOutputSizeshNQ4ISI = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 5 / 5;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i2];
        java.lang.System.arraycopy(cArr2, i, cArr4, 0, i2);
        if (bytes != null) {
            int i8 = Camera2StreamConfigurationMap + 15;
            getHighResolutionOutputSizeshNQ4ISI = i8 % 128;
            if (i8 % 2 == 0) {
                cArr = new char[i2];
                maVar.f2631 = 1;
            } else {
                cArr = new char[i2];
                maVar.f2631 = 0;
            }
            char c = 0;
            while (maVar.f2631 < i2) {
                if (bytes[maVar.f2631] == 1) {
                    cArr[maVar.f2631] = (char) (((cArr4[maVar.f2631] * 2) + 1) - c);
                } else {
                    cArr[maVar.f2631] = (char) ((cArr4[maVar.f2631] * 2) - c);
                }
                c = cArr[maVar.f2631];
                maVar.f2631++;
            }
            cArr4 = cArr;
        }
        if (i4 > 0) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 27) % 128;
            char[] cArr5 = new char[i2];
            java.lang.System.arraycopy(cArr4, 0, cArr5, 0, i2);
            int i9 = i2 - i4;
            java.lang.System.arraycopy(cArr5, 0, cArr4, i9, i4);
            java.lang.System.arraycopy(cArr5, i4, cArr4, 0, i9);
        }
        if (z) {
            char[] cArr6 = new char[i2];
            maVar.f2631 = 0;
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 27) % 128;
            while (maVar.f2631 < i2) {
                cArr6[maVar.f2631] = cArr4[(i2 - maVar.f2631) - 1];
                maVar.f2631++;
            }
            cArr4 = cArr6;
        }
        if (i3 > 0) {
            getHighResolutionOutputSizeshNQ4ISI = (Camera2StreamConfigurationMap + 27) % 128;
            maVar.f2631 = 0;
            while (maVar.f2631 < i2) {
                cArr4[maVar.f2631] = (char) (cArr4[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    static {
        getHighSpeedVideoFpsRanges();
        getHighSpeedVideoFpsRangesFor = new util.h.xy.dh.p(util.h.xy.dh.me.class) { // from class: util.h.xy.dh.me.2
            private static int getHighResolutionOutputSizeshNQ4ISI = 1;
            private static int getHighSpeedVideoSizes;

            @Override // util.h.xy.dh.p
            final util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(util.h.xy.dh.mz mzVar) {
                int i = getHighResolutionOutputSizeshNQ4ISI + 35;
                getHighSpeedVideoSizes = i % 128;
                byte[] m26337 = mzVar.m26337();
                if (i % 2 != 0) {
                    util.h.xy.dh.me.Camera2StreamConfigurationMap(m26337);
                    throw null;
                }
                util.h.xy.dh.me Camera2StreamConfigurationMap2 = util.h.xy.dh.me.Camera2StreamConfigurationMap(m26337);
                getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 101) % 128;
                return Camera2StreamConfigurationMap2;
            }
        };
        getOutputMinFrameDuration = (getHighSpeedVideoSizes + 5) % 128;
    }

    static util.h.xy.dh.me Camera2StreamConfigurationMap(byte[] bArr) {
        util.h.xy.dh.me meVar = new util.h.xy.dh.me(bArr);
        int i = getOutputMinFrameDuration + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            return meVar;
        }
        throw null;
    }

    @Override // util.h.xy.dh.mi, util.h.xy.dh.mh
    public int hashCode() {
        int i = getOutputMinFrameDuration + 39;
        getHighSpeedVideoSizes = i % 128;
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        if (i % 2 != 0) {
            return util.h.xy.fb.a.m26817(bArr);
        }
        util.h.xy.fb.a.m26817(bArr);
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar) {
        if (miVar instanceof util.h.xy.dh.me) {
            return util.h.xy.fb.a.m26820(this.getHighSpeedVideoFpsRanges, ((util.h.xy.dh.me) miVar).getHighSpeedVideoFpsRanges);
        }
        int i = getHighSpeedVideoSizes;
        getOutputMinFrameDuration = (i + 3) % 128;
        getOutputMinFrameDuration = (i + 47) % 128;
        return false;
    }

    @Override // util.h.xy.dh.mi
    util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor() {
        util.h.xy.dh.rx rxVar = new util.h.xy.dh.rx(this.getHighSpeedVideoFpsRanges);
        getHighSpeedVideoSizes = (getOutputMinFrameDuration + 73) % 128;
        return rxVar;
    }

    @Override // util.h.xy.dh.mi
    util.h.xy.dh.mi Camera2StreamConfigurationMap() {
        util.h.xy.dh.rx rxVar = new util.h.xy.dh.rx(this.getHighSpeedVideoFpsRanges);
        int i = getHighSpeedVideoSizes + 87;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            return rxVar;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mi
    void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.rj rjVar, boolean z) throws java.io.IOException {
        getHighSpeedVideoSizes = (getOutputMinFrameDuration + 55) % 128;
        rjVar.getHighSpeedVideoSizes(z, 24, this.getHighSpeedVideoFpsRanges);
        getOutputMinFrameDuration = (getHighSpeedVideoSizes + 103) % 128;
    }

    @Override // util.h.xy.dh.mi
    int getHighSpeedVideoFpsRanges(boolean z) {
        int i = getOutputMinFrameDuration + 35;
        getHighSpeedVideoSizes = i % 128;
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        if (i % 2 != 0) {
            return util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, bArr.length);
        }
        util.h.xy.dh.rj.getHighSpeedVideoFpsRangesFor(z, bArr.length);
        throw null;
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        int i = (getOutputMinFrameDuration + 53) % 128;
        getHighSpeedVideoSizes = i;
        getOutputMinFrameDuration = (i + 105) % 128;
        return false;
    }

    private boolean getHighSpeedVideoFpsRanges(int i) {
        boolean z;
        byte[] bArr = this.getHighSpeedVideoFpsRanges;
        if (bArr.length > i) {
            getOutputMinFrameDuration = (getHighSpeedVideoSizes + 57) % 128;
            byte b = bArr[i];
            if (b >= 48 && b <= 57) {
                z = true;
                getOutputMinFrameDuration = (getHighSpeedVideoSizes + 1) % 128;
                return z;
            }
        }
        z = false;
        getOutputMinFrameDuration = (getHighSpeedVideoSizes + 1) % 128;
        return z;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    protected boolean m26313() {
        if (getHighSpeedVideoFpsRanges(10)) {
            int i = getHighSpeedVideoSizes + 113;
            getOutputMinFrameDuration = i % 128;
            if (i % 2 == 0 ? getHighSpeedVideoFpsRanges(11) : getHighSpeedVideoFpsRanges(104)) {
                getHighSpeedVideoSizes = (getOutputMinFrameDuration + 49) % 128;
                return true;
            }
        }
        getHighSpeedVideoSizes = (getOutputMinFrameDuration + 109) % 128;
        return false;
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    protected boolean m26315() {
        getHighSpeedVideoSizes = (getOutputMinFrameDuration + 101) % 128;
        boolean z = getHighSpeedVideoFpsRanges(12) && getHighSpeedVideoFpsRanges(13);
        int i = getHighSpeedVideoSizes + 39;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    protected boolean m26312() {
        int i = 0;
        while (true) {
            byte[] bArr = this.getHighSpeedVideoFpsRanges;
            if (i == bArr.length) {
                int i2 = getOutputMinFrameDuration + 21;
                getHighSpeedVideoSizes = i2 % 128;
                if (i2 % 2 != 0) {
                    return false;
                }
                throw new java.lang.ArithmeticException();
            }
            if (bArr[i] == 46) {
                int i3 = getOutputMinFrameDuration + 9;
                getHighSpeedVideoSizes = i3 % 128;
                if (i3 % 2 == 0) {
                    if (i == 79) {
                        return true;
                    }
                } else if (i == 14) {
                    return true;
                }
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x01ac  */
    /* renamed from: ι, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.util.Date m26316() throws java.text.ParseException {
        java.text.SimpleDateFormat highSpeedVideoSizes;
        java.text.SimpleDateFormat simpleDateFormat;
        java.util.SimpleTimeZone simpleTimeZone;
        getHighSpeedVideoSizes = (getOutputMinFrameDuration + 7) % 128;
        java.lang.String m26855 = util.h.xy.fb.rd.m26855(this.getHighSpeedVideoFpsRanges);
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{-1786616067, 975633127}, 1 - android.graphics.Color.red(0), objArr);
        if (m26855.endsWith(((java.lang.String) objArr[0]).intern())) {
            getHighSpeedVideoSizes = (getOutputMinFrameDuration + 79) % 128;
            if (m26312()) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(false, new int[]{146, 21, 0, 0}, "\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0001", objArr2);
                highSpeedVideoSizes = new java.text.SimpleDateFormat(((java.lang.String) objArr2[0]).intern());
            } else if (m26315()) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(new int[]{229116556, 725447590, 98359734, -1595579863, 1786190148, 68337178, 592906374, -702546382, 1274907609, 1305882453}, android.text.TextUtils.getTrimmedLength("") + 17, objArr3);
                highSpeedVideoSizes = new java.text.SimpleDateFormat(((java.lang.String) objArr3[0]).intern());
            } else if (m26313()) {
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(false, new int[]{167, 15, 11, 0}, "\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001", objArr4);
                highSpeedVideoSizes = new java.text.SimpleDateFormat(((java.lang.String) objArr4[0]).intern());
            } else {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(false, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, 13, 0, 0}, "\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001", objArr5);
                highSpeedVideoSizes = new java.text.SimpleDateFormat(((java.lang.String) objArr5[0]).intern());
            }
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{-1786616067, 975633127}, android.view.KeyEvent.getDeadChar(0, 0) + 1, objArr6);
            simpleTimeZone = new java.util.SimpleTimeZone(0, ((java.lang.String) objArr6[0]).intern());
        } else {
            if (m26855.indexOf(45) > 0 || m26855.indexOf(43) > 0) {
                m26855 = m26314();
                highSpeedVideoSizes = getHighSpeedVideoSizes();
                if (m26312()) {
                    m26855 = getHighSpeedVideoFpsRangesFor(m26855);
                }
                return util.h.xy.dh.az.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes.parse(m26855));
            }
            if (m26312()) {
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, 18, 43, 0}, "\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000", objArr7);
                simpleDateFormat = new java.text.SimpleDateFormat(((java.lang.String) objArr7[0]).intern());
                getHighSpeedVideoSizes = (getOutputMinFrameDuration + 31) % 128;
            } else if (m26315()) {
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(new int[]{229116556, 725447590, 98359734, -1595579863, 1786190148, 68337178, 1973526841, -1810185430}, 15 - (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr8);
                simpleDateFormat = new java.text.SimpleDateFormat(((java.lang.String) objArr8[0]).intern());
            } else if (m26313()) {
                java.lang.Object[] objArr9 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE, 12, 85, 0}, "\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000", objArr9);
                simpleDateFormat = new java.text.SimpleDateFormat(((java.lang.String) objArr9[0]).intern());
            } else {
                java.lang.Object[] objArr10 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(new int[]{229116556, 725447590, 98359734, -1595579863, -1024687576, -163604908}, 10 - android.view.View.MeasureSpec.getMode(0), objArr10);
                simpleDateFormat = new java.text.SimpleDateFormat(((java.lang.String) objArr10[0]).intern());
            }
            highSpeedVideoSizes = simpleDateFormat;
            simpleTimeZone = new java.util.SimpleTimeZone(0, java.util.TimeZone.getDefault().getID());
        }
        highSpeedVideoSizes.setTimeZone(simpleTimeZone);
        if (m26312()) {
        }
        return util.h.xy.dh.az.getHighSpeedVideoFpsRangesFor(highSpeedVideoSizes.parse(m26855));
    }

    private static java.lang.String getHighSpeedVideoSizes(int i) {
        int i2 = getOutputMinFrameDuration + 1;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 != 0 ? i >= 10 : i >= 92) {
            java.lang.String num = java.lang.Integer.toString(i);
            getOutputMinFrameDuration = (getHighSpeedVideoSizes + 19) % 128;
            return num;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{1785144704, -1148669968}, android.text.TextUtils.indexOf("", "") + 1, objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(i);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002f A[LOOP:0: B:2:0x0008->B:10:0x002f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a A[EDGE_INSN: B:11:0x003a->B:12:0x003a BREAK  A[LOOP:0: B:2:0x0008->B:10:0x002f], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        java.lang.String obj;
        java.lang.StringBuilder sb;
        char charAt;
        java.lang.String substring = str.substring(14);
        int i = 1;
        while (i < substring.length()) {
            int i2 = getHighSpeedVideoSizes + 87;
            getOutputMinFrameDuration = i2 % 128;
            if (i2 % 2 != 0) {
                charAt = substring.charAt(i);
                if ('\n' > charAt) {
                    break;
                }
                if (charAt <= '9') {
                    break;
                }
                i++;
                getOutputMinFrameDuration = (getHighSpeedVideoSizes + 87) % 128;
            } else {
                charAt = substring.charAt(i);
                if ('0' > charAt) {
                    break;
                }
                if (charAt <= '9') {
                }
            }
        }
        int i3 = i - 1;
        if (i3 > 3) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(substring.substring(0, 4));
            sb2.append(substring.substring(i));
            obj = sb2.toString();
            sb = new java.lang.StringBuilder();
        } else if (i3 == 1) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
            sb3.append(substring.substring(0, i));
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(true, new int[]{144, 2, 0, 0}, "\u0000\u0000", objArr);
            sb3.append(((java.lang.String) objArr[0]).intern());
            sb3.append(substring.substring(i));
            obj = sb3.toString();
            sb = new java.lang.StringBuilder();
        } else {
            if (i3 != 2) {
                return str;
            }
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
            sb4.append(substring.substring(0, i));
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{1785144704, -1148669968}, -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), objArr2);
            sb4.append(((java.lang.String) objArr2[0]).intern());
            sb4.append(substring.substring(i));
            obj = sb4.toString();
            sb = new java.lang.StringBuilder();
        }
        sb.append(str.substring(0, 14));
        sb.append(obj);
        return sb.toString();
    }

    private java.text.SimpleDateFormat getHighSpeedVideoSizes() {
        java.text.SimpleDateFormat simpleDateFormat;
        int i = getOutputMinFrameDuration + 53;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            m26312();
            throw null;
        }
        if (m26312()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{229116556, 725447590, 98359734, -1595579863, 1786190148, 68337178, -1221141609, -1477781294, -542922421, -920696103}, android.view.KeyEvent.normalizeMetaState(0) + 19, objArr);
            simpleDateFormat = new java.text.SimpleDateFormat(((java.lang.String) objArr[0]).intern());
        } else if (m26315()) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(false, new int[]{105, 15, 0, 0}, "\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001", objArr2);
            simpleDateFormat = new java.text.SimpleDateFormat(((java.lang.String) objArr2[0]).intern());
        } else if (m26313()) {
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(false, new int[]{120, 13, 0, 0}, "\u0001\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001", objArr3);
            simpleDateFormat = new java.text.SimpleDateFormat(((java.lang.String) objArr3[0]).intern());
        } else {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 11, 90, 0}, "\u0000\u0000\u0000\u0000\u0000\u0001\u0000\u0000\u0000\u0000\u0000", objArr4);
            simpleDateFormat = new java.text.SimpleDateFormat(((java.lang.String) objArr4[0]).intern());
            getOutputMinFrameDuration = (getHighSpeedVideoSizes + 101) % 128;
        }
        java.lang.Object[] objArr5 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{-1786616067, 975633127}, (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr5);
        simpleDateFormat.setTimeZone(new java.util.SimpleTimeZone(0, ((java.lang.String) objArr5[0]).intern()));
        return simpleDateFormat;
    }

    private java.lang.String getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) {
        java.lang.Object obj;
        getHighSpeedVideoSizes = (getOutputMinFrameDuration + 63) % 128;
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{-823958775, -327785914}, -android.widget.ExpandableListView.getPackedPositionChild(0L), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.util.TimeZone timeZone = java.util.TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            int i = getHighSpeedVideoSizes + 15;
            getOutputMinFrameDuration = i % 128;
            if (i % 2 != 0) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(false, new int[]{104, 1, 0, 1}, "\u0001", objArr2);
                obj = objArr2[0];
            } else {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(true, new int[]{104, 1, 0, 1}, "\u0001", objArr3);
                obj = objArr3[0];
            }
            intern = ((java.lang.String) obj).intern();
            rawOffset = -rawOffset;
        }
        int i2 = rawOffset / com.adjust.sdk.Constants.ONE_HOUR;
        int i3 = (rawOffset - (com.adjust.sdk.Constants.ONE_HOUR * i2)) / 60000;
        try {
            if (timeZone.useDaylightTime()) {
                java.lang.String highSpeedVideoFpsRangesFor = m26312() ? getHighSpeedVideoFpsRangesFor(str) : str;
                java.text.SimpleDateFormat highSpeedVideoSizes = getHighSpeedVideoSizes();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(highSpeedVideoFpsRangesFor);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(new int[]{-1554494393, 649946838}, (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16) + 3, objArr4);
                sb.append(((java.lang.String) objArr4[0]).intern());
                sb.append(intern);
                sb.append(getHighSpeedVideoSizes(i2));
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges(false, new int[]{103, 1, 0, 1}, "\u0000", objArr5);
                sb.append(((java.lang.String) objArr5[0]).intern());
                sb.append(getHighSpeedVideoSizes(i3));
                if (timeZone.inDaylightTime(highSpeedVideoSizes.parse(sb.toString()))) {
                    int[] iArr = {-823958775, -327785914};
                    getHighSpeedVideoSizes = (getOutputMinFrameDuration + 19) % 128;
                    try {
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(iArr, (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 1, objArr6);
                        i2 += intern.equals(((java.lang.String) objArr6[0]).intern()) ? 1 : -1;
                    } catch (java.lang.Throwable th) {
                        java.lang.Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
            }
        } catch (java.text.ParseException unused) {
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{-1554494393, 649946838}, 3 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8), objArr7);
        sb2.append(((java.lang.String) objArr7[0]).intern());
        sb2.append(intern);
        sb2.append(getHighSpeedVideoSizes(i2));
        java.lang.Object[] objArr8 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(false, new int[]{103, 1, 0, 1}, "\u0000", objArr8);
        sb2.append(((java.lang.String) objArr8[0]).intern());
        sb2.append(getHighSpeedVideoSizes(i3));
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0091 A[ADDED_TO_REGION] */
    /* renamed from: ˋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String m26314() {
        char charAt;
        java.lang.String substring;
        java.lang.StringBuilder sb;
        java.lang.Object obj;
        java.lang.String m26855 = util.h.xy.fb.rd.m26855(this.getHighSpeedVideoFpsRanges);
        if (m26855.charAt(m26855.length() - 1) != 'Z') {
            int length = m26855.length();
            char charAt2 = m26855.charAt(length - 6);
            if (charAt2 != '-') {
                int i = getOutputMinFrameDuration + 115;
                getHighSpeedVideoSizes = i % 128;
                if (i % 2 == 0) {
                    int length2 = m26855.length();
                    int i2 = length2 - 5;
                    charAt = m26855.charAt(i2);
                    if (charAt != '-') {
                    }
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                    sb2.append(m26855.substring(0, i2));
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(new int[]{-1554494393, 649946838}, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3, objArr);
                    sb2.append(((java.lang.String) objArr[0]).intern());
                    int i3 = length2 - 2;
                    sb2.append(m26855.substring(i2, i3));
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(false, new int[]{103, 1, 0, 1}, "\u0000", objArr2);
                    sb2.append(((java.lang.String) objArr2[0]).intern());
                    substring = m26855.substring(i3);
                    sb = sb2;
                    sb.append(substring);
                    return sb.toString();
                }
                int length22 = m26855.length();
                int i22 = length22 - 5;
                charAt = m26855.charAt(i22);
                if (charAt != '-' || charAt == '+') {
                    java.lang.StringBuilder sb22 = new java.lang.StringBuilder();
                    sb22.append(m26855.substring(0, i22));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(new int[]{-1554494393, 649946838}, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3, objArr3);
                    sb22.append(((java.lang.String) objArr3[0]).intern());
                    int i32 = length22 - 2;
                    sb22.append(m26855.substring(i22, i32));
                    java.lang.Object[] objArr22 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges(false, new int[]{103, 1, 0, 1}, "\u0000", objArr22);
                    sb22.append(((java.lang.String) objArr22[0]).intern());
                    substring = m26855.substring(i32);
                    sb = sb22;
                    sb.append(substring);
                    return sb.toString();
                }
                int length3 = m26855.length() - 3;
                char charAt3 = m26855.charAt(length3);
                if (charAt3 != '-') {
                    getOutputMinFrameDuration = (getHighSpeedVideoSizes + 41) % 128;
                    if (charAt3 != '+') {
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                        sb3.append(m26855);
                        sb3.append(getHighResolutionOutputSizeshNQ4ISI(m26855));
                        java.lang.String obj2 = sb3.toString();
                        int i4 = getHighSpeedVideoSizes + 91;
                        getOutputMinFrameDuration = i4 % 128;
                        if (i4 % 2 == 0) {
                            return obj2;
                        }
                        throw null;
                    }
                }
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder();
                sb4.append(m26855.substring(0, length3));
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(new int[]{-1554494393, 649946838}, 3 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr4);
                sb4.append(((java.lang.String) objArr4[0]).intern());
                sb4.append(m26855.substring(length3));
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(new int[]{1890144821, -1866739524}, 3 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), objArr5);
                obj = objArr5[0];
                sb = sb4;
            }
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{-1554494393, 649946838}, 3 - android.view.View.resolveSize(0, 0), objArr6);
            if (m26855.indexOf(((java.lang.String) objArr6[0]).intern()) == length - 9) {
                return m26855;
            }
            int length222 = m26855.length();
            int i222 = length222 - 5;
            charAt = m26855.charAt(i222);
            if (charAt != '-') {
            }
            java.lang.StringBuilder sb222 = new java.lang.StringBuilder();
            sb222.append(m26855.substring(0, i222));
            java.lang.Object[] objArr32 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{-1554494393, 649946838}, (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 3, objArr32);
            sb222.append(((java.lang.String) objArr32[0]).intern());
            int i322 = length222 - 2;
            sb222.append(m26855.substring(i222, i322));
            java.lang.Object[] objArr222 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(false, new int[]{103, 1, 0, 1}, "\u0000", objArr222);
            sb222.append(((java.lang.String) objArr222[0]).intern());
            substring = m26855.substring(i322);
            sb = sb222;
            sb.append(substring);
            return sb.toString();
        }
        sb = new java.lang.StringBuilder();
        sb.append(m26855.substring(0, m26855.length() - 1));
        java.lang.Object[] objArr7 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges(false, new int[]{94, 9, 102, 8}, "\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001", objArr7);
        obj = objArr7[0];
        substring = ((java.lang.String) obj).intern();
        sb.append(substring);
        return sb.toString();
    }

    me(byte[] bArr) {
        if (bArr.length < 4) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(true, new int[]{62, 32, 0, 4}, "\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001", objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        this.getHighSpeedVideoFpsRanges = bArr;
        if (getHighSpeedVideoFpsRanges(0) && getHighSpeedVideoFpsRanges(1) && getHighSpeedVideoFpsRanges(2) && getHighSpeedVideoFpsRanges(3)) {
            return;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{1162991918, -1724101173, -355932237, 1721862361, 163815600, 1974177718, 1876261984, 860207395, -1314072666, 157287320, -1929551202, -480520152, -1121575569, 508015754, -1841826356, -55349385, 1524221601, -1323057929, -1496021200, -388036079, 1106458505, -1332130976}, (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44, objArr2);
        throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
    }

    public me(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = util.h.xy.fb.rd.m26856(str);
        try {
            m26316();
        } catch (java.text.ParseException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{-1754959098, 2119238355, -524269147, -406365206, 1182909155, -2025049052, -961160079, 1370052265, -516644925, 200041951, 180613836, -466417296}, android.text.TextUtils.getOffsetAfter("", 0) + 21, objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e.getMessage());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
    }

    static void getHighSpeedVideoFpsRanges() {
        getInputFormats = new char[]{42359, 42300, 42462, 42437, 42433, 42438, 42435, 42490, 42489, 42450, 42447, 42493, 42439, 42282, 42278, 42434, 42277, 42272, 42489, 42489, 42491, 42434, 42283, 42282, 42435, 42434, 42439, 42432, 42432, 42433, 42432, 42347, 42279, 42433, 42476, 42472, 42473, 42474, 42397, 42464, 42485, 42486, 42468, 42478, 42445, 42441, 42469, 42444, 42442, 42469, 42476, 42473, 42478, 42472, 42441, 42446, 42478, 42476, 42478, 42472, 42468, 42474, 42351, 42292, 42292, 42251, 42240, 42286, 42285, 42294, 42288, 42260, 42266, 42290, 42284, 42263, 42270, 42295, 42294, 42288, 42286, 42286, 42260, 42271, 42292, 42294, 42243, 42241, 42297, 42290, 42284, 42295, 42299, 42292, 42244, 42475, 42488, 42446, 42443, 42438, 42438, 42443, 42492, 42304, 42315, 42337, 42276, 42276, 42276, 42302, 42256, 42245, 42297, 42251, 42261, 42247, 42288, 42285, 42286, 42283, 42337, 42276, 42276, 42276, 42302, 42256, 42245, 42297, 42251, 42261, 42247, 42288, 42286, 42295, 42470, 42495, 42477, 42467, 42479, 42490, 42464, 42382, 42382, 42382, 42309, 42349, 42337, 42276, 42276, 42276, 42302, 42256, 42245, 42297, 42251, 42261, 42247, 42288, 42285, 42286, 42253, 42269, 42254, 42254, 42336, 42269, 42269, 42271, 42457, 42457, 42457, 42291, 42245, 42302, 42290, 42300, 42254, 42296, 42277, 42248, 42262, 42262, 42337, 42276, 42276, 42276, 42302, 42256, 42245, 42297, 42251, 42261, 42346, 42269, 42269, 42338, 42275, 42275, 42294, 42278, 42435, 42438, 42437, 42456, 42286, 42460, 42450, 42462, 42277, 42451, 42489, 42489, 42489, 42300, 42399, 42482, 42432, 42486, 42468, 42480, 42495, 42469, 42387, 42387, 42387};
        getHighSpeedVideoSizesFor = new int[]{601786229, -368455744, -577490096, -145192258, 1992305370, 1661664053, -59096491, 730387051, 2001488998, 1464086465, -1189380048, 1771514656, 1277620192, -139053615, 955621773, -33472803, -1326816415, -369696329};
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.dh.me m26311(java.lang.Object obj) {
        if (obj == null || (obj instanceof util.h.xy.dh.me)) {
            util.h.xy.dh.me meVar = (util.h.xy.dh.me) obj;
            int i = getOutputMinFrameDuration + 13;
            getHighSpeedVideoSizes = i % 128;
            if (i % 2 != 0) {
                return meVar;
            }
            throw new java.lang.ArithmeticException();
        }
        if (obj instanceof util.h.xy.dh.c) {
            int i2 = getOutputMinFrameDuration + 55;
            getHighSpeedVideoSizes = i2 % 128;
            util.h.xy.dh.mi mo26279 = ((util.h.xy.dh.c) obj).mo26279();
            if (i2 % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            if (mo26279 instanceof util.h.xy.dh.me) {
                return (util.h.xy.dh.me) mo26279;
            }
        }
        if (!(obj instanceof byte[])) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(true, new int[]{31, 31, 77, 0}, "\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001", objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(obj.getClass().getName());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        try {
            return (util.h.xy.dh.me) getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges((byte[]) obj);
        } catch (java.lang.Exception e) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges(true, new int[]{0, 31, 52, 0}, "\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001", objArr2);
            sb2.append(((java.lang.String) objArr2[0]).intern());
            sb2.append(e.toString());
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
    }
}
