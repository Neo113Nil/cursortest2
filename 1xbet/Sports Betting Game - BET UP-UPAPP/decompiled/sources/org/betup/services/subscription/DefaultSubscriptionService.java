package org.betup.services.subscription;

import android.content.Context;
import android.os.Bundle;
import com.android.billingclient.api.BillingClient;
import io.bidmachine.media3.extractor.text.ttml.TtmlNode;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.betup.BetUpApp;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.api.rest.subscription.GetV7MatchSubscriptionInteractor;
import org.betup.model.remote.api.rest.subscription.UpdateV7MatchSubscriptionInteractor;
import org.betup.model.remote.entity.subscription.SubscriptionType;
import org.betup.model.remote.entity.subscription.V7MatchSubscriptionUpdateRequest;
import org.betup.services.subscription.SubscriptionService;

@Singleton
/* loaded from: classes2.dex */
public class DefaultSubscriptionService implements SubscriptionService {

    @Inject
    GetV7MatchSubscriptionInteractor getV7MatchSubscriptionInteractor;

    @Inject
    UpdateV7MatchSubscriptionInteractor updateV7MatchSubscriptionInteractor;
    private Map<Integer, WeakReference<SubscriptionService.MatchSubscriptionsLoadListener>> matchListeners = new HashMap();
    private final BaseCachedSharedInteractor.OnFetchedListener<Map<String, Boolean>, Long> v7MatchLoadListener = new BaseCachedSharedInteractor.OnFetchedListener<Map<String, Boolean>, Long>() { // from class: org.betup.services.subscription.DefaultSubscriptionService.1
        @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
        public void onFetched(FetchedResponseMessage<Map<String, Boolean>, Long> responseMessage) {
            SubscriptionService.MatchSubscriptionsLoadListener matchSubscriptionsLoadListener = (SubscriptionService.MatchSubscriptionsLoadListener) ((WeakReference) DefaultSubscriptionService.this.matchListeners.get(Integer.valueOf(responseMessage.getId().intValue()))).get();
            if (matchSubscriptionsLoadListener != null) {
                if (responseMessage.getStat() == FetchStat.SUCCESS && responseMessage.getModel() != null) {
                    Map<String, Boolean> model = responseMessage.getModel();
                    ArrayList arrayList = new ArrayList();
                    if (Boolean.TRUE.equals(model.get(TtmlNode.START))) {
                        arrayList.add(SubscriptionType.START);
                    }
                    if (Boolean.TRUE.equals(model.get("score"))) {
                        arrayList.add(SubscriptionType.SCORE);
                    }
                    if (Boolean.TRUE.equals(model.get("finish"))) {
                        arrayList.add(SubscriptionType.FINISH);
                    }
                    matchSubscriptionsLoadListener.onMatchSubscriptionsGot(arrayList, true);
                } else {
                    matchSubscriptionsLoadListener.onMatchSubscriptionsGot(null, false);
                }
                DefaultSubscriptionService.this.matchListeners.remove(Integer.valueOf(responseMessage.getId().intValue()));
            }
        }
    };

    @Inject
    public DefaultSubscriptionService(Context context) {
        ((BetUpApp) context.getApplicationContext()).getComponent().inject(this);
    }

    @Override // org.betup.services.subscription.SubscriptionService
    public void getMatchSubscriptions(int matchId, SubscriptionService.MatchSubscriptionsLoadListener listener) {
        this.matchListeners.put(Integer.valueOf(matchId), new WeakReference<>(listener));
        this.getV7MatchSubscriptionInteractor.load(this.v7MatchLoadListener, Long.valueOf(matchId));
    }

    @Override // org.betup.services.subscription.SubscriptionService
    public void updateMatchSubscriptions(int matchId, List<SubscriptionType> types) {
        long j = matchId;
        Map<String, Boolean> fromCacheIfExists = this.getV7MatchSubscriptionInteractor.getFromCacheIfExists(Long.valueOf(j), null);
        boolean z = false;
        boolean z2 = fromCacheIfExists != null && Boolean.TRUE.equals(fromCacheIfExists.get(TtmlNode.START));
        boolean z3 = fromCacheIfExists != null && Boolean.TRUE.equals(fromCacheIfExists.get("score"));
        if (fromCacheIfExists != null && Boolean.TRUE.equals(fromCacheIfExists.get("finish"))) {
            z = true;
        }
        boolean contains = types.contains(SubscriptionType.START);
        boolean contains2 = types.contains(SubscriptionType.SCORE);
        boolean contains3 = types.contains(SubscriptionType.FINISH);
        ArrayList arrayList = new ArrayList();
        if (contains != z2) {
            arrayList.add(new V7MatchSubscriptionUpdateRequest.SubscriptionUpdate(TtmlNode.START, contains ? 1 : 2));
        }
        if (contains2 != z3) {
            arrayList.add(new V7MatchSubscriptionUpdateRequest.SubscriptionUpdate("score", contains2 ? 1 : 2));
        }
        if (contains3 != z) {
            arrayList.add(new V7MatchSubscriptionUpdateRequest.SubscriptionUpdate("finish", contains3 ? 1 : 2));
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable(BillingClient.FeatureType.SUBSCRIPTIONS, arrayList);
        this.getV7MatchSubscriptionInteractor.invalidate(Long.valueOf(j));
        this.updateV7MatchSubscriptionInteractor.load(null, Long.valueOf(j), bundle);
    }
}
