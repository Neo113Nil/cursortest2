package com.paypal.oslo.feature.savings.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J8\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0010R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/usecase/SavingsHubDataResult;", "", "", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/SavingsHubTileDTO;", "tiles", "", "electronic1099OptIn", "", "savingsAccountId", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/paypal/oslo/feature/savings/domain/usecase/SavingsHubDataResult;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/util/List;", "getTiles", "Ljava/lang/Boolean;", "getElectronic1099OptIn", "Ljava/lang/String;", "getSavingsAccountId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SavingsHubDataResult {
    public static final int $stable = 8;
    private final java.lang.Boolean electronic1099OptIn;
    private final java.lang.String savingsAccountId;
    private final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO> tiles;

    /* JADX WARN: Multi-variable type inference failed */
    public SavingsHubDataResult(java.util.List<? extends com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO> list, java.lang.Boolean bool, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.tiles = list;
        this.electronic1099OptIn = bool;
        this.savingsAccountId = str;
    }

    public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO> getTiles() {
        return this.tiles;
    }

    public final java.lang.Boolean getElectronic1099OptIn() {
        return this.electronic1099OptIn;
    }

    public final java.lang.String getSavingsAccountId() {
        return this.savingsAccountId;
    }

    public final java.lang.String toString() {
        java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO> list = this.tiles;
        java.lang.Boolean bool = this.electronic1099OptIn;
        java.lang.String str = this.savingsAccountId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SavingsHubDataResult(tiles=");
        sb.append(list);
        sb.append(", electronic1099OptIn=");
        sb.append(bool);
        sb.append(", savingsAccountId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.tiles.hashCode();
        java.lang.Boolean bool = this.electronic1099OptIn;
        int hashCode2 = bool == null ? 0 : bool.hashCode();
        java.lang.String str = this.savingsAccountId;
        return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.savings.domain.usecase.SavingsHubDataResult)) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.usecase.SavingsHubDataResult savingsHubDataResult = (com.paypal.oslo.feature.savings.domain.usecase.SavingsHubDataResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.tiles, savingsHubDataResult.tiles) && kotlin.jvm.internal.Intrinsics.areEqual(this.electronic1099OptIn, savingsHubDataResult.electronic1099OptIn) && kotlin.jvm.internal.Intrinsics.areEqual(this.savingsAccountId, savingsHubDataResult.savingsAccountId);
    }

    public final com.paypal.oslo.feature.savings.domain.usecase.SavingsHubDataResult copy(java.util.List<? extends com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO> tiles, java.lang.Boolean electronic1099OptIn, java.lang.String savingsAccountId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tiles, "");
        return new com.paypal.oslo.feature.savings.domain.usecase.SavingsHubDataResult(tiles, electronic1099OptIn, savingsAccountId);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getSavingsAccountId() {
        return this.savingsAccountId;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Boolean getElectronic1099OptIn() {
        return this.electronic1099OptIn;
    }

    public final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.SavingsHubTileDTO> component1() {
        return this.tiles;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.savings.domain.usecase.SavingsHubDataResult copy$default(com.paypal.oslo.feature.savings.domain.usecase.SavingsHubDataResult savingsHubDataResult, java.util.List list, java.lang.Boolean bool, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = savingsHubDataResult.tiles;
        }
        if ((i & 2) != 0) {
            bool = savingsHubDataResult.electronic1099OptIn;
        }
        if ((i & 4) != 0) {
            str = savingsHubDataResult.savingsAccountId;
        }
        return savingsHubDataResult.copy(list, bool, str);
    }
}
