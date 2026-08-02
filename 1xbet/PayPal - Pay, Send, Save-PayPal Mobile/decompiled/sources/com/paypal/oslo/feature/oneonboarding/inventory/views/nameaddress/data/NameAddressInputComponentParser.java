package com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.data;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/data/NameAddressInputComponentParser;", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/ViewComponentParser;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/NameAddressInputComponentFragment;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/nameaddress/domain/NameAddressViewComponentConfig;", "<init>", "()V", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "Lkotlin/Pair;", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "parse", "(Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/NameAddressInputComponentFragment;)Lkotlin/Pair;", "Lkotlin/reflect/KClass;", "fragmentClass", "Lkotlin/reflect/KClass;", "getFragmentClass", "()Lkotlin/reflect/KClass;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NameAddressInputComponentParser implements com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser<com.paypal.oslo.feature.oneonboarding.graphql.fragment.NameAddressInputComponentFragment, com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig> {
    public static final int $stable = 8;
    private final kotlin.reflect.KClass<com.paypal.oslo.feature.oneonboarding.graphql.fragment.NameAddressInputComponentFragment> fragmentClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.graphql.fragment.NameAddressInputComponentFragment.class);

    @javax.inject.Inject
    public NameAddressInputComponentParser() {
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser
    public final kotlin.reflect.KClass<com.paypal.oslo.feature.oneonboarding.graphql.fragment.NameAddressInputComponentFragment> getFragmentClass() {
        return this.fragmentClass;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser
    public final kotlin.Pair<com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> parse(com.paypal.oslo.feature.oneonboarding.graphql.fragment.NameAddressInputComponentFragment component) {
        java.util.ArrayList arrayList;
        com.paypal.oslo.core.i18n.domain.model.PersonName personName;
        java.util.ArrayList arrayList2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(component, "");
        java.lang.String m16608constructorimpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl(component.getId());
        java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.fragment.NameAddressInputComponentFragment.ContextualInfo> contextualInfo = component.getContextualInfo();
        if (contextualInfo != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator<T> it = contextualInfo.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo m16675toContextualInfoJkG0rbE = com.paypal.oslo.feature.oneonboarding.data.parser.ContextualInfoMapperKt.m16675toContextualInfoJkG0rbE(((com.paypal.oslo.feature.oneonboarding.graphql.fragment.NameAddressInputComponentFragment.ContextualInfo) it.next()).getContextualInfoFragment(), m16608constructorimpl);
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
        com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressVariant nameAddressVariant = com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.data.NameAddressInputComponentParser.WhenMappings.$EnumSwitchMapping$0[component.getNameAddressInputComponentVariant().ordinal()] == 1 ? com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressVariant.PRIMARY_USER : com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressVariant.UNKNOWN__;
        boolean editable = component.getEditable();
        com.paypal.oslo.feature.oneonboarding.graphql.fragment.NameAddressInputComponentFragment.Name name2 = component.getName();
        if (name2 != null) {
            java.lang.String givenName = name2.getGivenName();
            java.lang.String m11414constructorimpl = givenName != null ? com.paypal.oslo.core.i18n.domain.model.GivenName.m11414constructorimpl(givenName) : null;
            java.lang.String middleName = name2.getMiddleName();
            java.lang.String m11429constructorimpl = middleName != null ? com.paypal.oslo.core.i18n.domain.model.MiddleName.m11429constructorimpl(middleName) : null;
            java.lang.String surname = name2.getSurname();
            java.lang.String m11523constructorimpl = surname != null ? com.paypal.oslo.core.i18n.domain.model.Surname.m11523constructorimpl(surname) : null;
            java.lang.String secondSurname = name2.getSecondSurname();
            personName = new com.paypal.oslo.core.i18n.domain.model.PersonName(m11414constructorimpl, m11429constructorimpl, m11523constructorimpl, secondSurname != null ? com.paypal.oslo.core.i18n.domain.model.SecondSurname.m11478constructorimpl(secondSurname) : null, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else {
            personName = null;
        }
        java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.fragment.NameAddressInputComponentFragment.Address> addresses = component.getAddresses();
        if (addresses != null) {
            java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.fragment.NameAddressInputComponentFragment.Address> list2 = addresses;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (com.paypal.oslo.feature.oneonboarding.graphql.fragment.NameAddressInputComponentFragment.Address address : list2) {
                java.lang.String addressLine1 = address.getAddressLine1();
                java.lang.String m11273constructorimpl = addressLine1 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine1.m11273constructorimpl(addressLine1) : null;
                java.lang.String addressLine2 = address.getAddressLine2();
                java.lang.String m11282constructorimpl = addressLine2 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine2.m11282constructorimpl(addressLine2) : null;
                java.lang.String addressLine3 = address.getAddressLine3();
                java.lang.String m11291constructorimpl = addressLine3 != null ? com.paypal.oslo.core.i18n.domain.model.AddressLine3.m11291constructorimpl(addressLine3) : null;
                java.lang.String adminArea1 = address.getAdminArea1();
                java.lang.String m11300constructorimpl = adminArea1 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea1.m11300constructorimpl(adminArea1) : null;
                java.lang.String adminArea2 = address.getAdminArea2();
                java.lang.String m11309constructorimpl = adminArea2 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea2.m11309constructorimpl(adminArea2) : null;
                java.lang.String adminArea3 = address.getAdminArea3();
                java.lang.String m11318constructorimpl = adminArea3 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea3.m11318constructorimpl(adminArea3) : null;
                java.lang.String adminArea4 = address.getAdminArea4();
                java.lang.String m11327constructorimpl = adminArea4 != null ? com.paypal.oslo.core.i18n.domain.model.AdminArea4.m11327constructorimpl(adminArea4) : null;
                java.lang.String postalCode = address.getPostalCode();
                java.lang.String m11460constructorimpl = postalCode != null ? com.paypal.oslo.core.i18n.domain.model.PostalCode.m11460constructorimpl(postalCode) : null;
                java.lang.Object countryCode = address.getCountryCode();
                kotlin.jvm.internal.Intrinsics.checkNotNull(countryCode, "");
                arrayList4.add(new com.paypal.oslo.core.i18n.domain.model.Address(m11273constructorimpl, m11282constructorimpl, m11291constructorimpl, m11327constructorimpl, m11318constructorimpl, m11309constructorimpl, m11300constructorimpl, m11460constructorimpl, com.paypal.oslo.core.i18n.domain.model.CountryCode.m11364constructorimpl((java.lang.String) countryCode), null, 512, null));
            }
            arrayList2 = arrayList4;
        } else {
            arrayList2 = null;
        }
        return kotlin.TuplesKt.to(new com.paypal.oslo.feature.oneonboarding.inventory.views.nameaddress.domain.NameAddressViewComponentConfig(m16608constructorimpl, nameAddressVariant, editable, personName, arrayList2, (kotlin.jvm.internal.DefaultConstructorMarker) null), list);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.OnboardNameAddressInputComponentVariant.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.OnboardNameAddressInputComponentVariant.PRIMARY_USER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
