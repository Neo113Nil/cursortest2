package org.betup.model.remote.entity.shop;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ShopLayoutModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0006HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\t\u0010+\u001a\u00020\tHÆ\u0003J\t\u0010,\u001a\u00020\tHÆ\u0003J\t\u0010-\u001a\u00020\rHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00100\u001a\u00020\u0011HÆ\u0003J\u0082\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u00020\u00112\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\tHÖ\u0001J\t\u00106\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0016\u0010\u0010\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00067"}, d2 = {"Lorg/betup/model/remote/entity/shop/ShopEntitlementModel;", "", "id", "", "shopItemId", "storeCode", "", "dailyAmount", "totalDays", "", "daysClaimed", "daysMissed", "status", "Lorg/betup/model/remote/entity/shop/EntitlementStatus;", "expiresAt", "nextClaimAt", "canClaim", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JJLjava/lang/String;JLjava/lang/Integer;IILorg/betup/model/remote/entity/shop/EntitlementStatus;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()J", "getShopItemId", "getStoreCode", "()Ljava/lang/String;", "getDailyAmount", "getTotalDays", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDaysClaimed", "()I", "getDaysMissed", "getStatus", "()Lorg/betup/model/remote/entity/shop/EntitlementStatus;", "getExpiresAt", "getNextClaimAt", "getCanClaim", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(JJLjava/lang/String;JLjava/lang/Integer;IILorg/betup/model/remote/entity/shop/EntitlementStatus;Ljava/lang/String;Ljava/lang/String;Z)Lorg/betup/model/remote/entity/shop/ShopEntitlementModel;", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ShopEntitlementModel {
    public static final int $stable = 0;

    @SerializedName("can_claim")
    private final boolean canClaim;

    @SerializedName("daily_amount")
    private final long dailyAmount;

    @SerializedName("days_claimed")
    private final int daysClaimed;

    @SerializedName("days_missed")
    private final int daysMissed;

    @SerializedName("expires_at")
    private final String expiresAt;

    @SerializedName("id")
    private final long id;

    @SerializedName("next_claim_at")
    private final String nextClaimAt;

    @SerializedName("shop_item_id")
    private final long shopItemId;

    @SerializedName("status")
    private final EntitlementStatus status;

    @SerializedName("store_code")
    private final String storeCode;

    @SerializedName("total_days")
    private final Integer totalDays;

    public ShopEntitlementModel() {
        this(0L, 0L, null, 0L, null, 0, 0, null, null, null, false, 2047, null);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getNextClaimAt() {
        return this.nextClaimAt;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getCanClaim() {
        return this.canClaim;
    }

    /* renamed from: component2, reason: from getter */
    public final long getShopItemId() {
        return this.shopItemId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStoreCode() {
        return this.storeCode;
    }

    /* renamed from: component4, reason: from getter */
    public final long getDailyAmount() {
        return this.dailyAmount;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getTotalDays() {
        return this.totalDays;
    }

    /* renamed from: component6, reason: from getter */
    public final int getDaysClaimed() {
        return this.daysClaimed;
    }

    /* renamed from: component7, reason: from getter */
    public final int getDaysMissed() {
        return this.daysMissed;
    }

    /* renamed from: component8, reason: from getter */
    public final EntitlementStatus getStatus() {
        return this.status;
    }

    /* renamed from: component9, reason: from getter */
    public final String getExpiresAt() {
        return this.expiresAt;
    }

    public final ShopEntitlementModel copy(long id, long shopItemId, String storeCode, long dailyAmount, Integer totalDays, int daysClaimed, int daysMissed, EntitlementStatus status, String expiresAt, String nextClaimAt, boolean canClaim) {
        Intrinsics.checkNotNullParameter(storeCode, "storeCode");
        Intrinsics.checkNotNullParameter(status, "status");
        return new ShopEntitlementModel(id, shopItemId, storeCode, dailyAmount, totalDays, daysClaimed, daysMissed, status, expiresAt, nextClaimAt, canClaim);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShopEntitlementModel)) {
            return false;
        }
        ShopEntitlementModel shopEntitlementModel = (ShopEntitlementModel) other;
        return this.id == shopEntitlementModel.id && this.shopItemId == shopEntitlementModel.shopItemId && Intrinsics.areEqual(this.storeCode, shopEntitlementModel.storeCode) && this.dailyAmount == shopEntitlementModel.dailyAmount && Intrinsics.areEqual(this.totalDays, shopEntitlementModel.totalDays) && this.daysClaimed == shopEntitlementModel.daysClaimed && this.daysMissed == shopEntitlementModel.daysMissed && this.status == shopEntitlementModel.status && Intrinsics.areEqual(this.expiresAt, shopEntitlementModel.expiresAt) && Intrinsics.areEqual(this.nextClaimAt, shopEntitlementModel.nextClaimAt) && this.canClaim == shopEntitlementModel.canClaim;
    }

    public int hashCode() {
        int hashCode = ((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.shopItemId)) * 31) + this.storeCode.hashCode()) * 31) + Long.hashCode(this.dailyAmount)) * 31;
        Integer num = this.totalDays;
        int hashCode2 = (((((((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.daysClaimed)) * 31) + Integer.hashCode(this.daysMissed)) * 31) + this.status.hashCode()) * 31;
        String str = this.expiresAt;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nextClaimAt;
        return ((hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.canClaim);
    }

    public String toString() {
        return "ShopEntitlementModel(id=" + this.id + ", shopItemId=" + this.shopItemId + ", storeCode=" + this.storeCode + ", dailyAmount=" + this.dailyAmount + ", totalDays=" + this.totalDays + ", daysClaimed=" + this.daysClaimed + ", daysMissed=" + this.daysMissed + ", status=" + this.status + ", expiresAt=" + this.expiresAt + ", nextClaimAt=" + this.nextClaimAt + ", canClaim=" + this.canClaim + ")";
    }

    public ShopEntitlementModel(long j, long j2, String storeCode, long j3, Integer num, int i, int i2, EntitlementStatus status, String str, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(storeCode, "storeCode");
        Intrinsics.checkNotNullParameter(status, "status");
        this.id = j;
        this.shopItemId = j2;
        this.storeCode = storeCode;
        this.dailyAmount = j3;
        this.totalDays = num;
        this.daysClaimed = i;
        this.daysMissed = i2;
        this.status = status;
        this.expiresAt = str;
        this.nextClaimAt = str2;
        this.canClaim = z;
    }

    public final long getId() {
        return this.id;
    }

    public final long getShopItemId() {
        return this.shopItemId;
    }

    public /* synthetic */ ShopEntitlementModel(long j, long j2, String str, long j3, Integer num, int i, int i2, EntitlementStatus entitlementStatus, String str2, String str3, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, (i3 & 2) != 0 ? 0L : j2, (i3 & 4) != 0 ? "" : str, (i3 & 8) == 0 ? j3 : 0L, (i3 & 16) != 0 ? null : num, (i3 & 32) != 0 ? 0 : i, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? EntitlementStatus.ACTIVE : entitlementStatus, (i3 & 256) != 0 ? null : str2, (i3 & 512) == 0 ? str3 : null, (i3 & 1024) == 0 ? z : false);
    }

    public final String getStoreCode() {
        return this.storeCode;
    }

    public final long getDailyAmount() {
        return this.dailyAmount;
    }

    public final Integer getTotalDays() {
        return this.totalDays;
    }

    public final int getDaysClaimed() {
        return this.daysClaimed;
    }

    public final int getDaysMissed() {
        return this.daysMissed;
    }

    public final EntitlementStatus getStatus() {
        return this.status;
    }

    public final String getExpiresAt() {
        return this.expiresAt;
    }

    public final String getNextClaimAt() {
        return this.nextClaimAt;
    }

    public final boolean getCanClaim() {
        return this.canClaim;
    }
}
