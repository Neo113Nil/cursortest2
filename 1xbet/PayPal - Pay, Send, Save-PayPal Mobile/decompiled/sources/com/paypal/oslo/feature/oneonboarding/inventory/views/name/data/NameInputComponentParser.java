package com.paypal.oslo.feature.oneonboarding.inventory.views.name.data;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/data/NameInputComponentParser;", "Lcom/paypal/oslo/feature/oneonboarding/data/parser/ViewComponentParser;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/NameInputComponentFragment;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/domain/NameViewComponentConfig;", "<init>", "()V", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "Lkotlin/Pair;", "", "Lcom/paypal/oslo/feature/oneonboarding/domain/ContextualInfo;", "parse", "(Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/NameInputComponentFragment;)Lkotlin/Pair;", "Lkotlin/reflect/KClass;", "fragmentClass", "Lkotlin/reflect/KClass;", "getFragmentClass", "()Lkotlin/reflect/KClass;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NameInputComponentParser implements com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser<com.paypal.oslo.feature.oneonboarding.graphql.fragment.NameInputComponentFragment, com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig> {
    public static final int $stable = 8;
    private final kotlin.reflect.KClass<com.paypal.oslo.feature.oneonboarding.graphql.fragment.NameInputComponentFragment> fragmentClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.oneonboarding.graphql.fragment.NameInputComponentFragment.class);

    @javax.inject.Inject
    public NameInputComponentParser() {
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser
    public final kotlin.reflect.KClass<com.paypal.oslo.feature.oneonboarding.graphql.fragment.NameInputComponentFragment> getFragmentClass() {
        return this.fragmentClass;
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.parser.ViewComponentParser
    public final kotlin.Pair<com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig, java.util.List<com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo>> parse(com.paypal.oslo.feature.oneonboarding.graphql.fragment.NameInputComponentFragment component) {
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameVariant nameVariant;
        com.paypal.oslo.core.i18n.domain.model.PersonName personName;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(component, "");
        java.lang.String m16608constructorimpl = com.paypal.oslo.feature.oneonboarding.api.domain.ComponentId.m16608constructorimpl(component.getId());
        java.util.List<com.paypal.oslo.feature.oneonboarding.graphql.fragment.NameInputComponentFragment.ContextualInfo> contextualInfo = component.getContextualInfo();
        if (contextualInfo != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator<T> it = contextualInfo.iterator();
            while (it.hasNext()) {
                com.paypal.oslo.feature.oneonboarding.domain.ContextualInfo m16675toContextualInfoJkG0rbE = com.paypal.oslo.feature.oneonboarding.data.parser.ContextualInfoMapperKt.m16675toContextualInfoJkG0rbE(((com.paypal.oslo.feature.oneonboarding.graphql.fragment.NameInputComponentFragment.ContextualInfo) it.next()).getContextualInfoFragment(), m16608constructorimpl);
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
        int i = com.paypal.oslo.feature.oneonboarding.inventory.views.name.data.NameInputComponentParser.WhenMappings.$EnumSwitchMapping$0[component.getNameVariant().ordinal()];
        if (i == 1) {
            nameVariant = com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameVariant.PRIMARY_USER;
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            nameVariant = com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameVariant.UNKNOWN__;
        }
        boolean editable = component.getEditable();
        com.paypal.oslo.feature.oneonboarding.graphql.fragment.NameInputComponentFragment.Name name2 = component.getName();
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
        return kotlin.TuplesKt.to(new com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameViewComponentConfig(m16608constructorimpl, nameVariant, editable, personName, (kotlin.jvm.internal.DefaultConstructorMarker) null), list);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.OnboardNameVariant.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.OnboardNameVariant.PRIMARY_USER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.OnboardNameVariant.UNKNOWN__.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
