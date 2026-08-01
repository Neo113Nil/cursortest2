package sg.bigo.ads.Z;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import sg.bigo.ads.L0.r;

/* loaded from: classes3.dex */
public abstract class c {
    public static void a(ViewGroup viewGroup, b bVar) {
        ViewTreeObserver viewTreeObserver;
        if (viewGroup == null || bVar == null || (viewTreeObserver = viewGroup.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return;
        }
        a aVar = bVar.f12652a;
        if (!(aVar instanceof ViewTreeObserver.OnWindowFocusChangeListener)) {
            aVar = null;
        }
        if (aVar != null) {
            viewTreeObserver.addOnWindowFocusChangeListener(aVar);
        }
    }

    public static void b(ViewGroup viewGroup, b bVar) {
        ViewTreeObserver viewTreeObserver;
        if (viewGroup == null || bVar == null || (viewTreeObserver = viewGroup.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return;
        }
        a aVar = bVar.f12652a;
        if (!(aVar instanceof ViewTreeObserver.OnWindowFocusChangeListener)) {
            aVar = null;
        }
        if (aVar != null) {
            viewTreeObserver.removeOnWindowFocusChangeListener(aVar);
        }
    }

    public static void a(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void a(View view, r rVar) {
        view.postOnAnimation(rVar);
    }

    public static void a(View view, int i) {
        if (view == null) {
            return;
        }
        view.setElevation(i);
    }

    public static void a(View view, float f) {
        if (view == null) {
            return;
        }
        view.setZ(f);
    }
}
