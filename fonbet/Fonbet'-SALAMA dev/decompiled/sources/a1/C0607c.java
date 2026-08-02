package a1;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.functions.Function1;

/* renamed from: a1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0607c extends t6.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0607c f7951a = new C0607c(1);

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        t6.h.e(sidecarDisplayFeature, "$this$require");
        return Boolean.valueOf((sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true);
    }
}
