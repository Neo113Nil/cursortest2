package com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.data;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/data/TaxpayerIdInputComponentParser;", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/ViewComponentParser;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TaxpayerIdInputComponentFragment;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdViewComponentConfig;", "<init>", "()V", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "Lkotlin/Pair;", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "parse", "(Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/TaxpayerIdInputComponentFragment;)Lkotlin/Pair;", "Lkotlin/reflect/KClass;", "fragmentClass", "Lkotlin/reflect/KClass;", "getFragmentClass", "()Lkotlin/reflect/KClass;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TaxpayerIdInputComponentParser implements com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser<com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragment, com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdViewComponentConfig> {
    public static final int $stable = 8;
    private final kotlin.reflect.KClass<com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragment> fragmentClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragment.class);

    @javax.inject.Inject
    public TaxpayerIdInputComponentParser() {
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser
    public final kotlin.reflect.KClass<com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragment> getFragmentClass() {
        return this.fragmentClass;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser
    public final kotlin.Pair<com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdViewComponentConfig, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> parse(com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragment component) {
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(component, "");
        java.lang.String m16608constructorimpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl(component.getId());
        java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragment.ContextualInfo> contextualInfo = component.getContextualInfo();
        if (contextualInfo != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it = contextualInfo.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo m16675toContextualInfoJkG0rbE = com.paypal.oslo.feature.oneonboarding.data.parser.ContextualInfoMapperKt.m16675toContextualInfoJkG0rbE(((com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragment.ContextualInfo) it.next()).getContextualInfoFragment(), m16608constructorimpl);
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
        java.util.List list = arrayList;
        java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragment.Option> options = component.getOptions();
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(options, 10));
        for (com.paypal.oslo.feature.oneonboarding.graphql.fragment.TaxpayerIdInputComponentFragment.Option option : options) {
            int i = com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.data.TaxpayerIdInputComponentParser.WhenMappings.$EnumSwitchMapping$1[option.getType().ordinal()];
            arrayList3.add(new com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdOption(i != 1 ? i != 2 ? i != 3 ? i != 4 ? com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.UNKNOWN__ : com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.ITIN4 : com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.SSN4 : com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.ITIN : com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.SSN, option.getTaxId()));
        }
        return kotlin.TuplesKt.to(new com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdViewComponentConfig(m16608constructorimpl, com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.data.TaxpayerIdInputComponentParser.WhenMappings.$EnumSwitchMapping$0[component.getTaxpayerIdVariant().ordinal()] == 1 ? com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdVariant.PRIMARY_USER : com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdVariant.UNKNOWN__, component.getEditable(), arrayList3, component.getDisplayHelperTextWithLink(), (kotlin.jvm.internal.DefaultConstructorMarker) null), list);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdVariant.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdVariant.PRIMARY_USER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdType.values().length];
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdType.SSN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdType.ITIN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdType.SSN4.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdType.ITIN4.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
