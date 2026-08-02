package com.paypal.oslo.feature.oneonboarding.domain;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/domain/StepComponentConfig;", "Lcom/paypal/oslo/feature/oneonboarding/domain/ComponentConfig;", "", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/ComponentId;", "Lcom/paypal/oslo/feature/oneonboarding/domain/ViewComponentConfig;", "getComponentMap", "()Ljava/util/Map;", "componentMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface StepComponentConfig extends com.paypal.oslo.feature.oneonboarding.domain.ComponentConfig {
    java.util.Map<com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId, com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig> getComponentMap();
}
