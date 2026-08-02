package org.betup.ui.dialogs.events;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleEvents.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ$\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lorg/betup/ui/dialogs/events/BattleLeagueSelectedEvent;", "", "leagueId", "", "userId", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(ILjava/lang/Long;)V", "getLeagueId", "()I", "getUserId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(ILjava/lang/Long;)Lorg/betup/ui/dialogs/events/BattleLeagueSelectedEvent;", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BattleLeagueSelectedEvent {
    public static final int $stable = 0;
    private final int leagueId;
    private final Long userId;

    public static /* synthetic */ BattleLeagueSelectedEvent copy$default(BattleLeagueSelectedEvent battleLeagueSelectedEvent, int i, Long l, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = battleLeagueSelectedEvent.leagueId;
        }
        if ((i2 & 2) != 0) {
            l = battleLeagueSelectedEvent.userId;
        }
        return battleLeagueSelectedEvent.copy(i, l);
    }

    /* renamed from: component1, reason: from getter */
    public final int getLeagueId() {
        return this.leagueId;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getUserId() {
        return this.userId;
    }

    public final BattleLeagueSelectedEvent copy(int leagueId, Long userId) {
        return new BattleLeagueSelectedEvent(leagueId, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BattleLeagueSelectedEvent)) {
            return false;
        }
        BattleLeagueSelectedEvent battleLeagueSelectedEvent = (BattleLeagueSelectedEvent) other;
        return this.leagueId == battleLeagueSelectedEvent.leagueId && Intrinsics.areEqual(this.userId, battleLeagueSelectedEvent.userId);
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.leagueId) * 31;
        Long l = this.userId;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "BattleLeagueSelectedEvent(leagueId=" + this.leagueId + ", userId=" + this.userId + ")";
    }

    public BattleLeagueSelectedEvent(int i, Long l) {
        this.leagueId = i;
        this.userId = l;
    }

    public /* synthetic */ BattleLeagueSelectedEvent(int i, Long l, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : l);
    }

    public final int getLeagueId() {
        return this.leagueId;
    }

    public final Long getUserId() {
        return this.userId;
    }
}
