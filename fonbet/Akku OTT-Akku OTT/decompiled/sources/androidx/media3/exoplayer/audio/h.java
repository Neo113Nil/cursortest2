package androidx.media3.exoplayer.audio;

import android.content.Intent;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.window.area.RearDisplaySessionImpl;
import androidx.window.area.WindowAreaControllerImpl;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) this.b).lambda$audioTrackInitialized$10((AudioSink.AudioTrackConfig) this.c);
                break;
            case 1:
                WindowAreaControllerImpl.RearDisplaySessionConsumer.onSessionStarted$lambda$1$lambda$0((WindowAreaControllerImpl.RearDisplaySessionConsumer) this.b, (RearDisplaySessionImpl) this.c);
                break;
            case 2:
                ((DrmSessionEventListener.EventDispatcher) this.b).lambda$drmSessionReleased$5((DrmSessionEventListener) this.c);
                break;
            case 3:
                FlutterFirebaseAnalyticsPlugin.handleResetAnalyticsData$lambda$0((FlutterFirebaseAnalyticsPlugin) this.b, (TaskCompletionSource) this.c);
                break;
            default:
                FlutterFirebaseMessagingBackgroundService.lambda$onHandleWork$0((Intent) this.b, (CountDownLatch) this.c);
                break;
        }
    }
}
