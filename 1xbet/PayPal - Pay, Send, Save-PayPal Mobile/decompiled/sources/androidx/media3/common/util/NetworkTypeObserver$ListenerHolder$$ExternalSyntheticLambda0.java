package androidx.media3.common.util;

/* loaded from: classes7.dex */
public final /* synthetic */ class NetworkTypeObserver$ListenerHolder$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ androidx.media3.common.util.NetworkTypeObserver.ListenerHolder f$0;

    @Override // java.lang.Runnable
    public final void run() {
        androidx.media3.common.util.NetworkTypeObserver.ListenerHolder listenerHolder = this.f$0;
        androidx.media3.common.util.NetworkTypeObserver.Listener listener = listenerHolder.Camera2StreamConfigurationMap.get();
        if (listener != null) {
            listener.onNetworkTypeChanged(listenerHolder.getHighSpeedVideoSizes.getNetworkType());
        }
    }
}
