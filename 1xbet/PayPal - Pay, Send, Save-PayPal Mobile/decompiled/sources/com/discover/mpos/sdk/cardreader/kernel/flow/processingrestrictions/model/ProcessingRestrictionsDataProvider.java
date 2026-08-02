package com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/processingrestrictions/model/ProcessingRestrictionsDataProvider;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionDataProvider;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/processingrestrictions/model/ProcessingRestrictionsData;", "()V", "getData", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.j.b.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class ProcessingRestrictionsDataProvider implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider<com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.model.ProcessingRestrictionsData> {
    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionDataProvider
    public final /* synthetic */ com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.model.ProcessingRestrictionsData a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.model.ProcessingRestrictionsData> transactionEx) {
        byte[] content;
        java.lang.String hexString;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.processing.ProcessingData j = transactionEx.j();
        com.discover.mpos.sdk.cardreader.config.TerminalConfiguration terminalConfiguration = transactionEx.getConfig().getTerminalConfiguration();
        com.discover.mpos.sdk.core.emv.tlv.Tlv b = j.b(com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_USAGE_CONTROL.getTag());
        com.discover.mpos.sdk.core.emv.tlv.Tlv b2 = j.b(com.discover.mpos.sdk.core.emv.tlv.Tag.ISSUER_COUNTRY_CODE.getTag());
        java.lang.String applicationVersionNumber = terminalConfiguration.getApplicationVersionNumber();
        com.discover.mpos.sdk.core.emv.tlv.Tlv b3 = j.b(com.discover.mpos.sdk.core.emv.tlv.Tag.APPLICATION_VERSION_NUMBER_CARD.getTag());
        return new com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.model.ProcessingRestrictionsData(new com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.model.ApplicationUsageControl(b), b2 != null ? b2.getContent() : null, terminalConfiguration.getCountryCode(), transactionEx.getTransactionData().getType(), (b3 == null || (content = b3.getContent()) == null || (hexString = com.discover.mpos.sdk.core.extensions.ByteArrayExtensionsKt.toHexString(content)) == null) ? "" : hexString, applicationVersionNumber);
    }
}
