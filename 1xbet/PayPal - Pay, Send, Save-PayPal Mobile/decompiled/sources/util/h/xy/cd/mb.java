package util.h.xy.cd;

/* loaded from: classes5.dex */
public final class mb {
    private static final java.lang.String Camera2StreamConfigurationMap;
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static char getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes = 1;
    private static char getHighSpeedVideoSizesFor;
    private static int getInputFormats;
    private static char getInputSizeshNQ4ISI;
    private static char getOutputMinFrameDuration;

    static {
        getHighSpeedVideoFpsRanges();
        Camera2StreamConfigurationMap = util.h.xy.cd.mb.class.getName();
        int i = getInputFormats + 117;
        getHighSpeedVideoSizes = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        if (r10.equalsIgnoreCase(((java.lang.String) r8[0]).intern()) != false) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba A[LOOP:0: B:21:0x00b8->B:22:0x00ba, LOOP_END] */
    /* renamed from: ˊ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m25870(java.lang.String str) {
        byte[] bArr;
        java.lang.String m26759;
        byte[] bArr2 = {-1};
        com.gemalto.mfs.mwsdk.utils.async.AsyncResult<byte[][]> mo26162 = util.h.xy.k.ma.m26925().mo26162(str);
        if (!mo26162.isSuccessful() || mo26162.getResult() == null || mo26162.getResult().length <= 0) {
            bArr = null;
        } else {
            byte[][] result = mo26162.getResult();
            int length = result.length;
            try {
                m26759 = util.h.xy.f.b.f2201.m26759(str);
            } catch (org.json.JSONException e) {
                e.printStackTrace();
            }
            if (m26759 != null) {
                int i = getInputFormats + 15;
                getHighSpeedVideoSizes = i % 128;
                if (i % 2 == 0) {
                    java.lang.Object[] objArr = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("ꈡ늳莛炿", 5 << (android.view.ViewConfiguration.getTapTimeout() >>> 32), objArr);
                    if (m26759.equalsIgnoreCase(((java.lang.String) objArr[0]).intern())) {
                        int i2 = getHighSpeedVideoSizes + 25;
                        getInputFormats = i2 % 128;
                        if (i2 % 2 != 0) {
                            bArr2[1] = 1;
                            length += 100;
                        } else {
                            bArr2[0] = 1;
                            length--;
                        }
                        for (int i3 = 0; i3 < length; i3++) {
                            getInputFormats = (getHighSpeedVideoSizes + 89) % 128;
                            byte[] m25107 = util.h.xy.ar.mb.m25107(bArr2, result[i3]);
                            result[i3] = m25107;
                            util.h.xy.ar.b.m25074(m25107);
                        }
                        bArr = util.h.xy.ar.b.m25090(result);
                    }
                } else {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    getHighResolutionOutputSizeshNQ4ISI("ꈡ늳莛炿", 4 - (android.view.ViewConfiguration.getTapTimeout() >> 16), objArr2);
                }
            }
            if (m26759 != null) {
                java.lang.Object[] objArr3 = new java.lang.Object[1];
                getHighResolutionOutputSizeshNQ4ISI("팶\ued9f閙쐽猡꯹茶䋦렑ބ", android.graphics.Color.argb(0, 0, 0, 0) + 10, objArr3);
                if (m26759.equalsIgnoreCase(((java.lang.String) objArr3[0]).intern())) {
                    bArr2[0] = 2;
                    while (i3 < length) {
                    }
                    bArr = util.h.xy.ar.b.m25090(result);
                }
            }
            bArr2[0] = 3;
            while (i3 < length) {
            }
            bArr = util.h.xy.ar.b.m25090(result);
        }
        util.h.xy.ar.b.m25074(bArr);
        return bArr;
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            int i2 = getHighResolutionOutputSizeshNQ4ISI + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 == 0) {
                cArr2[0] = charArray[eVar.f2630];
                cArr2[0] = charArray[eVar.f2630];
            } else {
                cArr2[0] = charArray[eVar.f2630];
                cArr2[1] = charArray[eVar.f2630 + 1];
            }
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getOutputMinFrameDuration ^ 3155153533016530592L))) ^ (c3 + i3)) ^ ((c3 >>> 5) + ((char) (getHighSpeedVideoFpsRanges ^ 3155153533016530592L)))));
                i3 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        java.lang.String str2 = new java.lang.String(cArr, 0, i);
        getHighSpeedVideoFpsRangesFor = (getHighResolutionOutputSizeshNQ4ISI + 43) % 128;
        objArr[0] = str2;
    }

    static void getHighSpeedVideoFpsRanges() {
        getOutputMinFrameDuration = (char) 5955;
        getHighSpeedVideoFpsRanges = (char) 54818;
        getHighSpeedVideoSizesFor = (char) 32843;
        getInputSizeshNQ4ISI = (char) 22137;
    }
}
