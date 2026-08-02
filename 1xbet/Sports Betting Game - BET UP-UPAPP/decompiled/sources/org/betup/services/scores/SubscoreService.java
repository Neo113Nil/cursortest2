package org.betup.services.scores;

import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.bus.SubScoreUpdateMessage;
import org.betup.model.remote.entity.bets.SubMatchModel;
import org.greenrobot.eventbus.EventBus;

@Singleton
/* loaded from: classes2.dex */
public class SubscoreService {
    private SubMatchModel match;

    @Inject
    public SubscoreService() {
    }

    public SubMatchModel getSubMatch() {
        return this.match;
    }

    public void setSubmatch(SubMatchModel subMatchModel) {
        this.match = subMatchModel;
        EventBus.getDefault().post(new SubScoreUpdateMessage(subMatchModel));
    }
}
