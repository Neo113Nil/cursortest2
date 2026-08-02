package util.h.xy.br;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ˊ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes18.dex */
public final class b {
    private static int Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static char[] getHighSpeedVideoFpsRanges = null;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private static final java.lang.String getInputFormats;
    private static final byte[] getInputSizeshNQ4ISI;
    private static final byte[] getOutputFormats;
    private static final /* synthetic */ util.h.xy.br.b[] getOutputMinFrameDuration;

    /* renamed from: ˊ, reason: contains not printable characters */
    public static final util.h.xy.br.b f1030;
    private util.h.xy.br.ra getOutputSizeshNQ4ISI;
    private final java.util.concurrent.locks.Lock getOutputStallDurationlomOqCM = new java.util.concurrent.locks.ReentrantLock();
    private android.content.SharedPreferences getHighSpeedVideoSizesFor = null;

    private b(java.lang.String str) {
    }

    public static util.h.xy.br.b valueOf(java.lang.String str) {
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 43) % 128;
        util.h.xy.br.b bVar = (util.h.xy.br.b) java.lang.Enum.valueOf(util.h.xy.br.b.class, str);
        int i = Camera2StreamConfigurationMap + 33;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 != 0) {
            return bVar;
        }
        throw new java.lang.ArithmeticException();
    }

    public static util.h.xy.br.b[] values() {
        int i = Camera2StreamConfigurationMap + 73;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
        util.h.xy.br.b[] bVarArr = (util.h.xy.br.b[]) getOutputMinFrameDuration.clone();
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 105) % 128;
        return bVarArr;
    }

    static {
        Camera2StreamConfigurationMap();
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes(false, new int[]{129, 8, 85, 0}, "\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000", objArr);
        util.h.xy.br.b bVar = new util.h.xy.br.b(((java.lang.String) objArr[0]).intern());
        f1030 = bVar;
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (i + 101) % 128;
        getHighSpeedVideoFpsRangesFor = (i + 117) % 128;
        getOutputMinFrameDuration = new util.h.xy.br.b[]{bVar};
        getInputFormats = util.h.xy.br.b.class.getName();
        getInputSizeshNQ4ISI = new byte[]{-2, com.google.common.base.Ascii.GS, 115, 89, -2, -41, -82, 125};
        getOutputFormats = new byte[]{40, 83, com.google.common.base.Ascii.EM, -109, org.apache.commons.imaging.formats.pnm.PnmConstants.PGM_TEXT_CODE, -19, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_TEXT_CODE, 121};
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 81) % 128;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m25594(android.content.Context context) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.String str;
        synchronized (this) {
            if (this.getHighSpeedVideoSizesFor == null) {
                int i = Camera2StreamConfigurationMap + 55;
                getHighSpeedVideoFpsRangesFor = i % 128;
                if (i % 2 == 0) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighSpeedVideoSizes(true, new int[]{0, 9, 0, 7}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001", objArr);
                    str = (java.lang.String) objArr[0];
                } else {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoSizes(false, new int[]{0, 9, 0, 7}, "\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001", objArr2);
                    str = (java.lang.String) objArr2[0];
                }
                this.getHighSpeedVideoSizesFor = context.getSharedPreferences(str.intern(), 0);
            }
            if (this.getOutputSizeshNQ4ISI == null) {
                util.h.xy.ac.c cVar = new util.h.xy.ac.c(util.h.xy.ad.a.m24548(util.h.xy.br.mc.m25609(context)));
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighSpeedVideoSizes(true, new int[]{9, 13, 0, 5}, "\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0000\u0000\u0000", objArr3);
                this.getOutputSizeshNQ4ISI = new util.h.xy.br.ra(context, ((java.lang.String) objArr3[0]).intern(), cVar);
                int i2 = Camera2StreamConfigurationMap + 107;
                getHighSpeedVideoFpsRangesFor = i2 % 128;
                int i3 = i2 % 2;
            }
            int i4 = Camera2StreamConfigurationMap + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getHighSpeedVideoFpsRangesFor = i4 % 128;
            if (i4 % 2 == 0) {
                throw null;
            }
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final void m25591(android.content.Context context, java.lang.String str, byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 47) % 128;
        try {
            try {
                this.getOutputStallDurationlomOqCM.lock();
                m25594(context);
                this.getOutputSizeshNQ4ISI.m25611(str.getBytes(), bArr);
                this.getOutputStallDurationlomOqCM.unlock();
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 13) % 128;
            } catch (util.h.xy.ac.mc e) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes(true, new int[]{22, 44, 0, 0}, "\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001", objArr);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr[0]).intern(), e);
            }
        } catch (java.lang.Throwable th) {
            this.getOutputStallDurationlomOqCM.unlock();
            throw th;
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final byte[] m25595(android.content.Context context, java.lang.String str) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        int i = getHighSpeedVideoFpsRangesFor + 99;
        Camera2StreamConfigurationMap = i % 128;
        try {
            try {
                if (i % 2 == 0) {
                    this.getOutputStallDurationlomOqCM.lock();
                    m25594(context);
                    byte[] m25612 = this.getOutputSizeshNQ4ISI.m25612(str.getBytes());
                    this.getOutputStallDurationlomOqCM.unlock();
                    int i2 = Camera2StreamConfigurationMap + 7;
                    getHighSpeedVideoFpsRangesFor = i2 % 128;
                    if (i2 % 2 != 0) {
                        return m25612;
                    }
                    throw null;
                }
                this.getOutputStallDurationlomOqCM.lock();
                m25594(context);
                this.getOutputSizeshNQ4ISI.m25612(str.getBytes());
                this.getOutputStallDurationlomOqCM.unlock();
                throw new java.lang.ArithmeticException();
            } catch (util.h.xy.ac.mc e) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoSizes(false, new int[]{66, 43, 0, 0}, "\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001", objArr);
                throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(((java.lang.String) objArr[0]).intern(), e);
            }
        } catch (java.lang.Throwable th) {
            this.getOutputStallDurationlomOqCM.unlock();
            throw th;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final boolean m25593() {
        java.lang.String string = this.getHighSpeedVideoSizesFor.getString(util.h.xy.al.rb.m25016(getInputSizeshNQ4ISI), null);
        if (string != null) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                jSONObject.optString(util.h.xy.al.rb.m25016(getOutputFormats));
                jSONObject.optString(util.h.xy.al.rb.m25016(util.h.xy.ak.ma.f82));
                jSONObject.optString(util.h.xy.al.rb.m25016(util.h.xy.ak.ma.f80));
                jSONObject.optString(util.h.xy.al.rb.m25016(util.h.xy.ak.ma.f77));
                jSONObject.optString(util.h.xy.al.rb.m25016(util.h.xy.ak.ma.f78));
                jSONObject.optString(util.h.xy.al.rb.m25016(util.h.xy.ak.ma.f83));
                getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 101) % 128;
                return true;
            } catch (org.json.JSONException unused) {
                return true;
            }
        }
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRangesFor = (i + 11) % 128;
        int i2 = i + 67;
        getHighSpeedVideoFpsRangesFor = i2 % 128;
        if (i2 % 2 != 0) {
            return false;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25596() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoSizes(false, new int[]{109, 20, 0, 0}, "\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001", objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put(util.h.xy.al.rb.m25016(getOutputFormats), intern);
            jSONObject.put(util.h.xy.al.rb.m25016(util.h.xy.ak.ma.f82), intern);
            jSONObject.put(util.h.xy.al.rb.m25016(util.h.xy.ak.ma.f80), intern);
            jSONObject.put(util.h.xy.al.rb.m25016(util.h.xy.ak.ma.f77), intern);
            jSONObject.put(util.h.xy.al.rb.m25016(util.h.xy.ak.ma.f78), intern);
            jSONObject.put(util.h.xy.al.rb.m25016(util.h.xy.ak.ma.f83), intern);
            android.content.SharedPreferences.Editor edit = this.getHighSpeedVideoSizesFor.edit();
            byte[] bArr = getInputSizeshNQ4ISI;
            util.h.xy.al.rb.m25016(bArr);
            edit.putString(util.h.xy.al.rb.m25016(bArr), jSONObject.toString());
            edit.apply();
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
        int i = Camera2StreamConfigurationMap + 11;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m25597() {
        int i = Camera2StreamConfigurationMap + 37;
        getHighSpeedVideoFpsRangesFor = i % 128;
        try {
            if (i % 2 != 0) {
                this.getOutputStallDurationlomOqCM.lock();
                android.content.SharedPreferences.Editor edit = this.getHighSpeedVideoSizesFor.edit();
                java.util.Iterator<java.lang.String> it = this.getHighSpeedVideoSizesFor.getAll().keySet().iterator();
                while (it.hasNext()) {
                    edit.remove(it.next());
                    edit.apply();
                    getHighSpeedVideoFpsRangesFor = (Camera2StreamConfigurationMap + 89) % 128;
                }
                this.getHighSpeedVideoSizesFor = null;
                return;
            }
            this.getOutputStallDurationlomOqCM.lock();
            this.getHighSpeedVideoSizesFor.edit();
            this.getHighSpeedVideoSizesFor.getAll().keySet().iterator();
            throw new java.lang.NullPointerException();
        } finally {
            this.getOutputStallDurationlomOqCM.unlock();
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public final void m25592(android.content.Context context) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        m25594(context);
        util.h.xy.br.ra raVar = this.getOutputSizeshNQ4ISI;
        if (raVar != null) {
            int i = Camera2StreamConfigurationMap + 9;
            getHighSpeedVideoFpsRangesFor = i % 128;
            if (i % 2 != 0) {
                raVar.m25613();
                this.getOutputSizeshNQ4ISI = null;
                Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRangesFor + 61) % 128;
            } else {
                raVar.m25613();
                this.getOutputSizeshNQ4ISI = null;
                throw new java.lang.ArithmeticException();
            }
        }
    }

    private static void getHighSpeedVideoSizes(boolean z, int[] iArr, java.lang.String str, java.lang.Object[] objArr) {
        int i;
        int length;
        char[] cArr;
        int i2 = getHighSpeedVideoSizes + 31;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        byte[] bytes = str.getBytes("ISO-8859-1");
        util.h.xz.b.ma maVar = new util.h.xz.b.ma();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = getHighSpeedVideoFpsRanges;
        if (cArr2 != null) {
            int i7 = getHighResolutionOutputSizeshNQ4ISI + 103;
            getHighSpeedVideoSizes = i7 % 128;
            if (i7 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            for (int i8 = 0; i8 < length; i8++) {
                getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 11) % 128;
                cArr[i8] = (char) (cArr2[i8] ^ (-8125198844289309347L));
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i4];
        java.lang.System.arraycopy(cArr2, i3, cArr3, 0, i4);
        if (bytes != null) {
            char[] cArr4 = new char[i4];
            maVar.f2631 = 0;
            char c = 0;
            while (maVar.f2631 < i4) {
                if (bytes[maVar.f2631] == 1) {
                    cArr4[maVar.f2631] = (char) (((cArr3[maVar.f2631] * 2) + 1) - c);
                } else {
                    cArr4[maVar.f2631] = (char) ((cArr3[maVar.f2631] * 2) - c);
                }
                c = cArr4[maVar.f2631];
                maVar.f2631++;
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            java.lang.System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i9 = i4 - i6;
            java.lang.System.arraycopy(cArr5, 0, cArr3, i9, i6);
            java.lang.System.arraycopy(cArr5, i6, cArr3, 0, i9);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            maVar.f2631 = 0;
            while (maVar.f2631 < i4) {
                cArr6[maVar.f2631] = cArr3[(i4 - maVar.f2631) - 1];
                maVar.f2631++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 107) % 128;
            maVar.f2631 = 0;
            while (maVar.f2631 < i4) {
                int i10 = getHighResolutionOutputSizeshNQ4ISI + 75;
                getHighSpeedVideoSizes = i10 % 128;
                if (i10 % 2 != 0) {
                    cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] >>> iArr[3]);
                    i = maVar.f2631;
                } else {
                    cArr3[maVar.f2631] = (char) (cArr3[maVar.f2631] - iArr[2]);
                    i = maVar.f2631 + 1;
                }
                maVar.f2631 = i;
            }
        }
        objArr[0] = new java.lang.String(cArr3);
    }

    static void Camera2StreamConfigurationMap() {
        getHighSpeedVideoFpsRanges = new char[]{42340, 42294, 42299, 42290, 42282, 42290, 42302, 42299, 42293, 42344, 42285, 42291, 42295, 42285, 42295, 42289, 42291, 42299, 42297, 42289, 42288, 42296, 42317, 42266, 42291, 42289, 42291, 42287, 42295, 42297, 42288, 42291, 42271, 42271, 42289, 42291, 42288, 42281, 42262, 42271, 42299, 42297, 42292, 42285, 42284, 42302, 42241, 42296, 42294, 42300, 42247, 42297, 42294, 42292, 42297, 42240, 42300, 42281, 42243, 42241, 42284, 42292, 42292, 42286, 42288, 42245, 42357, 42245, 42288, 42286, 42292, 42292, 42284, 42241, 42243, 42281, 42300, 42240, 42297, 42292, 42294, 42297, 42247, 42300, 42294, 42296, 42241, 42302, 42284, 42285, 42292, 42297, 42299, 42260, 42253, 42294, 42302, 42303, 42271, 42365, 42271, 42291, 42288, 42297, 42295, 42287, 42291, 42289, 42291, 42358, 42301, 42295, 42289, 42295, 42296, 42298, 42267, 42340, 42240, 42297, 42299, 42293, 42289, 42284, 42295, 42302, 42292, 42294, 42260, 42258, 42493, 42488, 42485, 42434, 42433, 42432, 42436};
    }
}
