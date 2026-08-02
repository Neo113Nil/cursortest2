package androidx.core.view;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.lifecycle.AbstractC5434v;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: androidx.core.view.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5344u {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f42348a;

    /* renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<InterfaceC5348w> f42349b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f42350c = new HashMap();

    /* renamed from: androidx.core.view.u$a */
    private static class a {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC5434v f42351a;

        /* renamed from: b, reason: collision with root package name */
        private androidx.lifecycle.G f42352b;

        a(@NonNull AbstractC5434v abstractC5434v, @NonNull androidx.lifecycle.G g10) {
            this.f42351a = abstractC5434v;
            this.f42352b = g10;
            abstractC5434v.a(g10);
        }

        final void a() {
            this.f42351a.e(this.f42352b);
            this.f42352b = null;
        }
    }

    public C5344u(@NonNull Runnable runnable) {
        this.f42348a = runnable;
    }

    public static void a(C5344u c5344u, AbstractC5434v.b bVar, InterfaceC5348w interfaceC5348w, AbstractC5434v.a aVar) {
        c5344u.getClass();
        AbstractC5434v.a.Companion.getClass();
        if (aVar == AbstractC5434v.a.C0798a.c(bVar)) {
            c5344u.b(interfaceC5348w);
            return;
        }
        if (aVar == AbstractC5434v.a.ON_DESTROY) {
            c5344u.i(interfaceC5348w);
        } else if (aVar == AbstractC5434v.a.C0798a.a(bVar)) {
            c5344u.f42349b.remove(interfaceC5348w);
            c5344u.f42348a.run();
        }
    }

    public final void b(@NonNull InterfaceC5348w interfaceC5348w) {
        this.f42349b.add(interfaceC5348w);
        this.f42348a.run();
    }

    public final void c(@NonNull InterfaceC5348w interfaceC5348w, @NonNull androidx.lifecycle.J j11) {
        b(interfaceC5348w);
        AbstractC5434v lifecycle = j11.getLifecycle();
        HashMap hashMap = this.f42350c;
        a aVar = (a) hashMap.remove(interfaceC5348w);
        if (aVar != null) {
            aVar.a();
        }
        hashMap.put(interfaceC5348w, new a(lifecycle, new C5342t(0, this, interfaceC5348w)));
    }

    @SuppressLint({"LambdaLast"})
    public final void d(@NonNull final InterfaceC5348w interfaceC5348w, @NonNull androidx.lifecycle.J j11, @NonNull final AbstractC5434v.b bVar) {
        AbstractC5434v lifecycle = j11.getLifecycle();
        HashMap hashMap = this.f42350c;
        a aVar = (a) hashMap.remove(interfaceC5348w);
        if (aVar != null) {
            aVar.a();
        }
        hashMap.put(interfaceC5348w, new a(lifecycle, new androidx.lifecycle.G() { // from class: androidx.core.view.s
            @Override // androidx.lifecycle.G
            public final void onStateChanged(androidx.lifecycle.J j12, AbstractC5434v.a aVar2) {
                C5344u.a(C5344u.this, bVar, interfaceC5348w, aVar2);
            }
        }));
    }

    public final void e(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        Iterator<InterfaceC5348w> it = this.f42349b.iterator();
        while (it.hasNext()) {
            it.next().onCreateMenu(menu, menuInflater);
        }
    }

    public final void f(@NonNull Menu menu) {
        Iterator<InterfaceC5348w> it = this.f42349b.iterator();
        while (it.hasNext()) {
            it.next().a(menu);
        }
    }

    public final boolean g(@NonNull MenuItem menuItem) {
        Iterator<InterfaceC5348w> it = this.f42349b.iterator();
        while (it.hasNext()) {
            if (it.next().onMenuItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void h(@NonNull Menu menu) {
        Iterator<InterfaceC5348w> it = this.f42349b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public final void i(@NonNull InterfaceC5348w interfaceC5348w) {
        this.f42349b.remove(interfaceC5348w);
        a aVar = (a) this.f42350c.remove(interfaceC5348w);
        if (aVar != null) {
            aVar.a();
        }
        this.f42348a.run();
    }
}
