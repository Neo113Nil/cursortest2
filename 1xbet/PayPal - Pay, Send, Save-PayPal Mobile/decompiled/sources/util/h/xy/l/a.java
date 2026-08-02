package util.h.xy.l;

/* loaded from: classes5.dex */
public class a {
    private static long Camera2StreamConfigurationMap = 0;
    private static int getHighResolutionOutputSizeshNQ4ISI = 1;
    private static char[] getHighSpeedVideoFpsRanges = null;
    private static final java.lang.String getHighSpeedVideoFpsRangesFor;
    private static int getHighSpeedVideoSizes = 0;
    private static int getInputFormats = 1;
    private static int getOutputMinFrameDuration;

    static {
        Camera2StreamConfigurationMap();
        getHighSpeedVideoFpsRangesFor = util.h.xy.l.a.class.getName();
        int i = getInputFormats + 45;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public static void m26974(android.content.Context context) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighResolutionOutputSizeshNQ4ISI(40 - (android.view.ViewConfiguration.getTapTimeout() >> 16), android.view.KeyEvent.keyCodeFromString(""), (char) (android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask) + 64624), objArr);
        java.lang.String intern = ((java.lang.String) objArr[0]).intern();
        byte[] bArr = {-54, -17, -6, -70};
        byte[] bArr2 = {48, 59, -10, -107};
        byte[] bArr3 = {-108, -35, -8, -94};
        byte[] bArr4 = {-70, 19, -36, 46};
        byte[] bArr5 = {63, com.visa.cbp.getEncExpo.getARTIFICIAL_FRAME_PACKAGE_NAME, -77, -54};
        try {
            util.h.xy.da.mc.m26263(context);
            util.h.xy.db.a m27719 = util.h.xy.z.ra.m27719();
            byte[] highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(bArr);
            byte[] highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges(bArr2);
            byte[] highSpeedVideoFpsRanges3 = getHighSpeedVideoFpsRanges(bArr3);
            byte[] highSpeedVideoFpsRanges4 = getHighSpeedVideoFpsRanges(bArr4);
            byte[] highSpeedVideoFpsRanges5 = getHighSpeedVideoFpsRanges(bArr5);
            try {
                util.h.xy.da.mb mo26094 = util.h.xy.da.mb.m26261(highSpeedVideoFpsRanges).mo26090(util.h.xy.da.a.f1152).mo26095(intern, m27719).mo26094();
                if (!util.h.xy.n.ma.f2247.f2250.mo26080()) {
                    int i = getInputFormats + 31;
                    getOutputMinFrameDuration = i % 128;
                    if (i % 2 != 0) {
                        util.h.xy.n.ma.f2247.f2250.mo26073(mo26094);
                        throw null;
                    }
                    util.h.xy.n.ma.f2247.f2250.mo26073(mo26094);
                }
                util.h.xy.n.ma.f2247.f2249.mo26073(util.h.xy.da.mb.m26261(highSpeedVideoFpsRanges2).mo26090(util.h.xy.da.a.f1152).mo26095(intern, m27719).mo26094());
                util.h.xy.n.ma.f2247.f2248.mo26073(util.h.xy.da.mb.m26261(highSpeedVideoFpsRanges5).mo26090(util.h.xy.da.a.f1152).mo26095(intern, m27719).mo26094());
                util.h.xy.n.ma.f2247.f2253.mo26073(util.h.xy.da.mb.m26261(highSpeedVideoFpsRanges3).mo26090(util.h.xy.da.a.f1152).mo26095(intern, m27719).mo26094());
                util.h.xy.n.ma.f2247.f2252.mo26073(util.h.xy.da.mb.m26261(highSpeedVideoFpsRanges4).mo26090(util.h.xy.da.a.f1152).mo26095(intern, m27719).mo26094());
                if (util.h.xy.n.mb.f2254.m26984()) {
                    util.h.xy.n.mb.f2254.m26985(context);
                    util.h.xy.ak.d.m24966(util.h.xy.n.mb.f2254.f2258, util.h.xy.n.ma.f2247.f2250);
                    util.h.xy.ak.d.m24966(util.h.xy.n.mb.f2254.f2256, util.h.xy.n.ma.f2247.f2249);
                    util.h.xy.ak.d.m24966(util.h.xy.n.mb.f2254.f2257, util.h.xy.n.ma.f2247.f2253);
                    util.h.xy.ak.d.m24966(util.h.xy.n.mb.f2254.f2260, util.h.xy.n.ma.f2247.f2252);
                    util.h.xy.ak.d.m24966(util.h.xy.n.mb.f2254.f2259, util.h.xy.n.ma.f2247.f2248);
                    util.h.xy.n.mb.f2254.m26986();
                }
                util.h.xy.ar.b.m25100(highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2);
                getOutputMinFrameDuration = (getInputFormats + 33) % 128;
            } catch (java.lang.Throwable th) {
                util.h.xy.ar.b.m25100(highSpeedVideoFpsRanges, highSpeedVideoFpsRanges2);
                throw th;
            }
        } catch (util.h.xy.da.b e) {
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(util.h.xy.i.b.f2227, e);
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(int i, int i2, char c, java.lang.Object[] objArr) {
        util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
        long[] jArr = new long[i];
        rbVar.f2651 = 0;
        while (rbVar.f2651 < i) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 51) % 128;
            jArr[rbVar.f2651] = (((char) (getHighSpeedVideoFpsRanges[rbVar.f2651 + i2] ^ 3446303986615426049L)) ^ (rbVar.f2651 * (3446303986615426049L ^ Camera2StreamConfigurationMap))) ^ c;
            rbVar.f2651++;
        }
        char[] cArr = new char[i];
        rbVar.f2651 = 0;
        getHighSpeedVideoSizes = (getHighResolutionOutputSizeshNQ4ISI + 119) % 128;
        while (rbVar.f2651 < i) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizes + 87) % 128;
            cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
            rbVar.f2651++;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    private static final byte[] getHighSpeedVideoFpsRanges(byte[] bArr) throws com.gemalto.mfs.mwsdk.exception.InternalComponentException {
        byte[] bArr2 = {99, 111, 109, 46, 103, 101, 109, 97, 108, 116, 111, 46, 109, 111, 98, 105, 108, 101, 115, 100, 107};
        int length = bArr.length;
        byte[] bArr3 = new byte[21];
        int i = 0;
        while (i < 21) {
            int i2 = (getOutputMinFrameDuration + 83) % 128;
            getInputFormats = i2;
            bArr3[i] = (byte) (bArr2[i] ^ bArr[i % 4]);
            i++;
            getOutputMinFrameDuration = (i2 + 13) % 128;
        }
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI(android.text.TextUtils.indexOf("", "") + 7, 40 - (android.view.KeyEvent.getMaxKeyCode() >> 16), (char) (android.graphics.Color.argb(0, 0, 0, 0) + 19311), objArr);
            java.security.MessageDigest messageDigest = java.security.MessageDigest.getInstance(((java.lang.String) objArr[0]).intern());
            messageDigest.update(bArr3);
            return messageDigest.digest();
        } catch (java.security.NoSuchAlgorithmException e) {
            throw new com.gemalto.mfs.mwsdk.exception.InternalComponentException(util.h.xy.i.b.f2226, e);
        }
    }

    static void Camera2StreamConfigurationMap() {
        getHighSpeedVideoFpsRanges = new char[]{24638, 28284, 31937, 19262, 22923, 10236, 13914, 1207, 4925, 57722, 61377, 65084, 52367, 56041, 43339, 47072, 34346, 37995, 25304, 28967, 32653, 19947, 23656, 10919, 14592, 1897, 5579, 58428, 62142, 49404, 53063, 56736, 44058, 47683, 35023, 38688, 25999, 29673, 16971, 20668, 55101, 55622, 52207, 64611, 61148, 37051, 33048};
        Camera2StreamConfigurationMap = 6013781201846243937L;
    }
}
