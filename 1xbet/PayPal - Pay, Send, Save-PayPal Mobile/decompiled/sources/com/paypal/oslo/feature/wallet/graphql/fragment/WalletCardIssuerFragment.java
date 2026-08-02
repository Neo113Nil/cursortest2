package com.paypal.oslo.feature.wallet.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001c\u001a\u0004\b\u001e\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardIssuerFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "name", "id", "", "countryCode", "issuerProductDescription", "issuerAlternateName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Object;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/graphql/fragment/WalletCardIssuerFragment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "getId", "Ljava/lang/Object;", "getCountryCode", "getIssuerProductDescription", "getIssuerAlternateName"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class WalletCardIssuerFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.Object countryCode;
    private final java.lang.String id;
    private final java.lang.String issuerAlternateName;
    private final java.lang.String issuerProductDescription;
    private final java.lang.String name;

    public WalletCardIssuerFragment(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.String str3, java.lang.String str4) {
        this.name = str;
        this.id = str2;
        this.countryCode = obj;
        this.issuerProductDescription = str3;
        this.issuerAlternateName = str4;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.Object getCountryCode() {
        return this.countryCode;
    }

    public final java.lang.String getIssuerProductDescription() {
        return this.issuerProductDescription;
    }

    public final java.lang.String getIssuerAlternateName() {
        return this.issuerAlternateName;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        java.lang.String str2 = this.id;
        java.lang.Object obj = this.countryCode;
        java.lang.String str3 = this.issuerProductDescription;
        java.lang.String str4 = this.issuerAlternateName;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WalletCardIssuerFragment(name=");
        sb.append(str);
        sb.append(", id=");
        sb.append(str2);
        sb.append(", countryCode=");
        sb.append(obj);
        sb.append(", issuerProductDescription=");
        sb.append(str3);
        sb.append(", issuerAlternateName=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.name;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.id;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.Object obj = this.countryCode;
        int hashCode3 = obj == null ? 0 : obj.hashCode();
        java.lang.String str3 = this.issuerProductDescription;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.issuerAlternateName;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment walletCardIssuerFragment = (com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, walletCardIssuerFragment.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.id, walletCardIssuerFragment.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, walletCardIssuerFragment.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerProductDescription, walletCardIssuerFragment.issuerProductDescription) && kotlin.jvm.internal.Intrinsics.areEqual(this.issuerAlternateName, walletCardIssuerFragment.issuerAlternateName);
    }

    public final com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment copy(java.lang.String name2, java.lang.String id, java.lang.Object countryCode, java.lang.String issuerProductDescription, java.lang.String issuerAlternateName) {
        return new com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment(name2, id, countryCode, issuerProductDescription, issuerAlternateName);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getIssuerAlternateName() {
        return this.issuerAlternateName;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getIssuerProductDescription() {
        return this.issuerProductDescription;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Object getCountryCode() {
        return this.countryCode;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment copy$default(com.paypal.oslo.feature.wallet.graphql.fragment.WalletCardIssuerFragment walletCardIssuerFragment, java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = walletCardIssuerFragment.name;
        }
        if ((i & 2) != 0) {
            str2 = walletCardIssuerFragment.id;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            obj = walletCardIssuerFragment.countryCode;
        }
        java.lang.Object obj3 = obj;
        if ((i & 8) != 0) {
            str3 = walletCardIssuerFragment.issuerProductDescription;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            str4 = walletCardIssuerFragment.issuerAlternateName;
        }
        return walletCardIssuerFragment.copy(str, str5, obj3, str6, str4);
    }
}
