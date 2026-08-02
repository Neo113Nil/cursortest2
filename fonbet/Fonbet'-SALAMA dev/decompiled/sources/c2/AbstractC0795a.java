package c2;

import A1.C0022h0;
import A1.R0;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import v2.AbstractC1664a;

/* renamed from: c2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0795a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f10296a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    public final HashSet f10297b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    public final I f10298c = new I();

    /* renamed from: d, reason: collision with root package name */
    public final B1.m f10299d = new B1.m(2, (char) 0);

    /* renamed from: e, reason: collision with root package name */
    public Looper f10300e;

    /* renamed from: f, reason: collision with root package name */
    public R0 f10301f;

    /* renamed from: g, reason: collision with root package name */
    public B1.p f10302g;

    public abstract InterfaceC0794B a(D d7, u2.r rVar, long j);

    public final void b(E e7) {
        HashSet hashSet = this.f10297b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.remove(e7);
        if (isEmpty || !hashSet.isEmpty()) {
            return;
        }
        c();
    }

    public final void d(E e7) {
        this.f10300e.getClass();
        HashSet hashSet = this.f10297b;
        boolean isEmpty = hashSet.isEmpty();
        hashSet.add(e7);
        if (isEmpty) {
            e();
        }
    }

    public R0 f() {
        return null;
    }

    public abstract C0022h0 g();

    public abstract void h();

    public final void i(E e7, u2.U u4, B1.p pVar) {
        Looper myLooper = Looper.myLooper();
        Looper looper = this.f10300e;
        AbstractC1664a.f(looper == null || looper == myLooper);
        this.f10302g = pVar;
        R0 r02 = this.f10301f;
        this.f10296a.add(e7);
        if (this.f10300e == null) {
            this.f10300e = myLooper;
            this.f10297b.add(e7);
            j(u4);
        } else if (r02 != null) {
            d(e7);
            e7.a(this, r02);
        }
    }

    public abstract void j(u2.U u4);

    public final void k(R0 r02) {
        this.f10301f = r02;
        Iterator it = this.f10296a.iterator();
        while (it.hasNext()) {
            ((E) it.next()).a(this, r02);
        }
    }

    public abstract void l(InterfaceC0794B interfaceC0794B);

    public final void m(E e7) {
        ArrayList arrayList = this.f10296a;
        arrayList.remove(e7);
        if (!arrayList.isEmpty()) {
            b(e7);
            return;
        }
        this.f10300e = null;
        this.f10301f = null;
        this.f10302g = null;
        this.f10297b.clear();
        n();
    }

    public abstract void n();

    public final void o(E1.e eVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f10299d.f1016d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            E1.d dVar = (E1.d) it.next();
            if (dVar.f1902a == eVar) {
                copyOnWriteArrayList.remove(dVar);
            }
        }
    }

    public final void p(J j) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f10298c.f10181c;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            H h6 = (H) it.next();
            if (h6.f10178b == j) {
                copyOnWriteArrayList.remove(h6);
            }
        }
    }

    public void c() {
    }

    public void e() {
    }
}
