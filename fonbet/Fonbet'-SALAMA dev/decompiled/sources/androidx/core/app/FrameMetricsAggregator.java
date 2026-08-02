package androidx.core.app;

import android.util.SparseIntArray;
import java.util.ArrayList;
import v2.n;

/* loaded from: classes.dex */
public class FrameMetricsAggregator {

    /* renamed from: a, reason: collision with root package name */
    public final n f9048a;

    public FrameMetricsAggregator() {
        this(1);
    }

    public FrameMetricsAggregator(int i7) {
        n nVar = new n();
        nVar.f17137b = new SparseIntArray[9];
        nVar.f17138c = new ArrayList();
        nVar.f17139d = new F.n(nVar);
        nVar.f17136a = i7;
        this.f9048a = nVar;
    }
}
