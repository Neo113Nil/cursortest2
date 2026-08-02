package util.h.xy.s;

/* loaded from: classes5.dex */
public class b {
    private static int Camera2StreamConfigurationMap = 1;
    private static char getHighResolutionOutputSizeshNQ4ISI = 0;
    private static java.lang.String getHighSpeedVideoFpsRanges = null;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private static char getHighSpeedVideoSizesFor;
    private static int getInputFormats;
    private static char getInputSizeshNQ4ISI;
    private static char getOutputFormats;
    private static int getOutputMinFrameDuration;

    static {
        getHighSpeedVideoSizes();
        getHighSpeedVideoFpsRanges = util.h.xy.s.b.class.getName();
        Camera2StreamConfigurationMap = (getInputFormats + 35) % 128;
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.s.e m27069(java.lang.String str, java.lang.String str2) throws org.json.JSONException {
        util.h.xy.s.e eVar = new util.h.xy.s.e();
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        eVar.m27204(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.d.f.f1135)));
        eVar.m27195();
        eVar.m27199(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.d.f.f1138)));
        eVar.m27197();
        eVar.m27194(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.d.f.f1133)));
        eVar.m27192();
        eVar.m27196(util.h.xy.s.d.m27184(jSONObject.optString(util.h.xy.d.f.f1136)));
        eVar.m27191(util.h.xy.s.d.m27184(jSONObject.getString(util.h.xy.d.f.f1134)));
        eVar.m27205();
        eVar.m27193(jSONObject.getString(util.h.xy.d.f.f1132));
        eVar.m27186();
        eVar.m27203(jSONObject.getString(util.h.xy.d.f.f1137));
        eVar.m27189();
        eVar.m27190(jSONObject.getString(util.h.xy.d.f.f1131));
        eVar.m27187();
        eVar.m27185(util.h.xy.s.d.m27184(jSONObject.optString(util.h.xy.d.f.f1139)));
        eVar.m27206();
        eVar.m27201(jSONObject.optString(util.h.xy.d.f.f1130, "").getBytes());
        eVar.m27202();
        eVar.m27198(m27073(str2));
        int i = getInputFormats + 77;
        Camera2StreamConfigurationMap = i % 128;
        if (i % 2 != 0) {
            return eVar;
        }
        throw null;
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = (getHighSpeedVideoFpsRangesFor + 49) % 128;
        getHighSpeedVideoSizes = i2;
        getHighSpeedVideoFpsRangesFor = (i2 + 83) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            int i3 = getHighSpeedVideoFpsRangesFor + 15;
            getHighSpeedVideoSizes = i3 % 128;
            if (i3 % 2 != 0) {
                cArr2[0] = charArray[eVar.f2630];
                cArr2[1] = charArray[eVar.f2630 >> 1];
            } else {
                cArr2[0] = charArray[eVar.f2630];
                cArr2[1] = charArray[eVar.f2630 + 1];
            }
            int i4 = 58224;
            int i5 = 0;
            while (i5 < 16) {
                int i6 = getHighSpeedVideoFpsRangesFor;
                getHighSpeedVideoSizes = (i6 + 89) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i4) ^ ((c2 << 4) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getHighResolutionOutputSizeshNQ4ISI ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L))) ^ (c3 + i4)) ^ ((c3 >>> 5) + ((char) (getOutputFormats ^ 3155153533016530592L)))));
                i4 -= 40503;
                i5++;
                getHighSpeedVideoSizes = (i6 + 55) % 128;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static util.h.xy.s.rd m27071(util.h.xy.s.c cVar, util.h.xy.s.me meVar) {
        util.h.xy.s.rd rdVar = new util.h.xy.s.rd();
        util.h.xy.s.f[] m27236 = meVar.m27236();
        try {
            byte[] m27224 = cVar.m27123().m27224();
            int length = m27224.length;
            rdVar.m27350(util.h.xy.ar.b.m25076(util.h.xy.al.rb.m25016(m27224).substring(r1.length() - 4)));
            rdVar.m27351(getHighResolutionOutputSizeshNQ4ISI(m27236, new byte[]{87}, java.lang.Boolean.FALSE));
            rdVar.m27341(getHighSpeedVideoFpsRanges(m27236, new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, org.apache.commons.imaging.formats.pnm.PnmConstants.PBM_RAW_CODE}));
            rdVar.m27355(getHighSpeedVideoFpsRanges(m27236, new byte[]{-97, 36}));
            rdVar.m27348(getHighSpeedVideoFpsRanges(m27236, new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 37}));
            rdVar.m27337(getHighSpeedVideoFpsRanges(m27236, new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 36}));
            rdVar.m27360(new byte[]{cVar.m27095()[5], cVar.m27095()[6]});
            rdVar.m27353(cVar.m27089());
            rdVar.m27362(new byte[]{0, 16});
            rdVar.m27336(cVar.m27147());
            rdVar.m27357(null);
            rdVar.m27352(cVar.m27106()[0]);
            rdVar.m27335();
            rdVar.m27347(cVar.m27123());
            byte[] m25052 = util.h.xy.ar.a.m25052(cVar.m27091(), new byte[]{-91});
            if (m25052.length > 0) {
                int i = getInputFormats + 47;
                Camera2StreamConfigurationMap = i % 128;
                if (i % 2 != 0) {
                    byte[] m250522 = util.h.xy.ar.a.m25052(m25052, new byte[]{80});
                    byte[] m250523 = util.h.xy.ar.a.m25052(m25052, new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 45});
                    byte[] m250524 = util.h.xy.ar.a.m25052(m25052, new byte[]{-97, 110});
                    if (m250522.length > 0) {
                        rdVar.m27345(m250522);
                    }
                    if (m250524.length > 0) {
                        rdVar.m27343(m250524);
                    }
                    if (m250523.length > 0) {
                        rdVar.m27342(m250523);
                    }
                } else {
                    byte[] m250525 = util.h.xy.ar.a.m25052(m25052, new byte[]{80});
                    util.h.xy.ar.a.m25052(m25052, new byte[]{com.visa.cbp.getEncExpo.addOnTrimMemoryListener, 45});
                    util.h.xy.ar.a.m25052(m25052, new byte[]{-97, 110});
                    int length2 = m250525.length;
                    throw null;
                }
            }
            rdVar.m27359(null);
            rdVar.m27339(null);
            rdVar.m27344(null);
            Camera2StreamConfigurationMap = (getInputFormats + 41) % 128;
            return rdVar;
        } catch (java.lang.Exception e) {
            e.getMessage();
            return rdVar;
        }
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, int i2, int i3, boolean z, java.lang.Object[] objArr) {
        int i4 = getHighSpeedVideoSizes + 21;
        getHighSpeedVideoFpsRangesFor = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        int i5 = getHighSpeedVideoFpsRangesFor + 29;
        getHighSpeedVideoSizes = i5 % 128;
        int i6 = i5 % 2;
        char[] cArr = charArray;
        util.h.xz.b.ra raVar = new util.h.xz.b.ra();
        char[] cArr2 = new char[i];
        raVar.f2649 = 0;
        while (raVar.f2649 < i) {
            raVar.f2650 = cArr[raVar.f2649];
            cArr2[raVar.f2649] = (char) (raVar.f2650 + i3);
            int i7 = raVar.f2649;
            cArr2[i7] = (char) (cArr2[i7] - ((int) (getOutputMinFrameDuration ^ (-4839292868003314026L))));
            raVar.f2649++;
        }
        if (i2 > 0) {
            raVar.f2648 = i2;
            char[] cArr3 = new char[i];
            java.lang.System.arraycopy(cArr2, 0, cArr3, 0, i);
            java.lang.System.arraycopy(cArr3, 0, cArr2, i - raVar.f2648, raVar.f2648);
            java.lang.System.arraycopy(cArr3, raVar.f2648, cArr2, 0, i - raVar.f2648);
        }
        if (z) {
            char[] cArr4 = new char[i];
            raVar.f2649 = 0;
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 49) % 128;
            while (raVar.f2649 < i) {
                cArr4[raVar.f2649] = cArr2[(i - raVar.f2649) - 1];
                raVar.f2649++;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new java.lang.String(cArr2);
    }

    private static byte[] getHighSpeedVideoFpsRanges(util.h.xy.s.f[] fVarArr, byte[] bArr) {
        int i = Camera2StreamConfigurationMap + 27;
        getInputFormats = i % 128;
        return getHighResolutionOutputSizeshNQ4ISI(fVarArr, bArr, java.lang.Boolean.valueOf(i % 2 == 0));
    }

    private static byte[] getHighResolutionOutputSizeshNQ4ISI(util.h.xy.s.f[] fVarArr, byte[] bArr, java.lang.Boolean bool) {
        int length;
        int i;
        int i2 = getInputFormats + 111;
        int i3 = i2 % 128;
        Camera2StreamConfigurationMap = i3;
        if (i2 % 2 == 0) {
            length = fVarArr.length;
            i = 1;
        } else {
            length = fVarArr.length;
            i = 0;
        }
        getInputFormats = (i3 + 97) % 128;
        while (i < length) {
            int i4 = getInputFormats + 11;
            Camera2StreamConfigurationMap = i4 % 128;
            if (i4 % 2 == 0) {
                util.h.xy.ar.a.m25054(fVarArr[i].m27210(), bArr, bool);
                throw new java.lang.ArithmeticException();
            }
            byte[] m25054 = util.h.xy.ar.a.m25054(fVarArr[i].m27210(), bArr, bool);
            if (m25054 != null) {
                int i5 = getInputFormats + 29;
                Camera2StreamConfigurationMap = i5 % 128;
                if (i5 % 2 == 0) {
                    int length2 = m25054.length;
                    throw null;
                }
                if (m25054.length > 0) {
                    return m25054;
                }
            }
            i++;
        }
        byte[] bArr2 = new byte[0];
        getInputFormats = (Camera2StreamConfigurationMap + 19) % 128;
        return bArr2;
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public static util.h.xy.s.mc m27073(java.lang.String str) throws org.json.JSONException {
        util.h.xy.s.mc mcVar = new util.h.xy.s.mc();
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        getInputFormats = (Camera2StreamConfigurationMap + 47) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("ᡐ䠒\uf3d2侎烔\uf675櫼췂厸ꤻ냪\udd69", 11 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr);
            mcVar.m27223(jSONObject.getString(((java.lang.String) objArr[0]).intern()));
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("㏪締\uf8d4\u0c52嗇ᠹ櫼췂厸ꤻ냪\udd69", (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 11, objArr2);
            mcVar.m27220(jSONObject.getString(((java.lang.String) objArr2[0]).intern()));
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\ufffa￼\ufffe�\bￜ\u0012\u000b\r\u0007\u000e\bￜ�\u000b", (-16777201) - android.graphics.Color.rgb(0, 0, 0), 2 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), android.view.View.resolveSizeAndState(0, 0, 0) + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, true, objArr3);
            mcVar.m27217(util.h.xy.s.d.m27184(jSONObject.getString(((java.lang.String) objArr3[0]).intern())));
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\r\t\u0003\f\uffe7￢\u0012", android.view.KeyEvent.normalizeMetaState(0) + 7, android.graphics.Color.alpha(0) + 6, 274 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16), false, objArr4);
            mcVar.m27219(jSONObject.getString(((java.lang.String) objArr4[0]).intern()).getBytes(util.h.xy.h.a.f2221));
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("䃩쥴젲屈\ueade뜔돏ㇺ\uf360⦩倜\ue459\uf2f3퓅ڇ츅\uf2d8綾ꉻ这\ue6a7☼兆\uf0c8", 23 - android.text.TextUtils.getTrimmedLength(""), objArr5);
            mcVar.m27225(jSONObject.getString(((java.lang.String) objArr5[0]).intern()));
            java.lang.Object[] objArr6 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\u0004\u0006\ufff7", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2, 1 - android.text.TextUtils.indexOf("", ""), 282 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), false, objArr6);
            mcVar.m27221(util.h.xy.s.d.m27184(jSONObject.getString(((java.lang.String) objArr6[0]).intern())));
            int i = getInputFormats + 73;
            Camera2StreamConfigurationMap = i % 128;
            if (i % 2 != 0) {
                return mcVar;
            }
            throw null;
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public static java.lang.String m27074(java.lang.String str) throws org.json.JSONException {
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("ﴔ蚛煘\ud846倜\ue459⏔퐖", 7 - android.text.TextUtils.indexOf("", "", 0, 0), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("\u0001\uffff\u0002", 3 - (android.view.ViewConfiguration.getTouchSlop() >> 8), 2 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 223 - (android.view.ViewConfiguration.getFadingEdgeLength() >> 16), true, objArr2);
        java.lang.String optString = jSONObject.optString(intern, ((java.lang.String) objArr2[0]).intern());
        getInputFormats = (Camera2StreamConfigurationMap + 87) % 128;
        return optString;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public static byte[] m27072(java.lang.String str) {
        if (str != null) {
            getInputFormats = (Camera2StreamConfigurationMap + 23) % 128;
            if (str.length() != 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\ud971恵擥\uf83b祉\uee32ﴘ݅⥃縎\uee9e澾㐢⅏罛\u0bdd﷏\ud88a꾞ɣ㚥\ue43f昆奩‚仙飔八", 27 - android.view.View.combineMeasuredStates(0, 0), objArr);
                if (str.equals(((java.lang.String) objArr[0]).intern())) {
                    return new byte[]{1};
                }
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\uee9e澾\uf03d酢긄뚭誃攏娏㕨\uef38т챰빗㟒⢕퓇ῴ꣼頒鬢⽲脏⩳楮㆞", (android.media.AudioTrack.getMinVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 25, objArr2);
                if (str.equals(((java.lang.String) objArr2[0]).intern())) {
                    return new byte[]{2};
                }
                try {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("\uee9e澾\uf03d酢긄뚭誃攏娏㕨\uef38т챰빗㟒⢕祉\uee32听釺豍髭罛\u0bdd﷏\ud88a", (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() > 0L ? 1 : (((java.lang.Long) java.lang.Class.forName("android.os.Process").getMethod("getElapsedCpuTime", null).invoke(null, null)).longValue() == 0L ? 0 : -1)) + 25, objArr3);
                    if (!str.equals(((java.lang.String) objArr3[0]).intern())) {
                        return new byte[0];
                    }
                    byte[] bArr = {3};
                    getInputFormats = (Camera2StreamConfigurationMap + 47) % 128;
                    return bArr;
                } catch (java.lang.Throwable th) {
                    java.lang.Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }
        return new byte[0];
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static byte[] m27070(java.lang.String str) {
        if (str != null) {
            getInputFormats = (Camera2StreamConfigurationMap + 77) % 128;
            if (str.length() != 0) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("\ue6d7௷郎⑤ᨩل쬊汻왟\ue412", 9 - android.text.TextUtils.indexOf("", "", 0, 0), objArr);
                if (str.equals(((java.lang.String) objArr[0]).intern())) {
                    return new byte[]{com.google.common.base.Ascii.NAK};
                }
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("燮嘭ﯺ涫䏰䮸̑鶔釁\uf68f钥즌\uf21eｵ", android.graphics.Color.blue(0) + 14, objArr2);
                if (str.equals(((java.lang.String) objArr2[0]).intern())) {
                    Camera2StreamConfigurationMap = (getInputFormats + 101) % 128;
                    return new byte[]{com.google.common.base.Ascii.SYN};
                }
                return new byte[]{com.google.common.base.Ascii.ETB};
            }
        }
        return new byte[0];
    }

    static void getHighSpeedVideoSizes() {
        getHighSpeedVideoSizesFor = (char) 41859;
        getOutputFormats = (char) 47689;
        getInputSizeshNQ4ISI = (char) 63370;
        getHighResolutionOutputSizeshNQ4ISI = (char) 44515;
        getOutputMinFrameDuration = -1231763930;
    }
}
