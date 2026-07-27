package s1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: s1.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1204k extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10338a;

    public /* synthetic */ C1204k(int i3) {
        this.f10338a = i3;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        boolean z3;
        boolean z4;
        switch (this.f10338a) {
            case 0:
                boolean equals = intent.getAction().equals("android.intent.action.SCREEN_OFF");
                C1205l c1205l = C1205l.f10339d;
                if (equals) {
                    z3 = c1205l.f10342c;
                    z4 = true;
                } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                    z3 = c1205l.f10342c;
                    z4 = false;
                }
                c1205l.a(z4, z3);
                c1205l.f10341b = z4;
                break;
            default:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra != 0) {
                        if (intExtra == 1) {
                            F2.b.f385g = 2;
                            break;
                        }
                    } else {
                        F2.b.f385g = 1;
                        break;
                    }
                }
                break;
        }
    }
}
