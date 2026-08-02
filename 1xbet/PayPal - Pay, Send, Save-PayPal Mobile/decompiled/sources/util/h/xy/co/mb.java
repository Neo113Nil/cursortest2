package util.h.xy.co;

/* loaded from: classes5.dex */
final class mb extends android.database.sqlite.SQLiteOpenHelper implements util.h.xy.co.a {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static char[] getHighSpeedVideoFpsRangesFor = null;
    private static int getHighSpeedVideoSizes = 1;
    private static final java.lang.String getInputSizeshNQ4ISI;
    private static int[] getOutputFormats;

    static {
        getHighSpeedVideoFpsRanges();
        getInputSizeshNQ4ISI = util.h.xy.co.mb.class.getName();
        int i = getHighResolutionOutputSizeshNQ4ISI + 39;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    mb() {
        super(r0, ((java.lang.String) r4[0]).intern(), (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 3);
        android.content.Context m25934 = util.h.xy.ci.ra.m25931().m25934();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(true, new int[]{0, 12, 0, 0}, "\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001", objArr);
    }

    @Override // util.h.xy.co.a
    /* renamed from: ᐝ */
    public final void mo25986(util.h.xy.co.ra raVar) throws util.h.xy.co.b {
        synchronized (this) {
            getHighSpeedVideoFpsRanges(raVar);
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(100);
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(new int[]{1264624389, 2037969124, -975654965, -141611951, 1395288358, 2138480397, 1959407420, 753536228, 1648803601, 1255425080, -1656336552, 1388152825, -1052124825, 1230212418}, 27 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr);
            java.lang.StringBuffer append = stringBuffer.append(((java.lang.String) objArr[0]).intern()).append(raVar.m25989());
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(false, new int[]{12, 2, 29, 0}, "\u0001\u0000", objArr2);
            java.lang.StringBuffer append2 = append.append(((java.lang.String) objArr2[0]).intern()).append(raVar.m25990());
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap(true, new int[]{14, 22, 93, 0}, "\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000", objArr3);
            append2.append(((java.lang.String) objArr3[0]).intern());
            java.util.Map<java.lang.String, java.lang.String> m25991 = raVar.m25991();
            int i = 0;
            for (java.lang.String str : m25991.keySet()) {
                stringBuffer.append(str).append(' ').append(m25991.get(str));
                if (i < m25991.size() - 1) {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(false, new int[]{36, 2, 0, 1}, "\u0000\u0000", objArr4);
                    stringBuffer.append(((java.lang.String) objArr4[0]).intern());
                }
                i++;
            }
            stringBuffer.append(')');
            try {
                getWritableDatabase().execSQL(stringBuffer.toString());
            } catch (android.database.sqlite.SQLiteException unused) {
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{876670718, -1897157346, 2135578314, 1111706859, -2024589792, -1989679423, 976358332, -211380809, 1276403985, -46131497, 1859470335, -1564933913, -2011101095, 752212264}, 27 - (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16), objArr5);
                throw new util.h.xy.co.b(((java.lang.String) objArr5[0]).intern());
            }
        }
    }

    @Override // util.h.xy.co.a
    /* renamed from: ˋ */
    public final boolean mo25983(util.h.xy.co.ra raVar, java.lang.String str) throws util.h.xy.co.b {
        synchronized (this) {
            synchronized (this) {
                getHighSpeedVideoFpsRanges(raVar);
                getHighResolutionOutputSizeshNQ4ISI(str);
                if (!getHighSpeedVideoFpsRangesFor(raVar.m25989())) {
                    return false;
                }
                android.database.Cursor cursor = null;
                try {
                    try {
                        android.database.sqlite.SQLiteDatabase readableDatabase = getReadableDatabase();
                        java.lang.String m25989 = raVar.m25989();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(raVar.m25990());
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(new int[]{1435570538, 856225037}, (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1, objArr);
                        sb.append(((java.lang.String) objArr[0]).intern());
                        cursor = readableDatabase.query(m25989, null, sb.toString(), new java.lang.String[]{str}, null, null, null, null);
                        return cursor.getCount() != 0;
                    } catch (android.database.sqlite.SQLiteException e) {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(new int[]{2121139278, -214430730, 1196169471, -34453858}, 5 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), objArr2);
                        util.h.xy.am.ma.m25029(((java.lang.String) objArr2[0]).intern(), util.h.xy.ch.ma.m25927(e));
                        java.lang.Object[] objArr3 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(false, new int[]{38, 37, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001", objArr3);
                        throw new util.h.xy.co.b(((java.lang.String) objArr3[0]).intern());
                    }
                } finally {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(int[] iArr, int i, java.lang.Object[] objArr) {
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = getOutputFormats;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                iArr3[i2] = (int) (iArr2[i2] ^ (-5569649899877129369L));
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = getOutputFormats;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i3 = 0; i3 < length3; i3++) {
                iArr6[i3] = (int) (iArr5[i3] ^ (-5569649899877129369L));
            }
            iArr5 = iArr6;
        }
        java.lang.System.arraycopy(iArr5, 0, iArr4, 0, length2);
        cVar.f2626 = 0;
        while (cVar.f2626 < iArr.length) {
            cArr[0] = (char) (iArr[cVar.f2626] >> 16);
            cArr[1] = (char) iArr[cVar.f2626];
            cArr[2] = (char) (iArr[cVar.f2626 + 1] >> 16);
            cArr[3] = (char) iArr[cVar.f2626 + 1];
            cVar.f2627 = (cArr[0] << 16) + cArr[1];
            cVar.f2625 = (cArr[2] << 16) + cArr[3];
            util.h.xz.b.c.m27723(iArr4);
            int i4 = 0;
            while (i4 < 16) {
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 1) % 128;
                cVar.f2627 ^= iArr4[i4];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i5 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i5;
                i4++;
                getHighSpeedVideoFpsRanges = (Camera2StreamConfigurationMap + 47) % 128;
            }
            int i6 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i6;
            cVar.f2625 ^= iArr4[16];
            cVar.f2627 ^= iArr4[17];
            int i7 = cVar.f2627;
            int i8 = cVar.f2625;
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
        java.lang.String str = new java.lang.String(cArr2, 0, i);
        int i9 = Camera2StreamConfigurationMap + 39;
        getHighSpeedVideoFpsRanges = i9 % 128;
        if (i9 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        objArr[0] = str;
    }

    @Override // util.h.xy.co.a
    public final void V_(util.h.xy.co.ra raVar, java.lang.String str, android.content.ContentValues contentValues) throws util.h.xy.co.b {
        synchronized (this) {
            synchronized (this) {
                getHighSpeedVideoFpsRanges(raVar);
                getHighResolutionOutputSizeshNQ4ISI(str);
                getHighResolutionOutputSizeshNQ4ISI(raVar, contentValues);
                try {
                    android.database.sqlite.SQLiteDatabase writableDatabase = getWritableDatabase();
                    contentValues.put(raVar.m25990(), str);
                    long insert = writableDatabase.insert(raVar.m25989(), null, contentValues);
                    if (insert == -1) {
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(true, new int[]{75, 25, 96, 0}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", objArr);
                        throw new util.h.xy.co.b(((java.lang.String) objArr[0]).intern());
                    }
                    if (insert == 0) {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(new int[]{-167216578, -914161754, -802876855, -2073099356, 2112867823, -265861065, -1414076799, -1599733203}, 16 - android.text.TextUtils.getOffsetAfter("", 0), objArr2);
                        throw new util.h.xy.co.b(((java.lang.String) objArr2[0]).intern());
                    }
                } catch (android.database.sqlite.SQLiteException e) {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(new int[]{1877725607, -1391554630, 1196169471, -34453858}, android.view.View.resolveSizeAndState(0, 0, 0) + 5, objArr3);
                    util.h.xy.am.ma.m25029(((java.lang.String) objArr3[0]).intern(), util.h.xy.ch.ma.m25927(e));
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(false, new int[]{38, 37, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001", objArr4);
                    throw new util.h.xy.co.b(((java.lang.String) objArr4[0]).intern());
                }
            }
        }
    }

    private static void Camera2StreamConfigurationMap(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int i;
        java.lang.String str2 = str;
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr2 = bArr;
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = 2;
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = getHighSpeedVideoFpsRangesFor;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = Camera2StreamConfigurationMap + 79;
                getHighSpeedVideoFpsRanges = i8 % 128;
                if (i8 % i4 != 0) {
                    cArr2[i7] = (char) (cArr[i7] / (-8125198844289309347L));
                    throw new java.lang.ArithmeticException();
                }
                cArr2[i7] = (char) (cArr[i7] ^ (-8125198844289309347L));
                i7++;
                i5 = i5;
                i4 = 2;
            }
            i = i5;
            cArr = cArr2;
        } else {
            i = i5;
        }
        char[] cArr3 = new char[i3];
        java.lang.System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr2 != null) {
            char[] cArr4 = new char[i3];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i3) {
                int i9 = getHighSpeedVideoFpsRanges + 59;
                Camera2StreamConfigurationMap = i9 % 128;
                if (i9 % 2 != 0 ? bArr2[maVar.f2631] != 1 : bArr2[maVar.f2631] != 0) {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                } else {
                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 71) % 128;
            char[] cArr5 = new char[i3];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i10 = i3 - i6;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i10, i6);
            java.lang.System.arraycopy(cArr5, i6, cArr3, 0, i10);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            maVar.f2631 = 0;
            while (maVar.f2631 < i3) {
                cArr6[maVar.f2631] = cArr3[(i3 - maVar.f2631) - 1];
                maVar.f2631++;
            }
            cArr3 = cArr6;
        }
        if (i > 0) {
            int i11 = getHighSpeedVideoFpsRanges + 101;
            Camera2StreamConfigurationMap = i11 % 128;
            if (i11 % 2 == 0) {
                maVar.f2631 = 1;
            } else {
                maVar.f2631 = 0;
            }
            while (maVar.f2631 < i3) {
                cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                maVar.f2631++;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        int i = getHighSpeedVideoSizes + 65;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 41) % 128;
        android.content.Context m25934 = util.h.xy.ci.ra.m25931().m25934();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap(true, new int[]{0, 12, 0, 0}, "\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0001", objArr);
        m25934.deleteDatabase(((java.lang.String) objArr[0]).intern());
        int i3 = getHighSpeedVideoSizes + 97;
        getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
    }

    @Override // util.h.xy.co.a
    /* renamed from: ˎ */
    public final java.util.Map<java.lang.String, byte[]> mo25984(util.h.xy.co.ra raVar, java.lang.String str) throws util.h.xy.co.b {
        java.util.HashMap hashMap;
        synchronized (this) {
            synchronized (this) {
                getHighSpeedVideoFpsRanges(raVar);
                getHighResolutionOutputSizeshNQ4ISI(str);
                android.database.Cursor cursor = null;
                try {
                    try {
                        android.database.sqlite.SQLiteDatabase readableDatabase = getReadableDatabase();
                        java.lang.String m25989 = raVar.m25989();
                        java.lang.StringBuilder sb = new java.lang.StringBuilder();
                        sb.append(raVar.m25990());
                        java.lang.Object[] objArr = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(new int[]{1435570538, 856225037}, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1, objArr);
                        sb.append(((java.lang.String) objArr[0]).intern());
                        android.database.Cursor query = readableDatabase.query(m25989, null, sb.toString(), new java.lang.String[]{str}, null, null, null, null);
                        if (query != null && query.moveToFirst()) {
                            hashMap = new java.util.HashMap();
                            java.util.Iterator<java.lang.String> it = raVar.m25991().keySet().iterator();
                            while (it.hasNext()) {
                                int columnIndex = query.getColumnIndex(it.next());
                                if (columnIndex >= 0 && !query.isNull(columnIndex)) {
                                    hashMap.put(query.getColumnName(columnIndex), query.getBlob(columnIndex));
                                }
                            }
                            hashMap.put(raVar.m25990(), str.getBytes());
                            if (query != null) {
                                query.close();
                            }
                        } else {
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                            java.lang.Object[] objArr2 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(new int[]{-759467534, 7391101, -1191192284, -1843570738}, android.text.TextUtils.indexOf("", "", 0, 0) + 6, objArr2);
                            sb2.append(((java.lang.String) objArr2[0]).intern());
                            sb2.append(raVar.m25989());
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(new int[]{-1356051060, 64346272, 386420540, 565963258, 542445028, 1183413900}, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 11, objArr3);
                            sb2.append(((java.lang.String) objArr3[0]).intern());
                            throw new util.h.xy.co.b(sb2.toString());
                        }
                    } catch (android.database.sqlite.SQLiteException e) {
                        java.lang.Object[] objArr4 = new java.lang.Object[1];
                        getHighSpeedVideoFpsRangesFor(new int[]{142197982, 1402521578, 1196169471, -34453858}, (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 4, objArr4);
                        util.h.xy.am.ma.m25029(((java.lang.String) objArr4[0]).intern(), util.h.xy.ch.ma.m25927(e));
                        java.lang.Object[] objArr5 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(false, new int[]{100, 38, 0, 5}, "\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000", objArr5);
                        throw new util.h.xy.co.b(((java.lang.String) objArr5[0]).intern());
                    }
                } catch (java.lang.Throwable th) {
                    if (0 != 0) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            return hashMap;
        }
        return hashMap;
    }

    @Override // util.h.xy.co.a
    /* renamed from: ᐝ */
    public final boolean mo25987(util.h.xy.co.ra raVar, java.lang.String str) throws util.h.xy.co.b {
        boolean z;
        synchronized (this) {
            synchronized (this) {
                getHighSpeedVideoFpsRanges(raVar);
                getHighResolutionOutputSizeshNQ4ISI(str);
                try {
                    java.util.Map<java.lang.String, byte[]> mo25984 = mo25984(raVar, str);
                    for (java.lang.String str2 : mo25984.keySet()) {
                        byte[] bArr = mo25984.get(str2);
                        util.h.xy.cv.ra.m26066(bArr);
                        mo25984.put(str2, bArr);
                    }
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    java.util.Iterator<java.util.Map.Entry<java.lang.String, byte[]>> it = mo25984.entrySet().iterator();
                    while (it.hasNext()) {
                        int i = getHighSpeedVideoSizes + 37;
                        getHighResolutionOutputSizeshNQ4ISI = i % 128;
                        if (i % 2 != 0) {
                            java.util.Map.Entry<java.lang.String, byte[]> next = it.next();
                            contentValues.put(next.getKey(), next.getValue());
                            throw null;
                        }
                        java.util.Map.Entry<java.lang.String, byte[]> next2 = it.next();
                        contentValues.put(next2.getKey(), next2.getValue());
                    }
                    getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 85) % 128;
                    W_(raVar, str, contentValues);
                    android.database.sqlite.SQLiteDatabase writableDatabase = getWritableDatabase();
                    java.lang.String m25989 = raVar.m25989();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(raVar.m25990());
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(new int[]{1435570538, 856225037}, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 2, objArr);
                    sb.append(((java.lang.String) objArr[0]).intern());
                    int delete = writableDatabase.delete(m25989, sb.toString(), new java.lang.String[]{str});
                    if (delete == -1) {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(false, new int[]{138, 22, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001", objArr2);
                        throw new util.h.xy.co.b(((java.lang.String) objArr2[0]).intern());
                    }
                    z = delete != 0;
                } catch (android.database.sqlite.SQLiteException e) {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(new int[]{-1260898192, -476305878, 1196169471, -34453858}, 5 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr3);
                    util.h.xy.am.ma.m25029(((java.lang.String) objArr3[0]).intern(), util.h.xy.ch.ma.m25927(e));
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(false, new int[]{38, 37, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001", objArr4);
                    throw new util.h.xy.co.b(((java.lang.String) objArr4[0]).intern());
                }
            }
            return z;
        }
        return z;
    }

    @Override // util.h.xy.co.a
    public final void W_(util.h.xy.co.ra raVar, java.lang.String str, android.content.ContentValues contentValues) throws util.h.xy.co.b {
        synchronized (this) {
            synchronized (this) {
                getHighSpeedVideoFpsRanges(raVar);
                getHighResolutionOutputSizeshNQ4ISI(str);
                getHighResolutionOutputSizeshNQ4ISI(raVar, contentValues);
                try {
                    android.database.sqlite.SQLiteDatabase writableDatabase = getWritableDatabase();
                    contentValues.put(raVar.m25990(), str);
                    java.lang.String m25989 = raVar.m25989();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    sb.append(raVar.m25990());
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(new int[]{-1653724852, 70211951}, 4 - android.graphics.Color.blue(0), objArr);
                    sb.append(((java.lang.String) objArr[0]).intern());
                    int update = writableDatabase.update(m25989, contentValues, sb.toString(), new java.lang.String[]{str});
                    if (update == -1) {
                        java.lang.Object[] objArr2 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap(true, new int[]{160, 22, 0, 11}, "\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001", objArr2);
                        throw new util.h.xy.co.b(((java.lang.String) objArr2[0]).intern());
                    }
                    if (update == 0) {
                        try {
                            java.lang.Object[] objArr3 = new java.lang.Object[1];
                            getHighSpeedVideoFpsRangesFor(new int[]{-167216578, -914161754, -802876855, -2073099356, 2112867823, -265861065, -1414076799, -1599733203}, ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 17, objArr3);
                            throw new util.h.xy.co.b(((java.lang.String) objArr3[0]).intern());
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                } catch (android.database.sqlite.SQLiteException e) {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor(new int[]{-164880818, 2081621631, 1196169471, -34453858}, android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 5, objArr4);
                    util.h.xy.am.ma.m25029(((java.lang.String) objArr4[0]).intern(), util.h.xy.ch.ma.m25927(e));
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(false, new int[]{38, 37, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001", objArr5);
                    throw new util.h.xy.co.b(((java.lang.String) objArr5[0]).intern());
                }
            }
        }
    }

    @Override // util.h.xy.co.a
    /* renamed from: ˎ */
    public final void mo25985(util.h.xy.co.ra raVar) throws util.h.xy.co.b {
        synchronized (this) {
            getHighSpeedVideoFpsRanges(raVar);
            try {
                android.database.sqlite.SQLiteDatabase writableDatabase = getWritableDatabase();
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append("PRAGMA secure_delete=[true];");
                int i = getHighSpeedVideoSizes + 87;
                getHighResolutionOutputSizeshNQ4ISI = i % 128;
                if (i % 2 != 0) {
                    throw new java.lang.ArithmeticException();
                }
                writableDatabase.rawQuery(sb.toString(), null);
                sb.delete(0, sb.length());
                if (writableDatabase.delete(raVar.m25989(), null, null) == -1) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(false, new int[]{138, 22, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001", objArr);
                    throw new util.h.xy.co.b(((java.lang.String) objArr[0]).intern());
                }
            } catch (android.database.sqlite.SQLiteException unused) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap(false, new int[]{38, 37, 0, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001", objArr2);
                throw new util.h.xy.co.b(((java.lang.String) objArr2[0]).intern());
            }
        }
    }

    private boolean getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        synchronized (this) {
            android.database.Cursor cursor = null;
            try {
                android.database.sqlite.SQLiteDatabase readableDatabase = getReadableDatabase();
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap(false, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE, 62, 23, 0}, "\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001", objArr);
                cursor = readableDatabase.rawQuery(((java.lang.String) objArr[0]).intern(), new java.lang.String[]{str});
                if (cursor != null) {
                    if (cursor.getCount() > 0) {
                        return true;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
                return false;
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(util.h.xy.co.ra raVar, android.content.ContentValues contentValues) throws util.h.xy.co.b {
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 43) % 128;
        if (contentValues == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor(new int[]{535004047, -625792310, -1830589426, 1992858156, 646237294, -646205298, 1508404489, -2097345870, -1785602288, 971195774, 547594375, -1167780389, 1507386092, -400337027, 1052789931, 693951342, -181562176, 761451167}, 35 - android.text.TextUtils.getOffsetBefore("", 0), objArr);
            throw new util.h.xy.co.b(((java.lang.String) objArr[0]).intern());
        }
        java.util.Iterator<java.lang.String> it = raVar.m25991().keySet().iterator();
        while (it.hasNext()) {
            if (!contentValues.containsKey(it.next())) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor(new int[]{535004047, -625792310, -1830589426, 1992858156, 646237294, -646205298, 1508404489, -2097345870, -1884632104, -486678021, 995123867, 1606480848, -1275220198, 1220525417, -2020658315, 2131545073, -1765219288, 930888521}, (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 36, objArr2);
                throw new util.h.xy.co.b(((java.lang.String) objArr2[0]).intern());
            }
        }
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 75) % 128;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str) throws util.h.xy.co.b {
        int i = getHighResolutionOutputSizeshNQ4ISI + 121;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 != 0) {
            if (!util.h.xy.cv.b.m26060(str)) {
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 23) % 128;
                return;
            } else {
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap(true, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, 40, 0, 13}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001", objArr);
                throw new util.h.xy.co.b(((java.lang.String) objArr[0]).intern());
            }
        }
        util.h.xy.cv.b.m26060(str);
        throw null;
    }

    private static void getHighSpeedVideoFpsRanges(util.h.xy.co.ra raVar) throws util.h.xy.co.b {
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 65) % 128;
        if (raVar == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap(false, new int[]{com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, 27, 0, 0}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001", objArr);
            throw new util.h.xy.co.b(((java.lang.String) objArr[0]).intern());
        }
        if (!util.h.xy.cv.b.m26060(raVar.m25989())) {
            int i = getHighSpeedVideoSizes + 31;
            getHighResolutionOutputSizeshNQ4ISI = i % 128;
            if (i % 2 == 0) {
                if (!util.h.xy.cv.b.m26060(raVar.m25990())) {
                    java.util.Map<java.lang.String, java.lang.String> m25991 = raVar.m25991();
                    if (m25991 != null) {
                        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 19) % 128;
                        if (!m25991.isEmpty()) {
                            return;
                        }
                    }
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap(true, new int[]{311, 55, 3, 49}, null, objArr2);
                    throw new util.h.xy.co.b(((java.lang.String) objArr2[0]).intern());
                }
            } else {
                util.h.xy.cv.b.m26060(raVar.m25990());
                throw null;
            }
        }
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor(new int[]{-759467534, 7391101, -1295535189, 132830370, 393476444, -127790572, 1671554916, -277617229, 2139582278, 472317161, -1296829280, -2138856700, -1451169126, 2009584967, 61629698, -1013368604, 1327255297, -1779551319, -1546683446, 1656882328, -794590879, -1807739939, 1171359396, 2119138710}, (android.view.ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 45, objArr3);
        throw new util.h.xy.co.b(((java.lang.String) objArr3[0]).intern());
    }

    static void getHighSpeedVideoFpsRanges() {
        getHighSpeedVideoFpsRangesFor = new char[]{42348, 42302, 42260, 42257, 42298, 42294, 42292, 42292, 42289, 42299, 42297, 42292, 42307, 42268, 42265, 42436, 42484, 42480, 42483, 42441, 42442, 42483, 42486, 42441, 42450, 42487, 42477, 42487, 42485, 42483, 42442, 42442, 42478, 42486, 42484, 42442, 42317, 42363, 42367, 42255, 42295, 42295, 42300, 42300, 42295, 42289, 42271, 42268, 42303, 42298, 42291, 42291, 42284, 42263, 42268, 42302, 42271, 42266, 42290, 42295, 42292, 42292, 42297, 42271, 42270, 42295, 42285, 42260, 42262, 42281, 42288, 42291, 42291, 42294, 42295, 42303, 42393, 42389, 42391, 42392, 42398, 42494, 42490, 42387, 42385, 42387, 42382, 42390, 42385, 42381, 42390, 42489, 42495, 42385, 42391, 42396, 42396, 42391, 42391, 42479, 42351, 42299, 42294, 42295, 42265, 42351, 42255, 42295, 42295, 42300, 42300, 42295, 42289, 42271, 42268, 42303, 42298, 42291, 42291, 42284, 42263, 42268, 42302, 42271, 42266, 42290, 42295, 42292, 42292, 42297, 42271, 42270, 42295, 42285, 42260, 42260, 42294, 42302, 42367, 42255, 42295, 42295, 42300, 42300, 42295, 42289, 42271, 42260, 42294, 42292, 42291, 42287, 42288, 42271, 42270, 42302, 42296, 42295, 42293, 42297, 42341, 42287, 42263, 42271, 42289, 42295, 42300, 42300, 42295, 42295, 42255, 42249, 42297, 42293, 42295, 42296, 42302, 42270, 42271, 42289, 42295, 42303, 42264, 42462, 42274, 42274, 42278, 42463, 42300, 42260, 42240, 42296, 42295, 42296, 42303, 42242, 42303, 42252, 42300, 42463, 42275, 42273, 42272, 42275, 42275, 42461, 42244, 42247, 42462, 42458, 42456, 42240, 42301, 42452, 42456, 42460, 42456, 42462, 42276, 42272, 42275, 42460, 42455, 42462, 42463, 42301, 42303, 42459, 42272, 42463, 42463, 42244, 42300, 42463, 42275, 42273, 42272, 42275, 42275, 42461, 42244, 42264, 42264, 42267, 42340, 42260, 42257, 42290, 42293, 42264, 42257, 42280, 42292, 42298, 42294, 42288, 42300, 42341, 42256, 42283, 42287, 42291, 42292, 42271, 42260, 42285, 42266, 42267, 42289, 42285, 42284, 42266, 42271, 42302, 42268, 42263, 42284, 42291, 42266, 42271, 42293, 42285, 42287, 42294, 42357, 42300, 42285, 42290, 42295, 42294, 42286, 42283, 42257, 42268, 42292, 42287, 42285, 42293, 42271, 42266, 42291, 42284, 42263, 42268, 42302, 42271, 42266, 42284, 42285, 42289, 42267, 42366, 42280, 42287, 42366, 42290, 42290, 42277, 42284, 42366, 42293, 42296, 42366, 42282, 42287, 42284, 42366, 42298, 42290, 42277, 42287, 42294, 42283, 42366, 42284, 42287, 42289, 42282, 42289, 42284, 42289, 42292, 42293, 42298, 42366, 42283, 42282, 42289, 42366, 42298, 42284, 42297, 42366, 42283, 42284, 42285, 42277, 42290, 42287, 42267, 42361, 42273, 42282, 42286, 42285, 42293};
        getOutputFormats = new int[]{1008004141, -273198475, -1962640815, -937566783, 498767034, 1084192882, 1663793877, -1991179365, 800162528, 1588548282, 1526091776, 1531820089, -2086327770, -539970879, -1213428870, 879010998, -1520349108, -1099182916};
    }
}
