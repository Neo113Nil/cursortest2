package a1;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.functions.Function1;

/* renamed from: a1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0609e extends t6.i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0609e f7953a = new C0609e(1);

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        t6.h.e(sidecarDisplayFeature, "$this$require");
        return Boolean.valueOf(sidecarDisplayFeature.getRect().left == 0 || sidecarDisplayFeature.getRect().top == 0);
    }
}
