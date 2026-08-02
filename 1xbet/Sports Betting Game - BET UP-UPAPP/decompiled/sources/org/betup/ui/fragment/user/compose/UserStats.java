package org.betup.ui.fragment.user.compose;

import com.ironsource.X3;
import kotlin.Metadata;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: UserHeader.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lorg/betup/ui/fragment/user/compose/UserStats;", "", "wins", "", "lost", "inPlay", X3.i.l, "winPercent", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IIIII)V", "getWins", "()I", "getLost", "getInPlay", "getTotal", "getWinPercent", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* data */ class UserStats {
    private final int inPlay;
    private final int lost;
    private final int total;
    private final int winPercent;
    private final int wins;

    public static /* synthetic */ UserStats copy$default(UserStats userStats, int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = userStats.wins;
        }
        if ((i6 & 2) != 0) {
            i2 = userStats.lost;
        }
        int i7 = i2;
        if ((i6 & 4) != 0) {
            i3 = userStats.inPlay;
        }
        int i8 = i3;
        if ((i6 & 8) != 0) {
            i4 = userStats.total;
        }
        int i9 = i4;
        if ((i6 & 16) != 0) {
            i5 = userStats.winPercent;
        }
        return userStats.copy(i, i7, i8, i9, i5);
    }

    /* renamed from: component1, reason: from getter */
    public final int getWins() {
        return this.wins;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLost() {
        return this.lost;
    }

    /* renamed from: component3, reason: from getter */
    public final int getInPlay() {
        return this.inPlay;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTotal() {
        return this.total;
    }

    /* renamed from: component5, reason: from getter */
    public final int getWinPercent() {
        return this.winPercent;
    }

    public final UserStats copy(int wins, int lost, int inPlay, int total, int winPercent) {
        return new UserStats(wins, lost, inPlay, total, winPercent);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserStats)) {
            return false;
        }
        UserStats userStats = (UserStats) other;
        return this.wins == userStats.wins && this.lost == userStats.lost && this.inPlay == userStats.inPlay && this.total == userStats.total && this.winPercent == userStats.winPercent;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.wins) * 31) + Integer.hashCode(this.lost)) * 31) + Integer.hashCode(this.inPlay)) * 31) + Integer.hashCode(this.total)) * 31) + Integer.hashCode(this.winPercent);
    }

    public String toString() {
        return "UserStats(wins=" + this.wins + ", lost=" + this.lost + ", inPlay=" + this.inPlay + ", total=" + this.total + ", winPercent=" + this.winPercent + ")";
    }

    public UserStats(int i, int i2, int i3, int i4, int i5) {
        this.wins = i;
        this.lost = i2;
        this.inPlay = i3;
        this.total = i4;
        this.winPercent = i5;
    }

    public final int getWins() {
        return this.wins;
    }

    public final int getLost() {
        return this.lost;
    }

    public final int getInPlay() {
        return this.inPlay;
    }

    public final int getTotal() {
        return this.total;
    }

    public final int getWinPercent() {
        return this.winPercent;
    }
}
