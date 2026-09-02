package p;

import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.util.Log;
import android.view.ContextMenu;
import android.view.View;
import androidx.lifecycle.j;
import androidx.lifecycle.l;
import androidx.lifecycle.n;
import androidx.lifecycle.x;
import d.C0047b;
import d.C0048c;
import d.C0051f;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import q.AbstractC0822b;
import s.C0827a;
import s.InterfaceC0830d;

/* renamed from: p.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0814d implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, ComponentCallbacks, View.OnCreateContextMenuListener, j, InterfaceC0830d {

    /* renamed from: n, reason: collision with root package name */
    public static final Object f6395n = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final int f6396a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final String f6397b = UUID.randomUUID().toString();

    /* renamed from: c, reason: collision with root package name */
    public final C0.b f6398c = new C0.b(6);

    /* renamed from: d, reason: collision with root package name */
    public C0.b f6399d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.e f6400e;

    /* renamed from: f, reason: collision with root package name */
    public l f6401f;

    /* renamed from: g, reason: collision with root package name */
    public e0.i f6402g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f6403h;

    /* renamed from: i, reason: collision with root package name */
    public final io.flutter.plugin.editing.a f6404i;

    /* renamed from: j, reason: collision with root package name */
    public final DialogInterfaceOnDismissListenerC0813c f6405j;

    /* renamed from: k, reason: collision with root package name */
    public int f6406k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6407l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f6408m;

    /* JADX WARN: Type inference failed for: r1v16, types: [androidx.lifecycle.j, java.lang.Object] */
    public DialogInterfaceOnCancelListenerC0814d() {
        Object obj;
        x xVar;
        new RunnableC0811a(this, 1);
        this.f6400e = androidx.lifecycle.e.f574e;
        new n();
        new AtomicInteger();
        this.f6403h = new ArrayList();
        this.f6404i = new io.flutter.plugin.editing.a(6, this);
        this.f6401f = new l(this);
        this.f6402g = new e0.i(this);
        ArrayList arrayList = this.f6403h;
        io.flutter.plugin.editing.a aVar = this.f6404i;
        if (!arrayList.contains(aVar)) {
            if (this.f6396a >= 0) {
                DialogInterfaceOnCancelListenerC0814d dialogInterfaceOnCancelListenerC0814d = (DialogInterfaceOnCancelListenerC0814d) aVar.f5792b;
                dialogInterfaceOnCancelListenerC0814d.f6402g.b();
                androidx.lifecycle.e eVar = dialogInterfaceOnCancelListenerC0814d.f6401f.f581c;
                if (eVar != androidx.lifecycle.e.f571b && eVar != androidx.lifecycle.e.f572c) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                i1.h hVar = (i1.h) dialogInterfaceOnCancelListenerC0814d.f6402g.f967c;
                hVar.getClass();
                Iterator it = ((C0051f) hVar.f1340c).iterator();
                while (true) {
                    C0047b c0047b = (C0047b) it;
                    obj = null;
                    if (!c0047b.hasNext()) {
                        xVar = null;
                        break;
                    }
                    Map.Entry components = (Map.Entry) c0047b.next();
                    kotlin.jvm.internal.j.d(components, "components");
                    String str = (String) components.getKey();
                    xVar = (x) components.getValue();
                    if (kotlin.jvm.internal.j.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                        break;
                    }
                }
                if (xVar == null) {
                    x xVar2 = new x((i1.h) dialogInterfaceOnCancelListenerC0814d.f6402g.f967c, dialogInterfaceOnCancelListenerC0814d);
                    C0051f c0051f = (C0051f) ((i1.h) dialogInterfaceOnCancelListenerC0814d.f6402g.f967c).f1340c;
                    C0048c a2 = c0051f.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                    if (a2 != null) {
                        obj = a2.f878b;
                    } else {
                        C0048c c0048c = new C0048c("androidx.lifecycle.internal.SavedStateHandlesProvider", xVar2);
                        c0051f.f887d++;
                        C0048c c0048c2 = c0051f.f885b;
                        if (c0048c2 == null) {
                            c0051f.f884a = c0048c;
                            c0051f.f885b = c0048c;
                        } else {
                            c0048c2.f879c = c0048c;
                            c0048c.f880d = c0048c2;
                            c0051f.f885b = c0048c;
                        }
                    }
                    if (((x) obj) != null) {
                        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
                    }
                    dialogInterfaceOnCancelListenerC0814d.f6401f.a(new C0827a(1, xVar2));
                }
                e0.i iVar = dialogInterfaceOnCancelListenerC0814d.f6402g;
                if (!iVar.f965a) {
                    iVar.b();
                }
                l b2 = iVar.f966b.b();
                if (b2.f581c.compareTo(androidx.lifecycle.e.f573d) >= 0) {
                    throw new IllegalStateException(("performRestore cannot be called when owner is " + b2.f581c).toString());
                }
                i1.h hVar2 = (i1.h) iVar.f967c;
                if (!hVar2.f1338a) {
                    throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
                }
                if (hVar2.f1339b) {
                    throw new IllegalStateException("SavedStateRegistry was already restored.");
                }
                hVar2.f1341d = null;
                hVar2.f1339b = true;
            } else {
                arrayList.add(aVar);
            }
        }
        new RunnableC0811a(this, 0);
        new DialogInterfaceOnCancelListenerC0812b(this);
        this.f6405j = new DialogInterfaceOnDismissListenerC0813c(this);
        this.f6406k = -1;
        new N.i(10, this);
    }

    @Override // s.InterfaceC0830d
    public final i1.h a() {
        return (i1.h) this.f6402g.f967c;
    }

    @Override // androidx.lifecycle.j
    public final l b() {
        return this.f6401f;
    }

    public final AbstractC0822b c() {
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final C0.b d() {
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        String str;
        if (this.f6407l) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f6408m) {
            return;
        }
        this.f6408m = true;
        this.f6407l = true;
        if (this.f6406k >= 0) {
            C0.b d2 = d();
            int i2 = this.f6406k;
            if (i2 < 0) {
                throw new IllegalArgumentException(C0.g.g(i2, "Bad id: "));
            }
            synchronized (((ArrayList) d2.f54b)) {
            }
            this.f6406k = -1;
            return;
        }
        P.i iVar = new P.i(d());
        C0817g c0817g = new C0817g();
        c0817g.f6411a = 3;
        c0817g.f6412b = this;
        ((ArrayList) iVar.f320e).add(c0817g);
        c0817g.f6413c = 0;
        c0817g.f6414d = 0;
        c0817g.f6415e = 0;
        c0817g.f6416f = 0;
        if (iVar.f318c) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + iVar);
            PrintWriter printWriter = new PrintWriter(new C0818h());
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((String) null);
            printWriter.print(" mIndex=");
            printWriter.print(iVar.f319d);
            printWriter.print(" mCommitted=");
            printWriter.println(iVar.f318c);
            ArrayList arrayList = (ArrayList) iVar.f320e;
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    C0817g c0817g2 = (C0817g) arrayList.get(i3);
                    switch (c0817g2.f6411a) {
                        case 0:
                            str = "NULL";
                            break;
                        case 1:
                            str = "ADD";
                            break;
                        case 2:
                            str = "REPLACE";
                            break;
                        case 3:
                            str = "REMOVE";
                            break;
                        case 4:
                            str = "HIDE";
                            break;
                        case 5:
                            str = "SHOW";
                            break;
                        case 6:
                            str = "DETACH";
                            break;
                        case 7:
                            str = "ATTACH";
                            break;
                        case 8:
                            str = "SET_PRIMARY_NAV";
                            break;
                        case 9:
                            str = "UNSET_PRIMARY_NAV";
                            break;
                        case 10:
                            str = "OP_SET_MAX_LIFECYCLE";
                            break;
                        default:
                            str = "cmd=" + c0817g2.f6411a;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(c0817g2.f6412b);
                    if (c0817g2.f6413c != 0 || c0817g2.f6414d != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(c0817g2.f6413c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(c0817g2.f6414d));
                    }
                    if (c0817g2.f6415e != 0 || c0817g2.f6416f != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(c0817g2.f6415e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(c0817g2.f6416f));
                    }
                }
            }
            printWriter.close();
        }
        iVar.f318c = true;
        C0.b bVar = (C0.b) iVar.f317b;
        iVar.f319d = -1;
        synchronized (((ArrayList) bVar.f54b)) {
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f6397b);
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
