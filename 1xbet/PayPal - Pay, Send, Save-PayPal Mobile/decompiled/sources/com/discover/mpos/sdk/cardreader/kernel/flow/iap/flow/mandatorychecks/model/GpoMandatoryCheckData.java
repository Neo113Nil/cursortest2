package com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.model;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/iap/flow/mandatorychecks/model/GpoMandatoryCheckData;", "", "getProcessingOptionsResponse", "Lcom/discover/mpos/sdk/card/apdu/gpo/GetProcessingOptionsResponse;", "preProcessingIndicators", "Lcom/discover/mpos/sdk/transaction/processing/PreProcessingIndicators;", "(Lcom/discover/mpos/sdk/card/apdu/gpo/GetProcessingOptionsResponse;Lcom/discover/mpos/sdk/transaction/processing/PreProcessingIndicators;)V", "getGetProcessingOptionsResponse", "()Lcom/discover/mpos/sdk/card/apdu/gpo/GetProcessingOptionsResponse;", "getPreProcessingIndicators", "()Lcom/discover/mpos/sdk/transaction/processing/PreProcessingIndicators;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.c.a.b.b.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class GpoMandatoryCheckData {

    /* renamed from: a, reason: collision with root package name */
    public final com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse f3033a;
    public final com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators b;

    public GpoMandatoryCheckData(com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse getProcessingOptionsResponse, com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators preProcessingIndicators) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getProcessingOptionsResponse, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(preProcessingIndicators, "");
        this.f3033a = getProcessingOptionsResponse;
        this.b = preProcessingIndicators;
    }

    public final java.lang.String toString() {
        return com.discover.mpos.sdk.core.extensions.StringExtensionsKt.toJSONString(this);
    }

    public final int hashCode() {
        com.discover.mpos.sdk.card.apdu.gpo.GetProcessingOptionsResponse getProcessingOptionsResponse = this.f3033a;
        int hashCode = getProcessingOptionsResponse != null ? getProcessingOptionsResponse.hashCode() : 0;
        com.discover.mpos.sdk.transaction.processing.PreProcessingIndicators preProcessingIndicators = this.b;
        return (hashCode * 31) + (preProcessingIndicators != null ? preProcessingIndicators.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.model.GpoMandatoryCheckData)) {
            return false;
        }
        com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.model.GpoMandatoryCheckData gpoMandatoryCheckData = (com.discover.mpos.sdk.cardreader.kernel.flow.iap.flow.mandatorychecks.model.GpoMandatoryCheckData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f3033a, gpoMandatoryCheckData.f3033a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, gpoMandatoryCheckData.b);
    }
}
