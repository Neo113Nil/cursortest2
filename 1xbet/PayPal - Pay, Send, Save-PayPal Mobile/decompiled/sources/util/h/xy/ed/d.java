package util.h.xy.ed;

/* loaded from: classes5.dex */
public final class d extends util.h.xy.dh.mh {
    private static long getOutputSizes = -3713200793541959870L;
    private static int getOutputSizeshNQ4ISI = 0;
    private static int getOutputStallDurationlomOqCM = 1;
    private static int getValidOutputFormatsForInputhNQ4ISI = 1;
    private static int isOutputSupportedForhNQ4ISI;
    util.h.xy.ed.rb Camera2StreamConfigurationMap;
    util.h.xy.ed.ra getHighResolutionOutputSizeshNQ4ISI;
    util.h.xy.ed.mc getHighSpeedVideoFpsRanges;
    util.h.xy.dw.b getHighSpeedVideoFpsRangesFor;
    util.h.xy.ed.rb getHighSpeedVideoSizes;
    util.h.xy.dh.f getHighSpeedVideoSizesFor;
    util.h.xy.dh.ma getInputFormats;
    util.h.xy.dw.b getInputSizeshNQ4ISI;
    util.h.xy.dh.l getOutputFormats;
    util.h.xy.dh.f getOutputMinFrameDuration;
    util.h.xy.ed.a getOutputMinFrameDurationlomOqCM;
    util.h.xy.dh.ma getOutputStallDuration;

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        int i3 = getOutputSizeshNQ4ISI + 49;
        getOutputStallDurationlomOqCM = i3 % 128;
        if (i3 % 2 == 0) {
            throw new java.lang.ArithmeticException();
        }
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        getOutputSizeshNQ4ISI = (getOutputStallDurationlomOqCM + 49) % 128;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getOutputSizes ^ (-7508379876853140581L));
            dVar.f2629++;
            getOutputStallDurationlomOqCM = (getOutputSizeshNQ4ISI + 59) % 128;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            int i4 = getOutputSizeshNQ4ISI + 19;
            getOutputStallDurationlomOqCM = i4 % 128;
            if (i4 % 2 == 0) {
                cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                i2 = dVar.f2629 - 1;
            } else {
                cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                i2 = dVar.f2629 + 1;
            }
            dVar.f2629 = i2;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    @Override // util.h.xy.dh.mh, util.h.xy.dh.c
    /* renamed from: ʾ */
    public final util.h.xy.dh.mi mo26279() {
        java.lang.Object[] objArr = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("겶\uf016ᗄ뫀\ude4f指胂▜䥒\uee05㏘傧\uf476ᤴ뻣쎯朧萬⦦仮鈤㝶咆\uf84eᴍꋃ잜歩蠛\u2ddf犑阗㬝壡ﶱő\ua639쯪梤豱턴目鮯", (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 23741, objArr);
        if (util.h.xy.fb.rc.m26850(((java.lang.String) objArr[0]).intern()) == null) {
            return this.getOutputFormats;
        }
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("겶\uf016ᗄ뫀\ude4f指胂▜䥒\uee05㏘傧\uf476ᤴ뻣쎯朧萬⦦仮鈤㝶咆\uf84eᴍꋃ잜歩蠛\u2ddf犑阗㬝壡ﶱő\ua639쯪梤豱턴目鮯", 23742 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
        if (util.h.xy.fb.rc.m26853(((java.lang.String) objArr2[0]).intern())) {
            return this.getOutputFormats;
        }
        util.h.xy.dh.d dVar = new util.h.xy.dh.d();
        if (!this.getOutputMinFrameDuration.m26296(0)) {
            dVar.m26290(new util.h.xy.dh.ag(true, 0, this.getOutputMinFrameDuration));
        }
        dVar.m26290(this.getHighSpeedVideoSizesFor);
        dVar.m26290(this.getOutputMinFrameDurationlomOqCM);
        dVar.m26290(this.getHighSpeedVideoFpsRangesFor);
        util.h.xy.dh.d dVar2 = new util.h.xy.dh.d(2);
        dVar2.m26290(this.getHighSpeedVideoSizes);
        dVar2.m26290(this.Camera2StreamConfigurationMap);
        dVar.m26290(new util.h.xy.dh.aa(dVar2));
        util.h.xy.dw.b bVar = this.getInputSizeshNQ4ISI;
        if (bVar != null) {
            int i = getValidOutputFormatsForInputhNQ4ISI + 105;
            isOutputSupportedForhNQ4ISI = i % 128;
            dVar.m26290(bVar);
            if (i % 2 != 0) {
                throw null;
            }
        } else {
            dVar.m26290(new util.h.xy.dh.aa());
        }
        dVar.m26290(this.getHighSpeedVideoFpsRanges);
        util.h.xy.dh.ma maVar = this.getOutputStallDuration;
        if (maVar != null) {
            dVar.m26290(new util.h.xy.dh.ag(false, 1, maVar));
        }
        util.h.xy.dh.ma maVar2 = this.getInputFormats;
        if (maVar2 != null) {
            dVar.m26290(new util.h.xy.dh.ag(false, 2, maVar2));
        }
        util.h.xy.ed.ra raVar = this.getHighResolutionOutputSizeshNQ4ISI;
        if (raVar != null) {
            dVar.m26290(new util.h.xy.dh.ag(true, 3, raVar));
            int i2 = getValidOutputFormatsForInputhNQ4ISI + 3;
            isOutputSupportedForhNQ4ISI = i2 % 128;
            int i3 = i2 % 2;
        }
        return new util.h.xy.dh.aa(dVar);
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    public final util.h.xy.ed.ra m26503() {
        int i = isOutputSupportedForhNQ4ISI + 9;
        getValidOutputFormatsForInputhNQ4ISI = i % 128;
        if (i % 2 != 0) {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
        throw null;
    }

    private d(util.h.xy.dh.l lVar) {
        int i;
        boolean z;
        boolean z2;
        this.getOutputFormats = lVar;
        if (lVar.mo26287(0) instanceof util.h.xy.dh.mm) {
            this.getOutputMinFrameDuration = util.h.xy.dh.f.m26292((util.h.xy.dh.mm) lVar.mo26287(0), true);
            i = 0;
        } else {
            this.getOutputMinFrameDuration = new util.h.xy.dh.f(0L);
            i = -1;
        }
        if (this.getOutputMinFrameDuration.m26296(0)) {
            z2 = false;
            z = true;
        } else if (this.getOutputMinFrameDuration.m26296(1)) {
            z = false;
            z2 = true;
        } else {
            if (!this.getOutputMinFrameDuration.m26296(2)) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                getHighSpeedVideoFpsRangesFor("겯\u16fd\ud829艩䖴\u0ff3\uf131묾线⃥\uea3e거ឰ\ud9e6荷䕸ࢦ\uf2fc둫繸↨\uebef괠ᝩ\udaaf鳩䘰ࡧ\uf3a1", 47681 - (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (android.util.TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr);
                throw new java.lang.IllegalArgumentException(((java.lang.String) objArr[0]).intern());
            }
            z = false;
            z2 = false;
        }
        this.getHighSpeedVideoSizesFor = util.h.xy.dh.f.m26291(lVar.mo26287(i + 1));
        this.getOutputMinFrameDurationlomOqCM = util.h.xy.ed.a.m26491(lVar.mo26287(i + 2));
        this.getHighSpeedVideoFpsRangesFor = util.h.xy.dw.b.m26430(lVar.mo26287(i + 3));
        util.h.xy.dh.l lVar2 = (util.h.xy.dh.l) lVar.mo26287(i + 4);
        this.getHighSpeedVideoSizes = util.h.xy.ed.rb.m26518(lVar2.mo26287(0));
        this.Camera2StreamConfigurationMap = util.h.xy.ed.rb.m26518(lVar2.mo26287(1));
        this.getInputSizeshNQ4ISI = util.h.xy.dw.b.m26430(lVar.mo26287(i + 5));
        int i2 = i + 6;
        this.getHighSpeedVideoFpsRanges = util.h.xy.ed.mc.m26512(lVar.mo26287(i2));
        int mo26286 = (lVar.mo26286() - i2) - 1;
        if (mo26286 != 0 && z) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("겯\uf2bbႥ뚿풬窕额㻈峐\ue2c6ü꛱쓿櫶裒⻖䳀鋍テ嘨\uf430ᩪ렠\ude17簟舂\u200e䘍\ue473\u0a61꠫칥汁뉊큅癍鐅㮾妲ﾼᶠ", 24071 - android.text.TextUtils.getOffsetAfter("", 0), objArr2);
            throw new java.lang.IllegalArgumentException(((java.lang.String) objArr2[0]).intern());
        }
        while (mo26286 > 0) {
            util.h.xy.dh.mm mmVar = (util.h.xy.dh.mm) lVar.mo26287(i2 + mo26286);
            int m26330 = mmVar.m26330();
            if (m26330 == 1) {
                this.getOutputStallDuration = util.h.xy.dh.rw.m26352(mmVar, false);
            } else if (m26330 == 2) {
                this.getInputFormats = util.h.xy.dh.rw.m26352(mmVar, false);
            } else {
                if (m26330 != 3) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    java.lang.Object[] objArr3 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("게⚼뢤㊖蒚ẙ郵檴ﳵ盛죐䊀퐸길†먓జ蘌ᡫ鉭摷﹛灏쨄嶸\ud7a4ꧧ⎃떙ྔ臦ᯯ\uedcd柇利猽앯彮", (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16) + 35339, objArr3);
                    sb.append(((java.lang.String) objArr3[0]).intern());
                    sb.append(mmVar.m26330());
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                if (z2) {
                    java.lang.Object[] objArr4 = new java.lang.Object[1];
                    getHighSpeedVideoFpsRangesFor("겯頭얉ㄙ维ꩣ韑쌎ࡣ痠ꄐ\uee87\uda67߰獞룀\ue5a0턛Ẋ䩮럨\ue31c⣌ᖿ䄯躞兀⟦ጥ壗葈\uf138㺍樉埲荤좝㑉愧꺺騔잎㍠磫ꑚ释\udea4", ((byte) android.view.KeyEvent.getModifierMetaStateMask()) + 13458, objArr4);
                    throw new java.lang.IllegalArgumentException(((java.lang.String) objArr4[0]).intern());
                }
                this.getHighResolutionOutputSizeshNQ4ISI = util.h.xy.ed.ra.m26516(util.h.xy.dh.l.m26304(mmVar, true));
            }
            mo26286--;
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    public static util.h.xy.ed.d m26502(java.lang.Object obj) {
        int i = getValidOutputFormatsForInputhNQ4ISI + 81;
        int i2 = i % 128;
        isOutputSupportedForhNQ4ISI = i2;
        if (i % 2 != 0) {
            throw null;
        }
        if (obj instanceof util.h.xy.ed.d) {
            util.h.xy.ed.d dVar = (util.h.xy.ed.d) obj;
            getValidOutputFormatsForInputhNQ4ISI = (i2 + 21) % 128;
            return dVar;
        }
        if (obj != null) {
            return new util.h.xy.ed.d(util.h.xy.dh.l.m26303(obj));
        }
        return null;
    }
}
