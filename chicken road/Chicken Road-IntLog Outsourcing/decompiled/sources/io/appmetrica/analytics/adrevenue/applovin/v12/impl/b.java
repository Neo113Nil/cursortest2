package io.appmetrica.analytics.adrevenue.applovin.v12.impl;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinSdk;
import com.yandex.varioqub.config.model.ConfigValue;
import f4.C0430g;
import g4.AbstractC0464i;
import g4.AbstractC0476u;
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
import kotlin.jvm.internal.i;
import n2.AbstractC1341c;

/* loaded from: classes.dex */
public final class b implements ModuleAdRevenueProcessor {

    /* renamed from: a, reason: collision with root package name */
    public final a f5933a;

    /* renamed from: b, reason: collision with root package name */
    public final ClientContext f5934b;

    public b(a aVar, ClientContext clientContext) {
        this.f5933a = aVar;
        this.f5934b = clientContext;
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
        Object U2 = AbstractC0464i.U(0, objArr);
        if (U2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.applovin.mediation.MaxAd");
        }
        MaxAd maxAd = (MaxAd) U2;
        Object U5 = AbstractC0464i.U(1, objArr);
        if (U5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.applovin.sdk.AppLovinSdk");
        }
        AppLovinSdk appLovinSdk = (AppLovinSdk) U5;
        this.f5933a.getClass();
        MaxAdFormat format = maxAd.getFormat();
        ModuleAdType moduleAdType = format == null ? null : i.a(format, MaxAdFormat.NATIVE) ? ModuleAdType.NATIVE : i.a(format, MaxAdFormat.BANNER) ? ModuleAdType.BANNER : i.a(format, MaxAdFormat.REWARDED) ? ModuleAdType.REWARDED : i.a(format, MaxAdFormat.INTERSTITIAL) ? ModuleAdType.INTERSTITIAL : i.a(format, MaxAdFormat.MREC) ? ModuleAdType.MREC : ModuleAdType.OTHER;
        C0430g G5 = AbstractC1341c.G("countryCode", appLovinSdk.getConfiguration().getCountryCode());
        C0430g G6 = AbstractC1341c.G(AdRevenueConstants.ORIGINAL_SOURCE_KEY, "ad-revenue-applovin-v12");
        MaxAdFormat format2 = maxAd.getFormat();
        if (format2 == null || (str = format2.getLabel()) == null) {
            str = "null";
        }
        this.f5934b.getInternalClientModuleFacade().reportAdRevenue(new ModuleAdRevenue(BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(maxAd.getRevenue(), ConfigValue.DOUBLE_DEFAULT_VALUE)), Currency.getInstance("USD"), moduleAdType, maxAd.getNetworkName(), maxAd.getAdUnitId(), null, maxAd.getNetworkPlacement(), maxAd.getPlacement(), maxAd.getRevenuePrecision(), AbstractC0476u.Y(G5, G6, AbstractC1341c.G(AdRevenueConstants.ORIGINAL_AD_TYPE_KEY, str), AbstractC1341c.G(AdRevenueConstants.SOURCE_KEY, "applovin")), false, 32, null));
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from AppLovin with values " + Arrays.toString(objArr) + " was reported", new Object[0]);
        return true;
    }
}
