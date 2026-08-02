package com.discover.mpos.sdk.transaction.execution;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J*\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0012\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0011H&J\b\u0010\u0012\u001a\u00020\u0003H&J\b\u0010\u0013\u001a\u00020\u0003H&¨\u0006\u0014"}, d2 = {"Lcom/discover/mpos/sdk/transaction/execution/TransactionFlowHandler;", "", "approve", "", "decline", "deferredAuthorization", "endApplication", "status", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEndStatus;", "messageIdentifier", "Lcom/discover/mpos/sdk/transaction/outcome/UiRequest$MessageIdentifier;", "isDataRecordPresent", "", "onlineRequest", "performTearingAnalysis", "tryAgain", "tryAgainOutcomeType", "Lcom/discover/mpos/sdk/transaction/outcome/TryAgainOutcomeType;", "tryAnotherInterface", "tryAnotherInterfaceOrDecline", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.transaction.a.k, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public interface TransactionFlowHandler {
    void A();

    void a(int i, com.discover.mpos.sdk.transaction.outcome.UiRequest.MessageIdentifier messageIdentifier, boolean z);

    void a(com.discover.mpos.sdk.transaction.outcome.TryAgainOutcomeType tryAgainOutcomeType);

    void u();

    void v();

    void w();

    void x();

    void y();

    void z();

    @kotlin.Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 1})
    /* renamed from: com.discover.mpos.sdk.transaction.a.k$a */
    public static final class a {
        public static /* synthetic */ void a(com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler transactionFlowHandler, int i, com.discover.mpos.sdk.transaction.outcome.UiRequest.MessageIdentifier messageIdentifier, boolean z, int i2) {
            if ((i2 & 1) != 0) {
                i = 0;
            }
            if ((i2 & 2) != 0) {
                messageIdentifier = com.discover.mpos.sdk.transaction.outcome.UiRequest.MessageIdentifier.INSERT_SWIPE_OR_TRY_ANOTHER_CARD;
            }
            if ((i2 & 4) != 0) {
                z = false;
            }
            transactionFlowHandler.a(i, messageIdentifier, z);
        }
    }
}
