package com.paypal.oslo.core.webview.domain.models;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u0019\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/webview/domain/models/TrustedHosts;", "", "", "", "exactHosts", "", "domains", "<init>", "(Ljava/util/Set;Ljava/util/List;)V", "component1", "()Ljava/util/Set;", "component2", "()Ljava/util/List;", "copy", "(Ljava/util/Set;Ljava/util/List;)Lcom/paypal/oslo/core/webview/domain/models/TrustedHosts;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/util/Set;", "getExactHosts", "Ljava/util/List;", "getDomains"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class TrustedHosts {
    public static final int $stable = 8;
    private final java.util.List<java.lang.String> domains;
    private final java.util.Set<java.lang.String> exactHosts;

    public TrustedHosts(java.util.Set<java.lang.String> set, java.util.List<java.lang.String> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.exactHosts = set;
        this.domains = list;
    }

    public final java.util.Set<java.lang.String> getExactHosts() {
        return this.exactHosts;
    }

    public final java.util.List<java.lang.String> getDomains() {
        return this.domains;
    }

    public final java.lang.String toString() {
        java.util.Set<java.lang.String> set = this.exactHosts;
        java.util.List<java.lang.String> list = this.domains;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TrustedHosts(exactHosts=");
        sb.append(set);
        sb.append(", domains=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.exactHosts.hashCode() * 31) + this.domains.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.webview.domain.models.TrustedHosts)) {
            return false;
        }
        com.paypal.oslo.core.webview.domain.models.TrustedHosts trustedHosts = (com.paypal.oslo.core.webview.domain.models.TrustedHosts) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.exactHosts, trustedHosts.exactHosts) && kotlin.jvm.internal.Intrinsics.areEqual(this.domains, trustedHosts.domains);
    }

    public final com.paypal.oslo.core.webview.domain.models.TrustedHosts copy(java.util.Set<java.lang.String> exactHosts, java.util.List<java.lang.String> domains) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exactHosts, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(domains, "");
        return new com.paypal.oslo.core.webview.domain.models.TrustedHosts(exactHosts, domains);
    }

    public final java.util.List<java.lang.String> component2() {
        return this.domains;
    }

    public final java.util.Set<java.lang.String> component1() {
        return this.exactHosts;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.core.webview.domain.models.TrustedHosts copy$default(com.paypal.oslo.core.webview.domain.models.TrustedHosts trustedHosts, java.util.Set set, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            set = trustedHosts.exactHosts;
        }
        if ((i & 2) != 0) {
            list = trustedHosts.domains;
        }
        return trustedHosts.copy(set, list);
    }
}
