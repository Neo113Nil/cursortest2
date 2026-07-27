package D;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: D.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0015p implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public V f253a = null;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f254b;

    public ViewOnApplyWindowInsetsListenerC0015p(View view, InterfaceC0010k interfaceC0010k) {
        this.f254b = view;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        V a3 = V.a(windowInsets, view);
        if (Build.VERSION.SDK_INT < 30) {
            AbstractC0016q.a(windowInsets, this.f254b);
            if (a3.equals(this.f253a)) {
                throw null;
            }
        }
        this.f253a = a3;
        throw null;
    }
}
