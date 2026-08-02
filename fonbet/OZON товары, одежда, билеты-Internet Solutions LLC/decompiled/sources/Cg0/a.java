package Cg0;

import B1.C;
import D1.AbstractC2810k0;
import D1.C2811l;
import D1.InterfaceC2821v;
import android.os.SystemClock;
import android.view.View;
import androidx.compose.ui.e;
import androidx.core.view.C5353y0;
import androidx.core.view.Y;
import k1.C7460f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.Pikazon;
import ru.ozon.app.android.pikazon.placeholdertracker.PlaceholderInfo;

/* loaded from: classes3.dex */
public final class a extends e.c implements InterfaceC2821v {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private AbstractC7737t f4956a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final PlaceholderInfo f4957b;

    /* renamed from: c, reason: collision with root package name */
    private View f4958c;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull Function1<? super PlaceholderInfo, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f4956a = (AbstractC7737t) callback;
        this.f4957b = new PlaceholderInfo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I1(@NotNull Function1<? super PlaceholderInfo, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f4956a = (AbstractC7737t) function1;
    }

    @Override // androidx.compose.ui.e.c
    public final void onDetach() {
        this.f4957b.clear();
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    /* JADX WARN: Type inference failed for: r0v15, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
    @Override // D1.InterfaceC2821v
    public final void s(@NotNull AbstractC2810k0 componentCoordinates) {
        C7460f c7460f;
        Intrinsics.checkNotNullParameter(componentCoordinates, "coordinates");
        View view = C2811l.a(getNode());
        View rootView = this.f4958c;
        if (rootView == null) {
            rootView = view.getRootView();
            this.f4958c = rootView;
        }
        Intrinsics.checkNotNullParameter(Pikazon.INSTANCE.getInstance(), "<this>");
        Intrinsics.f(rootView);
        Intrinsics.checkNotNullParameter(rootView, "rootView");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(componentCoordinates, "componentCoordinates");
        long a11 = componentCoordinates.a();
        float f7 = 0.0f;
        if (((int) (a11 >> 32)) != 0 && ((int) (a11 & 4294967295L)) != 0) {
            C7460f b11 = C.b(componentCoordinates);
            if (!b11.x()) {
                C5353y0 n11 = Y.n(rootView);
                if (n11 != null) {
                    Intrinsics.checkNotNullExpressionValue(n11.f(7), "getInsets(...)");
                    c7460f = new C7460f(rootView.getLeft() + r0.f42126a, rootView.getTop() + r0.f42127b, rootView.getRight() - r0.f42128c, rootView.getBottom() - r0.f42129d);
                } else {
                    c7460f = new C7460f(rootView.getTop(), rootView.getLeft(), rootView.getRight(), rootView.getBottom());
                }
                C7460f w11 = b11.w(c7460f);
                if (!w11.x()) {
                    f7 = h.d((w11.m() * w11.u()) / (b11.m() * b11.u()), 0.0f, 1.0f);
                }
            }
        }
        PlaceholderInfo placeholderInfo = this.f4957b;
        Float minVisiblePercentageViewed = placeholderInfo.getMinVisiblePercentageViewed();
        if (f7 > (minVisiblePercentageViewed != null ? minVisiblePercentageViewed.floatValue() : 0.15f)) {
            if (placeholderInfo.getViewStartVisibleTime() <= 0) {
                placeholderInfo.setViewStartVisibleTime(SystemClock.elapsedRealtime());
                this.f4956a.invoke(placeholderInfo);
                return;
            }
            return;
        }
        if (placeholderInfo.getViewStartVisibleTime() > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - placeholderInfo.getViewStartVisibleTime();
            if (elapsedRealtime > placeholderInfo.getMaxPlaceholderVisibilityDuration()) {
                placeholderInfo.setMaxPlaceholderVisibilityDuration(elapsedRealtime);
            }
            placeholderInfo.setViewStartVisibleTime(0L);
            this.f4956a.invoke(placeholderInfo);
        }
    }
}
