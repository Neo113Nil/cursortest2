package I1;

import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import io.flutter.embedding.engine.FlutterEngine;

/* renamed from: I1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0026c implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0027d f595a;

    public C0026c(AbstractActivityC0027d abstractActivityC0027d) {
        this.f595a = abstractActivityC0027d;
    }

    public final void onBackCancelled() {
        AbstractActivityC0027d abstractActivityC0027d = this.f595a;
        if (abstractActivityC0027d.m("cancelBackGesture")) {
            C0030g c0030g = abstractActivityC0027d.f598b;
            c0030g.c();
            FlutterEngine flutterEngine = c0030g.f606b;
            if (flutterEngine != null) {
                ((T1.o) flutterEngine.f9106j.f2461b).a("cancelBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackInvoked() {
        AbstractActivityC0027d abstractActivityC0027d = this.f595a;
        if (abstractActivityC0027d.m("commitBackGesture")) {
            C0030g c0030g = abstractActivityC0027d.f598b;
            c0030g.c();
            FlutterEngine flutterEngine = c0030g.f606b;
            if (flutterEngine != null) {
                ((T1.o) flutterEngine.f9106j.f2461b).a("commitBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractActivityC0027d abstractActivityC0027d = this.f595a;
        if (abstractActivityC0027d.m("updateBackGestureProgress")) {
            C0030g c0030g = abstractActivityC0027d.f598b;
            c0030g.c();
            FlutterEngine flutterEngine = c0030g.f606b;
            if (flutterEngine == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
                return;
            }
            b0.i iVar = flutterEngine.f9106j;
            iVar.getClass();
            ((T1.o) iVar.f2461b).a("updateBackGestureProgress", b0.i.h(backEvent), null);
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractActivityC0027d abstractActivityC0027d = this.f595a;
        if (abstractActivityC0027d.m("startBackGesture")) {
            C0030g c0030g = abstractActivityC0027d.f598b;
            c0030g.c();
            FlutterEngine flutterEngine = c0030g.f606b;
            if (flutterEngine == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
                return;
            }
            b0.i iVar = flutterEngine.f9106j;
            iVar.getClass();
            ((T1.o) iVar.f2461b).a("startBackGesture", b0.i.h(backEvent), null);
        }
    }
}
