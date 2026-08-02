package util.h.xy.cg;

/* loaded from: classes5.dex */
public final class b {
    private static int[] Camera2StreamConfigurationMap = null;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes = 1;
    private static util.h.xy.cg.b getHighSpeedVideoSizesFor = null;
    private static int getInputFormats = 0;
    private static int getInputSizeshNQ4ISI = 1;
    private static long getOutputFormats;
    private static char getOutputMinFrameDuration;

    static {
        getHighSpeedVideoSizes();
        getHighSpeedVideoFpsRangesFor = util.h.xy.cg.b.class.getName();
        int i = getHighSpeedVideoFpsRanges + 3;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    private b() {
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.cg.b m25907() {
        int i = getHighSpeedVideoFpsRanges + 39;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 != 0) {
            if (getHighSpeedVideoSizesFor == null) {
                getHighSpeedVideoSizesFor = new util.h.xy.cg.b();
                getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 5) % 128;
            }
            return getHighSpeedVideoSizesFor;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:226:0x0677, code lost:
    
        if (r13 == util.h.xy.u.b.f2432) goto L145;
     */
    /* JADX WARN: Removed duplicated region for block: B:181:0x07e0 A[Catch: InternalComponentException -> 0x0a28, rc -> 0x0a2d, JSONException -> 0x0a2f, g -> 0x0a31, TRY_ENTER, TRY_LEAVE, TryCatch #11 {InternalComponentException -> 0x0a28, JSONException -> 0x0a2f, rc -> 0x0a2d, g -> 0x0a31, blocks: (B:10:0x0191, B:15:0x01bf, B:16:0x0214, B:18:0x0253, B:20:0x0286, B:21:0x02b6, B:23:0x02e7, B:26:0x031f, B:29:0x034c, B:33:0x0384, B:38:0x03ac, B:42:0x0410, B:46:0x0446, B:50:0x046b, B:54:0x0476, B:57:0x047f, B:62:0x0495, B:67:0x04bb, B:69:0x04d9, B:71:0x0506, B:79:0x051c, B:84:0x0854, B:90:0x08a0, B:94:0x08de, B:96:0x08fe, B:98:0x0904, B:100:0x090e, B:101:0x091a, B:103:0x0924, B:105:0x092c, B:107:0x0938, B:109:0x094b, B:113:0x095c, B:115:0x0966, B:117:0x0974, B:118:0x0980, B:121:0x0984, B:129:0x098e, B:132:0x0999, B:151:0x09c1, B:153:0x09c8, B:154:0x09c9, B:155:0x09ca, B:164:0x058d, B:166:0x05ab, B:176:0x05da, B:178:0x05e5, B:179:0x0624, B:181:0x07e0, B:185:0x07f8, B:186:0x0804, B:188:0x080f, B:189:0x0814, B:196:0x0826, B:198:0x0847, B:200:0x05f7, B:202:0x0600, B:203:0x060a, B:204:0x0614, B:205:0x0615, B:206:0x062b, B:208:0x063c, B:210:0x0647, B:214:0x0658, B:217:0x065e, B:220:0x0664, B:223:0x066a, B:225:0x0675, B:227:0x0680, B:228:0x0687, B:231:0x068d, B:232:0x06bb, B:233:0x076c, B:234:0x0771, B:236:0x0780, B:242:0x06c3, B:247:0x06d7, B:248:0x0763, B:252:0x06f5, B:254:0x0709, B:257:0x073c, B:259:0x0679, B:260:0x064d, B:261:0x0654, B:263:0x03cf, B:276:0x01dd, B:278:0x01e4, B:279:0x01e5, B:280:0x01e6), top: B:8:0x018f }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x07ed  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x081a  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0780 A[Catch: InternalComponentException -> 0x0a28, rc -> 0x0a2d, JSONException -> 0x0a2f, g -> 0x0a31, TRY_LEAVE, TryCatch #11 {InternalComponentException -> 0x0a28, JSONException -> 0x0a2f, rc -> 0x0a2d, g -> 0x0a31, blocks: (B:10:0x0191, B:15:0x01bf, B:16:0x0214, B:18:0x0253, B:20:0x0286, B:21:0x02b6, B:23:0x02e7, B:26:0x031f, B:29:0x034c, B:33:0x0384, B:38:0x03ac, B:42:0x0410, B:46:0x0446, B:50:0x046b, B:54:0x0476, B:57:0x047f, B:62:0x0495, B:67:0x04bb, B:69:0x04d9, B:71:0x0506, B:79:0x051c, B:84:0x0854, B:90:0x08a0, B:94:0x08de, B:96:0x08fe, B:98:0x0904, B:100:0x090e, B:101:0x091a, B:103:0x0924, B:105:0x092c, B:107:0x0938, B:109:0x094b, B:113:0x095c, B:115:0x0966, B:117:0x0974, B:118:0x0980, B:121:0x0984, B:129:0x098e, B:132:0x0999, B:151:0x09c1, B:153:0x09c8, B:154:0x09c9, B:155:0x09ca, B:164:0x058d, B:166:0x05ab, B:176:0x05da, B:178:0x05e5, B:179:0x0624, B:181:0x07e0, B:185:0x07f8, B:186:0x0804, B:188:0x080f, B:189:0x0814, B:196:0x0826, B:198:0x0847, B:200:0x05f7, B:202:0x0600, B:203:0x060a, B:204:0x0614, B:205:0x0615, B:206:0x062b, B:208:0x063c, B:210:0x0647, B:214:0x0658, B:217:0x065e, B:220:0x0664, B:223:0x066a, B:225:0x0675, B:227:0x0680, B:228:0x0687, B:231:0x068d, B:232:0x06bb, B:233:0x076c, B:234:0x0771, B:236:0x0780, B:242:0x06c3, B:247:0x06d7, B:248:0x0763, B:252:0x06f5, B:254:0x0709, B:257:0x073c, B:259:0x0679, B:260:0x064d, B:261:0x0654, B:263:0x03cf, B:276:0x01dd, B:278:0x01e4, B:279:0x01e5, B:280:0x01e6), top: B:8:0x018f }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02e7 A[Catch: InternalComponentException -> 0x0a28, rc -> 0x0a2d, JSONException -> 0x0a2f, g -> 0x0a31, TryCatch #11 {InternalComponentException -> 0x0a28, JSONException -> 0x0a2f, rc -> 0x0a2d, g -> 0x0a31, blocks: (B:10:0x0191, B:15:0x01bf, B:16:0x0214, B:18:0x0253, B:20:0x0286, B:21:0x02b6, B:23:0x02e7, B:26:0x031f, B:29:0x034c, B:33:0x0384, B:38:0x03ac, B:42:0x0410, B:46:0x0446, B:50:0x046b, B:54:0x0476, B:57:0x047f, B:62:0x0495, B:67:0x04bb, B:69:0x04d9, B:71:0x0506, B:79:0x051c, B:84:0x0854, B:90:0x08a0, B:94:0x08de, B:96:0x08fe, B:98:0x0904, B:100:0x090e, B:101:0x091a, B:103:0x0924, B:105:0x092c, B:107:0x0938, B:109:0x094b, B:113:0x095c, B:115:0x0966, B:117:0x0974, B:118:0x0980, B:121:0x0984, B:129:0x098e, B:132:0x0999, B:151:0x09c1, B:153:0x09c8, B:154:0x09c9, B:155:0x09ca, B:164:0x058d, B:166:0x05ab, B:176:0x05da, B:178:0x05e5, B:179:0x0624, B:181:0x07e0, B:185:0x07f8, B:186:0x0804, B:188:0x080f, B:189:0x0814, B:196:0x0826, B:198:0x0847, B:200:0x05f7, B:202:0x0600, B:203:0x060a, B:204:0x0614, B:205:0x0615, B:206:0x062b, B:208:0x063c, B:210:0x0647, B:214:0x0658, B:217:0x065e, B:220:0x0664, B:223:0x066a, B:225:0x0675, B:227:0x0680, B:228:0x0687, B:231:0x068d, B:232:0x06bb, B:233:0x076c, B:234:0x0771, B:236:0x0780, B:242:0x06c3, B:247:0x06d7, B:248:0x0763, B:252:0x06f5, B:254:0x0709, B:257:0x073c, B:259:0x0679, B:260:0x064d, B:261:0x0654, B:263:0x03cf, B:276:0x01dd, B:278:0x01e4, B:279:0x01e5, B:280:0x01e6), top: B:8:0x018f }] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0a95  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0abb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x051c A[Catch: InternalComponentException -> 0x0a28, rc -> 0x0a2d, JSONException -> 0x0a2f, g -> 0x0a31, TRY_LEAVE, TryCatch #11 {InternalComponentException -> 0x0a28, JSONException -> 0x0a2f, rc -> 0x0a2d, g -> 0x0a31, blocks: (B:10:0x0191, B:15:0x01bf, B:16:0x0214, B:18:0x0253, B:20:0x0286, B:21:0x02b6, B:23:0x02e7, B:26:0x031f, B:29:0x034c, B:33:0x0384, B:38:0x03ac, B:42:0x0410, B:46:0x0446, B:50:0x046b, B:54:0x0476, B:57:0x047f, B:62:0x0495, B:67:0x04bb, B:69:0x04d9, B:71:0x0506, B:79:0x051c, B:84:0x0854, B:90:0x08a0, B:94:0x08de, B:96:0x08fe, B:98:0x0904, B:100:0x090e, B:101:0x091a, B:103:0x0924, B:105:0x092c, B:107:0x0938, B:109:0x094b, B:113:0x095c, B:115:0x0966, B:117:0x0974, B:118:0x0980, B:121:0x0984, B:129:0x098e, B:132:0x0999, B:151:0x09c1, B:153:0x09c8, B:154:0x09c9, B:155:0x09ca, B:164:0x058d, B:166:0x05ab, B:176:0x05da, B:178:0x05e5, B:179:0x0624, B:181:0x07e0, B:185:0x07f8, B:186:0x0804, B:188:0x080f, B:189:0x0814, B:196:0x0826, B:198:0x0847, B:200:0x05f7, B:202:0x0600, B:203:0x060a, B:204:0x0614, B:205:0x0615, B:206:0x062b, B:208:0x063c, B:210:0x0647, B:214:0x0658, B:217:0x065e, B:220:0x0664, B:223:0x066a, B:225:0x0675, B:227:0x0680, B:228:0x0687, B:231:0x068d, B:232:0x06bb, B:233:0x076c, B:234:0x0771, B:236:0x0780, B:242:0x06c3, B:247:0x06d7, B:248:0x0763, B:252:0x06f5, B:254:0x0709, B:257:0x073c, B:259:0x0679, B:260:0x064d, B:261:0x0654, B:263:0x03cf, B:276:0x01dd, B:278:0x01e4, B:279:0x01e5, B:280:0x01e6), top: B:8:0x018f }] */
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m25910(java.lang.String str, com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState, java.lang.String str2) {
        util.h.xy.d.g gVar;
        java.lang.Throwable th;
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult raVar;
        org.json.JSONObject jSONObject;
        java.lang.String optString;
        org.json.JSONObject m25914;
        org.json.JSONObject jSONObject2;
        org.json.JSONObject jSONObject3;
        java.lang.String optString2;
        java.lang.Object[] objArr;
        java.lang.String optString3;
        util.h.xy.cf.b m25902;
        org.json.JSONObject mo25898;
        java.lang.Object[] objArr2;
        java.lang.String str3;
        java.lang.String intern;
        java.lang.String str4;
        util.h.xy.d.g e;
        java.lang.Throwable e2;
        int i;
        java.lang.Object[] objArr3;
        int i2;
        util.h.xy.cg.b.C0266b c0266b;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7 = "";
        util.h.xy.d.c m26975 = util.h.xy.m.mb.m26975(util.h.xy.ag.a.m24556().m24558());
        com.gemalto.mfs.mwsdk.dcm.DigitalizedCardState digitalizedCardState2 = null;
        try {
            try {
                jSONObject = new org.json.JSONObject(str2);
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\udc1a녝㷆빼闆ൽ濹욈\ueb7cྗ羍ᜫ㽶ꟈ癘", (char) ((-16735640) - android.graphics.Color.rgb(0, 0, 0)), 1905653318 - android.widget.ExpandableListView.getPackedPositionType(0L), "䙝闶桱鞢", "ﶩ䶴쯨\ue4e1", objArr4);
                org.json.JSONObject jSONObject4 = jSONObject.getJSONObject(((java.lang.String) objArr4[0]).intern());
                java.lang.Object[] objArr5 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(new int[]{-659214354, -1598562538, 399607587, -606126563}, 6 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), objArr5);
                java.lang.String intern2 = ((java.lang.String) objArr5[0]).intern();
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(new int[]{1244030519, 199849411, -516898034, 200240998, -156649298, -687256720}, 12 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr6);
                optString = jSONObject4.optString(intern2, ((java.lang.String) objArr6[0]).intern());
                m25914 = util.h.xy.cg.d.f1098.m25914(jSONObject4);
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("鿩즿之쐜\ue87eӛ阜", (char) (android.view.ViewConfiguration.getJumpTapTimeout() >> 16), android.text.TextUtils.indexOf("", "", 0, 0) + 1751942681, "ᦈ沆湨惪", "ﶩ䶴쯨\ue4e1", objArr7);
                jSONObject2 = m25914.getJSONObject(((java.lang.String) objArr7[0]).intern());
                java.lang.Object[] objArr8 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("戠躼", (char) (android.view.View.combineMeasuredStates(0, 0) + 27900), android.view.KeyEvent.normalizeMetaState(0), "뺫鬤ﲍ\ue66c", "ﶩ䶴쯨\ue4e1", objArr8);
                jSONObject3 = jSONObject2.getJSONObject(((java.lang.String) objArr8[0]).intern());
                try {
                    java.lang.Object[] objArr9 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(new int[]{1627570940, -585245546, -1896746518, -151038234}, (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 6, objArr9);
                    java.lang.String intern3 = ((java.lang.String) objArr9[0]).intern();
                    java.lang.Object[] objArr10 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("튟㕛\uf471", (char) (30915 - (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), 363212797 - android.text.TextUtils.indexOf("", ""), "ﶭ\ua62f쌕홸", "ﶩ䶴쯨\ue4e1", objArr10);
                    optString2 = jSONObject3.optString(intern3, ((java.lang.String) objArr10[0]).intern());
                    objArr = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("\ue6a1社灙ې꩔墸叢꺾筐砪䠀럞몎\ueb9d", (char) (44813 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), android.view.View.combineMeasuredStates(0, 0), "ꑟ誈ೄ鲯", "ﶩ䶴쯨\ue4e1", objArr);
                } catch (java.lang.Throwable th2) {
                    java.lang.Throwable cause = th2.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th2;
                }
            } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e3) {
                e = e3;
            } catch (org.json.JSONException e4) {
                e = e4;
            } catch (util.h.xy.ck.rc e5) {
                e = e5;
            } catch (util.h.xy.d.g e6) {
                e = e6;
            }
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e7) {
            e = e7;
            digitalizedCardState2 = digitalizedCardState;
            th = e;
            th.getMessage();
            java.lang.Object[] objArr11 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{1282930786, -1299896749, -2053005620, -472255530, 629093, 1157002462, 995888243, 869219792, 1595326394, 1040415085, -1959069257, -1836726021, 1051525656, 156533826, 1782947688, -1721702873, -1254112149, 324558506, -948066932, -1815833755, 1436825522, 2102561416, -1169841508, -1373315533, -1996186485, -882652585, -377029994, 552869522, -1463577459, 1453446234, 1514326164, -1755699230, -258725593, 1952525596}, (-16777149) - android.graphics.Color.rgb(0, 0, 0), objArr11);
            raVar = new util.h.xy.an.ra(null, false, ((java.lang.String) objArr11[0]).intern(), 583);
            if (raVar == null) {
            }
            if (raVar != null) {
            }
            return raVar;
        } catch (org.json.JSONException e8) {
            e = e8;
            digitalizedCardState2 = digitalizedCardState;
            th = e;
            th.getMessage();
            java.lang.Object[] objArr112 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{1282930786, -1299896749, -2053005620, -472255530, 629093, 1157002462, 995888243, 869219792, 1595326394, 1040415085, -1959069257, -1836726021, 1051525656, 156533826, 1782947688, -1721702873, -1254112149, 324558506, -948066932, -1815833755, 1436825522, 2102561416, -1169841508, -1373315533, -1996186485, -882652585, -377029994, 552869522, -1463577459, 1453446234, 1514326164, -1755699230, -258725593, 1952525596}, (-16777149) - android.graphics.Color.rgb(0, 0, 0), objArr112);
            raVar = new util.h.xy.an.ra(null, false, ((java.lang.String) objArr112[0]).intern(), 583);
            if (raVar == null) {
            }
            if (raVar != null) {
            }
            return raVar;
        } catch (util.h.xy.ck.rc e9) {
            e = e9;
            digitalizedCardState2 = digitalizedCardState;
            th = e;
            th.getMessage();
            java.lang.Object[] objArr1122 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{1282930786, -1299896749, -2053005620, -472255530, 629093, 1157002462, 995888243, 869219792, 1595326394, 1040415085, -1959069257, -1836726021, 1051525656, 156533826, 1782947688, -1721702873, -1254112149, 324558506, -948066932, -1815833755, 1436825522, 2102561416, -1169841508, -1373315533, -1996186485, -882652585, -377029994, 552869522, -1463577459, 1453446234, 1514326164, -1755699230, -258725593, 1952525596}, (-16777149) - android.graphics.Color.rgb(0, 0, 0), objArr1122);
            raVar = new util.h.xy.an.ra(null, false, ((java.lang.String) objArr1122[0]).intern(), 583);
            if (raVar == null) {
            }
            if (raVar != null) {
            }
            return raVar;
        } catch (util.h.xy.d.g e10) {
            e = e10;
            digitalizedCardState2 = digitalizedCardState;
        }
        try {
            if (((java.lang.String) objArr[0]).intern().equalsIgnoreCase(optString)) {
                try {
                    java.lang.Object[] objArr12 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("䥎\uda96봞ㇻ", (char) ((android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 62572), (-1) - ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue(), "꺕礏氶ῴ", "ﶩ䶴쯨\ue4e1", objArr12);
                    optString3 = ((java.lang.String) objArr12[0]).intern();
                } catch (java.lang.Throwable th3) {
                    java.lang.Throwable cause2 = th3.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th3;
                }
            } else {
                java.lang.Object[] objArr13 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("ࣅ㲼굨頂ℏ鱯", (char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 16521), android.widget.ExpandableListView.getPackedPositionType(0L), "ܘ霳誺ﱀ", "ﶩ䶴쯨\ue4e1", objArr13);
                optString3 = jSONObject3.optString(((java.lang.String) objArr13[0]).intern(), null);
            }
            m25902 = util.h.xy.cf.ra.m25902(optString3);
            m25902.m25900(m25914);
            mo25898 = m25902.mo25898();
            objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("Ꙗℷ蘄浡싄쏝ڂ", (char) ((-1) - android.view.MotionEvent.axisFromString("")), android.view.KeyEvent.normalizeMetaState(0) + 1569384229, "◸諧\uee5d熑", "ﶩ䶴쯨\ue4e1", objArr2);
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e11) {
            e = e11;
            digitalizedCardState2 = digitalizedCardState;
            th = e;
            th.getMessage();
            java.lang.Object[] objArr11222 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{1282930786, -1299896749, -2053005620, -472255530, 629093, 1157002462, 995888243, 869219792, 1595326394, 1040415085, -1959069257, -1836726021, 1051525656, 156533826, 1782947688, -1721702873, -1254112149, 324558506, -948066932, -1815833755, 1436825522, 2102561416, -1169841508, -1373315533, -1996186485, -882652585, -377029994, 552869522, -1463577459, 1453446234, 1514326164, -1755699230, -258725593, 1952525596}, (-16777149) - android.graphics.Color.rgb(0, 0, 0), objArr11222);
            raVar = new util.h.xy.an.ra(null, false, ((java.lang.String) objArr11222[0]).intern(), 583);
            if (raVar == null) {
            }
            if (raVar != null) {
            }
            return raVar;
        } catch (org.json.JSONException e12) {
            e = e12;
            digitalizedCardState2 = digitalizedCardState;
            th = e;
            th.getMessage();
            java.lang.Object[] objArr112222 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{1282930786, -1299896749, -2053005620, -472255530, 629093, 1157002462, 995888243, 869219792, 1595326394, 1040415085, -1959069257, -1836726021, 1051525656, 156533826, 1782947688, -1721702873, -1254112149, 324558506, -948066932, -1815833755, 1436825522, 2102561416, -1169841508, -1373315533, -1996186485, -882652585, -377029994, 552869522, -1463577459, 1453446234, 1514326164, -1755699230, -258725593, 1952525596}, (-16777149) - android.graphics.Color.rgb(0, 0, 0), objArr112222);
            raVar = new util.h.xy.an.ra(null, false, ((java.lang.String) objArr112222[0]).intern(), 583);
            if (raVar == null) {
            }
            if (raVar != null) {
            }
            return raVar;
        } catch (util.h.xy.ck.rc e13) {
            e = e13;
            digitalizedCardState2 = digitalizedCardState;
            th = e;
            th.getMessage();
            java.lang.Object[] objArr1122222 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{1282930786, -1299896749, -2053005620, -472255530, 629093, 1157002462, 995888243, 869219792, 1595326394, 1040415085, -1959069257, -1836726021, 1051525656, 156533826, 1782947688, -1721702873, -1254112149, 324558506, -948066932, -1815833755, 1436825522, 2102561416, -1169841508, -1373315533, -1996186485, -882652585, -377029994, 552869522, -1463577459, 1453446234, 1514326164, -1755699230, -258725593, 1952525596}, (-16777149) - android.graphics.Color.rgb(0, 0, 0), objArr1122222);
            raVar = new util.h.xy.an.ra(null, false, ((java.lang.String) objArr1122222[0]).intern(), 583);
            if (raVar == null) {
            }
            if (raVar != null) {
            }
            return raVar;
        } catch (util.h.xy.d.g e14) {
            e = e14;
            digitalizedCardState2 = digitalizedCardState;
            gVar = e;
            gVar.getMessage();
            raVar = new util.h.xy.an.ra(null, false, gVar.getMessage(), com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_PERSO_DATA, gVar.m26182());
            if (raVar == null) {
            }
            if (raVar != null) {
            }
            return raVar;
        }
        if (jSONObject.has(((java.lang.String) objArr2[0]).intern())) {
            java.lang.Object[] objArr14 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("Ꙗℷ蘄浡싄쏝ڂ", (char) (android.view.ViewConfiguration.getTouchSlop() >> 8), 1569384229 - android.view.KeyEvent.normalizeMetaState(0), "◸諧\uee5d熑", "ﶩ䶴쯨\ue4e1", objArr14);
            if (!jSONObject.isNull(((java.lang.String) objArr14[0]).intern())) {
                java.lang.Object[] objArr15 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("Ꙗℷ蘄浡싄쏝ڂ", (char) android.text.TextUtils.getTrimmedLength(""), android.view.View.MeasureSpec.getMode(0) + 1569384229, "◸諧\uee5d熑", "ﶩ䶴쯨\ue4e1", objArr15);
                str3 = jSONObject.getString(((java.lang.String) objArr15[0]).intern());
                java.lang.Object[] objArr16 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("詿\uf5f2浱㰌謍뼗竤ⶌ\u0ba1枑⇏枋", (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), android.view.View.resolveSize(0, 0), "죏톑\u18f6ᯒ", "ﶩ䶴쯨\ue4e1", objArr16);
                intern = ((java.lang.String) objArr16[0]).intern();
                if (!jSONObject3.has(intern)) {
                    java.lang.String string = jSONObject3.getString(intern);
                    java.lang.Object[] objArr17 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("鎃ⲧ䔥\ude6c", (char) (38212 - android.graphics.Color.green(0)), android.graphics.ImageFormat.getBitsPerPixel(0) + 1, "硷\uf624䑹펕", "ﶩ䶴쯨\ue4e1", objArr17);
                    if (string.equals(((java.lang.String) objArr17[0]).intern())) {
                        if (mo25898 == null) {
                            java.lang.Object[] objArr18 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("诨\ue202叉㜇\uebd6\uf16d⢲繈\u0dcc㻢桄莍篟\uf362蹌‛⅓邽岂\ued06㪅㞸蓀딊顦鈙Ɒ滝窼夈䜫쬾鎍\ue074쥅瓕₉珠芵겎㗔㝜\ue1ca灷ٍ誕ﵱᙝ䰏ꆊ停\udd76", (char) (45705 - android.graphics.Color.green(0)), android.view.View.combineMeasuredStates(0, 0), "̛㱇觨農", "ﶩ䶴쯨\ue4e1", objArr18);
                            return new util.h.xy.an.ra(null, false, ((java.lang.String) objArr18[0]).intern(), com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_PERSO_DATA);
                        }
                        java.lang.Object[] objArr19 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("㱰ף삉㤑ሳ痋\u1ae7", (char) android.view.View.MeasureSpec.getMode(0), 628393035 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), "䭈璄혥￤", "ﶩ䶴쯨\ue4e1", objArr19);
                        org.json.JSONObject jSONObject5 = mo25898.getJSONObject(((java.lang.String) objArr19[0]).intern());
                        try {
                            str4 = "android.os.Process";
                            java.lang.Object[] objArr20 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(new int[]{-1831443796, 879318449, 1325626662, 382577991, 782859491, -1231367191, 1137259741, -214889042}, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 13, objArr20);
                            if (jSONObject5.has(((java.lang.String) objArr20[0]).intern())) {
                                java.lang.Object[] objArr21 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(new int[]{-1831443796, 879318449, 1325626662, 382577991, 782859491, -1231367191, 1137259741, -214889042}, android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 14, objArr21);
                                if (jSONObject5.getString(((java.lang.String) objArr21[0]).intern()) == null) {
                                }
                            }
                            java.lang.Object[] objArr22 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("ꍯ汶\ue040웢♈ࡤꜿ悑曃ꠦ烿짂펷טּ\ue69a㞦덳뀀᱘긦ꪏﭯА珰⦖ꂲ縈න컖臹쵆ᰉ閌챉\uee21သ♲髋攞熮\uf520黆\uf0f1", (char) (40463 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (-1543102669) - android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0), "㓻؟Ⴄ膞", "ﶩ䶴쯨\ue4e1", objArr22);
                            return new util.h.xy.an.ra(null, false, ((java.lang.String) objArr22[0]).intern(), com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_PERSO_DATA);
                        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e15) {
                            e2 = e15;
                            th = e2;
                            digitalizedCardState2 = digitalizedCardState;
                            th.getMessage();
                            java.lang.Object[] objArr11222222 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(new int[]{1282930786, -1299896749, -2053005620, -472255530, 629093, 1157002462, 995888243, 869219792, 1595326394, 1040415085, -1959069257, -1836726021, 1051525656, 156533826, 1782947688, -1721702873, -1254112149, 324558506, -948066932, -1815833755, 1436825522, 2102561416, -1169841508, -1373315533, -1996186485, -882652585, -377029994, 552869522, -1463577459, 1453446234, 1514326164, -1755699230, -258725593, 1952525596}, (-16777149) - android.graphics.Color.rgb(0, 0, 0), objArr11222222);
                            raVar = new util.h.xy.an.ra(null, false, ((java.lang.String) objArr11222222[0]).intern(), 583);
                            if (raVar == null) {
                            }
                            if (raVar != null) {
                            }
                            return raVar;
                        } catch (org.json.JSONException e16) {
                            e2 = e16;
                            th = e2;
                            digitalizedCardState2 = digitalizedCardState;
                            th.getMessage();
                            java.lang.Object[] objArr112222222 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(new int[]{1282930786, -1299896749, -2053005620, -472255530, 629093, 1157002462, 995888243, 869219792, 1595326394, 1040415085, -1959069257, -1836726021, 1051525656, 156533826, 1782947688, -1721702873, -1254112149, 324558506, -948066932, -1815833755, 1436825522, 2102561416, -1169841508, -1373315533, -1996186485, -882652585, -377029994, 552869522, -1463577459, 1453446234, 1514326164, -1755699230, -258725593, 1952525596}, (-16777149) - android.graphics.Color.rgb(0, 0, 0), objArr112222222);
                            raVar = new util.h.xy.an.ra(null, false, ((java.lang.String) objArr112222222[0]).intern(), 583);
                            if (raVar == null) {
                            }
                            if (raVar != null) {
                            }
                            return raVar;
                        } catch (util.h.xy.ck.rc e17) {
                            e2 = e17;
                            th = e2;
                            digitalizedCardState2 = digitalizedCardState;
                            th.getMessage();
                            java.lang.Object[] objArr1122222222 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(new int[]{1282930786, -1299896749, -2053005620, -472255530, 629093, 1157002462, 995888243, 869219792, 1595326394, 1040415085, -1959069257, -1836726021, 1051525656, 156533826, 1782947688, -1721702873, -1254112149, 324558506, -948066932, -1815833755, 1436825522, 2102561416, -1169841508, -1373315533, -1996186485, -882652585, -377029994, 552869522, -1463577459, 1453446234, 1514326164, -1755699230, -258725593, 1952525596}, (-16777149) - android.graphics.Color.rgb(0, 0, 0), objArr1122222222);
                            raVar = new util.h.xy.an.ra(null, false, ((java.lang.String) objArr1122222222[0]).intern(), 583);
                            if (raVar == null) {
                            }
                            if (raVar != null) {
                            }
                            return raVar;
                        } catch (util.h.xy.d.g e18) {
                            e = e18;
                            gVar = e;
                            digitalizedCardState2 = digitalizedCardState;
                            gVar.getMessage();
                            raVar = new util.h.xy.an.ra(null, false, gVar.getMessage(), com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_PERSO_DATA, gVar.m26182());
                            if (raVar == null) {
                            }
                            if (raVar != null) {
                            }
                            return raVar;
                        }
                    }
                    str4 = "android.os.Process";
                    i = 0;
                    objArr3 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("\ue6a1社灙ې꩔墸叢꺾筐砪䠀럞몎\ueb9d", (char) (44812 - android.view.View.MeasureSpec.getSize(i)), android.text.TextUtils.indexOf("", "", i, i), "ꑟ誈ೄ鲯", "ﶩ䶴쯨\ue4e1", objArr3);
                    if (((java.lang.String) objArr3[0]).intern().equalsIgnoreCase(optString)) {
                        java.lang.Object[] objArr23 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(new int[]{1338937517, 1518183149, 415227057, 1785477948, -1335005209, 1099771162, -1174715551, 1051524648, 1540797029, 1355826685, -894211554, -2094797161, -1332719001, -1117894150}, 28 - android.view.KeyEvent.keyCodeFromString(""), objArr23);
                        if (((java.lang.String) objArr23[0]).intern().equals(str3)) {
                            if (mo25898 != null) {
                                getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 51) % 128;
                                if (!mo25898.isNull(util.h.xy.s.ma.f2373)) {
                                    if (jSONObject3 != null && !jSONObject3.isNull(util.h.xy.s.ma.f2352)) {
                                        if (jSONObject3.getJSONObject(util.h.xy.s.ma.f2352).isNull(util.h.xy.s.rh.f2416)) {
                                            java.lang.Object[] objArr24 = new java.lang.Object[1];
                                            getHighResolutionOutputSizeshNQ4ISI(new int[]{217118043, -1592057039, -1876375146, -495067540, 1890857463, -1848333320, 1756599298, -2023926716, -482326624, -540082459, 1806052789, 1669966018, -1061846112, 840227569, -1689041962, -1678043769, 600333597, 1687116897, -1519611374, -1224942767, 197845951, -1909567632, 1590834838, -1685491172, -986355995, -2126295970, -1443116473, -1281447188}, android.view.View.combineMeasuredStates(0, 0) + 53, objArr24);
                                            return new util.h.xy.an.ra(null, false, ((java.lang.String) objArr24[0]).intern(), com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_PERSO_DATA);
                                        }
                                    }
                                    java.lang.Object[] objArr25 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI(new int[]{217118043, -1592057039, -1876375146, -495067540, 1890857463, -1848333320, 1756599298, -2023926716, -482326624, -540082459, 1806052789, 1669966018, -1061846112, 840227569, -1689041962, -1678043769, 600333597, 1687116897, -1519611374, -1224942767, 41533834, -189644429, -1420860958, 175965565, 706360271, 425520008, 690964225, 379035372, 737779260, 1055391427}, android.widget.ExpandableListView.getPackedPositionType(0L) + 60, objArr25);
                                    return new util.h.xy.an.ra(null, false, ((java.lang.String) objArr25[0]).intern(), com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_PERSO_DATA);
                                }
                            }
                            java.lang.Object[] objArr26 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("⃰⢧딭첌篦⛋ꆇ堜䄰ᝌꊳ\udb38Ԫᓆඐ\uf339讹翂\uf3a0\ued8d≹ϯ\ue728뺹\u1c8c㑒軫菰唀冝跸檯酓\ud80d\uf155䓰É믿䠈\ue4f8땏⠤䩷⣝䲞扂웃\uecb4沠\u17ea趒ʍ㷹潌\ud8fd癡嫍\udfcf륛먺찉猭", (char) (android.graphics.PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (android.graphics.PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), android.view.KeyEvent.normalizeMetaState(0), "朖\ue1db遠˅", "ﶩ䶴쯨\ue4e1", objArr26);
                            return new util.h.xy.an.ra(null, false, ((java.lang.String) objArr26[0]).intern(), com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_PERSO_DATA);
                        }
                        raVar = m25902.mo25897(str, m26975);
                        digitalizedCardState2 = digitalizedCardState;
                    } else {
                        java.lang.Object[] objArr27 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(new int[]{1338937517, 1518183149, 415227057, 1785477948, -1335005209, 1099771162, 754148620, -1013085176, -1254112149, 324558506, -1237705528, 1998801105, 1456546512, -600603887}, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 24, objArr27);
                        boolean equalsIgnoreCase = ((java.lang.String) objArr27[0]).intern().equalsIgnoreCase(str3);
                        java.lang.Object[] objArr28 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("醋䪗䮊쬢迊錩맹뒛쵶猥祌쎢祿負䚏", (char) (45274 - (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 1901931827 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0), "㓻崭\ud971瞰", "ﶩ䶴쯨\ue4e1", objArr28);
                        boolean equalsIgnoreCase2 = ((java.lang.String) objArr28[0]).intern().equalsIgnoreCase(optString);
                        if (equalsIgnoreCase || equalsIgnoreCase2) {
                            if (m25902 == null) {
                                java.lang.Object[] objArr29 = new java.lang.Object[1];
                                getHighResolutionOutputSizeshNQ4ISI(new int[]{757788716, 1942277644, -674676161, -825408501, -1517118232, -988850021, -1350878081, 1449293628, 698237377, 1916514458, 1814395495, 400356204, 1814535375, -1373913208, 166256285, -1198122876, 1271188878, -195119286, -554082233, -1294927918, -752843220, 2030661659}, android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 42, objArr29);
                                return new util.h.xy.an.ra(null, false, ((java.lang.String) objArr29[0]).intern(), 607);
                            }
                            m25902.m25899(str);
                            int mo25889 = m25902.mo25889();
                            org.json.JSONObject mo25896 = m25902.mo25896();
                            org.json.JSONObject mo25894 = m25902.mo25894();
                            if (util.h.xy.f.b.f2201.m26775() == util.h.xy.u.b.f2434) {
                                if (mo25889 != 1 && mo25889 != 0) {
                                    int i3 = getHighSpeedVideoFpsRanges + 19;
                                    getInputSizeshNQ4ISI = i3 % 128;
                                    if (i3 % 2 != 0) {
                                    }
                                    if (mo25898 != null) {
                                        util.h.xy.f.b.f2201.m26760(str, m25902.m25892(), com.gemalto.mfs.mwsdk.dcm.PaymentType.CONTACTLESS);
                                    }
                                    if (mo25896 != null) {
                                        int i4 = getHighSpeedVideoFpsRanges + 83;
                                        getInputSizeshNQ4ISI = i4 % 128;
                                        if (i4 % 2 == 0) {
                                            util.h.xy.f.b.f2201.m26760(str, m25902.m25892(), com.gemalto.mfs.mwsdk.dcm.PaymentType.QR);
                                            throw new java.lang.ArithmeticException();
                                        }
                                        util.h.xy.f.b.f2201.m26760(str, m25902.m25892(), com.gemalto.mfs.mwsdk.dcm.PaymentType.QR);
                                    }
                                    if (mo25894 != null) {
                                        java.lang.Object[] objArr30 = new java.lang.Object[1];
                                        getHighResolutionOutputSizeshNQ4ISI(new int[]{1164033357, 1357656311, 1146846143, 1172969152}, 8 - android.view.View.MeasureSpec.getMode(0), objArr30);
                                        if (!optString2.matches(((java.lang.String) objArr30[0]).intern())) {
                                            util.h.xy.f.b.f2201.m26760(str, m25902.m25892(), com.gemalto.mfs.mwsdk.dcm.PaymentType.DSRP);
                                        }
                                    }
                                }
                                int i5 = getHighSpeedVideoFpsRanges;
                                int i6 = (i5 + 33) % 128;
                                getInputSizeshNQ4ISI = i6;
                                if (mo25889 == 1) {
                                    getInputSizeshNQ4ISI = (i5 + 111) % 128;
                                    util.h.xy.f.b.f2201.m26782(util.h.xy.u.b.f2435);
                                    util.h.xy.u.b bVar = util.h.xy.u.b.f2435;
                                } else if (mo25889 == 2) {
                                    int i7 = i6 + 109;
                                    getHighSpeedVideoFpsRanges = i7 % 128;
                                    if (i7 % 2 != 0) {
                                        util.h.xy.f.b.f2201.m26782(util.h.xy.u.b.f2433);
                                        util.h.xy.u.b bVar2 = util.h.xy.u.b.f2433;
                                        throw null;
                                    }
                                    util.h.xy.f.b.f2201.m26782(util.h.xy.u.b.f2433);
                                    util.h.xy.u.b bVar3 = util.h.xy.u.b.f2433;
                                } else {
                                    util.h.xy.f.b.f2201.m26782(util.h.xy.u.b.f2432);
                                    util.h.xy.u.a.f2431.m27486(false);
                                    util.h.xy.u.b bVar4 = util.h.xy.u.b.f2432;
                                }
                                util.h.xy.f.b.f2201.m26775();
                                if (mo25898 != null) {
                                }
                                if (mo25896 != null) {
                                }
                                if (mo25894 != null) {
                                }
                            }
                            getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 43) % 128;
                            util.h.xy.u.b m26775 = util.h.xy.f.b.f2201.m26775();
                            if (mo25889 == 1) {
                                int i8 = getHighSpeedVideoFpsRanges + 7;
                                getInputSizeshNQ4ISI = i8 % 128;
                                if (i8 % 2 == 0) {
                                    util.h.xy.u.b bVar5 = util.h.xy.u.b.f2435;
                                    throw new java.lang.NullPointerException();
                                }
                                if (m26775 != util.h.xy.u.b.f2435) {
                                    i2 = 1;
                                }
                                c0266b = new util.h.xy.cg.b.C0266b();
                                c0266b.getHighResolutionOutputSizeshNQ4ISI();
                                c0266b.getHighSpeedVideoFpsRangesFor();
                                c0266b.Camera2StreamConfigurationMap();
                                if (!c0266b.getHighResolutionOutputSizeshNQ4ISI()) {
                                    c0266b.getHighSpeedVideoFpsRangesFor();
                                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                                    java.lang.Object[] objArr31 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap("ꣴ魝፱١㷛糷筦꼓蹰◂쌪ẨὪ\uf28d\u0ff3뇬\u0e7c嵆덱₇\ue7a3밟氓眉䬲ⅺ㐺", (char) (18233 - (android.view.ViewConfiguration.getWindowTouchSlop() >> 8)), (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 836320443, "볧\ud93c㤱큇", "ﶩ䶴쯨\ue4e1", objArr31);
                                    sb.append(((java.lang.String) objArr31[0]).intern());
                                    sb.append(c0266b.getHighSpeedVideoFpsRangesFor());
                                    util.h.xy.an.ra raVar2 = new util.h.xy.an.ra(null, false, sb.toString(), c0266b.Camera2StreamConfigurationMap());
                                    int i9 = getInputSizeshNQ4ISI + 45;
                                    getHighSpeedVideoFpsRanges = i9 % 128;
                                    if (i9 % 2 == 0) {
                                        return raVar2;
                                    }
                                    throw null;
                                }
                                if (mo25898 != null) {
                                }
                                if (mo25896 != null) {
                                }
                                if (mo25894 != null) {
                                }
                            } else {
                                i2 = 1;
                            }
                            if ((mo25889 != i2 || m26775 != util.h.xy.u.b.f2433) && ((mo25889 != 2 || m26775 != util.h.xy.u.b.f2435) && (mo25889 != 2 || m26775 != util.h.xy.u.b.f2433))) {
                                if (mo25889 == 0) {
                                    int i10 = getInputSizeshNQ4ISI + 93;
                                    getHighSpeedVideoFpsRanges = i10 % 128;
                                    if (i10 % 2 != 0) {
                                        util.h.xy.u.b bVar6 = util.h.xy.u.b.f2432;
                                        throw new java.lang.ArithmeticException();
                                    }
                                }
                                int i11 = com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_CARD_PROFILE_TYPE;
                                if (mo25889 == 1) {
                                    java.lang.Object[] objArr32 = new java.lang.Object[1];
                                    Camera2StreamConfigurationMap("Ⱨ醈额펫\udce8㉾솩㗴賛趒켐릮噁ᢙć霄듎ெ끒⼛\ue1dc怪컚交鎮폳摻넚࿊̏䐒̬麺\uf6f4㾞\udd70ꡟퟮ䨫", (char) (27935 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1382471817, "諏曘ὒ鹭", "ﶩ䶴쯨\ue4e1", objArr32);
                                    str6 = (java.lang.String) objArr32[0];
                                } else {
                                    if (mo25889 == 0) {
                                        int i12 = getHighSpeedVideoFpsRanges + 95;
                                        getInputSizeshNQ4ISI = i12 % 128;
                                        if (i12 % 2 == 0) {
                                            java.lang.Object[] objArr33 = new java.lang.Object[1];
                                            getHighResolutionOutputSizeshNQ4ISI(new int[]{-796315930, 652739347, -358539376, -758450801, -339612416, -430276039, -1065302341, 252227474, -587904597, -2094172823, 1091630076, 747389064, 36079951, 69976712, 1524946104, 548752876, 948612217, -1939722754, -1347676013, -1800233651}, 113 >> android.widget.ExpandableListView.getPackedPositionGroup(1L), objArr33);
                                            str5 = (java.lang.String) objArr33[0];
                                            str7 = str5.intern();
                                            i11 = com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_PERSO_DATA;
                                        } else {
                                            java.lang.Object[] objArr34 = new java.lang.Object[1];
                                            getHighResolutionOutputSizeshNQ4ISI(new int[]{-796315930, 652739347, -358539376, -758450801, -339612416, -430276039, -1065302341, 252227474, -587904597, -2094172823, 1091630076, 747389064, 36079951, 69976712, 1524946104, 548752876, 948612217, -1939722754, -1347676013, -1800233651}, android.widget.ExpandableListView.getPackedPositionGroup(0L) + 39, objArr34);
                                            str6 = (java.lang.String) objArr34[0];
                                        }
                                    } else if (mo25889 == 2) {
                                        getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 97) % 128;
                                        java.lang.Object[] objArr35 = new java.lang.Object[1];
                                        Camera2StreamConfigurationMap("Ⱨ醈额펫\udce8㉾솩㗴賛趒켐릮噁ᢙć霄듎ெ끒⼛\ue1dc怪컚交鎮폳摻넚࿊̏䐒̬麺\uf6f4㾞\udd70ꡟퟮ䨫", (char) (27935 - android.view.View.getDefaultSize(0, 0)), android.graphics.Color.argb(0, 0, 0, 0) + 1382471818, "諏曘ὒ鹭", "ﶩ䶴쯨\ue4e1", objArr35);
                                        str6 = (java.lang.String) objArr35[0];
                                    } else if (mo25889 == -2) {
                                        java.lang.Object[] objArr36 = new java.lang.Object[1];
                                        Camera2StreamConfigurationMap("樏蟸幜뇩냃퀦凌酣믹뻃祉蓧䌭嚨췟擶殯漇쯔粳ᖠ⥣뾨퇏彀\ue648❊케", (char) (62688 - android.graphics.Color.red(0)), android.view.ViewConfiguration.getKeyRepeatDelay() >> 16, "남娍\ue0f0쟴", "ﶩ䶴쯨\ue4e1", objArr36);
                                        str5 = (java.lang.String) objArr36[0];
                                        str7 = str5.intern();
                                        i11 = com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_PERSO_DATA;
                                    } else {
                                        i11 = 0;
                                    }
                                    c0266b = new util.h.xy.cg.b.C0266b(str7, i11);
                                    c0266b.getHighResolutionOutputSizeshNQ4ISI();
                                    c0266b.getHighSpeedVideoFpsRangesFor();
                                    c0266b.Camera2StreamConfigurationMap();
                                    if (!c0266b.getHighResolutionOutputSizeshNQ4ISI()) {
                                    }
                                    if (mo25898 != null) {
                                    }
                                    if (mo25896 != null) {
                                    }
                                    if (mo25894 != null) {
                                    }
                                }
                                str7 = str6.intern();
                                c0266b = new util.h.xy.cg.b.C0266b(str7, i11);
                                c0266b.getHighResolutionOutputSizeshNQ4ISI();
                                c0266b.getHighSpeedVideoFpsRangesFor();
                                c0266b.Camera2StreamConfigurationMap();
                                if (!c0266b.getHighResolutionOutputSizeshNQ4ISI()) {
                                }
                                if (mo25898 != null) {
                                }
                                if (mo25896 != null) {
                                }
                                if (mo25894 != null) {
                                }
                            }
                            c0266b = new util.h.xy.cg.b.C0266b();
                            c0266b.getHighResolutionOutputSizeshNQ4ISI();
                            c0266b.getHighSpeedVideoFpsRangesFor();
                            c0266b.Camera2StreamConfigurationMap();
                            if (!c0266b.getHighResolutionOutputSizeshNQ4ISI()) {
                            }
                            if (mo25898 != null) {
                            }
                            if (mo25896 != null) {
                            }
                            if (mo25894 != null) {
                            }
                        }
                        java.lang.Object[] objArr37 = new java.lang.Object[1];
                        Camera2StreamConfigurationMap("坳\uf2c2\ue7b8䑜\uef19벙弦Ὗ䗗猈", (char) android.view.View.MeasureSpec.getMode(0), android.view.View.resolveSizeAndState(0, 0, 0), "濝氕̯\ueaf7", "ﶩ䶴쯨\ue4e1", objArr37);
                        if (optString3.equalsIgnoreCase(((java.lang.String) objArr37[0]).intern())) {
                            getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 47) % 128;
                            try {
                                java.lang.Object[] objArr38 = new java.lang.Object[1];
                                Camera2StreamConfigurationMap("튟㕛\uf471", (char) ((((java.lang.Integer) java.lang.Class.forName(str4).getMethod("myPid", null).invoke(null, null)).intValue() >> 22) + 30915), 363212797 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "ﶭ\ua62f쌕홸", "ﶩ䶴쯨\ue4e1", objArr38);
                                if (!optString2.equals(((java.lang.String) objArr38[0]).intern())) {
                                    getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 65) % 128;
                                    java.lang.Object[] objArr39 = new java.lang.Object[1];
                                    getHighResolutionOutputSizeshNQ4ISI(new int[]{-2072925203, -1783316574, 717097787, -49166826, -362136401, 1839444790, 1459388765, 1671568290}, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14, objArr39);
                                    if (!jSONObject3.has(((java.lang.String) objArr39[0]).intern())) {
                                        byte b = (m25902.m25891() == null || m25902.m25891().isEmpty()) ? (byte) 0 : com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.CONTACTLESS.getCode()[0];
                                        if (jSONObject2.has(util.h.xy.s.ma.f2371) && jSONObject2.optString(util.h.xy.s.ma.f2371) != null && !jSONObject2.optString(util.h.xy.s.ma.f2371).isEmpty()) {
                                            b = (byte) (b | com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.DSRP.getCode()[0]);
                                            getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
                                        }
                                        if (m25902.m25891() != null) {
                                            int i13 = getInputSizeshNQ4ISI + 49;
                                            getHighSpeedVideoFpsRanges = i13 % 128;
                                            if (i13 % 2 != 0) {
                                                m25902.m25891();
                                                throw null;
                                            }
                                            if (!m25902.m25891().isEmpty() && getHighResolutionOutputSizeshNQ4ISI(str, m25902.m25891(), jSONObject3.toString(), optString2)) {
                                                b = (byte) (b | com.gemalto.mfs.mwsdk.dcm.sdkconfig.ProfileChannel.QR.getCode()[0]);
                                            }
                                        }
                                        try {
                                            java.lang.Object m25016 = util.h.xy.al.rb.m25016(new byte[]{b});
                                            java.lang.Object[] objArr40 = new java.lang.Object[1];
                                            getHighResolutionOutputSizeshNQ4ISI(new int[]{-2072925203, -1783316574, 717097787, -49166826, -362136401, 1839444790, 1459388765, 1671568290}, (android.view.ViewConfiguration.getKeyRepeatDelay() >> 16) + 15, objArr40);
                                            jSONObject3.put(((java.lang.String) objArr40[0]).intern(), m25016);
                                        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e19) {
                                            e2 = e19;
                                            th = e2;
                                            digitalizedCardState2 = digitalizedCardState;
                                            th.getMessage();
                                            java.lang.Object[] objArr11222222222 = new java.lang.Object[1];
                                            getHighResolutionOutputSizeshNQ4ISI(new int[]{1282930786, -1299896749, -2053005620, -472255530, 629093, 1157002462, 995888243, 869219792, 1595326394, 1040415085, -1959069257, -1836726021, 1051525656, 156533826, 1782947688, -1721702873, -1254112149, 324558506, -948066932, -1815833755, 1436825522, 2102561416, -1169841508, -1373315533, -1996186485, -882652585, -377029994, 552869522, -1463577459, 1453446234, 1514326164, -1755699230, -258725593, 1952525596}, (-16777149) - android.graphics.Color.rgb(0, 0, 0), objArr11222222222);
                                            raVar = new util.h.xy.an.ra(null, false, ((java.lang.String) objArr11222222222[0]).intern(), 583);
                                            if (raVar == null) {
                                            }
                                            if (raVar != null) {
                                            }
                                            return raVar;
                                        } catch (org.json.JSONException e20) {
                                            e2 = e20;
                                            th = e2;
                                            digitalizedCardState2 = digitalizedCardState;
                                            th.getMessage();
                                            java.lang.Object[] objArr112222222222 = new java.lang.Object[1];
                                            getHighResolutionOutputSizeshNQ4ISI(new int[]{1282930786, -1299896749, -2053005620, -472255530, 629093, 1157002462, 995888243, 869219792, 1595326394, 1040415085, -1959069257, -1836726021, 1051525656, 156533826, 1782947688, -1721702873, -1254112149, 324558506, -948066932, -1815833755, 1436825522, 2102561416, -1169841508, -1373315533, -1996186485, -882652585, -377029994, 552869522, -1463577459, 1453446234, 1514326164, -1755699230, -258725593, 1952525596}, (-16777149) - android.graphics.Color.rgb(0, 0, 0), objArr112222222222);
                                            raVar = new util.h.xy.an.ra(null, false, ((java.lang.String) objArr112222222222[0]).intern(), 583);
                                            if (raVar == null) {
                                            }
                                            if (raVar != null) {
                                            }
                                            return raVar;
                                        } catch (util.h.xy.ck.rc e21) {
                                            e2 = e21;
                                            th = e2;
                                            digitalizedCardState2 = digitalizedCardState;
                                            th.getMessage();
                                            java.lang.Object[] objArr1122222222222 = new java.lang.Object[1];
                                            getHighResolutionOutputSizeshNQ4ISI(new int[]{1282930786, -1299896749, -2053005620, -472255530, 629093, 1157002462, 995888243, 869219792, 1595326394, 1040415085, -1959069257, -1836726021, 1051525656, 156533826, 1782947688, -1721702873, -1254112149, 324558506, -948066932, -1815833755, 1436825522, 2102561416, -1169841508, -1373315533, -1996186485, -882652585, -377029994, 552869522, -1463577459, 1453446234, 1514326164, -1755699230, -258725593, 1952525596}, (-16777149) - android.graphics.Color.rgb(0, 0, 0), objArr1122222222222);
                                            raVar = new util.h.xy.an.ra(null, false, ((java.lang.String) objArr1122222222222[0]).intern(), 583);
                                            if (raVar == null) {
                                            }
                                            if (raVar != null) {
                                            }
                                            return raVar;
                                        } catch (util.h.xy.d.g e22) {
                                            e = e22;
                                            gVar = e;
                                            digitalizedCardState2 = digitalizedCardState;
                                            gVar.getMessage();
                                            raVar = new util.h.xy.an.ra(null, false, gVar.getMessage(), com.gemalto.mfs.mwsdk.provisioning.model.KnownCpsErrorCodes.INVALID_PERSO_DATA, gVar.m26182());
                                            if (raVar == null) {
                                            }
                                            if (raVar != null) {
                                            }
                                            return raVar;
                                        }
                                    }
                                }
                            } catch (java.lang.Throwable th4) {
                                java.lang.Throwable cause3 = th4.getCause();
                                if (cause3 != null) {
                                    throw cause3;
                                }
                                throw th4;
                            }
                        }
                        digitalizedCardState2 = digitalizedCardState;
                        util.h.xy.d.me meVar = new util.h.xy.d.me(digitalizedCardState2, jSONObject3.toString(), m25902.m25891(), m25902.m25901());
                        meVar.m26214(m25902.m25890());
                        raVar = m26975.mo26172(str, meVar, true);
                        if (raVar.getErrorCode() == 1011) {
                            java.lang.Object[] objArr41 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("蜮믋巏鐨䔾ㇿ哝焰䓂控\ud968焲徳렚\uf0f9푰㸸䨩氽\ud835驪픖秠賛䖧襺쬔太宻뿔\ua87bፀ琭䌈羒ﱸ\uee10慟\uf69f", (char) (19086 - (android.view.ViewConfiguration.getPressedStateDuration() >> 16)), 1179458575 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "\u0ffe䴜蹆幊", "ﶩ䶴쯨\ue4e1", objArr41);
                            raVar = new util.h.xy.an.ra(null, false, ((java.lang.String) objArr41[0]).intern(), 584);
                        }
                    }
                    if (raVar == null) {
                        java.lang.Object[] objArr42 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(new int[]{1282930786, -1299896749, -2053005620, -472255530, 629093, 1157002462, 995888243, 869219792, 1595326394, 1040415085, -1959069257, -1836726021, 1051525656, 156533826, 1782947688, -1721702873, -1254112149, 324558506, -948066932, -1815833755, 1436825522, 2102561416, -1169841508, -1373315533, -1996186485, -882652585, -377029994, 552869522, -1463577459, 1453446234, 1514326164, -1755699230, -258725593, 1952525596}, android.graphics.Color.red(0) + 67, objArr42);
                        raVar = new util.h.xy.an.ra(null, false, ((java.lang.String) objArr42[0]).intern(), 583);
                    }
                    if (raVar != null && raVar.isSuccessful()) {
                        util.h.xy.ce.mb.m25873().m25875(str, digitalizedCardState2);
                    }
                    return raVar;
                }
                str4 = "android.os.Process";
                i = 0;
                objArr3 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\ue6a1社灙ې꩔墸叢꺾筐砪䠀럞몎\ueb9d", (char) (44812 - android.view.View.MeasureSpec.getSize(i)), android.text.TextUtils.indexOf("", "", i, i), "ꑟ誈ೄ鲯", "ﶩ䶴쯨\ue4e1", objArr3);
                if (((java.lang.String) objArr3[0]).intern().equalsIgnoreCase(optString)) {
                }
                if (raVar == null) {
                }
                if (raVar != null) {
                    util.h.xy.ce.mb.m25873().m25875(str, digitalizedCardState2);
                }
                return raVar;
            }
        }
        str3 = null;
        java.lang.Object[] objArr162 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("詿\uf5f2浱㰌謍뼗竤ⶌ\u0ba1枑⇏枋", (char) (1 - (android.os.SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), android.view.View.resolveSize(0, 0), "죏톑\u18f6ᯒ", "ﶩ䶴쯨\ue4e1", objArr162);
        intern = ((java.lang.String) objArr162[0]).intern();
        if (!jSONObject3.has(intern)) {
        }
        i = 0;
        objArr3 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\ue6a1社灙ې꩔墸叢꺾筐砪䠀럞몎\ueb9d", (char) (44812 - android.view.View.MeasureSpec.getSize(i)), android.text.TextUtils.indexOf("", "", i, i), "ꑟ誈ೄ鲯", "ﶩ䶴쯨\ue4e1", objArr3);
        if (((java.lang.String) objArr3[0]).intern().equalsIgnoreCase(optString)) {
        }
        if (raVar == null) {
        }
        if (raVar != null) {
        }
        return raVar;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int[] iArr, int i, java.lang.Object[] objArr) {
        util.h.xz.b.c cVar = new util.h.xz.b.c();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = Camera2StreamConfigurationMap;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 11) % 128;
            int i2 = 0;
            while (i2 < length) {
                int i3 = getHighSpeedVideoSizes + 105;
                getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
                if (i3 % 2 != 0) {
                    iArr3[i2] = (int) (iArr2[i2] % (-5569649899877129369L));
                    i2 %= 1;
                } else {
                    iArr3[i2] = (int) (iArr2[i2] ^ (-5569649899877129369L));
                    i2++;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = Camera2StreamConfigurationMap;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i4 = 0; i4 < length3; i4++) {
                iArr6[i4] = (int) (iArr5[i4] ^ (-5569649899877129369L));
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
            for (int i5 = 0; i5 < 16; i5++) {
                cVar.f2627 ^= iArr4[i5];
                cVar.f2625 = util.h.xz.b.c.m27724(cVar.f2627) ^ cVar.f2625;
                int i6 = cVar.f2627;
                cVar.f2627 = cVar.f2625;
                cVar.f2625 = i6;
            }
            int i7 = cVar.f2627;
            cVar.f2627 = cVar.f2625;
            cVar.f2625 = i7;
            cVar.f2625 ^= iArr4[16];
            cVar.f2627 ^= iArr4[17];
            int i8 = cVar.f2627;
            int i9 = cVar.f2625;
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
        objArr[0] = new java.lang.String(cArr2, 0, i);
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, char c, int i, java.lang.String str2, java.lang.String str3, java.lang.Object[] objArr) {
        char[] charArray = str3.toCharArray();
        int i2 = getHighSpeedVideoSizes + 27;
        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        char[] charArray2 = str2.toCharArray();
        int i3 = getHighResolutionOutputSizeshNQ4ISI;
        getHighSpeedVideoSizes = (i3 + 65) % 128;
        char[] cArr = charArray2;
        getHighSpeedVideoSizes = (i3 + 15) % 128;
        char[] charArray3 = str.toCharArray();
        util.h.xz.b.rc rcVar = new util.h.xz.b.rc();
        int length = cArr.length;
        char[] cArr2 = new char[length];
        int length2 = charArray.length;
        char[] cArr3 = new char[length2];
        java.lang.System.arraycopy(cArr, 0, cArr2, 0, length);
        java.lang.System.arraycopy(charArray, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c);
        cArr3[2] = (char) (cArr3[2] + ((char) i));
        int length3 = charArray3.length;
        char[] cArr4 = new char[length3];
        rcVar.f2652 = 0;
        while (rcVar.f2652 < length3) {
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 71) % 128;
            int i4 = (rcVar.f2652 + 2) % 4;
            int i5 = (rcVar.f2652 + 3) % 4;
            rcVar.f2653 = (char) (((cArr2[rcVar.f2652 % 4] * 32718) + cArr3[i4]) % 65535);
            cArr3[i5] = (char) (((cArr2[i5] * 32718) + cArr3[i4]) / 65535);
            cArr2[i5] = rcVar.f2653;
            cArr4[rcVar.f2652] = (char) ((((cArr2[i5] ^ charArray3[rcVar.f2652]) ^ (getOutputFormats ^ 2457411417541981002L)) ^ ((int) (getInputFormats ^ 2457411417541981002L))) ^ ((char) (getOutputMinFrameDuration ^ 2457411417541981002L)));
            rcVar.f2652++;
        }
        objArr[0] = new java.lang.String(cArr4);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m25909(java.lang.String str) {
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<java.lang.Void> m27689;
        getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 23) % 128;
        try {
            util.h.xy.k.ma.m26925().mo26174(str);
            m27689 = util.h.xy.x.a.m27696(null);
        } catch (com.gemalto.mfs.mwsdk.exception.InternalComponentException e) {
            m27689 = util.h.xy.x.a.m27689(e.getMessage());
        }
        getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 85) % 128;
        return m27689;
    }

    /* renamed from: util.h.xy.cg.b$b, reason: collision with other inner class name */
    static final class C0266b {
        private static int Camera2StreamConfigurationMap = 0;
        private static int getHighSpeedVideoFpsRangesFor = 1;
        boolean getHighResolutionOutputSizeshNQ4ISI;
        int getHighSpeedVideoFpsRanges;
        java.lang.String getHighSpeedVideoSizes;

        public C0266b() {
            this.getHighResolutionOutputSizeshNQ4ISI = true;
            this.getHighSpeedVideoSizes = "";
            this.getHighSpeedVideoFpsRanges = 0;
        }

        public C0266b(java.lang.String str, int i) {
            this.getHighResolutionOutputSizeshNQ4ISI = false;
            this.getHighSpeedVideoSizes = str;
            this.getHighSpeedVideoFpsRanges = i;
        }

        public final boolean getHighResolutionOutputSizeshNQ4ISI() {
            int i = getHighSpeedVideoFpsRangesFor;
            int i2 = ((i | 75) << 1) - (i ^ 75);
            Camera2StreamConfigurationMap = i2 % 128;
            if (i2 % 2 != 0) {
                throw new java.lang.ArithmeticException();
            }
            boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
            Camera2StreamConfigurationMap = (i + 119) % 128;
            return z;
        }

        public final java.lang.String getHighSpeedVideoFpsRangesFor() {
            int i = Camera2StreamConfigurationMap;
            getHighSpeedVideoFpsRangesFor = (i + 27) % 128;
            java.lang.String str = this.getHighSpeedVideoSizes;
            getHighSpeedVideoFpsRangesFor = (i + 15) % 128;
            return str;
        }

        public final int Camera2StreamConfigurationMap() {
            int i = Camera2StreamConfigurationMap;
            int i2 = i + 35;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
            int i3 = this.getHighSpeedVideoFpsRanges;
            getHighSpeedVideoFpsRangesFor = (((i | 75) << 1) - (i ^ 75)) % 128;
            return i3;
        }
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (str2 != null && !str2.isEmpty()) {
            try {
                util.h.xy.s.re reVar = new util.h.xy.s.re(false, false, false);
                reVar.m27373(str4);
                util.h.xy.s.me m27293 = util.h.xy.s.rb.m27293(str, str2, util.h.xy.s.a.b.f2297, str4);
                reVar.m27373(str4);
                reVar.m27383();
                util.h.xy.s.rd m27380 = util.h.xy.s.rb.m27297(reVar, m27293, util.h.xy.s.rb.m27292(reVar, m27293, util.h.xy.s.a.b.f2297, (byte) 0, str3), util.h.xy.s.a.b.f2297, 300, str4).m27380();
                if (m27380.m27356() != null && m27380.m27356().length != 0) {
                    getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 105) % 128;
                    if (m27380.m27358() != null && m27380.m27358().length != 0 && m27380.m27354() != null) {
                        getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 3) % 128;
                        if (m27380.m27354().length != 0 && m27380.m27340() != null) {
                            getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 45) % 128;
                            if (m27380.m27340().length != 0 && m27380.m27346() != null) {
                                getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 37) % 128;
                                if (m27380.m27346().length != 0) {
                                    int i = getHighSpeedVideoFpsRanges + 33;
                                    getInputSizeshNQ4ISI = i % 128;
                                    if (i % 2 == 0) {
                                        m27380.m27363();
                                        throw new java.lang.NullPointerException();
                                    }
                                    if (m27380.m27363() != null && m27380.m27363().length != 0 && m27380.m27361() != null) {
                                        getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 9) % 128;
                                        if (m27380.m27361().length != 0 && m27380.m27338() != null && m27380.m27338().length != 0) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return false;
            } catch (org.json.JSONException e) {
                e.getMessage();
            }
        }
        return false;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25911(java.lang.String str) {
        getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 85) % 128;
        util.h.xy.d.d result = util.h.xy.k.ma.m26925().mo26175(str).getResult();
        if (result != null && result.m26180() != null) {
            try {
                util.h.xy.t.mb.f2417.m27441(str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
            } catch (java.lang.Exception unused) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI(new int[]{118357510, -1695372117}, android.graphics.Color.argb(0, 0, 0, 0) + 4, objArr);
                java.lang.String intern = ((java.lang.String) objArr[0]).intern();
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("\u1943⊳ꃗ䬷\ud969釀\ue1a5\ue311\u0c70\ue516엃㥍䃖\ue516令", (char) (23970 - android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask)), 1004234887 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), "蝱\udb68ꌻ顝", "ﶩ䶴쯨\ue4e1", objArr2);
                util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
            }
        }
        if (result != null && result.m26179() != null) {
            try {
                util.h.xy.t.mb.f2417.m27441(m25907().m25908(str.getBytes(java.nio.charset.StandardCharsets.UTF_8)).getBytes(java.nio.charset.StandardCharsets.UTF_8));
            } catch (java.lang.Exception unused2) {
                try {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(new int[]{118357510, -1695372117}, (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 3, objArr3);
                    java.lang.String intern2 = ((java.lang.String) objArr3[0]).intern();
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(new int[]{795602373, -1626480669, 615372424, 922010622, -1314745123, 698152287, -68776048, -240944431}, android.text.TextUtils.indexOf("", "", 0) + 15, objArr4);
                    util.h.xy.am.ma.m25027(intern2, ((java.lang.String) objArr4[0]).intern());
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        try {
            util.h.xy.au.rb.f877.m25200(str);
            getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 103) % 128;
        } catch (java.lang.Exception unused3) {
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{118357510, -1695372117}, 4 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr5);
            java.lang.String intern3 = ((java.lang.String) objArr5[0]).intern();
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(new int[]{795602373, -1626480669, 615372424, 922010622, 2127444749, -1953010071}, android.view.Gravity.getAbsoluteGravity(0, 0) + 11, objArr6);
            util.h.xy.am.ma.m25027(intern3, ((java.lang.String) objArr6[0]).intern());
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final void m25912(java.lang.String str, java.lang.String str2, java.lang.String str3) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException, org.json.JSONException {
        util.h.xy.d.d dVar = new util.h.xy.d.d(str);
        dVar.m26178(str2);
        dVar.m26181(str3);
        util.h.xy.t.mb.f2417.m27454(str.getBytes(util.h.xy.h.a.f2221), dVar.m26176());
        int i = getInputSizeshNQ4ISI + 5;
        getHighSpeedVideoFpsRanges = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final java.lang.String m25908(byte[] bArr) {
        org.json.JSONObject jSONObject;
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{118357510, -1695372117}, android.widget.ExpandableListView.getPackedPositionChild(0L) + 5, objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(new int[]{1307869698, 380024703, 1778290954, -1353063162, -1974747165, 1832002174}, (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 10, objArr2);
        util.h.xy.am.ma.m25027(intern, ((java.lang.String) objArr2[0]).intern());
        java.lang.String str = null;
        if (bArr != null) {
            try {
                byte[] m25216 = util.h.xy.au.rg.m25213(util.h.xy.ag.a.m24556().m24558()).m25216(new java.lang.String(bArr, java.nio.charset.StandardCharsets.UTF_8));
                if (m25216 != null) {
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject(new java.lang.String(m25216));
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI(new int[]{1928814964, -2124177655, -1220168186, 1506382007, 907592225, -1680443028}, ';' - android.text.AndroidCharacter.getMirror(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask), objArr3);
                    org.json.JSONObject jSONObject3 = jSONObject2.getJSONObject(((java.lang.String) objArr3[0]).intern());
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("ᑫ櫲擥ꍞŮ⤣ٔ迖ﳦꨁꡚ븰옠褕箬", (char) (android.graphics.Color.red(0) + 20336), (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2115491580, "ﳤ៖灾晏", "ﶩ䶴쯨\ue4e1", objArr4);
                    if (jSONObject3.has(((java.lang.String) objArr4[0]).intern())) {
                        getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 17) % 128;
                        try {
                            java.lang.Object[] objArr5 = new java.lang.Object[1];
                            Camera2StreamConfigurationMap("ᑫ櫲擥ꍞŮ⤣ٔ迖ﳦꨁꡚ븰옠褕箬", (char) ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 20336), android.view.KeyEvent.keyCodeFromString("") + 2115491580, "ﳤ៖灾晏", "ﶩ䶴쯨\ue4e1", objArr5);
                            jSONObject = jSONObject3.getJSONObject(((java.lang.String) objArr5[0]).intern());
                        } catch (java.lang.Throwable th) {
                            java.lang.Throwable cause = th.getCause();
                            if (cause != null) {
                                throw cause;
                            }
                            throw th;
                        }
                    } else {
                        getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 17) % 128;
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        java.lang.Object[] objArr6 = new java.lang.Object[1];
                        getHighResolutionOutputSizeshNQ4ISI(new int[]{-2039603157, 1665075874, 89112701, -1640514766, -210174972, -256740762, 1456546512, -600603887}, (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 13, objArr6);
                        if (jSONObject.has(((java.lang.String) objArr6[0]).intern())) {
                            java.lang.Object[] objArr7 = new java.lang.Object[1];
                            getHighResolutionOutputSizeshNQ4ISI(new int[]{-2039603157, 1665075874, 89112701, -1640514766, -210174972, -256740762, 1456546512, -600603887}, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12, objArr7);
                            str = jSONObject.getString(((java.lang.String) objArr7[0]).intern());
                            getHighSpeedVideoFpsRanges = (getInputSizeshNQ4ISI + 55) % 128;
                        }
                    }
                }
            } catch (com.gemalto.mfs.mwsdk.mobilegateway.exception.MGException | java.lang.IllegalStateException | org.json.JSONException e) {
                e.getMessage();
                return null;
            }
        }
        getInputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + 55) % 128;
        return str;
    }

    static void getHighSpeedVideoSizes() {
        getOutputFormats = -4108495336473833757L;
        getInputFormats = 294925130;
        getOutputMinFrameDuration = (char) 13130;
        Camera2StreamConfigurationMap = new int[]{1971399171, 296906135, 1760838833, 534238316, 675926007, 1574442305, 585970666, -1914651772, -230956316, 483316972, 457558174, -1835045050, 1176532769, 2050193066, 1573998536, 630792432, 1223224062, -2105431116};
    }
}
