package R;

import a0.C0175f;
import a0.C0176g;
import android.content.ComponentCallbacks;
import android.content.res.Configuration;
import android.view.ContextMenu;
import android.view.View;
import androidx.lifecycle.A;
import androidx.lifecycle.AbstractC0245o;
import androidx.lifecycle.C0252w;
import androidx.lifecycle.EnumC0244n;
import androidx.lifecycle.InterfaceC0238h;
import androidx.lifecycle.InterfaceC0250u;
import androidx.lifecycle.M;
import androidx.lifecycle.Y;
import androidx.lifecycle.Z;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class f implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0250u, Z, InterfaceC0238h, a0.h {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f2581k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final int f2582a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final String f2583b = UUID.randomUUID().toString();

    /* renamed from: c, reason: collision with root package name */
    public final n f2584c = new n();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2585d = true;

    /* renamed from: e, reason: collision with root package name */
    public B4.i f2586e;

    /* renamed from: f, reason: collision with root package name */
    public final EnumC0244n f2587f;

    /* renamed from: g, reason: collision with root package name */
    public C0252w f2588g;

    /* renamed from: h, reason: collision with root package name */
    public C0176g f2589h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f2590i;

    /* renamed from: j, reason: collision with root package name */
    public final B1.g f2591j;

    public f() {
        new B.a(6, this);
        this.f2587f = EnumC0244n.f4580e;
        new A();
        new AtomicInteger();
        this.f2590i = new ArrayList();
        this.f2591j = new B1.g(27, this);
        this.f2588g = new C0252w(this);
        this.f2589h = new C0176g(this);
        ArrayList arrayList = this.f2590i;
        B1.g gVar = this.f2591j;
        if (arrayList.contains(gVar)) {
            return;
        }
        if (this.f2582a < 0) {
            arrayList.add(gVar);
            return;
        }
        f fVar = (f) gVar.f215b;
        fVar.f2589h.a();
        M.e(fVar);
        fVar.f2589h.b(null);
    }

    public final m a() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final View b() {
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @Override // androidx.lifecycle.InterfaceC0238h
    public final S.b getDefaultViewModelCreationExtras() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // androidx.lifecycle.InterfaceC0250u
    public final AbstractC0245o getLifecycle() {
        return this.f2588g;
    }

    @Override // a0.h
    public final C0175f getSavedStateRegistry() {
        return this.f2589h.f3831b;
    }

    @Override // androidx.lifecycle.Z
    public final Y getViewModelStore() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f2583b);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
