package s0;

import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import io.flutter.embedding.engine.FlutterEngine;

/* renamed from: s0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0835c implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f6506a;

    public C0835c(d dVar) {
        this.f6506a = dVar;
    }

    public final void onBackCancelled() {
        d dVar = this.f6506a;
        if (dVar.l("cancelBackGesture")) {
            f fVar = dVar.f6509b;
            fVar.c();
            FlutterEngine flutterEngine = fVar.f6515b;
            if (flutterEngine != null) {
                flutterEngine.f5728j.f57a.f("cancelBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackInvoked() {
        d dVar = this.f6506a;
        if (dVar.l("commitBackGesture")) {
            f fVar = dVar.f6509b;
            fVar.c();
            FlutterEngine flutterEngine = fVar.f6515b;
            if (flutterEngine != null) {
                flutterEngine.f5728j.f57a.f("commitBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        d dVar = this.f6506a;
        if (dVar.l("updateBackGestureProgress")) {
            f fVar = dVar.f6509b;
            fVar.c();
            FlutterEngine flutterEngine = fVar.f6515b;
            if (flutterEngine == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
                return;
            }
            C0.d dVar2 = flutterEngine.f5728j;
            dVar2.getClass();
            dVar2.f57a.f("updateBackGestureProgress", C0.d.a(backEvent), null);
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        d dVar = this.f6506a;
        if (dVar.l("startBackGesture")) {
            f fVar = dVar.f6509b;
            fVar.c();
            FlutterEngine flutterEngine = fVar.f6515b;
            if (flutterEngine == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
                return;
            }
            C0.d dVar2 = flutterEngine.f5728j;
            dVar2.getClass();
            dVar2.f57a.f("startBackGesture", C0.d.a(backEvent), null);
        }
    }
}
