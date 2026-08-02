package com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.data;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\r8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/data/DateOfBirthPickerInputComponentParser;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/data/BaseDateOfBirthParser;", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/ViewComponentParser;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/DateOfBirthPickerInputComponentFragment;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/dateofbirth/domain/DateOfBirthViewComponentConfig;", "<init>", "()V", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "Lkotlin/Pair;", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "parse", "(Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/DateOfBirthPickerInputComponentFragment;)Lkotlin/Pair;", "Lkotlin/reflect/KClass;", "fragmentClass", "Lkotlin/reflect/KClass;", "getFragmentClass", "()Lkotlin/reflect/KClass;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class DateOfBirthPickerInputComponentParser extends com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.data.BaseDateOfBirthParser implements com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser<com.paypal.oslo.feature.oneonboarding.graphql.fragment.DateOfBirthPickerInputComponentFragment, com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthViewComponentConfig> {
    public static final int $stable = 8;
    private final kotlin.reflect.KClass<com.paypal.oslo.feature.oneonboarding.graphql.fragment.DateOfBirthPickerInputComponentFragment> fragmentClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.graphql.fragment.DateOfBirthPickerInputComponentFragment.class);

    @javax.inject.Inject
    public DateOfBirthPickerInputComponentParser() {
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser
    public final kotlin.reflect.KClass<com.paypal.oslo.feature.oneonboarding.graphql.fragment.DateOfBirthPickerInputComponentFragment> getFragmentClass() {
        return this.fragmentClass;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser
    public final kotlin.Pair<com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.domain.DateOfBirthViewComponentConfig, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> parse(com.paypal.oslo.feature.oneonboarding.graphql.fragment.DateOfBirthPickerInputComponentFragment component) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(component, "");
        java.lang.String m16608constructorimpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl(component.getId());
        java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.fragment.DateOfBirthPickerInputComponentFragment.ContextualInfo> contextualInfo = component.getContextualInfo();
        if (contextualInfo != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it = contextualInfo.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo m16675toContextualInfoJkG0rbE = com.paypal.oslo.feature.oneonboarding.data.parser.ContextualInfoMapperKt.m16675toContextualInfoJkG0rbE(((com.paypal.oslo.feature.oneonboarding.graphql.fragment.DateOfBirthPickerInputComponentFragment.ContextualInfo) it.next()).getContextualInfoFragment(), m16608constructorimpl);
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
        return kotlin.TuplesKt.to(m16990parseCommonmn192JU(m16608constructorimpl, new com.paypal.oslo.feature.oneonboarding.inventory.views.dateofbirth.data.DateOfBirthPickerVariantWrapper(component.getDateOfBirthPickerInputComponentVariant()), component.getEditable(), component.getBirthDate(), true), arrayList);
    }
}
