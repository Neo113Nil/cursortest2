package T2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.ads.AbstractC1803xs;
import com.google.android.gms.internal.ads.Os;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public final class K extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5671a;

    public /* synthetic */ K(int i) {
        this.f5671a = i;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f5671a) {
            case 0:
                synchronized (U2.g.f5868b) {
                    U2.g.f5869c = false;
                    U2.g.f5870d = false;
                    U2.j.i("Ad debug logging enablement is out of date.");
                }
                AbstractC2346c.K(context);
                return;
            case 1:
                boolean equals = intent.getAction().equals("android.intent.action.SCREEN_OFF");
                Os os = Os.f11007d;
                if (equals) {
                    os.a(true, os.f11010c);
                    os.f11009b = true;
                    return;
                } else {
                    if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
                        os.a(false, os.f11010c);
                        os.f11009b = false;
                        return;
                    }
                    return;
                }
            default:
                if (intent.getAction() == "android.media.action.HDMI_AUDIO_PLUG") {
                    int intExtra = intent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", -1);
                    if (intExtra == 0) {
                        AbstractC1803xs.f = 1;
                        return;
                    } else {
                        if (intExtra == 1) {
                            AbstractC1803xs.f = 2;
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }
}
