package util.h.xy.dh;

/* loaded from: classes5.dex */
public abstract class mm extends util.h.xy.dh.mi implements util.h.xy.dh.rn {
    private static int getHighResolutionOutputSizeshNQ4ISI = 0;
    private static int getHighSpeedVideoSizesFor = 1;
    private static int getInputFormats = 1;
    private static int getInputSizeshNQ4ISI = 0;
    private static long getOutputFormats = 1509555080691173501L;
    final int Camera2StreamConfigurationMap;
    final int getHighSpeedVideoFpsRanges;
    final util.h.xy.dh.c getHighSpeedVideoFpsRangesFor;
    final int getHighSpeedVideoSizes;

    abstract util.h.xy.dh.l Camera2StreamConfigurationMap(util.h.xy.dh.mi miVar);

    private static void getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, java.lang.Object[] objArr) {
        int i2;
        getHighResolutionOutputSizeshNQ4ISI = (getHighSpeedVideoSizesFor + 109) % 128;
        char[] charArray = str.toCharArray();
        util.h.xz.b.d dVar = new util.h.xz.b.d();
        dVar.f2628 = i;
        int length = charArray.length;
        long[] jArr = new long[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            jArr[dVar.f2629] = (charArray[dVar.f2629] ^ (dVar.f2629 * dVar.f2628)) ^ (getOutputFormats ^ (-7508379876853140581L));
            dVar.f2629++;
        }
        char[] cArr = new char[length];
        dVar.f2629 = 0;
        while (dVar.f2629 < charArray.length) {
            int i3 = getHighSpeedVideoSizesFor + 51;
            getHighResolutionOutputSizeshNQ4ISI = i3 % 128;
            if (i3 % 2 != 0) {
                cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                i2 = dVar.f2629;
            } else {
                cArr[dVar.f2629] = (char) jArr[dVar.f2629];
                i2 = dVar.f2629 + 1;
            }
            dVar.f2629 = i2;
        }
        objArr[0] = new java.lang.String(cArr);
    }

    static util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(int i, int i2, byte[] bArr) {
        util.h.xy.dh.at atVar = new util.h.xy.dh.at(4, i, i2, new util.h.xy.dh.mz(bArr));
        if (i != 64) {
            return atVar;
        }
        util.h.xy.dh.ah ahVar = new util.h.xy.dh.ah(atVar);
        int i3 = getInputFormats + 111;
        getInputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            return ahVar;
        }
        throw null;
    }

    static util.h.xy.dh.mi getHighSpeedVideoSizes(int i, int i2, util.h.xy.dh.d dVar) {
        util.h.xy.dh.mu muVar;
        if (dVar.m26288() == 1) {
            getInputSizeshNQ4ISI = (getInputFormats + 71) % 128;
            muVar = new util.h.xy.dh.mu(3, i, i2, dVar.m26289(0));
        } else {
            muVar = new util.h.xy.dh.mu(4, i, i2, util.h.xy.dh.r.getHighSpeedVideoSizes(dVar));
        }
        if (i == 64) {
            return new util.h.xy.dh.mq(muVar);
        }
        int i3 = getInputFormats + 89;
        getInputSizeshNQ4ISI = i3 % 128;
        if (i3 % 2 == 0) {
            return muVar;
        }
        throw null;
    }

    static util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor(int i, int i2, util.h.xy.dh.d dVar) {
        util.h.xy.dh.at atVar;
        if (dVar.m26288() == 1) {
            int i3 = (getInputSizeshNQ4ISI + 101) % 128;
            getInputFormats = i3;
            int i4 = i3 + 35;
            getInputSizeshNQ4ISI = i4 % 128;
            int i5 = i4 % 2;
            atVar = new util.h.xy.dh.at(3, i, i2, dVar.m26289(0));
        } else {
            atVar = new util.h.xy.dh.at(4, i, i2, util.h.xy.dh.ao.getHighSpeedVideoFpsRanges(dVar));
        }
        return i != 64 ? atVar : new util.h.xy.dh.ah(atVar);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(util.h.xy.dh.q.m26331(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes));
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        java.lang.String obj = sb.toString();
        getInputSizeshNQ4ISI = (getInputFormats + 15) % 128;
        return obj;
    }

    @Override // util.h.xy.dh.mi
    util.h.xy.dh.mi getHighSpeedVideoFpsRangesFor() {
        util.h.xy.dh.at atVar = new util.h.xy.dh.at(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
        getInputSizeshNQ4ISI = (getInputFormats + 85) % 128;
        return atVar;
    }

    @Override // util.h.xy.dh.mi
    util.h.xy.dh.mi Camera2StreamConfigurationMap() {
        util.h.xy.dh.ag agVar = new util.h.xy.dh.ag(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
        getInputSizeshNQ4ISI = (getInputFormats + 81) % 128;
        return agVar;
    }

    @Override // util.h.xy.dh.aw
    /* renamed from: ʼ */
    public final util.h.xy.dh.mi mo26278() {
        int i = getInputFormats;
        getInputSizeshNQ4ISI = (i + 59) % 128;
        getInputSizeshNQ4ISI = (i + 55) % 128;
        return this;
    }

    final util.h.xy.dh.mi getHighSpeedVideoSizes(boolean z, util.h.xy.dh.p pVar) {
        if (!z) {
            if (1 != this.Camera2StreamConfigurationMap) {
                util.h.xy.dh.mi mo26279 = this.getHighSpeedVideoFpsRangesFor.mo26279();
                int i = this.Camera2StreamConfigurationMap;
                return i != 3 ? i != 4 ? pVar.getHighResolutionOutputSizeshNQ4ISI(mo26279) : mo26279 instanceof util.h.xy.dh.l ? pVar.getHighSpeedVideoSizes((util.h.xy.dh.l) mo26279) : pVar.getHighSpeedVideoFpsRangesFor((util.h.xy.dh.mz) mo26279) : pVar.getHighSpeedVideoSizes(Camera2StreamConfigurationMap(mo26279));
            }
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("ﮉ髑㤦\ud87c绑ᴻ밸勐\uf136遫㛘픨瑹\u0adeꤴ䠽\uee9b赣Ⱶ싄愲sꛁ䔦\ue477竟ᥤ롴廒ﴷ鱵㋎턲灶ᛈ땗", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 24916, objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        if (m26327()) {
            return pVar.getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoFpsRangesFor.mo26279());
        }
        try {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("ﮉ髑㤦\ud87c绑ᴻ밸勐\uf136遫㛘픨瑹\u0adeꤴ䠽\uee9b赣Ⱶ싄愲sꛁ䔦\ue477竟ᥤ롴廒ﴷ鱵㋎턲灶ᛈ땗", 24917 - (((java.lang.Integer) java.lang.Class.forName("android.os.Process").getMethod("myPid", null).invoke(null, null)).intValue() >> 22), objArr2);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr2[0]).intern());
        } catch (java.lang.Throwable th) {
            java.lang.Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* renamed from: ʻ, reason: contains not printable characters */
    public util.h.xy.dh.mh m26326() {
        util.h.xy.dh.mh mo26279;
        if (!m26327()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("ﮉ\ud901뺆鰌熑國㓘ਬ\uefa3촻ꊸ耸方㭎ᣔ︍펛넓雙瑁䧲⽣ೡ\ue276쟷ꕯ穄径㴒ኇ\uf015햞ꬲ袦渨䏧", (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 8836, objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        util.h.xy.dh.c cVar = this.getHighSpeedVideoFpsRangesFor;
        if (cVar instanceof util.h.xy.dh.mh) {
            int i = getInputSizeshNQ4ISI + 105;
            int i2 = i % 128;
            getInputFormats = i2;
            mo26279 = (util.h.xy.dh.mh) cVar;
            if (i % 2 == 0) {
                throw null;
            }
            getInputSizeshNQ4ISI = (i2 + 115) % 128;
        } else {
            mo26279 = cVar.mo26279();
        }
        int i3 = getInputSizeshNQ4ISI + 25;
        getInputFormats = i3 % 128;
        if (i3 % 2 != 0) {
            return mo26279;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ͺ, reason: contains not printable characters */
    public util.h.xy.dh.mi m26329() {
        int i = getInputFormats + 7;
        getInputSizeshNQ4ISI = i % 128;
        if (i % 2 == 0 ? 128 != m26328() : 21960 != m26328()) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("ﮒ쳻镥巊☒\ueec2뜽羡䀦\u0894턐駁拵⭹\uf3ec쑄貖啕ᶽ\ue625꺫眛㿈\u0003쥱釹娤⋲\ueb65돩萄䲈ᔞ\udda7\ua633潊㟂\uf84a샻襼凨ᨒ\ue297ꭡ玎䐖ಇ헮", 14197 - android.widget.ExpandableListView.getPackedPositionGroup(0L), objArr);
            throw new java.lang.IllegalStateException(((java.lang.String) objArr[0]).intern());
        }
        util.h.xy.dh.mi mo26279 = this.getHighSpeedVideoFpsRangesFor.mo26279();
        getInputSizeshNQ4ISI = (getInputFormats + 23) % 128;
        return mo26279;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    public boolean m26327() {
        int i = (getInputFormats + com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
        getInputSizeshNQ4ISI = i;
        int i2 = this.Camera2StreamConfigurationMap;
        if (i2 != 1 && i2 != 3) {
            return false;
        }
        getInputFormats = (i + 115) % 128;
        return true;
    }

    /* renamed from: ι, reason: contains not printable characters */
    public int m26330() {
        int i = getInputFormats;
        int i2 = i + 99;
        getInputSizeshNQ4ISI = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i3 = this.getHighSpeedVideoSizes;
        int i4 = i + 17;
        getInputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 == 0) {
            return i3;
        }
        throw new java.lang.ArithmeticException();
    }

    /* renamed from: ˋ, reason: contains not printable characters */
    public int m26328() {
        int i = getInputFormats;
        getInputSizeshNQ4ISI = (i + 13) % 128;
        int i2 = this.getHighSpeedVideoFpsRanges;
        getInputSizeshNQ4ISI = (i + 87) % 128;
        return i2;
    }

    @Override // util.h.xy.dh.mi, util.h.xy.dh.mh
    public int hashCode() {
        int i;
        int i2 = this.getHighSpeedVideoFpsRanges;
        int i3 = this.getHighSpeedVideoSizes;
        if (m26327()) {
            getInputFormats = (getInputSizeshNQ4ISI + 79) % 128;
            i = 15;
        } else {
            i = com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE;
        }
        int hashCode = this.getHighSpeedVideoFpsRangesFor.mo26279().hashCode();
        int i4 = getInputFormats + 27;
        getInputSizeshNQ4ISI = i4 % 128;
        if (i4 % 2 == 0) {
            return (((i2 * 7919) ^ i3) ^ i) ^ hashCode;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // util.h.xy.dh.mi
    final boolean getHighSpeedVideoFpsRanges(util.h.xy.dh.mi miVar) {
        int i = getInputFormats;
        getInputSizeshNQ4ISI = (i + 23) % 128;
        if (!(miVar instanceof util.h.xy.dh.mm)) {
            getInputSizeshNQ4ISI = (i + 71) % 128;
            return false;
        }
        util.h.xy.dh.mm mmVar = (util.h.xy.dh.mm) miVar;
        if (this.getHighSpeedVideoSizes == mmVar.getHighSpeedVideoSizes) {
            int i2 = i + 45;
            int i3 = i2 % 128;
            getInputSizeshNQ4ISI = i3;
            if (i2 % 2 != 0) {
                int i4 = mmVar.getHighSpeedVideoFpsRanges;
                throw null;
            }
            if (this.getHighSpeedVideoFpsRanges == mmVar.getHighSpeedVideoFpsRanges) {
                if (this.Camera2StreamConfigurationMap != mmVar.Camera2StreamConfigurationMap) {
                    int i5 = i3 + 69;
                    getInputFormats = i5 % 128;
                    boolean m26327 = m26327();
                    if (i5 % 2 == 0) {
                        mmVar.m26327();
                        throw new java.lang.ArithmeticException();
                    }
                    if (m26327 != mmVar.m26327()) {
                        return false;
                    }
                }
                util.h.xy.dh.mi mo26279 = this.getHighSpeedVideoFpsRangesFor.mo26279();
                util.h.xy.dh.mi mo262792 = mmVar.getHighSpeedVideoFpsRangesFor.mo26279();
                if (mo26279 == mo262792) {
                    getInputFormats = (getInputSizeshNQ4ISI + 5) % 128;
                    return true;
                }
                if (m26327()) {
                    return mo26279.getHighSpeedVideoFpsRanges(mo262792);
                }
                try {
                    boolean m26820 = util.h.xy.fb.a.m26820(mo25969(), mmVar.mo25969());
                    getInputSizeshNQ4ISI = (getInputFormats + 67) % 128;
                    return m26820;
                } catch (java.io.IOException unused) {
                    return false;
                }
            }
        }
        return false;
    }

    mm(int i, int i2, int i3, util.h.xy.dh.c cVar) {
        if (cVar == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            getHighSpeedVideoFpsRangesFor("﯁왺聢䉕\u0c0d칹蠷䨢ᐐ혃郷勣Ტ\uded3飉嫻Ⓒ\ue6b0ꂜ抃", 15859 - android.text.TextUtils.indexOf("", ""), objArr);
            throw new java.lang.NullPointerException(((java.lang.String) objArr[0]).intern());
        }
        if (i2 != 0 && (i2 & 192) == i2) {
            this.Camera2StreamConfigurationMap = cVar instanceof util.h.xy.dh.mc ? 1 : i;
            this.getHighSpeedVideoFpsRanges = i2;
            this.getHighSpeedVideoSizes = i3;
            this.getHighSpeedVideoFpsRangesFor = cVar;
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.Object[] objArr2 = new java.lang.Object[1];
        getHighSpeedVideoFpsRangesFor("ﮏ㧿罾볢\uf256㟜畈ꪇ\ue82aⶨ挧ꃛ\ue611ᮁ夅齬\udce5ሻ垘", 49783 - (android.view.ViewConfiguration.getTouchSlop() >> 8), objArr2);
        sb.append(((java.lang.String) objArr2[0]).intern());
        sb.append(i2);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    protected mm(boolean z, int i, int i2, util.h.xy.dh.c cVar) {
        this(z ? 1 : 2, i, i2, cVar);
    }

    protected mm(boolean z, int i, util.h.xy.dh.c cVar) {
        this(z, 128, i, cVar);
    }
}
