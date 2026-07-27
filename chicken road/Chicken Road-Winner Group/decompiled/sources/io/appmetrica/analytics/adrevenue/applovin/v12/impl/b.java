package io.appmetrica.analytics.adrevenue.applovin.v12.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import d2.C0274d;
import e2.AbstractC0290e;
import e2.r;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Currency;

/* loaded from: classes.dex */
public final class b implements ModuleAdRevenueProcessor {

    /* renamed from: a, reason: collision with root package name */
    public final a f5128a;

    /* renamed from: b, reason: collision with root package name */
    public final ClientContext f5129b;

    public b(a aVar, ClientContext clientContext) {
        this.f5128a = aVar;
        this.f5129b = clientContext;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final String getDescription() {
        return "AppLovin";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        String str;
        if (!ReflectionUtils.isArgumentsOfClasses(objArr, MaxAd.class, AppLovinSdk.class)) {
            return false;
        }
        Object V2 = AbstractC0290e.V(0, objArr);
        if (V2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.applovin.mediation.MaxAd");
        }
        MaxAd maxAd = (MaxAd) V2;
        Object V3 = AbstractC0290e.V(1, objArr);
        if (V3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.applovin.sdk.AppLovinSdk");
        }
        AppLovinSdk appLovinSdk = (AppLovinSdk) V3;
        this.f5128a.getClass();
        MaxAdFormat format = maxAd.getFormat();
        ModuleAdType moduleAdType = format == null ? null : format.equals(MaxAdFormat.NATIVE) ? ModuleAdType.NATIVE : format.equals(MaxAdFormat.BANNER) ? ModuleAdType.BANNER : format.equals(MaxAdFormat.REWARDED) ? ModuleAdType.REWARDED : format.equals(MaxAdFormat.INTERSTITIAL) ? ModuleAdType.INTERSTITIAL : format.equals(MaxAdFormat.MREC) ? ModuleAdType.MREC : ModuleAdType.OTHER;
        C0274d c0274d = new C0274d("countryCode", appLovinSdk.getConfiguration().getCountryCode());
        C0274d c0274d2 = new C0274d(AdRevenueConstants.ORIGINAL_SOURCE_KEY, "ad-revenue-applovin-v12");
        MaxAdFormat format2 = maxAd.getFormat();
        if (format2 == null || (str = format2.getLabel()) == null) {
            str = "null";
        }
        this.f5129b.getInternalClientModuleFacade().reportAdRevenue(new ModuleAdRevenue(BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(maxAd.getRevenue(), 0.0d)), Currency.getInstance("USD"), moduleAdType, maxAd.getNetworkName(), maxAd.getAdUnitId(), null, maxAd.getNetworkPlacement(), maxAd.getPlacement(), maxAd.getRevenuePrecision(), r.m0(c0274d, c0274d2, new C0274d(AdRevenueConstants.ORIGINAL_AD_TYPE_KEY, str), new C0274d(AdRevenueConstants.SOURCE_KEY, "applovin")), false, 32, null));
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from AppLovin with values " + Arrays.toString(objArr) + " was reported", new Object[0]);
        return true;
    }
}
