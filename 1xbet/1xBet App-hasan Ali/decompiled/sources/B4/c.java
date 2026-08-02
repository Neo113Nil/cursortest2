package B4;

import A0.J0;
import j3.i;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.l;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final d f760a;

    /* renamed from: b, reason: collision with root package name */
    public final String f761b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f762c;

    /* renamed from: d, reason: collision with root package name */
    public a f763d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f764e;
    public boolean f;

    public c(d dVar, String str) {
        l.f("taskRunner", dVar);
        l.f("name", str);
        this.f760a = dVar;
        this.f761b = str;
        this.f764e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = z4.b.f21979a;
        synchronized (this.f760a) {
            if (b()) {
                this.f760a.d(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f763d;
        if (aVar != null && aVar.f756b) {
            this.f = true;
        }
        ArrayList arrayList = this.f764e;
        boolean z3 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f756b) {
                a aVar2 = (a) arrayList.get(size);
                i iVar = d.f765h;
                if (d.f766j.isLoggable(Level.FINE)) {
                    N4.b.g(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z3 = true;
            }
        }
        return z3;
    }

    public final void c(a aVar, long j5) {
        l.f("task", aVar);
        synchronized (this.f760a) {
            if (!this.f762c) {
                if (d(aVar, j5, false)) {
                    this.f760a.d(this);
                }
            } else if (aVar.f756b) {
                i iVar = d.f765h;
                if (d.f766j.isLoggable(Level.FINE)) {
                    N4.b.g(aVar, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                i iVar2 = d.f765h;
                if (d.f766j.isLoggable(Level.FINE)) {
                    N4.b.g(aVar, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean d(a aVar, long j5, boolean z3) {
        l.f("task", aVar);
        c cVar = aVar.f757c;
        if (cVar != this) {
            if (cVar != null) {
                throw new IllegalStateException("task is in multiple queues");
            }
            aVar.f757c = this;
        }
        J0 j02 = this.f760a.f767a;
        long nanoTime = System.nanoTime();
        long j6 = nanoTime + j5;
        ArrayList arrayList = this.f764e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.f758d <= j6) {
                i iVar = d.f765h;
                if (d.f766j.isLoggable(Level.FINE)) {
                    N4.b.g(aVar, this, "already scheduled");
                    return false;
                }
            }
            arrayList.remove(indexOf);
        }
        aVar.f758d = j6;
        i iVar2 = d.f765h;
        if (d.f766j.isLoggable(Level.FINE)) {
            N4.b.g(aVar, this, z3 ? "run again after ".concat(N4.b.w(j6 - nanoTime)) : "scheduled after ".concat(N4.b.w(j6 - nanoTime)));
        }
        int size = arrayList.size();
        int i = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i5);
            i5++;
            if (((a) obj).f758d - nanoTime > j5) {
                break;
            }
            i++;
        }
        if (i == -1) {
            i = arrayList.size();
        }
        arrayList.add(i, aVar);
        return i == 0;
    }

    public final void e() {
        byte[] bArr = z4.b.f21979a;
        synchronized (this.f760a) {
            this.f762c = true;
            if (b()) {
                this.f760a.d(this);
            }
        }
    }

    public final String toString() {
        return this.f761b;
    }
}
