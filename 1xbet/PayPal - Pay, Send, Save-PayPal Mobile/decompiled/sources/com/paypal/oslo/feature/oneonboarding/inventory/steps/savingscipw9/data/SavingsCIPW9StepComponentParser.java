package com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.data;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R(\u0010\u001b\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0011\u0012\u0004\u0012\u00020\u00180\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/savingscipw9/data/SavingsCIPW9StepComponentParser;", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/StepComponentParser;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/SavingsCIPW9StepComponentFragment;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/savingscipw9/domain/SavingsCIPW9StepComponentConfig;", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/registry/ViewComponentParserRegistry;", "viewComponentParserRegistry", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/data/parser/registry/ViewComponentParserRegistry;)V", "step", "Lkotlin/Pair;", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "parse", "(Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/SavingsCIPW9StepComponentFragment;)Lkotlin/Pair;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/registry/ViewComponentParserRegistry;", "getHighSpeedVideoFpsRanges", "Lkotlin/reflect/KClass;", "fragmentClass", "Lkotlin/reflect/KClass;", "getFragmentClass", "()Lkotlin/reflect/KClass;", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/ViewComponentConfig;", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/Map;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SavingsCIPW9StepComponentParser implements com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser<com.paypal.oslo.feature.oneonboarding.graphql.fragment.SavingsCIPW9StepComponentFragment, com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.domain.SavingsCIPW9StepComponentConfig> {
    public static final int $stable = 8;
    private final kotlin.reflect.KClass<com.paypal.oslo.feature.oneonboarding.graphql.fragment.SavingsCIPW9StepComponentFragment> fragmentClass;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.Map<kotlin.reflect.KClass<? extends com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig>, java.lang.Integer> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public SavingsCIPW9StepComponentParser(com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry viewComponentParserRegistry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewComponentParserRegistry, "");
        this.getHighSpeedVideoFpsRanges = viewComponentParserRegistry;
        this.fragmentClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.graphql.fragment.SavingsCIPW9StepComponentFragment.class);
        this.getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig.class), 0), kotlin.TuplesKt.to(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthViewComponentConfig.class), 1), kotlin.TuplesKt.to(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdViewComponentConfig.class), 2), kotlin.TuplesKt.to(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.inventory.views.w9consent.domain.W9ConsentViewComponentConfig.class), 3));
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser
    public final kotlin.reflect.KClass<com.paypal.oslo.feature.oneonboarding.graphql.fragment.SavingsCIPW9StepComponentFragment> getFragmentClass() {
        return this.fragmentClass;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser
    public final kotlin.Pair<com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.domain.SavingsCIPW9StepComponentConfig, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> parse(com.paypal.oslo.feature.oneonboarding.graphql.fragment.SavingsCIPW9StepComponentFragment step) {
        java.util.ArrayList arrayList;
        kotlin.Unit unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
        java.lang.String m16608constructorimpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl(step.getId());
        java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.fragment.SavingsCIPW9StepComponentFragment.ContextualInfo> contextualInfo = step.getContextualInfo();
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        if (contextualInfo != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it = contextualInfo.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo m16675toContextualInfoJkG0rbE = com.paypal.oslo.feature.oneonboarding.data.parser.ContextualInfoMapperKt.m16675toContextualInfoJkG0rbE(((com.paypal.oslo.feature.oneonboarding.graphql.fragment.SavingsCIPW9StepComponentFragment.ContextualInfo) it.next()).getContextualInfoFragment(), m16608constructorimpl);
                if (m16675toContextualInfoJkG0rbE != null) {
                    arrayList2.add(m16675toContextualInfoJkG0rbE);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = kotlin.collections.CollectionsKt.emptyList();
        }
        com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry viewComponentParserRegistry = this.getHighSpeedVideoFpsRanges;
        java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.fragment.SavingsCIPW9StepComponentFragment.Component> components = step.getComponents();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.Iterator<T> it2 = components.iterator();
        while (it2.hasNext()) {
            kotlin.Pair<com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> parseComponent = viewComponentParserRegistry.parseComponent(it2.next());
            if (parseComponent == null) {
                parseComponent = kotlin.TuplesKt.to(null, null);
            }
            com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig component1 = parseComponent.component1();
            java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo> component2 = parseComponent.component2();
            if (component1 != null) {
                arrayList3.add(component1);
                if (component2 != null) {
                    arrayList4.addAll(component2);
                }
                unit = kotlin.Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit != null) {
                arrayList5.add(unit);
            }
        }
        if (arrayList3.isEmpty()) {
            return null;
        }
        com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.domain.SavingsCIPW9StepComponentConfig savingsCIPW9StepComponentConfig = new com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.domain.SavingsCIPW9StepComponentConfig(m16608constructorimpl, arrayList3, defaultConstructorMarker);
        return kotlin.TuplesKt.to(com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.domain.SavingsCIPW9StepComponentConfig.m16825copyOUoJPtg$default(savingsCIPW9StepComponentConfig, null, kotlin.collections.CollectionsKt.sortedWith(savingsCIPW9StepComponentConfig.getViewComponents(), new java.util.Comparator() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.data.SavingsCIPW9StepComponentParser$orderComponents$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                java.util.Map map;
                int i;
                java.util.Map map2;
                com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig viewComponentConfig = (com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig) t;
                map = com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.data.SavingsCIPW9StepComponentParser.this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Integer num = (java.lang.Integer) map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(viewComponentConfig.getClass()));
                int i2 = Integer.MAX_VALUE;
                if (num != null) {
                    i = num.intValue();
                } else {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.oneonboarding.LoggerKt.log, "Component type not found in componentOrder, will appear last", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("componentType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(viewComponentConfig.getClass()).getSimpleName()), kotlin.TuplesKt.to("componentId", viewComponentConfig.mo16702getIdfHLlpbY())), null, 4, null);
                    i = Integer.MAX_VALUE;
                }
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i);
                com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig viewComponentConfig2 = (com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig) t2;
                map2 = com.paypal.oslo.feature.oneonboarding.inventory.steps.savingscipw9.data.SavingsCIPW9StepComponentParser.this.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Integer num2 = (java.lang.Integer) map2.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(viewComponentConfig2.getClass()));
                if (num2 != null) {
                    i2 = num2.intValue();
                } else {
                    com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.oneonboarding.LoggerKt.log, "Component type not found in componentOrder, will appear last", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("componentType", kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(viewComponentConfig2.getClass()).getSimpleName()), kotlin.TuplesKt.to("componentId", viewComponentConfig2.mo16702getIdfHLlpbY())), null, 4, null);
                }
                return kotlin.comparisons.ComparisonsKt.compareValues(valueOf, java.lang.Integer.valueOf(i2));
            }
        }), 1, null), kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList, (java.lang.Iterable) arrayList4));
    }
}
