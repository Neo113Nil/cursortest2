package com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.flow.auc;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/processingrestrictions/flow/auc/AucData;", "", "isCountryCodeMatch", "", "applicationUsageControl", "Lcom/discover/mpos/sdk/cardreader/kernel/flow/processingrestrictions/model/ApplicationUsageControl;", "(ZLcom/discover/mpos/sdk/cardreader/kernel/flow/processingrestrictions/model/ApplicationUsageControl;)V", "getApplicationUsageControl", "()Lcom/discover/mpos/sdk/cardreader/kernel/flow/processingrestrictions/model/ApplicationUsageControl;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.j.a.a.c, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class AucData {

    /* renamed from: a, reason: collision with root package name */
    final boolean f3161a;
    final com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.model.ApplicationUsageControl b;

    public AucData(boolean z, com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.model.ApplicationUsageControl applicationUsageControl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationUsageControl, "");
        this.f3161a = z;
        this.b = applicationUsageControl;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AucData(isCountryCodeMatch=");
        sb.append(this.f3161a);
        sb.append(", applicationUsageControl=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public final int hashCode() {
        boolean z = this.f3161a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.model.ApplicationUsageControl applicationUsageControl = this.b;
        return (r0 * 31) + (applicationUsageControl != null ? applicationUsageControl.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.flow.auc.AucData)) {
            return false;
        }
        com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.flow.auc.AucData aucData = (com.discover.mpos.sdk.cardreader.kernel.flow.processingrestrictions.flow.auc.AucData) other;
        return this.f3161a == aucData.f3161a && kotlin.jvm.internal.Intrinsics.areEqual(this.b, aucData.b);
    }
}
