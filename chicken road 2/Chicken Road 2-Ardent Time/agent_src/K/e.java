package K;

/* loaded from: classes.dex */
public class e implements android.content.DialogInterface.OnCancelListener, android.content.DialogInterface.OnDismissListener, android.content.ComponentCallbacks, android.view.View.OnCreateContextMenuListener, androidx.lifecycle.j, Q.d {

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.Object f947n = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public final int f948a = -1;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f949b = java.util.UUID.randomUUID().toString();

    /* renamed from: c, reason: collision with root package name */
    public final I0.b f950c = new I0.b(2);

    /* renamed from: d, reason: collision with root package name */
    public I0.b f951d;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.e f952e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.lifecycle.l f953f;

    /* renamed from: g, reason: collision with root package name */
    public D0.j f954g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f955h;

    /* renamed from: i, reason: collision with root package name */
    public final C.j f956i;

    /* renamed from: j, reason: collision with root package name */
    public final K.d f957j;

    /* renamed from: k, reason: collision with root package name */
    public int f958k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f959l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f960m;

    /* JADX WARN: Type inference failed for: r1v16, types: [androidx.lifecycle.j, java.lang.Object] */
    public e() {
        java.lang.Object obj;
        androidx.lifecycle.v vVar;
        new K.b(this, 1);
        this.f952e = androidx.lifecycle.e.f2383e;
        new androidx.lifecycle.n();
        new java.util.concurrent.atomic.AtomicInteger();
        this.f955h = new java.util.ArrayList();
        this.f956i = new C.j(11, this);
        this.f953f = new androidx.lifecycle.l(this);
        this.f954g = new D0.j(this);
        java.util.ArrayList arrayList = this.f955h;
        C.j jVar = this.f956i;
        if (!arrayList.contains(jVar)) {
            if (this.f948a >= 0) {
                K.e eVar = (K.e) jVar.f88b;
                eVar.f954g.b();
                androidx.lifecycle.e eVar2 = eVar.f953f.f2390c;
                if (eVar2 != androidx.lifecycle.e.f2380b && eVar2 != androidx.lifecycle.e.f2381c) {
                    throw new java.lang.IllegalArgumentException("Failed requirement.");
                }
                I1.h hVar = (I1.h) eVar.f954g.f210c;
                hVar.getClass();
                java.util.Iterator it = ((j.C0915f) hVar.f725c).iterator();
                while (true) {
                    j.C0911b c0911b = (j.C0911b) it;
                    obj = null;
                    if (!c0911b.hasNext()) {
                        vVar = null;
                        break;
                    }
                    java.util.Map.Entry components = (java.util.Map.Entry) c0911b.next();
                    kotlin.jvm.internal.i.d(components, "components");
                    java.lang.String str = (java.lang.String) components.getKey();
                    vVar = (androidx.lifecycle.v) components.getValue();
                    if (kotlin.jvm.internal.i.a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                        break;
                    }
                }
                if (vVar == null) {
                    androidx.lifecycle.v vVar2 = new androidx.lifecycle.v((I1.h) eVar.f954g.f210c, eVar);
                    j.C0915f c0915f = (j.C0915f) ((I1.h) eVar.f954g.f210c).f725c;
                    j.C0912c a2 = c0915f.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
                    if (a2 != null) {
                        obj = a2.f7927b;
                    } else {
                        j.C0912c c0912c = new j.C0912c("androidx.lifecycle.internal.SavedStateHandlesProvider", vVar2);
                        c0915f.f7936d++;
                        j.C0912c c0912c2 = c0915f.f7934b;
                        if (c0912c2 == null) {
                            c0915f.f7933a = c0912c;
                            c0915f.f7934b = c0912c;
                        } else {
                            c0912c2.f7928c = c0912c;
                            c0912c.f7929d = c0912c2;
                            c0915f.f7934b = c0912c;
                        }
                    }
                    if (((androidx.lifecycle.v) obj) != null) {
                        throw new java.lang.IllegalArgumentException("SavedStateProvider with the given key is already registered");
                    }
                    eVar.f953f.a(new Q.a(1, vVar2));
                }
                D0.j jVar2 = eVar.f954g;
                if (!jVar2.f209b) {
                    jVar2.b();
                }
                androidx.lifecycle.l b2 = jVar2.f208a.b();
                if (b2.f2390c.compareTo(androidx.lifecycle.e.f2382d) >= 0) {
                    throw new java.lang.IllegalStateException(("performRestore cannot be called when owner is " + b2.f2390c).toString());
                }
                I1.h hVar2 = (I1.h) jVar2.f210c;
                if (!hVar2.f723a) {
                    throw new java.lang.IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
                }
                if (hVar2.f724b) {
                    throw new java.lang.IllegalStateException("SavedStateRegistry was already restored.");
                }
                hVar2.f726d = null;
                hVar2.f724b = true;
            } else {
                arrayList.add(jVar);
            }
        }
        new K.b(this, 0);
        new K.c(this);
        this.f957j = new K.d(this);
        this.f958k = -1;
        new m0.j(2, this);
    }

