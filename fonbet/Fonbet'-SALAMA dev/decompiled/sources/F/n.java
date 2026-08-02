package F;

import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;

/* loaded from: classes.dex */
public final class n implements Window.OnFrameMetricsAvailableListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v2.n f2443a;

    public n(v2.n nVar) {
        this.f2443a = nVar;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i7) {
        v2.n nVar = this.f2443a;
        if ((nVar.f17136a & 1) != 0) {
            v2.n.b(((SparseIntArray[]) nVar.f17137b)[0], frameMetrics.getMetric(8));
        }
        if ((nVar.f17136a & 2) != 0) {
            v2.n.b(((SparseIntArray[]) nVar.f17137b)[1], frameMetrics.getMetric(1));
        }
        if ((nVar.f17136a & 4) != 0) {
            v2.n.b(((SparseIntArray[]) nVar.f17137b)[2], frameMetrics.getMetric(3));
        }
        if ((nVar.f17136a & 8) != 0) {
            v2.n.b(((SparseIntArray[]) nVar.f17137b)[3], frameMetrics.getMetric(4));
        }
        if ((nVar.f17136a & 16) != 0) {
            v2.n.b(((SparseIntArray[]) nVar.f17137b)[4], frameMetrics.getMetric(5));
        }
        if ((nVar.f17136a & 64) != 0) {
            v2.n.b(((SparseIntArray[]) nVar.f17137b)[6], frameMetrics.getMetric(7));
        }
        if ((nVar.f17136a & 32) != 0) {
            v2.n.b(((SparseIntArray[]) nVar.f17137b)[5], frameMetrics.getMetric(6));
        }
        if ((nVar.f17136a & 128) != 0) {
            v2.n.b(((SparseIntArray[]) nVar.f17137b)[7], frameMetrics.getMetric(0));
        }
        if ((nVar.f17136a & 256) != 0) {
            v2.n.b(((SparseIntArray[]) nVar.f17137b)[8], frameMetrics.getMetric(2));
        }
    }
}
