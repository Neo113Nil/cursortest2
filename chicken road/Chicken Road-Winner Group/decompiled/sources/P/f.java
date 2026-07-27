package P;

import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.util.Log;
import android.view.ContextMenu;
import android.view.View;
import androidx.lifecycle.A;
import androidx.lifecycle.v;
import androidx.lifecycle.z;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class f implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.k, A, androidx.lifecycle.b, V.g {

    /* renamed from: o, reason: collision with root package name */
    public static final Object f1084o = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final int f1085a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final String f1086b = UUID.randomUUID().toString();

    /* renamed from: c, reason: collision with root package name */
    public final k f1087c = new k();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1088d = true;

    /* renamed from: e, reason: collision with root package name */
    public D0.a f1089e;
    public final androidx.lifecycle.f f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.lifecycle.m f1090g;

    /* renamed from: h, reason: collision with root package name */
    public V.f f1091h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f1092i;

    /* renamed from: j, reason: collision with root package name */
    public final b0.i f1093j;

    /* renamed from: k, reason: collision with root package name */
    public final e f1094k;

    /* renamed from: l, reason: collision with root package name */
    public int f1095l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1096m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1097n;

    public f() {
        new c(this, 1);
        this.f = androidx.lifecycle.f.f2307e;
        new androidx.lifecycle.o();
        new AtomicInteger();
        this.f1092i = new ArrayList();
        this.f1093j = new b0.i(10, this);
        this.f1090g = new androidx.lifecycle.m(this);
        this.f1091h = new V.f(this);
        ArrayList arrayList = this.f1092i;
        b0.i iVar = this.f1093j;
        if (!arrayList.contains(iVar)) {
            if (this.f1085a >= 0) {
                f fVar = (f) iVar.f2461b;
                fVar.f1091h.b();
                v.a(fVar);
                fVar.f1091h.c(null);
            } else {
                arrayList.add(iVar);
            }
        }
        new c(this, 0);
        new d(this);
        this.f1094k = new e(this);
        this.f1095l = -1;
        new P0.j(10, this);
    }

    @Override // V.g
    public final V.e b() {
        return (V.e) this.f1091h.f1608c;
    }

    @Override // androidx.lifecycle.b
    public final Q.b c() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Override // androidx.lifecycle.A
    public final z d() {
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    @Override // androidx.lifecycle.k
    public final androidx.lifecycle.m e() {
        return this.f1090g;
    }

    public final k f() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public final View g() {
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.f1096m) {
            return;
        }
        if (k.j(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f1097n) {
            return;
        }
        this.f1097n = true;
        this.f1096m = true;
        if (this.f1095l >= 0) {
            k f = f();
            int i3 = this.f1095l;
            if (i3 < 0) {
                throw new IllegalArgumentException(B0.c.h(i3, "Bad id: "));
            }
            synchronized (f.f1102a) {
            }
            this.f1095l = -1;
            return;
        }
        a aVar = new a(f());
        m mVar = new m();
        mVar.f1109a = 3;
        mVar.f1110b = this;
        aVar.f1073a.add(mVar);
        mVar.f1111c = 0;
        mVar.f1112d = 0;
        mVar.f1113e = 0;
        mVar.f = 0;
        aVar.a(true);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f1086b);
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
