package p043f5;

import U5.C0436c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final class e extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0436c f12996b;

    public /* synthetic */ e(C0436c c0436c, int i7) {
        this.f12995a = i7;
        this.f12996b = c0436c;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f12995a) {
            case 0:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    this.f12996b.e("onBecomingNoisy", new Object[0]);
                }
                break;
            default:
                this.f12996b.e("onScoAudioStateUpdated", Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1)), Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1)));
                break;
        }
    }
}
