package dev.fluttercommunity.plus.connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.video.k;
import io.flutter.plugin.common.EventChannel;

/* loaded from: classes4.dex */
public final class b extends BroadcastReceiver implements EventChannel.StreamHandler {
    public final dev.fluttercommunity.plus.connectivity.a a;
    public EventChannel.EventSink b;
    public final Handler c = new Handler(Looper.getMainLooper());
    public a d;

    public class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            b bVar = b.this;
            bVar.c.post(new androidx.core.content.res.a(1, bVar, dev.fluttercommunity.plus.connectivity.a.a(bVar.a.a.getNetworkCapabilities(network))));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            b bVar = b.this;
            bVar.a.getClass();
            bVar.c.post(new androidx.core.content.res.a(1, bVar, dev.fluttercommunity.plus.connectivity.a.a(networkCapabilities)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            b bVar = b.this;
            bVar.c.postDelayed(new k(bVar, 2), 500L);
        }
    }

    public b(Context context, dev.fluttercommunity.plus.connectivity.a aVar) {
        this.a = aVar;
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        a aVar = this.d;
        if (aVar != null) {
            this.a.a.unregisterNetworkCallback(aVar);
            this.d = null;
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.b = eventSink;
        a aVar = new a();
        this.d = aVar;
        dev.fluttercommunity.plus.connectivity.a aVar2 = this.a;
        aVar2.a.registerDefaultNetworkCallback(aVar);
        ConnectivityManager connectivityManager = aVar2.a;
        this.c.post(new androidx.core.content.res.a(1, this, dev.fluttercommunity.plus.connectivity.a.a(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()))));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        EventChannel.EventSink eventSink = this.b;
        if (eventSink != null) {
            ConnectivityManager connectivityManager = this.a.a;
            eventSink.success(dev.fluttercommunity.plus.connectivity.a.a(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork())));
        }
    }
}
