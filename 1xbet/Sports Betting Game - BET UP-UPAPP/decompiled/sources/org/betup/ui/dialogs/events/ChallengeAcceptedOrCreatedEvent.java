package org.betup.ui.dialogs.events;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: BattleEvents.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0013"}, d2 = {"Lorg/betup/ui/dialogs/events/ChallengeAcceptedOrCreatedEvent;", "", "challengeId", "", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/Long;)V", "getChallengeId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "copy", "(Ljava/lang/Long;)Lorg/betup/ui/dialogs/events/ChallengeAcceptedOrCreatedEvent;", "equals", "", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ChallengeAcceptedOrCreatedEvent {
    public static final int $stable = 0;
    private final Long challengeId;

    public static /* synthetic */ ChallengeAcceptedOrCreatedEvent copy$default(ChallengeAcceptedOrCreatedEvent challengeAcceptedOrCreatedEvent, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            l = challengeAcceptedOrCreatedEvent.challengeId;
        }
        return challengeAcceptedOrCreatedEvent.copy(l);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getChallengeId() {
        return this.challengeId;
    }

    public final ChallengeAcceptedOrCreatedEvent copy(Long challengeId) {
        return new ChallengeAcceptedOrCreatedEvent(challengeId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ChallengeAcceptedOrCreatedEvent) && Intrinsics.areEqual(this.challengeId, ((ChallengeAcceptedOrCreatedEvent) other).challengeId);
    }

    public int hashCode() {
        Long l = this.challengeId;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public String toString() {
        return "ChallengeAcceptedOrCreatedEvent(challengeId=" + this.challengeId + ")";
    }

    public ChallengeAcceptedOrCreatedEvent(Long l) {
        this.challengeId = l;
    }

    public final Long getChallengeId() {
        return this.challengeId;
    }
}
