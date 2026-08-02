package t2;

import E3.K;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;

/* loaded from: classes.dex */
public final class k implements Spatializer$OnSpatializerStateChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f16356a;

    public k(p pVar) {
        this.f16356a = pVar;
    }

    public final void onSpatializerAvailableChanged(Spatializer spatializer, boolean z4) {
        p pVar = this.f16356a;
        K k7 = p.f16384i;
        pVar.f();
    }

    public final void onSpatializerEnabledChanged(Spatializer spatializer, boolean z4) {
        p pVar = this.f16356a;
        K k7 = p.f16384i;
        pVar.f();
    }
}
