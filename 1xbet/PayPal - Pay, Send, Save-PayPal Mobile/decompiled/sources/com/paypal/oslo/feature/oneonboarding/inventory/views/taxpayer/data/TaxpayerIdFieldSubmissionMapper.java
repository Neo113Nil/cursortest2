package com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.data;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J'\u0010\t\u001a\u00060\u0005j\u0002`\u00062\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/data/TaxpayerIdFieldSubmissionMapper;", "Lcom/paypal/oslo/feature/oneonboarding/data/mapper/FieldSubmissionMapper;", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdCollectedItem;", "<init>", "()V", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardComponentsInput;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/type/OnboardComponentsInput;", "componentsInput", "item", "makeFieldSubmission", "(Lcom/paypal/oslo/api/graphql/schema/type/OnboardComponentsInput;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdCollectedItem;)Lcom/paypal/oslo/api/graphql/schema/type/OnboardComponentsInput;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TaxpayerIdFieldSubmissionMapper implements com.paypal.oslo.feature.oneonboarding.data.mapper.FieldSubmissionMapper<com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdCollectedItem> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public TaxpayerIdFieldSubmissionMapper() {
    }

    @Override // com.paypal.oslo.feature.oneonboarding.data.mapper.FieldSubmissionMapper
    public final com.paypal.oslo.api.graphql.schema.type.OnboardComponentsInput makeFieldSubmission(com.paypal.oslo.api.graphql.schema.type.OnboardComponentsInput componentsInput, com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdCollectedItem item) {
        com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdVariant onboardTaxpayerIdVariant;
        com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdType onboardTaxpayerIdType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentsInput, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item, "");
        int i = com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.data.TaxpayerIdFieldSubmissionMapper.WhenMappings.$EnumSwitchMapping$0[item.getVariant().ordinal()];
        if (i == 1) {
            onboardTaxpayerIdVariant = com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdVariant.PRIMARY_USER;
        } else {
            if (i != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            onboardTaxpayerIdVariant = com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdVariant.UNKNOWN__;
        }
        int i2 = com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.data.TaxpayerIdFieldSubmissionMapper.WhenMappings.$EnumSwitchMapping$1[item.getType().ordinal()];
        if (i2 == 1) {
            onboardTaxpayerIdType = com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdType.SSN;
        } else if (i2 == 2) {
            onboardTaxpayerIdType = com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdType.ITIN;
        } else if (i2 == 3) {
            onboardTaxpayerIdType = com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdType.SSN4;
        } else if (i2 == 4) {
            onboardTaxpayerIdType = com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdType.ITIN4;
        } else {
            if (i2 != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            onboardTaxpayerIdType = com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdType.UNKNOWN__;
        }
        return com.paypal.oslo.feature.oneonboarding.data.mapper.OnboardComponentsInputExtensionsKt.appendingTaxpayerId(componentsInput, new com.paypal.oslo.api.graphql.schema.type.OnboardTaxpayerIdInputComponentInput(onboardTaxpayerIdType, onboardTaxpayerIdVariant, item.getTaxId(), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(item.getGetHighSpeedVideoSizes())));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdVariant.values().length];
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdVariant.PRIMARY_USER.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdVariant.UNKNOWN__.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.values().length];
            try {
                iArr2[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.SSN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.ITIN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.SSN4.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.ITIN4.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.UNKNOWN__.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
