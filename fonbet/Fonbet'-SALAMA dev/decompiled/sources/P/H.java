package P;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class H implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public q0 f5029a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f5030b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0365v f5031c;

    public H(View view, InterfaceC0365v interfaceC0365v) {
        this.f5030b = view;
        this.f5031c = interfaceC0365v;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        q0 g3 = q0.g(windowInsets, view);
        int i7 = Build.VERSION.SDK_INT;
        InterfaceC0365v interfaceC0365v = this.f5031c;
        if (i7 < 30) {
            I.a(windowInsets, this.f5030b);
            if (g3.equals(this.f5029a)) {
                return interfaceC0365v.k(view, g3).f();
            }
        }
        this.f5029a = g3;
        q0 k7 = interfaceC0365v.k(view, g3);
        if (i7 >= 30) {
            return k7.f();
        }
        WeakHashMap weakHashMap = U.f5037a;
        G.c(view);
        return k7.f();
    }
}
