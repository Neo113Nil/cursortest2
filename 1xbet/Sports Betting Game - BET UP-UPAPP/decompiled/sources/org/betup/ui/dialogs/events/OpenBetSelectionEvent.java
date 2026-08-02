package org.betup.ui.dialogs.events;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleEvents.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJH\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0013\u0010\u000e¨\u0006!"}, d2 = {"Lorg/betup/ui/dialogs/events/OpenBetSelectionEvent;", "", "matchId", "", "battleId", "userId", "followerPhotoUrl", "", "rematchBuyIn", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)V", "getMatchId", "()J", "getBattleId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getUserId", "getFollowerPhotoUrl", "()Ljava/lang/String;", "getRematchBuyIn", "component1", "component2", "component3", "component4", "component5", "copy", "(JLjava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Long;)Lorg/betup/ui/dialogs/events/OpenBetSelectionEvent;", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OpenBetSelectionEvent {
    public static final int $stable = 0;
    private final Long battleId;
    private final String followerPhotoUrl;
    private final long matchId;
    private final Long rematchBuyIn;
    private final Long userId;

    public static /* synthetic */ OpenBetSelectionEvent copy$default(OpenBetSelectionEvent openBetSelectionEvent, long j, Long l, Long l2, String str, Long l3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = openBetSelectionEvent.matchId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            l = openBetSelectionEvent.battleId;
        }
        Long l4 = l;
        if ((i & 4) != 0) {
            l2 = openBetSelectionEvent.userId;
        }
        Long l5 = l2;
        if ((i & 8) != 0) {
            str = openBetSelectionEvent.followerPhotoUrl;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            l3 = openBetSelectionEvent.rematchBuyIn;
        }
        return openBetSelectionEvent.copy(j2, l4, l5, str2, l3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getMatchId() {
        return this.matchId;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getBattleId() {
        return this.battleId;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getUserId() {
        return this.userId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getFollowerPhotoUrl() {
        return this.followerPhotoUrl;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getRematchBuyIn() {
        return this.rematchBuyIn;
    }

    public final OpenBetSelectionEvent copy(long matchId, Long battleId, Long userId, String followerPhotoUrl, Long rematchBuyIn) {
        return new OpenBetSelectionEvent(matchId, battleId, userId, followerPhotoUrl, rematchBuyIn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenBetSelectionEvent)) {
            return false;
        }
        OpenBetSelectionEvent openBetSelectionEvent = (OpenBetSelectionEvent) other;
        return this.matchId == openBetSelectionEvent.matchId && Intrinsics.areEqual(this.battleId, openBetSelectionEvent.battleId) && Intrinsics.areEqual(this.userId, openBetSelectionEvent.userId) && Intrinsics.areEqual(this.followerPhotoUrl, openBetSelectionEvent.followerPhotoUrl) && Intrinsics.areEqual(this.rematchBuyIn, openBetSelectionEvent.rematchBuyIn);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.matchId) * 31;
        Long l = this.battleId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.userId;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.followerPhotoUrl;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Long l3 = this.rematchBuyIn;
        return hashCode4 + (l3 != null ? l3.hashCode() : 0);
    }

    public String toString() {
        return "OpenBetSelectionEvent(matchId=" + this.matchId + ", battleId=" + this.battleId + ", userId=" + this.userId + ", followerPhotoUrl=" + this.followerPhotoUrl + ", rematchBuyIn=" + this.rematchBuyIn + ")";
    }

    public OpenBetSelectionEvent(long j, Long l, Long l2, String str, Long l3) {
        this.matchId = j;
        this.battleId = l;
        this.userId = l2;
        this.followerPhotoUrl = str;
        this.rematchBuyIn = l3;
    }

    public /* synthetic */ OpenBetSelectionEvent(long j, Long l, Long l2, String str, Long l3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : l3);
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

    public final String getFollowerPhotoUrl() {
        return this.followerPhotoUrl;
    }

    public final Long getRematchBuyIn() {
        return this.rematchBuyIn;
    }
}
