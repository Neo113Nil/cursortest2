package org.betup.ui.dialogs.events;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleEvents.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J8\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001e"}, d2 = {"Lorg/betup/ui/dialogs/events/BattleBackToBetsEvent;", "", "matchId", "", "leagueId", "", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "userId", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JIILjava/lang/Long;)V", "getMatchId", "()J", "getLeagueId", "()I", "getSportId", "getUserId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(JIILjava/lang/Long;)Lorg/betup/ui/dialogs/events/BattleBackToBetsEvent;", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BattleBackToBetsEvent {
    public static final int $stable = 0;
    private final int leagueId;
    private final long matchId;
    private final int sportId;
    private final Long userId;

    public static /* synthetic */ BattleBackToBetsEvent copy$default(BattleBackToBetsEvent battleBackToBetsEvent, long j, int i, int i2, Long l, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            j = battleBackToBetsEvent.matchId;
        }
        long j2 = j;
        if ((i3 & 2) != 0) {
            i = battleBackToBetsEvent.leagueId;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = battleBackToBetsEvent.sportId;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            l = battleBackToBetsEvent.userId;
        }
        return battleBackToBetsEvent.copy(j2, i4, i5, l);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMatchId() {
        return this.matchId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLeagueId() {
        return this.leagueId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSportId() {
        return this.sportId;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getUserId() {
        return this.userId;
    }

    public final BattleBackToBetsEvent copy(long matchId, int leagueId, int sportId, Long userId) {
        return new BattleBackToBetsEvent(matchId, leagueId, sportId, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BattleBackToBetsEvent)) {
            return false;
        }
        BattleBackToBetsEvent battleBackToBetsEvent = (BattleBackToBetsEvent) other;
        return this.matchId == battleBackToBetsEvent.matchId && this.leagueId == battleBackToBetsEvent.leagueId && this.sportId == battleBackToBetsEvent.sportId && Intrinsics.areEqual(this.userId, battleBackToBetsEvent.userId);
    }

    public int hashCode() {
        int hashCode = ((((Long.hashCode(this.matchId) * 31) + Integer.hashCode(this.leagueId)) * 31) + Integer.hashCode(this.sportId)) * 31;
        Long l = this.userId;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "BattleBackToBetsEvent(matchId=" + this.matchId + ", leagueId=" + this.leagueId + ", sportId=" + this.sportId + ", userId=" + this.userId + ")";
    }

    public BattleBackToBetsEvent(long j, int i, int i2, Long l) {
        this.matchId = j;
        this.leagueId = i;
        this.sportId = i2;
        this.userId = l;
    }

    public /* synthetic */ BattleBackToBetsEvent(long j, int i, int i2, Long l, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, i, i2, (i3 & 8) != 0 ? null : l);
    }

    public final int getLeagueId() {
        return this.leagueId;
    }

    public final long getMatchId() {
        return this.matchId;
    }

    public final int getSportId() {
        return this.sportId;
    }

    public final Long getUserId() {
        return this.userId;
    }
}
