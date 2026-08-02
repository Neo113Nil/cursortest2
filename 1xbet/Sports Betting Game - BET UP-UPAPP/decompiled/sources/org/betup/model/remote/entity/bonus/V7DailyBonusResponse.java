package org.betup.model.remote.entity.bonus;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: V7DailyBonusResponse.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006!"}, d2 = {"Lorg/betup/model/remote/entity/bonus/V7DailyBonusResponse;", "", "bonuses", "", "Lorg/betup/model/remote/entity/bonus/V7DailyBonusItem;", "nextRewardBefore", "", "nextRewardAfter", "multiplier", "", "multiplierExpires", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;)V", "getBonuses", "()Ljava/util/List;", "getNextRewardBefore", "()Ljava/lang/String;", "getNextRewardAfter", "getMultiplier", "()D", "getMultiplierExpires", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class V7DailyBonusResponse {
    public static final int $stable = 8;

    @SerializedName("bonuses")
    private final List<V7DailyBonusItem> bonuses;

    @SerializedName("multiplier")
    private final double multiplier;

    @SerializedName("multiplierExpires")
    private final String multiplierExpires;

    @SerializedName("nextRewardAfter")
    private final String nextRewardAfter;

    @SerializedName("nextRewardBefore")
    private final String nextRewardBefore;

    public static /* synthetic */ V7DailyBonusResponse copy$default(V7DailyBonusResponse v7DailyBonusResponse, List list, String str, String str2, double d, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = v7DailyBonusResponse.bonuses;
        }
        if ((i & 2) != 0) {
            str = v7DailyBonusResponse.nextRewardBefore;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = v7DailyBonusResponse.nextRewardAfter;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            d = v7DailyBonusResponse.multiplier;
        }
        double d2 = d;
        if ((i & 16) != 0) {
            str3 = v7DailyBonusResponse.multiplierExpires;
        }
        return v7DailyBonusResponse.copy(list, str4, str5, d2, str3);
    }

    public final List<V7DailyBonusItem> component1() {
        return this.bonuses;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNextRewardBefore() {
        return this.nextRewardBefore;
    }

    /* renamed from: component3, reason: from getter */
    public final String getNextRewardAfter() {
        return this.nextRewardAfter;
    }

    /* renamed from: component4, reason: from getter */
    public final double getMultiplier() {
        return this.multiplier;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMultiplierExpires() {
        return this.multiplierExpires;
    }

    public final V7DailyBonusResponse copy(List<V7DailyBonusItem> bonuses, String nextRewardBefore, String nextRewardAfter, double multiplier, String multiplierExpires) {
        Intrinsics.checkNotNullParameter(bonuses, "bonuses");
        return new V7DailyBonusResponse(bonuses, nextRewardBefore, nextRewardAfter, multiplier, multiplierExpires);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof V7DailyBonusResponse)) {
            return false;
        }
        V7DailyBonusResponse v7DailyBonusResponse = (V7DailyBonusResponse) other;
        return Intrinsics.areEqual(this.bonuses, v7DailyBonusResponse.bonuses) && Intrinsics.areEqual(this.nextRewardBefore, v7DailyBonusResponse.nextRewardBefore) && Intrinsics.areEqual(this.nextRewardAfter, v7DailyBonusResponse.nextRewardAfter) && Double.compare(this.multiplier, v7DailyBonusResponse.multiplier) == 0 && Intrinsics.areEqual(this.multiplierExpires, v7DailyBonusResponse.multiplierExpires);
    }

    public int hashCode() {
        int hashCode = this.bonuses.hashCode() * 31;
        String str = this.nextRewardBefore;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nextRewardAfter;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Double.hashCode(this.multiplier)) * 31;
        String str3 = this.multiplierExpires;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "V7DailyBonusResponse(bonuses=" + this.bonuses + ", nextRewardBefore=" + this.nextRewardBefore + ", nextRewardAfter=" + this.nextRewardAfter + ", multiplier=" + this.multiplier + ", multiplierExpires=" + this.multiplierExpires + ")";
    }

    public V7DailyBonusResponse(List<V7DailyBonusItem> bonuses, String str, String str2, double d, String str3) {
        Intrinsics.checkNotNullParameter(bonuses, "bonuses");
        this.bonuses = bonuses;
        this.nextRewardBefore = str;
        this.nextRewardAfter = str2;
        this.multiplier = d;
        this.multiplierExpires = str3;
    }

    public final List<V7DailyBonusItem> getBonuses() {
        return this.bonuses;
    }

    public /* synthetic */ V7DailyBonusResponse(List list, String str, String str2, double d, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, str, str2, (i & 8) != 0 ? 1.0d : d, str3);
    }

    public final String getNextRewardBefore() {
        return this.nextRewardBefore;
    }

    public final String getNextRewardAfter() {
        return this.nextRewardAfter;
    }

    public final double getMultiplier() {
        return this.multiplier;
    }

    public final String getMultiplierExpires() {
        return this.multiplierExpires;
    }
}
