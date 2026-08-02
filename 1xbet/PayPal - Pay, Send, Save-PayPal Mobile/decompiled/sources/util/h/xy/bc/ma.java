package util.h.xy.bc;

/* loaded from: classes5.dex */
public final class ma {
    private static int Camera2StreamConfigurationMap = 1;
    private static int getHighSpeedVideoFpsRanges;
    private final util.h.xy.bc.ma.b[] getHighSpeedVideoSizes = new util.h.xy.bc.ma.b[0];

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class b {
        private static int Camera2StreamConfigurationMap = 1;
        private static int getHighResolutionOutputSizeshNQ4ISI = 0;
        private static int getHighSpeedVideoFpsRanges = 1;
        private static long getHighSpeedVideoFpsRangesFor;
        private static int getHighSpeedVideoSizes;
        private static final /* synthetic */ util.h.xy.bc.ma.b[] getInputFormats;

        /* renamed from: ˊ, reason: contains not printable characters */
        public static final util.h.xy.bc.ma.b f920;

        /* renamed from: ᐝ, reason: contains not printable characters */
        public static final util.h.xy.bc.ma.b f921;

        private b(java.lang.String str, int i) {
        }

        public static util.h.xy.bc.ma.b valueOf(java.lang.String str) {
            int i = getHighSpeedVideoSizes + 23;
            Camera2StreamConfigurationMap = i % 128;
            util.h.xy.bc.ma.b bVar = (util.h.xy.bc.ma.b) java.lang.Enum.valueOf(util.h.xy.bc.ma.b.class, str);
            if (i % 2 == 0) {
                throw new java.lang.ArithmeticException();
            }
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 9) % 128;
            return bVar;
        }

        public static util.h.xy.bc.ma.b[] values() {
            int i = Camera2StreamConfigurationMap + 97;
            getHighSpeedVideoSizes = i % 128;
            util.h.xy.bc.ma.b[] bVarArr = getInputFormats;
            if (i % 2 == 0) {
                return (util.h.xy.bc.ma.b[]) bVarArr.clone();
            }
            throw null;
        }

        static {
            getHighSpeedVideoSizes();
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("릀穯맕᯼츳若\uea27\u243a嫓ꇮ켶̪翿쓈갛縑ჾ\udbde脇崛㖉Ｄ智룬", 1 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr);
            util.h.xy.bc.ma.b bVar = new util.h.xy.bc.ma.b(((java.lang.String) objArr[0]).intern(), 0);
            f920 = bVar;
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighResolutionOutputSizeshNQ4ISI("ࢽꝜࣴ幹뵩忖꾧坤\uebe1糁誥灪컞᧽\ue983\u0d51ꇄۮ쒈⹖蒼∌⏴", 1 - (android.media.AudioTrack.getMaxVolume() > 0.0f ? 1 : (android.media.AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr2);
            util.h.xy.bc.ma.b bVar2 = new util.h.xy.bc.ma.b(((java.lang.String) objArr2[0]).intern(), 1);
            f921 = bVar2;
            int i = getHighSpeedVideoSizes;
            Camera2StreamConfigurationMap = (i + 91) % 128;
            util.h.xy.bc.ma.b[] bVarArr = {bVar, bVar2};
            int i2 = i + 37;
            int i3 = i2 % 128;
            Camera2StreamConfigurationMap = i3;
            if (i2 % 2 != 0) {
                getInputFormats = bVarArr;
                int i4 = i3 + 83;
                getHighSpeedVideoSizes = i4 % 128;
                if (i4 % 2 != 0) {
                    throw null;
                }
                return;
            }
            throw null;
        }

        private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.String str, int i, java.lang.Object[] objArr) {
            getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoFpsRanges + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            char[] charArray = str.toCharArray();
            util.h.xz.b.a aVar = new util.h.xz.b.a();
            char[] m27721 = util.h.xz.b.a.m27721(getHighSpeedVideoFpsRangesFor ^ 7817488252581312552L, charArray, i);
            aVar.f2623 = 4;
            while (aVar.f2623 < m27721.length) {
                aVar.f2624 = aVar.f2623 - 4;
                m27721[aVar.f2623] = (char) ((m27721[aVar.f2623] ^ m27721[aVar.f2623 % 4]) ^ (aVar.f2624 * (getHighSpeedVideoFpsRangesFor ^ 7817488252581312552L)));
                aVar.f2623++;
                int i2 = getHighSpeedVideoFpsRanges + 5;
                getHighResolutionOutputSizeshNQ4ISI = i2 % 128;
                int i3 = i2 % 2;
            }
            java.lang.String str2 = new java.lang.String(m27721, 4, m27721.length - 4);
            getHighSpeedVideoFpsRanges = (getHighResolutionOutputSizeshNQ4ISI + 25) % 128;
            objArr[0] = str2;
        }

        static void getHighSpeedVideoSizes() {
            getHighSpeedVideoFpsRangesFor = 5154369478337757420L;
        }
    }

    public ma(util.h.xy.bc.ma.b... bVarArr) {
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    public final boolean m25371(util.h.xy.bc.ma.b bVar) {
        int i = Camera2StreamConfigurationMap;
        getHighSpeedVideoFpsRanges = (((i | 111) << 1) - (i ^ 111)) % 128;
        return false;
    }
}
