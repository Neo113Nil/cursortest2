package org.betup.bus;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class BetlistUpdatedMessage {
    private final Long matchId;
    private final List<Long> removedBetIds;
    private final List<Long> unavailableBetIds;

    public BetlistUpdatedMessage() {
        this.matchId = null;
        this.removedBetIds = null;
        this.unavailableBetIds = null;
    }

    public BetlistUpdatedMessage(Long matchId) {
        this.matchId = matchId;
        this.removedBetIds = null;
        this.unavailableBetIds = null;
    }

    @Deprecated
    public BetlistUpdatedMessage(Long matchId, List<Long> invalidBetIds) {
        this.matchId = matchId;
        this.removedBetIds = invalidBetIds;
        this.unavailableBetIds = null;
    }

    public BetlistUpdatedMessage(Long matchId, List<Long> removedBetIds, List<Long> unavailableBetIds) {
        this.matchId = matchId;
        this.removedBetIds = removedBetIds == null ? null : removedBetIds;
        this.unavailableBetIds = unavailableBetIds == null ? null : unavailableBetIds;
    }

    public Long getMatchId() {
        return this.matchId;
    }

    public List<Long> getRemovedBetIds() {
        List<Long> list = this.removedBetIds;
        return list != null ? list : Collections.emptyList();
    }

    public List<Long> getUnavailableBetIds() {
        List<Long> list = this.unavailableBetIds;
        return list != null ? list : Collections.emptyList();
    }

    @Deprecated
    public List<Long> getInvalidBetIds() {
        return getRemovedBetIds();
    }
}
