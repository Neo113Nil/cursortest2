package z1;

import A0.C;
import G.v;
import O3.l;
import T2.DialogInterfaceOnCancelListenerC0431i;
import T2.r;
import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.util.Log;
import android.view.ContextMenu;
import android.view.View;
import androidx.lifecycle.B;
import androidx.lifecycle.C0493w;
import androidx.lifecycle.EnumC0487p;
import androidx.lifecycle.InterfaceC0482k;
import androidx.lifecycle.InterfaceC0491u;
import androidx.lifecycle.L;
import androidx.lifecycle.U;
import androidx.lifecycle.X;
import androidx.lifecycle.Y;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import k0.C2023c;
import l3.j;
import n.AbstractC2107A;
import n.C2138i;

/* renamed from: z1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC2770b implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0491u, Y, InterfaceC0482k, U1.e {

    /* renamed from: y, reason: collision with root package name */
    public static final Object f21881y = null;

    /* renamed from: k, reason: collision with root package name */
    public final int f21882k = -1;

    /* renamed from: l, reason: collision with root package name */
    public final String f21883l = UUID.randomUUID().toString();

    /* renamed from: m, reason: collision with root package name */
    public final r f21884m = new r();

    /* renamed from: n, reason: collision with root package name */
    public final boolean f21885n = true;

    /* renamed from: o, reason: collision with root package name */
    public final EnumC0487p f21886o = EnumC0487p.f7062o;

    /* renamed from: p, reason: collision with root package name */
    public C0493w f21887p;

    /* renamed from: q, reason: collision with root package name */
    public v f21888q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f21889r;

    /* renamed from: s, reason: collision with root package name */
    public final C2138i f21890s;

    /* renamed from: t, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC2769a f21891t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f21892u;

    /* renamed from: v, reason: collision with root package name */
    public int f21893v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f21894w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f21895x;

    public DialogInterfaceOnCancelListenerC2770b() {
        new B();
        new AtomicInteger();
        this.f21889r = new ArrayList();
        this.f21890s = new C2138i(16, this);
        this.f21887p = new C0493w(this, true);
        this.f21888q = new v(new W1.a(this, new l(5, this)));
        ArrayList arrayList = this.f21889r;
        C2138i c2138i = this.f21890s;
        if (!arrayList.contains(c2138i)) {
            if (this.f21882k >= 0) {
                DialogInterfaceOnCancelListenerC2770b dialogInterfaceOnCancelListenerC2770b = (DialogInterfaceOnCancelListenerC2770b) c2138i.f18249l;
                dialogInterfaceOnCancelListenerC2770b.f21888q.n();
                L.e(dialogInterfaceOnCancelListenerC2770b);
            } else {
                arrayList.add(c2138i);
            }
        }
        new C(23, this);
        new DialogInterfaceOnCancelListenerC0431i(1, this);
        this.f21891t = new DialogInterfaceOnDismissListenerC2769a(this);
        this.f21892u = true;
        this.f21893v = -1;
        new C2023c(18, this);
    }

    @Override // U1.e
    public final v3.g b() {
        return (v3.g) this.f21888q.f1750m;
    }

    public final r c() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Override // androidx.lifecycle.InterfaceC0482k
    public final U d() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.InterfaceC0482k
    public final D1.b e() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // androidx.lifecycle.Y
    public final X f() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.InterfaceC0491u
    public final L g() {
        return this.f21887p;
    }

    public final View h() {
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f21894w) {
            return;
        }
        if (r.j(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f21895x) {
            return;
        }
        this.f21895x = true;
        this.f21894w = true;
        if (this.f21893v >= 0) {
            r c5 = c();
            int i = this.f21893v;
            if (i < 0) {
                throw new IllegalArgumentException(AbstractC2107A.q("Bad id: ", i));
            }
            synchronized (((ArrayList) c5.f5739c)) {
            }
            this.f21893v = -1;
            return;
        }
        j jVar = new j(c());
        f fVar = new f();
        fVar.f21898a = 3;
        fVar.f21899b = this;
        ((ArrayList) jVar.f17804e).add(fVar);
        fVar.f21900c = 0;
        fVar.f21901d = 0;
        fVar.f21902e = 0;
        fVar.f = 0;
        jVar.b(true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f21883l);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
