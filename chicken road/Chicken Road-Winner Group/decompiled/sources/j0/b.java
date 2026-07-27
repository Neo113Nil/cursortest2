package j0;

import androidx.window.sidecar.SidecarDisplayFeature;
import o2.l;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.k implements l {

    /* renamed from: e, reason: collision with root package name */
    public static final b f9506e = new b(1);

    @Override // o2.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature require) {
        kotlin.jvm.internal.j.e(require, "$this$require");
        boolean z3 = true;
        if (require.getType() != 1 && require.getType() != 2) {
            z3 = false;
        }
        return Boolean.valueOf(z3);
    }
}
