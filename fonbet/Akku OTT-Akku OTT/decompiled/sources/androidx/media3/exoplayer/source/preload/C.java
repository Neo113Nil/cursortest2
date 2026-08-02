package androidx.media3.exoplayer.source.preload;

import androidx.media3.common.Timeline;
import com.google.android.gms.tasks.TaskCompletionSource;
import io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin;

/* loaded from: classes3.dex */
public final /* synthetic */ class C implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ C(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((PreloadMediaSource) this.b).lambda$onChildSourceInfoRefreshed$2((Timeline) this.c);
                break;
            default:
                FlutterFirebaseCorePlugin.lambda$delete$8((String) this.b, (TaskCompletionSource) this.c);
                break;
        }
    }
}
