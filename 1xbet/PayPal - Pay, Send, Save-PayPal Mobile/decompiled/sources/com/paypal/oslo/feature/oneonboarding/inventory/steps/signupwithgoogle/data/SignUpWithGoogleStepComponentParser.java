package com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.data;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/signupwithgoogle/data/SignUpWithGoogleStepComponentParser;", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/StepComponentParser;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/SignUpWithGoogleStepComponentFragment;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/signupwithgoogle/domain/SignUpWithGoogleStepComponentConfig;", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/registry/ViewComponentParserRegistry;", "viewComponentRegistry", "<init>", "(Lcom/paypal/oslo/feature/oneonboarding/data/parser/registry/ViewComponentParserRegistry;)V", "step", "Lkotlin/Pair;", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "parse", "(Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/SignUpWithGoogleStepComponentFragment;)Lkotlin/Pair;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/registry/ViewComponentParserRegistry;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/reflect/KClass;", "getFragmentClass", "()Lkotlin/reflect/KClass;", "fragmentClass"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignUpWithGoogleStepComponentParser implements com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser<com.paypal.oslo.feature.oneonboarding.graphql.fragment.SignUpWithGoogleStepComponentFragment, com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.domain.SignUpWithGoogleStepComponentConfig> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public SignUpWithGoogleStepComponentParser(com.paypal.oslo.feature.oneonboarding.data.parser.registry.ViewComponentParserRegistry viewComponentParserRegistry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewComponentParserRegistry, "");
        this.getHighResolutionOutputSizeshNQ4ISI = viewComponentParserRegistry;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser
    public final kotlin.Pair<com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.domain.SignUpWithGoogleStepComponentConfig, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> parse(com.paypal.oslo.feature.oneonboarding.graphql.fragment.SignUpWithGoogleStepComponentFragment step) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
        java.lang.String m16608constructorimpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl(step.getId());
        java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.fragment.SignUpWithGoogleStepComponentFragment.ContextualInfo> contextualInfo = step.getContextualInfo();
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        if (contextualInfo != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it = contextualInfo.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo m16675toContextualInfoJkG0rbE = com.paypal.oslo.feature.oneonboarding.data.parser.ContextualInfoMapperKt.m16675toContextualInfoJkG0rbE(((com.paypal.oslo.feature.oneonboarding.graphql.fragment.SignUpWithGoogleStepComponentFragment.ContextualInfo) it.next()).getContextualInfoFragment(), m16608constructorimpl);
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
        java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.fragment.SignUpWithGoogleStepComponentFragment.Component> components = step.getComponents();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator<T> it2 = components.iterator();
        while (it2.hasNext()) {
            kotlin.Pair<com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> parseComponent = this.getHighResolutionOutputSizeshNQ4ISI.parseComponent((com.paypal.oslo.feature.oneonboarding.graphql.fragment.SignUpWithGoogleStepComponentFragment.Component) it2.next());
            if (parseComponent != null) {
                arrayList3.add(parseComponent);
            }
        }
        java.util.ArrayList arrayList4 = arrayList3;
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        java.util.Iterator it3 = arrayList4.iterator();
        while (it3.hasNext()) {
            arrayList5.add((com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig) ((kotlin.Pair) it3.next()).getFirst());
        }
        java.util.ArrayList arrayList6 = arrayList5;
        java.util.ArrayList arrayList7 = new java.util.ArrayList();
        java.util.Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList7, (java.lang.Iterable) ((kotlin.Pair) it4.next()).getSecond());
        }
        com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.domain.SignUpWithGoogleStepComponentConfig signUpWithGoogleStepComponentConfig = new com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.domain.SignUpWithGoogleStepComponentConfig(m16608constructorimpl, arrayList6, defaultConstructorMarker);
        return kotlin.TuplesKt.to(com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.domain.SignUpWithGoogleStepComponentConfig.m16834copyOUoJPtg$default(signUpWithGoogleStepComponentConfig, null, kotlin.collections.CollectionsKt.sortedWith(signUpWithGoogleStepComponentConfig.getComponents(), new java.util.Comparator() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.data.SignUpWithGoogleStepComponentParser$orderComponents$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                java.util.Map map;
                java.util.Map map2;
                map = com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.data.SignUpWithGoogleStepComponentParserKt.getHighSpeedVideoSizes;
                java.lang.Integer num = (java.lang.Integer) map.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig) t).getClass()));
                java.lang.Integer valueOf = java.lang.Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
                map2 = com.paypal.oslo.feature.oneonboarding.inventory.steps.signupwithgoogle.data.SignUpWithGoogleStepComponentParserKt.getHighSpeedVideoSizes;
                java.lang.Integer num2 = (java.lang.Integer) map2.get(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.feature.oneonboarding.domain.ViewComponentConfig) t2).getClass()));
                return kotlin.comparisons.ComparisonsKt.compareValues(valueOf, java.lang.Integer.valueOf(num2 != null ? num2.intValue() : Integer.MAX_VALUE));
            }
        }), 1, null), kotlin.collections.CollectionsKt.plus((java.util.Collection) arrayList, (java.lang.Iterable) arrayList7));
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser
    public final kotlin.reflect.KClass<com.paypal.oslo.feature.oneonboarding.graphql.fragment.SignUpWithGoogleStepComponentFragment> getFragmentClass() {
        return kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.graphql.fragment.SignUpWithGoogleStepComponentFragment.class);
    }
}
