package sg.bigo.ads.I0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes3.dex */
public final class e extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (f.h <= 0 || System.currentTimeMillis() - f.h >= 10 * 1000) {
            f.h = System.currentTimeMillis();
            if (intent != null) {
                try {
                    sg.bigo.ads.U.b bVar = f.i;
                    bVar.f12560a = intent.getIntExtra("level", -1);
                    bVar.b = intent.getIntExtra("scale", -1);
                    bVar.c = intent.getIntExtra("status", -1);
                } catch (Throwable unused) {
                    sg.bigo.ads.U.b bVar2 = f.i;
                    bVar2.f12560a = -1;
                    bVar2.b = -1;
                    bVar2.c = -1;
                }
            }
        }
    }
}
