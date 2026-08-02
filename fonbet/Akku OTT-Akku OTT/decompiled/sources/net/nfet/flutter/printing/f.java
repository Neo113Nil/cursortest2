package net.nfet.flutter.printing;

import android.app.Activity;
import android.os.Handler;
import android.print.PrintJob;
import android.support.v4.media.session.MediaSessionCompat;
import kotlin.jvm.internal.Intrinsics;
import uz.shs.better_player_plus.BetterPlayerPlugin;

/* loaded from: classes5.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                h hVar = (h) this.b;
                Exception exc = (Exception) this.c;
                b bVar = hVar.b;
                PrintJob printJob = hVar.c;
                bVar.a(hVar, printJob != null && printJob.isCompleted(), exc.getMessage());
                break;
            default:
                BetterPlayerPlugin betterPlayerPlugin = (BetterPlayerPlugin) this.b;
                uz.shs.better_player_plus.c cVar = (uz.shs.better_player_plus.c) this.c;
                Activity activity = betterPlayerPlugin.f;
                Intrinsics.checkNotNull(activity);
                if (!activity.isInPictureInPictureMode()) {
                    cVar.c(false);
                    MediaSessionCompat mediaSessionCompat = cVar.n;
                    if (mediaSessionCompat != null) {
                        mediaSessionCompat.b();
                    }
                    cVar.n = null;
                    Handler handler = betterPlayerPlugin.i;
                    if (handler != null) {
                        Intrinsics.checkNotNull(handler);
                        handler.removeCallbacksAndMessages(null);
                        betterPlayerPlugin.i = null;
                    }
                    betterPlayerPlugin.j = null;
                    break;
                } else {
                    Handler handler2 = betterPlayerPlugin.i;
                    Intrinsics.checkNotNull(handler2);
                    f fVar = betterPlayerPlugin.j;
                    Intrinsics.checkNotNull(fVar);
                    handler2.postDelayed(fVar, 100L);
                    break;
                }
        }
    }
}
