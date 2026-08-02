package com.discover.mpos.sdk.b.a;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"CURRENCY_SIZE", "", "getTlv", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "Lcom/discover/mpos/sdk/transaction/TransactionData;", "tag", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class a {
    public static final com.discover.mpos.sdk.core.emv.tlv.Tlv a(com.discover.mpos.sdk.transaction.TransactionData transactionData, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.discover.mpos.sdk.core.emv.tlv.Tag.AMOUNT_REFERENCE_CURRENCY.getTag()) || kotlin.jvm.internal.Intrinsics.areEqual(str, com.discover.mpos.sdk.core.emv.tlv.Tag.TRANSACTION_CURRENCY_CODE.getTag())) {
            return new com.discover.mpos.sdk.core.emv.tlv.Tlv(str, com.discover.mpos.sdk.core.extensions.HexExtensionsKt.toNumByteArray(transactionData.getCurrency().getNumericCode(), 2), 0, 0, 12, null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.discover.mpos.sdk.core.emv.tlv.Tag.AMOUNT_OTHER_BINARY.getTag())) {
            return new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.AMOUNT_OTHER_BINARY.getTag(), transactionData.getEmvCashbackAuthorized$mpos_sdk_card_reader_offlineRegularRelease(), 0, 0, 12, null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.discover.mpos.sdk.core.emv.tlv.Tag.AMOUNT_OTHER_NUMERIC.getTag())) {
            return new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.AMOUNT_OTHER_NUMERIC.getTag(), transactionData.getEmvCashbackAuthorized$mpos_sdk_card_reader_offlineRegularRelease(), 0, 0, 12, null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.discover.mpos.sdk.core.emv.tlv.Tag.AMOUNT_AUTHORISED_BINARY.getTag())) {
            return new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.AMOUNT_AUTHORISED_BINARY.getTag(), transactionData.getEmvAmountAuthorized$mpos_sdk_card_reader_offlineRegularRelease(), 0, 0, 12, null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.discover.mpos.sdk.core.emv.tlv.Tag.AMOUNT_AUTHORISED_NUMERIC.getTag())) {
            return new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.AMOUNT_AUTHORISED_NUMERIC.getTag(), transactionData.getEmvAmountAuthorized$mpos_sdk_card_reader_offlineRegularRelease(), 0, 0, 12, null);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.discover.mpos.sdk.core.emv.tlv.Tag.TRANSACTION_TYPE.getTag())) {
            return new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.TRANSACTION_TYPE.getTag(), transactionData.getType().getEmvValue());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(str, com.discover.mpos.sdk.core.emv.tlv.Tag.TRANSACTION_DATE.getTag())) {
            return new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.TRANSACTION_DATE.getTag(), com.discover.mpos.sdk.core.extensions.DateExtKt.getFormattedDate(transactionData.getTransactionDate()));
        }
        return null;
    }
}
