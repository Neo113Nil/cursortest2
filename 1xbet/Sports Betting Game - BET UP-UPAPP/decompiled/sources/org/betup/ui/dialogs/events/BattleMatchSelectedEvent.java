package org.betup.ui.dialogs.events;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleEvents.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lorg/betup/ui/dialogs/events/BattleMatchSelectedEvent;", "", "matchId", "", "userId", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/Long;)V", "getMatchId", "()J", "getUserId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(JLjava/lang/Long;)Lorg/betup/ui/dialogs/events/BattleMatchSelectedEvent;", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BattleMatchSelectedEvent {
    public static final int $stable = 0;
    private final long matchId;
    private final Long userId;

    public static /* synthetic */ BattleMatchSelectedEvent copy$default(BattleMatchSelectedEvent battleMatchSelectedEvent, long j, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            j = battleMatchSelectedEvent.matchId;
        }
        if ((i & 2) != 0) {
            l = battleMatchSelectedEvent.userId;
        }
        return battleMatchSelectedEvent.copy(j, l);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMatchId() {
        return this.matchId;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getUserId() {
        return this.userId;
    }

    public final BattleMatchSelectedEvent copy(long matchId, Long userId) {
        return new BattleMatchSelectedEvent(matchId, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BattleMatchSelectedEvent)) {
            return false;
        }
        BattleMatchSelectedEvent battleMatchSelectedEvent = (BattleMatchSelectedEvent) other;
        return this.matchId == battleMatchSelectedEvent.matchId && Intrinsics.areEqual(this.userId, battleMatchSelectedEvent.userId);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.matchId) * 31;
        Long l = this.userId;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "BattleMatchSelectedEvent(matchId=" + this.matchId + ", userId=" + this.userId + ")";
    }

    public BattleMatchSelectedEvent(long j, Long l) {
        this.matchId = j;
        this.userId = l;
    }

    public /* synthetic */ BattleMatchSelectedEvent(long j, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : l);
    }

    public final long getMatchId() {
        return this.matchId;
    }

    public final Long getUserId() {
        return this.userId;
    }
}
