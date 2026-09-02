package D;

import U0.l;
import androidx.window.sidecar.SidecarDisplayFeature;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.k implements l {

    /* renamed from: e, reason: collision with root package name */
    public static final d f143e = new d(1);

    @Override // U0.l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature require) {
        kotlin.jvm.internal.j.e(require, "$this$require");
        boolean z2 = true;
        if (require.getType() == 1 && require.getRect().width() != 0 && require.getRect().height() != 0) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
