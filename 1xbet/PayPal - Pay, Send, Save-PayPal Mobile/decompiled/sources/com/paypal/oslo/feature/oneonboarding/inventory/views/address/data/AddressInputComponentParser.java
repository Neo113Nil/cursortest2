package com.paypal.oslo.feature.oneonboarding.inventory.views.address.data;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/data/AddressInputComponentParser;", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/ViewComponentParser;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/AddressInputComponentFragment;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/domain/AddressViewComponentConfig;", "<init>", "()V", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "Lkotlin/Pair;", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "parse", "(Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/AddressInputComponentFragment;)Lkotlin/Pair;", "Lkotlin/reflect/KClass;", "fragmentClass", "Lkotlin/reflect/KClass;", "getFragmentClass", "()Lkotlin/reflect/KClass;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressInputComponentParser implements com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser<com.paypal.oslo.feature.oneonboarding.graphql.fragment.AddressInputComponentFragment, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressViewComponentConfig> {
    public static final int $stable = 8;
    private final kotlin.reflect.KClass<com.paypal.oslo.feature.oneonboarding.graphql.fragment.AddressInputComponentFragment> fragmentClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.graphql.fragment.AddressInputComponentFragment.class);

    @javax.inject.Inject
    public AddressInputComponentParser() {
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser
    public final kotlin.reflect.KClass<com.paypal.oslo.feature.oneonboarding.graphql.fragment.AddressInputComponentFragment> getFragmentClass() {
        return this.fragmentClass;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser
    public final kotlin.Pair<com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressViewComponentConfig, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> parse(com.paypal.oslo.feature.oneonboarding.graphql.fragment.AddressInputComponentFragment component) {
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVariant addressVariant;
        com.paypal.oslo.core.i18n.domain.model.Address address;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(component, "");
        java.lang.String m16608constructorimpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl(component.getId());
        java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.fragment.AddressInputComponentFragment.ContextualInfo> contextualInfo = component.getContextualInfo();
        if (contextualInfo != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it = contextualInfo.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo m16675toContextualInfoJkG0rbE = com.paypal.oslo.feature.oneonboarding.data.parser.ContextualInfoMapperKt.m16675toContextualInfoJkG0rbE(((com.paypal.oslo.feature.oneonboarding.graphql.fragment.AddressInputComponentFragment.ContextualInfo) it.next()).getContextualInfoFragment(), m16608constructorimpl);
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
        int i = com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.AddressInputComponentParser.WhenMappings.$EnumSwitchMapping$0[component.getAddressVariant().ordinal()];
        if (i == 1) {
            addressVariant = com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVariant.PRIMARY_USER;
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            addressVariant = com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressVariant.UNKNOWN__;
        }
        boolean editable = component.getEditable();
        com.paypal.oslo.feature.oneonboarding.graphql.fragment.AddressInputComponentFragment.Address address2 = component.getAddress();
        if (address2 != null) {
            java.lang.String addressLine1 = address2.getAddressLine1();
            java.lang.String m11273constructorimpl = addressLine1 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine1.m11273constructorimpl(addressLine1) : null;
            java.lang.String addressLine2 = address2.getAddressLine2();
            java.lang.String m11282constructorimpl = addressLine2 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine2.m11282constructorimpl(addressLine2) : null;
            java.lang.String addressLine3 = address2.getAddressLine3();
            java.lang.String m11291constructorimpl = addressLine3 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine3.m11291constructorimpl(addressLine3) : null;
            java.lang.String adminArea1 = address2.getAdminArea1();
            java.lang.String m11300constructorimpl = adminArea1 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea1.m11300constructorimpl(adminArea1) : null;
            java.lang.String adminArea2 = address2.getAdminArea2();
            java.lang.String m11309constructorimpl = adminArea2 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea2.m11309constructorimpl(adminArea2) : null;
            java.lang.String adminArea3 = address2.getAdminArea3();
            java.lang.String m11318constructorimpl = adminArea3 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea3.m11318constructorimpl(adminArea3) : null;
            java.lang.String adminArea4 = address2.getAdminArea4();
            java.lang.String m11327constructorimpl = adminArea4 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea4.m11327constructorimpl(adminArea4) : null;
            java.lang.String postalCode = address2.getPostalCode();
            java.lang.String m11460constructorimpl = postalCode != null ? com.paypal.oslo.core.i18n.domain.model.PostalCode.m11460constructorimpl(postalCode) : null;
            java.lang.Object countryCode = address2.getCountryCode();
            java.lang.String str = countryCode instanceof java.lang.String ? (java.lang.String) countryCode : null;
            address = new com.paypal.oslo.core.i18n.domain.model.Address(m11273constructorimpl, m11282constructorimpl, m11291constructorimpl, m11327constructorimpl, m11318constructorimpl, m11309constructorimpl, m11300constructorimpl, m11460constructorimpl, str != null ? com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl(str) : null, null, 512, null);
        } else {
            address = null;
        }
        return kotlin.TuplesKt.to(new com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.AddressViewComponentConfig(m16608constructorimpl, addressVariant, editable, address, (kotlin.jvm.internal.DefaultConstructorMarker) null), list);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.OnboardAddressVariant.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.OnboardAddressVariant.PRIMARY_USER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.OnboardAddressVariant.UNKNOWN__.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
