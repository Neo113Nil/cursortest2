package androidx.media3.exoplayer.audio;

import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) this.b).lambda$disabled$6((DecoderCounters) this.c);
                break;
            case 1:
                ((DrmSessionEventListener.EventDispatcher) this.b).lambda$drmKeysRestored$3((DrmSessionEventListener) this.c);
                break;
            default:
                FlutterFirebaseAnalyticsPlugin.handleGetAppInstanceId$lambda$0((TaskCompletionSource) this.b, (FlutterFirebaseAnalyticsPlugin) this.c);
                break;
        }
    }
}
