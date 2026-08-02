package com.discover.mpos.sdk.cardreader.entrypoint;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000f"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/EntryPoint;", "", "registerKernel", "", "combination", "Lcom/discover/mpos/sdk/cardreader/entrypoint/model/Combination;", "kernel", "Lcom/discover/mpos/sdk/cardreader/kernel/Kernel;", "startA", "transaction", "Lcom/discover/mpos/sdk/transaction/internal/InternalTransaction;", "startB", "startC", "startD", "startRePresentment", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public interface EntryPoint {
    void a(com.discover.mpos.sdk.cardreader.entrypoint.model.Combination combination, com.discover.mpos.sdk.cardreader.kernel.Kernel kernel);

    void a(com.discover.mpos.sdk.transaction.internal.InternalTransaction internalTransaction);

    void b(com.discover.mpos.sdk.transaction.internal.InternalTransaction internalTransaction);

    void c(com.discover.mpos.sdk.transaction.internal.InternalTransaction internalTransaction);
}
