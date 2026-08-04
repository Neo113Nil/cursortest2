package P;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class H implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q0 f5029a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f5030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0365v f5031c;

    public H(View view, InterfaceC0365v interfaceC0365v) {
        this.f5030b = view;
        this.f5031c = interfaceC0365v;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        q0 q0VarG = q0.g(windowInsets, view);
        int i7 = Build.VERSION.SDK_INT;
        InterfaceC0365v interfaceC0365v = this.f5031c;
        if (i7 < 30) {
            I.a(windowInsets, this.f5030b);
            if (q0VarG.equals(this.f5029a)) {
                return interfaceC0365v.k(view, q0VarG).f();
            }
        }
        this.f5029a = q0VarG;
        q0 q0VarK = interfaceC0365v.k(view, q0VarG);
        if (i7 >= 30) {
            return q0VarK.f();
        }
        WeakHashMap weakHashMap = U.f5037a;
        G.c(view);
        return q0VarK.f();
    }
}
