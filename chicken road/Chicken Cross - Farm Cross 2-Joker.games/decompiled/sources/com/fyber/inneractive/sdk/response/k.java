package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.CreativeType;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.ignite.m;
import com.fyber.inneractive.sdk.network.n;
import com.fyber.inneractive.sdk.network.o;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.v;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
public final class k implements j {

    /* renamed from: a, reason: collision with root package name */
    public final o f5910a;

    public k(o oVar) {
        this.f5910a = oVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0277 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.response.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(b bVar) {
        float parseFloat;
        double parseDouble;
        Long valueOf;
        bVar.f5907a.A = false;
        IAConfigManager.R.x.f = false;
        ImpressionData impressionData = new ImpressionData();
        Map b = this.f5910a.b();
        String a2 = a(b, n.RETURNED_AD_TYPE);
        a(b, n.ERROR_CODE);
        String a3 = a(b, n.SESSION_ID);
        String a4 = a(b, n.CONTENT_ID);
        a(b, n.PUBLISHER_ID);
        String a5 = a(b, n.WIDTH);
        String a6 = a(b, n.HEIGHT);
        String a7 = a(b, n.SDK_IMPRESSION_URL);
        String a8 = a(b, n.SDK_CLICK_URL);
        String a9 = a(b, n.AD_TIMEOUT);
        String a10 = a(b, n.AD_COMPLETION_URL);
        bVar.b = a(b, n.AD_UNIT_ID);
        a(b, n.AD_UNIT_TYPE);
        String a11 = a(b, n.AD_UNIT_DISPLAY_TYPE);
        String a12 = a(b, n.AD_NETWORK);
        String a13 = a(b, n.AD_NETWORK_ID);
        String a14 = a(b, n.CREATIVE_ID);
        String a15 = a(b, n.AD_DOMAIN);
        String a16 = a(b, n.APP_BUNDLE);
        String a17 = a(b, n.CAMPAIGN_ID);
        String a18 = a(b, n.CPM_VALUE);
        String a19 = a(b, n.CPM_CURRENCY);
        impressionData.setCpmValue(a18);
        impressionData.setCurrency(a19);
        String a20 = a(b, n.BANNER_MRC_PERCENT);
        String a21 = a(b, n.BANNER_MRC_DURATION);
        String a22 = a(b, n.BANNER_MRC_IMPRESSION_URL);
        String a23 = a(b, n.INTERSTITIAL_SKIP_MODE);
        String a24 = a(b, n.IGNITE_INSTALL_URL);
        String a25 = a(b, n.IGNITE_MODE);
        String a26 = a(b, n.APP_BUNDLE_LAUNCHER);
        String a27 = a(b, n.BRAND_BIDDER_SHOW_ENDCARD);
        String a28 = a(b, n.BRAND_BIDDER_CTA_TEXT);
        String a29 = a(b, n.MRAID_VIDEO_SIGNAL);
        String a30 = a(b, n.CREATIVE_TYPE);
        String a31 = a(b, n.SKIP_DELAY);
        String a32 = a(b, n.SKIP_ENDCARD_DELAY);
        if (bVar.b()) {
            bVar.f5907a.p = b;
        }
        bVar.f5907a.a(a9);
        impressionData.setImpressionId(a3);
        impressionData.setDemandSource(a12);
        e eVar = bVar.f5907a;
        eVar.d = a4;
        eVar.getClass();
        bVar.f5907a.x = a16;
        if (!TextUtils.isEmpty(a13)) {
            if (!TextUtils.isEmpty(a13)) {
                try {
                    valueOf = Long.valueOf(a13);
                } catch (NumberFormatException unused) {
                }
                impressionData.setDemandId(valueOf);
            }
            valueOf = null;
            impressionData.setDemandId(valueOf);
        }
        if (!TextUtils.isEmpty(a2)) {
            bVar.f5907a.g = Integer.valueOf(a2).intValue();
        }
        if (!TextUtils.isEmpty(a5)) {
            bVar.f5907a.e = Integer.valueOf(a5).intValue();
        }
        if (!TextUtils.isEmpty(a6)) {
            bVar.f5907a.f = Integer.valueOf(a6).intValue();
        }
        e eVar2 = bVar.f5907a;
        eVar2.k = a7;
        eVar2.l = a8;
        eVar2.o = a10;
        eVar2.m = bVar.b;
        try {
            eVar2.n = UnitDisplayType.fromValue(a11);
        } catch (IllegalArgumentException unused2) {
            bVar.f5907a.n = UnitDisplayType.INTERSTITIAL;
        }
        if (!TextUtils.isEmpty(a14)) {
            impressionData.setCreativeId(a14);
        }
        if (!TextUtils.isEmpty(a15)) {
            impressionData.setAdvertiserDomain(a15);
        }
        if (!TextUtils.isEmpty(a17)) {
            impressionData.setCampaignId(a17);
        }
        impressionData.setCountry(com.fyber.inneractive.sdk.util.k.f());
        e eVar3 = bVar.f5907a;
        eVar3.r = impressionData;
        eVar3.s = v.a(a20, 0);
        e eVar4 = bVar.f5907a;
        if (!TextUtils.isEmpty(a21)) {
            try {
                parseFloat = Float.parseFloat(a21);
            } catch (NumberFormatException unused3) {
            }
            eVar4.t = parseFloat;
            e eVar5 = bVar.f5907a;
            eVar5.u = a22;
            eVar5.v = v.a(a23, -1);
            if (!TextUtils.isEmpty(a24)) {
                bVar.f5907a.D = a24;
            }
            if (!TextUtils.isEmpty(a25)) {
                e eVar6 = bVar.f5907a;
                m a33 = m.a(a25);
                if (a33 == null) {
                    eVar6.getClass();
                    a33 = m.NONE;
                }
                eVar6.E = a33;
            }
            if (!TextUtils.isEmpty(a26)) {
                bVar.f5907a.F = a26;
            }
            if (!TextUtils.isEmpty(a27)) {
                bVar.f5907a.B = a27;
            }
            if (!TextUtils.isEmpty(a28)) {
                bVar.f5907a.C = a28;
            }
            bVar.f5907a.G = !"1".equals(a29) || Boolean.parseBoolean(a29);
            bVar.f5907a.J = CreativeType.fromValue(a30);
            e eVar7 = bVar.f5907a;
            double d = -1.0d;
            if (!TextUtils.isEmpty(a31)) {
                try {
                    parseDouble = Double.parseDouble(a31);
                } catch (NumberFormatException unused4) {
                }
                eVar7.getClass();
                eVar7.L = (int) Math.round(parseDouble);
                e eVar8 = bVar.f5907a;
                if (!TextUtils.isEmpty(a32)) {
                    try {
                        d = Double.parseDouble(a32);
                    } catch (NumberFormatException unused5) {
                    }
                }
                eVar8.getClass();
                eVar8.K = (int) Math.round(d);
            }
            parseDouble = -1.0d;
            eVar7.getClass();
            eVar7.L = (int) Math.round(parseDouble);
            e eVar82 = bVar.f5907a;
            if (!TextUtils.isEmpty(a32)) {
            }
            eVar82.getClass();
            eVar82.K = (int) Math.round(d);
        }
        parseFloat = -1.0f;
        eVar4.t = parseFloat;
        e eVar52 = bVar.f5907a;
        eVar52.u = a22;
        eVar52.v = v.a(a23, -1);
        if (!TextUtils.isEmpty(a24)) {
        }
        if (!TextUtils.isEmpty(a25)) {
        }
        if (!TextUtils.isEmpty(a26)) {
        }
        if (!TextUtils.isEmpty(a27)) {
        }
        if (!TextUtils.isEmpty(a28)) {
        }
        bVar.f5907a.G = !"1".equals(a29) || Boolean.parseBoolean(a29);
        bVar.f5907a.J = CreativeType.fromValue(a30);
        e eVar72 = bVar.f5907a;
        double d2 = -1.0d;
        if (!TextUtils.isEmpty(a31)) {
        }
        parseDouble = -1.0d;
        eVar72.getClass();
        eVar72.L = (int) Math.round(parseDouble);
        e eVar822 = bVar.f5907a;
        if (!TextUtils.isEmpty(a32)) {
        }
        eVar822.getClass();
        eVar822.K = (int) Math.round(d2);
    }

    @Override // com.fyber.inneractive.sdk.response.j
    public final String a() {
        return this.f5910a.a().toString();
    }

    public final String a(Map map, n nVar) {
        String lowerCase = nVar.a().toLowerCase(Locale.US);
        String str = (String) map.get(lowerCase);
        IAlog.e("%s%s extracted from response header: %s", IAlog.a(this), lowerCase, str);
        IAlog.d("%s %s : %s", "RESPONSE_HEADER", lowerCase, str);
        return str;
    }
}
