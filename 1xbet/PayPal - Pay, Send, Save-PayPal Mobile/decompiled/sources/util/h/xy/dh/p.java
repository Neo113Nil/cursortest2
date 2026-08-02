package util.h.xy.dh;

/* loaded from: classes5.dex */
abstract class p extends util.h.xy.dh.mn {
    private static int Camera2StreamConfigurationMap = 0;
    private static char getHighResolutionOutputSizeshNQ4ISI = 56240;
    private static int getHighSpeedVideoSizes = 1;
    private static char getHighSpeedVideoSizesFor = 50640;
    private static char getInputFormats = 6533;
    private static char getInputSizeshNQ4ISI = 12494;
    private static int getOutputFormats = 0;
    private static int getOutputMinFrameDuration = 1;
    final util.h.xy.dh.n getHighSpeedVideoFpsRanges;

    private static void Camera2StreamConfigurationMap(java.lang.String str, int i, java.lang.Object[] objArr) {
        char[] charArray = str.toCharArray();
        util.h.xz.b.e eVar = new util.h.xz.b.e();
        char[] cArr = new char[charArray.length];
        eVar.f2630 = 0;
        char[] cArr2 = new char[2];
        while (eVar.f2630 < charArray.length) {
            getHighSpeedVideoSizes = (Camera2StreamConfigurationMap + 5) % 128;
            cArr2[0] = charArray[eVar.f2630];
            cArr2[1] = charArray[eVar.f2630 + 1];
            int i2 = 58224;
            int i3 = 0;
            while (i3 < 16) {
                char c = cArr2[1];
                char c2 = cArr2[0];
                char c3 = (char) (c - (((c2 + i2) ^ ((c2 << 4) + ((char) (getInputSizeshNQ4ISI ^ 3155153533016530592L)))) ^ ((c2 >>> 5) + ((char) (getHighResolutionOutputSizeshNQ4ISI ^ 3155153533016530592L)))));
                cArr2[1] = c3;
                cArr2[0] = (char) (c2 - ((((c3 << 4) + ((char) (getHighSpeedVideoSizesFor ^ 3155153533016530592L))) ^ (c3 + i2)) ^ ((c3 >>> 5) + ((char) (getInputFormats ^ 3155153533016530592L)))));
                i2 -= 40503;
                i3++;
                Camera2StreamConfigurationMap = (getHighSpeedVideoSizes + 19) % 128;
            }
            cArr[eVar.f2630] = cArr2[0];
            cArr[eVar.f2630 + 1] = cArr2[1];
            eVar.f2630 += 2;
        }
        java.lang.String str2 = new java.lang.String(cArr, 0, i);
        int i4 = getHighSpeedVideoSizes + 83;
        Camera2StreamConfigurationMap = i4 % 128;
        if (i4 % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        objArr[0] = str2;
    }

    final util.h.xy.dh.mi Camera2StreamConfigurationMap(util.h.xy.dh.mm mmVar, boolean z) {
        int i = getOutputFormats + 97;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 != 0 ? 128 != mmVar.m26328() : 29129 != mmVar.m26328()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("劙搻艷涊ㄕ畒뙄㑽님몚䵽詏鴹횎\uedfbહ歮盲ఆ䜕쑍⒢摈͛腩闬‵䌸ꁯ\udec4鬴赦榄饡뭿苝쾶߲㧞䠈콦\uf004뇕뭻뭧ꁾ峜焓", 48 - android.widget.ExpandableListView.getPackedPositionType(0L), objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        util.h.xy.dh.mi highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(mmVar.getHighSpeedVideoSizes(z, this));
        getOutputFormats = (getOutputMinFrameDuration + 23) % 128;
        return highResolutionOutputSizeshNQ4ISI;
    }

    final util.h.xy.dh.mi getHighSpeedVideoFpsRanges(byte[] bArr) throws java.io.IOException {
        int i = getOutputMinFrameDuration + 33;
        getOutputFormats = i % 128;
        util.h.xy.dh.mi highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.mi.m26324(bArr));
        if (i % 2 != 0) {
            throw new java.lang.ArithmeticException();
        }
        int i2 = getOutputMinFrameDuration + 47;
        getOutputFormats = i2 % 128;
        if (i2 % 2 == 0) {
            return highResolutionOutputSizeshNQ4ISI;
        }
        throw null;
    }

    util.h.xy.dh.mi getHighSpeedVideoSizes(util.h.xy.dh.l lVar) {
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            Camera2StreamConfigurationMap("ꌰ\udc3a褒粴\ud811뾧㮗풑뉵燫\uf6f5瑿썫犤匐蟗翞㣳哨赠\u0b7d멕⤭舎茗应ẵ町\uf230풉䵽詏㨗\u0558\u0b7d멕绥쳙ꧏ큅", ((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("getGidForName", java.lang.String.class).invoke(null, "")).intValue() + 41, objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(util.h.xy.dh.mz mzVar) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("ꌰ\udc3a褒粴\ud811뾧㮗풑뉵燫\uf6f5瑿썫犤匐蟗翞㣳哨赠ଁ㿊ꂒഴ汊\ude42嚮䤢저\ue645㨗\u0558\u0b7d멕绥쳙ꧏ큅", 38 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), objArr);
        throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
    }

    final util.h.xy.dh.mi getHighResolutionOutputSizeshNQ4ISI(util.h.xy.dh.mi miVar) {
        int i = getOutputFormats + 93;
        getOutputMinFrameDuration = i % 128;
        if (i % 2 == 0) {
            java.lang.Class cls = this.getHighSpeedVideoFpsRangesFor;
            throw null;
        }
        if (this.getHighSpeedVideoFpsRangesFor.isInstance(miVar)) {
            getOutputFormats = (getOutputMinFrameDuration + 121) % 128;
            return miVar;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr = new java.lang.Object[1];
        Camera2StreamConfigurationMap("ꌰ\udc3a褒粴\ud811뾧㮗풑뉵燫츢빕宝똧퓟꺨᠃\ue6be랂ཛྷ", android.text.TextUtils.lastIndexOf("", com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, 0, 0) + 20, objArr);
        sb.append(((java.lang.String) objArr[0]).intern());
        sb.append(miVar.getClass().getName());
        throw new java.lang.IllegalStateException(sb.toString());
    }

    p(java.lang.Class cls, int i) {
        super(cls);
        this.getHighSpeedVideoFpsRanges = util.h.xy.dh.n.getHighResolutionOutputSizeshNQ4ISI(i);
    }
}
