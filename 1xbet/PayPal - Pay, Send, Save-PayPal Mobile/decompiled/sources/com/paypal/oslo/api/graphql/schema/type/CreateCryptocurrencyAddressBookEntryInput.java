package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/CreateCryptocurrencyAddressBookEntryInput;", "", "", "name", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyBlockchainNetwork;", "blockchainNetwork", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyBlockchainAddressInput;", "blockchainAddress", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyBlockchainNetwork;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyBlockchainAddressInput;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyBlockchainNetwork;", "component3", "()Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyBlockchainAddressInput;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyBlockchainNetwork;Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyBlockchainAddressInput;)Lcom/paypal/oslo/api/graphql/schema/type/CreateCryptocurrencyAddressBookEntryInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyBlockchainNetwork;", "getBlockchainNetwork", "Lcom/paypal/oslo/api/graphql/schema/type/CryptocurrencyBlockchainAddressInput;", "getBlockchainAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CreateCryptocurrencyAddressBookEntryInput {
    private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainAddressInput blockchainAddress;
    private final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork blockchainNetwork;
    private final java.lang.String name;

    public CreateCryptocurrencyAddressBookEntryInput(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainAddressInput cryptocurrencyBlockchainAddressInput) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyBlockchainNetwork, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptocurrencyBlockchainAddressInput, "");
        this.name = str;
        this.blockchainNetwork = cryptocurrencyBlockchainNetwork;
        this.blockchainAddress = cryptocurrencyBlockchainAddressInput;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork getBlockchainNetwork() {
        return this.blockchainNetwork;
    }

    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainAddressInput getBlockchainAddress() {
        return this.blockchainAddress;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork = this.blockchainNetwork;
        com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainAddressInput cryptocurrencyBlockchainAddressInput = this.blockchainAddress;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CreateCryptocurrencyAddressBookEntryInput(name=");
        sb.append(str);
        sb.append(", blockchainNetwork=");
        sb.append(cryptocurrencyBlockchainNetwork);
        sb.append(", blockchainAddress=");
        sb.append(cryptocurrencyBlockchainAddressInput);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.name.hashCode() * 31) + this.blockchainNetwork.hashCode()) * 31) + this.blockchainAddress.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyAddressBookEntryInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyAddressBookEntryInput createCryptocurrencyAddressBookEntryInput = (com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyAddressBookEntryInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, createCryptocurrencyAddressBookEntryInput.name) && this.blockchainNetwork == createCryptocurrencyAddressBookEntryInput.blockchainNetwork && kotlin.jvm.internal.Intrinsics.areEqual(this.blockchainAddress, createCryptocurrencyAddressBookEntryInput.blockchainAddress);
    }

    public final com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyAddressBookEntryInput copy(java.lang.String name2, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork blockchainNetwork, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainAddressInput blockchainAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockchainNetwork, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(blockchainAddress, "");
        return new com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyAddressBookEntryInput(name2, blockchainNetwork, blockchainAddress);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainAddressInput getBlockchainAddress() {
        return this.blockchainAddress;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork getBlockchainNetwork() {
        return this.blockchainNetwork;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyAddressBookEntryInput copy$default(com.paypal.oslo.api.graphql.schema.type.CreateCryptocurrencyAddressBookEntryInput createCryptocurrencyAddressBookEntryInput, java.lang.String str, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainNetwork cryptocurrencyBlockchainNetwork, com.paypal.oslo.api.graphql.schema.type.CryptocurrencyBlockchainAddressInput cryptocurrencyBlockchainAddressInput, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = createCryptocurrencyAddressBookEntryInput.name;
        }
        if ((i & 2) != 0) {
            cryptocurrencyBlockchainNetwork = createCryptocurrencyAddressBookEntryInput.blockchainNetwork;
        }
        if ((i & 4) != 0) {
            cryptocurrencyBlockchainAddressInput = createCryptocurrencyAddressBookEntryInput.blockchainAddress;
        }
        return createCryptocurrencyAddressBookEntryInput.copy(str, cryptocurrencyBlockchainNetwork, cryptocurrencyBlockchainAddressInput);
    }
}
