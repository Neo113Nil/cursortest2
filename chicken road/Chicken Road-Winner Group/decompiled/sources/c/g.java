package c;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.x;
import androidx.lifecycle.z;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public final class g implements androidx.lifecycle.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2495a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f2496b;

    public /* synthetic */ g(k kVar, int i3) {
        this.f2495a = i3;
        this.f2496b = kVar;
    }

    @Override // androidx.lifecycle.j
    public final void a(androidx.lifecycle.k kVar, androidx.lifecycle.e eVar) {
        switch (this.f2495a) {
            case 0:
                if (eVar == androidx.lifecycle.e.ON_STOP) {
                    Window window = this.f2496b.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (eVar == androidx.lifecycle.e.ON_DESTROY) {
                    this.f2496b.f2502b.f4820b = null;
                    if (!this.f2496b.isChangingConfigurations()) {
                        z d3 = this.f2496b.d();
                        for (x xVar : d3.f2346a.values()) {
                            HashMap hashMap = xVar.f2341a;
                            if (hashMap != null) {
                                synchronized (hashMap) {
                                    try {
                                        for (Object obj : xVar.f2341a.values()) {
                                            if (obj instanceof Closeable) {
                                                try {
                                                    ((Closeable) obj).close();
                                                } catch (IOException e3) {
                                                    throw new RuntimeException(e3);
                                                }
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                            LinkedHashSet linkedHashSet = xVar.f2342b;
                            if (linkedHashSet != null) {
                                synchronized (linkedHashSet) {
                                    try {
                                        for (Closeable closeable : xVar.f2342b) {
                                            if (closeable instanceof Closeable) {
                                                try {
                                                    closeable.close();
                                                } catch (IOException e4) {
                                                    throw new RuntimeException(e4);
                                                }
                                            }
                                        }
                                    } finally {
                                    }
                                }
                                xVar.f2342b.clear();
                            }
                            xVar.a();
                        }
                        d3.f2346a.clear();
                    }
                    j jVar = this.f2496b.f2507h;
                    k kVar2 = jVar.f2501d;
                    kVar2.getWindow().getDecorView().removeCallbacks(jVar);
                    kVar2.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(jVar);
                    return;
                }
                return;
            case 2:
                k kVar3 = this.f2496b;
                if (kVar3.f == null) {
                    i iVar = (i) kVar3.getLastNonConfigurationInstance();
                    if (iVar != null) {
                        kVar3.f = iVar.f2497a;
                    }
                    if (kVar3.f == null) {
                        kVar3.f = new z(0);
                    }
                }
                kVar3.f2504d.b(this);
                return;
            default:
                if (eVar != androidx.lifecycle.e.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                    return;
                }
                R0.n nVar = this.f2496b.f2506g;
                OnBackInvokedDispatcher invoker = h.a((k) kVar);
                nVar.getClass();
                kotlin.jvm.internal.j.e(invoker, "invoker");
                nVar.f = invoker;
                OnBackInvokedDispatcher onBackInvokedDispatcher = (OnBackInvokedDispatcher) nVar.f;
                OnBackInvokedCallback onBackInvokedCallback = (OnBackInvokedCallback) nVar.f1226e;
                if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
                    return;
                }
                n nVar2 = n.f2520a;
                if (nVar.f1222a) {
                    nVar2.c(onBackInvokedDispatcher, onBackInvokedCallback);
                    nVar.f1222a = false;
                    return;
                }
                return;
        }
    }
}
