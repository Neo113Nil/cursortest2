package util.h.xy.cz;

/* loaded from: classes5.dex */
public final class b implements util.h.xy.db.a {
    private static int Camera2StreamConfigurationMap = 1;
    private static util.h.xy.cz.b getHighResolutionOutputSizeshNQ4ISI = null;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private static int[] getInputSizeshNQ4ISI = {-1847823042, -299066294, -1343409887, -1254766551, 1218385498, -1519216994, -234720567, -232380996, -209620770, -899080726, 643391864, 1068734890, 2007583595, 938983313, 1316368871, 1208007053, -1962000631, 1001626536};

    private b() {
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static util.h.xy.cz.b m26124() {
        util.h.xy.cz.b bVar;
        synchronized (util.h.xy.cz.b.class) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 69) % 128;
            if (getHighResolutionOutputSizeshNQ4ISI == null) {
                getHighResolutionOutputSizeshNQ4ISI = new util.h.xy.cz.b();
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 71) % 128;
            }
            bVar = getHighResolutionOutputSizeshNQ4ISI;
        }
        return bVar;
    }

    private static java.lang.String getHighSpeedVideoSizes() {
        java.lang.String str;
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 13) % 128;
        android.content.Context m26264 = util.h.xy.da.mc.m26262().m26264();
        java.lang.String str2 = "";
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{1935019311, 1457009893, 1900277994, -1216492538}, android.text.TextUtils.getTrimmedLength("") + 5, objArr);
        try {
            str = ((android.telephony.TelephonyManager) m26264.getSystemService(((java.lang.String) objArr[0]).intern())).getDeviceId();
        } catch (java.lang.SecurityException unused) {
            if (android.os.Build.VERSION.SDK_INT < 29) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(new int[]{-1567850154, 1139096255, 2032580511, -2124031938, -1059297026, 2098258529, -1516481941, -1127717048, -377386518, 1451851644, -2090627275, -81127676, -642797802, -1864869302, -1096212631, -436143698, 613940726, -1000101104, 1426552797, -958103250, -1888591899, -656852737, -971241936, 1552293574, 1463829189, -754936227, -636576424, -859284422, -762209027, -329058096, 1109389598, -505889345}, 65 - (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr2);
                throw new java.lang.SecurityException(((java.lang.String) objArr2[0]).intern());
            }
            str = null;
        }
        android.content.ContentResolver contentResolver = m26264.getContentResolver();
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{1481405373, 51572189, 95986240, -1134718674, -728407519, 1905314282}, android.graphics.Color.green(0) + 10, objArr3);
        java.lang.String string = android.provider.Settings.Secure.getString(contentResolver, ((java.lang.String) objArr3[0]).intern());
        if (str == null) {
            int i = getHighSpeedVideoFpsRangesFor;
            getHighSpeedVideoFpsRanges = (i + 25) % 128;
            getHighSpeedVideoFpsRanges = (i + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        } else {
            str2 = str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str2);
        sb.append(string);
        return sb.toString();
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i, java.lang.Object[] objArr) {
        int length;
        int[] iArr2;
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = getInputSizeshNQ4ISI;
        if (iArr3 != null) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 55) % 128;
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                iArr4[i2] = (int) (iArr3[i2] ^ (-5569649899877129369L));
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = getInputSizeshNQ4ISI;
        if (iArr6 != null) {
            int i3 = getHighSpeedVideoSizes + 65;
            Camera2StreamConfigurationMap = i3 % 128;
            if (i3 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i4 = 0;
            while (i4 < length) {
                int i5 = getHighSpeedVideoSizes + 71;
                Camera2StreamConfigurationMap = i5 % 128;
                if (i5 % 2 == 0) {
                    iArr2[i4] = (int) (iArr6[i4] + 5569649899877129369L);
                } else {
                    iArr2[i4] = (int) (iArr6[i4] ^ (-5569649899877129369L));
                    i4++;
                }
            }
            iArr6 = iArr2;
        }
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length3);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr5);
            for (int i6 = 0; i6 < 16; i6++) {
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 71) % 128;
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

    @Override // util.h.xy.db.a
    /* renamed from: ˏ, reason: contains not printable characters */
    public final byte[] mo26125() {
        int i = (getHighSpeedVideoFpsRangesFor + 37) % 128;
        getHighSpeedVideoFpsRanges = i;
        getHighSpeedVideoFpsRangesFor = (i + 45) % 128;
        byte[] bytes = getHighSpeedVideoSizes().getBytes();
        byte[] bArr = new byte[bytes.length];
        java.lang.System.arraycopy(bytes, 0, bArr, 0, bytes.length);
        int i2 = getHighSpeedVideoFpsRangesFor;
        int i3 = i2 + 105;
        getHighSpeedVideoFpsRanges = i3 % 128;
        if (i3 % 2 == 0) {
            getHighSpeedVideoFpsRanges = (i2 + 35) % 128;
            return bArr;
        }
        throw null;
    }
}
