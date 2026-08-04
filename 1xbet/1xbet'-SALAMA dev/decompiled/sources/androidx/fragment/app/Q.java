package androidx.fragment.app;

import W5.AbstractC0486a1;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0720o;
import androidx.lifecycle.C0726v;
import androidx.lifecycle.EnumC0719n;
import androidx.lifecycle.InterfaceC0724t;
import com.salamadev.nabilalawadi.kisaskoran.R;
import io.sentry.protocol.SentryThread;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final K f9368A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public p037f.e f9369B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public p037f.e f9370C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public p037f.e f9371D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ArrayDeque f9372E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f9373F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f9374G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f9375H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f9376I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f9377J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ArrayList f9378K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ArrayList f9379L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public ArrayList f9380M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public T f9381N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final RunnableC0693m f9382O;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9384b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f9387e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.activity.A f9389g;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f9394m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final V0 f9395n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f9396o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final F f9397p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final F f9398q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final F f9399r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final F f9400s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final I f9401t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f9402u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0705z f9403v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C f9404w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AbstractComponentCallbacksC0701v f9405x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AbstractComponentCallbacksC0701v f9406y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final J f9407z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f9383a = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p072k1.g f9385c = new p072k1.g(9);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList f9386d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final E f9388f = new E(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C0681a f9390h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final H f9391i = new H(this);
    public final AtomicInteger j = new AtomicInteger();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map f9392k = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map f9393l = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.fragment.app.F] */
    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.fragment.app.F] */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.fragment.app.F] */
    /* JADX WARN: Type inference failed for: r0v18, types: [androidx.fragment.app.F] */
    public Q() {
        Collections.synchronizedMap(new HashMap());
        this.f9394m = new ArrayList();
        this.f9395n = new V0(this);
        this.f9396o = new CopyOnWriteArrayList();
        final int i7 = 0;
        this.f9397p = new O.a(this) { // from class: androidx.fragment.app.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Q f9325b;

            {
                this.f9325b = this;
            }

            @Override // O.a
            public final void accept(Object obj) {
                switch (i7) {
                    case 0:
                        Q q7 = this.f9325b;
                        if (q7.L()) {
                            q7.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        Q q8 = this.f9325b;
                        if (q8.L() && num.intValue() == 80) {
                            q8.m(false);
                            break;
                        }
                        break;
                    case 2:
                        F.p pVar = (F.p) obj;
                        Q q9 = this.f9325b;
                        if (q9.L()) {
                            q9.n(pVar.f2444a, false);
                        }
                        break;
                    default:
                        F.I i8 = (F.I) obj;
                        Q q10 = this.f9325b;
                        if (q10.L()) {
                            q10.s(i8.f2426a, false);
                        }
                        break;
                }
            }
        };
        final int i8 = 1;
        this.f9398q = new O.a(this) { // from class: androidx.fragment.app.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Q f9325b;

            {
                this.f9325b = this;
            }

            @Override // O.a
            public final void accept(Object obj) {
                switch (i8) {
                    case 0:
                        Q q7 = this.f9325b;
                        if (q7.L()) {
                            q7.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        Q q8 = this.f9325b;
                        if (q8.L() && num.intValue() == 80) {
                            q8.m(false);
                            break;
                        }
                        break;
                    case 2:
                        F.p pVar = (F.p) obj;
                        Q q9 = this.f9325b;
                        if (q9.L()) {
                            q9.n(pVar.f2444a, false);
                        }
                        break;
                    default:
                        F.I i9 = (F.I) obj;
                        Q q10 = this.f9325b;
                        if (q10.L()) {
                            q10.s(i9.f2426a, false);
                        }
                        break;
                }
            }
        };
        final int i9 = 2;
        this.f9399r = new O.a(this) { // from class: androidx.fragment.app.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Q f9325b;

            {
                this.f9325b = this;
            }

            @Override // O.a
            public final void accept(Object obj) {
                switch (i9) {
                    case 0:
                        Q q7 = this.f9325b;
                        if (q7.L()) {
                            q7.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        Q q8 = this.f9325b;
                        if (q8.L() && num.intValue() == 80) {
                            q8.m(false);
                            break;
                        }
                        break;
                    case 2:
                        F.p pVar = (F.p) obj;
                        Q q9 = this.f9325b;
                        if (q9.L()) {
                            q9.n(pVar.f2444a, false);
                        }
                        break;
                    default:
                        F.I i10 = (F.I) obj;
                        Q q10 = this.f9325b;
                        if (q10.L()) {
                            q10.s(i10.f2426a, false);
                        }
                        break;
                }
            }
        };
        final int i10 = 3;
        this.f9400s = new O.a(this) { // from class: androidx.fragment.app.F

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Q f9325b;

            {
                this.f9325b = this;
            }

            @Override // O.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        Q q7 = this.f9325b;
                        if (q7.L()) {
                            q7.i(false);
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        Q q8 = this.f9325b;
                        if (q8.L() && num.intValue() == 80) {
                            q8.m(false);
                            break;
                        }
                        break;
                    case 2:
                        F.p pVar = (F.p) obj;
                        Q q9 = this.f9325b;
                        if (q9.L()) {
                            q9.n(pVar.f2444a, false);
                        }
                        break;
                    default:
                        F.I i11 = (F.I) obj;
                        Q q10 = this.f9325b;
                        if (q10.L()) {
                            q10.s(i11.f2426a, false);
                        }
                        break;
                }
            }
        };
        this.f9401t = new I(this);
        this.f9402u = -1;
        this.f9407z = new J(this);
        this.f9368A = new K();
        this.f9372E = new ArrayDeque();
        this.f9382O = new RunnableC0693m(this, 2);
    }

    public static HashSet F(C0681a c0681a) {
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < c0681a.f9431a.size(); i7++) {
            AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = ((W) c0681a.f9431a.get(i7)).f9420b;
            if (abstractComponentCallbacksC0701v != null && c0681a.f9437g) {
                hashSet.add(abstractComponentCallbacksC0701v);
            }
        }
        return hashSet;
    }

    public static boolean K(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v) {
        abstractComponentCallbacksC0701v.getClass();
        boolean zK = false;
        for (AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v2 : abstractComponentCallbacksC0701v.f9515L.f9385c.u()) {
            if (abstractComponentCallbacksC0701v2 != null) {
                zK = K(abstractComponentCallbacksC0701v2);
            }
            if (zK) {
                return true;
            }
        }
        return false;
    }

    public static boolean M(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v) {
        if (abstractComponentCallbacksC0701v == null) {
            return true;
        }
        return abstractComponentCallbacksC0701v.f9523T && (abstractComponentCallbacksC0701v.f9513J == null || M(abstractComponentCallbacksC0701v.f9516M));
    }

    public static boolean N(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v) {
        if (abstractComponentCallbacksC0701v == null) {
            return true;
        }
        Q q7 = abstractComponentCallbacksC0701v.f9513J;
        return abstractComponentCallbacksC0701v.equals(q7.f9406y) && N(q7.f9405x);
    }

    public static void b0(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0701v);
        }
        if (abstractComponentCallbacksC0701v.f9520Q) {
            abstractComponentCallbacksC0701v.f9520Q = false;
            abstractComponentCallbacksC0701v.f9529Z = !abstractComponentCallbacksC0701v.f9529Z;
        }
    }

    public final boolean A(boolean z4) {
        boolean zA;
        z(z4);
        boolean z7 = false;
        while (true) {
            ArrayList arrayList = this.f9378K;
            ArrayList arrayList2 = this.f9379L;
            synchronized (this.f9383a) {
                if (this.f9383a.isEmpty()) {
                    zA = false;
                } else {
                    try {
                        int size = this.f9383a.size();
                        zA = false;
                        for (int i7 = 0; i7 < size; i7++) {
                            zA |= ((N) this.f9383a.get(i7)).a(arrayList, arrayList2);
                        }
                        this.f9383a.clear();
                        this.f9403v.f9553c.removeCallbacks(this.f9382O);
                    } catch (Throwable th) {
                        this.f9383a.clear();
                        this.f9403v.f9553c.removeCallbacks(this.f9382O);
                        throw th;
                    }
                }
            }
            if (!zA) {
                e0();
                v();
                ((HashMap) this.f9385c.f14681b).values().removeAll(Collections.singleton(null));
                return z7;
            }
            z7 = true;
            this.f9384b = true;
            try {
                T(this.f9378K, this.f9379L);
                d();
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0229 A[PHI: r14
      0x0229: PHI (r14v11 int) = (r14v10 int), (r14v12 int) binds: [B:107:0x0219, B:112:0x0225] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0164  */
    public final void B(ArrayList arrayList, ArrayList arrayList2, int i7, int i8) {
        p072k1.g gVar;
        p072k1.g gVar2;
        int i9;
        int i10;
        ArrayList arrayList3 = arrayList;
        boolean z4 = ((C0681a) arrayList3.get(i7)).f9444o;
        ArrayList arrayList4 = this.f9380M;
        if (arrayList4 == null) {
            this.f9380M = new ArrayList();
        } else {
            arrayList4.clear();
        }
        ArrayList arrayList5 = this.f9380M;
        p072k1.g gVar3 = this.f9385c;
        arrayList5.addAll(gVar3.z());
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = this.f9406y;
        int i11 = i7;
        boolean z7 = false;
        while (true) {
            int i12 = 1;
            if (i11 >= i8) {
                p072k1.g gVar4 = gVar3;
                this.f9380M.clear();
                if (!z4 && this.f9402u >= 1) {
                    for (int i13 = i7; i13 < i8; i13++) {
                        Iterator it = ((C0681a) arrayList.get(i13)).f9431a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v2 = ((W) it.next()).f9420b;
                            if (abstractComponentCallbacksC0701v2 == null || abstractComponentCallbacksC0701v2.f9513J == null) {
                                gVar = gVar4;
                            } else {
                                gVar = gVar4;
                                gVar.G(g(abstractComponentCallbacksC0701v2));
                            }
                            gVar4 = gVar;
                        }
                    }
                }
                for (int i14 = i7; i14 < i8; i14++) {
                    C0681a c0681a = (C0681a) arrayList.get(i14);
                    if (((Boolean) arrayList2.get(i14)).booleanValue()) {
                        c0681a.c(-1);
                        ArrayList arrayList6 = c0681a.f9431a;
                        boolean z8 = true;
                        for (int size = arrayList6.size() - 1; size >= 0; size--) {
                            W w7 = (W) arrayList6.get(size);
                            AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v3 = w7.f9420b;
                            if (abstractComponentCallbacksC0701v3 != null) {
                                if (abstractComponentCallbacksC0701v3.f9528Y != null) {
                                    abstractComponentCallbacksC0701v3.f().f9494a = z8;
                                }
                                int i15 = c0681a.f9436f;
                                int i16 = 8194;
                                int i17 = 4097;
                                if (i15 != 4097) {
                                    if (i15 != 8194) {
                                        i16 = 4100;
                                        i17 = 8197;
                                        if (i15 != 8197) {
                                            if (i15 == 4099) {
                                                i16 = 4099;
                                            } else if (i15 != 4100) {
                                                i16 = 0;
                                            } else {
                                                i16 = i17;
                                            }
                                        }
                                    } else {
                                        i16 = i17;
                                    }
                                }
                                if (abstractComponentCallbacksC0701v3.f9528Y != null || i16 != 0) {
                                    abstractComponentCallbacksC0701v3.f();
                                    abstractComponentCallbacksC0701v3.f9528Y.f9499f = i16;
                                }
                                abstractComponentCallbacksC0701v3.f();
                                abstractComponentCallbacksC0701v3.f9528Y.getClass();
                            }
                            int i18 = w7.f9419a;
                            Q q7 = c0681a.f9445p;
                            switch (i18) {
                                case 1:
                                    abstractComponentCallbacksC0701v3.C(w7.f9422d, w7.f9423e, w7.f9424f, w7.f9425g);
                                    z8 = true;
                                    q7.X(abstractComponentCallbacksC0701v3, true);
                                    q7.S(abstractComponentCallbacksC0701v3);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + w7.f9419a);
                                case 3:
                                    abstractComponentCallbacksC0701v3.C(w7.f9422d, w7.f9423e, w7.f9424f, w7.f9425g);
                                    q7.a(abstractComponentCallbacksC0701v3);
                                    z8 = true;
                                    break;
                                case 4:
                                    abstractComponentCallbacksC0701v3.C(w7.f9422d, w7.f9423e, w7.f9424f, w7.f9425g);
                                    q7.getClass();
                                    b0(abstractComponentCallbacksC0701v3);
                                    z8 = true;
                                    break;
                                case 5:
                                    abstractComponentCallbacksC0701v3.C(w7.f9422d, w7.f9423e, w7.f9424f, w7.f9425g);
                                    q7.X(abstractComponentCallbacksC0701v3, true);
                                    q7.J(abstractComponentCallbacksC0701v3);
                                    z8 = true;
                                    break;
                                case 6:
                                    abstractComponentCallbacksC0701v3.C(w7.f9422d, w7.f9423e, w7.f9424f, w7.f9425g);
                                    q7.c(abstractComponentCallbacksC0701v3);
                                    z8 = true;
                                    break;
                                case 7:
                                    abstractComponentCallbacksC0701v3.C(w7.f9422d, w7.f9423e, w7.f9424f, w7.f9425g);
                                    q7.X(abstractComponentCallbacksC0701v3, true);
                                    q7.h(abstractComponentCallbacksC0701v3);
                                    z8 = true;
                                    break;
                                case 8:
                                    q7.Z(null);
                                    z8 = true;
                                    break;
                                case 9:
                                    q7.Z(abstractComponentCallbacksC0701v3);
                                    z8 = true;
                                    break;
                                case 10:
                                    q7.Y(abstractComponentCallbacksC0701v3, w7.f9426h);
                                    z8 = true;
                                    break;
                            }
                        }
                    } else {
                        c0681a.c(1);
                        ArrayList arrayList7 = c0681a.f9431a;
                        int size2 = arrayList7.size();
                        int i19 = 0;
                        while (i19 < size2) {
                            W w8 = (W) arrayList7.get(i19);
                            AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v4 = w8.f9420b;
                            if (abstractComponentCallbacksC0701v4 != null) {
                                if (abstractComponentCallbacksC0701v4.f9528Y != null) {
                                    abstractComponentCallbacksC0701v4.f().f9494a = false;
                                }
                                int i20 = c0681a.f9436f;
                                if (abstractComponentCallbacksC0701v4.f9528Y != null || i20 != 0) {
                                    abstractComponentCallbacksC0701v4.f();
                                    abstractComponentCallbacksC0701v4.f9528Y.f9499f = i20;
                                }
                                abstractComponentCallbacksC0701v4.f();
                                abstractComponentCallbacksC0701v4.f9528Y.getClass();
                            }
                            int i21 = w8.f9419a;
                            Q q8 = c0681a.f9445p;
                            switch (i21) {
                                case 1:
                                    abstractComponentCallbacksC0701v4.C(w8.f9422d, w8.f9423e, w8.f9424f, w8.f9425g);
                                    q8.X(abstractComponentCallbacksC0701v4, false);
                                    q8.a(abstractComponentCallbacksC0701v4);
                                    i19++;
                                    arrayList7 = arrayList7;
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + w8.f9419a);
                                case 3:
                                    abstractComponentCallbacksC0701v4.C(w8.f9422d, w8.f9423e, w8.f9424f, w8.f9425g);
                                    q8.S(abstractComponentCallbacksC0701v4);
                                    i19++;
                                    arrayList7 = arrayList7;
                                    break;
                                case 4:
                                    abstractComponentCallbacksC0701v4.C(w8.f9422d, w8.f9423e, w8.f9424f, w8.f9425g);
                                    q8.J(abstractComponentCallbacksC0701v4);
                                    i19++;
                                    arrayList7 = arrayList7;
                                    break;
                                case 5:
                                    abstractComponentCallbacksC0701v4.C(w8.f9422d, w8.f9423e, w8.f9424f, w8.f9425g);
                                    q8.X(abstractComponentCallbacksC0701v4, false);
                                    b0(abstractComponentCallbacksC0701v4);
                                    i19++;
                                    arrayList7 = arrayList7;
                                    break;
                                case 6:
                                    abstractComponentCallbacksC0701v4.C(w8.f9422d, w8.f9423e, w8.f9424f, w8.f9425g);
                                    q8.h(abstractComponentCallbacksC0701v4);
                                    i19++;
                                    arrayList7 = arrayList7;
                                    break;
                                case 7:
                                    abstractComponentCallbacksC0701v4.C(w8.f9422d, w8.f9423e, w8.f9424f, w8.f9425g);
                                    q8.X(abstractComponentCallbacksC0701v4, false);
                                    q8.c(abstractComponentCallbacksC0701v4);
                                    i19++;
                                    arrayList7 = arrayList7;
                                    break;
                                case 8:
                                    q8.Z(abstractComponentCallbacksC0701v4);
                                    i19++;
                                    arrayList7 = arrayList7;
                                    break;
                                case 9:
                                    q8.Z(null);
                                    i19++;
                                    arrayList7 = arrayList7;
                                    break;
                                case 10:
                                    q8.Y(abstractComponentCallbacksC0701v4, w8.f9427i);
                                    i19++;
                                    arrayList7 = arrayList7;
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = ((Boolean) arrayList2.get(i8 - 1)).booleanValue();
                ArrayList arrayList8 = this.f9394m;
                if (z7 && !arrayList8.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(F((C0681a) it2.next()));
                    }
                    if (this.f9390h == null) {
                        Iterator it3 = arrayList8.iterator();
                        while (it3.hasNext()) {
                            if (it3.next() != null) {
                                throw new ClassCastException();
                            }
                            Iterator it4 = linkedHashSet.iterator();
                            if (it4.hasNext()) {
                                throw null;
                            }
                        }
                        Iterator it5 = arrayList8.iterator();
                        while (it5.hasNext()) {
                            if (it5.next() != null) {
                                throw new ClassCastException();
                            }
                            Iterator it6 = linkedHashSet.iterator();
                            if (it6.hasNext()) {
                                throw null;
                            }
                        }
                    }
                }
                for (int i22 = i7; i22 < i8; i22++) {
                    C0681a c0681a2 = (C0681a) arrayList.get(i22);
                    if (zBooleanValue) {
                        for (int size3 = c0681a2.f9431a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v5 = ((W) c0681a2.f9431a.get(size3)).f9420b;
                            if (abstractComponentCallbacksC0701v5 != null) {
                                g(abstractComponentCallbacksC0701v5).j();
                            }
                        }
                    } else {
                        Iterator it7 = c0681a2.f9431a.iterator();
                        while (it7.hasNext()) {
                            AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v6 = ((W) it7.next()).f9420b;
                            if (abstractComponentCallbacksC0701v6 != null) {
                                g(abstractComponentCallbacksC0701v6).j();
                            }
                        }
                    }
                }
                O(this.f9402u, true);
                int i23 = i7;
                for (C0692l c0692l : f(arrayList, i23, i8)) {
                    c0692l.f9469d = zBooleanValue;
                    synchronized (c0692l.f9467b) {
                        c0692l.f();
                        ArrayList arrayList9 = c0692l.f9467b;
                        ListIterator listIterator = arrayList9.listIterator(arrayList9.size());
                        if (listIterator.hasPrevious()) {
                            ((a0) listIterator.previous()).getClass();
                            throw null;
                        }
                        c0692l.f9470e = false;
                    }
                    c0692l.c();
                }
                while (i23 < i8) {
                    C0681a c0681a3 = (C0681a) arrayList.get(i23);
                    if (((Boolean) arrayList2.get(i23)).booleanValue() && c0681a3.f9447r >= 0) {
                        c0681a3.f9447r = -1;
                    }
                    c0681a3.getClass();
                    i23++;
                }
                if (z7 && arrayList8.size() > 0) {
                    throw p031e1.k.c(arrayList8, 0);
                }
                return;
            }
            C0681a c0681a4 = (C0681a) arrayList3.get(i11);
            if (((Boolean) arrayList2.get(i11)).booleanValue()) {
                gVar2 = gVar3;
                int i24 = 1;
                ArrayList arrayList10 = this.f9380M;
                ArrayList arrayList11 = c0681a4.f9431a;
                int size4 = arrayList11.size() - 1;
                while (size4 >= 0) {
                    W w9 = (W) arrayList11.get(size4);
                    int i25 = w9.f9419a;
                    if (i25 != i24) {
                        if (i25 != 3) {
                            switch (i25) {
                                case 6:
                                    arrayList10.add(w9.f9420b);
                                    break;
                                case 8:
                                    abstractComponentCallbacksC0701v = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0701v = w9.f9420b;
                                    break;
                                case 10:
                                    w9.f9427i = w9.f9426h;
                                    break;
                            }
                        } else {
                            arrayList10.add(w9.f9420b);
                        }
                        size4--;
                        i24 = 1;
                    }
                    arrayList10.remove(w9.f9420b);
                    size4--;
                    i24 = 1;
                }
            } else {
                ArrayList arrayList12 = this.f9380M;
                int i26 = 0;
                while (true) {
                    ArrayList arrayList13 = c0681a4.f9431a;
                    if (i26 < arrayList13.size()) {
                        W w10 = (W) arrayList13.get(i26);
                        int i27 = w10.f9419a;
                        if (i27 != i12) {
                            if (i27 != 2) {
                                if (i27 == 3 || i27 == 6) {
                                    arrayList12.remove(w10.f9420b);
                                    AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v7 = w10.f9420b;
                                    if (abstractComponentCallbacksC0701v7 == abstractComponentCallbacksC0701v) {
                                        arrayList13.add(i26, new W(9, abstractComponentCallbacksC0701v7));
                                        i26++;
                                        gVar3 = gVar3;
                                        i9 = 1;
                                        abstractComponentCallbacksC0701v = null;
                                    }
                                } else if (i27 == 7) {
                                    i9 = 1;
                                } else if (i27 == 8) {
                                    arrayList13.add(i26, new W(9, abstractComponentCallbacksC0701v, 0));
                                    w10.f9421c = true;
                                    i26++;
                                    abstractComponentCallbacksC0701v = w10.f9420b;
                                }
                                gVar3 = gVar3;
                                i9 = 1;
                            } else {
                                AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v8 = w10.f9420b;
                                int i28 = abstractComponentCallbacksC0701v8.f9518O;
                                int size5 = arrayList12.size() - 1;
                                boolean z9 = false;
                                while (size5 >= 0) {
                                    p072k1.g gVar5 = gVar3;
                                    AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v9 = (AbstractComponentCallbacksC0701v) arrayList12.get(size5);
                                    if (abstractComponentCallbacksC0701v9.f9518O != i28) {
                                        i28 = i28;
                                    } else if (abstractComponentCallbacksC0701v9 == abstractComponentCallbacksC0701v8) {
                                        i28 = i28;
                                        z9 = true;
                                    } else {
                                        if (abstractComponentCallbacksC0701v9 == abstractComponentCallbacksC0701v) {
                                            arrayList13.add(i26, new W(9, abstractComponentCallbacksC0701v9, 0));
                                            i26++;
                                            i10 = 0;
                                            abstractComponentCallbacksC0701v = null;
                                        } else {
                                            i10 = 0;
                                        }
                                        W w11 = new W(3, abstractComponentCallbacksC0701v9, i10);
                                        w11.f9422d = w10.f9422d;
                                        w11.f9424f = w10.f9424f;
                                        w11.f9423e = w10.f9423e;
                                        w11.f9425g = w10.f9425g;
                                        arrayList13.add(i26, w11);
                                        arrayList12.remove(abstractComponentCallbacksC0701v9);
                                        i26++;
                                        abstractComponentCallbacksC0701v = abstractComponentCallbacksC0701v;
                                    }
                                    size5--;
                                    i28 = i28;
                                    gVar3 = gVar5;
                                }
                                gVar3 = gVar3;
                                i9 = 1;
                                if (z9) {
                                    arrayList13.remove(i26);
                                    i26--;
                                } else {
                                    w10.f9419a = 1;
                                    w10.f9421c = true;
                                    arrayList12.add(abstractComponentCallbacksC0701v8);
                                }
                            }
                            i26 += i9;
                            i12 = i9;
                            gVar3 = gVar3;
                        } else {
                            i9 = i12;
                        }
                        arrayList12.add(w10.f9420b);
                        i26 += i9;
                        i12 = i9;
                        gVar3 = gVar3;
                    } else {
                        gVar2 = gVar3;
                    }
                }
            }
            z7 = z7 || c0681a4.f9437g;
            i11++;
            arrayList3 = arrayList;
            gVar3 = gVar2;
        }
    }

    public final AbstractComponentCallbacksC0701v C(int i7) {
        p072k1.g gVar = this.f9385c;
        ArrayList arrayList = (ArrayList) gVar.f14680a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = (AbstractComponentCallbacksC0701v) arrayList.get(size);
            if (abstractComponentCallbacksC0701v != null && abstractComponentCallbacksC0701v.f9517N == i7) {
                return abstractComponentCallbacksC0701v;
            }
        }
        for (V v6 : ((HashMap) gVar.f14681b).values()) {
            if (v6 != null) {
                AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v2 = v6.f9416c;
                if (abstractComponentCallbacksC0701v2.f9517N == i7) {
                    return abstractComponentCallbacksC0701v2;
                }
            }
        }
        return null;
    }

    public final AbstractComponentCallbacksC0701v D(String str) {
        p072k1.g gVar = this.f9385c;
        ArrayList arrayList = (ArrayList) gVar.f14680a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = (AbstractComponentCallbacksC0701v) arrayList.get(size);
            if (abstractComponentCallbacksC0701v != null && str.equals(abstractComponentCallbacksC0701v.f9519P)) {
                return abstractComponentCallbacksC0701v;
            }
        }
        for (V v6 : ((HashMap) gVar.f14681b).values()) {
            if (v6 != null) {
                AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v2 = v6.f9416c;
                if (str.equals(abstractComponentCallbacksC0701v2.f9519P)) {
                    return abstractComponentCallbacksC0701v2;
                }
            }
        }
        return null;
    }

    public final void E() {
        for (C0692l c0692l : e()) {
            if (c0692l.f9470e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0692l.f9470e = false;
                c0692l.c();
            }
        }
    }

    public final ViewGroup G(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v) {
        ViewGroup viewGroup = abstractComponentCallbacksC0701v.f9525V;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0701v.f9518O > 0 && this.f9404w.c()) {
            View viewB = this.f9404w.b(abstractComponentCallbacksC0701v.f9518O);
            if (viewB instanceof ViewGroup) {
                return (ViewGroup) viewB;
            }
        }
        return null;
    }

    public final J H() {
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = this.f9405x;
        return abstractComponentCallbacksC0701v != null ? abstractComponentCallbacksC0701v.f9513J.H() : this.f9407z;
    }

    public final K I() {
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = this.f9405x;
        return abstractComponentCallbacksC0701v != null ? abstractComponentCallbacksC0701v.f9513J.I() : this.f9368A;
    }

    public final void J(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0701v);
        }
        if (abstractComponentCallbacksC0701v.f9520Q) {
            return;
        }
        abstractComponentCallbacksC0701v.f9520Q = true;
        abstractComponentCallbacksC0701v.f9529Z = true ^ abstractComponentCallbacksC0701v.f9529Z;
        a0(abstractComponentCallbacksC0701v);
    }

    public final boolean L() {
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = this.f9405x;
        if (abstractComponentCallbacksC0701v == null) {
            return true;
        }
        return abstractComponentCallbacksC0701v.l() && this.f9405x.i().L();
    }

    public final void O(int i7, boolean z4) {
        HashMap map;
        C0705z c0705z;
        if (this.f9403v == null && i7 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z4 || i7 != this.f9402u) {
            this.f9402u = i7;
            p072k1.g gVar = this.f9385c;
            Iterator it = ((ArrayList) gVar.f14680a).iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = (HashMap) gVar.f14681b;
                if (!zHasNext) {
                    break;
                }
                V v6 = (V) map.get(((AbstractComponentCallbacksC0701v) it.next()).f9537e);
                if (v6 != null) {
                    v6.j();
                }
            }
            for (V v7 : map.values()) {
                if (v7 != null) {
                    v7.j();
                    AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = v7.f9416c;
                    if (abstractComponentCallbacksC0701v.f9506C && !abstractComponentCallbacksC0701v.n()) {
                        gVar.I(v7);
                    }
                }
            }
            c0();
            if (this.f9373F && (c0705z = this.f9403v) != null && this.f9402u == 7) {
                c0705z.f9555e.invalidateMenu();
                this.f9373F = false;
            }
        }
    }

    public final void P() {
        if (this.f9403v == null) {
            return;
        }
        this.f9374G = false;
        this.f9375H = false;
        this.f9381N.f9413i = false;
        for (AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v : this.f9385c.z()) {
            if (abstractComponentCallbacksC0701v != null) {
                abstractComponentCallbacksC0701v.f9515L.P();
            }
        }
    }

    public final boolean Q() {
        A(false);
        z(true);
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = this.f9406y;
        if (abstractComponentCallbacksC0701v != null && abstractComponentCallbacksC0701v.g().Q()) {
            return true;
        }
        boolean zR = R(this.f9378K, this.f9379L, -1, 0);
        if (zR) {
            this.f9384b = true;
            try {
                T(this.f9378K, this.f9379L);
                d();
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        e0();
        v();
        ((HashMap) this.f9385c.f14681b).values().removeAll(Collections.singleton(null));
        return zR;
    }

    public final boolean R(ArrayList arrayList, ArrayList arrayList2, int i7, int i8) {
        boolean z4 = (i8 & 1) != 0;
        int size = -1;
        if (!this.f9386d.isEmpty()) {
            if (i7 < 0) {
                size = z4 ? 0 : this.f9386d.size() - 1;
            } else {
                int size2 = this.f9386d.size() - 1;
                while (size2 >= 0) {
                    C0681a c0681a = (C0681a) this.f9386d.get(size2);
                    if (i7 >= 0 && i7 == c0681a.f9447r) {
                        break;
                    }
                    size2--;
                }
                if (size2 >= 0) {
                    if (z4) {
                        while (size2 > 0) {
                            C0681a c0681a2 = (C0681a) this.f9386d.get(size2 - 1);
                            if (i7 < 0 || i7 != c0681a2.f9447r) {
                                break;
                            }
                            size2--;
                        }
                    } else if (size2 != this.f9386d.size() - 1) {
                        size2++;
                    }
                    size = size2;
                } else {
                    size = size2;
                }
            }
        }
        if (size < 0) {
            return false;
        }
        for (int size3 = this.f9386d.size() - 1; size3 >= size; size3--) {
            arrayList.add((C0681a) this.f9386d.remove(size3));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void S(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0701v + " nesting=" + abstractComponentCallbacksC0701v.f9512I);
        }
        boolean zN = abstractComponentCallbacksC0701v.n();
        if (abstractComponentCallbacksC0701v.f9521R && zN) {
            return;
        }
        p072k1.g gVar = this.f9385c;
        synchronized (((ArrayList) gVar.f14680a)) {
            ((ArrayList) gVar.f14680a).remove(abstractComponentCallbacksC0701v);
        }
        abstractComponentCallbacksC0701v.f9505B = false;
        if (K(abstractComponentCallbacksC0701v)) {
            this.f9373F = true;
        }
        abstractComponentCallbacksC0701v.f9506C = true;
        a0(abstractComponentCallbacksC0701v);
    }

    public final void T(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i7 = 0;
        int i8 = 0;
        while (i7 < size) {
            if (!((C0681a) arrayList.get(i7)).f9444o) {
                if (i8 != i7) {
                    B(arrayList, arrayList2, i8, i7);
                }
                i8 = i7 + 1;
                if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                    while (i8 < size && ((Boolean) arrayList2.get(i8)).booleanValue() && !((C0681a) arrayList.get(i8)).f9444o) {
                        i8++;
                    }
                }
                B(arrayList, arrayList2, i7, i8);
                i7 = i8 - 1;
            }
            i7++;
        }
        if (i8 != size) {
            B(arrayList, arrayList2, i8, size);
        }
    }

    public final void U(Bundle bundle) {
        int i7;
        V0 v6;
        int i8;
        V v7;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f9403v.f9552b.getClassLoader());
                this.f9393l.put(str.substring(7), bundle3);
            }
        }
        HashMap map = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f9403v.f9552b.getClassLoader());
                map.put(str2.substring(9), bundle2);
            }
        }
        p072k1.g gVar = this.f9385c;
        HashMap map2 = (HashMap) gVar.f14682c;
        map2.clear();
        map2.putAll(map);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable(SentryThread.JsonKeys.STATE);
        if (fragmentManagerState == null) {
            return;
        }
        HashMap map3 = (HashMap) gVar.f14681b;
        map3.clear();
        Iterator it = fragmentManagerState.f9332a.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            i7 = 2;
            v6 = this.f9395n;
            if (!zHasNext) {
                break;
            }
            Bundle bundleQ = gVar.Q((String) it.next(), null);
            if (bundleQ != null) {
                AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = (AbstractComponentCallbacksC0701v) this.f9381N.f9408d.get(((FragmentState) bundleQ.getParcelable(SentryThread.JsonKeys.STATE)).f9346b);
                if (abstractComponentCallbacksC0701v != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0701v);
                    }
                    v7 = new V(v6, gVar, abstractComponentCallbacksC0701v, bundleQ);
                } else {
                    v7 = new V(this.f9395n, this.f9385c, this.f9403v.f9552b.getClassLoader(), H(), bundleQ);
                }
                AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v2 = v7.f9416c;
                abstractComponentCallbacksC0701v2.f9532b = bundleQ;
                abstractComponentCallbacksC0701v2.f9513J = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0701v2.f9537e + "): " + abstractComponentCallbacksC0701v2);
                }
                v7.l(this.f9403v.f9552b.getClassLoader());
                gVar.G(v7);
                v7.f9418e = this.f9402u;
            }
        }
        T t7 = this.f9381N;
        t7.getClass();
        for (AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v3 : new ArrayList(t7.f9408d.values())) {
            if (map3.get(abstractComponentCallbacksC0701v3.f9537e) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0701v3 + " that was not found in the set of active Fragments " + fragmentManagerState.f9332a);
                }
                this.f9381N.f(abstractComponentCallbacksC0701v3);
                abstractComponentCallbacksC0701v3.f9513J = this;
                V v8 = new V(v6, gVar, abstractComponentCallbacksC0701v3);
                v8.f9418e = 1;
                v8.j();
                abstractComponentCallbacksC0701v3.f9506C = true;
                v8.j();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.f9333b;
        ((ArrayList) gVar.f14680a).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701vQ = gVar.q(str3);
                if (abstractComponentCallbacksC0701vQ == null) {
                    throw new IllegalStateException(AbstractC0486a1.h("No instantiated fragment for (", str3, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + abstractComponentCallbacksC0701vQ);
                }
                gVar.c(abstractComponentCallbacksC0701vQ);
            }
        }
        if (fragmentManagerState.f9334c != null) {
            this.f9386d = new ArrayList(fragmentManagerState.f9334c.length);
            int i9 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f9334c;
                if (i9 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i9];
                backStackRecordState.getClass();
                C0681a c0681a = new C0681a(this);
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    int[] iArr = backStackRecordState.f9311a;
                    if (i10 >= iArr.length) {
                        break;
                    }
                    W w7 = new W();
                    int i12 = i10 + 1;
                    w7.f9419a = iArr[i10];
                    if (Log.isLoggable("FragmentManager", i7)) {
                        Log.v("FragmentManager", "Instantiate " + c0681a + " op #" + i11 + " base fragment #" + iArr[i12]);
                    }
                    w7.f9426h = EnumC0719n.values()[backStackRecordState.f9313c[i11]];
                    w7.f9427i = EnumC0719n.values()[backStackRecordState.f9314d[i11]];
                    int i13 = i10 + 2;
                    w7.f9421c = iArr[i12] != 0;
                    int i14 = iArr[i13];
                    w7.f9422d = i14;
                    int i15 = iArr[i10 + 3];
                    w7.f9423e = i15;
                    int i16 = i10 + 5;
                    int i17 = iArr[i10 + 4];
                    w7.f9424f = i17;
                    i10 += 6;
                    int i18 = iArr[i16];
                    w7.f9425g = i18;
                    c0681a.f9432b = i14;
                    c0681a.f9433c = i15;
                    c0681a.f9434d = i17;
                    c0681a.f9435e = i18;
                    c0681a.b(w7);
                    i11++;
                    i7 = 2;
                }
                c0681a.f9436f = backStackRecordState.f9315e;
                c0681a.f9438h = backStackRecordState.f9316f;
                c0681a.f9437g = true;
                c0681a.f9439i = backStackRecordState.f9318y;
                c0681a.j = backStackRecordState.f9319z;
                c0681a.f9440k = backStackRecordState.f9306A;
                c0681a.f9441l = backStackRecordState.f9307B;
                c0681a.f9442m = backStackRecordState.f9308C;
                c0681a.f9443n = backStackRecordState.f9309D;
                c0681a.f9444o = backStackRecordState.f9310E;
                c0681a.f9447r = backStackRecordState.f9317x;
                int i19 = 0;
                while (true) {
                    ArrayList arrayList2 = backStackRecordState.f9312b;
                    if (i19 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i19);
                    if (str4 != null) {
                        ((W) c0681a.f9431a.get(i19)).f9420b = gVar.q(str4);
                    }
                    i19++;
                }
                c0681a.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    StringBuilder sbJ = AbstractC0486a1.j(i9, "restoreAllState: back stack #", " (index ");
                    sbJ.append(c0681a.f9447r);
                    sbJ.append("): ");
                    sbJ.append(c0681a);
                    Log.v("FragmentManager", sbJ.toString());
                    PrintWriter printWriter = new PrintWriter(new Y());
                    c0681a.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f9386d.add(c0681a);
                i9++;
                i7 = 2;
            }
            i8 = 0;
        } else {
            i8 = 0;
            this.f9386d = new ArrayList();
        }
        this.j.set(fragmentManagerState.f9335d);
        String str5 = fragmentManagerState.f9336e;
        if (str5 != null) {
            AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701vQ2 = gVar.q(str5);
            this.f9406y = abstractComponentCallbacksC0701vQ2;
            r(abstractComponentCallbacksC0701vQ2);
        }
        ArrayList arrayList3 = fragmentManagerState.f9337f;
        if (arrayList3 != null) {
            for (int i20 = i8; i20 < arrayList3.size(); i20++) {
                this.f9392k.put((String) arrayList3.get(i20), (BackStackState) fragmentManagerState.f9338x.get(i20));
            }
        }
        this.f9372E = new ArrayDeque(fragmentManagerState.f9339y);
    }

    public final Bundle V() {
        int i7;
        ArrayList arrayList;
        BackStackRecordState[] backStackRecordStateArr;
        Bundle bundle;
        Bundle bundle2 = new Bundle();
        E();
        x();
        A(true);
        this.f9374G = true;
        this.f9381N.f9413i = true;
        p072k1.g gVar = this.f9385c;
        gVar.getClass();
        HashMap map = (HashMap) gVar.f14681b;
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it = map.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            V v6 = (V) it.next();
            if (v6 != null) {
                AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = v6.f9416c;
                String str = abstractComponentCallbacksC0701v.f9537e;
                Bundle bundle3 = new Bundle();
                AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v2 = v6.f9416c;
                if (abstractComponentCallbacksC0701v2.f9530a == -1 && (bundle = abstractComponentCallbacksC0701v2.f9532b) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable(SentryThread.JsonKeys.STATE, new FragmentState(abstractComponentCallbacksC0701v2));
                if (abstractComponentCallbacksC0701v2.f9530a > -1) {
                    Bundle bundle4 = new Bundle();
                    abstractComponentCallbacksC0701v2.x(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    v6.f9414a.J(abstractComponentCallbacksC0701v2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    abstractComponentCallbacksC0701v2.f9540f0.c(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle bundleV = abstractComponentCallbacksC0701v2.f9515L.V();
                    if (!bundleV.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", bundleV);
                    }
                    SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC0701v2.f9534c;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = abstractComponentCallbacksC0701v2.f9535d;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = abstractComponentCallbacksC0701v2.f9539f;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                gVar.Q(str, bundle3);
                arrayList2.add(abstractComponentCallbacksC0701v.f9537e);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0701v + ": " + abstractComponentCallbacksC0701v.f9532b);
                }
            }
        }
        HashMap map2 = (HashMap) this.f9385c.f14682c;
        if (!map2.isEmpty()) {
            p072k1.g gVar2 = this.f9385c;
            synchronized (((ArrayList) gVar2.f14680a)) {
                try {
                    if (((ArrayList) gVar2.f14680a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) gVar2.f14680a).size());
                        for (AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v3 : (ArrayList) gVar2.f14680a) {
                            arrayList.add(abstractComponentCallbacksC0701v3.f9537e);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0701v3.f9537e + "): " + abstractComponentCallbacksC0701v3);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int size = this.f9386d.size();
            if (size > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (i7 = 0; i7 < size; i7++) {
                    backStackRecordStateArr[i7] = new BackStackRecordState((C0681a) this.f9386d.get(i7));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder sbJ = AbstractC0486a1.j(i7, "saveAllState: adding back stack #", ": ");
                        sbJ.append(this.f9386d.get(i7));
                        Log.v("FragmentManager", sbJ.toString());
                    }
                }
            } else {
                backStackRecordStateArr = null;
            }
            FragmentManagerState fragmentManagerState = new FragmentManagerState();
            fragmentManagerState.f9336e = null;
            ArrayList arrayList3 = new ArrayList();
            fragmentManagerState.f9337f = arrayList3;
            ArrayList arrayList4 = new ArrayList();
            fragmentManagerState.f9338x = arrayList4;
            fragmentManagerState.f9332a = arrayList2;
            fragmentManagerState.f9333b = arrayList;
            fragmentManagerState.f9334c = backStackRecordStateArr;
            fragmentManagerState.f9335d = this.j.get();
            AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v4 = this.f9406y;
            if (abstractComponentCallbacksC0701v4 != null) {
                fragmentManagerState.f9336e = abstractComponentCallbacksC0701v4.f9537e;
            }
            arrayList3.addAll(this.f9392k.keySet());
            arrayList4.addAll(this.f9392k.values());
            fragmentManagerState.f9339y = new ArrayList(this.f9372E);
            bundle2.putParcelable(SentryThread.JsonKeys.STATE, fragmentManagerState);
            for (String str2 : this.f9393l.keySet()) {
                bundle2.putBundle(p155w1.L.i("result_", str2), (Bundle) this.f9393l.get(str2));
            }
            for (String str3 : map2.keySet()) {
                bundle2.putBundle(p155w1.L.i("fragment_", str3), (Bundle) map2.get(str3));
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle2;
    }

    public final void W() {
        synchronized (this.f9383a) {
            try {
                if (this.f9383a.size() == 1) {
                    this.f9403v.f9553c.removeCallbacks(this.f9382O);
                    this.f9403v.f9553c.post(this.f9382O);
                    e0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void X(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v, boolean z4) {
        ViewGroup viewGroupG = G(abstractComponentCallbacksC0701v);
        if (viewGroupG == null || !(viewGroupG instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupG).setDrawDisappearingViewsLast(!z4);
    }

    public final void Y(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v, EnumC0719n enumC0719n) {
        if (abstractComponentCallbacksC0701v.equals(this.f9385c.q(abstractComponentCallbacksC0701v.f9537e)) && (abstractComponentCallbacksC0701v.f9514K == null || abstractComponentCallbacksC0701v.f9513J == this)) {
            abstractComponentCallbacksC0701v.c0 = enumC0719n;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0701v + " is not an active fragment of FragmentManager " + this);
    }

    public final void Z(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v) {
        if (abstractComponentCallbacksC0701v != null) {
            if (!abstractComponentCallbacksC0701v.equals(this.f9385c.q(abstractComponentCallbacksC0701v.f9537e)) || (abstractComponentCallbacksC0701v.f9514K != null && abstractComponentCallbacksC0701v.f9513J != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0701v + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v2 = this.f9406y;
        this.f9406y = abstractComponentCallbacksC0701v;
        r(abstractComponentCallbacksC0701v2);
        r(this.f9406y);
    }

    public final V a(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v) {
        String str = abstractComponentCallbacksC0701v.f9533b0;
        if (str != null) {
            p071k0.d.c(abstractComponentCallbacksC0701v, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0701v);
        }
        V vG = g(abstractComponentCallbacksC0701v);
        abstractComponentCallbacksC0701v.f9513J = this;
        p072k1.g gVar = this.f9385c;
        gVar.G(vG);
        if (!abstractComponentCallbacksC0701v.f9521R) {
            gVar.c(abstractComponentCallbacksC0701v);
            abstractComponentCallbacksC0701v.f9506C = false;
            abstractComponentCallbacksC0701v.f9529Z = false;
            if (K(abstractComponentCallbacksC0701v)) {
                this.f9373F = true;
            }
        }
        return vG;
    }

    public final void a0(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v) {
        ViewGroup viewGroupG = G(abstractComponentCallbacksC0701v);
        if (viewGroupG != null) {
            C0700u c0700u = abstractComponentCallbacksC0701v.f9528Y;
            if ((c0700u == null ? 0 : c0700u.f9498e) + (c0700u == null ? 0 : c0700u.f9497d) + (c0700u == null ? 0 : c0700u.f9496c) + (c0700u == null ? 0 : c0700u.f9495b) > 0) {
                if (viewGroupG.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    viewGroupG.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0701v);
                }
                AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v2 = (AbstractComponentCallbacksC0701v) viewGroupG.getTag(R.id.visible_removing_fragment_view_tag);
                C0700u c0700u2 = abstractComponentCallbacksC0701v.f9528Y;
                boolean z4 = c0700u2 != null ? c0700u2.f9494a : false;
                if (abstractComponentCallbacksC0701v2.f9528Y == null) {
                    return;
                }
                abstractComponentCallbacksC0701v2.f().f9494a = z4;
            }
        }
    }

    public final void b(C0705z c0705z, C c3, AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v) {
        if (this.f9403v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f9403v = c0705z;
        this.f9404w = c3;
        this.f9405x = abstractComponentCallbacksC0701v;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f9396o;
        if (abstractComponentCallbacksC0701v != null) {
            copyOnWriteArrayList.add(new L(abstractComponentCallbacksC0701v));
        } else if (c0705z != null) {
            copyOnWriteArrayList.add(c0705z);
        }
        if (this.f9405x != null) {
            e0();
        }
        if (c0705z != null) {
            androidx.activity.A onBackPressedDispatcher = c0705z.f9555e.getOnBackPressedDispatcher();
            this.f9389g = onBackPressedDispatcher;
            InterfaceC0724t interfaceC0724t = abstractComponentCallbacksC0701v != null ? abstractComponentCallbacksC0701v : c0705z;
            onBackPressedDispatcher.getClass();
            H h6 = this.f9391i;
            t6.h.e(h6, "onBackPressedCallback");
            AbstractC0720o lifecycle = interfaceC0724t.getLifecycle();
            if (((C0726v) lifecycle).f9637c != EnumC0719n.f9626a) {
                h6.f9357b.add(new androidx.activity.x(onBackPressedDispatcher, lifecycle, h6));
                onBackPressedDispatcher.c();
                h6.f9358c = new androidx.activity.z(0, onBackPressedDispatcher, androidx.activity.A.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
            }
        }
        if (abstractComponentCallbacksC0701v != null) {
            T t7 = abstractComponentCallbacksC0701v.f9513J.f9381N;
            HashMap map = t7.f9409e;
            T t8 = (T) map.get(abstractComponentCallbacksC0701v.f9537e);
            if (t8 == null) {
                t8 = new T(t7.f9411g);
                map.put(abstractComponentCallbacksC0701v.f9537e, t8);
            }
            this.f9381N = t8;
        } else if (c0705z != null) {
            android.support.v4.media.session.t tVar = new android.support.v4.media.session.t(c0705z.f9555e.getViewModelStore(), T.j);
            String canonicalName = T.class.getCanonicalName();
            if (canonicalName == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            this.f9381N = (T) tVar.b0(T.class, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName));
        } else {
            this.f9381N = new T(false);
        }
        T t9 = this.f9381N;
        t9.f9413i = this.f9374G || this.f9375H;
        this.f9385c.f14683d = t9;
        C0705z c0705z2 = this.f9403v;
        if (c0705z2 != null && abstractComponentCallbacksC0701v == null) {
            G0.f savedStateRegistry = c0705z2.f9555e.getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new C0702w(this, 1));
            Bundle bundleA = savedStateRegistry.a("android:support:fragments");
            if (bundleA != null) {
                U(bundleA);
            }
        }
        C0705z c0705z3 = this.f9403v;
        if (c0705z3 != null) {
            p037f.h activityResultRegistry = c0705z3.f9555e.getActivityResultRegistry();
            String strI = p155w1.L.i("FragmentManager:", abstractComponentCallbacksC0701v != null ? p031e1.k.i(new StringBuilder(), abstractComponentCallbacksC0701v.f9537e, ":") : "");
            this.f9369B = activityResultRegistry.c(p031e1.k.e(strI, "StartActivityForResult"), new M(2), new G(this, 1));
            this.f9370C = activityResultRegistry.c(p031e1.k.e(strI, "StartIntentSenderForResult"), new M(0), new G(this, 2));
            this.f9371D = activityResultRegistry.c(p031e1.k.e(strI, "RequestPermissions"), new M(1), new G(this, 0));
        }
        C0705z c0705z4 = this.f9403v;
        if (c0705z4 != null) {
            c0705z4.addOnConfigurationChangedListener(this.f9397p);
        }
        C0705z c0705z5 = this.f9403v;
        if (c0705z5 != null) {
            c0705z5.f9555e.addOnTrimMemoryListener(this.f9398q);
        }
        C0705z c0705z6 = this.f9403v;
        if (c0705z6 != null) {
            c0705z6.f9555e.addOnMultiWindowModeChangedListener(this.f9399r);
        }
        C0705z c0705z7 = this.f9403v;
        if (c0705z7 != null) {
            c0705z7.f9555e.addOnPictureInPictureModeChangedListener(this.f9400s);
        }
        C0705z c0705z8 = this.f9403v;
        if (c0705z8 == null || abstractComponentCallbacksC0701v != null) {
            return;
        }
        c0705z8.f9555e.addMenuProvider(this.f9401t);
    }

    public final void c(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0701v);
        }
        if (abstractComponentCallbacksC0701v.f9521R) {
            abstractComponentCallbacksC0701v.f9521R = false;
            if (abstractComponentCallbacksC0701v.f9505B) {
                return;
            }
            this.f9385c.c(abstractComponentCallbacksC0701v);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0701v);
            }
            if (K(abstractComponentCallbacksC0701v)) {
                this.f9373F = true;
            }
        }
    }

    public final void c0() {
        for (V v6 : this.f9385c.t()) {
            AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = v6.f9416c;
            if (abstractComponentCallbacksC0701v.f9526W) {
                if (this.f9384b) {
                    this.f9377J = true;
                } else {
                    abstractComponentCallbacksC0701v.f9526W = false;
                    v6.j();
                }
            }
        }
    }

    public final void d() {
        this.f9384b = false;
        this.f9379L.clear();
        this.f9378K.clear();
    }

    public final void d0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new Y());
        C0705z c0705z = this.f9403v;
        if (c0705z == null) {
            try {
                w("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e7) {
                Log.e("FragmentManager", "Failed dumping state", e7);
                throw illegalStateException;
            }
        }
        try {
            c0705z.f9555e.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e8) {
            Log.e("FragmentManager", "Failed dumping state", e8);
            throw illegalStateException;
        }
    }

    public final HashSet e() {
        C0692l c0692l;
        HashSet hashSet = new HashSet();
        Iterator it = this.f9385c.t().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((V) it.next()).f9416c.f9525V;
            if (viewGroup != null) {
                t6.h.e(I(), "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C0692l) {
                    c0692l = (C0692l) tag;
                } else {
                    c0692l = new C0692l(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c0692l);
                }
                hashSet.add(c0692l);
            }
        }
        return hashSet;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [s6.a, t6.g] */
    /* JADX WARN: Type inference failed for: r2v6, types: [s6.a, t6.g] */
    public final void e0() {
        synchronized (this.f9383a) {
            try {
                if (!this.f9383a.isEmpty()) {
                    H h6 = this.f9391i;
                    h6.f9356a = true;
                    ?? r7 = h6.f9358c;
                    if (r7 != 0) {
                        r7.invoke();
                    }
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                boolean z4 = this.f9386d.size() + (this.f9390h != null ? 1 : 0) > 0 && N(this.f9405x);
                if (Log.isLoggable("FragmentManager", 3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z4);
                }
                H h7 = this.f9391i;
                h7.f9356a = z4;
                ?? r8 = h7.f9358c;
                if (r8 != 0) {
                    r8.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet f(ArrayList arrayList, int i7, int i8) {
        ViewGroup viewGroup;
        C0692l c0692l;
        HashSet hashSet = new HashSet();
        while (i7 < i8) {
            Iterator it = ((C0681a) arrayList.get(i7)).f9431a.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = ((W) it.next()).f9420b;
                if (abstractComponentCallbacksC0701v != null && (viewGroup = abstractComponentCallbacksC0701v.f9525V) != null) {
                    t6.h.d(I(), "fragmentManager.specialEffectsControllerFactory");
                    Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                    if (tag instanceof C0692l) {
                        c0692l = (C0692l) tag;
                    } else {
                        c0692l = new C0692l(viewGroup);
                        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0692l);
                    }
                    hashSet.add(c0692l);
                }
            }
            i7++;
        }
        return hashSet;
    }

    public final V g(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v) {
        String str = abstractComponentCallbacksC0701v.f9537e;
        p072k1.g gVar = this.f9385c;
        V v6 = (V) ((HashMap) gVar.f14681b).get(str);
        if (v6 != null) {
            return v6;
        }
        V v7 = new V(this.f9395n, gVar, abstractComponentCallbacksC0701v);
        v7.l(this.f9403v.f9552b.getClassLoader());
        v7.f9418e = this.f9402u;
        return v7;
    }

    public final void h(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0701v);
        }
        if (abstractComponentCallbacksC0701v.f9521R) {
            return;
        }
        abstractComponentCallbacksC0701v.f9521R = true;
        if (abstractComponentCallbacksC0701v.f9505B) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0701v);
            }
            p072k1.g gVar = this.f9385c;
            synchronized (((ArrayList) gVar.f14680a)) {
                ((ArrayList) gVar.f14680a).remove(abstractComponentCallbacksC0701v);
            }
            abstractComponentCallbacksC0701v.f9505B = false;
            if (K(abstractComponentCallbacksC0701v)) {
                this.f9373F = true;
            }
            a0(abstractComponentCallbacksC0701v);
        }
    }

    public final void i(boolean z4) {
        if (z4 && this.f9403v != null) {
            d0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v : this.f9385c.z()) {
            if (abstractComponentCallbacksC0701v != null) {
                abstractComponentCallbacksC0701v.f9524U = true;
                if (z4) {
                    abstractComponentCallbacksC0701v.f9515L.i(true);
                }
            }
        }
    }

    public final boolean j() {
        if (this.f9402u < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v : this.f9385c.z()) {
            if (abstractComponentCallbacksC0701v != null) {
                if (!abstractComponentCallbacksC0701v.f9520Q ? abstractComponentCallbacksC0701v.f9515L.j() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean k() {
        if (this.f9402u < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z4 = false;
        for (AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v : this.f9385c.z()) {
            if (abstractComponentCallbacksC0701v != null && M(abstractComponentCallbacksC0701v)) {
                if (!abstractComponentCallbacksC0701v.f9520Q ? abstractComponentCallbacksC0701v.f9515L.k() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0701v);
                    z4 = true;
                }
            }
        }
        if (this.f9387e != null) {
            for (int i7 = 0; i7 < this.f9387e.size(); i7++) {
                AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v2 = (AbstractComponentCallbacksC0701v) this.f9387e.get(i7);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0701v2)) {
                    abstractComponentCallbacksC0701v2.getClass();
                }
            }
        }
        this.f9387e = arrayList;
        return z4;
    }

    public final void l() {
        boolean zIsChangingConfigurations = true;
        this.f9376I = true;
        A(true);
        x();
        C0705z c0705z = this.f9403v;
        p072k1.g gVar = this.f9385c;
        if (c0705z != null) {
            zIsChangingConfigurations = ((T) gVar.f14683d).f9412h;
        } else {
            A a2 = c0705z.f9552b;
            if (a2 != null) {
                zIsChangingConfigurations = true ^ a2.isChangingConfigurations();
            }
        }
        if (zIsChangingConfigurations) {
            Iterator it = this.f9392k.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((BackStackState) it.next()).f9320a.iterator();
                while (it2.hasNext()) {
                    ((T) gVar.f14683d).d((String) it2.next(), false);
                }
            }
        }
        u(-1);
        C0705z c0705z2 = this.f9403v;
        if (c0705z2 != null) {
            c0705z2.f9555e.removeOnTrimMemoryListener(this.f9398q);
        }
        C0705z c0705z3 = this.f9403v;
        if (c0705z3 != null) {
            c0705z3.removeOnConfigurationChangedListener(this.f9397p);
        }
        C0705z c0705z4 = this.f9403v;
        if (c0705z4 != null) {
            c0705z4.f9555e.removeOnMultiWindowModeChangedListener(this.f9399r);
        }
        C0705z c0705z5 = this.f9403v;
        if (c0705z5 != null) {
            c0705z5.f9555e.removeOnPictureInPictureModeChangedListener(this.f9400s);
        }
        C0705z c0705z6 = this.f9403v;
        if (c0705z6 != null && this.f9405x == null) {
            c0705z6.f9555e.removeMenuProvider(this.f9401t);
        }
        this.f9403v = null;
        this.f9404w = null;
        this.f9405x = null;
        if (this.f9389g != null) {
            Iterator it3 = this.f9391i.f9357b.iterator();
            while (it3.hasNext()) {
                ((androidx.activity.c) it3.next()).cancel();
            }
            this.f9389g = null;
        }
        p037f.e eVar = this.f9369B;
        if (eVar != null) {
            eVar.b();
            this.f9370C.b();
            this.f9371D.b();
        }
    }

    public final void m(boolean z4) {
        if (z4 && this.f9403v != null) {
            d0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v : this.f9385c.z()) {
            if (abstractComponentCallbacksC0701v != null) {
                abstractComponentCallbacksC0701v.f9524U = true;
                if (z4) {
                    abstractComponentCallbacksC0701v.f9515L.m(true);
                }
            }
        }
    }

    public final void n(boolean z4, boolean z7) {
        if (z7 && this.f9403v != null) {
            d0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v : this.f9385c.z()) {
            if (abstractComponentCallbacksC0701v != null && z7) {
                abstractComponentCallbacksC0701v.f9515L.n(z4, true);
            }
        }
    }

    public final void o() {
        for (AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v : this.f9385c.u()) {
            if (abstractComponentCallbacksC0701v != null) {
                abstractComponentCallbacksC0701v.m();
                abstractComponentCallbacksC0701v.f9515L.o();
            }
        }
    }

    public final boolean p() {
        if (this.f9402u < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v : this.f9385c.z()) {
            if (abstractComponentCallbacksC0701v != null) {
                if (!abstractComponentCallbacksC0701v.f9520Q ? abstractComponentCallbacksC0701v.f9515L.p() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void q() {
        if (this.f9402u < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v : this.f9385c.z()) {
            if (abstractComponentCallbacksC0701v != null && !abstractComponentCallbacksC0701v.f9520Q) {
                abstractComponentCallbacksC0701v.f9515L.q();
            }
        }
    }

    public final void r(AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v) {
        if (abstractComponentCallbacksC0701v != null) {
            if (abstractComponentCallbacksC0701v.equals(this.f9385c.q(abstractComponentCallbacksC0701v.f9537e))) {
                abstractComponentCallbacksC0701v.f9513J.getClass();
                boolean zN = N(abstractComponentCallbacksC0701v);
                Boolean bool = abstractComponentCallbacksC0701v.f9504A;
                if (bool == null || bool.booleanValue() != zN) {
                    abstractComponentCallbacksC0701v.f9504A = Boolean.valueOf(zN);
                    S s7 = abstractComponentCallbacksC0701v.f9515L;
                    s7.e0();
                    s7.r(s7.f9406y);
                }
            }
        }
    }

    public final void s(boolean z4, boolean z7) {
        if (z7 && this.f9403v != null) {
            d0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v : this.f9385c.z()) {
            if (abstractComponentCallbacksC0701v != null && z7) {
                abstractComponentCallbacksC0701v.f9515L.s(z4, true);
            }
        }
    }

    public final boolean t() {
        if (this.f9402u < 1) {
            return false;
        }
        boolean z4 = false;
        for (AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v : this.f9385c.z()) {
            if (abstractComponentCallbacksC0701v != null && M(abstractComponentCallbacksC0701v)) {
                if (!abstractComponentCallbacksC0701v.f9520Q ? abstractComponentCallbacksC0701v.f9515L.t() : false) {
                    z4 = true;
                }
            }
        }
        return z4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = this.f9405x;
        if (abstractComponentCallbacksC0701v != null) {
            sb.append(abstractComponentCallbacksC0701v.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f9405x)));
            sb.append("}");
        } else {
            C0705z c0705z = this.f9403v;
            if (c0705z != null) {
                sb.append(c0705z.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f9403v)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i7) {
        try {
            this.f9384b = true;
            for (V v6 : ((HashMap) this.f9385c.f14681b).values()) {
                if (v6 != null) {
                    v6.f9418e = i7;
                }
            }
            O(i7, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0692l) it.next()).d();
            }
            this.f9384b = false;
            A(true);
        } catch (Throwable th) {
            this.f9384b = false;
            throw th;
        }
    }

    public final void v() {
        if (this.f9377J) {
            this.f9377J = false;
            c0();
        }
    }

    public final void w(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String strE = p031e1.k.e(str, "    ");
        p072k1.g gVar = this.f9385c;
        gVar.getClass();
        String str2 = str + "    ";
        HashMap map = (HashMap) gVar.f14681b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (V v6 : map.values()) {
                printWriter.print(str);
                if (v6 != null) {
                    AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v = v6.f9416c;
                    printWriter.println(abstractComponentCallbacksC0701v);
                    abstractComponentCallbacksC0701v.e(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) gVar.f14680a;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i7 = 0; i7 < size2; i7++) {
                AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v2 = (AbstractComponentCallbacksC0701v) arrayList.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0701v2.toString());
            }
        }
        ArrayList arrayList2 = this.f9387e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i8 = 0; i8 < size; i8++) {
                AbstractComponentCallbacksC0701v abstractComponentCallbacksC0701v3 = (AbstractComponentCallbacksC0701v) this.f9387e.get(i8);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0701v3.toString());
            }
        }
        int size3 = this.f9386d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i9 = 0; i9 < size3; i9++) {
                C0681a c0681a = (C0681a) this.f9386d.get(i9);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i9);
                printWriter.print(": ");
                printWriter.println(c0681a.toString());
                c0681a.f(strE, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.j.get());
        synchronized (this.f9383a) {
            try {
                int size4 = this.f9383a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i10 = 0; i10 < size4; i10++) {
                        Object obj = (N) this.f9383a.get(i10);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i10);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f9403v);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f9404w);
        if (this.f9405x != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f9405x);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f9402u);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f9374G);
        printWriter.print(" mStopped=");
        printWriter.print(this.f9375H);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f9376I);
        if (this.f9373F) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f9373F);
        }
    }

    public final void x() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((C0692l) it.next()).d();
        }
    }

    public final void y(N n2, boolean z4) {
        if (!z4) {
            if (this.f9403v == null) {
                if (!this.f9376I) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (this.f9374G || this.f9375H) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f9383a) {
            try {
                if (this.f9403v == null) {
                    if (!z4) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f9383a.add(n2);
                    W();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(boolean z4) {
        if (this.f9384b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f9403v == null) {
            if (!this.f9376I) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f9403v.f9553c.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z4 && (this.f9374G || this.f9375H)) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f9378K == null) {
            this.f9378K = new ArrayList();
            this.f9379L = new ArrayList();
        }
    }
}
