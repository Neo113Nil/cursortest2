package p005a1;

import androidx.window.sidecar.SidecarDisplayFeature;
import kotlin.jvm.functions.Function1;
import t6.h;
import t6.i;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f7950a = new b(1);

    @Override // kotlin.jvm.functions.Function1
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Boolean invoke(SidecarDisplayFeature sidecarDisplayFeature) {
        h.e(sidecarDisplayFeature, "$this$require");
        boolean z4 = true;
        if (sidecarDisplayFeature.getType() != 1 && sidecarDisplayFeature.getType() != 2) {
            z4 = false;
        }
        return Boolean.valueOf(z4);
    }
}
