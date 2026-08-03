package com.fyber.inneractive.sdk.bidder.adm;

/* loaded from: classes3.dex */
public final class y implements com.fyber.inneractive.sdk.response.j {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters f3542a;
    public final java.lang.String b;
    public java.lang.String c;
    public final java.lang.String d;

    public y(java.lang.String str, java.lang.String str2) {
        this.b = str;
        this.d = str2;
    }

    public final void a(com.fyber.inneractive.sdk.flow.c0 c0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        try {
            com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters parseFrom = com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters.parseFrom(android.util.Base64.decode(this.b, 0));
            this.f3542a = parseFrom;
            if (parseFrom != null) {
                c0Var.a();
            }
            b(c0Var, rVar);
        } catch (java.lang.Exception e) {
            com.fyber.inneractive.sdk.util.IAlog.f("failed to parse ad markup payload %s", e.getMessage());
            com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.bidder.adm.u(c0Var, e));
        }
    }

    public final void b(com.fyber.inneractive.sdk.flow.c0 c0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f3542a;
        com.fyber.inneractive.sdk.response.e eVar = null;
        java.lang.String markupUrl = (admParametersOuterClass$AdmParameters == null || !admParametersOuterClass$AdmParameters.hasMarkupUrl()) ? null : this.f3542a.getMarkupUrl();
        if (android.text.TextUtils.isEmpty(markupUrl)) {
            com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.bidder.adm.x(c0Var));
            return;
        }
        try {
            com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters2 = this.f3542a;
            int a2 = admParametersOuterClass$AdmParameters2 != null ? admParametersOuterClass$AdmParameters2.getAdType().a() : com.fyber.inneractive.sdk.bidder.adm.c.OTHER.a();
            com.fyber.inneractive.sdk.response.a a3 = com.fyber.inneractive.sdk.response.a.a(a2);
            if (a3 == null) {
                a3 = com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_MRAID;
            }
            com.fyber.inneractive.sdk.factories.e eVar2 = (com.fyber.inneractive.sdk.factories.e) com.fyber.inneractive.sdk.factories.d.f3667a.f3668a.get(a3);
            com.fyber.inneractive.sdk.response.b b = eVar2 != null ? eVar2.b() : null;
            if (b != null) {
                b.f4250a = b.a();
                a(b);
                eVar = b.f4250a;
            } else {
                com.fyber.inneractive.sdk.util.IAlog.a("failed parse adm network request with no input stream - received ad type %s does not have an appropriate parser", java.lang.Integer.valueOf(a2));
            }
        } catch (java.lang.Exception e) {
            com.fyber.inneractive.sdk.util.IAlog.a("failed parse adm network request with no input stream", e, new java.lang.Object[0]);
        }
        com.fyber.inneractive.sdk.response.e eVar3 = eVar;
        com.fyber.inneractive.sdk.network.f1 f1Var = new com.fyber.inneractive.sdk.network.f1(new com.fyber.inneractive.sdk.bidder.adm.v(this, c0Var, eVar3), markupUrl, this, rVar, eVar3);
        f1Var.d = new com.fyber.inneractive.sdk.bidder.adm.w(this);
        com.fyber.inneractive.sdk.config.IAConfigManager.N.r.a(f1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0334  */
    @Override // com.fyber.inneractive.sdk.response.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.fyber.inneractive.sdk.response.b bVar) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.Integer num;
        java.lang.String str5;
        java.lang.String str6;
        int i;
        com.fyber.inneractive.sdk.ignite.m mVar;
        java.lang.String igniteLauncherActivity;
        java.lang.Boolean valueOf;
        java.lang.String brandBidderCtaText;
        java.lang.Boolean valueOf2;
        int i2;
        int i3;
        java.lang.String str7;
        bVar.f4250a.A = true;
        com.fyber.inneractive.sdk.config.IAConfigManager.N.w.f = true;
        com.fyber.inneractive.sdk.external.ImpressionData impressionData = new com.fyber.inneractive.sdk.external.ImpressionData();
        com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f3542a;
        if (admParametersOuterClass$AdmParameters == null) {
            return;
        }
        int a2 = admParametersOuterClass$AdmParameters.getAdType().a();
        if (this.f3542a.hasErrorMessage()) {
            this.f3542a.getErrorMessage();
        }
        java.lang.String sessionId = this.f3542a.hasSessionId() ? this.f3542a.getSessionId() : null;
        java.lang.Long valueOf3 = this.f3542a.hasContentId() ? java.lang.Long.valueOf(this.f3542a.getContentId()) : null;
        if (this.f3542a.hasPublisherId()) {
            this.f3542a.getPublisherId();
        }
        java.lang.Integer valueOf4 = this.f3542a.hasAdWidth() ? java.lang.Integer.valueOf(this.f3542a.getAdWidth()) : null;
        java.lang.Integer valueOf5 = this.f3542a.hasAdHeight() ? java.lang.Integer.valueOf(this.f3542a.getAdHeight()) : null;
        java.lang.String sdkImpressionUrl = this.f3542a.hasSdkImpressionUrl() ? this.f3542a.getSdkImpressionUrl() : null;
        java.lang.String sdkClickUrl = this.f3542a.hasSdkClickUrl() ? this.f3542a.getSdkClickUrl() : null;
        java.lang.Integer valueOf6 = this.f3542a.hasAdExpirationInterval() ? java.lang.Integer.valueOf(this.f3542a.getAdExpirationInterval()) : null;
        java.lang.String adCompletionUrl = this.f3542a.hasAdCompletionUrl() ? this.f3542a.getAdCompletionUrl() : null;
        bVar.b = this.f3542a.hasAdUnitId() ? this.f3542a.getAdUnitId() : null;
        java.lang.String name = this.f3542a.getAdUnitType().name();
        java.util.Locale locale = java.util.Locale.US;
        name.toLowerCase(locale);
        java.lang.String lowerCase = this.f3542a.hasAdUnitId() ? this.f3542a.getAdUnitDisplayType().name().toLowerCase(locale) : null;
        java.lang.String adNetworkName = this.f3542a.hasAdNetworkName() ? this.f3542a.getAdNetworkName() : null;
        java.lang.Long valueOf7 = this.f3542a.hasAdNetworkId() ? java.lang.Long.valueOf(this.f3542a.getAdNetworkId()) : null;
        java.lang.String creativeId = this.f3542a.hasCreativeId() ? this.f3542a.getCreativeId() : null;
        java.lang.String adDomain = this.f3542a.hasAdDomain() ? this.f3542a.getAdDomain() : null;
        if (this.f3542a.hasAppBundleId()) {
            str2 = this.f3542a.getAppBundleId();
            str = lowerCase;
        } else {
            str = lowerCase;
            str2 = null;
        }
        java.lang.String campaignId = this.f3542a.hasCampaignId() ? this.f3542a.getCampaignId() : null;
        if (this.f3542a.hasPricingValue()) {
            str4 = java.lang.Double.toString(this.f3542a.getPricingValue());
            str3 = adCompletionUrl;
        } else {
            str3 = adCompletionUrl;
            str4 = null;
        }
        java.lang.String valueOf8 = this.f3542a.hasSpotId() ? java.lang.String.valueOf(this.f3542a.getSpotId()) : null;
        impressionData.setCpmValue(str4);
        impressionData.setCurrency("USD");
        if (this.f3542a.hasMrcData()) {
            if (this.f3542a.getMrcData().hasPixelPercent()) {
                i2 = this.f3542a.getMrcData().getPixelPercent();
                str6 = sdkClickUrl;
            } else {
                str6 = sdkClickUrl;
                i2 = 0;
            }
            if (this.f3542a.getMrcData().hasPixelDuration()) {
                i3 = this.f3542a.getMrcData().getPixelDuration();
                str5 = sdkImpressionUrl;
            } else {
                str5 = sdkImpressionUrl;
                i3 = -1;
            }
            if (this.f3542a.getMrcData().hasPixelImpressionUrl()) {
                str7 = this.f3542a.getMrcData().getPixelImpressionUrl();
                num = valueOf5;
            } else {
                num = valueOf5;
                str7 = null;
            }
            com.fyber.inneractive.sdk.response.e eVar = bVar.f4250a;
            eVar.s = i2;
            eVar.t = i3;
            eVar.u = str7;
        } else {
            num = valueOf5;
            str5 = sdkImpressionUrl;
            str6 = sdkClickUrl;
        }
        java.lang.Boolean valueOf9 = this.f3542a.hasSkipMode() ? java.lang.Boolean.valueOf(this.f3542a.getSkipMode()) : null;
        if (bVar.b()) {
            bVar.f4250a.q = this.f3542a.toString();
        }
        bVar.f4250a.a(valueOf6 != null ? valueOf6.toString() : "");
        impressionData.setImpressionId(sessionId);
        impressionData.setDemandSource(adNetworkName);
        bVar.f4250a.d = valueOf3 != null ? valueOf3.toString() : "";
        bVar.f4250a.getClass();
        bVar.f4250a.getClass();
        com.fyber.inneractive.sdk.response.e eVar2 = bVar.f4250a;
        eVar2.x = str2;
        eVar2.y = this.d;
        eVar2.z = valueOf8;
        if (valueOf7 != null) {
            impressionData.setDemandId(valueOf7);
        }
        com.fyber.inneractive.sdk.response.e eVar3 = bVar.f4250a;
        eVar3.g = a2;
        if (valueOf4 != null) {
            eVar3.e = valueOf4.intValue();
        }
        if (num != null) {
            bVar.f4250a.f = num.intValue();
        }
        com.fyber.inneractive.sdk.response.e eVar4 = bVar.f4250a;
        eVar4.k = str5;
        eVar4.l = str6;
        eVar4.o = str3;
        eVar4.m = bVar.b;
        try {
            eVar4.n = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.fromValue(str);
        } catch (java.lang.IllegalArgumentException unused) {
            bVar.f4250a.n = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL;
        }
        if (!android.text.TextUtils.isEmpty(creativeId)) {
            impressionData.setCreativeId(creativeId);
        }
        if (!android.text.TextUtils.isEmpty(adDomain)) {
            impressionData.setAdvertiserDomain(adDomain);
        }
        if (!android.text.TextUtils.isEmpty(campaignId)) {
            impressionData.setCampaignId(campaignId);
        }
        impressionData.setCountry(com.fyber.inneractive.sdk.util.k.i());
        bVar.f4250a.r = impressionData;
        if (valueOf9 == null) {
            i = -1;
        } else {
            i = valueOf9.booleanValue() ? 1 : 0;
        }
        bVar.f4250a.v = i;
        java.lang.String igniteInstallUrl = this.f3542a.hasIgniteInstallUrl() ? this.f3542a.getIgniteInstallUrl() : null;
        if (!android.text.TextUtils.isEmpty(igniteInstallUrl)) {
            bVar.f4250a.D = igniteInstallUrl;
        }
        com.fyber.inneractive.sdk.response.e eVar5 = bVar.f4250a;
        com.fyber.inneractive.sdk.ignite.m mVar2 = com.fyber.inneractive.sdk.ignite.m.NONE;
        com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters2 = this.f3542a;
        if (admParametersOuterClass$AdmParameters2 != null) {
            com.fyber.inneractive.sdk.bidder.adm.n igniteMode = admParametersOuterClass$AdmParameters2.hasIgniteMode() ? this.f3542a.getIgniteMode() : null;
            if (igniteMode != null && !igniteMode.equals(com.fyber.inneractive.sdk.bidder.adm.n.NONE)) {
                mVar = igniteMode.equals(com.fyber.inneractive.sdk.bidder.adm.n.SINGLETAP) ? com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP;
                if (mVar == null) {
                    mVar2 = mVar;
                } else {
                    eVar5.getClass();
                }
                eVar5.E = mVar2;
                igniteLauncherActivity = !this.f3542a.hasIgniteLauncherActivity() ? this.f3542a.getIgniteLauncherActivity() : null;
                if (!android.text.TextUtils.isEmpty(igniteLauncherActivity)) {
                    bVar.f4250a.F = igniteLauncherActivity;
                }
                valueOf = !this.f3542a.hasBrandBidderDontShowEndcard() ? java.lang.Boolean.valueOf(this.f3542a.getBrandBidderDontShowEndcard()) : null;
                if (valueOf != null) {
                    bVar.f4250a.B = valueOf.booleanValue() ? "1" : "0";
                }
                brandBidderCtaText = this.f3542a.getBrandBidderCtaText();
                if (!android.text.TextUtils.isEmpty(brandBidderCtaText)) {
                    bVar.f4250a.C = brandBidderCtaText;
                }
                valueOf2 = !this.f3542a.hasMraidVideoOMSignal() ? java.lang.Boolean.valueOf(this.f3542a.getMraidVideoOMSignal()) : null;
                if (valueOf2 != null) {
                    bVar.f4250a.G = valueOf2.booleanValue();
                }
                bVar.f4250a.J = com.fyber.inneractive.sdk.config.enums.CreativeType.fromValue(this.f3542a.getCreativeType());
            }
        }
        mVar = mVar2;
        if (mVar == null) {
        }
        eVar5.E = mVar2;
        if (!this.f3542a.hasIgniteLauncherActivity()) {
        }
        if (!android.text.TextUtils.isEmpty(igniteLauncherActivity)) {
        }
        if (!this.f3542a.hasBrandBidderDontShowEndcard()) {
        }
        if (valueOf != null) {
        }
        brandBidderCtaText = this.f3542a.getBrandBidderCtaText();
        if (!android.text.TextUtils.isEmpty(brandBidderCtaText)) {
        }
        if (!this.f3542a.hasMraidVideoOMSignal()) {
        }
        if (valueOf2 != null) {
        }
        bVar.f4250a.J = com.fyber.inneractive.sdk.config.enums.CreativeType.fromValue(this.f3542a.getCreativeType());
    }

    @Override // com.fyber.inneractive.sdk.response.j
    public final java.lang.String a() {
        return this.c;
    }
}
