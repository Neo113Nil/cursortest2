package p018c2;

import A1.C0022h0;
import A1.R0;
import B1.m;
import B1.p;
import E1.d;
import E1.e;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p146u2.U;
import p146u2.r;
import p151v2.a;

/* JADX INFO: renamed from: c2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0755a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f10296a = new ArrayList(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f10297b = new HashSet(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I f10298c = new I();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f10299d = new m(2, (char) 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Looper f10300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public R0 f10301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public p f10302g;

    public abstract B a(D d7, r rVar, long j);

    public final void b(E e7) {
        HashSet hashSet = this.f10297b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.remove(e7);
        if (zIsEmpty || !hashSet.isEmpty()) {
            return;
        }
        c();
    }

    public final void d(E e7) {
        this.f10300e.getClass();
        HashSet hashSet = this.f10297b;
        boolean zIsEmpty = hashSet.isEmpty();
        hashSet.add(e7);
        if (zIsEmpty) {
            e();
        }
    }

    public R0 f() {
        return null;
    }

    public abstract C0022h0 g();

    public abstract void h();

    public final void i(E e7, U u4, p pVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f10300e;
        a.f(looper == null || looper == looperMyLooper);
        this.f10302g = pVar;
        R0 r7 = this.f10301f;
        this.f10296a.add(e7);
        if (this.f10300e == null) {
            this.f10300e = looperMyLooper;
            this.f10297b.add(e7);
            j(u4);
        } else if (r7 != null) {
            d(e7);
            e7.a(this, r7);
        }
    }

    public abstract void j(U u4);

    public final void k(R0 r7) {
        this.f10301f = r7;
        Iterator it = this.f10296a.iterator();
        while (it.hasNext()) {
            ((E) it.next()).a(this, r7);
        }
    }

    public abstract void l(B b7);

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

    public final void o(e eVar) {
        CopyOnWriteArrayList<d> copyOnWriteArrayList = (CopyOnWriteArrayList) this.f10299d.f1016d;
        for (d dVar : copyOnWriteArrayList) {
            if (dVar.f1902a == eVar) {
                copyOnWriteArrayList.remove(dVar);
            }
        }
    }

    public final void p(J j) {
        CopyOnWriteArrayList<H> copyOnWriteArrayList = this.f10298c.f10181c;
        for (H h6 : copyOnWriteArrayList) {
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
