package A1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

/* JADX INFO: renamed from: A1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0009b extends BroadcastReceiver implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0011c f324c;

    public RunnableC0009b(C0011c c0011c, Handler handler, K k7) {
        this.f324c = c0011c;
        this.f323b = handler;
        this.f322a = k7;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f323b.post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f324c.f332b) {
            this.f322a.f109a.T(-1, 3, false);
        }
    }
}
