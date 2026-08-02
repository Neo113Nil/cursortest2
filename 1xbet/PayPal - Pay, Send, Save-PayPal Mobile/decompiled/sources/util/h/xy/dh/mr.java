package util.h.xy.dh;

/* loaded from: classes5.dex */
public final class mr implements util.h.xy.dh.mb {
    private static int Camera2StreamConfigurationMap = 1;
    private static char[] getHighResolutionOutputSizeshNQ4ISI = {40008, 21391, 966, 62266, 41830, 37537, 17143, 12850, 57952, 53671, 33253, 29034, 8558, 4259, 49377, 45112, 24692, 22434, 2023, 63291, 42875, 38579, 18103, 13861, 58989, 54698, 34302, 30011, 9584, 5372, 50411, 46129, 25601, 23426, 3034, 64278, 43840, 39620, 19142, 14868, 59995, 55689, 35282, 31056, 10509};
    private static long getHighSpeedVideoFpsRanges = -2075370956955036736L;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static int getOutputMinFrameDuration;
    private util.h.xy.dh.ru getInputFormats;
    private util.h.xy.dh.rm getOutputFormats;

    static util.h.xy.dh.rq getHighSpeedVideoSizes(util.h.xy.dh.rm rmVar) throws java.io.IOException {
        util.h.xy.dh.ru ruVar = new util.h.xy.dh.ru(rmVar);
        util.h.xy.dh.rq rqVar = new util.h.xy.dh.rq(util.h.xy.ez.ma.m26745(ruVar), ruVar.getHighSpeedVideoFpsRangesFor());
        int i = getHighSpeedVideoSizes + 111;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            return rqVar;
        }
        throw null;
    }

    @Override // util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        getHighSpeedVideoSizes = (getOutputMinFrameDuration + 13) % 128;
        try {
            util.h.xy.dh.mi mo26278 = mo26278();
            int i = getOutputMinFrameDuration + 125;
            getHighSpeedVideoSizes = i % 128;
            if (i % 2 != 0) {
                return mo26278;
            }
            throw null;
        } catch (java.io.IOException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int packedPositionGroup = android.widget.ExpandableListView.getPackedPositionGroup(0L);
            int offsetAfter = android.text.TextUtils.getOffsetAfter("", 0);
            char indexOf = (char) android.text.TextUtils.indexOf("", "", 0);
            java.lang.Object[] objArr = new java.lang.Object[1];
            int i2 = packedPositionGroup + 45;
            util.h.xz.b.rb rbVar = new util.h.xz.b.rb();
            long[] jArr = new long[i2];
            rbVar.f2651 = 0;
            int i3 = getHighSpeedVideoFpsRangesFor + 119;
            while (true) {
                Camera2StreamConfigurationMap = i3 % 128;
                if (rbVar.f2651 >= i2) {
                    break;
                }
                jArr[rbVar.f2651] = ((rbVar.f2651 * (getHighSpeedVideoFpsRanges ^ 3446303986615426049L)) ^ ((char) (getHighResolutionOutputSizeshNQ4ISI[rbVar.f2651 + offsetAfter] ^ 3446303986615426049L))) ^ indexOf;
                rbVar.f2651++;
                i3 = getHighSpeedVideoFpsRangesFor + 77;
                offsetAfter = offsetAfter;
            }
            char[] cArr = new char[i2];
            int i4 = 0;
            while (true) {
                rbVar.f2651 = i4;
                if (rbVar.f2651 >= i2) {
                    break;
                }
                cArr[rbVar.f2651] = (char) jArr[rbVar.f2651];
                i4 = rbVar.f2651 + 1;
            }
            java.lang.String str = new java.lang.String(cArr);
            int i5 = getHighSpeedVideoFpsRangesFor + 119;
            Camera2StreamConfigurationMap = i5 % 128;
            if (i5 % 2 == 0) {
                throw null;
            }
            objArr[0] = str;
            sb.append(((java.lang.String) objArr[0]).intern());
            sb.append(e.getMessage());
            throw new util.h.xy.dh.ri(sb.toString(), e);
        }
    }

    @Override // util.h.xy.dh.aw
    /* renamed from: ʼ */
    public final util.h.xy.dh.mi mo26278() throws java.io.IOException {
        int i = getHighSpeedVideoSizes + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0) {
            getHighSpeedVideoSizes(this.getOutputFormats);
            throw new java.lang.ArithmeticException();
        }
        util.h.xy.dh.rq highSpeedVideoSizes = getHighSpeedVideoSizes(this.getOutputFormats);
        getHighSpeedVideoSizes = (getOutputMinFrameDuration + 81) % 128;
        return highSpeedVideoSizes;
    }

    @Override // util.h.xy.dh.mb
    /* renamed from: ʻ */
    public final int mo26281() {
        int i = getOutputMinFrameDuration + 37;
        getHighSpeedVideoSizes = i % 128;
        util.h.xy.dh.ru ruVar = this.getInputFormats;
        if (i % 2 != 0) {
            return ruVar.getHighSpeedVideoFpsRangesFor();
        }
        ruVar.getHighSpeedVideoFpsRangesFor();
        throw null;
    }

    @Override // util.h.xy.dh.mb
    /* renamed from: ͺ */
    public final java.io.InputStream mo26282() throws java.io.IOException {
        util.h.xy.dh.ru ruVar = new util.h.xy.dh.ru(this.getOutputFormats);
        this.getInputFormats = ruVar;
        int i = getHighSpeedVideoSizes + 65;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            return ruVar;
        }
        throw null;
    }

    mr(util.h.xy.dh.rm rmVar) {
        this.getOutputFormats = rmVar;
    }
}
