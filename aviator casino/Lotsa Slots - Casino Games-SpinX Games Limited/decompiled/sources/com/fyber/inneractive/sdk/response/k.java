package com.fyber.inneractive.sdk.response;

/* loaded from: classes3.dex */
public final class k implements com.fyber.inneractive.sdk.response.j {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.network.o f4253a;

    public k(com.fyber.inneractive.sdk.network.o oVar) {
        this.f4253a = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x021f  */
    @Override // com.fyber.inneractive.sdk.response.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.fyber.inneractive.sdk.response.b bVar) {
        float parseFloat;
        java.lang.Long valueOf;
        bVar.f4250a.A = false;
        com.fyber.inneractive.sdk.config.IAConfigManager.N.w.f = false;
        com.fyber.inneractive.sdk.external.ImpressionData impressionData = new com.fyber.inneractive.sdk.external.ImpressionData();
        java.util.Map b = this.f4253a.b();
        java.lang.String a2 = a(b, com.fyber.inneractive.sdk.network.n.RETURNED_AD_TYPE);
        a(b, com.fyber.inneractive.sdk.network.n.ERROR_CODE);
        java.lang.String a3 = a(b, com.fyber.inneractive.sdk.network.n.SESSION_ID);
        java.lang.String a4 = a(b, com.fyber.inneractive.sdk.network.n.CONTENT_ID);
        a(b, com.fyber.inneractive.sdk.network.n.PUBLISHER_ID);
        java.lang.String a5 = a(b, com.fyber.inneractive.sdk.network.n.WIDTH);
        java.lang.String a6 = a(b, com.fyber.inneractive.sdk.network.n.HEIGHT);
        java.lang.String a7 = a(b, com.fyber.inneractive.sdk.network.n.SDK_IMPRESSION_URL);
        java.lang.String a8 = a(b, com.fyber.inneractive.sdk.network.n.SDK_CLICK_URL);
        java.lang.String a9 = a(b, com.fyber.inneractive.sdk.network.n.AD_TIMEOUT);
        java.lang.String a10 = a(b, com.fyber.inneractive.sdk.network.n.AD_COMPLETION_URL);
        bVar.b = a(b, com.fyber.inneractive.sdk.network.n.AD_UNIT_ID);
        a(b, com.fyber.inneractive.sdk.network.n.AD_UNIT_TYPE);
        java.lang.String a11 = a(b, com.fyber.inneractive.sdk.network.n.AD_UNIT_DISPLAY_TYPE);
        java.lang.String a12 = a(b, com.fyber.inneractive.sdk.network.n.AD_NETWORK);
        java.lang.String a13 = a(b, com.fyber.inneractive.sdk.network.n.AD_NETWORK_ID);
        java.lang.String a14 = a(b, com.fyber.inneractive.sdk.network.n.CREATIVE_ID);
        java.lang.String a15 = a(b, com.fyber.inneractive.sdk.network.n.AD_DOMAIN);
        java.lang.String a16 = a(b, com.fyber.inneractive.sdk.network.n.APP_BUNDLE);
        java.lang.String a17 = a(b, com.fyber.inneractive.sdk.network.n.CAMPAIGN_ID);
        java.lang.String a18 = a(b, com.fyber.inneractive.sdk.network.n.CPM_VALUE);
        java.lang.String a19 = a(b, com.fyber.inneractive.sdk.network.n.CPM_CURRENCY);
        impressionData.setCpmValue(a18);
        impressionData.setCurrency(a19);
        java.lang.String a20 = a(b, com.fyber.inneractive.sdk.network.n.BANNER_MRC_PERCENT);
        java.lang.String a21 = a(b, com.fyber.inneractive.sdk.network.n.BANNER_MRC_DURATION);
        java.lang.String a22 = a(b, com.fyber.inneractive.sdk.network.n.BANNER_MRC_IMPRESSION_URL);
        java.lang.String a23 = a(b, com.fyber.inneractive.sdk.network.n.INTERSTITIAL_SKIP_MODE);
        java.lang.String a24 = a(b, com.fyber.inneractive.sdk.network.n.IGNITE_INSTALL_URL);
        java.lang.String a25 = a(b, com.fyber.inneractive.sdk.network.n.IGNITE_MODE);
        java.lang.String a26 = a(b, com.fyber.inneractive.sdk.network.n.APP_BUNDLE_LAUNCHER);
        java.lang.String a27 = a(b, com.fyber.inneractive.sdk.network.n.BRAND_BIDDER_SHOW_ENDCARD);
        java.lang.String a28 = a(b, com.fyber.inneractive.sdk.network.n.BRAND_BIDDER_CTA_TEXT);
        java.lang.String a29 = a(b, com.fyber.inneractive.sdk.network.n.MRAID_VIDEO_SIGNAL);
        java.lang.String a30 = a(b, com.fyber.inneractive.sdk.network.n.CREATIVE_TYPE);
        if (bVar.b()) {
            bVar.f4250a.p = b;
        }
        bVar.f4250a.a(a9);
        impressionData.setImpressionId(a3);
        impressionData.setDemandSource(a12);
        com.fyber.inneractive.sdk.response.e eVar = bVar.f4250a;
        eVar.d = a4;
        eVar.getClass();
        bVar.f4250a.x = a16;
        if (!android.text.TextUtils.isEmpty(a13)) {
            if (!android.text.TextUtils.isEmpty(a13)) {
                try {
                    valueOf = java.lang.Long.valueOf(a13);
                } catch (java.lang.NumberFormatException unused) {
                }
                impressionData.setDemandId(valueOf);
            }
            valueOf = null;
            impressionData.setDemandId(valueOf);
        }
        if (!android.text.TextUtils.isEmpty(a2)) {
            bVar.f4250a.g = java.lang.Integer.valueOf(a2).intValue();
        }
        if (!android.text.TextUtils.isEmpty(a5)) {
            bVar.f4250a.e = java.lang.Integer.valueOf(a5).intValue();
        }
        if (!android.text.TextUtils.isEmpty(a6)) {
            bVar.f4250a.f = java.lang.Integer.valueOf(a6).intValue();
        }
        com.fyber.inneractive.sdk.response.e eVar2 = bVar.f4250a;
        eVar2.k = a7;
        eVar2.l = a8;
        eVar2.o = a10;
        eVar2.m = bVar.b;
        try {
            eVar2.n = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.fromValue(a11);
        } catch (java.lang.IllegalArgumentException unused2) {
            bVar.f4250a.n = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL;
        }
        if (!android.text.TextUtils.isEmpty(a14)) {
            impressionData.setCreativeId(a14);
        }
        if (!android.text.TextUtils.isEmpty(a15)) {
            impressionData.setAdvertiserDomain(a15);
        }
        if (!android.text.TextUtils.isEmpty(a17)) {
            impressionData.setCampaignId(a17);
        }
        impressionData.setCountry(com.fyber.inneractive.sdk.util.k.i());
        com.fyber.inneractive.sdk.response.e eVar3 = bVar.f4250a;
        eVar3.r = impressionData;
        eVar3.s = com.fyber.inneractive.sdk.util.v.a(a20, 0);
        com.fyber.inneractive.sdk.response.e eVar4 = bVar.f4250a;
        if (!android.text.TextUtils.isEmpty(a21)) {
            try {
                parseFloat = java.lang.Float.parseFloat(a21);
            } catch (java.lang.NumberFormatException unused3) {
            }
            eVar4.t = parseFloat;
            com.fyber.inneractive.sdk.response.e eVar5 = bVar.f4250a;
            eVar5.u = a22;
            eVar5.v = com.fyber.inneractive.sdk.util.v.a(a23, -1);
            if (!android.text.TextUtils.isEmpty(a24)) {
                bVar.f4250a.D = a24;
            }
            if (!android.text.TextUtils.isEmpty(a25)) {
                com.fyber.inneractive.sdk.response.e eVar6 = bVar.f4250a;
                com.fyber.inneractive.sdk.ignite.m a31 = com.fyber.inneractive.sdk.ignite.m.a(a25);
                if (a31 == null) {
                    eVar6.getClass();
                    a31 = com.fyber.inneractive.sdk.ignite.m.NONE;
                }
                eVar6.E = a31;
            }
            if (!android.text.TextUtils.isEmpty(a26)) {
                bVar.f4250a.F = a26;
            }
            if (!android.text.TextUtils.isEmpty(a27)) {
                bVar.f4250a.B = a27;
            }
            if (!android.text.TextUtils.isEmpty(a28)) {
                bVar.f4250a.C = a28;
            }
            bVar.f4250a.G = !"1".equals(a29) || java.lang.Boolean.parseBoolean(a29);
            bVar.f4250a.J = com.fyber.inneractive.sdk.config.enums.CreativeType.fromValue(a30);
        }
        parseFloat = -1.0f;
        eVar4.t = parseFloat;
        com.fyber.inneractive.sdk.response.e eVar52 = bVar.f4250a;
        eVar52.u = a22;
        eVar52.v = com.fyber.inneractive.sdk.util.v.a(a23, -1);
        if (!android.text.TextUtils.isEmpty(a24)) {
        }
        if (!android.text.TextUtils.isEmpty(a25)) {
        }
        if (!android.text.TextUtils.isEmpty(a26)) {
        }
        if (!android.text.TextUtils.isEmpty(a27)) {
        }
        if (!android.text.TextUtils.isEmpty(a28)) {
        }
        bVar.f4250a.G = !"1".equals(a29) || java.lang.Boolean.parseBoolean(a29);
        bVar.f4250a.J = com.fyber.inneractive.sdk.config.enums.CreativeType.fromValue(a30);
    }

    @Override // com.fyber.inneractive.sdk.response.j
    public final java.lang.String a() {
        return this.f4253a.a().toString();
    }

    public final java.lang.String a(java.util.Map map, com.fyber.inneractive.sdk.network.n nVar) {
        java.lang.String lowerCase = nVar.a().toLowerCase(java.util.Locale.US);
        java.lang.String str = (java.lang.String) map.get(lowerCase);
        com.fyber.inneractive.sdk.util.IAlog.e("%s%s extracted from response header: %s", com.fyber.inneractive.sdk.util.IAlog.a(this), lowerCase, str);
        com.fyber.inneractive.sdk.util.IAlog.d("%s %s : %s", "RESPONSE_HEADER", lowerCase, str);
        return str;
    }
}
