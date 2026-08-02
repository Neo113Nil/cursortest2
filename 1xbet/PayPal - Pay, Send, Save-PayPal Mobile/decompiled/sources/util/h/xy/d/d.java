package util.h.xy.d;

/* loaded from: classes5.dex */
public final class d {
    private static long Camera2StreamConfigurationMap = -8006122914569954367L;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes;
    private java.lang.String getHighSpeedVideoSizesFor;
    private java.lang.String getInputFormats;
    private java.lang.String getOutputMinFrameDuration;

    public d(byte[] bArr) throws org.json.JSONException {
        this.getOutputMinFrameDuration = null;
        this.getHighSpeedVideoSizesFor = null;
        this.getInputFormats = null;
        org.json.JSONObject jSONObject = new org.json.JSONObject(new java.lang.String(bArr, util.h.xy.h.a.f2221));
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("\ue15b\ue13f冭\uf22d줬躙䓛꼉溋쇁妃㿇ﹲㅮ\ue9e7侑俳", android.text.TextUtils.getOffsetBefore("", 0) + 1, objArr);
        if (jSONObject.has(((java.lang.String) objArr[0]).intern())) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\ue15b\ue13f冭\uf22d줬躙䓛꼉溋쇁妃㿇ﹲㅮ\ue9e7侑俳", (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 1, objArr2);
            this.getOutputMinFrameDuration = jSONObject.getString(((java.lang.String) objArr2[0]).intern());
        }
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        getHighSpeedVideoFpsRanges("鷨鶘₊茑ࡤ俟鋹礯ር냮飐\ue9e5苰䁳⢑馕㍯톡뤏ࠗꌼ", 1 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr3);
        if (jSONObject.has(((java.lang.String) objArr3[0]).intern())) {
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("鷨鶘₊茑ࡤ俟鋹礯ር냮飐\ue9e5苰䁳⢑馕㍯톡뤏ࠗꌼ", 1 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr4);
            this.getHighSpeedVideoSizesFor = jSONObject.getString(((java.lang.String) objArr4[0]).intern());
        }
        try {
            java.lang.Object[] objArr5 = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("ꬅꭤ潄쳘㚔焾襞抌Ⓧ＼꘩\uf273됴ྪᙴ舎ֽ鹢蟫\u139c闻⻨\uf718", 1 - ((((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getThreadPriority", java.lang.Integer.TYPE).invoke(null, 0)).intValue() + 20) >> 6), objArr5);
            if (jSONObject.has(((java.lang.String) objArr5[0]).intern())) {
                java.lang.Object[] objArr6 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("ꬅꭤ潄쳘㚔焾襞抌Ⓧ＼꘩\uf273됴ྪᙴ舎ֽ鹢蟫\u139c闻⻨\uf718", android.text.TextUtils.indexOf("", "") + 1, objArr6);
                this.getInputFormats = jSONObject.getString(((java.lang.String) objArr6[0]).intern());
            }
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public d(java.lang.String str) {
        this.getHighSpeedVideoSizesFor = null;
        this.getInputFormats = null;
        this.getOutputMinFrameDuration = str;
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final java.lang.String m26177() {
        int i = getHighSpeedVideoFpsRangesFor + 25;
        getHighSpeedVideoFpsRanges = i % 128;
        java.lang.String str = this.getOutputMinFrameDuration;
        if (i % 2 != 0) {
            return str;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final void m26178(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = (i + 83) % 128;
        this.getHighSpeedVideoSizesFor = str;
        getHighSpeedVideoFpsRanges = (i + 103) % 128;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final java.lang.String m26180() {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = (i + 85) % 128;
        java.lang.String str = this.getHighSpeedVideoSizesFor;
        getHighSpeedVideoFpsRanges = (i + 15) % 128;
        return str;
    }

    /* renamed from: ᐝ, reason: contains not printable characters */
    public final void m26181(java.lang.String str) {
        int i = getHighSpeedVideoFpsRangesFor;
        getHighSpeedVideoFpsRanges = (i + 109) % 128;
        this.getInputFormats = str;
        int i2 = i + 59;
        getHighSpeedVideoFpsRanges = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final java.lang.String m26179() {
        int i = getHighSpeedVideoFpsRanges + 5;
        getHighSpeedVideoFpsRangesFor = i % 128;
        if (i % 2 == 0) {
            return this.getInputFormats;
        }
        throw null;
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2 = (getHighSpeedVideoSizes + 47) % 128;
        getHighResolutionOutputSizeshNQ4ISI = i2;
        getHighSpeedVideoSizes = (i2 + 113) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(Camera2StreamConfigurationMap ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (Camera2StreamConfigurationMap ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public final byte[] m26176() throws org.json.JSONException {
        java.lang.Object obj;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        getHighSpeedVideoFpsRanges = (getHighSpeedVideoFpsRangesFor + 19) % 128;
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRanges("\ue15b\ue13f冭\uf22d줬躙䓛꼉溋쇁妃㿇ﹲㅮ\ue9e7侑俳", (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22) + 1, objArr);
            jSONObject.put(((java.lang.String) objArr[0]).intern(), this.getOutputMinFrameDuration);
            if (this.getHighSpeedVideoSizesFor != null) {
                int i = getHighSpeedVideoFpsRanges + 101;
                getHighSpeedVideoFpsRangesFor = i % 128;
                if (i % 2 != 0) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("鷨鶘₊茑ࡤ俟鋹礯ር냮飐\ue9e5苰䁳⢑馕㍯톡뤏ࠗꌼ", (android.view.ViewConfiguration.getZoomControlsTimeout() > 1L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 1L ? 0 : -1)), objArr2);
                    obj = objArr2[0];
                } else {
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRanges("鷨鶘₊茑ࡤ俟鋹礯ር냮飐\ue9e5苰䁳⢑馕㍯톡뤏ࠗꌼ", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr3);
                    obj = objArr3[0];
                }
                jSONObject.put(((java.lang.String) obj).intern(), this.getHighSpeedVideoSizesFor);
            }
            if (this.getInputFormats != null) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoFpsRanges + 97) % 128;
                java.lang.Object[] objArr4 = new java.lang.Object[1];
                getHighSpeedVideoFpsRanges("ꬅꭤ潄쳘㚔焾襞抌Ⓧ＼꘩\uf273됴ྪᙴ舎ֽ鹢蟫\u139c闻⻨\uf718", (android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr4);
                jSONObject.put(((java.lang.String) objArr4[0]).intern(), this.getInputFormats);
            }
            return jSONObject.toString().getBytes(util.h.xy.h.a.f2221);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
