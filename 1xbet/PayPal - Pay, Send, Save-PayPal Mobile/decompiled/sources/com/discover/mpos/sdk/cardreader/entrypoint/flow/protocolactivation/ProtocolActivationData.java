package com.discover.mpos.sdk.cardreader.entrypoint.flow.protocolactivation;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\b\u0010\"\u001a\u00020#H\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015¨\u0006$"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/entrypoint/flow/protocolactivation/ProtocolActivationData;", "", "candidateList", "Lcom/discover/mpos/sdk/cardreader/entrypoint/model/CandidateList;", "uiRequestOnOutcome", "Lcom/discover/mpos/sdk/transaction/outcome/UiRequest;", "uiRequestOnRestart", "restart", "", "connectionTimeOut", "", "(Lcom/discover/mpos/sdk/cardreader/entrypoint/model/CandidateList;Lcom/discover/mpos/sdk/transaction/outcome/UiRequest;Lcom/discover/mpos/sdk/transaction/outcome/UiRequest;ZJ)V", "getCandidateList", "()Lcom/discover/mpos/sdk/cardreader/entrypoint/model/CandidateList;", "getConnectionTimeOut", "()J", "getRestart", "()Z", "getUiRequestOnOutcome", "()Lcom/discover/mpos/sdk/transaction/outcome/UiRequest;", "setUiRequestOnOutcome", "(Lcom/discover/mpos/sdk/transaction/outcome/UiRequest;)V", "getUiRequestOnRestart", "setUiRequestOnRestart", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.entrypoint.a.c.a, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class ProtocolActivationData {

    /* renamed from: a, reason: collision with root package name */
    public final com.discover.mpos.sdk.cardreader.entrypoint.model.CandidateList f3000a;
    public com.discover.mpos.sdk.transaction.outcome.UiRequest b;
    public com.discover.mpos.sdk.transaction.outcome.UiRequest c;
    public final boolean d;
    public final long e;

    private ProtocolActivationData(com.discover.mpos.sdk.cardreader.entrypoint.model.CandidateList candidateList, com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequest, com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequest2, boolean z) {
        this.f3000a = candidateList;
        this.b = uiRequest;
        this.c = uiRequest2;
        this.d = z;
        this.e = 30000L;
    }

    public /* synthetic */ ProtocolActivationData(com.discover.mpos.sdk.cardreader.entrypoint.model.CandidateList candidateList, com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequest, com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequest2, boolean z, byte b) {
        this(candidateList, uiRequest, uiRequest2, z);
    }

    public final java.lang.String toString() {
        return com.discover.mpos.sdk.core.extensions.StringExtensionsKt.toJSONString(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        com.discover.mpos.sdk.cardreader.entrypoint.model.CandidateList candidateList = this.f3000a;
        int hashCode = candidateList != null ? candidateList.hashCode() : 0;
        com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequest = this.b;
        int hashCode2 = uiRequest != null ? uiRequest.hashCode() : 0;
        com.discover.mpos.sdk.transaction.outcome.UiRequest uiRequest2 = this.c;
        int hashCode3 = uiRequest2 != null ? uiRequest2.hashCode() : 0;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i) * 31) + java.lang.Long.hashCode(this.e);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.cardreader.entrypoint.flow.protocolactivation.ProtocolActivationData)) {
            return false;
        }
        com.discover.mpos.sdk.cardreader.entrypoint.flow.protocolactivation.ProtocolActivationData protocolActivationData = (com.discover.mpos.sdk.cardreader.entrypoint.flow.protocolactivation.ProtocolActivationData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.f3000a, protocolActivationData.f3000a) && kotlin.jvm.internal.Intrinsics.areEqual(this.b, protocolActivationData.b) && kotlin.jvm.internal.Intrinsics.areEqual(this.c, protocolActivationData.c) && this.d == protocolActivationData.d && this.e == protocolActivationData.e;
    }
}
