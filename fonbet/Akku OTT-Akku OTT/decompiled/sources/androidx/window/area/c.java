package androidx.window.area;

import androidx.window.area.WindowAreaControllerImpl;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.firebase.messaging.FirebaseMessaging;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                WindowAreaControllerImpl.RearDisplaySessionConsumer.onSessionFinished$lambda$2((WindowAreaControllerImpl.RearDisplaySessionConsumer) this.b);
                break;
            case 1:
                ((PlayerControlView) this.b).hide();
                break;
            default:
                ((FirebaseMessaging) this.b).lambda$new$2();
                break;
        }
    }
}
