package z;

import androidx.window.sidecar.SidecarDisplayFeature;

/* loaded from: classes.dex */
public final class c extends g0.i implements f0.l {

    /* renamed from: c, reason: collision with root package name */
    public static final c f1324c = new c(1);

    @Override // f0.l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean i(SidecarDisplayFeature sidecarDisplayFeature) {
        g0.h.e(sidecarDisplayFeature, "$this$require");
        boolean z2 = true;
        if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
