package O6;

import O6.c;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.view.Q0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import l1.C7811b0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final View f19992a;

    /* renamed from: b, reason: collision with root package name */
    private final Window f19993b;

    /* renamed from: c, reason: collision with root package name */
    private final Q0 f19994c;

    public a(@NotNull View view, Window window) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f19992a = view;
        this.f19993b = window;
        this.f19994c = window != null ? new Q0(view, window) : null;
    }

    @Override // O6.b
    public final void b(long j11, boolean z11, @NotNull Function1 transformColorForLightContent) {
        Intrinsics.checkNotNullParameter(transformColorForLightContent, "transformColorForLightContent");
        Q0 q02 = this.f19994c;
        if (q02 != null) {
            q02.d(z11);
        }
        int i11 = Build.VERSION.SDK_INT;
        Window window = this.f19993b;
        if (i11 >= 29 && window != null) {
            window.setNavigationBarContrastEnforced(true);
        }
        if (window == null) {
            return;
        }
        if (z11 && (q02 == null || !q02.b())) {
            j11 = ((C7807Z) ((c.a) transformColorForLightContent).invoke(C7807Z.m(j11))).w();
        }
        window.setNavigationBarColor(C7811b0.i(j11));
    }

    @Override // O6.b
    public final void c(long j11, boolean z11, @NotNull Function1<? super C7807Z, C7807Z> transformColorForLightContent) {
        Intrinsics.checkNotNullParameter(transformColorForLightContent, "transformColorForLightContent");
        Q0 q02 = this.f19994c;
        if (q02 != null) {
            q02.e(z11);
        }
        Window window = this.f19993b;
        if (window == null) {
            return;
        }
        if (z11 && (q02 == null || !q02.c())) {
            j11 = ((C7807Z) ((c.a) transformColorForLightContent).invoke(C7807Z.m(j11))).w();
        }
        window.setStatusBarColor(C7811b0.i(j11));
    }
}
