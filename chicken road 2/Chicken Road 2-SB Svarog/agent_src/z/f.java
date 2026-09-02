package z;

import androidx.window.sidecar.SidecarDisplayFeature;

/* loaded from: classes.dex */
public final class f extends g0.i implements f0.l {

    /* renamed from: c, reason: collision with root package name */
    public static final f f1327c = new f(1);

    @Override // f0.l
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean i(SidecarDisplayFeature sidecarDisplayFeature) {
        g0.h.e(sidecarDisplayFeature, "$this$require");
        return Boolean.valueOf(sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0);
    }
}
