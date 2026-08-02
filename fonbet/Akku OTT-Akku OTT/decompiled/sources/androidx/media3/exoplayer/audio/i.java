package androidx.media3.exoplayer.audio;

import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin;
import java.util.Map;

/* loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((AudioRendererEventListener.EventDispatcher) this.b).lambda$audioCodecError$9((Exception) this.c);
                break;
            case 1:
                com.csdcorp.speech_to_text.b bVar = (com.csdcorp.speech_to_text.b) this.b;
                bVar.b.success(this.c);
                break;
            case 2:
                ((com.tekartik.sqflite.d) this.b).d((com.tekartik.sqflite.operation.c) this.c);
                break;
            default:
                FlutterFirebaseMessagingPlugin.lambda$unsubscribeFromTopic$5((Map) this.b, (TaskCompletionSource) this.c);
                break;
        }
    }
}
