package androidx.work.impl.constraints;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u0004\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u0005\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u0006\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u0007\u0010\u000b"}, d2 = {"Landroidx/work/impl/constraints/NetworkState;", "", "", "isConnected", "isValidated", "isMetered", "isNotRoaming", "isBlocked", "<init>", "(ZZZZZ)V", "component1", "()Z", "component2", "component3", "component4", "component5", "copy", "(ZZZZZ)Landroidx/work/impl/constraints/NetworkState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NetworkState {
    private final boolean isBlocked;
    private final boolean isConnected;
    private final boolean isMetered;
    private final boolean isNotRoaming;
    private final boolean isValidated;

    public NetworkState(boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.isConnected = z;
        this.isValidated = z2;
        this.isMetered = z3;
        this.isNotRoaming = z4;
        this.isBlocked = z5;
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    public final boolean isValidated() {
        return this.isValidated;
    }

    public final boolean isMetered() {
        return this.isMetered;
    }

    public final boolean isNotRoaming() {
        return this.isNotRoaming;
    }

    public final boolean isBlocked() {
        return this.isBlocked;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkState(isConnected=");
        sb.append(this.isConnected);
        sb.append(", isValidated=");
        sb.append(this.isValidated);
        sb.append(", isMetered=");
        sb.append(this.isMetered);
        sb.append(", isNotRoaming=");
        sb.append(this.isNotRoaming);
        sb.append(", isBlocked=");
        sb.append(this.isBlocked);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((java.lang.Boolean.hashCode(this.isConnected) * 31) + java.lang.Boolean.hashCode(this.isValidated)) * 31) + java.lang.Boolean.hashCode(this.isMetered)) * 31) + java.lang.Boolean.hashCode(this.isNotRoaming)) * 31) + java.lang.Boolean.hashCode(this.isBlocked);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.work.impl.constraints.NetworkState)) {
            return false;
        }
        androidx.work.impl.constraints.NetworkState networkState = (androidx.work.impl.constraints.NetworkState) other;
        return this.isConnected == networkState.isConnected && this.isValidated == networkState.isValidated && this.isMetered == networkState.isMetered && this.isNotRoaming == networkState.isNotRoaming && this.isBlocked == networkState.isBlocked;
    }

    public final androidx.work.impl.constraints.NetworkState copy(boolean isConnected, boolean isValidated, boolean isMetered, boolean isNotRoaming, boolean isBlocked) {
        return new androidx.work.impl.constraints.NetworkState(isConnected, isValidated, isMetered, isNotRoaming, isBlocked);
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsBlocked() {
        return this.isBlocked;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsNotRoaming() {
        return this.isNotRoaming;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsMetered() {
        return this.isMetered;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsValidated() {
        return this.isValidated;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    public static /* synthetic */ androidx.work.impl.constraints.NetworkState copy$default(androidx.work.impl.constraints.NetworkState networkState, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = networkState.isConnected;
        }
        if ((i & 2) != 0) {
            z2 = networkState.isValidated;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = networkState.isMetered;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = networkState.isNotRoaming;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            z5 = networkState.isBlocked;
        }
        return networkState.copy(z, z6, z7, z8, z5);
    }
}
