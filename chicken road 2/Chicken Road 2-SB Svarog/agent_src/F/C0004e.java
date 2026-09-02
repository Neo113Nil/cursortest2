package F;

import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* renamed from: F.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0004e implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC0005f f70a;

    public C0004e(AbstractActivityC0005f abstractActivityC0005f) {
        this.f70a = abstractActivityC0005f;
    }

    public final void onBackCancelled() {
        AbstractActivityC0005f abstractActivityC0005f = this.f70a;
        if (abstractActivityC0005f.k("cancelBackGesture")) {
            C0009j c0009j = abstractActivityC0005f.f73b;
            c0009j.c();
            G.c cVar = c0009j.f81b;
            if (cVar != null) {
                cVar.f159j.f283a.e("cancelBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackInvoked() {
        AbstractActivityC0005f abstractActivityC0005f = this.f70a;
        if (abstractActivityC0005f.k("commitBackGesture")) {
            C0009j c0009j = abstractActivityC0005f.f73b;
            c0009j.c();
            G.c cVar = c0009j.f81b;
            if (cVar != null) {
                cVar.f159j.f283a.e("commitBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractActivityC0005f abstractActivityC0005f = this.f70a;
        if (abstractActivityC0005f.k("updateBackGestureProgress")) {
            C0009j c0009j = abstractActivityC0005f.f73b;
            c0009j.c();
            G.c cVar = c0009j.f81b;
            if (cVar != null) {
                cVar.f159j.f283a.e("updateBackGestureProgress", O.b.a(backEvent), null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractActivityC0005f abstractActivityC0005f = this.f70a;
        if (abstractActivityC0005f.k("startBackGesture")) {
            C0009j c0009j = abstractActivityC0005f.f73b;
            c0009j.c();
            G.c cVar = c0009j.f81b;
            if (cVar != null) {
                cVar.f159j.f283a.e("startBackGesture", O.b.a(backEvent), null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }
}
