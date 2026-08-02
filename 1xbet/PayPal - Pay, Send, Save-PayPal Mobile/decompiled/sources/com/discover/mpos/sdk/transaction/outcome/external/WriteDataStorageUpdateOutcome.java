package com.discover.mpos.sdk.transaction.outcome.external;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u0004\u0018\u00010\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\nX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u0016X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/discover/mpos/sdk/transaction/outcome/external/WriteDataStorageUpdateOutcome;", "", "internalWriteDataStorage", "Lcom/discover/mpos/sdk/cardreader/entrypoint/model/WriteDataStorageUpdate;", "(Lcom/discover/mpos/sdk/cardreader/entrypoint/model/WriteDataStorageUpdate;)V", "cardFeatureDescriptor", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/data/CardFeatureDescriptor;", "getCardFeatureDescriptor$mpos_sdk_card_reader_offlineRegularRelease", "()Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/data/CardFeatureDescriptor;", "cardFeatureVersionNumber", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getCardFeatureVersionNumber$mpos_sdk_card_reader_offlineRegularRelease", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "dataStorageDirectory", "Lcom/discover/mpos/sdk/transaction/outcome/external/DataStorageDirectoryOutcome;", "getDataStorageDirectory$mpos_sdk_card_reader_offlineRegularRelease", "()Lcom/discover/mpos/sdk/transaction/outcome/external/DataStorageDirectoryOutcome;", "extendedSelectionData", "getExtendedSelectionData$mpos_sdk_card_reader_offlineRegularRelease", "getInternalWriteDataStorage", "()Lcom/discover/mpos/sdk/cardreader/entrypoint/model/WriteDataStorageUpdate;", "preProcessingIndicators", "Lcom/discover/mpos/sdk/transaction/processing/PreProcessingIndicators;", "getPreProcessingIndicators$mpos_sdk_card_reader_offlineRegularRelease", "()Lcom/discover/mpos/sdk/transaction/processing/PreProcessingIndicators;", "writeDataStorageContent", "", "getWriteDataStorageContent", "()[B", "setWriteDataStorageContent", "([B)V", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class WriteDataStorageUpdateOutcome {
    private final com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor cardFeatureDescriptor;
    private final com.discover.mpos.sdk.core.emv.tlv.Tlv cardFeatureVersionNumber;
    private final com.discover.mpos.sdk.transaction.outcome.external.DataStorageDirectoryOutcome dataStorageDirectory;
    private final com.discover.mpos.sdk.core.emv.tlv.Tlv extendedSelectionData;
    private final transient com.discover.mpos.sdk.cardreader.entrypoint.model.WriteDataStorageUpdate internalWriteDataStorage;
    private final com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators preProcessingIndicators;
    private byte[] writeDataStorageContent;

    public WriteDataStorageUpdateOutcome(com.discover.mpos.sdk.cardreader.entrypoint.model.WriteDataStorageUpdate writeDataStorageUpdate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(writeDataStorageUpdate, "");
        this.internalWriteDataStorage = writeDataStorageUpdate;
        this.preProcessingIndicators = writeDataStorageUpdate.getPreProcessingIndicators().copy();
        this.extendedSelectionData = writeDataStorageUpdate.getExtendedSelectionData().copy();
        com.discover.mpos.sdk.cardreader.kernel.flow.readdatastorage.model.DataStorageDirectory dataStorageDirectory = writeDataStorageUpdate.getDataStorageDirectory();
        this.dataStorageDirectory = dataStorageDirectory != null ? new com.discover.mpos.sdk.transaction.outcome.external.DataStorageDirectoryOutcome(dataStorageDirectory) : null;
        com.discover.mpos.sdk.core.emv.tlv.Tlv cardFeatureVersionNumber = writeDataStorageUpdate.getCardFeatureVersionNumber();
        this.cardFeatureVersionNumber = cardFeatureVersionNumber != null ? cardFeatureVersionNumber.copy() : null;
        com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.CardFeatureDescriptor cardFeatureDescriptor = writeDataStorageUpdate.getCardFeatureDescriptor();
        this.cardFeatureDescriptor = cardFeatureDescriptor != null ? cardFeatureDescriptor.a() : null;
        byte[] writeDataStorageContent = writeDataStorageUpdate.getWriteDataStorageContent();
        this.writeDataStorageContent = java.util.Arrays.copyOf(writeDataStorageContent, writeDataStorageContent.length);
    }

    public final com.discover.mpos.sdk.cardreader.entrypoint.model.WriteDataStorageUpdate getInternalWriteDataStorage() {
        return this.internalWriteDataStorage;
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
    public final com.discover.mpos.sdk.transaction.outcome.external.DataStorageDirectoryOutcome getDataStorageDirectory() {
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
}
