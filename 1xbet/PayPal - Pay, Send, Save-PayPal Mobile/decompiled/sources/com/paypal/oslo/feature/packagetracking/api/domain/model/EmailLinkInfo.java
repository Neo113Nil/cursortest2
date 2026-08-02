package com.paypal.oslo.feature.packagetracking.api.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u0005\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/packagetracking/api/domain/model/EmailLinkInfo;", "", "", "provider", "", "isLinked", "needsRelink", "<init>", "(Ljava/lang/String;ZZ)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "copy", "(Ljava/lang/String;ZZ)Lcom/paypal/oslo/feature/packagetracking/api/domain/model/EmailLinkInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getProvider", "Z", "getNeedsRelink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class EmailLinkInfo {
    private final boolean isLinked;
    private final boolean needsRelink;
    private final java.lang.String provider;

    public EmailLinkInfo(java.lang.String str, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.provider = str;
        this.isLinked = z;
        this.needsRelink = z2;
    }

    public final java.lang.String getProvider() {
        return this.provider;
    }

    public final boolean isLinked() {
        return this.isLinked;
    }

    public final boolean getNeedsRelink() {
        return this.needsRelink;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.provider;
        boolean z = this.isLinked;
        boolean z2 = this.needsRelink;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("EmailLinkInfo(provider=");
        sb.append(str);
        sb.append(", isLinked=");
        sb.append(z);
        sb.append(", needsRelink=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.provider.hashCode() * 31) + java.lang.Boolean.hashCode(this.isLinked)) * 31) + java.lang.Boolean.hashCode(this.needsRelink);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.packagetracking.api.domain.model.EmailLinkInfo)) {
            return false;
        }
        com.paypal.oslo.feature.packagetracking.api.domain.model.EmailLinkInfo emailLinkInfo = (com.paypal.oslo.feature.packagetracking.api.domain.model.EmailLinkInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.provider, emailLinkInfo.provider) && this.isLinked == emailLinkInfo.isLinked && this.needsRelink == emailLinkInfo.needsRelink;
    }

    public final com.paypal.oslo.feature.packagetracking.api.domain.model.EmailLinkInfo copy(java.lang.String provider, boolean isLinked, boolean needsRelink) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        return new com.paypal.oslo.feature.packagetracking.api.domain.model.EmailLinkInfo(provider, isLinked, needsRelink);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getNeedsRelink() {
        return this.needsRelink;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsLinked() {
        return this.isLinked;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getProvider() {
        return this.provider;
    }

    public static /* synthetic */ com.paypal.oslo.feature.packagetracking.api.domain.model.EmailLinkInfo copy$default(com.paypal.oslo.feature.packagetracking.api.domain.model.EmailLinkInfo emailLinkInfo, java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = emailLinkInfo.provider;
        }
        if ((i & 2) != 0) {
            z = emailLinkInfo.isLinked;
        }
        if ((i & 4) != 0) {
            z2 = emailLinkInfo.needsRelink;
        }
        return emailLinkInfo.copy(str, z, z2);
    }
}
