package j0;

import androidx.window.sidecar.SidecarDisplayFeature;
import o2.l;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.k implements l {

    /* renamed from: e, reason: collision with root package name */
    public static final d f9508e = new d(1);

    @Override // o2.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature require) {
        kotlin.jvm.internal.j.e(require, "$this$require");
        boolean z3 = true;
        if (require.getType() == 1 && require.getRect().width() != 0 && require.getRect().height() != 0) {
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }
}
