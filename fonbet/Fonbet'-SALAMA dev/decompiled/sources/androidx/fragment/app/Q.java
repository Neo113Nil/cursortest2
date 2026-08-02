package androidx.fragment.app;

import W5.AbstractC0486a1;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0741o;
import androidx.lifecycle.C0747v;
import androidx.lifecycle.EnumC0740n;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import f.AbstractC1062h;
import f.C1059e;
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
import k0.AbstractC1326d;
import w1.V0;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: A, reason: collision with root package name */
    public final K f9368A;

    /* renamed from: B, reason: collision with root package name */
    public C1059e f9369B;

    /* renamed from: C, reason: collision with root package name */
    public C1059e f9370C;

    /* renamed from: D, reason: collision with root package name */
    public C1059e f9371D;

    /* renamed from: E, reason: collision with root package name */
    public ArrayDeque f9372E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f9373F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f9374G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f9375H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f9376I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f9377J;

    /* renamed from: K, reason: collision with root package name */
    public ArrayList f9378K;

    /* renamed from: L, reason: collision with root package name */
    public ArrayList f9379L;

    /* renamed from: M, reason: collision with root package name */
    public ArrayList f9380M;

    /* renamed from: N, reason: collision with root package name */
    public T f9381N;

    /* renamed from: O, reason: collision with root package name */
    public final RunnableC0714m f9382O;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9384b;

    /* renamed from: e, reason: collision with root package name */
    public ArrayList f9387e;

    /* renamed from: g, reason: collision with root package name */
    public androidx.activity.A f9389g;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f9394m;

    /* renamed from: n, reason: collision with root package name */
    public final V0 f9395n;

    /* renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList f9396o;

    /* renamed from: p, reason: collision with root package name */
    public final F f9397p;

    /* renamed from: q, reason: collision with root package name */
    public final F f9398q;

    /* renamed from: r, reason: collision with root package name */
    public final F f9399r;

    /* renamed from: s, reason: collision with root package name */
    public final F f9400s;

    /* renamed from: t, reason: collision with root package name */
    public final I f9401t;

    /* renamed from: u, reason: collision with root package name */
    public int f9402u;

    /* renamed from: v, reason: collision with root package name */
    public C0726z f9403v;

    /* renamed from: w, reason: collision with root package name */
    public C f9404w;

    /* renamed from: x, reason: collision with root package name */
    public AbstractComponentCallbacksC0722v f9405x;

    /* renamed from: y, reason: collision with root package name */
    public AbstractComponentCallbacksC0722v f9406y;

    /* renamed from: z, reason: collision with root package name */
    public final J f9407z;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9383a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final k1.g f9385c = new k1.g(9);

    /* renamed from: d, reason: collision with root package name */
    public ArrayList f9386d = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final E f9388f = new E(this);

    /* renamed from: h, reason: collision with root package name */
    public C0702a f9390h = null;

    /* renamed from: i, reason: collision with root package name */
    public final H f9391i = new H(this);
    public final AtomicInteger j = new AtomicInteger();

    /* renamed from: k, reason: collision with root package name */
    public final Map f9392k = Collections.synchronizedMap(new HashMap());

    /* renamed from: l, reason: collision with root package name */
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

            /* renamed from: b, reason: collision with root package name */
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
                            break;
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
                            break;
                        }
                        break;
                    default:
                        F.I i8 = (F.I) obj;
                        Q q10 = this.f9325b;
                        if (q10.L()) {
                            q10.s(i8.f2426a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i8 = 1;
        this.f9398q = new O.a(this) { // from class: androidx.fragment.app.F

            /* renamed from: b, reason: collision with root package name */
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
                            break;
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
                            break;
                        }
                        break;
                    default:
                        F.I i82 = (F.I) obj;
                        Q q10 = this.f9325b;
                        if (q10.L()) {
                            q10.s(i82.f2426a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i9 = 2;
        this.f9399r = new O.a(this) { // from class: androidx.fragment.app.F

            /* renamed from: b, reason: collision with root package name */
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
                            break;
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
                            break;
                        }
                        break;
                    default:
                        F.I i82 = (F.I) obj;
                        Q q10 = this.f9325b;
                        if (q10.L()) {
                            q10.s(i82.f2426a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 3;
        this.f9400s = new O.a(this) { // from class: androidx.fragment.app.F

            /* renamed from: b, reason: collision with root package name */
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
                            break;
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
                            break;
                        }
                        break;
                    default:
                        F.I i82 = (F.I) obj;
                        Q q10 = this.f9325b;
                        if (q10.L()) {
                            q10.s(i82.f2426a, false);
                            break;
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
        this.f9382O = new RunnableC0714m(this, 2);
    }

    public static HashSet F(C0702a c0702a) {
        HashSet hashSet = new HashSet();
        for (int i7 = 0; i7 < c0702a.f9431a.size(); i7++) {
            AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = ((W) c0702a.f9431a.get(i7)).f9420b;
            if (abstractComponentCallbacksC0722v != null && c0702a.f9437g) {
                hashSet.add(abstractComponentCallbacksC0722v);
            }
        }
        return hashSet;
    }

    public static boolean K(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v) {
        abstractComponentCallbacksC0722v.getClass();
        Iterator it = abstractComponentCallbacksC0722v.f9515L.f9385c.u().iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v2 = (AbstractComponentCallbacksC0722v) it.next();
            if (abstractComponentCallbacksC0722v2 != null) {
                z4 = K(abstractComponentCallbacksC0722v2);
            }
            if (z4) {
                return true;
            }
        }
        return false;
    }

    public static boolean M(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v) {
        if (abstractComponentCallbacksC0722v == null) {
            return true;
        }
        return abstractComponentCallbacksC0722v.f9523T && (abstractComponentCallbacksC0722v.f9513J == null || M(abstractComponentCallbacksC0722v.f9516M));
    }

    public static boolean N(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v) {
        if (abstractComponentCallbacksC0722v == null) {
            return true;
        }
        Q q7 = abstractComponentCallbacksC0722v.f9513J;
        return abstractComponentCallbacksC0722v.equals(q7.f9406y) && N(q7.f9405x);
    }

    public static void b0(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0722v);
        }
        if (abstractComponentCallbacksC0722v.f9520Q) {
            abstractComponentCallbacksC0722v.f9520Q = false;
            abstractComponentCallbacksC0722v.f9529Z = !abstractComponentCallbacksC0722v.f9529Z;
        }
    }

    public final boolean A(boolean z4) {
        boolean z7;
        z(z4);
        boolean z8 = false;
        while (true) {
            ArrayList arrayList = this.f9378K;
            ArrayList arrayList2 = this.f9379L;
            synchronized (this.f9383a) {
                if (this.f9383a.isEmpty()) {
                    z7 = false;
                } else {
                    try {
                        int size = this.f9383a.size();
                        z7 = false;
                        for (int i7 = 0; i7 < size; i7++) {
                            z7 |= ((N) this.f9383a.get(i7)).a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z7) {
                e0();
                v();
                ((HashMap) this.f9385c.f14675b).values().removeAll(Collections.singleton(null));
                return z8;
            }
            z8 = true;
            this.f9384b = true;
            try {
                T(this.f9378K, this.f9379L);
            } finally {
                d();
            }
        }
    }

    public final void B(ArrayList arrayList, ArrayList arrayList2, int i7, int i8) {
        ArrayList arrayList3;
        k1.g gVar;
        k1.g gVar2;
        k1.g gVar3;
        int i9;
        int i10;
        int i11;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        boolean z4 = ((C0702a) arrayList4.get(i7)).f9444o;
        ArrayList arrayList6 = this.f9380M;
        if (arrayList6 == null) {
            this.f9380M = new ArrayList();
        } else {
            arrayList6.clear();
        }
        ArrayList arrayList7 = this.f9380M;
        k1.g gVar4 = this.f9385c;
        arrayList7.addAll(gVar4.z());
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = this.f9406y;
        int i12 = i7;
        boolean z7 = false;
        while (true) {
            int i13 = 1;
            if (i12 >= i8) {
                k1.g gVar5 = gVar4;
                this.f9380M.clear();
                if (!z4 && this.f9402u >= 1) {
                    for (int i14 = i7; i14 < i8; i14++) {
                        Iterator it = ((C0702a) arrayList.get(i14)).f9431a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v2 = ((W) it.next()).f9420b;
                            if (abstractComponentCallbacksC0722v2 == null || abstractComponentCallbacksC0722v2.f9513J == null) {
                                gVar = gVar5;
                            } else {
                                gVar = gVar5;
                                gVar.G(g(abstractComponentCallbacksC0722v2));
                            }
                            gVar5 = gVar;
                        }
                    }
                }
                for (int i15 = i7; i15 < i8; i15++) {
                    C0702a c0702a = (C0702a) arrayList.get(i15);
                    if (((Boolean) arrayList2.get(i15)).booleanValue()) {
                        c0702a.c(-1);
                        ArrayList arrayList8 = c0702a.f9431a;
                        boolean z8 = true;
                        for (int size = arrayList8.size() - 1; size >= 0; size--) {
                            W w7 = (W) arrayList8.get(size);
                            AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v3 = w7.f9420b;
                            if (abstractComponentCallbacksC0722v3 != null) {
                                if (abstractComponentCallbacksC0722v3.f9528Y != null) {
                                    abstractComponentCallbacksC0722v3.f().f9494a = z8;
                                }
                                int i16 = c0702a.f9436f;
                                int i17 = 8194;
                                int i18 = 4097;
                                if (i16 != 4097) {
                                    if (i16 != 8194) {
                                        i17 = 4100;
                                        i18 = 8197;
                                        if (i16 != 8197) {
                                            if (i16 == 4099) {
                                                i17 = 4099;
                                            } else if (i16 != 4100) {
                                                i17 = 0;
                                            }
                                        }
                                    }
                                    i17 = i18;
                                }
                                if (abstractComponentCallbacksC0722v3.f9528Y != null || i17 != 0) {
                                    abstractComponentCallbacksC0722v3.f();
                                    abstractComponentCallbacksC0722v3.f9528Y.f9499f = i17;
                                }
                                abstractComponentCallbacksC0722v3.f();
                                abstractComponentCallbacksC0722v3.f9528Y.getClass();
                            }
                            int i19 = w7.f9419a;
                            Q q7 = c0702a.f9445p;
                            switch (i19) {
                                case 1:
                                    abstractComponentCallbacksC0722v3.C(w7.f9422d, w7.f9423e, w7.f9424f, w7.f9425g);
                                    z8 = true;
                                    q7.X(abstractComponentCallbacksC0722v3, true);
                                    q7.S(abstractComponentCallbacksC0722v3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + w7.f9419a);
                                case 3:
                                    abstractComponentCallbacksC0722v3.C(w7.f9422d, w7.f9423e, w7.f9424f, w7.f9425g);
                                    q7.a(abstractComponentCallbacksC0722v3);
                                    z8 = true;
                                case 4:
                                    abstractComponentCallbacksC0722v3.C(w7.f9422d, w7.f9423e, w7.f9424f, w7.f9425g);
                                    q7.getClass();
                                    b0(abstractComponentCallbacksC0722v3);
                                    z8 = true;
                                case 5:
                                    abstractComponentCallbacksC0722v3.C(w7.f9422d, w7.f9423e, w7.f9424f, w7.f9425g);
                                    q7.X(abstractComponentCallbacksC0722v3, true);
                                    q7.J(abstractComponentCallbacksC0722v3);
                                    z8 = true;
                                case 6:
                                    abstractComponentCallbacksC0722v3.C(w7.f9422d, w7.f9423e, w7.f9424f, w7.f9425g);
                                    q7.c(abstractComponentCallbacksC0722v3);
                                    z8 = true;
                                case 7:
                                    abstractComponentCallbacksC0722v3.C(w7.f9422d, w7.f9423e, w7.f9424f, w7.f9425g);
                                    q7.X(abstractComponentCallbacksC0722v3, true);
                                    q7.h(abstractComponentCallbacksC0722v3);
                                    z8 = true;
                                case 8:
                                    q7.Z(null);
                                    z8 = true;
                                case 9:
                                    q7.Z(abstractComponentCallbacksC0722v3);
                                    z8 = true;
                                case 10:
                                    q7.Y(abstractComponentCallbacksC0722v3, w7.f9426h);
                                    z8 = true;
                            }
                        }
                    } else {
                        c0702a.c(1);
                        ArrayList arrayList9 = c0702a.f9431a;
                        int size2 = arrayList9.size();
                        int i20 = 0;
                        while (i20 < size2) {
                            W w8 = (W) arrayList9.get(i20);
                            AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v4 = w8.f9420b;
                            if (abstractComponentCallbacksC0722v4 != null) {
                                if (abstractComponentCallbacksC0722v4.f9528Y != null) {
                                    abstractComponentCallbacksC0722v4.f().f9494a = false;
                                }
                                int i21 = c0702a.f9436f;
                                if (abstractComponentCallbacksC0722v4.f9528Y != null || i21 != 0) {
                                    abstractComponentCallbacksC0722v4.f();
                                    abstractComponentCallbacksC0722v4.f9528Y.f9499f = i21;
                                }
                                abstractComponentCallbacksC0722v4.f();
                                abstractComponentCallbacksC0722v4.f9528Y.getClass();
                            }
                            int i22 = w8.f9419a;
                            Q q8 = c0702a.f9445p;
                            switch (i22) {
                                case 1:
                                    arrayList3 = arrayList9;
                                    abstractComponentCallbacksC0722v4.C(w8.f9422d, w8.f9423e, w8.f9424f, w8.f9425g);
                                    q8.X(abstractComponentCallbacksC0722v4, false);
                                    q8.a(abstractComponentCallbacksC0722v4);
                                    i20++;
                                    arrayList9 = arrayList3;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + w8.f9419a);
                                case 3:
                                    arrayList3 = arrayList9;
                                    abstractComponentCallbacksC0722v4.C(w8.f9422d, w8.f9423e, w8.f9424f, w8.f9425g);
                                    q8.S(abstractComponentCallbacksC0722v4);
                                    i20++;
                                    arrayList9 = arrayList3;
                                case 4:
                                    arrayList3 = arrayList9;
                                    abstractComponentCallbacksC0722v4.C(w8.f9422d, w8.f9423e, w8.f9424f, w8.f9425g);
                                    q8.J(abstractComponentCallbacksC0722v4);
                                    i20++;
                                    arrayList9 = arrayList3;
                                case 5:
                                    arrayList3 = arrayList9;
                                    abstractComponentCallbacksC0722v4.C(w8.f9422d, w8.f9423e, w8.f9424f, w8.f9425g);
                                    q8.X(abstractComponentCallbacksC0722v4, false);
                                    b0(abstractComponentCallbacksC0722v4);
                                    i20++;
                                    arrayList9 = arrayList3;
                                case 6:
                                    arrayList3 = arrayList9;
                                    abstractComponentCallbacksC0722v4.C(w8.f9422d, w8.f9423e, w8.f9424f, w8.f9425g);
                                    q8.h(abstractComponentCallbacksC0722v4);
                                    i20++;
                                    arrayList9 = arrayList3;
                                case 7:
                                    arrayList3 = arrayList9;
                                    abstractComponentCallbacksC0722v4.C(w8.f9422d, w8.f9423e, w8.f9424f, w8.f9425g);
                                    q8.X(abstractComponentCallbacksC0722v4, false);
                                    q8.c(abstractComponentCallbacksC0722v4);
                                    i20++;
                                    arrayList9 = arrayList3;
                                case 8:
                                    q8.Z(abstractComponentCallbacksC0722v4);
                                    arrayList3 = arrayList9;
                                    i20++;
                                    arrayList9 = arrayList3;
                                case 9:
                                    q8.Z(null);
                                    arrayList3 = arrayList9;
                                    i20++;
                                    arrayList9 = arrayList3;
                                case 10:
                                    q8.Y(abstractComponentCallbacksC0722v4, w8.f9427i);
                                    arrayList3 = arrayList9;
                                    i20++;
                                    arrayList9 = arrayList3;
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i8 - 1)).booleanValue();
                ArrayList arrayList10 = this.f9394m;
                if (z7 && !arrayList10.isEmpty()) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(F((C0702a) it2.next()));
                    }
                    if (this.f9390h == null) {
                        Iterator it3 = arrayList10.iterator();
                        while (it3.hasNext()) {
                            if (it3.next() != null) {
                                throw new ClassCastException();
                            }
                            Iterator it4 = linkedHashSet.iterator();
                            if (it4.hasNext()) {
                                throw null;
                            }
                        }
                        Iterator it5 = arrayList10.iterator();
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
                for (int i23 = i7; i23 < i8; i23++) {
                    C0702a c0702a2 = (C0702a) arrayList.get(i23);
                    if (booleanValue) {
                        for (int size3 = c0702a2.f9431a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v5 = ((W) c0702a2.f9431a.get(size3)).f9420b;
                            if (abstractComponentCallbacksC0722v5 != null) {
                                g(abstractComponentCallbacksC0722v5).j();
                            }
                        }
                    } else {
                        Iterator it7 = c0702a2.f9431a.iterator();
                        while (it7.hasNext()) {
                            AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v6 = ((W) it7.next()).f9420b;
                            if (abstractComponentCallbacksC0722v6 != null) {
                                g(abstractComponentCallbacksC0722v6).j();
                            }
                        }
                    }
                }
                O(this.f9402u, true);
                int i24 = i7;
                Iterator it8 = f(arrayList, i24, i8).iterator();
                while (it8.hasNext()) {
                    C0713l c0713l = (C0713l) it8.next();
                    c0713l.f9469d = booleanValue;
                    synchronized (c0713l.f9467b) {
                        c0713l.f();
                        ArrayList arrayList11 = c0713l.f9467b;
                        ListIterator listIterator = arrayList11.listIterator(arrayList11.size());
                        if (listIterator.hasPrevious()) {
                            ((a0) listIterator.previous()).getClass();
                            throw null;
                        }
                        c0713l.f9470e = false;
                    }
                    c0713l.c();
                }
                while (i24 < i8) {
                    C0702a c0702a3 = (C0702a) arrayList.get(i24);
                    if (((Boolean) arrayList2.get(i24)).booleanValue() && c0702a3.f9447r >= 0) {
                        c0702a3.f9447r = -1;
                    }
                    c0702a3.getClass();
                    i24++;
                }
                if (z7 && arrayList10.size() > 0) {
                    throw e1.k.c(arrayList10, 0);
                }
                return;
            }
            C0702a c0702a4 = (C0702a) arrayList4.get(i12);
            if (((Boolean) arrayList5.get(i12)).booleanValue()) {
                gVar2 = gVar4;
                int i25 = 1;
                ArrayList arrayList12 = this.f9380M;
                ArrayList arrayList13 = c0702a4.f9431a;
                int size4 = arrayList13.size() - 1;
                while (size4 >= 0) {
                    W w9 = (W) arrayList13.get(size4);
                    int i26 = w9.f9419a;
                    if (i26 != i25) {
                        if (i26 != 3) {
                            switch (i26) {
                                case 8:
                                    abstractComponentCallbacksC0722v = null;
                                    break;
                                case 9:
                                    abstractComponentCallbacksC0722v = w9.f9420b;
                                    break;
                                case 10:
                                    w9.f9427i = w9.f9426h;
                                    break;
                            }
                            size4--;
                            i25 = 1;
                        }
                        arrayList12.add(w9.f9420b);
                        size4--;
                        i25 = 1;
                    }
                    arrayList12.remove(w9.f9420b);
                    size4--;
                    i25 = 1;
                }
            } else {
                ArrayList arrayList14 = this.f9380M;
                int i27 = 0;
                while (true) {
                    ArrayList arrayList15 = c0702a4.f9431a;
                    if (i27 < arrayList15.size()) {
                        W w10 = (W) arrayList15.get(i27);
                        int i28 = w10.f9419a;
                        if (i28 != i13) {
                            if (i28 != 2) {
                                if (i28 == 3 || i28 == 6) {
                                    arrayList14.remove(w10.f9420b);
                                    AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v7 = w10.f9420b;
                                    if (abstractComponentCallbacksC0722v7 == abstractComponentCallbacksC0722v) {
                                        arrayList15.add(i27, new W(9, abstractComponentCallbacksC0722v7));
                                        i27++;
                                        gVar3 = gVar4;
                                        i9 = 1;
                                        abstractComponentCallbacksC0722v = null;
                                    }
                                } else if (i28 == 7) {
                                    gVar3 = gVar4;
                                    i9 = 1;
                                } else if (i28 == 8) {
                                    arrayList15.add(i27, new W(9, abstractComponentCallbacksC0722v, 0));
                                    w10.f9421c = true;
                                    i27++;
                                    abstractComponentCallbacksC0722v = w10.f9420b;
                                }
                                gVar3 = gVar4;
                                i9 = 1;
                            } else {
                                AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v8 = w10.f9420b;
                                int i29 = abstractComponentCallbacksC0722v8.f9518O;
                                int size5 = arrayList14.size() - 1;
                                boolean z9 = false;
                                while (size5 >= 0) {
                                    k1.g gVar6 = gVar4;
                                    AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v9 = (AbstractComponentCallbacksC0722v) arrayList14.get(size5);
                                    if (abstractComponentCallbacksC0722v9.f9518O != i29) {
                                        i10 = i29;
                                    } else if (abstractComponentCallbacksC0722v9 == abstractComponentCallbacksC0722v8) {
                                        i10 = i29;
                                        z9 = true;
                                    } else {
                                        if (abstractComponentCallbacksC0722v9 == abstractComponentCallbacksC0722v) {
                                            i10 = i29;
                                            arrayList15.add(i27, new W(9, abstractComponentCallbacksC0722v9, 0));
                                            i27++;
                                            i11 = 0;
                                            abstractComponentCallbacksC0722v = null;
                                        } else {
                                            i10 = i29;
                                            i11 = 0;
                                        }
                                        W w11 = new W(3, abstractComponentCallbacksC0722v9, i11);
                                        w11.f9422d = w10.f9422d;
                                        w11.f9424f = w10.f9424f;
                                        w11.f9423e = w10.f9423e;
                                        w11.f9425g = w10.f9425g;
                                        arrayList15.add(i27, w11);
                                        arrayList14.remove(abstractComponentCallbacksC0722v9);
                                        i27++;
                                        abstractComponentCallbacksC0722v = abstractComponentCallbacksC0722v;
                                    }
                                    size5--;
                                    i29 = i10;
                                    gVar4 = gVar6;
                                }
                                gVar3 = gVar4;
                                i9 = 1;
                                if (z9) {
                                    arrayList15.remove(i27);
                                    i27--;
                                } else {
                                    w10.f9419a = 1;
                                    w10.f9421c = true;
                                    arrayList14.add(abstractComponentCallbacksC0722v8);
                                }
                            }
                            i27 += i9;
                            i13 = i9;
                            gVar4 = gVar3;
                        } else {
                            gVar3 = gVar4;
                            i9 = i13;
                        }
                        arrayList14.add(w10.f9420b);
                        i27 += i9;
                        i13 = i9;
                        gVar4 = gVar3;
                    } else {
                        gVar2 = gVar4;
                    }
                }
            }
            z7 = z7 || c0702a4.f9437g;
            i12++;
            arrayList4 = arrayList;
            arrayList5 = arrayList2;
            gVar4 = gVar2;
        }
    }

    public final AbstractComponentCallbacksC0722v C(int i7) {
        k1.g gVar = this.f9385c;
        ArrayList arrayList = (ArrayList) gVar.f14674a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = (AbstractComponentCallbacksC0722v) arrayList.get(size);
            if (abstractComponentCallbacksC0722v != null && abstractComponentCallbacksC0722v.f9517N == i7) {
                return abstractComponentCallbacksC0722v;
            }
        }
        for (V v6 : ((HashMap) gVar.f14675b).values()) {
            if (v6 != null) {
                AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v2 = v6.f9416c;
                if (abstractComponentCallbacksC0722v2.f9517N == i7) {
                    return abstractComponentCallbacksC0722v2;
                }
            }
        }
        return null;
    }

    public final AbstractComponentCallbacksC0722v D(String str) {
        k1.g gVar = this.f9385c;
        ArrayList arrayList = (ArrayList) gVar.f14674a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = (AbstractComponentCallbacksC0722v) arrayList.get(size);
            if (abstractComponentCallbacksC0722v != null && str.equals(abstractComponentCallbacksC0722v.f9519P)) {
                return abstractComponentCallbacksC0722v;
            }
        }
        for (V v6 : ((HashMap) gVar.f14675b).values()) {
            if (v6 != null) {
                AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v2 = v6.f9416c;
                if (str.equals(abstractComponentCallbacksC0722v2.f9519P)) {
                    return abstractComponentCallbacksC0722v2;
                }
            }
        }
        return null;
    }

    public final void E() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            C0713l c0713l = (C0713l) it.next();
            if (c0713l.f9470e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0713l.f9470e = false;
                c0713l.c();
            }
        }
    }

    public final ViewGroup G(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v) {
        ViewGroup viewGroup = abstractComponentCallbacksC0722v.f9525V;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0722v.f9518O > 0 && this.f9404w.c()) {
            View b7 = this.f9404w.b(abstractComponentCallbacksC0722v.f9518O);
            if (b7 instanceof ViewGroup) {
                return (ViewGroup) b7;
            }
        }
        return null;
    }

    public final J H() {
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = this.f9405x;
        return abstractComponentCallbacksC0722v != null ? abstractComponentCallbacksC0722v.f9513J.H() : this.f9407z;
    }

    public final K I() {
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = this.f9405x;
        return abstractComponentCallbacksC0722v != null ? abstractComponentCallbacksC0722v.f9513J.I() : this.f9368A;
    }

    public final void J(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0722v);
        }
        if (abstractComponentCallbacksC0722v.f9520Q) {
            return;
        }
        abstractComponentCallbacksC0722v.f9520Q = true;
        abstractComponentCallbacksC0722v.f9529Z = true ^ abstractComponentCallbacksC0722v.f9529Z;
        a0(abstractComponentCallbacksC0722v);
    }

    public final boolean L() {
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = this.f9405x;
        if (abstractComponentCallbacksC0722v == null) {
            return true;
        }
        return abstractComponentCallbacksC0722v.l() && this.f9405x.i().L();
    }

    public final void O(int i7, boolean z4) {
        HashMap hashMap;
        C0726z c0726z;
        if (this.f9403v == null && i7 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z4 || i7 != this.f9402u) {
            this.f9402u = i7;
            k1.g gVar = this.f9385c;
            Iterator it = ((ArrayList) gVar.f14674a).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) gVar.f14675b;
                if (!hasNext) {
                    break;
                }
                V v6 = (V) hashMap.get(((AbstractComponentCallbacksC0722v) it.next()).f9537e);
                if (v6 != null) {
                    v6.j();
                }
            }
            for (V v7 : hashMap.values()) {
                if (v7 != null) {
                    v7.j();
                    AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = v7.f9416c;
                    if (abstractComponentCallbacksC0722v.f9506C && !abstractComponentCallbacksC0722v.n()) {
                        gVar.I(v7);
                    }
                }
            }
            c0();
            if (this.f9373F && (c0726z = this.f9403v) != null && this.f9402u == 7) {
                c0726z.f9555e.invalidateMenu();
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
        for (AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v : this.f9385c.z()) {
            if (abstractComponentCallbacksC0722v != null) {
                abstractComponentCallbacksC0722v.f9515L.P();
            }
        }
    }

    public final boolean Q() {
        A(false);
        z(true);
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = this.f9406y;
        if (abstractComponentCallbacksC0722v != null && abstractComponentCallbacksC0722v.g().Q()) {
            return true;
        }
        boolean R6 = R(this.f9378K, this.f9379L, -1, 0);
        if (R6) {
            this.f9384b = true;
            try {
                T(this.f9378K, this.f9379L);
            } finally {
                d();
            }
        }
        e0();
        v();
        ((HashMap) this.f9385c.f14675b).values().removeAll(Collections.singleton(null));
        return R6;
    }

    public final boolean R(ArrayList arrayList, ArrayList arrayList2, int i7, int i8) {
        boolean z4 = (i8 & 1) != 0;
        int i9 = -1;
        if (!this.f9386d.isEmpty()) {
            if (i7 < 0) {
                i9 = z4 ? 0 : this.f9386d.size() - 1;
            } else {
                int size = this.f9386d.size() - 1;
                while (size >= 0) {
                    C0702a c0702a = (C0702a) this.f9386d.get(size);
                    if (i7 >= 0 && i7 == c0702a.f9447r) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z4) {
                        while (size > 0) {
                            C0702a c0702a2 = (C0702a) this.f9386d.get(size - 1);
                            if (i7 < 0 || i7 != c0702a2.f9447r) {
                                break;
                            }
                            size--;
                        }
                    } else if (size != this.f9386d.size() - 1) {
                        size++;
                    }
                }
                i9 = size;
            }
        }
        if (i9 < 0) {
            return false;
        }
        for (int size2 = this.f9386d.size() - 1; size2 >= i9; size2--) {
            arrayList.add((C0702a) this.f9386d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void S(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0722v + " nesting=" + abstractComponentCallbacksC0722v.f9512I);
        }
        boolean n2 = abstractComponentCallbacksC0722v.n();
        if (abstractComponentCallbacksC0722v.f9521R && n2) {
            return;
        }
        k1.g gVar = this.f9385c;
        synchronized (((ArrayList) gVar.f14674a)) {
            ((ArrayList) gVar.f14674a).remove(abstractComponentCallbacksC0722v);
        }
        abstractComponentCallbacksC0722v.f9505B = false;
        if (K(abstractComponentCallbacksC0722v)) {
            this.f9373F = true;
        }
        abstractComponentCallbacksC0722v.f9506C = true;
        a0(abstractComponentCallbacksC0722v);
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
            if (!((C0702a) arrayList.get(i7)).f9444o) {
                if (i8 != i7) {
                    B(arrayList, arrayList2, i8, i7);
                }
                i8 = i7 + 1;
                if (((Boolean) arrayList2.get(i7)).booleanValue()) {
                    while (i8 < size && ((Boolean) arrayList2.get(i8)).booleanValue() && !((C0702a) arrayList.get(i8)).f9444o) {
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
        V0 v02;
        int i8;
        V v6;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f9403v.f9552b.getClassLoader());
                this.f9393l.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f9403v.f9552b.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        k1.g gVar = this.f9385c;
        HashMap hashMap2 = (HashMap) gVar.f14676c;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        FragmentManagerState fragmentManagerState = (FragmentManagerState) bundle.getParcelable(SentryThread.JsonKeys.STATE);
        if (fragmentManagerState == null) {
            return;
        }
        HashMap hashMap3 = (HashMap) gVar.f14675b;
        hashMap3.clear();
        Iterator it = fragmentManagerState.f9332a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i7 = 2;
            v02 = this.f9395n;
            if (!hasNext) {
                break;
            }
            Bundle Q6 = gVar.Q((String) it.next(), null);
            if (Q6 != null) {
                AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = (AbstractComponentCallbacksC0722v) this.f9381N.f9408d.get(((FragmentState) Q6.getParcelable(SentryThread.JsonKeys.STATE)).f9346b);
                if (abstractComponentCallbacksC0722v != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0722v);
                    }
                    v6 = new V(v02, gVar, abstractComponentCallbacksC0722v, Q6);
                } else {
                    v6 = new V(this.f9395n, this.f9385c, this.f9403v.f9552b.getClassLoader(), H(), Q6);
                }
                AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v2 = v6.f9416c;
                abstractComponentCallbacksC0722v2.f9532b = Q6;
                abstractComponentCallbacksC0722v2.f9513J = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0722v2.f9537e + "): " + abstractComponentCallbacksC0722v2);
                }
                v6.l(this.f9403v.f9552b.getClassLoader());
                gVar.G(v6);
                v6.f9418e = this.f9402u;
            }
        }
        T t7 = this.f9381N;
        t7.getClass();
        Iterator it2 = new ArrayList(t7.f9408d.values()).iterator();
        while (it2.hasNext()) {
            AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v3 = (AbstractComponentCallbacksC0722v) it2.next();
            if (hashMap3.get(abstractComponentCallbacksC0722v3.f9537e) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0722v3 + " that was not found in the set of active Fragments " + fragmentManagerState.f9332a);
                }
                this.f9381N.f(abstractComponentCallbacksC0722v3);
                abstractComponentCallbacksC0722v3.f9513J = this;
                V v7 = new V(v02, gVar, abstractComponentCallbacksC0722v3);
                v7.f9418e = 1;
                v7.j();
                abstractComponentCallbacksC0722v3.f9506C = true;
                v7.j();
            }
        }
        ArrayList<String> arrayList = fragmentManagerState.f9333b;
        ((ArrayList) gVar.f14674a).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                AbstractComponentCallbacksC0722v q7 = gVar.q(str3);
                if (q7 == null) {
                    throw new IllegalStateException(AbstractC0486a1.h("No instantiated fragment for (", str3, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + q7);
                }
                gVar.c(q7);
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
                C0702a c0702a = new C0702a(this);
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
                        Log.v("FragmentManager", "Instantiate " + c0702a + " op #" + i11 + " base fragment #" + iArr[i12]);
                    }
                    w7.f9426h = EnumC0740n.values()[backStackRecordState.f9313c[i11]];
                    w7.f9427i = EnumC0740n.values()[backStackRecordState.f9314d[i11]];
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
                    c0702a.f9432b = i14;
                    c0702a.f9433c = i15;
                    c0702a.f9434d = i17;
                    c0702a.f9435e = i18;
                    c0702a.b(w7);
                    i11++;
                    i7 = 2;
                }
                c0702a.f9436f = backStackRecordState.f9315e;
                c0702a.f9438h = backStackRecordState.f9316f;
                c0702a.f9437g = true;
                c0702a.f9439i = backStackRecordState.f9318y;
                c0702a.j = backStackRecordState.f9319z;
                c0702a.f9440k = backStackRecordState.f9306A;
                c0702a.f9441l = backStackRecordState.f9307B;
                c0702a.f9442m = backStackRecordState.f9308C;
                c0702a.f9443n = backStackRecordState.f9309D;
                c0702a.f9444o = backStackRecordState.f9310E;
                c0702a.f9447r = backStackRecordState.f9317x;
                int i19 = 0;
                while (true) {
                    ArrayList arrayList2 = backStackRecordState.f9312b;
                    if (i19 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i19);
                    if (str4 != null) {
                        ((W) c0702a.f9431a.get(i19)).f9420b = gVar.q(str4);
                    }
                    i19++;
                }
                c0702a.c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    StringBuilder j = AbstractC0486a1.j(i9, "restoreAllState: back stack #", " (index ");
                    j.append(c0702a.f9447r);
                    j.append("): ");
                    j.append(c0702a);
                    Log.v("FragmentManager", j.toString());
                    PrintWriter printWriter = new PrintWriter(new Y());
                    c0702a.f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f9386d.add(c0702a);
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
            AbstractComponentCallbacksC0722v q8 = gVar.q(str5);
            this.f9406y = q8;
            r(q8);
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
        k1.g gVar = this.f9385c;
        gVar.getClass();
        HashMap hashMap = (HashMap) gVar.f14675b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        Iterator it = hashMap.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            V v6 = (V) it.next();
            if (v6 != null) {
                AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = v6.f9416c;
                String str = abstractComponentCallbacksC0722v.f9537e;
                Bundle bundle3 = new Bundle();
                AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v2 = v6.f9416c;
                if (abstractComponentCallbacksC0722v2.f9530a == -1 && (bundle = abstractComponentCallbacksC0722v2.f9532b) != null) {
                    bundle3.putAll(bundle);
                }
                bundle3.putParcelable(SentryThread.JsonKeys.STATE, new FragmentState(abstractComponentCallbacksC0722v2));
                if (abstractComponentCallbacksC0722v2.f9530a > -1) {
                    Bundle bundle4 = new Bundle();
                    abstractComponentCallbacksC0722v2.x(bundle4);
                    if (!bundle4.isEmpty()) {
                        bundle3.putBundle("savedInstanceState", bundle4);
                    }
                    v6.f9414a.J(abstractComponentCallbacksC0722v2, bundle4, false);
                    Bundle bundle5 = new Bundle();
                    abstractComponentCallbacksC0722v2.f9540f0.c(bundle5);
                    if (!bundle5.isEmpty()) {
                        bundle3.putBundle("registryState", bundle5);
                    }
                    Bundle V4 = abstractComponentCallbacksC0722v2.f9515L.V();
                    if (!V4.isEmpty()) {
                        bundle3.putBundle("childFragmentManager", V4);
                    }
                    SparseArray<? extends Parcelable> sparseArray = abstractComponentCallbacksC0722v2.f9534c;
                    if (sparseArray != null) {
                        bundle3.putSparseParcelableArray("viewState", sparseArray);
                    }
                    Bundle bundle6 = abstractComponentCallbacksC0722v2.f9535d;
                    if (bundle6 != null) {
                        bundle3.putBundle("viewRegistryState", bundle6);
                    }
                }
                Bundle bundle7 = abstractComponentCallbacksC0722v2.f9539f;
                if (bundle7 != null) {
                    bundle3.putBundle("arguments", bundle7);
                }
                gVar.Q(str, bundle3);
                arrayList2.add(abstractComponentCallbacksC0722v.f9537e);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0722v + ": " + abstractComponentCallbacksC0722v.f9532b);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.f9385c.f14676c;
        if (!hashMap2.isEmpty()) {
            k1.g gVar2 = this.f9385c;
            synchronized (((ArrayList) gVar2.f14674a)) {
                try {
                    if (((ArrayList) gVar2.f14674a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) gVar2.f14674a).size());
                        Iterator it2 = ((ArrayList) gVar2.f14674a).iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v3 = (AbstractComponentCallbacksC0722v) it2.next();
                            arrayList.add(abstractComponentCallbacksC0722v3.f9537e);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0722v3.f9537e + "): " + abstractComponentCallbacksC0722v3);
                            }
                        }
                    }
                } finally {
                }
            }
            int size = this.f9386d.size();
            if (size > 0) {
                backStackRecordStateArr = new BackStackRecordState[size];
                for (i7 = 0; i7 < size; i7++) {
                    backStackRecordStateArr[i7] = new BackStackRecordState((C0702a) this.f9386d.get(i7));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        StringBuilder j = AbstractC0486a1.j(i7, "saveAllState: adding back stack #", ": ");
                        j.append(this.f9386d.get(i7));
                        Log.v("FragmentManager", j.toString());
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
            AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v4 = this.f9406y;
            if (abstractComponentCallbacksC0722v4 != null) {
                fragmentManagerState.f9336e = abstractComponentCallbacksC0722v4.f9537e;
            }
            arrayList3.addAll(this.f9392k.keySet());
            arrayList4.addAll(this.f9392k.values());
            fragmentManagerState.f9339y = new ArrayList(this.f9372E);
            bundle2.putParcelable(SentryThread.JsonKeys.STATE, fragmentManagerState);
            for (String str2 : this.f9393l.keySet()) {
                bundle2.putBundle(w1.L.i("result_", str2), (Bundle) this.f9393l.get(str2));
            }
            for (String str3 : hashMap2.keySet()) {
                bundle2.putBundle(w1.L.i("fragment_", str3), (Bundle) hashMap2.get(str3));
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

    public final void X(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v, boolean z4) {
        ViewGroup G2 = G(abstractComponentCallbacksC0722v);
        if (G2 == null || !(G2 instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) G2).setDrawDisappearingViewsLast(!z4);
    }

    public final void Y(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v, EnumC0740n enumC0740n) {
        if (abstractComponentCallbacksC0722v.equals(this.f9385c.q(abstractComponentCallbacksC0722v.f9537e)) && (abstractComponentCallbacksC0722v.f9514K == null || abstractComponentCallbacksC0722v.f9513J == this)) {
            abstractComponentCallbacksC0722v.c0 = enumC0740n;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0722v + " is not an active fragment of FragmentManager " + this);
    }

    public final void Z(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v) {
        if (abstractComponentCallbacksC0722v != null) {
            if (!abstractComponentCallbacksC0722v.equals(this.f9385c.q(abstractComponentCallbacksC0722v.f9537e)) || (abstractComponentCallbacksC0722v.f9514K != null && abstractComponentCallbacksC0722v.f9513J != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0722v + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v2 = this.f9406y;
        this.f9406y = abstractComponentCallbacksC0722v;
        r(abstractComponentCallbacksC0722v2);
        r(this.f9406y);
    }

    public final V a(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v) {
        String str = abstractComponentCallbacksC0722v.f9533b0;
        if (str != null) {
            AbstractC1326d.c(abstractComponentCallbacksC0722v, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0722v);
        }
        V g3 = g(abstractComponentCallbacksC0722v);
        abstractComponentCallbacksC0722v.f9513J = this;
        k1.g gVar = this.f9385c;
        gVar.G(g3);
        if (!abstractComponentCallbacksC0722v.f9521R) {
            gVar.c(abstractComponentCallbacksC0722v);
            abstractComponentCallbacksC0722v.f9506C = false;
            abstractComponentCallbacksC0722v.f9529Z = false;
            if (K(abstractComponentCallbacksC0722v)) {
                this.f9373F = true;
            }
        }
        return g3;
    }

    public final void a0(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v) {
        ViewGroup G2 = G(abstractComponentCallbacksC0722v);
        if (G2 != null) {
            C0721u c0721u = abstractComponentCallbacksC0722v.f9528Y;
            if ((c0721u == null ? 0 : c0721u.f9498e) + (c0721u == null ? 0 : c0721u.f9497d) + (c0721u == null ? 0 : c0721u.f9496c) + (c0721u == null ? 0 : c0721u.f9495b) > 0) {
                if (G2.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    G2.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0722v);
                }
                AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v2 = (AbstractComponentCallbacksC0722v) G2.getTag(R.id.visible_removing_fragment_view_tag);
                C0721u c0721u2 = abstractComponentCallbacksC0722v.f9528Y;
                boolean z4 = c0721u2 != null ? c0721u2.f9494a : false;
                if (abstractComponentCallbacksC0722v2.f9528Y == null) {
                    return;
                }
                abstractComponentCallbacksC0722v2.f().f9494a = z4;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(C0726z c0726z, C c3, AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v) {
        if (this.f9403v != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f9403v = c0726z;
        this.f9404w = c3;
        this.f9405x = abstractComponentCallbacksC0722v;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f9396o;
        if (abstractComponentCallbacksC0722v != 0) {
            copyOnWriteArrayList.add(new L(abstractComponentCallbacksC0722v));
        } else if (c0726z != null) {
            copyOnWriteArrayList.add(c0726z);
        }
        if (this.f9405x != null) {
            e0();
        }
        if (c0726z != null) {
            androidx.activity.A onBackPressedDispatcher = c0726z.f9555e.getOnBackPressedDispatcher();
            this.f9389g = onBackPressedDispatcher;
            C0726z c0726z2 = abstractComponentCallbacksC0722v != 0 ? abstractComponentCallbacksC0722v : c0726z;
            onBackPressedDispatcher.getClass();
            H h6 = this.f9391i;
            t6.h.e(h6, "onBackPressedCallback");
            AbstractC0741o lifecycle = c0726z2.getLifecycle();
            if (((C0747v) lifecycle).f9637c != EnumC0740n.f9626a) {
                h6.f9357b.add(new androidx.activity.x(onBackPressedDispatcher, lifecycle, h6));
                onBackPressedDispatcher.c();
                h6.f9358c = new androidx.activity.z(0, onBackPressedDispatcher, androidx.activity.A.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0);
            }
        }
        if (abstractComponentCallbacksC0722v != 0) {
            T t7 = abstractComponentCallbacksC0722v.f9513J.f9381N;
            HashMap hashMap = t7.f9409e;
            T t8 = (T) hashMap.get(abstractComponentCallbacksC0722v.f9537e);
            if (t8 == null) {
                t8 = new T(t7.f9411g);
                hashMap.put(abstractComponentCallbacksC0722v.f9537e, t8);
            }
            this.f9381N = t8;
        } else if (c0726z != null) {
            android.support.v4.media.session.t tVar = new android.support.v4.media.session.t(c0726z.f9555e.getViewModelStore(), T.j);
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
        this.f9385c.f14677d = t9;
        C0726z c0726z3 = this.f9403v;
        if (c0726z3 != null && abstractComponentCallbacksC0722v == 0) {
            G0.f savedStateRegistry = c0726z3.f9555e.getSavedStateRegistry();
            savedStateRegistry.c("android:support:fragments", new C0723w(this, 1));
            Bundle a2 = savedStateRegistry.a("android:support:fragments");
            if (a2 != null) {
                U(a2);
            }
        }
        C0726z c0726z4 = this.f9403v;
        if (c0726z4 != null) {
            AbstractC1062h activityResultRegistry = c0726z4.f9555e.getActivityResultRegistry();
            String i7 = w1.L.i("FragmentManager:", abstractComponentCallbacksC0722v != 0 ? e1.k.i(new StringBuilder(), abstractComponentCallbacksC0722v.f9537e, ":") : "");
            this.f9369B = activityResultRegistry.c(e1.k.e(i7, "StartActivityForResult"), new M(2), new G(this, 1));
            this.f9370C = activityResultRegistry.c(e1.k.e(i7, "StartIntentSenderForResult"), new M(0), new G(this, 2));
            this.f9371D = activityResultRegistry.c(e1.k.e(i7, "RequestPermissions"), new M(1), new G(this, 0));
        }
        C0726z c0726z5 = this.f9403v;
        if (c0726z5 != null) {
            c0726z5.addOnConfigurationChangedListener(this.f9397p);
        }
        C0726z c0726z6 = this.f9403v;
        if (c0726z6 != null) {
            c0726z6.f9555e.addOnTrimMemoryListener(this.f9398q);
        }
        C0726z c0726z7 = this.f9403v;
        if (c0726z7 != null) {
            c0726z7.f9555e.addOnMultiWindowModeChangedListener(this.f9399r);
        }
        C0726z c0726z8 = this.f9403v;
        if (c0726z8 != null) {
            c0726z8.f9555e.addOnPictureInPictureModeChangedListener(this.f9400s);
        }
        C0726z c0726z9 = this.f9403v;
        if (c0726z9 == null || abstractComponentCallbacksC0722v != 0) {
            return;
        }
        c0726z9.f9555e.addMenuProvider(this.f9401t);
    }

    public final void c(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0722v);
        }
        if (abstractComponentCallbacksC0722v.f9521R) {
            abstractComponentCallbacksC0722v.f9521R = false;
            if (abstractComponentCallbacksC0722v.f9505B) {
                return;
            }
            this.f9385c.c(abstractComponentCallbacksC0722v);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0722v);
            }
            if (K(abstractComponentCallbacksC0722v)) {
                this.f9373F = true;
            }
        }
    }

    public final void c0() {
        Iterator it = this.f9385c.t().iterator();
        while (it.hasNext()) {
            V v6 = (V) it.next();
            AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = v6.f9416c;
            if (abstractComponentCallbacksC0722v.f9526W) {
                if (this.f9384b) {
                    this.f9377J = true;
                } else {
                    abstractComponentCallbacksC0722v.f9526W = false;
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
        C0726z c0726z = this.f9403v;
        if (c0726z == null) {
            try {
                w("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e7) {
                Log.e("FragmentManager", "Failed dumping state", e7);
                throw illegalStateException;
            }
        }
        try {
            c0726z.f9555e.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e8) {
            Log.e("FragmentManager", "Failed dumping state", e8);
            throw illegalStateException;
        }
    }

    public final HashSet e() {
        C0713l c0713l;
        HashSet hashSet = new HashSet();
        Iterator it = this.f9385c.t().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((V) it.next()).f9416c.f9525V;
            if (viewGroup != null) {
                t6.h.e(I(), "factory");
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C0713l) {
                    c0713l = (C0713l) tag;
                } else {
                    c0713l = new C0713l(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c0713l);
                }
                hashSet.add(c0713l);
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
                    ?? r22 = h6.f9358c;
                    if (r22 != 0) {
                        r22.invoke();
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
                ?? r02 = h7.f9358c;
                if (r02 != 0) {
                    r02.invoke();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet f(ArrayList arrayList, int i7, int i8) {
        ViewGroup viewGroup;
        C0713l c0713l;
        HashSet hashSet = new HashSet();
        while (i7 < i8) {
            Iterator it = ((C0702a) arrayList.get(i7)).f9431a.iterator();
            while (it.hasNext()) {
                AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = ((W) it.next()).f9420b;
                if (abstractComponentCallbacksC0722v != null && (viewGroup = abstractComponentCallbacksC0722v.f9525V) != null) {
                    t6.h.d(I(), "fragmentManager.specialEffectsControllerFactory");
                    Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                    if (tag instanceof C0713l) {
                        c0713l = (C0713l) tag;
                    } else {
                        c0713l = new C0713l(viewGroup);
                        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0713l);
                    }
                    hashSet.add(c0713l);
                }
            }
            i7++;
        }
        return hashSet;
    }

    public final V g(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v) {
        String str = abstractComponentCallbacksC0722v.f9537e;
        k1.g gVar = this.f9385c;
        V v6 = (V) ((HashMap) gVar.f14675b).get(str);
        if (v6 != null) {
            return v6;
        }
        V v7 = new V(this.f9395n, gVar, abstractComponentCallbacksC0722v);
        v7.l(this.f9403v.f9552b.getClassLoader());
        v7.f9418e = this.f9402u;
        return v7;
    }

    public final void h(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0722v);
        }
        if (abstractComponentCallbacksC0722v.f9521R) {
            return;
        }
        abstractComponentCallbacksC0722v.f9521R = true;
        if (abstractComponentCallbacksC0722v.f9505B) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0722v);
            }
            k1.g gVar = this.f9385c;
            synchronized (((ArrayList) gVar.f14674a)) {
                ((ArrayList) gVar.f14674a).remove(abstractComponentCallbacksC0722v);
            }
            abstractComponentCallbacksC0722v.f9505B = false;
            if (K(abstractComponentCallbacksC0722v)) {
                this.f9373F = true;
            }
            a0(abstractComponentCallbacksC0722v);
        }
    }

    public final void i(boolean z4) {
        if (z4 && this.f9403v != null) {
            d0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v : this.f9385c.z()) {
            if (abstractComponentCallbacksC0722v != null) {
                abstractComponentCallbacksC0722v.f9524U = true;
                if (z4) {
                    abstractComponentCallbacksC0722v.f9515L.i(true);
                }
            }
        }
    }

    public final boolean j() {
        if (this.f9402u < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v : this.f9385c.z()) {
            if (abstractComponentCallbacksC0722v != null) {
                if (!abstractComponentCallbacksC0722v.f9520Q ? abstractComponentCallbacksC0722v.f9515L.j() : false) {
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
        for (AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v : this.f9385c.z()) {
            if (abstractComponentCallbacksC0722v != null && M(abstractComponentCallbacksC0722v)) {
                if (!abstractComponentCallbacksC0722v.f9520Q ? abstractComponentCallbacksC0722v.f9515L.k() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0722v);
                    z4 = true;
                }
            }
        }
        if (this.f9387e != null) {
            for (int i7 = 0; i7 < this.f9387e.size(); i7++) {
                AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v2 = (AbstractComponentCallbacksC0722v) this.f9387e.get(i7);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0722v2)) {
                    abstractComponentCallbacksC0722v2.getClass();
                }
            }
        }
        this.f9387e = arrayList;
        return z4;
    }

    public final void l() {
        boolean z4 = true;
        this.f9376I = true;
        A(true);
        x();
        C0726z c0726z = this.f9403v;
        k1.g gVar = this.f9385c;
        if (c0726z != null) {
            z4 = ((T) gVar.f14677d).f9412h;
        } else {
            A a2 = c0726z.f9552b;
            if (a2 != null) {
                z4 = true ^ a2.isChangingConfigurations();
            }
        }
        if (z4) {
            Iterator it = this.f9392k.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((BackStackState) it.next()).f9320a.iterator();
                while (it2.hasNext()) {
                    ((T) gVar.f14677d).d((String) it2.next(), false);
                }
            }
        }
        u(-1);
        C0726z c0726z2 = this.f9403v;
        if (c0726z2 != null) {
            c0726z2.f9555e.removeOnTrimMemoryListener(this.f9398q);
        }
        C0726z c0726z3 = this.f9403v;
        if (c0726z3 != null) {
            c0726z3.removeOnConfigurationChangedListener(this.f9397p);
        }
        C0726z c0726z4 = this.f9403v;
        if (c0726z4 != null) {
            c0726z4.f9555e.removeOnMultiWindowModeChangedListener(this.f9399r);
        }
        C0726z c0726z5 = this.f9403v;
        if (c0726z5 != null) {
            c0726z5.f9555e.removeOnPictureInPictureModeChangedListener(this.f9400s);
        }
        C0726z c0726z6 = this.f9403v;
        if (c0726z6 != null && this.f9405x == null) {
            c0726z6.f9555e.removeMenuProvider(this.f9401t);
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
        C1059e c1059e = this.f9369B;
        if (c1059e != null) {
            c1059e.b();
            this.f9370C.b();
            this.f9371D.b();
        }
    }

    public final void m(boolean z4) {
        if (z4 && this.f9403v != null) {
            d0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v : this.f9385c.z()) {
            if (abstractComponentCallbacksC0722v != null) {
                abstractComponentCallbacksC0722v.f9524U = true;
                if (z4) {
                    abstractComponentCallbacksC0722v.f9515L.m(true);
                }
            }
        }
    }

    public final void n(boolean z4, boolean z7) {
        if (z7 && this.f9403v != null) {
            d0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v : this.f9385c.z()) {
            if (abstractComponentCallbacksC0722v != null && z7) {
                abstractComponentCallbacksC0722v.f9515L.n(z4, true);
            }
        }
    }

    public final void o() {
        Iterator it = this.f9385c.u().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = (AbstractComponentCallbacksC0722v) it.next();
            if (abstractComponentCallbacksC0722v != null) {
                abstractComponentCallbacksC0722v.m();
                abstractComponentCallbacksC0722v.f9515L.o();
            }
        }
    }

    public final boolean p() {
        if (this.f9402u < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v : this.f9385c.z()) {
            if (abstractComponentCallbacksC0722v != null) {
                if (!abstractComponentCallbacksC0722v.f9520Q ? abstractComponentCallbacksC0722v.f9515L.p() : false) {
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
        for (AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v : this.f9385c.z()) {
            if (abstractComponentCallbacksC0722v != null && !abstractComponentCallbacksC0722v.f9520Q) {
                abstractComponentCallbacksC0722v.f9515L.q();
            }
        }
    }

    public final void r(AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v) {
        if (abstractComponentCallbacksC0722v != null) {
            if (abstractComponentCallbacksC0722v.equals(this.f9385c.q(abstractComponentCallbacksC0722v.f9537e))) {
                abstractComponentCallbacksC0722v.f9513J.getClass();
                boolean N7 = N(abstractComponentCallbacksC0722v);
                Boolean bool = abstractComponentCallbacksC0722v.f9504A;
                if (bool == null || bool.booleanValue() != N7) {
                    abstractComponentCallbacksC0722v.f9504A = Boolean.valueOf(N7);
                    S s7 = abstractComponentCallbacksC0722v.f9515L;
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
        for (AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v : this.f9385c.z()) {
            if (abstractComponentCallbacksC0722v != null && z7) {
                abstractComponentCallbacksC0722v.f9515L.s(z4, true);
            }
        }
    }

    public final boolean t() {
        if (this.f9402u < 1) {
            return false;
        }
        boolean z4 = false;
        for (AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v : this.f9385c.z()) {
            if (abstractComponentCallbacksC0722v != null && M(abstractComponentCallbacksC0722v)) {
                if (!abstractComponentCallbacksC0722v.f9520Q ? abstractComponentCallbacksC0722v.f9515L.t() : false) {
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
        AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = this.f9405x;
        if (abstractComponentCallbacksC0722v != null) {
            sb.append(abstractComponentCallbacksC0722v.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f9405x)));
            sb.append("}");
        } else {
            C0726z c0726z = this.f9403v;
            if (c0726z != null) {
                sb.append(c0726z.getClass().getSimpleName());
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
            for (V v6 : ((HashMap) this.f9385c.f14675b).values()) {
                if (v6 != null) {
                    v6.f9418e = i7;
                }
            }
            O(i7, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((C0713l) it.next()).d();
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
        String e7 = e1.k.e(str, "    ");
        k1.g gVar = this.f9385c;
        gVar.getClass();
        String str2 = str + "    ";
        HashMap hashMap = (HashMap) gVar.f14675b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (V v6 : hashMap.values()) {
                printWriter.print(str);
                if (v6 != null) {
                    AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v = v6.f9416c;
                    printWriter.println(abstractComponentCallbacksC0722v);
                    abstractComponentCallbacksC0722v.e(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) gVar.f14674a;
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i7 = 0; i7 < size2; i7++) {
                AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v2 = (AbstractComponentCallbacksC0722v) arrayList.get(i7);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0722v2.toString());
            }
        }
        ArrayList arrayList2 = this.f9387e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i8 = 0; i8 < size; i8++) {
                AbstractComponentCallbacksC0722v abstractComponentCallbacksC0722v3 = (AbstractComponentCallbacksC0722v) this.f9387e.get(i8);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i8);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0722v3.toString());
            }
        }
        int size3 = this.f9386d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i9 = 0; i9 < size3; i9++) {
                C0702a c0702a = (C0702a) this.f9386d.get(i9);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i9);
                printWriter.print(": ");
                printWriter.println(c0702a.toString());
                c0702a.f(e7, printWriter, true);
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
            ((C0713l) it.next()).d();
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
