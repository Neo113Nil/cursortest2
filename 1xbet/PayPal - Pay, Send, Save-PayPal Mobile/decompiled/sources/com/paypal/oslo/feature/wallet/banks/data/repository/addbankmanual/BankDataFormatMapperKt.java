package com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/BankDataFormat;", "Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BankDataFormatType;", "toDomain", "(Lcom/paypal/oslo/api/graphql/schema/type/BankDataFormat;)Lcom/paypal/oslo/feature/wallet/banks/domain/model/addmanualbank/BankDataFormatType;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BankDataFormatMapperKt {
    public static final com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType toDomain(com.paypal.oslo.api.graphql.schema.type.BankDataFormat bankDataFormat) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bankDataFormat, "");
        int i = com.paypal.oslo.feature.wallet.banks.data.repository.addbankmanual.BankDataFormatMapperKt.WhenMappings.$EnumSwitchMapping$0[bankDataFormat.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType.IBAN;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType.NORMAL;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType.WIRE;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType.UNKNOWN;
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.wallet.banks.domain.model.addmanualbank.BankDataFormatType.UNKNOWN;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.BankDataFormat.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankDataFormat.IBAN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankDataFormat.NORMAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankDataFormat.WIRE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankDataFormat.UNKNOWN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.BankDataFormat.UNKNOWN__.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
