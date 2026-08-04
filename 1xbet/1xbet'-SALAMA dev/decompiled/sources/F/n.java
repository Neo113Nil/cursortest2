package F;

import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;

/* JADX INFO: loaded from: classes.dex */
public final class n implements Window.OnFrameMetricsAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p151v2.n f2443a;

    public n(p151v2.n nVar) {
        this.f2443a = nVar;
    }

    @Override // android.view.Window.OnFrameMetricsAvailableListener
    public final void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i7) {
        p151v2.n nVar = this.f2443a;
        if ((nVar.f17142a & 1) != 0) {
            p151v2.n.b(((SparseIntArray[]) nVar.f17143b)[0], frameMetrics.getMetric(8));
        }
        if ((nVar.f17142a & 2) != 0) {
            p151v2.n.b(((SparseIntArray[]) nVar.f17143b)[1], frameMetrics.getMetric(1));
        }
        if ((nVar.f17142a & 4) != 0) {
            p151v2.n.b(((SparseIntArray[]) nVar.f17143b)[2], frameMetrics.getMetric(3));
        }
        if ((nVar.f17142a & 8) != 0) {
            p151v2.n.b(((SparseIntArray[]) nVar.f17143b)[3], frameMetrics.getMetric(4));
        }
        if ((nVar.f17142a & 16) != 0) {
            p151v2.n.b(((SparseIntArray[]) nVar.f17143b)[4], frameMetrics.getMetric(5));
        }
        if ((nVar.f17142a & 64) != 0) {
            p151v2.n.b(((SparseIntArray[]) nVar.f17143b)[6], frameMetrics.getMetric(7));
        }
        if ((nVar.f17142a & 32) != 0) {
            p151v2.n.b(((SparseIntArray[]) nVar.f17143b)[5], frameMetrics.getMetric(6));
        }
        if ((nVar.f17142a & 128) != 0) {
            p151v2.n.b(((SparseIntArray[]) nVar.f17143b)[7], frameMetrics.getMetric(0));
        }
        if ((nVar.f17142a & 256) != 0) {
            p151v2.n.b(((SparseIntArray[]) nVar.f17143b)[8], frameMetrics.getMetric(2));
        }
    }
}
