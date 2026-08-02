package com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/mapper/MenuCardTypeMapper;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/mapper/Mapper;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/MenuCardTypeDomain;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/model/MenuCardType;", "<init>", "()V", "input", "map", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/MenuCardTypeDomain;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/model/MenuCardType;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MenuCardTypeMapper implements com.paypal.oslo.feature.taxanddocumentcenter.domain.mapper.Mapper<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain, com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType> {
    public static final int $stable = 0;

    @javax.inject.Inject
    public MenuCardTypeMapper() {
    }

    @Override // com.paypal.oslo.feature.taxanddocumentcenter.domain.mapper.Mapper
    public final com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType map(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        int i = com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.mapper.MenuCardTypeMapper.WhenMappings.$EnumSwitchMapping$0[input.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType.TAX_DOCUMENTS;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType.FILE_TAXES;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType.ALL_TRANSACTIONS;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType.CUSTOM_STATEMENT;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain.values().length];
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain.TAX_DOCUMENTS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain.FILE_TAXES.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain.ALL_TRANSACTIONS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain.CUSTOM_STATEMENT.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