    @Override // Q.d
    public final I1.h a() {
        return (I1.h) this.f954g.f210c;
    }

    @Override // androidx.lifecycle.j
    public final androidx.lifecycle.l b() {
        return this.f953f;
    }

    public final L.b c() {
        throw new java.lang.IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final I0.b d() {
        throw new java.lang.IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        throw new java.lang.IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        java.lang.String str;
        if (this.f959l) {
            return;
        }
        if (android.util.Log.isLoggable("FragmentManager", 3)) {
            android.util.Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f960m) {
            return;
        }
        this.f960m = true;
        this.f959l = true;
        if (this.f958k >= 0) {
            I0.b d2 = d();
            int i2 = this.f958k;
            if (i2 < 0) {
                throw new java.lang.IllegalArgumentException(B1.a.f(i2, "Bad id: "));
            }
            synchronized (((java.util.ArrayList) d2.f657b)) {
            }
            this.f958k = -1;
            return;
        }
        K.a aVar = new K.a(d());
        K.h hVar = new K.h();
        hVar.f963a = 3;
        hVar.f964b = this;
        ((java.util.ArrayList) aVar.f941d).add(hVar);
        hVar.f965c = 0;
        hVar.f966d = 0;
        hVar.f967e = 0;
        hVar.f968f = 0;
        if (aVar.f940c) {
            throw new java.lang.IllegalStateException("commit already called");
        }
        if (android.util.Log.isLoggable("FragmentManager", 2)) {
            android.util.Log.v("FragmentManager", "Commit: " + aVar);
            java.io.PrintWriter printWriter = new java.io.PrintWriter(new K.i());
            printWriter.print("  ");
            printWriter.print("mName=");
            printWriter.print((java.lang.String) null);
            printWriter.print(" mIndex=");
            printWriter.print(aVar.f939b);
            printWriter.print(" mCommitted=");
            printWriter.println(aVar.f940c);
            java.util.ArrayList arrayList = (java.util.ArrayList) aVar.f941d;
            if (!arrayList.isEmpty()) {
                printWriter.print("  ");
                printWriter.println("Operations:");
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    K.h hVar2 = (K.h) arrayList.get(i3);
                    switch (hVar2.f963a) {
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
                            str = "cmd=" + hVar2.f963a;
                            break;
                    }
                    printWriter.print("  ");
                    printWriter.print("  Op #");
                    printWriter.print(i3);
                    printWriter.print(": ");
                    printWriter.print(str);
                    printWriter.print(" ");
                    printWriter.println(hVar2.f964b);
                    if (hVar2.f965c != 0 || hVar2.f966d != 0) {
                        printWriter.print("  ");
                        printWriter.print("enterAnim=#");
                        printWriter.print(java.lang.Integer.toHexString(hVar2.f965c));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(java.lang.Integer.toHexString(hVar2.f966d));
                    }
                    if (hVar2.f967e != 0 || hVar2.f968f != 0) {
                        printWriter.print("  ");
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(java.lang.Integer.toHexString(hVar2.f967e));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(java.lang.Integer.toHexString(hVar2.f968f));
                    }
                }
            }
            printWriter.close();
        }
        aVar.f940c = true;
        I0.b bVar = (I0.b) aVar.f942e;
        aVar.f939b = -1;
        synchronized (((java.util.ArrayList) bVar.f657b)) {
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append("} (");
        sb.append(this.f949b);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
    }
}
