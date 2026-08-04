package p139t2;

import E3.K;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* JADX INFO: loaded from: classes.dex */
public final class k implements Spatializer$OnSpatializerStateChangedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f16362a;

    public k(p pVar) {
        this.f16362a = pVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z4) {
        p pVar = this.f16362a;
        K k7 = p.f16390i;
        pVar.f();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z4) {
        p pVar = this.f16362a;
        K k7 = p.f16390i;
        pVar.f();
    }
}
