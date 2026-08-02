package util.h.xy.cf;

/* loaded from: classes5.dex */
public class ma extends util.h.xy.cf.b {
    private static int Camera2StreamConfigurationMap = 1;
    private static char getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private static int getInputFormats;
    private static long getInputSizeshNQ4ISI;
    private static final java.lang.String getOutputMinFrameDuration;

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getOutputMinFrameDuration = util.h.xy.cf.ma.class.getName();
        Camera2StreamConfigurationMap = (getInputFormats + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
    }

    public ma(java.lang.String str) {
        super(str);
    }

    @Override // util.h.xy.cf.b
    /* renamed from: ᐝ */
    public int mo25889() throws org.json.JSONException {
        byte[] m25076;
        getInputFormats = (Camera2StreamConfigurationMap + 67) % 128;
        org.json.JSONObject optJSONObject = this.f1095.optJSONObject(util.h.xy.al.ra.f631);
        org.json.JSONObject optJSONObject2 = optJSONObject.optJSONObject(util.h.xy.al.ra.f678);
        org.json.JSONArray optJSONArray = optJSONObject.optJSONArray(util.h.xy.al.ra.f635);
        if (optJSONObject2 != null) {
            Camera2StreamConfigurationMap = (getInputFormats + 83) % 128;
            java.lang.String optString = optJSONObject2.optString(util.h.xy.al.ra.f589);
            if (optString == "") {
                Camera2StreamConfigurationMap = (getInputFormats + 81) % 128;
                m25076 = null;
            } else {
                m25076 = util.h.xy.ar.b.m25076(optString);
                getInputFormats = (Camera2StreamConfigurationMap + 53) % 128;
            }
            if (!util.h.xy.ar.b.m25070(m25076)) {
                util.h.xy.ar.b.m25074(m25076);
                getHighSpeedVideoFpsRangesFor(m25076);
            }
        }
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                int i2 = Camera2StreamConfigurationMap + 85;
                getInputFormats = i2 % 128;
                if (i2 % 2 != 0) {
                    util.h.xy.ar.b.m25070(util.h.xy.ar.b.m25076(optJSONArray.getJSONObject(i).getString(util.h.xy.al.ra.f589)));
                    throw null;
                }
                byte[] m250762 = util.h.xy.ar.b.m25076(optJSONArray.getJSONObject(i).getString(util.h.xy.al.ra.f589));
                if (!util.h.xy.ar.b.m25070(m250762)) {
                    util.h.xy.ar.b.m25074(m250762);
                    getHighSpeedVideoFpsRangesFor(m250762);
                }
            }
        }
        getInputFormats = (Camera2StreamConfigurationMap + 71) % 128;
        byte[] m250763 = util.h.xy.ar.b.m25076(this.f1095.getJSONObject(util.h.xy.al.ra.f631).getJSONObject(util.h.xy.al.ra.f600).getString(util.h.xy.al.ra.f589));
        util.h.xy.ar.b.m25074(m250763);
        getHighSpeedVideoFpsRangesFor(m250763);
        int i3 = getInputFormats + 29;
        Camera2StreamConfigurationMap = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        util.h.xy.ar.b.m25083(m250763[2], 3);
        int m25083 = util.h.xy.ar.b.m25083(m250763[2], 3);
        int i4 = getInputFormats + 41;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            return m25083;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.cf.b
    /* renamed from: ˏ */
    public org.json.JSONObject mo25898() throws org.json.JSONException {
        getInputFormats = (Camera2StreamConfigurationMap + 71) % 128;
        this.f1094 = super.mo25898();
        if (this.f1094 != null) {
            int i = getInputFormats + 47;
            Camera2StreamConfigurationMap = i % 128;
            if (i % 2 != 0) {
                if (this.f1094.has(util.h.xy.s.rh.f2413)) {
                    int i2 = getInputFormats + 15;
                    Camera2StreamConfigurationMap = i2 % 128;
                    if (i2 % 2 != 0) {
                        java.lang.String optString = this.f1094.optString(util.h.xy.s.rh.f2413);
                        if (!optString.isEmpty()) {
                            this.f1094.put(util.h.xy.s.rh.f2413, util.h.xy.ar.b.m25074(util.h.xy.bx.ra.f1063.m25786(optString)));
                        }
                    } else {
                        this.f1094.optString(util.h.xy.s.rh.f2413);
                        throw null;
                    }
                }
            } else {
                this.f1094.has(util.h.xy.s.rh.f2413);
                throw null;
            }
        }
        return this.f1094;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // util.h.xy.cf.b
    /* renamed from: ˏ */
    public com.gemalto.mfs.mwsdk.utils.async.AsyncResult mo25897(java.lang.String str, util.h.xy.d.c cVar) throws org.json.JSONException {
        int i;
        boolean z;
        org.json.JSONArray jSONArray = this.f1094.getJSONArray(util.h.xy.s.ma.f2373);
        java.lang.String string = this.f1093.getJSONObject(util.h.xy.s.ma.f2352).getString(util.h.xy.s.rh.f2416);
        ?? r6 = 0;
        int i2 = 0;
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> asyncResult = null;
        while (i2 < jSONArray.length()) {
            Camera2StreamConfigurationMap = (getInputFormats + 27) % 128;
            org.json.JSONObject jSONObject = jSONArray.getJSONObject(i2);
            java.lang.String optString = jSONObject.optString(util.h.xy.s.ma.f2375);
            java.lang.String optString2 = jSONObject.optString(util.h.xy.s.ma.f2339);
            if (util.h.xy.al.ra.f782.equalsIgnoreCase(optString)) {
                Camera2StreamConfigurationMap = (getInputFormats + 29) % 128;
                if (util.h.xy.al.ra.f775.equalsIgnoreCase(optString2)) {
                    asyncResult = cVar.mo26150(str, jSONObject.optString(util.h.xy.s.ma.f2370), string);
                    try {
                    } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
                        e = e;
                        i = i2;
                    }
                    if (util.h.xy.k.ra.f2243.m26968(str)) {
                        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.d.d> mo26170 = util.h.xy.k.ma.m26925().mo26170(str);
                        if (mo26170 == null || !mo26170.isSuccessful()) {
                            char c = (char) (android.widget.ExpandableListView.getPackedPositionForGroup(r6) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(r6) == 0L ? 0 : -1));
                            int packedPositionType = android.widget.ExpandableListView.getPackedPositionType(0L);
                            int i3 = getHighSpeedVideoFpsRangesFor + 13;
                            getHighSpeedVideoFpsRanges = i3 % 128;
                            if (i3 % 2 != 0) {
                                char[] charArray = "퐀ⱥ䦖둯".toCharArray();
                                int i4 = getHighSpeedVideoFpsRangesFor + 53;
                                getHighSpeedVideoFpsRanges = i4 % 128;
                                if (i4 % 2 != 0) {
                                    char[] charArray2 = "飡潟ᤱ뉸".toCharArray();
                                    int i5 = getHighSpeedVideoFpsRanges + 101;
                                    getHighSpeedVideoFpsRangesFor = i5 % 128;
                                    if (i5 % 2 != 0) {
                                        throw new java.lang.NullPointerException();
                                    }
                                    char[] charArray3 = "\uedb4葄㤦嘨\ud915\ued40∗㕂\ueedd㺨얕쯩팔\ue4a4ࢽ싫䬔ཀ\ue878쏘".toCharArray();
                                    util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
                                    int length = charArray2.length;
                                    char[] cArr = new char[length];
                                    int length2 = charArray.length;
                                    char[] cArr2 = new char[length2];
                                    java.lang.System.arraycopy(charArray2, r6, cArr, r6, length);
                                    java.lang.System.arraycopy(charArray, r6, cArr2, r6, length2);
                                    cArr[r6] = (char) (c ^ cArr[r6]);
                                    int i6 = 2;
                                    cArr2[2] = (char) (cArr2[2] + ((char) packedPositionType));
                                    int length3 = charArray3.length;
                                    char[] cArr3 = new char[length3];
                                    rcVar.f2652 = r6;
                                    while (rcVar.f2652 < length3) {
                                        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 59) % 128;
                                        int i7 = (rcVar.f2652 + i6) % 4;
                                        int i8 = (rcVar.f2652 + 3) % 4;
                                        rcVar.f2653 = (char) (((cArr[rcVar.f2652 % 4] * 32718) + cArr2[i7]) % 65535);
                                        cArr2[i8] = (char) (((cArr[i8] * 32718) + cArr2[i7]) / 65535);
                                        cArr[i8] = rcVar.f2653;
                                        int i9 = rcVar.f2652;
                                        int i10 = cArr[i8] ^ charArray3[rcVar.f2652];
                                        char[] cArr4 = cArr2;
                                        i = i2;
                                        try {
                                            cArr3[i9] = (char) (((i10 ^ (getInputSizeshNQ4ISI ^ 2457411417541981002L)) ^ ((int) (getHighSpeedVideoSizes ^ 2457411417541981002L))) ^ ((char) (getHighResolutionOutputSizeshNQ4ISI ^ 2457411417541981002L)));
                                            rcVar.f2652++;
                                            cArr2 = cArr4;
                                            i2 = i;
                                            i6 = 2;
                                        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e2) {
                                            e = e2;
                                            e.getMessage();
                                            z = false;
                                            asyncResult = new util.h.xy.an.ra<>(null, false, util.h.xy.al.ra.f676, 583);
                                            r6 = z;
                                            i2 = i + 1;
                                        }
                                    }
                                    i = i2;
                                    java.lang.String str2 = new java.lang.String(cArr3);
                                    java.lang.String str3 = str2;
                                    asyncResult = util.h.xy.x.a.m27685(str2.intern());
                                    z = false;
                                    r6 = z;
                                    i2 = i + 1;
                                }
                            }
                            throw null;
                        }
                        util.h.xy.f.b.f2201.m26753(mo26170.getResult(), (boolean) r6);
                    }
                    i = i2;
                    z = false;
                    r6 = z;
                    i2 = i + 1;
                }
            }
            i = i2;
            z = r6;
            r6 = z;
            i2 = i + 1;
        }
        return asyncResult;
    }

    private static void getHighSpeedVideoFpsRangesFor(byte[] bArr) {
        if (util.h.xy.ar.b.m25083(bArr[2], 3) == 0) {
            Camera2StreamConfigurationMap = (getInputFormats + 1) % 128;
            if (util.h.xy.ar.b.m25083(bArr[2], 4) == 0) {
                int i = Camera2StreamConfigurationMap + 31;
                getInputFormats = i % 128;
                if (i % 2 != 0) {
                    if (util.h.xy.ar.b.m25083(bArr[5], 67) != 0) {
                        return;
                    }
                } else if (util.h.xy.ar.b.m25083(bArr[2], 6) != 0) {
                    return;
                }
                if (util.h.xy.ar.b.m25083(bArr[2], 7) == 0) {
                    throw new util.h.xy.bn.ra(util.h.xy.al.ra.f728);
                }
            }
        }
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getInputSizeshNQ4ISI = -7605116061914896566L;
        getHighSpeedVideoSizes = 294925130;
        getHighResolutionOutputSizeshNQ4ISI = (char) 13130;
    }
}
