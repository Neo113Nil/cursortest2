package androidx.compose.ui.platform;

import S0.AbstractC3984t;
import S0.C3988v;
import S0.InterfaceC3982s;
import a1.C4912a;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.R;

/* loaded from: classes.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final ViewGroup.LayoutParams f41114a = new ViewGroup.LayoutParams(-2, -2);

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f41115b = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InterfaceC3982s a(@NotNull AbstractC5228a abstractC5228a, @NotNull AbstractC3984t abstractC3984t, @NotNull C4912a c4912a) {
        AndroidComposeView androidComposeView;
        x2 x2Var;
        W0.b();
        if (abstractC5228a.getChildCount() > 0) {
            View childAt = abstractC5228a.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
                if (androidComposeView == null) {
                    androidComposeView = new AndroidComposeView(abstractC5228a.getContext(), abstractC3984t.i());
                    abstractC5228a.addView(androidComposeView, f41114a);
                }
                int i11 = C5236c1.f40825b;
                C3988v c3988v = new C3988v(abstractC3984t, new D1.L0(androidComposeView.getF40548l()));
                Object tag = androidComposeView.getTag(R.id.wrapped_composition_tag);
                x2Var = tag instanceof x2 ? (x2) tag : null;
                if (x2Var == null) {
                    x2Var = new x2(androidComposeView, c3988v);
                    androidComposeView.setTag(R.id.wrapped_composition_tag, x2Var);
                }
                x2Var.k(c4912a);
                if (!Intrinsics.d(androidComposeView.getF40542f(), abstractC3984t.i())) {
                    androidComposeView.T0(abstractC3984t.i());
                }
                return x2Var;
            }
        } else {
            abstractC5228a.removeAllViews();
        }
        androidComposeView = null;
        if (androidComposeView == null) {
        }
        int i112 = C5236c1.f40825b;
        C3988v c3988v2 = new C3988v(abstractC3984t, new D1.L0(androidComposeView.getF40548l()));
        Object tag2 = androidComposeView.getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof x2) {
        }
        if (x2Var == null) {
        }
        x2Var.k(c4912a);
        if (!Intrinsics.d(androidComposeView.getF40542f(), abstractC3984t.i())) {
        }
        return x2Var;
    }
}
