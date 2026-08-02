package a1;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.functions.Function1;

/* renamed from: a1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0608d extends t6.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0608d f7952a = new C0608d(1);

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        t6.h.e(sidecarDisplayFeature, "$this$require");
        boolean z4 = true;
        if (sidecarDisplayFeature.getType() == 1 && sidecarDisplayFeature.getRect().width() != 0 && sidecarDisplayFeature.getRect().height() != 0) {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }
}
