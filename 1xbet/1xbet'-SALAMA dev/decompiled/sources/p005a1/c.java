package p005a1;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.functions.Function1;
import t6.h;
import t6.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f7951a = new c(1);

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        h.e(sidecarDisplayFeature, "$this$require");
        return Boolean.valueOf((sidecarDisplayFeature.getRect().width() == 0 && sidecarDisplayFeature.getRect().height() == 0) ? false : true);
    }
}
