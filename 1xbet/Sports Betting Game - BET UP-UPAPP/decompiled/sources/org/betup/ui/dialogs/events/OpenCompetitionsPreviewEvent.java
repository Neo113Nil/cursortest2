package org.betup.ui.dialogs.events;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: OpenCompetitionsPreviewEvent.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ0\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lorg/betup/ui/dialogs/events/OpenCompetitionsPreviewEvent;", "", "competitionId", "", "competitionIdP", "getIsWon", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JLjava/lang/Long;Ljava/lang/Boolean;)V", "getCompetitionId", "()J", "getCompetitionIdP", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getGetIsWon", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(JLjava/lang/Long;Ljava/lang/Boolean;)Lorg/betup/ui/dialogs/events/OpenCompetitionsPreviewEvent;", "equals", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OpenCompetitionsPreviewEvent {
    public static final int $stable = 0;
    private final long competitionId;
    private final Long competitionIdP;
    private final Boolean getIsWon;

    public static /* synthetic */ OpenCompetitionsPreviewEvent copy$default(OpenCompetitionsPreviewEvent openCompetitionsPreviewEvent, long j, Long l, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            j = openCompetitionsPreviewEvent.competitionId;
        }
        if ((i & 2) != 0) {
            l = openCompetitionsPreviewEvent.competitionIdP;
        }
        if ((i & 4) != 0) {
            bool = openCompetitionsPreviewEvent.getIsWon;
        }
        return openCompetitionsPreviewEvent.copy(j, l, bool);
    }

    /* renamed from: component1, reason: from getter */
    public final long getCompetitionId() {
        return this.competitionId;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getCompetitionIdP() {
        return this.competitionIdP;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getGetIsWon() {
        return this.getIsWon;
    }

    public final OpenCompetitionsPreviewEvent copy(long competitionId, Long competitionIdP, Boolean getIsWon) {
        return new OpenCompetitionsPreviewEvent(competitionId, competitionIdP, getIsWon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenCompetitionsPreviewEvent)) {
            return false;
        }
        OpenCompetitionsPreviewEvent openCompetitionsPreviewEvent = (OpenCompetitionsPreviewEvent) other;
        return this.competitionId == openCompetitionsPreviewEvent.competitionId && Intrinsics.areEqual(this.competitionIdP, openCompetitionsPreviewEvent.competitionIdP) && Intrinsics.areEqual(this.getIsWon, openCompetitionsPreviewEvent.getIsWon);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.competitionId) * 31;
        Long l = this.competitionIdP;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool = this.getIsWon;
        return hashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "OpenCompetitionsPreviewEvent(competitionId=" + this.competitionId + ", competitionIdP=" + this.competitionIdP + ", getIsWon=" + this.getIsWon + ")";
    }

    public OpenCompetitionsPreviewEvent(long j, Long l, Boolean bool) {
        this.competitionId = j;
        this.competitionIdP = l;
        this.getIsWon = bool;
    }

    public final long getCompetitionId() {
        return this.competitionId;
    }

    public final Long getCompetitionIdP() {
        return this.competitionIdP;
    }

    public final Boolean getGetIsWon() {
        return this.getIsWon;
    }
}
