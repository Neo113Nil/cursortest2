package com.paypal.oslo.downloads.impl.engine;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u0003\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/downloads/impl/engine/ResumeInfo;", "", "", "isResuming", "serverSupportsResume", "", "contentRangeStart", "<init>", "(ZZLjava/lang/Long;)V", "component1", "()Z", "component2", "component3", "()Ljava/lang/Long;", "copy", "(ZZLjava/lang/Long;)Lcom/paypal/oslo/downloads/impl/engine/ResumeInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getServerSupportsResume", "Ljava/lang/Long;", "getContentRangeStart"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ResumeInfo {
    private final java.lang.Long contentRangeStart;
    private final boolean isResuming;
    private final boolean serverSupportsResume;

    public ResumeInfo(boolean z, boolean z2, java.lang.Long l) {
        this.isResuming = z;
        this.serverSupportsResume = z2;
        this.contentRangeStart = l;
    }

    public final boolean isResuming() {
        return this.isResuming;
    }

    public final boolean getServerSupportsResume() {
        return this.serverSupportsResume;
    }

    public final java.lang.Long getContentRangeStart() {
        return this.contentRangeStart;
    }

    public final java.lang.String toString() {
        boolean z = this.isResuming;
        boolean z2 = this.serverSupportsResume;
        java.lang.Long l = this.contentRangeStart;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ResumeInfo(isResuming=");
        sb.append(z);
        sb.append(", serverSupportsResume=");
        sb.append(z2);
        sb.append(", contentRangeStart=");
        sb.append(l);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isResuming);
        int hashCode2 = java.lang.Boolean.hashCode(this.serverSupportsResume);
        java.lang.Long l = this.contentRangeStart;
        return (((hashCode * 31) + hashCode2) * 31) + (l == null ? 0 : l.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.downloads.impl.engine.ResumeInfo)) {
            return false;
        }
        com.paypal.oslo.downloads.impl.engine.ResumeInfo resumeInfo = (com.paypal.oslo.downloads.impl.engine.ResumeInfo) other;
        return this.isResuming == resumeInfo.isResuming && this.serverSupportsResume == resumeInfo.serverSupportsResume && kotlin.jvm.internal.Intrinsics.areEqual(this.contentRangeStart, resumeInfo.contentRangeStart);
    }

    public final com.paypal.oslo.downloads.impl.engine.ResumeInfo copy(boolean isResuming, boolean serverSupportsResume, java.lang.Long contentRangeStart) {
        return new com.paypal.oslo.downloads.impl.engine.ResumeInfo(isResuming, serverSupportsResume, contentRangeStart);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Long getContentRangeStart() {
        return this.contentRangeStart;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getServerSupportsResume() {
        return this.serverSupportsResume;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsResuming() {
        return this.isResuming;
    }

    public static /* synthetic */ com.paypal.oslo.downloads.impl.engine.ResumeInfo copy$default(com.paypal.oslo.downloads.impl.engine.ResumeInfo resumeInfo, boolean z, boolean z2, java.lang.Long l, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = resumeInfo.isResuming;
        }
        if ((i & 2) != 0) {
            z2 = resumeInfo.serverSupportsResume;
        }
        if ((i & 4) != 0) {
            l = resumeInfo.contentRangeStart;
        }
        return resumeInfo.copy(z, z2, l);
    }
}
