package org.betup.ui.dialogs.events;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.betup.model.remote.api.rest.matches.GetRandomTeamImagesInteractor;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleEvents.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ.\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lorg/betup/ui/dialogs/events/BattleBackToMatchesEvent;", "", "leagueId", "", GetRandomTeamImagesInteractor.KEY_SPORT_ID, "userId", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(IILjava/lang/Long;)V", "getLeagueId", "()I", "getSportId", "getUserId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "copy", "(IILjava/lang/Long;)Lorg/betup/ui/dialogs/events/BattleBackToMatchesEvent;", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BattleBackToMatchesEvent {
    public static final int $stable = 0;
    private final int leagueId;
    private final int sportId;
    private final Long userId;

    public static /* synthetic */ BattleBackToMatchesEvent copy$default(BattleBackToMatchesEvent battleBackToMatchesEvent, int i, int i2, Long l, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = battleBackToMatchesEvent.leagueId;
        }
        if ((i3 & 2) != 0) {
            i2 = battleBackToMatchesEvent.sportId;
        }
        if ((i3 & 4) != 0) {
            l = battleBackToMatchesEvent.userId;
        }
        return battleBackToMatchesEvent.copy(i, i2, l);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLeagueId() {
        return this.leagueId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSportId() {
        return this.sportId;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getUserId() {
        return this.userId;
    }

    public final BattleBackToMatchesEvent copy(int leagueId, int sportId, Long userId) {
        return new BattleBackToMatchesEvent(leagueId, sportId, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BattleBackToMatchesEvent)) {
            return false;
        }
        BattleBackToMatchesEvent battleBackToMatchesEvent = (BattleBackToMatchesEvent) other;
        return this.leagueId == battleBackToMatchesEvent.leagueId && this.sportId == battleBackToMatchesEvent.sportId && Intrinsics.areEqual(this.userId, battleBackToMatchesEvent.userId);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.leagueId) * 31) + Integer.hashCode(this.sportId)) * 31;
        Long l = this.userId;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "BattleBackToMatchesEvent(leagueId=" + this.leagueId + ", sportId=" + this.sportId + ", userId=" + this.userId + ")";
    }

    public BattleBackToMatchesEvent(int i, int i2, Long l) {
        this.leagueId = i;
        this.sportId = i2;
        this.userId = l;
    }

    public /* synthetic */ BattleBackToMatchesEvent(int i, int i2, Long l, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? null : l);
    }

    public final int getLeagueId() {
        return this.leagueId;
    }

    public final int getSportId() {
        return this.sportId;
    }

    public final Long getUserId() {
        return this.userId;
    }
}
