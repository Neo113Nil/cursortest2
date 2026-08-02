package util.h.xy.el;

/* loaded from: classes18.dex */
public final class ra extends util.h.xy.el.ma {
    private static char Camera2StreamConfigurationMap = 36308;
    private static char getHighResolutionOutputSizeshNQ4ISI = 53654;
    private static int getHighSpeedVideoFpsRanges = 0;
    private static int getHighSpeedVideoFpsRangesFor = 0;
    private static int getHighSpeedVideoSizes = 1;
    private static char getHighSpeedVideoSizesFor = 12567;
    private static char getInputFormats = 44499;
    private static int getOutputFormats = 1;

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        getHighSpeedVideoSizes = (getHighSpeedVideoFpsRangesFor + 99) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            int i2 = getHighSpeedVideoSizes + 17;
            getHighSpeedVideoFpsRangesFor = i2 % 128;
            if (i2 % 2 != 0) {
                cArr2[0] = charArray[eVar.f2630];
                cArr2[1] = charArray[eVar.f2630];
            } else {
                cArr2[0] = charArray[eVar.f2630];
                cArr2[1] = charArray[eVar.f2630 + 1];
            }
            int i3 = 58224;
            for (int i4 = 0; i4 < 16; i4++) {
                getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 55) % 128;
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i3) ^ ((c2 << 4) + ((char) (Camera2StreamConfigurationMap ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getHighResolutionOutputSizeshNQ4ISI ^ 3155153533016530592L))) ^ (c3 + i3)) ^ ((c3 >>> 5) + ((char) (getInputFormats ^ 3155153533016530592L)))));
                i3 -= 40503;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        java.lang.String str2 = new java.lang.String(cArr, 0, i);
        getHighSpeedVideoFpsRangesFor = (getHighSpeedVideoSizes + 115) % 128;
        objArr[0] = str2;
    }

    @Override // util.h.xy.el.ma, util.h.xy.ef.a
    /* renamed from: ˎ */
    public final byte[] mo26533() {
        getHighSpeedVideoFpsRanges = (getOutputFormats + 83) % 128;
        int i = this.f2142;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (true) {
            this.f2141.nextBytes(bArr);
            util.h.xy.ep.a.m26661(bArr);
            i2++;
            if (i2 >= 20 || (!util.h.xy.ep.a.m26648(bArr, 0, i) && util.h.xy.ep.a.m26645(bArr, 0))) {
                break;
            }
        }
        if (!util.h.xy.ep.a.m26648(bArr, 0, i)) {
            int i3 = getHighSpeedVideoFpsRanges + 101;
            getOutputFormats = i3 % 128;
            if (i3 % 2 != 0 ? util.h.xy.ep.a.m26645(bArr, 0) : util.h.xy.ep.a.m26645(bArr, 1)) {
                return bArr;
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("쓙\uea96ﺈ蠬嶩蕯⏺槩螠ᓯ㔺椆㽌ⰷ䨣邳揼㺅\uf631쵫碡ꐠꐮ摍\udd1a㋤靳ދ融\ud924", 29 - (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr);
        throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
    }

    @Override // util.h.xy.el.ma, util.h.xy.ef.a
    /* renamed from: ˎ */
    public final void mo26532(util.h.xy.ef.re reVar) {
        this.f2141 = reVar.m26566();
        this.f2142 = (reVar.m26567() + 7) / 8;
        if (this.f2142 == 0 || this.f2142 == 21) {
            this.f2142 = 24;
            return;
        }
        if (this.f2142 == 14) {
            this.f2142 = 16;
            return;
        }
        if (this.f2142 == 24 || this.f2142 == 16) {
            return;
        }
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("\udd1a㋤锜\ude8c揼暂靳ދ融\u59017\uebc7彎窭捸虑澙ⷄ打勘ಊ\ue0b9∜沂\ue8e5잲⏂趔\uf8bc\ud94b㌸\ue814聈ᑹ뮋쇀㫺볋鷪瓃", 40 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myTid", null).invoke(null, null)).intValue() >> 22), objArr);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }
}
