package com.google.android.gms.internal.ads;

import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class ZF {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f12473a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f12474b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final C1872zF f12475c = new C1872zF(new CopyOnWriteArrayList(), null);

    /* renamed from: d, reason: collision with root package name */
    public final C1872zF f12476d = new C1872zF(new CopyOnWriteArrayList(), null);

    /* renamed from: e, reason: collision with root package name */
    public Looper f12477e;
    public AbstractC0715Xa f;

    /* renamed from: g, reason: collision with root package name */
    public ZE f12478g;

    public abstract void a(InterfaceC1558sG interfaceC1558sG);

    public abstract InterfaceC1558sG b(C1603tG c1603tG, C1425pH c1425pH, long j5);

    public abstract Q3 c();

    public final void e(InterfaceC1648uG interfaceC1648uG) {
        HashSet hashSet = this.f12474b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(interfaceC1648uG);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        f();
    }

    public void f() {
    }

    public final void g(InterfaceC1648uG interfaceC1648uG) {
        this.f12477e.getClass();
        HashSet hashSet = this.f12474b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(interfaceC1648uG);
        if (isEmpty) {
            h();
        }
    }

    public void h() {
    }

    public final void i(InterfaceC1648uG interfaceC1648uG, C1514rH c1514rH, ZE ze) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f12477e;
        boolean z3 = true;
        if (looper != null && looper != myLooper) {
            z3 = false;
        }
        AbstractC1668us.S(z3);
        this.f12478g = ze;
        AbstractC0715Xa abstractC0715Xa = this.f;
        this.f12473a.add(interfaceC1648uG);
        if (this.f12477e == null) {
            this.f12477e = myLooper;
            this.f12474b.add(interfaceC1648uG);
            j(c1514rH);
        } else if (abstractC0715Xa != null) {
            g(interfaceC1648uG);
            interfaceC1648uG.a(this, abstractC0715Xa);
        }
    }

    public abstract void j(C1514rH c1514rH);

    public final void k(AbstractC0715Xa abstractC0715Xa) {
        this.f = abstractC0715Xa;
        ArrayList arrayList = this.f12473a;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC1648uG) arrayList.get(i)).a(this, abstractC0715Xa);
        }
    }

    public final void l(InterfaceC1648uG interfaceC1648uG) {
        ArrayList arrayList = this.f12473a;
        arrayList.remove(interfaceC1648uG);
        if (!arrayList.isEmpty()) {
            e(interfaceC1648uG);
            return;
        }
        this.f12477e = null;
        this.f = null;
        this.f12478g = null;
        this.f12474b.clear();
        m();
    }

    public abstract void m();

    public final void n(AF af) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f12476d.f16579b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C1827yF c1827yF = (C1827yF) it.next();
            if (c1827yF.f16425a == af) {
                copyOnWriteArrayList.remove(c1827yF);
            }
        }
    }

    public final void o(InterfaceC1783xG interfaceC1783xG) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f12475c.f16579b;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C1738wG c1738wG = (C1738wG) it.next();
            if (c1738wG.f16107b == interfaceC1783xG) {
                copyOnWriteArrayList.remove(c1738wG);
            }
        }
    }

    public abstract void p(Q3 q32);

    public abstract void r();

    public void d() {
    }

    public void q() {
    }
}
