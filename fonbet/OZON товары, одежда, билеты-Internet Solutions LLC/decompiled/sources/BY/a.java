package BY;

import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
import ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener;
import ru.ozon.app.android.videocover.VideoTileDelegate;

/* loaded from: classes7.dex */
public final /* synthetic */ class a implements OnRenderedFirstFramePlayerControllerListener, OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f3306a;

    public /* synthetic */ a(Object obj) {
        this.f3306a = obj;
    }

    @Override // ru.ozon.app.android.video.playerV2.playerController.base.listeners.OnRenderedFirstFramePlayerControllerListener
    public void onRenderedFirstFrame() {
        VideoTileDelegate.playerListener$lambda$8$lambda$1((VideoTileDelegate) this.f3306a);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        FirebaseMessaging.d((FirebaseMessaging) this.f3306a, (CloudMessage) obj);
    }
}
