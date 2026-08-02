package org.betup.model.remote.api.rest.energy;

import kotlin.Metadata;
import org.modelmapper.internal.bytebuddy.description.method.MethodDescription;

/* compiled from: ChallengeAcceptInteractor.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lorg/betup/model/remote/api/rest/energy/ChallengeAcceptRequest;", "", "challengeId", "", "participantState", "", "grabbedBetIds", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(JIJ)V", "getChallengeId", "()J", "getParticipantState", "()I", "getGrabbedBetIds", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ChallengeAcceptRequest {
    public static final int $stable = 0;
    private final long challengeId;
    private final long grabbedBetIds;
    private final int participantState;

    public static /* synthetic */ ChallengeAcceptRequest copy$default(ChallengeAcceptRequest challengeAcceptRequest, long j, int i, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = challengeAcceptRequest.challengeId;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            i = challengeAcceptRequest.participantState;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            j2 = challengeAcceptRequest.grabbedBetIds;
        }
        return challengeAcceptRequest.copy(j3, i3, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getChallengeId() {
        return this.challengeId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getParticipantState() {
        return this.participantState;
    }

    /* renamed from: component3, reason: from getter */
    public final long getGrabbedBetIds() {
        return this.grabbedBetIds;
    }

    public final ChallengeAcceptRequest copy(long challengeId, int participantState, long grabbedBetIds) {
        return new ChallengeAcceptRequest(challengeId, participantState, grabbedBetIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChallengeAcceptRequest)) {
            return false;
        }
        ChallengeAcceptRequest challengeAcceptRequest = (ChallengeAcceptRequest) other;
        return this.challengeId == challengeAcceptRequest.challengeId && this.participantState == challengeAcceptRequest.participantState && this.grabbedBetIds == challengeAcceptRequest.grabbedBetIds;
    }

    public int hashCode() {
        return (((Long.hashCode(this.challengeId) * 31) + Integer.hashCode(this.participantState)) * 31) + Long.hashCode(this.grabbedBetIds);
    }

    public String toString() {
        return "ChallengeAcceptRequest(challengeId=" + this.challengeId + ", participantState=" + this.participantState + ", grabbedBetIds=" + this.grabbedBetIds + ")";
    }

    public ChallengeAcceptRequest(long j, int i, long j2) {
        this.challengeId = j;
        this.participantState = i;
        this.grabbedBetIds = j2;
    }

    public final long getChallengeId() {
        return this.challengeId;
    }

    public final int getParticipantState() {
        return this.participantState;
    }

    public final long getGrabbedBetIds() {
        return this.grabbedBetIds;
    }
}
