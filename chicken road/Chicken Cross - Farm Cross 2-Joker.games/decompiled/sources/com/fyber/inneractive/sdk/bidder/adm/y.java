package com.fyber.inneractive.sdk.bidder.adm;

import android.text.TextUtils;
import android.util.Base64;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.CreativeType;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.flow.c0;
import com.fyber.inneractive.sdk.network.f1;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class y implements com.fyber.inneractive.sdk.response.j {

    /* renamed from: a, reason: collision with root package name */
    public AdmParametersOuterClass$AdmParameters f5191a;
    public final String b;
    public String c;
    public final String d;

    public y(String str, String str2) {
        this.b = str;
        this.d = str2;
    }

    public final void a(c0 c0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        try {
            AdmParametersOuterClass$AdmParameters parseFrom = AdmParametersOuterClass$AdmParameters.parseFrom(Base64.decode(this.b, 0));
            this.f5191a = parseFrom;
            if (parseFrom != null) {
                c0Var.a();
            }
            b(c0Var, rVar);
        } catch (Exception e) {
            IAlog.f("failed to parse ad markup payload %s", e.getMessage());
            com.fyber.inneractive.sdk.util.r.b.post(new u(c0Var, e));
        }
    }

    public final void b(c0 c0Var, com.fyber.inneractive.sdk.config.global.r rVar) {
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f5191a;
        com.fyber.inneractive.sdk.response.e eVar = null;
        String markupUrl = (admParametersOuterClass$AdmParameters == null || !admParametersOuterClass$AdmParameters.hasMarkupUrl()) ? null : this.f5191a.getMarkupUrl();
        if (TextUtils.isEmpty(markupUrl)) {
            com.fyber.inneractive.sdk.util.r.b.post(new x(c0Var));
            return;
        }
        try {
            AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters2 = this.f5191a;
            int a2 = admParametersOuterClass$AdmParameters2 != null ? admParametersOuterClass$AdmParameters2.getAdType().a() : c.OTHER.a();
            com.fyber.inneractive.sdk.response.a a3 = com.fyber.inneractive.sdk.response.a.a(a2);
            if (a3 == null) {
                a3 = com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_MRAID;
            }
            com.fyber.inneractive.sdk.factories.e eVar2 = (com.fyber.inneractive.sdk.factories.e) com.fyber.inneractive.sdk.factories.d.f5320a.f5321a.get(a3);
            com.fyber.inneractive.sdk.response.b b = eVar2 != null ? eVar2.b() : null;
            if (b != null) {
                b.f5907a = b.a();
                a(b);
                eVar = b.f5907a;
            } else {
                IAlog.a("failed parse adm network request with no input stream - received ad type %s does not have an appropriate parser", Integer.valueOf(a2));
            }
        } catch (Exception e) {
            IAlog.a("failed parse adm network request with no input stream", e, new Object[0]);
        }
        com.fyber.inneractive.sdk.response.e eVar3 = eVar;
        f1 f1Var = new f1(new v(this, c0Var, eVar3), markupUrl, this, rVar, eVar3);
        f1Var.d = new w(this);
        IAConfigManager.R.s.a(f1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0338  */
    @Override // com.fyber.inneractive.sdk.response.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(com.fyber.inneractive.sdk.response.b bVar) {
        String str;
        String str2;
        String str3;
        String str4;
        Integer num;
        String str5;
        String str6;
        int i;
        com.fyber.inneractive.sdk.ignite.m mVar;
        String igniteLauncherActivity;
        Boolean valueOf;
        String brandBidderCtaText;
        Boolean valueOf2;
        int i2;
        int i3;
        String str7;
        bVar.f5907a.A = true;
        IAConfigManager.R.x.f = true;
        ImpressionData impressionData = new ImpressionData();
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f5191a;
        if (admParametersOuterClass$AdmParameters == null) {
            return;
        }
        int a2 = admParametersOuterClass$AdmParameters.getAdType().a();
        if (this.f5191a.hasErrorMessage()) {
            this.f5191a.getErrorMessage();
        }
        String sessionId = this.f5191a.hasSessionId() ? this.f5191a.getSessionId() : null;
        Long valueOf3 = this.f5191a.hasContentId() ? Long.valueOf(this.f5191a.getContentId()) : null;
        if (this.f5191a.hasPublisherId()) {
            this.f5191a.getPublisherId();
        }
        Integer valueOf4 = this.f5191a.hasAdWidth() ? Integer.valueOf(this.f5191a.getAdWidth()) : null;
        Integer valueOf5 = this.f5191a.hasAdHeight() ? Integer.valueOf(this.f5191a.getAdHeight()) : null;
        String sdkImpressionUrl = this.f5191a.hasSdkImpressionUrl() ? this.f5191a.getSdkImpressionUrl() : null;
        String sdkClickUrl = this.f5191a.hasSdkClickUrl() ? this.f5191a.getSdkClickUrl() : null;
        Integer valueOf6 = this.f5191a.hasAdExpirationInterval() ? Integer.valueOf(this.f5191a.getAdExpirationInterval()) : null;
        String adCompletionUrl = this.f5191a.hasAdCompletionUrl() ? this.f5191a.getAdCompletionUrl() : null;
        bVar.b = this.f5191a.hasAdUnitId() ? this.f5191a.getAdUnitId() : null;
        String name = this.f5191a.getAdUnitType().name();
        Locale locale = Locale.US;
        name.toLowerCase(locale);
        String lowerCase = this.f5191a.hasAdUnitId() ? this.f5191a.getAdUnitDisplayType().name().toLowerCase(locale) : null;
        String adNetworkName = this.f5191a.hasAdNetworkName() ? this.f5191a.getAdNetworkName() : null;
        Long valueOf7 = this.f5191a.hasAdNetworkId() ? Long.valueOf(this.f5191a.getAdNetworkId()) : null;
        String creativeId = this.f5191a.hasCreativeId() ? this.f5191a.getCreativeId() : null;
        String adDomain = this.f5191a.hasAdDomain() ? this.f5191a.getAdDomain() : null;
        if (this.f5191a.hasAppBundleId()) {
            str2 = this.f5191a.getAppBundleId();
            str = lowerCase;
        } else {
            str = lowerCase;
            str2 = null;
        }
        String campaignId = this.f5191a.hasCampaignId() ? this.f5191a.getCampaignId() : null;
        if (this.f5191a.hasPricingValue()) {
            str4 = Double.toString(this.f5191a.getPricingValue());
            str3 = adCompletionUrl;
        } else {
            str3 = adCompletionUrl;
            str4 = null;
        }
        String valueOf8 = this.f5191a.hasSpotId() ? String.valueOf(this.f5191a.getSpotId()) : null;
        impressionData.setCpmValue(str4);
        impressionData.setCurrency("USD");
        if (this.f5191a.hasMrcData()) {
            if (this.f5191a.getMrcData().hasPixelPercent()) {
                i2 = this.f5191a.getMrcData().getPixelPercent();
                str6 = sdkClickUrl;
            } else {
                str6 = sdkClickUrl;
                i2 = 0;
            }
            if (this.f5191a.getMrcData().hasPixelDuration()) {
                i3 = this.f5191a.getMrcData().getPixelDuration();
                str5 = sdkImpressionUrl;
            } else {
                str5 = sdkImpressionUrl;
                i3 = -1;
            }
            if (this.f5191a.getMrcData().hasPixelImpressionUrl()) {
                str7 = this.f5191a.getMrcData().getPixelImpressionUrl();
                num = valueOf5;
            } else {
                num = valueOf5;
                str7 = null;
            }
            com.fyber.inneractive.sdk.response.e eVar = bVar.f5907a;
            eVar.s = i2;
            eVar.t = i3;
            eVar.u = str7;
        } else {
            num = valueOf5;
            str5 = sdkImpressionUrl;
            str6 = sdkClickUrl;
        }
        Boolean valueOf9 = this.f5191a.hasSkipMode() ? Boolean.valueOf(this.f5191a.getSkipMode()) : null;
        if (bVar.b()) {
            bVar.f5907a.q = this.f5191a.toString();
        }
        bVar.f5907a.a(valueOf6 != null ? valueOf6.toString() : "");
        impressionData.setImpressionId(sessionId);
        impressionData.setDemandSource(adNetworkName);
        bVar.f5907a.d = valueOf3 != null ? valueOf3.toString() : "";
        bVar.f5907a.getClass();
        bVar.f5907a.getClass();
        com.fyber.inneractive.sdk.response.e eVar2 = bVar.f5907a;
        eVar2.x = str2;
        eVar2.y = this.d;
        eVar2.z = valueOf8;
        if (valueOf7 != null) {
            impressionData.setDemandId(valueOf7);
        }
        com.fyber.inneractive.sdk.response.e eVar3 = bVar.f5907a;
        eVar3.g = a2;
        if (valueOf4 != null) {
            eVar3.e = valueOf4.intValue();
        }
        if (num != null) {
            bVar.f5907a.f = num.intValue();
        }
        com.fyber.inneractive.sdk.response.e eVar4 = bVar.f5907a;
        eVar4.k = str5;
        eVar4.l = str6;
        eVar4.o = str3;
        eVar4.m = bVar.b;
        try {
            eVar4.n = UnitDisplayType.fromValue(str);
        } catch (IllegalArgumentException unused) {
            bVar.f5907a.n = UnitDisplayType.INTERSTITIAL;
        }
        if (!TextUtils.isEmpty(creativeId)) {
            impressionData.setCreativeId(creativeId);
        }
        if (!TextUtils.isEmpty(adDomain)) {
            impressionData.setAdvertiserDomain(adDomain);
        }
        if (!TextUtils.isEmpty(campaignId)) {
            impressionData.setCampaignId(campaignId);
        }
        impressionData.setCountry(com.fyber.inneractive.sdk.util.k.f());
        bVar.f5907a.r = impressionData;
        if (valueOf9 == null) {
            i = -1;
        } else {
            i = valueOf9.booleanValue() ? 1 : 0;
        }
        bVar.f5907a.v = i;
        String igniteInstallUrl = this.f5191a.hasIgniteInstallUrl() ? this.f5191a.getIgniteInstallUrl() : null;
        if (!TextUtils.isEmpty(igniteInstallUrl)) {
            bVar.f5907a.D = igniteInstallUrl;
        }
        com.fyber.inneractive.sdk.response.e eVar5 = bVar.f5907a;
        com.fyber.inneractive.sdk.ignite.m mVar2 = com.fyber.inneractive.sdk.ignite.m.NONE;
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters2 = this.f5191a;
        if (admParametersOuterClass$AdmParameters2 != null) {
            n igniteMode = admParametersOuterClass$AdmParameters2.hasIgniteMode() ? this.f5191a.getIgniteMode() : null;
            if (igniteMode != null && !igniteMode.equals(n.NONE)) {
                mVar = igniteMode.equals(n.SINGLETAP) ? com.fyber.inneractive.sdk.ignite.m.SINGLE_TAP : com.fyber.inneractive.sdk.ignite.m.TRUE_SINGLE_TAP;
                if (mVar == null) {
                    mVar2 = mVar;
                } else {
                    eVar5.getClass();
                }
                eVar5.E = mVar2;
                igniteLauncherActivity = !this.f5191a.hasIgniteLauncherActivity() ? this.f5191a.getIgniteLauncherActivity() : null;
                if (!TextUtils.isEmpty(igniteLauncherActivity)) {
                    bVar.f5907a.F = igniteLauncherActivity;
                }
                valueOf = !this.f5191a.hasBrandBidderDontShowEndcard() ? Boolean.valueOf(this.f5191a.getBrandBidderDontShowEndcard()) : null;
                if (valueOf != null) {
                    bVar.f5907a.B = valueOf.booleanValue() ? "1" : "0";
                }
                brandBidderCtaText = this.f5191a.getBrandBidderCtaText();
                if (!TextUtils.isEmpty(brandBidderCtaText)) {
                    bVar.f5907a.C = brandBidderCtaText;
                }
                valueOf2 = !this.f5191a.hasMraidVideoOMSignal() ? Boolean.valueOf(this.f5191a.getMraidVideoOMSignal()) : null;
                if (valueOf2 != null) {
                    bVar.f5907a.G = valueOf2.booleanValue();
                }
                bVar.f5907a.J = CreativeType.fromValue(this.f5191a.getCreativeType());
                if (this.f5191a.hasSkipDelay()) {
                    com.fyber.inneractive.sdk.response.e eVar6 = bVar.f5907a;
                    double skipDelay = this.f5191a.getSkipDelay();
                    eVar6.getClass();
                    eVar6.L = (int) Math.round(skipDelay);
                }
                if (this.f5191a.hasSkipEndcardDelay()) {
                    return;
                }
                com.fyber.inneractive.sdk.response.e eVar7 = bVar.f5907a;
                double skipEndcardDelay = this.f5191a.getSkipEndcardDelay();
                eVar7.getClass();
                eVar7.K = (int) Math.round(skipEndcardDelay);
                return;
            }
        }
        mVar = mVar2;
        if (mVar == null) {
        }
        eVar5.E = mVar2;
        if (!this.f5191a.hasIgniteLauncherActivity()) {
        }
        if (!TextUtils.isEmpty(igniteLauncherActivity)) {
        }
        if (!this.f5191a.hasBrandBidderDontShowEndcard()) {
        }
        if (valueOf != null) {
        }
        brandBidderCtaText = this.f5191a.getBrandBidderCtaText();
        if (!TextUtils.isEmpty(brandBidderCtaText)) {
        }
        if (!this.f5191a.hasMraidVideoOMSignal()) {
        }
        if (valueOf2 != null) {
        }
        bVar.f5907a.J = CreativeType.fromValue(this.f5191a.getCreativeType());
        if (this.f5191a.hasSkipDelay()) {
        }
        if (this.f5191a.hasSkipEndcardDelay()) {
        }
    }

    @Override // com.fyber.inneractive.sdk.response.j
    public final String a() {
        return this.c;
    }
}
