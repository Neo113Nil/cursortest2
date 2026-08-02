package q5;

import android.util.Log;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import r5.C1577b;
import z5.C1819a;

/* renamed from: q5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1558b implements OnBackAnimationCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC1559c f15874a;

    public C1558b(AbstractActivityC1559c abstractActivityC1559c) {
        this.f15874a = abstractActivityC1559c;
    }

    public final void onBackCancelled() {
        AbstractActivityC1559c abstractActivityC1559c = this.f15874a;
        if (abstractActivityC1559c.h("cancelBackGesture")) {
            C1562f c1562f = abstractActivityC1559c.f15877b;
            c1562f.b();
            C1577b c1577b = c1562f.f15885b;
            if (c1577b != null) {
                c1577b.j.f18458a.a("cancelBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked cancelBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackInvoked() {
        AbstractActivityC1559c abstractActivityC1559c = this.f15874a;
        if (abstractActivityC1559c.h("commitBackGesture")) {
            C1562f c1562f = abstractActivityC1559c.f15877b;
            c1562f.b();
            C1577b c1577b = c1562f.f15885b;
            if (c1577b != null) {
                c1577b.j.f18458a.a("commitBackGesture", null, null);
            } else {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked commitBackGesture() before FlutterFragment was attached to an Activity.");
            }
        }
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractActivityC1559c abstractActivityC1559c = this.f15874a;
        if (abstractActivityC1559c.h("updateBackGestureProgress")) {
            C1562f c1562f = abstractActivityC1559c.f15877b;
            c1562f.b();
            C1577b c1577b = c1562f.f15885b;
            if (c1577b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked updateBackGestureProgress() before FlutterFragment was attached to an Activity.");
                return;
            }
            C1819a c1819a = c1577b.j;
            c1819a.getClass();
            c1819a.f18458a.a("updateBackGestureProgress", C1819a.a(backEvent), null);
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractActivityC1559c abstractActivityC1559c = this.f15874a;
        if (abstractActivityC1559c.h("startBackGesture")) {
            C1562f c1562f = abstractActivityC1559c.f15877b;
            c1562f.b();
            C1577b c1577b = c1562f.f15885b;
            if (c1577b == null) {
                Log.w("FlutterActivityAndFragmentDelegate", "Invoked startBackGesture() before FlutterFragment was attached to an Activity.");
                return;
            }
            C1819a c1819a = c1577b.j;
            c1819a.getClass();
            c1819a.f18458a.a("startBackGesture", C1819a.a(backEvent), null);
        }
    }
}
