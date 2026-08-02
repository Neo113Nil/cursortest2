package Sg;

import android.util.Log;
import androidx.activity.M;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(@NotNull a aVar, @NotNull ComponentCallbacksC5392m fragment) {
        Rg.b bVar;
        Rg.b bVar2;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        ComponentCallbacksC5392m componentCallbacksC5392m = fragment;
        while (true) {
            componentCallbacksC5392m = componentCallbacksC5392m.getParentFragment();
            bVar = null;
            if (componentCallbacksC5392m != 0) {
                bVar2 = componentCallbacksC5392m instanceof Rg.b ? (Rg.b) componentCallbacksC5392m : null;
                if (bVar2 != null) {
                    break;
                }
            } else {
                bVar2 = null;
                break;
            }
        }
        if (bVar2 == null) {
            M activity = fragment.getActivity();
            if (activity instanceof Rg.b) {
                bVar = (Rg.b) activity;
            }
        } else {
            bVar = bVar2;
        }
        if (bVar != null) {
            aVar.b(bVar.getAnalyticsScreenStorage());
        } else {
            Log.w("AnalyticsScreenHelper", "Can't connect screen to parent analytic screen storage.");
        }
    }
}
