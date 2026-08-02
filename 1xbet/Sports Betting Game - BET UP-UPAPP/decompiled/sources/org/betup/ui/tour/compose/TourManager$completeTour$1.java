package org.betup.ui.tour.compose;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.betup.bus.TourFinishedMessage;
import org.betup.model.remote.api.FetchStat;
import org.betup.model.remote.api.FetchedResponseMessage;
import org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor;
import org.betup.model.remote.entity.user.TutorialCompleteResponseModel;
import org.betup.services.user.UserService;
import org.greenrobot.eventbus.EventBus;

/* compiled from: TourManager.kt */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u001c\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0007H\u0016¨\u0006\b"}, d2 = {"org/betup/ui/tour/compose/TourManager$completeTour$1", "Lorg/betup/model/remote/api/rest/base/BaseCachedSharedInteractor$OnFetchedListener;", "Lorg/betup/model/remote/entity/user/TutorialCompleteResponseModel;", "Ljava/lang/Void;", "onFetched", "", "responseMessage", "Lorg/betup/model/remote/api/FetchedResponseMessage;", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TourManager$completeTour$1 implements BaseCachedSharedInteractor.OnFetchedListener<TutorialCompleteResponseModel, Void> {
    final /* synthetic */ int $clientFallbackTotal;
    final /* synthetic */ String $tourDemoBetType;
    final /* synthetic */ TourManager this$0;

    TourManager$completeTour$1(int i, String str, TourManager tourManager) {
        this.$clientFallbackTotal = i;
        this.$tourDemoBetType = str;
        this.this$0 = tourManager;
    }

    @Override // org.betup.model.remote.api.rest.base.BaseCachedSharedInteractor.OnFetchedListener
    public void onFetched(FetchedResponseMessage<TutorialCompleteResponseModel, Void> responseMessage) {
        final int i;
        UserService userService;
        Intrinsics.checkNotNullParameter(responseMessage, "responseMessage");
        if (responseMessage.getStat() == FetchStat.SUCCESS && responseMessage.getModel() != null) {
            TutorialCompleteResponseModel model = responseMessage.getModel();
            Intrinsics.checkNotNull(model);
            i = RangesKt.coerceAtLeast((int) model.getBetcoinsCredited(), 0);
        } else {
            i = this.$clientFallbackTotal;
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: org.betup.ui.tour.compose.TourManager$completeTour$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                TourManager$completeTour$1.onFetched$lambda$0(i);
            }
        });
        TutorialCompleteResponseModel model2 = responseMessage.getModel();
        Log.d("TourFlow", "TourManager - tutorialComplete API: amountForDialog=" + i + " (credited=" + (model2 != null ? Long.valueOf(model2.getBetcoinsCredited()) : null) + ", fallback=" + this.$clientFallbackTotal + ", tourDemoBetType=" + this.$tourDemoBetType + ")");
        userService = this.this$0.userService;
        userService.invalidate(UserService.InfoKind.GENERAL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onFetched$lambda$0(int i) {
        EventBus.getDefault().post(new TourFinishedMessage(i));
    }
}
