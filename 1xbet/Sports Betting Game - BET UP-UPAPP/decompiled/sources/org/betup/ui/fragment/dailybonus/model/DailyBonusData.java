package org.betup.ui.fragment.dailybonus.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: DailyBonusModels.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003JA\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\tHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010¨\u0006 "}, d2 = {"Lorg/betup/ui/fragment/dailybonus/model/DailyBonusData;", "", "bonuses", "", "Lorg/betup/ui/fragment/dailybonus/model/DailyBonusDay;", "nextRewardBefore", "", "nextRewardAfter", "multiplier", "", "multiplierExpires", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getBonuses", "()Ljava/util/List;", "getNextRewardBefore", "()Ljava/lang/String;", "getNextRewardAfter", "getMultiplier", "()I", "getMultiplierExpires", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class DailyBonusData {
    public static final int $stable = 8;
    private final List<DailyBonusDay> bonuses;
    private final int multiplier;
    private final String multiplierExpires;
    private final String nextRewardAfter;
    private final String nextRewardBefore;

    public static /* synthetic */ DailyBonusData copy$default(DailyBonusData dailyBonusData, List list, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = dailyBonusData.bonuses;
        }
        if ((i2 & 2) != 0) {
            str = dailyBonusData.nextRewardBefore;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = dailyBonusData.nextRewardAfter;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            i = dailyBonusData.multiplier;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str3 = dailyBonusData.multiplierExpires;
        }
        return dailyBonusData.copy(list, str4, str5, i3, str3);
    }

    public final List<DailyBonusDay> component1() {
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
    public final int getMultiplier() {
        return this.multiplier;
    }

    /* renamed from: component5, reason: from getter */
    public final String getMultiplierExpires() {
        return this.multiplierExpires;
    }

    public final DailyBonusData copy(List<DailyBonusDay> bonuses, String nextRewardBefore, String nextRewardAfter, int multiplier, String multiplierExpires) {
        Intrinsics.checkNotNullParameter(bonuses, "bonuses");
        Intrinsics.checkNotNullParameter(nextRewardBefore, "nextRewardBefore");
        Intrinsics.checkNotNullParameter(nextRewardAfter, "nextRewardAfter");
        Intrinsics.checkNotNullParameter(multiplierExpires, "multiplierExpires");
        return new DailyBonusData(bonuses, nextRewardBefore, nextRewardAfter, multiplier, multiplierExpires);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyBonusData)) {
            return false;
        }
        DailyBonusData dailyBonusData = (DailyBonusData) other;
        return Intrinsics.areEqual(this.bonuses, dailyBonusData.bonuses) && Intrinsics.areEqual(this.nextRewardBefore, dailyBonusData.nextRewardBefore) && Intrinsics.areEqual(this.nextRewardAfter, dailyBonusData.nextRewardAfter) && this.multiplier == dailyBonusData.multiplier && Intrinsics.areEqual(this.multiplierExpires, dailyBonusData.multiplierExpires);
    }

    public int hashCode() {
        return (((((((this.bonuses.hashCode() * 31) + this.nextRewardBefore.hashCode()) * 31) + this.nextRewardAfter.hashCode()) * 31) + Integer.hashCode(this.multiplier)) * 31) + this.multiplierExpires.hashCode();
    }

    public String toString() {
        return "DailyBonusData(bonuses=" + this.bonuses + ", nextRewardBefore=" + this.nextRewardBefore + ", nextRewardAfter=" + this.nextRewardAfter + ", multiplier=" + this.multiplier + ", multiplierExpires=" + this.multiplierExpires + ")";
    }

    public DailyBonusData(List<DailyBonusDay> bonuses, String nextRewardBefore, String nextRewardAfter, int i, String multiplierExpires) {
        Intrinsics.checkNotNullParameter(bonuses, "bonuses");
        Intrinsics.checkNotNullParameter(nextRewardBefore, "nextRewardBefore");
        Intrinsics.checkNotNullParameter(nextRewardAfter, "nextRewardAfter");
        Intrinsics.checkNotNullParameter(multiplierExpires, "multiplierExpires");
        this.bonuses = bonuses;
        this.nextRewardBefore = nextRewardBefore;
        this.nextRewardAfter = nextRewardAfter;
        this.multiplier = i;
        this.multiplierExpires = multiplierExpires;
    }

    public final List<DailyBonusDay> getBonuses() {
        return this.bonuses;
    }

    public final String getNextRewardBefore() {
        return this.nextRewardBefore;
    }

    public final String getNextRewardAfter() {
        return this.nextRewardAfter;
    }

    public final int getMultiplier() {
        return this.multiplier;
    }

    public final String getMultiplierExpires() {
        return this.multiplierExpires;
    }
}
