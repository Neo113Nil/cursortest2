package util.h.xy.cz;

/* loaded from: classes5.dex */
public final class mb implements util.h.xy.db.mb {
    private static int Camera2StreamConfigurationMap = 0;
    private static long getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoFpsRanges = 1;
    private static int getHighSpeedVideoFpsRangesFor = 1;
    private static int getHighSpeedVideoSizes;
    private static long getHighSpeedVideoSizesFor;
    private final java.lang.Object getOutputMinFrameDuration;

    public mb() {
        try {
            int tapTimeout = (android.view.ViewConfiguration.getTapTimeout() >> 16) + 55147;
            char[] charArray = "뚇懧ᡍネ\ueb6f莉먊啣ව\u245c\udcaa\uf700꾐䚬煤⧍쀾\uf883錙䩹拣ᵋ㖱\uec14蒊뿳".toCharArray();
            util.h.xz.b.d dVar = new util.h.xz.b.d();
            dVar.f2628 = tapTimeout;
            int length = charArray.length;
            long[] jArr = new long[length];
            dVar.f2629 = 0;
            while (dVar.f2629 < charArray.length) {
                jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getHighSpeedVideoSizesFor ^ (-7508379876853140581L));
                dVar.f2629++;
            }
            char[] cArr = new char[length];
            dVar.f2629 = 0;
            while (dVar.f2629 < charArray.length) {
                cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                dVar.f2629++;
            }
            java.lang.String str = new java.lang.String(cArr);
            java.lang.String str2 = str;
            this.getOutputMinFrameDuration = java.lang.Class.forName(str).getDeclaredConstructor(null).newInstance(null);
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // util.h.xy.db.mb
    /* renamed from: ˊ, reason: contains not printable characters */
    public final void mo26126(byte[] bArr) throws util.h.xy.da.b {
        Camera2StreamConfigurationMap = (getHighSpeedVideoFpsRanges + 47) % 128;
        try {
            ((java.util.Random) this.getOutputMinFrameDuration).nextBytes(bArr);
            int i = Camera2StreamConfigurationMap + 87;
            getHighSpeedVideoFpsRanges = i % 128;
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
        } catch (java.lang.Exception unused) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("뉮댦눫安圠錓뚄᮷⏌앂ņ⓳醧뭞띤쭫ݫ⪱▸礕\uf549颲䯥\uef4e欘ໃ宅鶷\ud8faﱒ栒Ϯ亽剷鹣뇞㳎솀ಀ\u2005鉚랍닜혻\u0007◟\u20f1䒧\uf1fb鬯圴\uea95柚ॳ압飂햑ｌ毟", android.view.ViewConfiguration.getLongPressTimeout() >> 16, objArr);
            throw new util.h.xy.da.b(((java.lang.String) objArr[0]).intern());
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 17) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.a aVar = new util.h.xz.b.a();
        char[] m27721 = util.h.xz.b.a.m27721(getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L, charArray, i);
        aVar.f2623 = 4;
        while (aVar.f2623 < m27721.length) {
            getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 35) % 128;
            aVar.f2624 = aVar.f2623 - 4;
            m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighResolutionOutputSizeshNQ4ISI ^ 7817488252581312552L)));
            aVar.f2623++;
        }
        objArr[0] = new java.lang.String(m27721, 4, m27721.length - 4);
    }

    static void getHighResolutionOutputSizeshNQ4ISI() {
        getHighSpeedVideoSizesFor = -6085435106890906250L;
    }

    static {
        getHighResolutionOutputSizeshNQ4ISI();
        getHighResolutionOutputSizeshNQ4ISI = -9068335573466342308L;
    }
}
