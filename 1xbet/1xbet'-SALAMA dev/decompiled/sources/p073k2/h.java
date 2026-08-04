package p073k2;

import R4.c;
import R5.F;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import p068j2.d;
import p068j2.g;
import p068j2.j;
import p151v2.a;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f14766a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f14767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PriorityQueue f14768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g f14769d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f14770e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f14771f;

    public h() {
        for (int i7 = 0; i7 < 10; i7++) {
            this.f14766a.add(new g(1));
        }
        this.f14767b = new ArrayDeque();
        for (int i8 = 0; i8 < 2; i8++) {
            ArrayDeque arrayDeque = this.f14767b;
            F f7 = new F(this, 17);
            d dVar = new d();
            dVar.f14597x = f7;
            arrayDeque.add(dVar);
        }
        this.f14768c = new PriorityQueue();
    }

    @Override // p068j2.g
    public final void a(long j) {
        this.f14770e = j;
    }

    @Override // D1.d
    public final Object c() {
        a.h(this.f14769d == null);
        ArrayDeque arrayDeque = this.f14766a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        g gVar = (g) arrayDeque.pollFirst();
        this.f14769d = gVar;
        return gVar;
    }

    @Override // D1.d
    public final void d(j jVar) {
        a.f(jVar == this.f14769d);
        g gVar = (g) jVar;
        if (gVar.f(Integer.MIN_VALUE)) {
            gVar.t();
            this.f14766a.add(gVar);
        } else {
            long j = this.f14771f;
            this.f14771f = 1 + j;
            gVar.f14765A = j;
            this.f14768c.add(gVar);
        }
        this.f14769d = null;
    }

    public abstract c e();

    public abstract void f(g gVar);

    @Override // D1.d
    public void flush() {
        ArrayDeque arrayDeque;
        this.f14771f = 0L;
        this.f14770e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f14768c;
            boolean zIsEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f14766a;
            if (zIsEmpty) {
                break;
            }
            g gVar = (g) priorityQueue.poll();
            int i7 = t.f17159a;
            gVar.t();
            arrayDeque.add(gVar);
        }
        g gVar2 = this.f14769d;
        if (gVar2 != null) {
            gVar2.t();
            arrayDeque.add(gVar2);
            this.f14769d = null;
        }
    }

    @Override // D1.d
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public d b() {
        ArrayDeque arrayDeque = this.f14767b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.f14768c;
            if (!priorityQueue.isEmpty()) {
                g gVar = (g) priorityQueue.peek();
                int i7 = t.f17159a;
                if (gVar.f1699f > this.f14770e) {
                    break;
                }
                g gVar2 = (g) priorityQueue.poll();
                boolean zF = gVar2.f(4);
                ArrayDeque arrayDeque2 = this.f14766a;
                if (zF) {
                    d dVar = (d) arrayDeque.pollFirst();
                    dVar.b(4);
                    gVar2.t();
                    arrayDeque2.add(gVar2);
                    return dVar;
                }
                f(gVar2);
                if (h()) {
                    c cVarE = e();
                    d dVar2 = (d) arrayDeque.pollFirst();
                    dVar2.y(gVar2.f1699f, cVarE, Long.MAX_VALUE);
                    gVar2.t();
                    arrayDeque2.add(gVar2);
                    return dVar2;
                }
                gVar2.t();
                arrayDeque2.add(gVar2);
            } else {
                break;
            }
        }
        return null;
    }

    public abstract boolean h();

    @Override // D1.d
    public void release() {
    }
}
