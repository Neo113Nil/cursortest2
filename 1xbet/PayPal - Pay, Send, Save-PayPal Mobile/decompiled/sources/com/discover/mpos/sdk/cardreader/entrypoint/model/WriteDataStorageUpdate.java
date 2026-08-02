package com.discover.mpos.sdk.cardreader.entrypoint.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010%\u001a\u00020&R\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0014\u0010\u0019\u001a\u00020\u001aX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/model/WriteDataStorageUpdate;", "", "combinationConfiguration", "Lcom/discover/mpos/sdk/cardreader/config/CombinationConfiguration;", "transactionData", "Lcom/discover/mpos/sdk/transaction/TransactionData;", "processingData", "Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;", "(Lcom/discover/mpos/sdk/cardreader/config/CombinationConfiguration;Lcom/discover/mpos/sdk/transaction/TransactionData;Lcom/discover/mpos/sdk/transaction/processing/ProcessingData;)V", "cardFeatureDescriptor", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/data/CardFeatureDescriptor;", "getCardFeatureDescriptor$mpos_sdk_card_reader_offlineRegularRelease", "()Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/data/CardFeatureDescriptor;", "cardFeatureVersionNumber", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getCardFeatureVersionNumber$mpos_sdk_card_reader_offlineRegularRelease", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getCombinationConfiguration$mpos_sdk_card_reader_offlineRegularRelease", "()Lcom/discover/mpos/sdk/cardreader/config/CombinationConfiguration;", "dataStorageDirectory", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/model/DataStorageDirectory;", "getDataStorageDirectory$mpos_sdk_card_reader_offlineRegularRelease", "()Lcom/discover/mpos/sdk/cardreader/kernel/flow/readdatastorage/model/DataStorageDirectory;", "extendedSelectionData", "getExtendedSelectionData$mpos_sdk_card_reader_offlineRegularRelease", "preProcessingIndicators", "Lcom/discover/mpos/sdk/transaction/processing/PreProcessingIndicators;", "getPreProcessingIndicators$mpos_sdk_card_reader_offlineRegularRelease", "()Lcom/discover/mpos/sdk/transaction/processing/PreProcessingIndicators;", "getTransactionData$mpos_sdk_card_reader_offlineRegularRelease", "()Lcom/discover/mpos/sdk/transaction/TransactionData;", "writeDataStorageContent", "", "getWriteDataStorageContent", "()[B", "setWriteDataStorageContent", "([B)V", "isRepresentmentPossible", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class WriteDataStorageUpdate {
    private final com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor cardFeatureDescriptor;
    private final com.discover.mpos.sdk.core.emv.tlv.Tlv cardFeatureVersionNumber;
    private final com.discover.mpos.sdk.cardreader.config.CombinationConfiguration combinationConfiguration;
    private final com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory dataStorageDirectory;
    private final com.discover.mpos.sdk.core.emv.tlv.Tlv extendedSelectionData;
    private final com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators preProcessingIndicators;
    private final com.discover.mpos.sdk.transaction.TransactionData transactionData;
    private byte[] writeDataStorageContent;

    public WriteDataStorageUpdate(com.discover.mpos.sdk.cardreader.config.CombinationConfiguration combinationConfiguration, com.discover.mpos.sdk.transaction.TransactionData transactionData, com.discover.mpos.sdk.transaction.processing.ProcessingData processingData) {
        java.lang.Object m23436constructorimpl;
        com.discover.mpos.sdk.core.emv.tlv.Tlv extendedSelectionData;
        com.discover.mpos.sdk.core.emv.tlv.Tlv copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(processingData, "");
        this.combinationConfiguration = combinationConfiguration;
        this.transactionData = transactionData;
        this.preProcessingIndicators = processingData.n().copy();
        com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate candidate = processingData.h.c;
        this.extendedSelectionData = (candidate == null || (extendedSelectionData = candidate.getExtendedSelectionData()) == null || (copy = extendedSelectionData.copy()) == null) ? new com.discover.mpos.sdk.core.emv.tlv.Tlv(com.discover.mpos.sdk.core.emv.tlv.Tag.EXTENDED_SELECTION.getTag(), null, 0, 0, 14, null) : copy;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory c = processingData.c();
            byte[] bArr = c.c;
            byte[] copyOf = java.util.Arrays.copyOf(bArr, bArr.length);
            byte[] bArr2 = c.d;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(new com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory(copyOf, java.util.Arrays.copyOf(bArr2, bArr2.length), c.e));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        this.dataStorageDirectory = (com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory) (kotlin.Result.m23441isFailureimpl(m23436constructorimpl) ? null : m23436constructorimpl);
        com.discover.mpos.sdk.core.emv.tlv.Tlv t = processingData.t();
        this.cardFeatureVersionNumber = t != null ? t.copy() : null;
        com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor s = processingData.s();
        this.cardFeatureDescriptor = s != null ? s.a() : null;
        this.writeDataStorageContent = new byte[0];
    }

    /* renamed from: getCombinationConfiguration$mpos_sdk_card_reader_offlineRegularRelease, reason: from getter */
    public final com.discover.mpos.sdk.cardreader.config.CombinationConfiguration getCombinationConfiguration() {
        return this.combinationConfiguration;
    }

    /* renamed from: getTransactionData$mpos_sdk_card_reader_offlineRegularRelease, reason: from getter */
    public final com.discover.mpos.sdk.transaction.TransactionData getTransactionData() {
        return this.transactionData;
    }

    /* renamed from: getPreProcessingIndicators$mpos_sdk_card_reader_offlineRegularRelease, reason: from getter */
    public final com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators getPreProcessingIndicators() {
        return this.preProcessingIndicators;
    }

    /* renamed from: getExtendedSelectionData$mpos_sdk_card_reader_offlineRegularRelease, reason: from getter */
    public final com.discover.mpos.sdk.core.emv.tlv.Tlv getExtendedSelectionData() {
        return this.extendedSelectionData;
    }

    /* renamed from: getDataStorageDirectory$mpos_sdk_card_reader_offlineRegularRelease, reason: from getter */
    public final com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory getDataStorageDirectory() {
        return this.dataStorageDirectory;
    }

    /* renamed from: getCardFeatureVersionNumber$mpos_sdk_card_reader_offlineRegularRelease, reason: from getter */
    public final com.discover.mpos.sdk.core.emv.tlv.Tlv getCardFeatureVersionNumber() {
        return this.cardFeatureVersionNumber;
    }

    /* renamed from: getCardFeatureDescriptor$mpos_sdk_card_reader_offlineRegularRelease, reason: from getter */
    public final com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor getCardFeatureDescriptor() {
        return this.cardFeatureDescriptor;
    }

    public final byte[] getWriteDataStorageContent() {
        return this.writeDataStorageContent;
    }

    public final void setWriteDataStorageContent(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.writeDataStorageContent = bArr;
    }

    public final boolean isRepresentmentPossible() {
        return this.writeDataStorageContent.length != 0;
    }
}
