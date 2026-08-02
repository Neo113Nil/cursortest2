package com.paypal.oslo.feature.oneonboarding.inventory.views.name.data;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\t\u001a\u00060\u0005j\u0002`\u00062\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/data/NameViewSubmissionMapper;", "Lcom/paypal/oslo/feature/oneonboarding/data/mapper/FieldSubmissionMapper;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/domain/NameCollectedItem;", "<init>", "()V", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardComponentsInput;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/type/OnboardComponentsInput;", "componentsInput", "item", "makeFieldSubmission", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardComponentsInput;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/name/domain/NameCollectedItem;)Lcom/paypal/oslo/api/graphql/schema/type/OnboardComponentsInput;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NameViewSubmissionMapper implements com.paypal.oslo.feature.oneonboarding.data.mapper.FieldSubmissionMapper<com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameCollectedItem> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public NameViewSubmissionMapper() {
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.mapper.FieldSubmissionMapper
    public final com.paypal.oslo.api.graphql.schema.type.OnboardComponentsInput makeFieldSubmission(com.paypal.oslo.api.graphql.schema.type.OnboardComponentsInput componentsInput, com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameCollectedItem item) {
        com.paypal.oslo.api.graphql.schema.type.OnboardNameVariant onboardNameVariant;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentsInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        int i = com.paypal.oslo.feature.oneonboarding.inventory.views.name.data.NameViewSubmissionMapper.WhenMappings.$EnumSwitchMapping$0[item.getVariant().ordinal()];
        if (i == 1) {
            onboardNameVariant = com.paypal.oslo.api.graphql.schema.type.OnboardNameVariant.PRIMARY_USER;
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            onboardNameVariant = com.paypal.oslo.api.graphql.schema.type.OnboardNameVariant.UNKNOWN__;
        }
        com.paypal.oslo.core.i18n.domain.model.PersonName name2 = item.getName();
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String m11446getGivenNamedfzjkSU = name2.m11446getGivenNamedfzjkSU();
        if (m11446getGivenNamedfzjkSU == null) {
            m11446getGivenNamedfzjkSU = null;
        }
        com.apollographql.apollo.api.Optional presentIfNotNull = companion.presentIfNotNull(m11446getGivenNamedfzjkSU);
        com.apollographql.apollo.api.Optional.Companion companion2 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String m11447getMiddleName114sck0 = name2.m11447getMiddleName114sck0();
        if (m11447getMiddleName114sck0 == null) {
            m11447getMiddleName114sck0 = null;
        }
        com.apollographql.apollo.api.Optional presentIfNotNull2 = companion2.presentIfNotNull(m11447getMiddleName114sck0);
        com.apollographql.apollo.api.Optional.Companion companion3 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String m11449getSurName5MXJos4 = name2.m11449getSurName5MXJos4();
        if (m11449getSurName5MXJos4 == null) {
            m11449getSurName5MXJos4 = null;
        }
        com.apollographql.apollo.api.Optional presentIfNotNull3 = companion3.presentIfNotNull(m11449getSurName5MXJos4);
        com.apollographql.apollo.api.Optional.Companion companion4 = com.apollographql.apollo.api.Optional.INSTANCE;
        java.lang.String m11448getSecondSurnamedtlYlO0 = name2.m11448getSecondSurnamedtlYlO0();
        return com.paypal.oslo.feature.oneonboarding.data.mapper.OnboardComponentsInputExtensionsKt.appendingName(componentsInput, new com.paypal.oslo.api.graphql.schema.type.OnboardNameInputComponentInput(onboardNameVariant, new com.paypal.oslo.api.graphql.schema.type.PersonNameInput(null, presentIfNotNull, presentIfNotNull3, companion4.presentIfNotNull(m11448getSecondSurnamedtlYlO0 != null ? m11448getSecondSurnamedtlYlO0 : null), presentIfNotNull2, null, null, 97, null), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(item.getGetHighSpeedVideoSizes())));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameVariant.values().length];
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameVariant.PRIMARY_USER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.name.domain.NameVariant.UNKNOWN__.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
