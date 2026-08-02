package com.discover.mpos.sdk.data;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000bH&J\b\u0010\u0011\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018H&R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/discover/mpos/sdk/data/TearingRecoveryStorage;", "Lcom/discover/mpos/sdk/core/emv/Clearable;", "additionalData", "Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "getAdditionalData", "()Lcom/discover/mpos/sdk/core/emv/tlv/Tlv;", "parameterP1", "", "getParameterP1", "()I", "pdolData", "Lcom/discover/mpos/sdk/transaction/processing/pdol/PdolData;", "getPdolData", "()Lcom/discover/mpos/sdk/transaction/processing/pdol/PdolData;", "fillPdolData", "", "transactionPdolData", "isEmpty", "", "isTearingRecoveryLogValidForRetrieval", "newData", "Lcom/discover/mpos/sdk/data/TearingRecoveryLogMatchingData;", "saveTransactionDetails", "tearingLogTransactionDetails", "Lcom/discover/mpos/sdk/data/TearingLogTransactionDetails;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.data.e, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public interface TearingRecoveryStorage extends com.discover.mpos.sdk.core.emv.Clearable {
    int a();

    void a(com.discover.mpos.sdk.data.TearingLogTransactionDetails tearingLogTransactionDetails);

    void a(com.discover.mpos.sdk.transaction.processing.pdol.PdolData pdolData);

    boolean a(com.discover.mpos.sdk.data.TearingRecoveryLogMatchingData tearingRecoveryLogMatchingData);

    com.discover.mpos.sdk.transaction.processing.pdol.PdolData b();

    com.discover.mpos.sdk.core.emv.tlv.Tlv c();

    boolean d();
}
