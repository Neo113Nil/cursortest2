package p0;

import androidx.window.sidecar.SidecarDisplayFeature;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.j implements InterfaceC1441l {

    /* renamed from: e, reason: collision with root package name */
    public static final d f11619e = new d(1);

    @Override // t4.InterfaceC1441l
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature require) {
        kotlin.jvm.internal.i.e(require, "$this$require");
        boolean z = true;
        if (require.getType() == 1 && require.getRect().width() != 0 && require.getRect().height() != 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
