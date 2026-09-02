package C0;

import android.os.HandlerThread;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class j implements g0.i {

    /* renamed from: a, reason: collision with root package name */
    public final int f68a;

    /* renamed from: b, reason: collision with root package name */
    public final int f69b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f70c;

    /* renamed from: d, reason: collision with root package name */
    public final Serializable f71d;

    /* renamed from: e, reason: collision with root package name */
    public final Serializable f72e;

    /* renamed from: f, reason: collision with root package name */
    public final Serializable f73f;

    /* renamed from: g, reason: collision with root package name */
    public final Serializable f74g;

    public j(int i2, int i3) {
        this.f71d = new LinkedList();
        this.f72e = new HashSet();
        this.f73f = new HashSet();
        this.f74g = new HashMap();
        this.f70c = "Sqflite";
        this.f68a = i2;
        this.f69b = i3;
    }

    @Override // g0.i
    public synchronized void b() {
        for (int i2 = 0; i2 < this.f68a; i2++) {
            g0.h hVar = new g0.h(((String) this.f70c) + i2, this.f69b);
            hVar.a(new g0.g(this, hVar));
            ((HashSet) this.f72e).add(hVar);
        }
    }

    @Override // g0.i
    public synchronized void c() {
        try {
            Iterator it = ((HashSet) this.f72e).iterator();
            while (it.hasNext()) {
                g0.h hVar = (g0.h) it.next();
                synchronized (hVar) {
                    HandlerThread handlerThread = hVar.f1096c;
                    if (handlerThread != null) {
                        handlerThread.quit();
                        hVar.f1096c = null;
                        hVar.f1097d = null;
                    }
                }
            }
            Iterator it2 = ((HashSet) this.f73f).iterator();
            while (it2.hasNext()) {
                g0.h hVar2 = (g0.h) it2.next();
                synchronized (hVar2) {
                    HandlerThread handlerThread2 = hVar2.f1096c;
                    if (handlerThread2 != null) {
                        handlerThread2.quit();
                        hVar2.f1096c = null;
                        hVar2.f1097d = null;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // g0.i
    public synchronized void d(g0.f fVar) {
        ((LinkedList) this.f71d).add(fVar);
        Iterator it = new HashSet((HashSet) this.f72e).iterator();
        while (it.hasNext()) {
            f((g0.h) it.next());
        }
    }

    public synchronized g0.f e(g0.h hVar) {
        g0.f fVar;
        g0.h hVar2;
        try {
            ListIterator listIterator = ((LinkedList) this.f71d).listIterator();
            do {
                if (!listIterator.hasNext()) {
                    return null;
                }
                fVar = (g0.f) listIterator.next();
                hVar2 = fVar.a() != null ? (g0.h) ((HashMap) this.f74g).get(fVar.a()) : null;
                if (hVar2 == null) {
                    break;
                }
            } while (hVar2 != hVar);
            listIterator.remove();
            return fVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void f(g0.h hVar) {
        try {
            g0.f e2 = e(hVar);
            if (e2 != null) {
                ((HashSet) this.f73f).add(hVar);
                ((HashSet) this.f72e).remove(hVar);
                if (e2.a() != null) {
                    ((HashMap) this.f74g).put(e2.a(), hVar);
                }
                hVar.f1097d.post(new g0.g(0, hVar, e2));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public j(Integer num, int i2, Boolean bool, Integer num2, int i3, Integer num3, Boolean bool2) {
        this.f70c = num;
        this.f68a = i2;
        this.f73f = bool;
        this.f71d = num2;
        this.f69b = i3;
        this.f72e = num3;
        this.f74g = bool2;
    }
}
