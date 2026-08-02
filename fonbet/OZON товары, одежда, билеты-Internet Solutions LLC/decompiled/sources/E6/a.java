package E6;

import E6.e;
import android.view.ScaleGestureDetector;

/* loaded from: classes8.dex */
final class a implements ScaleGestureDetector.OnScaleGestureListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f7537a;

    a(b bVar) {
        this.f7537a = bVar;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        c cVar;
        float scaleFactor = scaleGestureDetector.getScaleFactor();
        if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
            return false;
        }
        if (scaleFactor < 0.0f) {
            return true;
        }
        cVar = this.f7537a.f7547j;
        ((e.a) cVar).a(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
    }
}
