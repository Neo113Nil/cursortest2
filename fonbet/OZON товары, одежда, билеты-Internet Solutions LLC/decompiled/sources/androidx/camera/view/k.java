package androidx.camera.view;

import C.s0;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
abstract class k {

    /* renamed from: a, reason: collision with root package name */
    Size f38552a;

    /* renamed from: b, reason: collision with root package name */
    @NonNull
    FrameLayout f38553b;

    /* renamed from: c, reason: collision with root package name */
    @NonNull
    private final g f38554c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f38555d = false;

    k(@NonNull FrameLayout frameLayout, @NonNull g gVar) {
        this.f38553b = frameLayout;
        this.f38554c = gVar;
    }

    abstract View a();

    abstract void b();

    abstract void c();

    final void d() {
        this.f38555d = true;
        f();
    }

    abstract void e(@NonNull s0 s0Var, j jVar);

    final void f() {
        View a11 = a();
        if (a11 == null || !this.f38555d) {
            return;
        }
        FrameLayout frameLayout = this.f38553b;
        this.f38554c.i(new Size(frameLayout.getWidth(), frameLayout.getHeight()), frameLayout.getLayoutDirection(), a11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    public abstract com.google.common.util.concurrent.m<Void> g();
}
