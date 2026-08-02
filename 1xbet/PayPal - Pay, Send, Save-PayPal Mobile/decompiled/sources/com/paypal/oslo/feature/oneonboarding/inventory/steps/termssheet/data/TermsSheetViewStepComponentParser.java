package com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.data;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/termssheet/data/TermsSheetViewStepComponentParser;", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/StepComponentParser;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TermsSheetViewStepComponentFragment;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/termssheet/domain/TermsSheetStepComponentConfig;", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/registry/ViewComponentParserRegistry;", "viewComponentRegistry", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/data/parser/registry/ViewComponentParserRegistry;)V", "step", "Lkotlin/Pair;", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "parse", "(Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TermsSheetViewStepComponentFragment;)Lkotlin/Pair;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/registry/ViewComponentParserRegistry;", "getHighSpeedVideoSizes", "Lkotlin/reflect/KClass;", "getFragmentClass", "()Lkotlin/reflect/KClass;", "fragmentClass"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TermsSheetViewStepComponentParser implements com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser<com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsSheetViewStepComponentFragment, com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.domain.TermsSheetStepComponentConfig> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry getHighSpeedVideoSizes;

    @javax.inject.Inject
    public TermsSheetViewStepComponentParser(com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry viewComponentParserRegistry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewComponentParserRegistry, "");
        this.getHighSpeedVideoSizes = viewComponentParserRegistry;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser
    public final kotlin.Pair<com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.domain.TermsSheetStepComponentConfig, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> parse(com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsSheetViewStepComponentFragment step) {
        java.util.ArrayList arrayList;
        kotlin.Unit unit;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
        java.lang.String m16608constructorimpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl(step.getId());
        java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsSheetViewStepComponentFragment.ContextualInfo> contextualInfo = step.getContextualInfo();
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        if (contextualInfo != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it = contextualInfo.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo m16675toContextualInfoJkG0rbE = com.paypal.oslo.feature.oneonboarding.data.parser.ContextualInfoMapperKt.m16675toContextualInfoJkG0rbE(((com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsSheetViewStepComponentFragment.ContextualInfo) it.next()).getContextualInfoFragment(), m16608constructorimpl);
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
        com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry viewComponentParserRegistry = this.getHighSpeedVideoSizes;
        java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsSheetViewStepComponentFragment.Component> components = step.getComponents();
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
        return kotlin.TuplesKt.to(new com.paypal.oslo.feature.oneonboarding.inventory.steps.termssheet.domain.TermsSheetStepComponentConfig(m16608constructorimpl, arrayList3, defaultConstructorMarker), kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList, (java.lang.Iterable) arrayList4));
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser
    public final kotlin.reflect.KClass<com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsSheetViewStepComponentFragment> getFragmentClass() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.graphql.fragment.TermsSheetViewStepComponentFragment.class);
    }
}
