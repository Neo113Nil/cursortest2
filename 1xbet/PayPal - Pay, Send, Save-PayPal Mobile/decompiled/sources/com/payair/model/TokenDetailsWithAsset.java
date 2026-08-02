package com.payair.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/payair/model/TokenDetailsWithAsset;", "", "Lcom/payair/model/TokenDetails;", "tokenDetails", "Lcom/payair/model/Asset;", com.payair.db.TokenDetailsDaoInternal.ASSET_FILE_NAME_PREFIX, "<init>", "(Lcom/payair/model/TokenDetails;Lcom/payair/model/Asset;)V", "component1", "()Lcom/payair/model/TokenDetails;", "component2", "()Lcom/payair/model/Asset;", "copy", "(Lcom/payair/model/TokenDetails;Lcom/payair/model/Asset;)Lcom/payair/model/TokenDetailsWithAsset;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/payair/model/Asset;", "getAsset", "Lcom/payair/model/TokenDetails;", "getTokenDetails"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TokenDetailsWithAsset {
    private final com.payair.model.Asset asset;
    private final com.payair.model.TokenDetails tokenDetails;

    public TokenDetailsWithAsset(com.payair.model.TokenDetails tokenDetails, com.payair.model.Asset asset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenDetails, "");
        this.tokenDetails = tokenDetails;
        this.asset = asset;
    }

    public final com.payair.model.Asset getAsset() {
        return this.asset;
    }

    public final com.payair.model.TokenDetails getTokenDetails() {
        return this.tokenDetails;
    }

    public final java.lang.String toString() {
        com.payair.model.TokenDetails tokenDetails = this.tokenDetails;
        com.payair.model.Asset asset = this.asset;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TokenDetailsWithAsset(tokenDetails=");
        sb.append(tokenDetails);
        sb.append(", asset=");
        sb.append(asset);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.tokenDetails.hashCode();
        com.payair.model.Asset asset = this.asset;
        return (hashCode * 31) + (asset == null ? 0 : asset.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.payair.model.TokenDetailsWithAsset)) {
            return false;
        }
        com.payair.model.TokenDetailsWithAsset tokenDetailsWithAsset = (com.payair.model.TokenDetailsWithAsset) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.tokenDetails, tokenDetailsWithAsset.tokenDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.asset, tokenDetailsWithAsset.asset);
    }

    public final com.payair.model.TokenDetailsWithAsset copy(com.payair.model.TokenDetails tokenDetails, com.payair.model.Asset asset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenDetails, "");
        return new com.payair.model.TokenDetailsWithAsset(tokenDetails, asset);
    }

    /* renamed from: component2, reason: from getter */
    public final com.payair.model.Asset getAsset() {
        return this.asset;
    }

    /* renamed from: component1, reason: from getter */
    public final com.payair.model.TokenDetails getTokenDetails() {
        return this.tokenDetails;
    }

    public static /* synthetic */ com.payair.model.TokenDetailsWithAsset copy$default(com.payair.model.TokenDetailsWithAsset tokenDetailsWithAsset, com.payair.model.TokenDetails tokenDetails, com.payair.model.Asset asset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            tokenDetails = tokenDetailsWithAsset.tokenDetails;
        }
        if ((i & 2) != 0) {
            asset = tokenDetailsWithAsset.asset;
        }
        return tokenDetailsWithAsset.copy(tokenDetails, asset);
    }
}
