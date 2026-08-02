package org.betup.ui.fragment.user.compose.items;

import kotlin.Metadata;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleStats.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006#"}, d2 = {"Lorg/betup/ui/fragment/user/compose/items/BattleStats;", "", "totalBattles", "", "wonBattles", "lostBattles", "drawBattles", "totalEarnings", "", "winRate", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IIIIJF)V", "getTotalBattles", "()I", "getWonBattles", "getLostBattles", "getDrawBattles", "getTotalEarnings", "()J", "getWinRate", "()F", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BattleStats {
    public static final int $stable = 0;
    private final int drawBattles;
    private final int lostBattles;
    private final int totalBattles;
    private final long totalEarnings;
    private final float winRate;
    private final int wonBattles;

    public static /* synthetic */ BattleStats copy$default(BattleStats battleStats, int i, int i2, int i3, int i4, long j, float f, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = battleStats.totalBattles;
        }
        if ((i5 & 2) != 0) {
            i2 = battleStats.wonBattles;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = battleStats.lostBattles;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = battleStats.drawBattles;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            j = battleStats.totalEarnings;
        }
        long j2 = j;
        if ((i5 & 32) != 0) {
            f = battleStats.winRate;
        }
        return battleStats.copy(i, i6, i7, i8, j2, f);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTotalBattles() {
        return this.totalBattles;
    }

    /* renamed from: component2, reason: from getter */
    public final int getWonBattles() {
        return this.wonBattles;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLostBattles() {
        return this.lostBattles;
    }

    /* renamed from: component4, reason: from getter */
    public final int getDrawBattles() {
        return this.drawBattles;
    }

    /* renamed from: component5, reason: from getter */
    public final long getTotalEarnings() {
        return this.totalEarnings;
    }

    /* renamed from: component6, reason: from getter */
    public final float getWinRate() {
        return this.winRate;
    }

    public final BattleStats copy(int totalBattles, int wonBattles, int lostBattles, int drawBattles, long totalEarnings, float winRate) {
        return new BattleStats(totalBattles, wonBattles, lostBattles, drawBattles, totalEarnings, winRate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BattleStats)) {
            return false;
        }
        BattleStats battleStats = (BattleStats) other;
        return this.totalBattles == battleStats.totalBattles && this.wonBattles == battleStats.wonBattles && this.lostBattles == battleStats.lostBattles && this.drawBattles == battleStats.drawBattles && this.totalEarnings == battleStats.totalEarnings && Float.compare(this.winRate, battleStats.winRate) == 0;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.totalBattles) * 31) + Integer.hashCode(this.wonBattles)) * 31) + Integer.hashCode(this.lostBattles)) * 31) + Integer.hashCode(this.drawBattles)) * 31) + Long.hashCode(this.totalEarnings)) * 31) + Float.hashCode(this.winRate);
    }

    public String toString() {
        return "BattleStats(totalBattles=" + this.totalBattles + ", wonBattles=" + this.wonBattles + ", lostBattles=" + this.lostBattles + ", drawBattles=" + this.drawBattles + ", totalEarnings=" + this.totalEarnings + ", winRate=" + this.winRate + ")";
    }

    public BattleStats(int i, int i2, int i3, int i4, long j, float f) {
        this.totalBattles = i;
        this.wonBattles = i2;
        this.lostBattles = i3;
        this.drawBattles = i4;
        this.totalEarnings = j;
        this.winRate = f;
    }

    public final int getTotalBattles() {
        return this.totalBattles;
    }

    public final int getWonBattles() {
        return this.wonBattles;
    }

    public final int getLostBattles() {
        return this.lostBattles;
    }

    public final int getDrawBattles() {
        return this.drawBattles;
    }

    public final long getTotalEarnings() {
        return this.totalEarnings;
    }

    public final float getWinRate() {
        return this.winRate;
    }
}
