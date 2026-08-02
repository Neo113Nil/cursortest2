package org.betup.services.subscription;

import java.util.List;
import org.betup.model.remote.entity.subscription.MatchSubscriptionModel;
import org.betup.model.remote.entity.subscription.SubscriptionType;

/* loaded from: classes2.dex */
public interface SubscriptionService {
    public static final int SUBSCRIBE_ACTION = 1;
    public static final int UNSUBSCRIBE_ACTION = 2;

    public interface AllSubscriptionsLoadListener {
        void onAllSubscriptionsGot(List<MatchSubscriptionModel> matchSubscriptions, int page, boolean success);
    }

    public interface MatchSubscriptionsLoadListener {
        void onMatchSubscriptionsGot(List<SubscriptionType> types, boolean success);
    }

    void getMatchSubscriptions(int matchId, MatchSubscriptionsLoadListener listener);

    void updateMatchSubscriptions(int matchId, List<SubscriptionType> types);
}
