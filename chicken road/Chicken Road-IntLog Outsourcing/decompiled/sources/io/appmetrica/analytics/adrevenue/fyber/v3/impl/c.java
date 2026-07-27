package io.appmetrica.analytics.adrevenue.fyber.v3.impl;

import com.fyber.fairbid.ads.ImpressionData;
import com.fyber.fairbid.ads.PlacementType;
import com.yandex.varioqub.config.model.ConfigValue;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenue;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdType;
import io.appmetrica.analytics.modulesapi.internal.common.InternalClientModuleFacade;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c implements ModuleAdRevenueProcessor {

    /* renamed from: a, reason: collision with root package name */
    public final b f5937a;

    /* renamed from: b, reason: collision with root package name */
    public final ClientContext f5938b;

    public c(b bVar, ClientContext clientContext) {
        this.f5937a = bVar;
        this.f5938b = clientContext;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final String getDescription() {
        return "Fyber";
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(Object... objArr) {
        ModuleAdType moduleAdType;
        if (!ReflectionUtils.isArgumentsOfClasses(objArr, ImpressionData.class)) {
            return false;
        }
        ImpressionData impressionData = (ImpressionData) objArr[0];
        InternalClientModuleFacade internalClientModuleFacade = this.f5938b.getInternalClientModuleFacade();
        this.f5937a.getClass();
        PlacementType placementType = impressionData.getPlacementType();
        BigDecimal valueOf = BigDecimal.valueOf(WrapUtils.getFiniteDoubleOrDefault(impressionData.getNetPayout(), ConfigValue.DOUBLE_DEFAULT_VALUE));
        Currency currency = Currency.getInstance(impressionData.getCurrency());
        if (placementType == null) {
            moduleAdType = null;
        } else {
            int i2 = a.f5936a[placementType.ordinal()];
            moduleAdType = i2 != 1 ? i2 != 2 ? i2 != 3 ? ModuleAdType.OTHER : ModuleAdType.INTERSTITIAL : ModuleAdType.REWARDED : ModuleAdType.BANNER;
        }
        ModuleAdType moduleAdType2 = moduleAdType;
        String demandSource = impressionData.getDemandSource();
        String creativeId = impressionData.getCreativeId();
        String obj = impressionData.getPriceAccuracy().toString();
        HashMap hashMap = new HashMap();
        hashMap.put(AdRevenueConstants.SOURCE_KEY, "fyber");
        hashMap.put(AdRevenueConstants.ORIGINAL_SOURCE_KEY, "ad-revenue-fyber-v3");
        hashMap.put(AdRevenueConstants.ORIGINAL_AD_TYPE_KEY, placementType == null ? "null" : placementType.name());
        internalClientModuleFacade.reportAdRevenue(new ModuleAdRevenue(valueOf, currency, moduleAdType2, demandSource, creativeId, null, null, null, obj, hashMap, false));
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue from Fyber was reported", new Object[0]);
        return true;
    }
}
