package D;

import U0.l;
import androidx.window.sidecar.SidecarDisplayFeature;

/* loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.k implements l {

    /* renamed from: e, reason: collision with root package name */
    public static final b f141e = new b(1);

    @Override // U0.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature require) {
        kotlin.jvm.internal.j.e(require, "$this$require");
        boolean z2 = true;
        if (require.getType() != 1 && require.getType() != 2) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
