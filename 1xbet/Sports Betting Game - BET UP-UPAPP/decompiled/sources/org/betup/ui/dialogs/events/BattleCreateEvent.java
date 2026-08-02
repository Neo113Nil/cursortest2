package org.betup.ui.dialogs.events;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleEvents.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u000fJ@\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u001f"}, d2 = {"Lorg/betup/ui/dialogs/events/BattleCreateEvent;", "", "selectedBetIds", "", "", "matchId", "battleId", "userId", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/util/Set;JLjava/lang/Long;Ljava/lang/Long;)V", "getSelectedBetIds", "()Ljava/util/Set;", "getMatchId", "()J", "getBattleId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUserId", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/Set;JLjava/lang/Long;Ljava/lang/Long;)Lorg/betup/ui/dialogs/events/BattleCreateEvent;", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BattleCreateEvent {
    public static final int $stable = 8;
    private final Long battleId;
    private final long matchId;
    private final Set<Long> selectedBetIds;
    private final Long userId;

    public static /* synthetic */ BattleCreateEvent copy$default(BattleCreateEvent battleCreateEvent, Set set, long j, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            set = battleCreateEvent.selectedBetIds;
        }
        if ((i & 2) != 0) {
            j = battleCreateEvent.matchId;
        }
        long j2 = j;
        if ((i & 4) != 0) {
            l = battleCreateEvent.battleId;
        }
        Long l3 = l;
        if ((i & 8) != 0) {
            l2 = battleCreateEvent.userId;
        }
        return battleCreateEvent.copy(set, j2, l3, l2);
    }

    public final Set<Long> component1() {
        return this.selectedBetIds;
    }

    /* renamed from: component2, reason: from getter */
    public final long getMatchId() {
        return this.matchId;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getBattleId() {
        return this.battleId;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getUserId() {
        return this.userId;
    }

    public final BattleCreateEvent copy(Set<Long> selectedBetIds, long matchId, Long battleId, Long userId) {
        Intrinsics.checkNotNullParameter(selectedBetIds, "selectedBetIds");
        return new BattleCreateEvent(selectedBetIds, matchId, battleId, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BattleCreateEvent)) {
            return false;
        }
        BattleCreateEvent battleCreateEvent = (BattleCreateEvent) other;
        return Intrinsics.areEqual(this.selectedBetIds, battleCreateEvent.selectedBetIds) && this.matchId == battleCreateEvent.matchId && Intrinsics.areEqual(this.battleId, battleCreateEvent.battleId) && Intrinsics.areEqual(this.userId, battleCreateEvent.userId);
    }

    public int hashCode() {
        int hashCode = ((this.selectedBetIds.hashCode() * 31) + Long.hashCode(this.matchId)) * 31;
        Long l = this.battleId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.userId;
        return hashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public String toString() {
        return "BattleCreateEvent(selectedBetIds=" + this.selectedBetIds + ", matchId=" + this.matchId + ", battleId=" + this.battleId + ", userId=" + this.userId + ")";
    }

    public BattleCreateEvent(Set<Long> selectedBetIds, long j, Long l, Long l2) {
        Intrinsics.checkNotNullParameter(selectedBetIds, "selectedBetIds");
        this.selectedBetIds = selectedBetIds;
        this.matchId = j;
        this.battleId = l;
        this.userId = l2;
    }

    public /* synthetic */ BattleCreateEvent(Set set, long j, Long l, Long l2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(set, j, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2);
    }

    public final Set<Long> getSelectedBetIds() {
        return this.selectedBetIds;
    }

    public final long getMatchId() {
        return this.matchId;
    }

    public final Long getBattleId() {
        return this.battleId;
    }

    public final Long getUserId() {
        return this.userId;
    }
}
