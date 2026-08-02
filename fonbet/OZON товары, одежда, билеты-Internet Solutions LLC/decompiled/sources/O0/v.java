package O0;

import C.C2702w;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.material.ripple.RippleNode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l1.InterfaceC7813c0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private static final boolean f19812a = Intrinsics.d(Build.DEVICE, "layoutlib");

    public static final o a(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = viewGroup.getChildAt(i11);
            if (childAt instanceof o) {
                return (o) childAt;
            }
        }
        o oVar = new o(viewGroup.getContext());
        viewGroup.addView(oVar);
        return oVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.ViewParent] */
    public static final ViewGroup b(View view) {
        while (!(view instanceof ViewGroup)) {
            ?? parent = view.getParent();
            if (!(parent instanceof View)) {
                throw new IllegalArgumentException(C2702w.c(view, "Couldn't find a valid parent for ", ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
            view = parent;
        }
        return (ViewGroup) view;
    }

    @NotNull
    public static final RippleNode c(@NotNull t0.o oVar, boolean z11, float f7, @NotNull InterfaceC7813c0 interfaceC7813c0, @NotNull Function0 function0) {
        return f19812a ? new d(oVar, z11, f7, interfaceC7813c0, function0) : new c(oVar, z11, f7, interfaceC7813c0, function0);
    }
}
