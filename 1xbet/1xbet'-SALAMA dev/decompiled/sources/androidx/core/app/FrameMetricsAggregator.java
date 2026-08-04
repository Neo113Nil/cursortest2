package androidx.core.app;

import android.util.SparseIntArray;
import java.util.ArrayList;
import p151v2.n;

/* JADX INFO: loaded from: classes.dex */
public class FrameMetricsAggregator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f9048a;

    public FrameMetricsAggregator() {
        this(1);
    }

    public FrameMetricsAggregator(int i7) {
        n nVar = new n();
        nVar.f17143b = new SparseIntArray[9];
        nVar.f17144c = new ArrayList();
        nVar.f17145d = new F.n(nVar);
        nVar.f17142a = i7;
        this.f9048a = nVar;
    }
}
