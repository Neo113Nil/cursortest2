package com.zettle.sdk.commons.network;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/zettle/sdk/commons/network/ActiveNetworkInfo;", "", "", "network", "Lcom/zettle/sdk/commons/network/Network$Type;", "type", "<init>", "(ILcom/zettle/sdk/commons/network/Network$Type;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", com.visa.cbp.getEncExpo.warmup, "getNetwork", "Lcom/zettle/sdk/commons/network/Network$Type;", "getType", "()Lcom/zettle/sdk/commons/network/Network$Type;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ActiveNetworkInfo {
    private final int network;
    private final com.zettle.sdk.commons.network.Network.Type type;

    public ActiveNetworkInfo(int i, com.zettle.sdk.commons.network.Network.Type type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        this.network = i;
        this.type = type;
    }

    public final int getNetwork() {
        return this.network;
    }

    public final com.zettle.sdk.commons.network.Network.Type getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.network;
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.zettle.sdk.commons.network.ActiveNetworkInfo) && ((com.zettle.sdk.commons.network.ActiveNetworkInfo) other).network == this.network;
    }
}
