package com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data;

@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B#\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/discover/mpos/sdk/cardreader/kernel/flow/optionalfeature/data/OptionalFeatureData;", "", "candidate", "Lcom/discover/mpos/sdk/cardreader/entrypoint/model/Candidate;", "(Lcom/discover/mpos/sdk/cardreader/entrypoint/model/Candidate;)V", "dataStorageSupported", "", "extendedLoggingSupported", "tearingRecoverySupported", "(ZZZ)V", "getDataStorageSupported", "()Z", "getExtendedLoggingSupported", "getTearingRecoverySupported", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "mpos-sdk-card-reader_offlineRegularRelease"}, k = 1, mv = {1, 4, 1})
/* renamed from: com.discover.mpos.sdk.cardreader.kernel.flow.f.a.b, reason: from Kotlin metadata */
/* loaded from: classes8.dex */
public final /* data */ class OptionalFeatureData {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3145a;
    public final boolean b;
    public final boolean c;

    private OptionalFeatureData(boolean z, boolean z2, boolean z3) {
        this.f3145a = z;
        this.b = z2;
        this.c = z3;
    }

    public /* synthetic */ OptionalFeatureData() {
        this(false, false, false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public OptionalFeatureData(com.discover.mpos.sdk.cardreader.entrypoint.model.Candidate candidate) {
        this(candidate.getDataStorageSupported(), candidate.getExtendedLoggingSupported(), candidate.getTearingRecoverySupported());
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(candidate, "");
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("OptionalFeatureData(dataStorageSupported=");
        sb.append(this.f3145a);
        sb.append(", extendedLoggingSupported=");
        sb.append(this.b);
        sb.append(", tearingRecoverySupported=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public final int hashCode() {
        boolean z = this.f3145a;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        ?? r2 = this.b;
        int i = r2;
        if (r2 != 0) {
            i = 1;
        }
        boolean z2 = this.c;
        return (((r0 * 31) + i) * 31) + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.OptionalFeatureData)) {
            return false;
        }
        com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.OptionalFeatureData optionalFeatureData = (com.discover.mpos.sdk.cardreader.kernel.flow.optionalfeature.data.OptionalFeatureData) other;
        return this.f3145a == optionalFeatureData.f3145a && this.b == optionalFeatureData.b && this.c == optionalFeatureData.c;
    }
}
