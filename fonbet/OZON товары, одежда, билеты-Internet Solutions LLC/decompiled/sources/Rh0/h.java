package Rh0;

import android.R;
import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h {
    public static final int a(@NotNull Zg0.g gVar, @NotNull Resources resources) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        Intrinsics.checkNotNullParameter(resources, "resources");
        try {
            resources.getResourceName(gVar.k());
            return gVar.k();
        } catch (Resources.NotFoundException unused) {
            Lm0.a.f17149a.e(Ej.b.a(gVar.k(), "Invalid icon resource: "), new Object[0]);
            return R.drawable.ic_dialog_info;
        }
    }
}
