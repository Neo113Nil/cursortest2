package com.paypal.oslo.feature.oneonboarding.data.parser;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\n\b\u0001\u0010\u0004 \u0001*\u00020\u00032\u00020\u0001J+\u0010\t\u001a\u0016\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/data/parser/ViewComponentParser;", "", "GqlComponent", "Lcom/paypal/oslo/feature/oneonboarding/domain/ViewComponentConfig;", "DomainConfig", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "Lkotlin/Pair;", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "parse", "(Ljava/lang/Object;)Lkotlin/Pair;", "Lkotlin/reflect/KClass;", "getFragmentClass", "()Lkotlin/reflect/KClass;", "fragmentClass"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface ViewComponentParser<GqlComponent, DomainConfig extends com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig> {
    kotlin.reflect.KClass<GqlComponent> getFragmentClass();

    kotlin.Pair<DomainConfig, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> parse(GqlComponent component);
}
