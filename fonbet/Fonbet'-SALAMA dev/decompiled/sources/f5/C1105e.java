package f5;

import U5.C0436c;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: f5.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1105e extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12989a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0436c f12990b;

    public /* synthetic */ C1105e(C0436c c0436c, int i7) {
        this.f12989a = i7;
        this.f12990b = c0436c;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f12989a) {
            case 0:
                if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                    this.f12990b.e("onBecomingNoisy", new Object[0]);
                    break;
                }
                break;
            default:
                this.f12990b.e("onScoAudioStateUpdated", Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1)), Integer.valueOf(intent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1)));
                break;
        }
    }
}
