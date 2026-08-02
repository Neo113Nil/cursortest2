package HL;

import J7.h;
import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import androidx.media3.ui.PlayerView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import ru.ozon.app.android.storefront.stories.playstoriesv3.data.vo.StoryV3Item;
import ru.ozon.app.android.storefront.stories.playstoriesv3.presentation.fragments.StoryV3MediaFragment;
import ru.ozon.app.android.storefront.widgets.rateApp.RateAppRouter;
import ru.ozon.app.android.video.player.PlayerState;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnStartPlayerControllerListener;
import ru.ozon.app.android.video.playerV2.playerController.singleInstance.SingleInstancePlayerController;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements OnCompleteListener, OnStartPlayerControllerListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f10740a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10741b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10742c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Parcelable f10743d;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Parcelable parcelable) {
        this.f10740a = obj;
        this.f10741b = obj2;
        this.f10742c = obj3;
        this.f10743d = parcelable;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        RateAppRouter.tryInAppReview$lambda$2((h) this.f10740a, (Activity) this.f10741b, (RateAppRouter) this.f10742c, (Intent) this.f10743d, task);
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnStartPlayerControllerListener
    public void onStart(PlayerState playerState) {
        StoryV3MediaFragment.showVideo$lambda$17$lambda$16$lambda$10((StoryV3MediaFragment) this.f10740a, (SingleInstancePlayerController) this.f10741b, (PlayerView) this.f10742c, (StoryV3Item) this.f10743d, playerState);
    }
}
