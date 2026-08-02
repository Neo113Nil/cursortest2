package org.betup.model.remote.entity.shop;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ShopLayoutModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lorg/betup/model/remote/entity/shop/ShopEntitlementClaimResultModel;", "", "entitlement", "Lorg/betup/model/remote/entity/shop/ShopEntitlementModel;", "claimedAmount", "", "moneyBalance", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/betup/model/remote/entity/shop/ShopEntitlementModel;JJ)V", "getEntitlement", "()Lorg/betup/model/remote/entity/shop/ShopEntitlementModel;", "getClaimedAmount", "()J", "getMoneyBalance", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ShopEntitlementClaimResultModel {
    public static final int $stable = 0;

    @SerializedName("claimed_amount")
    private final long claimedAmount;

    @SerializedName("entitlement")
    private final ShopEntitlementModel entitlement;

    @SerializedName("money_balance")
    private final long moneyBalance;

    public static /* synthetic */ ShopEntitlementClaimResultModel copy$default(ShopEntitlementClaimResultModel shopEntitlementClaimResultModel, ShopEntitlementModel shopEntitlementModel, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            shopEntitlementModel = shopEntitlementClaimResultModel.entitlement;
        }
        if ((i & 2) != 0) {
            j = shopEntitlementClaimResultModel.claimedAmount;
        }
        long j3 = j;
        if ((i & 4) != 0) {
            j2 = shopEntitlementClaimResultModel.moneyBalance;
        }
        return shopEntitlementClaimResultModel.copy(shopEntitlementModel, j3, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final ShopEntitlementModel getEntitlement() {
        return this.entitlement;
    }

    /* renamed from: component2, reason: from getter */
    public final long getClaimedAmount() {
        return this.claimedAmount;
    }

    /* renamed from: component3, reason: from getter */
    public final long getMoneyBalance() {
        return this.moneyBalance;
    }

    public final ShopEntitlementClaimResultModel copy(ShopEntitlementModel entitlement, long claimedAmount, long moneyBalance) {
        Intrinsics.checkNotNullParameter(entitlement, "entitlement");
        return new ShopEntitlementClaimResultModel(entitlement, claimedAmount, moneyBalance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopEntitlementClaimResultModel)) {
            return false;
        }
        ShopEntitlementClaimResultModel shopEntitlementClaimResultModel = (ShopEntitlementClaimResultModel) other;
        return Intrinsics.areEqual(this.entitlement, shopEntitlementClaimResultModel.entitlement) && this.claimedAmount == shopEntitlementClaimResultModel.claimedAmount && this.moneyBalance == shopEntitlementClaimResultModel.moneyBalance;
    }

    public int hashCode() {
        return (((this.entitlement.hashCode() * 31) + Long.hashCode(this.claimedAmount)) * 31) + Long.hashCode(this.moneyBalance);
    }

    public String toString() {
        return "ShopEntitlementClaimResultModel(entitlement=" + this.entitlement + ", claimedAmount=" + this.claimedAmount + ", moneyBalance=" + this.moneyBalance + ")";
    }

    public ShopEntitlementClaimResultModel(ShopEntitlementModel entitlement, long j, long j2) {
        Intrinsics.checkNotNullParameter(entitlement, "entitlement");
        this.entitlement = entitlement;
        this.claimedAmount = j;
        this.moneyBalance = j2;
    }

    public final ShopEntitlementModel getEntitlement() {
        return this.entitlement;
    }

    public final long getClaimedAmount() {
        return this.claimedAmount;
    }

    public final long getMoneyBalance() {
        return this.moneyBalance;
    }
}
