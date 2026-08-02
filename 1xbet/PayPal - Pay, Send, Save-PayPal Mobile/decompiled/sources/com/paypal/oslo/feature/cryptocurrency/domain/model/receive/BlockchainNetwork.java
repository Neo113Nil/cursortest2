package com.paypal.oslo.feature.cryptocurrency.domain.model.receive;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJD\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001e\u0010\fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b\u0007\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b \u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/receive/BlockchainNetwork;", "", "", "id", "name", "blockchain", "", "isDefault", "imageUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/receive/BlockchainNetwork;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getName", "getBlockchain", "Z", "getImageUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BlockchainNetwork {
    public static final int $stable = 0;
    private final java.lang.String blockchain;
    private final java.lang.String id;
    private final java.lang.String imageUrl;
    private final boolean isDefault;
    private final java.lang.String name;

    public BlockchainNetwork(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.id = str;
        this.name = str2;
        this.blockchain = str3;
        this.isDefault = z;
        this.imageUrl = str4;
    }

    public /* synthetic */ BlockchainNetwork(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? null : str4);
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getBlockchain() {
        return this.blockchain;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }

    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.name;
        java.lang.String str3 = this.blockchain;
        boolean z = this.isDefault;
        java.lang.String str4 = this.imageUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BlockchainNetwork(id=");
        sb.append(str);
        sb.append(", name=");
        sb.append(str2);
        sb.append(", blockchain=");
        sb.append(str3);
        sb.append(", isDefault=");
        sb.append(z);
        sb.append(", imageUrl=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.name.hashCode();
        int hashCode3 = this.blockchain.hashCode();
        int hashCode4 = java.lang.Boolean.hashCode(this.isDefault);
        java.lang.String str = this.imageUrl;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork blockchainNetwork = (com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, blockchainNetwork.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, blockchainNetwork.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.blockchain, blockchainNetwork.blockchain) && this.isDefault == blockchainNetwork.isDefault && kotlin.jvm.internal.Intrinsics.areEqual(this.imageUrl, blockchainNetwork.imageUrl);
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork copy(java.lang.String id, java.lang.String name2, java.lang.String blockchain, boolean isDefault, java.lang.String imageUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockchain, "");
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork(id, name2, blockchain, isDefault, imageUrl);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getBlockchain() {
        return this.blockchain;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork copy$default(com.paypal.oslo.feature.cryptocurrency.domain.model.receive.BlockchainNetwork blockchainNetwork, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = blockchainNetwork.id;
        }
        if ((i & 2) != 0) {
            str2 = blockchainNetwork.name;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = blockchainNetwork.blockchain;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            z = blockchainNetwork.isDefault;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            str4 = blockchainNetwork.imageUrl;
        }
        return blockchainNetwork.copy(str, str5, str6, z2, str4);
    }
}
