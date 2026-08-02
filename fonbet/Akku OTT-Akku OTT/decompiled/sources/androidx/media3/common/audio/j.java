package androidx.media3.common.audio;

import android.content.Context;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.session.MediaNotification;
import androidx.media3.session.MediaSessionService;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                AudioManagerCompat.lambda$getAudioManager$0((Context) this.b, (ConditionVariable) this.c);
                break;
            case 1:
                ((MediaSessionService) this.b).lambda$setMediaNotificationProvider$3((MediaNotification.Provider) this.c);
                break;
            case 2:
                ((DrmSessionEventListener.EventDispatcher) this.b).lambda$drmKeysRemoved$4((DrmSessionEventListener) this.c);
                break;
            case 3:
                ((VideoRendererEventListener.EventDispatcher) this.b).lambda$enabled$0((DecoderCounters) this.c);
                break;
            default:
                FlutterFirebaseCrashlyticsPlugin.lambda$setCustomKey$10((Map) this.b, (TaskCompletionSource) this.c);
                break;
        }
    }
}
