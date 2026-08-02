package com.paypal.oslo.feature.oneonboarding.data.parser;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/data/parser/PhoneStepComponentParser;", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/StepComponentParser;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PhoneStepComponentFragment;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/steps/phone/domain/PhoneStepComponentConfig;", "<init>", "()V", "step", "Lkotlin/Pair;", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "parse", "(Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/PhoneStepComponentFragment;)Lkotlin/Pair;", "Lkotlin/reflect/KClass;", "fragmentClass", "Lkotlin/reflect/KClass;", "getFragmentClass", "()Lkotlin/reflect/KClass;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhoneStepComponentParser implements com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser<com.paypal.oslo.feature.oneonboarding.graphql.fragment.PhoneStepComponentFragment, com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.PhoneStepComponentConfig> {
    public static final int $stable = 8;
    private final kotlin.reflect.KClass<com.paypal.oslo.feature.oneonboarding.graphql.fragment.PhoneStepComponentFragment> fragmentClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.graphql.fragment.PhoneStepComponentFragment.class);

    @javax.inject.Inject
    public PhoneStepComponentParser() {
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser
    public final kotlin.reflect.KClass<com.paypal.oslo.feature.oneonboarding.graphql.fragment.PhoneStepComponentFragment> getFragmentClass() {
        return this.fragmentClass;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.parser.StepComponentParser
    public final kotlin.Pair<com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.PhoneStepComponentConfig, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> parse(com.paypal.oslo.feature.oneonboarding.graphql.fragment.PhoneStepComponentFragment step) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        com.paypal.oslo.feature.oneonboarding.api.domain.Phone phone;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(step, "");
        java.lang.String m16608constructorimpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl(step.getId());
        java.lang.String m16608constructorimpl2 = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl(step.getComponent().getId());
        java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.fragment.PhoneStepComponentFragment.ContextualInfo> contextualInfo = step.getContextualInfo();
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        if (contextualInfo != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator<T> it = contextualInfo.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo m16675toContextualInfoJkG0rbE = com.paypal.oslo.feature.oneonboarding.data.parser.ContextualInfoMapperKt.m16675toContextualInfoJkG0rbE(((com.paypal.oslo.feature.oneonboarding.graphql.fragment.PhoneStepComponentFragment.ContextualInfo) it.next()).getContextualInfoFragment(), m16608constructorimpl);
                if (m16675toContextualInfoJkG0rbE != null) {
                    arrayList3.add(m16675toContextualInfoJkG0rbE);
                }
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            arrayList = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list = arrayList;
        java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.fragment.PhoneStepComponentFragment.ContextualInfo1> contextualInfo2 = step.getComponent().getContextualInfo();
        if (contextualInfo2 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.util.Iterator<T> it2 = contextualInfo2.iterator();
            while (it2.hasNext()) {
                com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo m16675toContextualInfoJkG0rbE2 = com.paypal.oslo.feature.oneonboarding.data.parser.ContextualInfoMapperKt.m16675toContextualInfoJkG0rbE(((com.paypal.oslo.feature.oneonboarding.graphql.fragment.PhoneStepComponentFragment.ContextualInfo1) it2.next()).getContextualInfoFragment(), m16608constructorimpl2);
                if (m16675toContextualInfoJkG0rbE2 != null) {
                    arrayList4.add(m16675toContextualInfoJkG0rbE2);
                }
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = null;
        }
        if (arrayList2 == null) {
            arrayList2 = kotlin.collections.CollectionsKt.emptyList();
        }
        java.util.List list2 = arrayList2;
        com.paypal.oslo.feature.oneonboarding.graphql.fragment.PhoneStepComponentFragment.Component component = step.getComponent();
        com.paypal.oslo.feature.oneonboarding.graphql.fragment.PhoneStepComponentFragment.Phone phone2 = component.getPhone();
        if (phone2 != null) {
            java.lang.String countryCode = phone2.getCountryCode();
            if (countryCode == null) {
                countryCode = "";
            }
            java.lang.String m16618constructorimpl = com.paypal.oslo.feature.oneonboarding.api.domain.CountryCode.m16618constructorimpl(countryCode);
            java.lang.String nationalNumber = phone2.getNationalNumber();
            phone = new com.paypal.oslo.feature.oneonboarding.api.domain.Phone(m16618constructorimpl, com.paypal.oslo.feature.oneonboarding.api.domain.PhoneNumber.m16664constructorimpl(nationalNumber != null ? nationalNumber : ""), defaultConstructorMarker);
        } else {
            phone = null;
        }
        return kotlin.TuplesKt.to(new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.PhoneStepComponentConfig(m16608constructorimpl, new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.PhoneViewComponentConfig(m16608constructorimpl2, component.getVariant(), component.getEditable(), phone, (kotlin.jvm.internal.DefaultConstructorMarker) null), defaultConstructorMarker), kotlin.collections.CollectionsKt.plus((java.util.Collection) list, (java.lang.Iterable) list2));
    }
}
