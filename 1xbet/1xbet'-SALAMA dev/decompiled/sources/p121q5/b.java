package p121q5;

import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import p174z5.a;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements OnBackAnimationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f15880a;

    public b(c cVar) {
        this.f15880a = cVar;
    }

    public final void onBackCancelled() {
        c cVar = this.f15880a;
        if (cVar.h("cancelBackGesture")) {
            f fVar = cVar.f15883b;
            fVar.b();
            p128r5.b bVar = fVar.f15891b;
            if (bVar != null) {
                bVar.j.f18464a.a("cancelBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackInvoked() {
        c cVar = this.f15880a;
        if (cVar.h("commitBackGesture")) {
            f fVar = cVar.f15883b;
            fVar.b();
            p128r5.b bVar = fVar.f15891b;
            if (bVar != null) {
                bVar.j.f18464a.a("commitBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        c cVar = this.f15880a;
        if (cVar.h("updateBackGestureProgress")) {
            f fVar = cVar.f15883b;
            fVar.b();
            p128r5.b bVar = fVar.f15891b;
            if (bVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
                return;
            }
            a aVar = bVar.j;
            aVar.getClass();
            aVar.f18464a.a("updateBackGestureProgress", a.a(backEvent), null);
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        c cVar = this.f15880a;
        if (cVar.h("startBackGesture")) {
            f fVar = cVar.f15883b;
            fVar.b();
            p128r5.b bVar = fVar.f15891b;
            if (bVar == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
                return;
            }
            a aVar = bVar.j;
            aVar.getClass();
            aVar.f18464a.a("startBackGesture", a.a(backEvent), null);
        }
    }
}
