package com.paypal.oslo.api.graphql.schema.type;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJL\u0010\u000f\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00022\u0010\b\u0002\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R%\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001c\u0010\fR(\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00028\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u001a\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\f"}, d2 = {"Lcom/paypal/oslo/api/graphql/schema/type/WalletComponentsInput;", "", "Lcom/apollographql/apollo/api/Optional;", "", "Lcom/paypal/oslo/api/graphql/schema/type/WalletAccountType;", "walletTypes", "", "placementId", "surfaceId", "<init>", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)V", "component1", "()Lcom/apollographql/apollo/api/Optional;", "component2", "component3", "copy", "(Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;Lcom/apollographql/apollo/api/Optional;)Lcom/paypal/oslo/api/graphql/schema/type/WalletComponentsInput;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Lcom/apollographql/apollo/api/Optional;", "getWalletTypes", "getPlacementId", "getSurfaceId", "getSurfaceId$annotations", "()V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class WalletComponentsInput {
    private final com.apollographql.apollo.api.Optional<java.lang.String> placementId;
    private final com.apollographql.apollo.api.Optional<java.lang.String> surfaceId;
    private final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.WalletAccountType>> walletTypes;

    @kotlin.Deprecated(message = "Use `placementId` instead.")
    public static /* synthetic */ void getSurfaceId$annotations() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WalletComponentsInput(com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.WalletAccountType>> optional, com.apollographql.apollo.api.Optional<java.lang.String> optional2, com.apollographql.apollo.api.Optional<java.lang.String> optional3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(optional3, "");
        this.walletTypes = optional;
        this.placementId = optional2;
        this.surfaceId = optional3;
    }

    public /* synthetic */ WalletComponentsInput(com.apollographql.apollo.api.Optional.Absent absent, com.apollographql.apollo.api.Optional.Absent absent2, com.apollographql.apollo.api.Optional.Absent absent3, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent, (i & 2) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent2, (i & 4) != 0 ? com.apollographql.apollo.api.Optional.Absent.INSTANCE : absent3);
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.WalletAccountType>> getWalletTypes() {
        return this.walletTypes;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getPlacementId() {
        return this.placementId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> getSurfaceId() {
        return this.surfaceId;
    }

    public final java.lang.String toString() {
        com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.WalletAccountType>> optional = this.walletTypes;
        com.apollographql.apollo.api.Optional<java.lang.String> optional2 = this.placementId;
        com.apollographql.apollo.api.Optional<java.lang.String> optional3 = this.surfaceId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WalletComponentsInput(walletTypes=");
        sb.append(optional);
        sb.append(", placementId=");
        sb.append(optional2);
        sb.append(", surfaceId=");
        sb.append(optional3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.walletTypes.hashCode() * 31) + this.placementId.hashCode()) * 31) + this.surfaceId.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.api.graphql.schema.type.WalletComponentsInput)) {
            return false;
        }
        com.paypal.oslo.api.graphql.schema.type.WalletComponentsInput walletComponentsInput = (com.paypal.oslo.api.graphql.schema.type.WalletComponentsInput) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.walletTypes, walletComponentsInput.walletTypes) && kotlin.jvm.internal.Intrinsics.areEqual(this.placementId, walletComponentsInput.placementId) && kotlin.jvm.internal.Intrinsics.areEqual(this.surfaceId, walletComponentsInput.surfaceId);
    }

    public final com.paypal.oslo.api.graphql.schema.type.WalletComponentsInput copy(com.apollographql.apollo.api.Optional<? extends java.util.List<? extends com.paypal.oslo.api.graphql.schema.type.WalletAccountType>> walletTypes, com.apollographql.apollo.api.Optional<java.lang.String> placementId, com.apollographql.apollo.api.Optional<java.lang.String> surfaceId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletTypes, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(placementId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceId, "");
        return new com.paypal.oslo.api.graphql.schema.type.WalletComponentsInput(walletTypes, placementId, surfaceId);
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component3() {
        return this.surfaceId;
    }

    public final com.apollographql.apollo.api.Optional<java.lang.String> component2() {
        return this.placementId;
    }

    public final com.apollographql.apollo.api.Optional<java.util.List<com.paypal.oslo.api.graphql.schema.type.WalletAccountType>> component1() {
        return this.walletTypes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.api.graphql.schema.type.WalletComponentsInput copy$default(com.paypal.oslo.api.graphql.schema.type.WalletComponentsInput walletComponentsInput, com.apollographql.apollo.api.Optional optional, com.apollographql.apollo.api.Optional optional2, com.apollographql.apollo.api.Optional optional3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            optional = walletComponentsInput.walletTypes;
        }
        if ((i & 2) != 0) {
            optional2 = walletComponentsInput.placementId;
        }
        if ((i & 4) != 0) {
            optional3 = walletComponentsInput.surfaceId;
        }
        return walletComponentsInput.copy(optional, optional2, optional3);
    }

    public WalletComponentsInput() {
        this(null, null, null, 7, null);
    }
}
