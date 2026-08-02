package com.discover.mpos.sdk.transaction.processing;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0011\u001a\u00020\u0012J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f0\u000e0\r¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\t¨\u0006\u001d"}, d2 = {"Lcom/discover/mpos/sdk/transaction/processing/PreProcessingData;", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "Lcom/discover/mpos/sdk/transaction/TransactionData;", "combinations", "", "Lcom/discover/mpos/sdk/cardreader/config/CombinationConfiguration;", "(Lcom/discover/mpos/sdk/transaction/TransactionData;Ljava/util/List;)V", "getCombinations", "()Ljava/util/List;", "getData", "()Lcom/discover/mpos/sdk/transaction/TransactionData;", "preProcessingIndicators", "", "Lkotlin/Pair;", "Lcom/discover/mpos/sdk/transaction/processing/PreProcessingIndicators;", "getPreProcessingIndicators", "clearPreProcessingIndicators", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.transaction.processing.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class PreProcessingData {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List<kotlin.Pair<com.discover.mpos.sdk.cardreader.config.CombinationConfiguration, com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators>> f3271a;
    public final com.discover.mpos.sdk.transaction.TransactionData b;
    public final java.util.List<com.discover.mpos.sdk.cardreader.config.CombinationConfiguration> c;

    public PreProcessingData(com.discover.mpos.sdk.transaction.TransactionData transactionData, java.util.List<com.discover.mpos.sdk.cardreader.config.CombinationConfiguration> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.b = transactionData;
        this.c = list;
        this.f3271a = new java.util.ArrayList();
    }

    public final void a() {
        this.f3271a.clear();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(super.toString());
        sb.append("\npreProcessingIndicators=");
        sb.append(this.f3271a.toString());
        return sb.toString();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other != null ? other.getClass() : null)) {
            return false;
        }
        if (other == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type com.discover.mpos.sdk.transaction.processing.PreProcessingData");
        }
        com.discover.mpos.sdk.transaction.processing.PreProcessingData preProcessingData = (com.discover.mpos.sdk.transaction.processing.PreProcessingData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.b, preProcessingData.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, preProcessingData.c) && kotlin.jvm.internal.Intrinsics.areEqual(this.f3271a, preProcessingData.f3271a);
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.f3271a.hashCode();
    }
}
