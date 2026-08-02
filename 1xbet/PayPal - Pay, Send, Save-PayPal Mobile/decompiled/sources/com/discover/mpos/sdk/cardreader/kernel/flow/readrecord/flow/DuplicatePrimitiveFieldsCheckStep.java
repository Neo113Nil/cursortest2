package com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.flow;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/readrecord/flow/DuplicatePrimitiveFieldsCheckStep;", "Lcom/discover/mpos/sdk/transaction/execution/TransactionExecutionStep;", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/readrecord/model/ReadRecordData;", "()V", "execute", "", "transaction", "Lcom/discover/mpos/sdk/transaction/execution/TransactionEx;", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.k.b.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final class DuplicatePrimitiveFieldsCheckStep implements com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep<com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordData> {
    @Override // com.discover.mpos.sdk.flow.ExecutionStep
    public final /* synthetic */ void a(com.discover.mpos.sdk.flow.ExecutionFlow executionFlow, java.lang.Object obj) {
        com.discover.mpos.sdk.transaction.execution.TransactionEx transactionEx = (com.discover.mpos.sdk.transaction.execution.TransactionEx) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executionFlow, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep.a.a(this, executionFlow, transactionEx);
    }

    @Override // com.discover.mpos.sdk.transaction.execution.TransactionExecutionStep
    public final void a(com.discover.mpos.sdk.transaction.execution.TransactionEx<com.discover.mpos.sdk.cardreader.kernel.flow.readrecord.model.ReadRecordData> transactionEx) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionEx, "");
        java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) transactionEx.q().d, (java.lang.Iterable) transactionEx.j().d());
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(plus, 10));
        java.util.Iterator it = plus.iterator();
        while (it.hasNext()) {
            arrayList.add(((com.discover.mpos.sdk.core.emv.tlv.Tlv) it.next()).getTag());
        }
        java.util.ArrayList<java.lang.String> arrayList2 = arrayList;
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.String str : arrayList2) {
            if (!linkedHashSet.add(str)) {
                arrayList3.add(str);
            }
        }
        boolean z = arrayList2.size() == linkedHashSet.size();
        new java.lang.Object[]{java.lang.Boolean.valueOf(!z), arrayList3};
        if (z) {
            transactionEx.t();
        } else {
            com.discover.mpos.sdk.transaction.execution.TransactionFlowHandler.a.a(transactionEx, com.discover.mpos.sdk.transaction.execution.TransactionEndStatus.b, null, false, 6);
        }
    }
}
