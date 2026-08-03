package P0;

/* renamed from: P0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0046d implements android.window.OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ P0.AbstractActivityC0047e f1337a;

    public C0046d(P0.AbstractActivityC0047e abstractActivityC0047e) {
        this.f1337a = abstractActivityC0047e;
    }

    public final void onBackCancelled() {
        P0.AbstractActivityC0047e abstractActivityC0047e = this.f1337a;
        if (abstractActivityC0047e.l("cancelBackGesture")) {
            P0.C0050h c0050h = abstractActivityC0047e.f1340b;
            c0050h.c();
            io.flutter.embedding.engine.FlutterEngine flutterEngine = c0050h.f1348b;
            if (flutterEngine != null) {
                flutterEngine.f7624j.f1866a.G("cancelBackGesture", null, null);
            } else {
                android.util.Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackInvoked() {
        P0.AbstractActivityC0047e abstractActivityC0047e = this.f1337a;
        if (abstractActivityC0047e.l("commitBackGesture")) {
            P0.C0050h c0050h = abstractActivityC0047e.f1340b;
            c0050h.c();
            io.flutter.embedding.engine.FlutterEngine flutterEngine = c0050h.f1348b;
            if (flutterEngine != null) {
                flutterEngine.f7624j.f1866a.G("commitBackGesture", null, null);
            } else {
                android.util.Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackProgressed(android.window.BackEvent backEvent) {
        P0.AbstractActivityC0047e abstractActivityC0047e = this.f1337a;
        if (abstractActivityC0047e.l("updateBackGestureProgress")) {
            P0.C0050h c0050h = abstractActivityC0047e.f1340b;
            c0050h.c();
            io.flutter.embedding.engine.FlutterEngine flutterEngine = c0050h.f1348b;
            if (flutterEngine == null) {
                android.util.Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
                return;
            }
            Z0.a aVar = flutterEngine.f7624j;
            aVar.getClass();
            aVar.f1866a.G("updateBackGestureProgress", Z0.a.a(backEvent), null);
        }
    }

    public final void onBackStarted(android.window.BackEvent backEvent) {
        P0.AbstractActivityC0047e abstractActivityC0047e = this.f1337a;
        if (abstractActivityC0047e.l("startBackGesture")) {
            P0.C0050h c0050h = abstractActivityC0047e.f1340b;
            c0050h.c();
            io.flutter.embedding.engine.FlutterEngine flutterEngine = c0050h.f1348b;
            if (flutterEngine == null) {
                android.util.Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
                return;
            }
            Z0.a aVar = flutterEngine.f7624j;
            aVar.getClass();
            aVar.f1866a.G("startBackGesture", Z0.a.a(backEvent), null);
        }
    }
}
