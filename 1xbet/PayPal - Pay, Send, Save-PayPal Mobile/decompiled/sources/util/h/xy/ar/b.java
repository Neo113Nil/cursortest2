package util.h.xy.ar;

/* loaded from: classes5.dex */
public final class b {
    private static int Camera2StreamConfigurationMap = 1;
    private static long getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 1;
    private static char getInputFormats;
    private static final char[] getInputSizeshNQ4ISI;
    private static final java.lang.String getOutputFormats;
    private static long getOutputMinFrameDuration;

    static {
        getHighSpeedVideoSizes();
        getOutputFormats = util.h.xy.ar.b.class.getName();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("虿虏姖埂ꞇ믿茌뻟\u1f5aꥐ\uef17쩤\uf76f⚢㛌㊅⾀\uee73綼紽", (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr);
        getInputSizeshNQ4ISI = ((java.lang.String) objArr[0]).intern().toCharArray();
        getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 71) % 128;
    }

    private b() {
    }

    private static void getHighSpeedVideoSizes(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 29) % 128;
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L)));
            aVar.f2623++;
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 125) % 128;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static java.lang.String[] m25104(java.lang.String[] strArr) {
        if (strArr != null) {
            java.lang.String[] strArr2 = (java.lang.String[]) java.util.Arrays.copyOf(strArr, strArr.length);
            getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 91) % 128;
            return strArr2;
        }
        int i = (getHighSpeedVideoSizesFor + 71) % 128;
        getHighSpeedVideoSizes = i;
        getHighSpeedVideoSizesFor = (i + 51) % 128;
        return null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m25103(byte[] bArr) {
        if (bArr == null) {
            int i = getHighSpeedVideoSizesFor + 99;
            getHighSpeedVideoSizes = i % 128;
            if (i % 2 == 0) {
                return null;
            }
            throw null;
        }
        byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
        int i2 = getHighSpeedVideoSizesFor + 117;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return copyOf;
        }
        throw null;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m25100(byte[]... bArr) {
        int i = getHighSpeedVideoSizesFor;
        getHighSpeedVideoSizes = (i + 117) % 128;
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        getHighSpeedVideoSizes = (i + 91) % 128;
        for (byte[] bArr2 : bArr) {
            m25095(bArr2);
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static void m25095(byte[] bArr) {
        int i = getHighSpeedVideoSizesFor + 37;
        int i2 = i % 128;
        getHighSpeedVideoSizes = i2;
        if (i % 2 != 0) {
            throw null;
        }
        if (bArr == null) {
            return;
        }
        int length = bArr.length;
        if (length == 0) {
            int i3 = i2 + 27;
            getHighSpeedVideoSizesFor = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        for (int i4 = 0; i4 < length; i4++) {
            bArr[i4] = 0;
        }
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 29) % 128;
        char[] charArray = str3.toCharArray();
        int i2 = Camera2StreamConfigurationMap + 95;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray2 = str2.toCharArray();
        char[] charArray3 = str.toCharArray();
        util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
        int length = charArray2.length;
        char[] cArr = new char[length];
        int length2 = charArray.length;
        char[] cArr2 = new char[length2];
        java.lang.System.arraycopy(charArray2, 0, cArr, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c);
        cArr2[2] = (char) (cArr2[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr3 = new char[length3];
        rcVar.f2652 = 0;
        while (rcVar.f2652 < length3) {
            int i3 = (rcVar.f2652 + 2) % 4;
            int i4 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i3]) % 65535);
            cArr2[i4] = (char) (((cArr[i4] * 32718) + cArr2[i3]) / 65535);
            cArr[i4] = rcVar.f2653;
            cArr3[rcVar.f2652] = (char) ((((cArr[i4] ^ charArray3[rcVar.f2652]) ^ (getOutputMinFrameDuration ^ 2457411417541981002L)) ^ ((int) (getHighSpeedVideoFpsRanges ^ 2457411417541981002L))) ^ ((char) (getInputFormats ^ 2457411417541981002L)));
            rcVar.f2652++;
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m25090(byte[]... bArr) {
        if (bArr == null) {
            return new byte[0];
        }
        if (bArr.length == 1) {
            return bArr[0];
        }
        int i = 0;
        for (byte[] bArr2 : bArr) {
            int i2 = getHighSpeedVideoSizes;
            getHighSpeedVideoSizesFor = (i2 + 109) % 128;
            if (bArr2 != null) {
                i += bArr2.length;
                getHighSpeedVideoSizesFor = (i2 + 117) % 128;
            }
        }
        byte[] bArr3 = new byte[i];
        int length = bArr.length;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = getHighSpeedVideoSizesFor + 87;
            getHighSpeedVideoSizes = i5 % 128;
            if (i5 % 2 == 0) {
                byte[] bArr4 = bArr[i4];
                if (bArr4 != null) {
                    java.lang.System.arraycopy(bArr4, 0, bArr3, i3, bArr4.length);
                    i3 += bArr4.length;
                }
            } else {
                byte[] bArr5 = bArr[i4];
                throw null;
            }
        }
        return bArr3;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static byte[] m25081(int i, boolean z) {
        byte[] bArr;
        int i2 = getHighSpeedVideoSizesFor;
        getHighSpeedVideoSizes = (i2 + 53) % 128;
        if (!z) {
            bArr = new byte[4];
        } else if (i <= 255) {
            int i3 = i2 + 49;
            getHighSpeedVideoSizes = i3 % 128;
            bArr = i3 % 2 != 0 ? new byte[0] : new byte[1];
        } else if (i > 255 && i <= 65535) {
            bArr = new byte[2];
        } else if (i > 65535 && i <= 16777215) {
            bArr = new byte[3];
            getHighSpeedVideoSizes = (i2 + 75) % 128;
        } else {
            bArr = new byte[4];
        }
        int length = bArr.length;
        for (int i4 = 0; i4 < length; i4++) {
            bArr[i4] = (byte) (i >> (((length - 1) - i4) * 8));
        }
        return bArr;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m25088(int i) {
        getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 37) % 128;
        byte[] m25081 = m25081(i, false);
        getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 99) % 128;
        return m25081;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m25101(int i, int i2) {
        byte[] bArr = new byte[0];
        if (i >= 0 && i2 >= 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        bArr = i2 != 4 ? new byte[0] : new byte[i2];
                    } else if (i <= 16777215) {
                        bArr = new byte[i2];
                    }
                } else if (i <= 65535) {
                    bArr = new byte[i2];
                }
            } else if (i <= 255) {
                bArr = new byte[i2];
            }
            if (bArr.length == i2) {
                for (int i3 = 0; i3 < i2; i3++) {
                    bArr[i3] = (byte) (i >> (((i2 - 1) - i3) * 8));
                }
            }
            return bArr;
        }
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("ꦻ葴㽵헝왅漃炵哢\ue556枲후닞賸륢䄘鑰黤쌃蜆匡\ue525ݥ慌ㄪ寸", (char) (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), (-1496108104) - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "뜮팳㎦磰", "\u0000\u0000\u0000\u0000", objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static int m25084(byte[] bArr) {
        int i = getHighSpeedVideoSizesFor + 65;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            byte b = bArr[3];
            return ((bArr[0] & 255) << 24) | (b & 255) | ((bArr[2] & 255) << 8) | ((bArr[1] & 255) << 16);
        }
        byte b2 = bArr[4];
        byte b3 = bArr[5];
        byte b4 = bArr[0];
        return ((b4 & 31760) * 114) | (b2 & 9728) | ((b3 & 16656) % 120) | ((b4 & 5790) * 4);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static int m25077(byte[] bArr) {
        int i = getHighSpeedVideoSizesFor + 121;
        getHighSpeedVideoSizes = i % 128;
        int i2 = 4;
        if (i % 2 == 0 ? bArr.length <= 4 : bArr.length <= 5) {
            i2 = bArr.length;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = getHighSpeedVideoSizesFor + 95;
            getHighSpeedVideoSizes = i5 % 128;
            if (i5 % 2 != 0) {
                i4 |= (bArr[i3] & 9644) / (6 << ((bArr.length * i3) >> 1));
                i3 += 20;
            } else {
                i4 |= (bArr[i3] & 255) << (((bArr.length - i3) - 1) * 8);
                i3++;
            }
        }
        return i4;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static byte[] m25076(java.lang.String str) {
        if (str.length() == 1) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("㷨", (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 35016), 802513297 - (android.view.ViewConfiguration.getEdgeSlop() >> 16), "鄱핡줯䎈", "\u0000\u0000\u0000\u0000", objArr);
            str = ((java.lang.String) objArr[0]).intern().concat(str);
            getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 61) % 128;
        }
        int length = (str.length() + 1) / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 61) % 128;
            int i2 = i * 2;
            bArr[i] = (byte) java.lang.Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        return bArr;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static boolean m25079(java.lang.String str) {
        if (str != null) {
            int i = getHighSpeedVideoSizesFor + 99;
            getHighSpeedVideoSizes = i % 128;
            if (i % 2 != 0) {
                throw null;
            }
            if (str.length() > 0 && str.length() % 2 == 0) {
                int i2 = getHighSpeedVideoSizesFor + 51;
                getHighSpeedVideoSizes = i2 % 128;
                return i2 % 2 == 0;
            }
        }
        return false;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static java.lang.String m25074(byte[] bArr) {
        int i = getHighSpeedVideoSizesFor;
        getHighSpeedVideoSizes = (i + 99) % 128;
        if (bArr != null) {
            int length = bArr.length;
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(length * 2);
            for (int i2 = 0; i2 < length; i2++) {
                getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 117) % 128;
                stringBuffer.append(getHighSpeedVideoSizes(bArr[i2] >> 4));
                stringBuffer.append(getHighSpeedVideoSizes(bArr[i2] & com.google.common.base.Ascii.SI));
            }
            return stringBuffer.toString().toUpperCase();
        }
        int i3 = i + 39;
        getHighSpeedVideoSizes = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        getHighSpeedVideoSizes = (i + 23) % 128;
        return "";
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public static java.lang.String m25098(byte[] bArr) {
        byte[] copyOfRange;
        getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 71) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("龶鿥︵\uf058둪ꡡ晙Ᵹ룀䰇ﳰ⽃\ueea4腘", ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 1, objArr);
            java.lang.String intern = ((java.lang.String) objArr[0]).intern();
            if (bArr == null || bArr.length <= 0) {
                return intern;
            }
            if (bArr.length < 4) {
                copyOfRange = java.util.Arrays.copyOfRange(bArr, 0, bArr.length);
                getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 11) % 128;
            } else {
                getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 57) % 128;
                copyOfRange = java.util.Arrays.copyOfRange(bArr, 0, 4);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(intern);
            sb.append(m25074(copyOfRange));
            java.lang.String obj = sb.toString();
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(obj);
            sb2.append(util.h.xy.al.rb.m25016(util.h.xy.am.ma.m25032(bArr)));
            return sb2.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public static int m25071(byte[] bArr) {
        int i = (getHighSpeedVideoSizes + 55) % 128;
        getHighSpeedVideoSizesFor = i;
        getHighSpeedVideoSizes = (i + 121) % 128;
        int i2 = 0;
        for (byte b : bArr) {
            getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 63) % 128;
            i2 = (i2 * 10) + (b - 48);
        }
        return i2;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static boolean m25068(byte[] bArr) {
        boolean z = true;
        if (bArr == null) {
            return true;
        }
        int length = bArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            int i2 = getHighSpeedVideoSizesFor + 117;
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 != 0) {
                byte b = bArr[i];
                throw new java.lang.ArithmeticException();
            }
            if (bArr[i] != 0) {
                z = false;
                break;
            }
            i++;
        }
        getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 19) % 128;
        return z;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static boolean m25070(byte[] bArr) {
        if (bArr != null) {
            int i = getHighSpeedVideoSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getHighSpeedVideoSizesFor = i % 128;
            int length = bArr.length;
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            if (length != 0) {
                return false;
            }
        }
        getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 43) % 128;
        return true;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static java.lang.String m25093(int i) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(java.lang.Integer.toHexString(i).toUpperCase(java.util.Locale.getDefault()));
        if (stringBuffer.length() % 2 != 0) {
            int i2 = getHighSpeedVideoSizes + 21;
            getHighSpeedVideoSizesFor = i2 % 128;
            stringBuffer.insert(0, i2 % 2 == 0 ? (char) 4 : com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask);
        }
        java.lang.String obj = stringBuffer.toString();
        getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 33) % 128;
        return obj;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static java.lang.String m25078(int i, int i2) {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(m25093(i));
        if (stringBuffer.length() == i2) {
            java.lang.String obj = stringBuffer.toString();
            getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 5) % 128;
            return obj;
        }
        if (stringBuffer.length() < i2) {
            int length = stringBuffer.length();
            for (int i3 = 0; i3 < i2 - length; i3++) {
                getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 87) % 128;
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap("㷨", (char) (android.text.TextUtils.indexOf("", "", 0) + 35017), 802513296 - android.view.MotionEvent.axisFromString(""), "鄱핡줯䎈", "\u0000\u0000\u0000\u0000", objArr);
                stringBuffer.insert(0, ((java.lang.String) objArr[0]).intern());
            }
            return stringBuffer.toString();
        }
        return stringBuffer.substring(0, i2);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static byte[] m25082(byte[] bArr, byte[] bArr2) {
        byte[] bArr3;
        byte[] bArr4;
        if (bArr != null && bArr.length != 0 && bArr2 != null) {
            int i = getHighSpeedVideoSizesFor;
            getHighSpeedVideoSizes = (i + 109) % 128;
            if (bArr2.length != 0) {
                int length = bArr.length;
                int length2 = bArr2.length;
                if (length <= length2) {
                    bArr3 = new byte[length2];
                    bArr4 = new byte[length];
                    java.lang.System.arraycopy(bArr, 0, bArr4, 0, length);
                    java.lang.System.arraycopy(bArr2, 0, bArr3, 0, length2);
                } else {
                    int i2 = i + 105;
                    getHighSpeedVideoSizes = i2 % 128;
                    if (i2 % 2 != 0) {
                        bArr3 = new byte[length];
                        bArr4 = new byte[length2];
                        java.lang.System.arraycopy(bArr, 1, bArr3, 1, length);
                        java.lang.System.arraycopy(bArr2, 0, bArr4, 1, length2);
                    } else {
                        bArr3 = new byte[length];
                        bArr4 = new byte[length2];
                        java.lang.System.arraycopy(bArr, 0, bArr3, 0, length);
                        java.lang.System.arraycopy(bArr2, 0, bArr4, 0, length2);
                    }
                }
                int length3 = bArr4.length;
                int length4 = bArr3.length;
                byte[] bArr5 = new byte[length4];
                for (int i3 = 0; i3 < length4; i3++) {
                    bArr5[i3] = (byte) (bArr3[i3] ^ bArr4[i3 % length3]);
                }
                return bArr5;
            }
        }
        return new byte[0];
    }

    @util.h.xy.a.a
    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m25089(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 83) % 128;
            return null;
        }
        int i = 0;
        if (bArr2 == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("蜁㹻俁\ue6a7ઍ隢疱臛鼶닚﹦⸖\uee80窏\ue2d9䇇蚮", (char) (13286 - android.text.TextUtils.indexOf("", "", 0)), 523572072 + android.view.KeyEvent.keyCodeFromString(""), "梏㔓\ue61f䘳", "\u0000\u0000\u0000\u0000", objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        }
        byte[] bArr3 = new byte[bArr.length];
        int length = bArr.length;
        getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 37) % 128;
        int i2 = 0;
        while (i < length) {
            int i3 = getHighSpeedVideoSizes + 119;
            getHighSpeedVideoSizesFor = i3 % 128;
            if (i3 % 2 == 0) {
                bArr3[i2] = (byte) (bArr[i] ^ bArr2[i2 >> bArr2.length]);
                i2 += 22;
                i += 102;
            } else {
                bArr3[i2] = (byte) (bArr[i] ^ bArr2[i2 % bArr2.length]);
                i2++;
                i++;
            }
        }
        return bArr3;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0072 A[LOOP:2: B:29:0x006e->B:31:0x0072, LOOP_END] */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m25096(long j) {
        boolean z;
        int i;
        int i2 = 0;
        for (long j2 = j; j2 != 0; j2 /= 10) {
            getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 55) % 128;
            i2++;
        }
        int i3 = i2 % 2;
        int i4 = i3 == 0 ? i2 / 2 : (i2 + 1) / 2;
        if (i3 != 0) {
            int i5 = getHighSpeedVideoSizes + 35;
            getHighSpeedVideoSizesFor = i5 % 128;
            if (i5 % 2 != 0) {
                z = true;
                byte[] bArr = new byte[i4];
                for (i = 0; i < i2; i++) {
                    int i6 = getHighSpeedVideoSizesFor;
                    getHighSpeedVideoSizes = (i6 + 63) % 128;
                    byte b = (byte) (j % 10);
                    if (i == i2 - 1 && z) {
                        bArr[i / 2] = b;
                        getHighSpeedVideoSizes = (i6 + 121) % 128;
                    } else if (i % 2 == 0) {
                        bArr[i / 2] = b;
                    } else {
                        byte b2 = (byte) (b << 4);
                        int i7 = i / 2;
                        bArr[i7] = (byte) (b2 | bArr[i7]);
                    }
                    j /= 10;
                }
                for (int i8 = 0; i8 < i4 / 2; i8++) {
                    byte b3 = bArr[i8];
                    int i9 = (i4 - i8) - 1;
                    bArr[i8] = bArr[i9];
                    bArr[i9] = b3;
                }
                return bArr;
            }
        }
        z = false;
        byte[] bArr2 = new byte[i4];
        while (i < i2) {
        }
        while (i8 < i4 / 2) {
        }
        return bArr2;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static byte[] m25075(long j) {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 3) % 128;
        byte[] bArr = new byte[6];
        byte[] m25096 = m25096(j);
        java.lang.System.arraycopy(m25096, 0, bArr, 6 - m25096.length, m25096.length);
        int i = getHighSpeedVideoSizes + 43;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static byte[] m25080(char c) {
        byte[] bArr;
        int i = getHighSpeedVideoSizesFor + 21;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            bArr = new byte[3];
            byte[] m25096 = m25096(c);
            java.lang.System.arraycopy(m25096, 1, bArr, m25096.length * 2, m25096.length);
        } else {
            bArr = new byte[2];
            byte[] m250962 = m25096(c);
            java.lang.System.arraycopy(m250962, 0, bArr, 2 - m250962.length, m250962.length);
        }
        int i2 = getHighSpeedVideoSizesFor + 77;
        getHighSpeedVideoSizes = i2 % 128;
        if (i2 % 2 == 0) {
            return bArr;
        }
        throw null;
    }

    private static char getHighSpeedVideoSizes(int i) {
        int i2 = i & 15;
        if (i2 < 10) {
            return (char) (i2 + 48);
        }
        int i3 = getHighSpeedVideoSizesFor;
        int i4 = i3 + 27;
        getHighSpeedVideoSizes = i4 % 128;
        char c = (char) (i4 % 2 != 0 ? (i2 / 66) / 70 : i2 + 87);
        getHighSpeedVideoSizes = (i3 + 55) % 128;
        return c;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static byte m25091(byte b, int i) {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 117) % 128;
        m25087(b);
        byte b2 = (byte) (b | ((byte) ((1 << i) | b)));
        m25087(b2);
        getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 109) % 128;
        return b2;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static java.lang.String m25087(byte b) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        char c = (char) ((android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 25896);
        int i = getHighSpeedVideoSizes;
        getHighSpeedVideoSizesFor = (i + 67) % 128;
        getHighSpeedVideoSizesFor = (i + 93) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("ሗﶲ涪", c, (-1667383723) - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), "唥鶾⦜㥥", "\u0000\u0000\u0000\u0000", objArr);
            sb.append(((java.lang.String) objArr[0]).intern());
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes("\uf45d\uf478狫糶\ue1b1ﶈ儚", 1 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), objArr2);
            sb.append(java.lang.String.format(((java.lang.String) objArr2[0]).intern(), java.lang.Integer.toBinaryString(b & 255)).replace(' ', com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask));
            return sb.toString();
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static int m25083(byte b, int i) {
        int i2 = getHighSpeedVideoSizesFor + 93;
        int i3 = i2 % 128;
        getHighSpeedVideoSizes = i3;
        int i4 = i2 % 2 != 0 ? b - i : b >> i;
        getHighSpeedVideoSizesFor = (i3 + 119) % 128;
        return i4 & 1;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static java.lang.String m25099() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("䅋䄞煇缶\uea1b\uf612\udecf", 1 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
        java.util.TimeZone timeZone = java.util.TimeZone.getTimeZone(((java.lang.String) objArr[0]).intern());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes("撌擵亭䃱늳꺀\ude24尵࡙\uf432﨓霜ᗀㆄ⏕濱촗滑棎‣蚱뺵倠\uf8fe縛", 1 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr2);
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(((java.lang.String) objArr2[0]).intern(), java.util.Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        java.lang.String format = simpleDateFormat.format(new java.util.Date());
        getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 95) % 128;
        return format;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static java.lang.String m25086() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("䅋䄞煇缶\uea1b\uf612\udecf", -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), objArr);
        java.util.TimeZone timeZone = java.util.TimeZone.getTimeZone(((java.lang.String) objArr[0]).intern());
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("뇗鈯牸暇麶涏", (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 33841), ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22, "퉺ꤱ㆙善", "\u0000\u0000\u0000\u0000", objArr2);
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(((java.lang.String) objArr2[0]).intern(), java.util.Locale.US);
            simpleDateFormat.setTimeZone(timeZone);
            java.util.Date date = new java.util.Date();
            simpleDateFormat.format(date);
            return simpleDateFormat.format(date);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static java.util.Date m25094(java.lang.String str) {
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("뇗鈯牸暇麶涏", (char) (android.graphics.Color.rgb(0, 0, 0) + 16811057), android.text.TextUtils.getTrimmedLength(""), "퉺ꤱ㆙善", "\u0000\u0000\u0000\u0000", objArr);
            java.util.Date parse = new java.text.SimpleDateFormat(((java.lang.String) objArr[0]).intern()).parse(str);
            getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 39) % 128;
            return parse;
        } catch (java.text.ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static byte[] m25102(java.lang.String str) {
        getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 47) % 128;
        byte[] bArr = new byte[str.length() / 2];
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 65) % 128;
            bArr[i2] = (byte) (((str.charAt(i) - '0') << 4) | (str.charAt(i + 1) - '0'));
            i += 2;
            i2++;
        }
        getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 57) % 128;
        return bArr;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static java.lang.String m25092() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes("䅋䄞煇缶\uea1b\uf612\udecf", 1 - android.graphics.Color.argb(0, 0, 0, 0), objArr);
        java.util.TimeZone timeZone = java.util.TimeZone.getTimeZone(((java.lang.String) objArr[0]).intern());
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoSizes("난냥\uea56\ue40a゛Ⲩ죽蠥겢\ue2eb砻臅쇐长", -android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr2);
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(((java.lang.String) objArr2[0]).intern(), java.util.Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        java.util.Date date = new java.util.Date();
        simpleDateFormat.format(date);
        java.lang.String format = simpleDateFormat.format(date);
        int i = getHighSpeedVideoSizes + 83;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 != 0) {
            return format;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static long m25085(java.lang.String str) throws java.text.ParseException {
        getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 59) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoSizes("䅋䄞煇缶\uea1b\uf612\udecf", (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 1, objArr);
            java.util.TimeZone timeZone = java.util.TimeZone.getTimeZone(((java.lang.String) objArr[0]).intern());
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoSizes("난냥\uea56\ue40a゛Ⲩ죽蠥겢\ue2eb砻臅쇐长", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 1, objArr2);
            java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat(((java.lang.String) objArr2[0]).intern(), java.util.Locale.US);
            simpleDateFormat.setTimeZone(timeZone);
            long time = simpleDateFormat.parse(str).getTime();
            getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 25) % 128;
            return time;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static int m25073(byte b) {
        int i = getHighSpeedVideoSizesFor + 117;
        getHighSpeedVideoSizes = i % 128;
        return i % 2 != 0 ? (((b % 2) & 16) + 48) >>> (b & com.google.common.base.Ascii.VT) : (((b >> 4) & 15) * 10) + (b & com.google.common.base.Ascii.SI);
    }

    /* renamed from: ι, reason: contains not printable characters */
    public static java.lang.String m25105(java.lang.String str) {
        int i = getHighSpeedVideoSizesFor + 79;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            java.lang.Long.parseLong(str);
            throw null;
        }
        java.lang.String hexString = java.lang.Long.toHexString(java.lang.Long.parseLong(str));
        int i2 = getHighSpeedVideoSizes + 99;
        getHighSpeedVideoSizesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return hexString;
        }
        throw null;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public static java.lang.String m25106(byte[] bArr) {
        int i = getHighSpeedVideoSizesFor + 117;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            if (bArr == null || bArr.length == 0) {
                return "";
            }
            char[] cArr = new char[bArr.length * 2];
            int i2 = 0;
            while (i2 < bArr.length) {
                byte b = bArr[i2];
                int i3 = i2 * 2;
                char[] cArr2 = getInputSizeshNQ4ISI;
                cArr[i3] = cArr2[(b & 255) >>> 4];
                cArr[i3 + 1] = cArr2[b & com.google.common.base.Ascii.SI];
                i2++;
                int i4 = getHighSpeedVideoSizes + 31;
                getHighSpeedVideoSizesFor = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 4 / 2;
                }
            }
            return new java.lang.String(cArr);
        }
        throw null;
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public static byte[] m25069(java.lang.String str) {
        int i = getHighSpeedVideoSizes + 67;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        byte[] bytes = str.getBytes();
        getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 117) % 128;
        return bytes;
    }

    /* renamed from: ˉ, reason: contains not printable characters */
    public static java.lang.String m25072(byte[] bArr) {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 79) % 128;
        java.lang.String m25097 = m25097(m25106(bArr));
        int i = getHighSpeedVideoSizesFor + 63;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            return m25097;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public static java.lang.String m25097(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("");
        getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 59) % 128;
        int i = 0;
        while (i < str.length()) {
            int i2 = getHighSpeedVideoSizesFor + 21;
            getHighSpeedVideoSizes = i2 % 128;
            if (i2 % 2 != 0) {
                sb.append((char) java.lang.Integer.parseInt(str.substring(i, i % 3), 42));
                i += 102;
            } else {
                int i3 = i + 2;
                sb.append((char) java.lang.Integer.parseInt(str.substring(i, i3), 16));
                i = i3;
            }
        }
        return sb.toString();
    }

    static void getHighSpeedVideoSizes() {
        getOutputMinFrameDuration = 2457411417541981002L;
        getHighSpeedVideoFpsRanges = 294925130;
        getInputFormats = (char) 21130;
        getHighResolutionOutputSizeshNQ4ISI = 3002154436073616909L;
    }
}
