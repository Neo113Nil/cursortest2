package n1;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;

/* renamed from: n1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC2180v implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public k0 f18455a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f18456b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2168i f18457c;

    public ViewOnApplyWindowInsetsListenerC2180v(View view, InterfaceC2168i interfaceC2168i) {
        this.f18456b = view;
        this.f18457c = interfaceC2168i;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        k0 c5 = k0.c(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC2168i interfaceC2168i = this.f18457c;
        if (i < 30) {
            AbstractC2181w.a(windowInsets, this.f18456b);
            if (c5.equals(this.f18455a)) {
                return interfaceC2168i.e(view, c5).b();
            }
        }
        this.f18455a = c5;
        k0 e3 = interfaceC2168i.e(view, c5);
        if (i >= 30) {
            return e3.b();
        }
        Field field = C.f18360a;
        view.requestApplyInsets();
        return e3.b();
    }
}
