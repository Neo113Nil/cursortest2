package util.h.xy.cr;

/* loaded from: classes5.dex */
public final class ra {
    private static int[] Camera2StreamConfigurationMap = null;
    private static final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 0;
    private static int getHighSpeedVideoSizesFor = 1;

    private ra() {
    }

    static {
        Camera2StreamConfigurationMap();
        getHighResolutionOutputSizeshNQ4ISI = util.h.xy.cr.ra.class.getName();
        int i = getHighSpeedVideoSizesFor + 91;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static void m26020(java.lang.String str) {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 93) % 128;
        android.content.Context m25934 = util.h.xy.ci.ra.m25931().m25934();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{1971688238, -1305497588}, android.text.TextUtils.getCapsMode("", 0, 0) + 2, objArr);
        android.content.SharedPreferences.Editor edit = m25934.getSharedPreferences(((java.lang.String) objArr[0]).intern(), 0).edit();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{1161202770, -1177326203}, 1 - android.view.MotionEvent.axisFromString(""), objArr2);
        edit.putString(((java.lang.String) objArr2[0]).intern(), str);
        edit.commit();
        getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 7) % 128;
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.ct.mb m26018() {
        getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 71) % 128;
        android.content.Context m25934 = util.h.xy.ci.ra.m25931().m25934();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{1971688238, -1305497588}, 2 - android.graphics.Color.alpha(0), objArr);
        android.content.SharedPreferences sharedPreferences = m25934.getSharedPreferences(((java.lang.String) objArr[0]).intern(), 0);
        int[] iArr = {434688624, -1789148222};
        getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(iArr, ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6) + 2, objArr2);
            java.lang.String string = sharedPreferences.getString(((java.lang.String) objArr2[0]).intern(), null);
            util.h.xy.ct.mb mbVar = util.h.xy.ct.mb.f1127;
            if (string == null) {
                return mbVar;
            }
            getHighSpeedVideoSizesFor = (getHighSpeedVideoSizes + 111) % 128;
            try {
                return util.h.xy.ct.mb.m26044(string);
            } catch (java.lang.Exception unused) {
                return util.h.xy.ct.mb.f1127;
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0067, code lost:
    
        if (r7 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003d, code lost:
    
        if (r7 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0069, code lost:
    
        r7 = util.h.xy.ct.mb.f1127;
     */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m26019(util.h.xy.ct.mb mbVar) {
        android.content.SharedPreferences.Editor edit;
        int i = getHighSpeedVideoSizes + 83;
        getHighSpeedVideoSizesFor = i % 128;
        if (i % 2 == 0) {
            android.content.Context m25934 = util.h.xy.ci.ra.m25931().m25934();
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{1971688238, -1305497588}, 0 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr);
            edit = m25934.getSharedPreferences(((java.lang.String) objArr[0]).intern(), 1).edit();
        } else {
            android.content.Context m259342 = util.h.xy.ci.ra.m25931().m25934();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(new int[]{1971688238, -1305497588}, 1 - android.widget.ExpandableListView.getPackedPositionChild(0L), objArr2);
            edit = m259342.getSharedPreferences(((java.lang.String) objArr2[0]).intern(), 0).edit();
        }
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        Camera2StreamConfigurationMap(new int[]{434688624, -1789148222}, android.text.TextUtils.getOffsetAfter("", 0) + 2, objArr3);
        edit.putString(((java.lang.String) objArr3[0]).intern(), mbVar.m26045());
        edit.commit();
        getHighSpeedVideoSizes = (getHighSpeedVideoSizesFor + 57) % 128;
    }

    private static void Camera2StreamConfigurationMap(int[] iArr, int i, java.lang.Object[] objArr) {
        int length;
        int[] iArr2;
        int i2;
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        int length2 = iArr.length;
        char[] cArr2 = new char[4];
        int[] iArr3 = Camera2StreamConfigurationMap;
        if (iArr3 != null) {
            int length3 = iArr3.length;
            int[] iArr4 = new int[length3];
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 87) % 128;
            for (int i3 = 0; i3 < length3; i3++) {
                iArr4[i3] = (int) (iArr3[i3] ^ (-5569649899877129369L));
            }
            iArr3 = iArr4;
        }
        int length4 = iArr3.length;
        int[] iArr5 = new int[length4];
        int[] iArr6 = Camera2StreamConfigurationMap;
        int i4 = 2;
        if (iArr6 != null) {
            int i5 = getHighSpeedVideoFpsRangesFor + 1;
            getHighSpeedVideoFpsRanges = i5 % 128;
            if (i5 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i6 = getHighSpeedVideoFpsRanges + 107;
                getHighSpeedVideoFpsRangesFor = i6 % 128;
                if (i6 % i4 == 0) {
                    iArr2[i2] = (int) (iArr6[i2] | (-5569649899877129369L));
                    throw new java.lang.ArithmeticException();
                }
                iArr2[i2] = (int) (iArr6[i2] ^ (-5569649899877129369L));
                i2++;
                i4 = 2;
            }
            iArr6 = iArr2;
        }
        java.lang.System.arraycopy(iArr6, 0, iArr5, 0, length4);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr5);
            int i7 = 0;
            while (i7 < 16) {
                cVar.f2627 ^= iArr5[i7];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i8 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i8;
                i7++;
                getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 89) % 128;
            }
            int i9 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i9;
            cVar.f2625 ^= iArr5[16];
            cVar.f2627 ^= iArr5[17];
            int i10 = cVar.f2627;
            int i11 = cVar.f2625;
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

    static void Camera2StreamConfigurationMap() {
        Camera2StreamConfigurationMap = new int[]{-968785254, 333856660, -172526998, -249238711, 2147361217, 1660375074, 330391217, 1461656647, 318051045, -656461040, -2103860839, 1049595361, 629925490, 919696774, 1331052678, 474415120, -931819961, 1822180909};
    }
}
