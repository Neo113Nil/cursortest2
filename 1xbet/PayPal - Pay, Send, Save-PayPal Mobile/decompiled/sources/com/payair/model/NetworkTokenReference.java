package com.payair.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\"\u0010\u0005\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\u000b\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/payair/model/NetworkTokenReference;", "", "", "networkTokenReference", "", "isHandled", "<init>", "(Ljava/lang/String;Z)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "copy", "(Ljava/lang/String;Z)Lcom/payair/model/NetworkTokenReference;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "setHandled", "(Z)V", "Ljava/lang/String;", "getNetworkTokenReference"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NetworkTokenReference {
    private boolean isHandled;
    private final java.lang.String networkTokenReference;

    public NetworkTokenReference(java.lang.String str, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.networkTokenReference = str;
        this.isHandled = z;
    }

    public final java.lang.String getNetworkTokenReference() {
        return this.networkTokenReference;
    }

    public final boolean isHandled() {
        return this.isHandled;
    }

    public final void setHandled(boolean z) {
        this.isHandled = z;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.networkTokenReference;
        boolean z = this.isHandled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkTokenReference(networkTokenReference=");
        sb.append(str);
        sb.append(", isHandled=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.isHandled) + (this.networkTokenReference.hashCode() * 31);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.model.NetworkTokenReference)) {
            return false;
        }
        com.payair.model.NetworkTokenReference networkTokenReference = (com.payair.model.NetworkTokenReference) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.networkTokenReference, networkTokenReference.networkTokenReference) && this.isHandled == networkTokenReference.isHandled;
    }

    public final com.payair.model.NetworkTokenReference copy(java.lang.String networkTokenReference, boolean isHandled) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        return new com.payair.model.NetworkTokenReference(networkTokenReference, isHandled);
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsHandled() {
        return this.isHandled;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getNetworkTokenReference() {
        return this.networkTokenReference;
    }

    public static /* synthetic */ com.payair.model.NetworkTokenReference copy$default(com.payair.model.NetworkTokenReference networkTokenReference, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = networkTokenReference.networkTokenReference;
        }
        if ((i & 2) != 0) {
            z = networkTokenReference.isHandled;
        }
        return networkTokenReference.copy(str, z);
    }
}
