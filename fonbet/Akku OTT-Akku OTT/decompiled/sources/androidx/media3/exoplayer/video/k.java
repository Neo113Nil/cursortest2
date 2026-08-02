package androidx.media3.exoplayer.video;

import android.net.ConnectivityManager;
import androidx.media3.exoplayer.video.VideoSink;
import com.facebook.internal.DialogC0714j;
import io.flutter.plugin.common.EventChannel;

/* loaded from: classes3.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((VideoSink.Listener) this.b).onFrameDropped();
                break;
            case 1:
                DialogC0714j.g((DialogC0714j) this.b);
                break;
            default:
                dev.fluttercommunity.plus.connectivity.b bVar = (dev.fluttercommunity.plus.connectivity.b) this.b;
                EventChannel.EventSink eventSink = bVar.b;
                ConnectivityManager connectivityManager = bVar.a.a;
                eventSink.success(dev.fluttercommunity.plus.connectivity.a.a(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
                break;
        }
    }
}
