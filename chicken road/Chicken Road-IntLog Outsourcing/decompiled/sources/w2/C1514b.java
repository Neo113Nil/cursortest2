package w2;

import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import io.flutter.embedding.engine.FlutterEngine;

/* renamed from: w2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1514b implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1515c f12125a;

    public C1514b(AbstractActivityC1515c abstractActivityC1515c) {
        this.f12125a = abstractActivityC1515c;
    }

    public final void onBackCancelled() {
        AbstractActivityC1515c abstractActivityC1515c = this.f12125a;
        if (abstractActivityC1515c.j("cancelBackGesture")) {
            C1517e c1517e = abstractActivityC1515c.f12128b;
            c1517e.c();
            FlutterEngine flutterEngine = c1517e.f12134b;
            if (flutterEngine != null) {
                ((H2.o) flutterEngine.f10091j.f215b).a("cancelBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackInvoked() {
        AbstractActivityC1515c abstractActivityC1515c = this.f12125a;
        if (abstractActivityC1515c.j("commitBackGesture")) {
            C1517e c1517e = abstractActivityC1515c.f12128b;
            c1517e.c();
            FlutterEngine flutterEngine = c1517e.f12134b;
            if (flutterEngine != null) {
                ((H2.o) flutterEngine.f10091j.f215b).a("commitBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractActivityC1515c abstractActivityC1515c = this.f12125a;
        if (abstractActivityC1515c.j("updateBackGestureProgress")) {
            C1517e c1517e = abstractActivityC1515c.f12128b;
            c1517e.c();
            FlutterEngine flutterEngine = c1517e.f12134b;
            if (flutterEngine == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
                return;
            }
            B1.g gVar = flutterEngine.f10091j;
            gVar.getClass();
            ((H2.o) gVar.f215b).a("updateBackGestureProgress", B1.g.e(backEvent), null);
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractActivityC1515c abstractActivityC1515c = this.f12125a;
        if (abstractActivityC1515c.j("startBackGesture")) {
            C1517e c1517e = abstractActivityC1515c.f12128b;
            c1517e.c();
            FlutterEngine flutterEngine = c1517e.f12134b;
            if (flutterEngine == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
                return;
            }
            B1.g gVar = flutterEngine.f10091j;
            gVar.getClass();
            ((H2.o) gVar.f215b).a("startBackGesture", B1.g.e(backEvent), null);
        }
    }
}
