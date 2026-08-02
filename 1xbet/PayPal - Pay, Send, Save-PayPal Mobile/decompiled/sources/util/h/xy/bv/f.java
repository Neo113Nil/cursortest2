package util.h.xy.bv;

/* loaded from: classes18.dex */
public class f extends util.h.xy.bv.mb {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static char getHighSpeedVideoFpsRangesFor = 8205;
    private static int getHighSpeedVideoSizes = 1;
    private static char getHighSpeedVideoSizesFor = 49948;
    private static char getOutputFormats = 14528;
    private static char getOutputMinFrameDuration = 22786;
    private final java.lang.String getInputFormats;
    private final java.lang.String getInputSizeshNQ4ISI;
    private final java.lang.String getOutputSizeshNQ4ISI;
    private final org.json.JSONObject getOutputStallDurationlomOqCM;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f(java.lang.String str, java.lang.String str2, org.json.JSONObject jSONObject) {
        super(((java.lang.String) r2[0]).intern());
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("ख़\ua7e8쟚툠ꈸ齨䭮Ԣ빱ល\uf150닥\ue9ff詃銸ⷙﻖꎽ", (android.os.SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (android.os.SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 16, objArr);
        this.getOutputSizeshNQ4ISI = util.h.xy.bv.f.class.getName();
        this.getInputFormats = str;
        this.getInputSizeshNQ4ISI = str2;
        this.getOutputStallDurationlomOqCM = jSONObject;
    }

    @Override // util.h.xy.bv.mb
    /* renamed from: ˎ, reason: contains not printable characters */
    protected java.util.Map<java.lang.String, java.lang.String> mo25690() throws util.h.xy.ck.rc, com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("ꈸ齨՟댠\uf18e㘛", 5 - android.text.TextUtils.indexOf("", "", 0), objArr);
        hashMap.put(((java.lang.String) objArr[0]).intern(), this.getInputFormats);
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("ꈸ齨냫消捠끂⢠禞⾸鍑ⴈ煌", 12 - android.text.TextUtils.getOffsetAfter("", 0), objArr2);
        hashMap.put(((java.lang.String) objArr2[0]).intern(), this.getInputSizeshNQ4ISI);
        java.lang.Object[] objArr3 = new java.lang.Object[1];
        Camera2StreamConfigurationMap("빱ល\uf150닥\ue9ff詃銸ⷙ埣汥꧈\uf107耮ꓷᦳ⌌", android.graphics.drawable.Drawable.resolveOpacity(0, 0) + 15, objArr3);
        hashMap.put(((java.lang.String) objArr3[0]).intern(), this.getOutputStallDurationlomOqCM.toString());
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 23) % 128;
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00df A[Catch: all -> 0x0100, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0100, blocks: (B:21:0x00df, B:27:0x00f4), top: B:19:0x00dd }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f4 A[Catch: all -> 0x0100, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0100, blocks: (B:21:0x00df, B:27:0x00f4), top: B:19:0x00dd }] */
    @Override // util.h.xy.bv.mb
    /* renamed from: ˏ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected com.gemalto.mfs.mwsdk.utils.async.AsyncResult<util.h.xy.bv.rb> mo25691(util.h.xy.bv.rb rbVar) {
        java.lang.Throwable th;
        byte[] highSpeedVideoSizes;
        util.h.xy.bv.rg rgVar = new util.h.xy.bv.rg(rbVar.m25751());
        rgVar.m25751();
        rgVar.m25742();
        rgVar.m25745();
        byte[] bArr = null;
        try {
            if (rbVar.m25745() != util.h.xy.bv.rb.ra.f1062) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                Camera2StreamConfigurationMap("ᑴ꘍弄ኊ㮭ㆆ漀獵汭᳚䭋븡Ď蜗㮭ㆆ捠끂욓阤", (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 18, objArr);
                util.h.xy.an.ra raVar = new util.h.xy.an.ra(rgVar, false, ((java.lang.String) objArr[0]).intern());
                util.h.xy.ar.b.m25095((byte[]) null);
                return raVar;
            }
            java.util.Map<java.lang.String, java.lang.String> m25747 = rbVar.m25747();
            if (m25747 != null) {
                java.lang.Object[] objArr2 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("ꈸ齨՟댠ꓮᏱ䜼\uf258\uffefք曞ᒧ\uf18e㘛", android.text.TextUtils.indexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0) + 14, objArr2);
                m25747.containsKey(((java.lang.String) objArr2[0]).intern());
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("ꈸ齨냫消捠끂⢠禞⾸鍑", 10 - android.graphics.drawable.Drawable.resolveOpacity(0, 0), objArr3);
                m25747.containsKey(((java.lang.String) objArr3[0]).intern());
            }
            java.lang.Object[] objArr4 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("ꈸ齨՟댠ꓮᏱ䜼\uf258\uffefք曞ᒧ\uf18e㘛", android.view.View.MeasureSpec.getSize(0) + 13, objArr4);
            if (m25747.containsKey(((java.lang.String) objArr4[0]).intern())) {
                int i = getHighSpeedVideoSizes + 67;
                getHighResolutionOutputSizeshNQ4ISI = i % 128;
                if (i % 2 != 0) {
                    java.lang.Object[] objArr5 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("ꈸ齨냫消捠끂⢠禞⾸鍑", (android.util.TypedValue.complexToFraction(1, 2.0f, 1.0f) > 1.0f ? 1 : (android.util.TypedValue.complexToFraction(1, 2.0f, 1.0f) == 1.0f ? 0 : -1)) + 94, objArr5);
                    if (!m25747.containsKey(((java.lang.String) objArr5[0]).intern())) {
                    }
                    java.util.Map<java.lang.String, java.lang.String> m257472 = rbVar.m25747();
                    java.lang.Object[] objArr6 = new java.lang.Object[1];
                    Camera2StreamConfigurationMap("ꈸ齨՟댠ꓮᏱ䜼\uf258\uffefք曞ᒧ\uf18e㘛", android.text.TextUtils.indexOf("", "", 0) + 13, objArr6);
                    rgVar.m25761(m257472.get(((java.lang.String) objArr6[0]).intern()));
                    highSpeedVideoSizes = getHighSpeedVideoSizes(rbVar);
                    try {
                        if (highSpeedVideoSizes == null) {
                            rgVar.m25760(highSpeedVideoSizes);
                            util.h.xy.an.ra raVar2 = new util.h.xy.an.ra(rgVar, true, null);
                            util.h.xy.ar.b.m25095(highSpeedVideoSizes);
                            return raVar2;
                        }
                        util.h.xy.an.ra<util.h.xy.bv.rb> highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(rgVar);
                        util.h.xy.ar.b.m25095(highSpeedVideoSizes);
                        int i2 = getHighSpeedVideoSizes + 25;
                        getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                        if (i2 % 2 == 0) {
                            return highSpeedVideoFpsRangesFor;
                        }
                        throw null;
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        bArr = highSpeedVideoSizes;
                        util.h.xy.ar.b.m25095(bArr);
                        throw th;
                    }
                }
                java.lang.Object[] objArr7 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("ꈸ齨냫消捠끂⢠禞⾸鍑", (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10, objArr7);
                if (!m25747.containsKey(((java.lang.String) objArr7[0]).intern())) {
                }
                java.util.Map<java.lang.String, java.lang.String> m2574722 = rbVar.m25747();
                java.lang.Object[] objArr62 = new java.lang.Object[1];
                Camera2StreamConfigurationMap("ꈸ齨՟댠ꓮᏱ䜼\uf258\uffefք曞ᒧ\uf18e㘛", android.text.TextUtils.indexOf("", "", 0) + 13, objArr62);
                rgVar.m25761(m2574722.get(((java.lang.String) objArr62[0]).intern()));
                highSpeedVideoSizes = getHighSpeedVideoSizes(rbVar);
                if (highSpeedVideoSizes == null) {
                }
            }
            util.h.xy.an.ra<util.h.xy.bv.rb> highSpeedVideoFpsRangesFor2 = getHighSpeedVideoFpsRangesFor(rgVar);
            util.h.xy.ar.b.m25095((byte[]) null);
            return highSpeedVideoFpsRangesFor2;
        } catch (java.lang.Throwable th3) {
            th = th3;
        }
    }

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 119) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            int i2 = Camera2StreamConfigurationMap + 109;
            getHighSpeedVideoFpsRanges = i2 % 128;
            if (i2 % 2 != 0) {
                cArr2[1] = charArray[eVar.f2630];
                cArr2[1] = charArray[eVar.f2630];
            } else {
                cArr2[0] = charArray[eVar.f2630];
                cArr2[1] = charArray[eVar.f2630 + 1];
            }
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (getHighSpeedVideoFpsRangesFor ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getOutputFormats ^ 3155153533016530592L))) ^ (c3 + i3)) ^ ((c3 >>> 5) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L)))));
                i3 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        objArr[0] = new java.lang.String(cArr, 0, i);
    }

    private static byte[] getHighSpeedVideoSizes(util.h.xy.bv.rb rbVar) {
        try {
            java.util.Map<java.lang.String, java.lang.String> m25747 = rbVar.m25747();
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("ꈸ齨냫消捠끂⢠禞⾸鍑", 9 - android.view.MotionEvent.axisFromString(""), objArr);
            org.json.JSONObject jSONObject = new org.json.JSONObject(m25747.get(((java.lang.String) objArr[0]).intern()));
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("䟷꽭ꓮᏱ尿⪶㻈ଙ뼠锄", 9 - android.view.View.resolveSizeAndState(0, 0, 0), objArr2);
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(((java.lang.String) objArr2[0]).intern());
            java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                jSONObject2.put(next, new java.lang.String(util.h.xy.bx.ra.f1063.m25785(util.h.xy.ck.ra.f1116.m25945().mo25943(util.h.xy.bx.ra.f1063.m25786(jSONObject2.getString(next))))));
                int i = getHighSpeedVideoSizes + 25;
                getHighResolutionOutputSizeshNQ4ISI = i % 128;
                int i2 = i % 2;
            }
            java.lang.Object[] objArr3 = new java.lang.Object[1];
            Camera2StreamConfigurationMap("䟷꽭ꓮᏱ尿⪶㻈ଙ뼠锄", 9 - android.graphics.Color.alpha(0), objArr3);
            jSONObject.put(((java.lang.String) objArr3[0]).intern(), jSONObject2);
            byte[] bytes = jSONObject.toString().getBytes();
            getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 97) % 128;
            return bytes;
        } catch (org.json.JSONException | util.h.xy.ck.rc unused) {
            return null;
        }
    }

    private static util.h.xy.an.ra<util.h.xy.bv.rb> getHighSpeedVideoFpsRangesFor(util.h.xy.bv.rg rgVar) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("䵢犒ꈸ齨죉沍克煞ꈸ齨彭\uda50빱ល\uf150닥\ue9ff詃銸ⷙꕩ띶畡\ue72e᠇鍵砍鈧䭋븡蘟\uf7d0", 31 - android.graphics.ImageFormat.getBitsPerPixel(0), objArr);
        util.h.xy.an.ra<util.h.xy.bv.rb> raVar = new util.h.xy.an.ra<>(rgVar, false, ((java.lang.String) objArr[0]).intern());
        int i = getHighSpeedVideoSizes + 49;
        getHighResolutionOutputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0) {
            return raVar;
        }
        throw new java.lang.ArithmeticException();
    }
}
