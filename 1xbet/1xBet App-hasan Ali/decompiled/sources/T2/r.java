package T2;

import G1.C0145p;
import T2.r;
import android.util.Log;
import d1.C1911b;
import d1.m;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import l3.C2054a;
import m1.InterfaceC2083a;
import o0.C2202f;
import z1.DialogInterfaceOnCancelListenerC2770b;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5737a;

    /* renamed from: b, reason: collision with root package name */
    public int f5738b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f5739c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f5740d;

    /* renamed from: e, reason: collision with root package name */
    public Object f5741e;
    public final Serializable f;

    /* JADX WARN: Type inference failed for: r9v3, types: [int[], java.io.Serializable] */
    public r(v3.e eVar) {
        this.f5737a = 0;
        ArrayList arrayList = (ArrayList) eVar.f20433m;
        int size = arrayList.size();
        this.f5739c = (String[]) ((ArrayList) eVar.f20432l).toArray(new String[size]);
        int size2 = arrayList.size();
        double[] dArr = new double[size2];
        for (int i = 0; i < size2; i++) {
            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
        }
        this.f5740d = dArr;
        ArrayList arrayList2 = (ArrayList) eVar.f20434n;
        int size3 = arrayList2.size();
        double[] dArr2 = new double[size3];
        for (int i5 = 0; i5 < size3; i5++) {
            dArr2[i5] = ((Double) arrayList2.get(i5)).doubleValue();
        }
        this.f5741e = dArr2;
        this.f = new int[size];
        this.f5738b = 0;
    }

    public static boolean j(int i) {
        return Log.isLoggable("FragmentManager", i);
    }

    public static boolean k(DialogInterfaceOnCancelListenerC2770b dialogInterfaceOnCancelListenerC2770b) {
        return dialogInterfaceOnCancelListenerC2770b == null || dialogInterfaceOnCancelListenerC2770b.f21885n;
    }

    public void a(boolean z3) {
        for (DialogInterfaceOnCancelListenerC2770b dialogInterfaceOnCancelListenerC2770b : ((C2202f) this.f5740d).h()) {
            if (dialogInterfaceOnCancelListenerC2770b != null && z3) {
                dialogInterfaceOnCancelListenerC2770b.f21884m.a(true);
            }
        }
    }

    public boolean b() {
        if (this.f5738b < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z3 = false;
        for (DialogInterfaceOnCancelListenerC2770b dialogInterfaceOnCancelListenerC2770b : ((C2202f) this.f5740d).h()) {
            if (dialogInterfaceOnCancelListenerC2770b != null && k(dialogInterfaceOnCancelListenerC2770b) && dialogInterfaceOnCancelListenerC2770b.f21884m.b()) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(dialogInterfaceOnCancelListenerC2770b);
                z3 = true;
            }
        }
        if (((ArrayList) this.f5741e) != null) {
            for (int i = 0; i < ((ArrayList) this.f5741e).size(); i++) {
                DialogInterfaceOnCancelListenerC2770b dialogInterfaceOnCancelListenerC2770b2 = (DialogInterfaceOnCancelListenerC2770b) ((ArrayList) this.f5741e).get(i);
                if (arrayList == null || !arrayList.contains(dialogInterfaceOnCancelListenerC2770b2)) {
                    dialogInterfaceOnCancelListenerC2770b2.getClass();
                }
            }
        }
        this.f5741e = arrayList;
        return z3;
    }

    public void c(boolean z3) {
        for (DialogInterfaceOnCancelListenerC2770b dialogInterfaceOnCancelListenerC2770b : ((C2202f) this.f5740d).h()) {
            if (dialogInterfaceOnCancelListenerC2770b != null && z3) {
                dialogInterfaceOnCancelListenerC2770b.f21884m.c(true);
            }
        }
    }

    public void d(boolean z3) {
        for (DialogInterfaceOnCancelListenerC2770b dialogInterfaceOnCancelListenerC2770b : ((C2202f) this.f5740d).h()) {
            if (dialogInterfaceOnCancelListenerC2770b != null && z3) {
                dialogInterfaceOnCancelListenerC2770b.f21884m.d(true);
            }
        }
    }

    public boolean e() {
        if (this.f5738b >= 1) {
            for (DialogInterfaceOnCancelListenerC2770b dialogInterfaceOnCancelListenerC2770b : ((C2202f) this.f5740d).h()) {
                if (dialogInterfaceOnCancelListenerC2770b != null && dialogInterfaceOnCancelListenerC2770b.f21884m.e()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void f() {
        if (this.f5738b < 1) {
            return;
        }
        for (DialogInterfaceOnCancelListenerC2770b dialogInterfaceOnCancelListenerC2770b : ((C2202f) this.f5740d).h()) {
            if (dialogInterfaceOnCancelListenerC2770b != null) {
                dialogInterfaceOnCancelListenerC2770b.f21884m.f();
            }
        }
    }

    public void g(boolean z3) {
        for (DialogInterfaceOnCancelListenerC2770b dialogInterfaceOnCancelListenerC2770b : ((C2202f) this.f5740d).h()) {
            if (dialogInterfaceOnCancelListenerC2770b != null && z3) {
                dialogInterfaceOnCancelListenerC2770b.f21884m.g(true);
            }
        }
    }

    public boolean h() {
        boolean z3 = false;
        if (this.f5738b < 1) {
            return false;
        }
        for (DialogInterfaceOnCancelListenerC2770b dialogInterfaceOnCancelListenerC2770b : ((C2202f) this.f5740d).h()) {
            if (dialogInterfaceOnCancelListenerC2770b != null && k(dialogInterfaceOnCancelListenerC2770b) && dialogInterfaceOnCancelListenerC2770b.f21884m.h()) {
                z3 = true;
            }
        }
        return z3;
    }

    public void i() {
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
    }

    public String toString() {
        switch (this.f5737a) {
            case 1:
                StringBuilder sb = new StringBuilder(128);
                sb.append("FragmentManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                sb.append("null");
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public r() {
        this.f5737a = 1;
        this.f5739c = new ArrayList();
        this.f5740d = new C2202f(2);
        new C0145p(3, this);
        this.f = new AtomicInteger();
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        Collections.synchronizedMap(new HashMap());
        new C2054a(this);
        new CopyOnWriteArrayList();
        final int i = 0;
        new InterfaceC2083a(this) { // from class: z1.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f21897b;

            {
                this.f21897b = this;
            }

            @Override // m1.InterfaceC2083a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        r rVar = this.f21897b;
                        rVar.getClass();
                        rVar.a(false);
                        break;
                    case 1:
                        r rVar2 = this.f21897b;
                        rVar2.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            rVar2.c(false);
                            break;
                        }
                        break;
                    case 2:
                        r rVar3 = this.f21897b;
                        rVar3.getClass();
                        boolean z3 = ((C1911b) obj).f16855a;
                        rVar3.d(false);
                        break;
                    default:
                        r rVar4 = this.f21897b;
                        rVar4.getClass();
                        boolean z5 = ((m) obj).f16883a;
                        rVar4.g(false);
                        break;
                }
            }
        };
        final int i5 = 1;
        new InterfaceC2083a(this) { // from class: z1.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f21897b;

            {
                this.f21897b = this;
            }

            @Override // m1.InterfaceC2083a
            public final void accept(Object obj) {
                switch (i5) {
                    case 0:
                        r rVar = this.f21897b;
                        rVar.getClass();
                        rVar.a(false);
                        break;
                    case 1:
                        r rVar2 = this.f21897b;
                        rVar2.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            rVar2.c(false);
                            break;
                        }
                        break;
                    case 2:
                        r rVar3 = this.f21897b;
                        rVar3.getClass();
                        boolean z3 = ((C1911b) obj).f16855a;
                        rVar3.d(false);
                        break;
                    default:
                        r rVar4 = this.f21897b;
                        rVar4.getClass();
                        boolean z5 = ((m) obj).f16883a;
                        rVar4.g(false);
                        break;
                }
            }
        };
        final int i6 = 2;
        new InterfaceC2083a(this) { // from class: z1.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f21897b;

            {
                this.f21897b = this;
            }

            @Override // m1.InterfaceC2083a
            public final void accept(Object obj) {
                switch (i6) {
                    case 0:
                        r rVar = this.f21897b;
                        rVar.getClass();
                        rVar.a(false);
                        break;
                    case 1:
                        r rVar2 = this.f21897b;
                        rVar2.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            rVar2.c(false);
                            break;
                        }
                        break;
                    case 2:
                        r rVar3 = this.f21897b;
                        rVar3.getClass();
                        boolean z3 = ((C1911b) obj).f16855a;
                        rVar3.d(false);
                        break;
                    default:
                        r rVar4 = this.f21897b;
                        rVar4.getClass();
                        boolean z5 = ((m) obj).f16883a;
                        rVar4.g(false);
                        break;
                }
            }
        };
        final int i7 = 3;
        new InterfaceC2083a(this) { // from class: z1.c

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r f21897b;

            {
                this.f21897b = this;
            }

            @Override // m1.InterfaceC2083a
            public final void accept(Object obj) {
                switch (i7) {
                    case 0:
                        r rVar = this.f21897b;
                        rVar.getClass();
                        rVar.a(false);
                        break;
                    case 1:
                        r rVar2 = this.f21897b;
                        rVar2.getClass();
                        if (((Integer) obj).intValue() == 80) {
                            rVar2.c(false);
                            break;
                        }
                        break;
                    case 2:
                        r rVar3 = this.f21897b;
                        rVar3.getClass();
                        boolean z3 = ((C1911b) obj).f16855a;
                        rVar3.d(false);
                        break;
                    default:
                        r rVar4 = this.f21897b;
                        rVar4.getClass();
                        boolean z5 = ((m) obj).f16883a;
                        rVar4.g(false);
                        break;
                }
            }
        };
        this.f5738b = -1;
        new ArrayDeque();
        new A0.C(24, this);
    }
}
