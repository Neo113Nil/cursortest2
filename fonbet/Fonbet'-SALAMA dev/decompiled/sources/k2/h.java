package k2;

import R5.F;
import j2.C1307d;
import j2.C1313j;
import j2.InterfaceC1310g;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import v2.AbstractC1664a;
import v2.t;

/* loaded from: classes.dex */
public abstract class h implements InterfaceC1310g {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f14760a = new ArrayDeque();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f14761b;

    /* renamed from: c, reason: collision with root package name */
    public final PriorityQueue f14762c;

    /* renamed from: d, reason: collision with root package name */
    public g f14763d;

    /* renamed from: e, reason: collision with root package name */
    public long f14764e;

    /* renamed from: f, reason: collision with root package name */
    public long f14765f;

    public h() {
        for (int i7 = 0; i7 < 10; i7++) {
            this.f14760a.add(new g(1));
        }
        this.f14761b = new ArrayDeque();
        for (int i8 = 0; i8 < 2; i8++) {
            ArrayDeque arrayDeque = this.f14761b;
            F f7 = new F(this, 17);
            C1307d c1307d = new C1307d();
            c1307d.f14591x = f7;
            arrayDeque.add(c1307d);
        }
        this.f14762c = new PriorityQueue();
    }

    @Override // j2.InterfaceC1310g
    public final void a(long j) {
        this.f14764e = j;
    }

    @Override // D1.d
    public final Object c() {
        AbstractC1664a.h(this.f14763d == null);
        ArrayDeque arrayDeque = this.f14760a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        g gVar = (g) arrayDeque.pollFirst();
        this.f14763d = gVar;
        return gVar;
    }

    @Override // D1.d
    public final void d(C1313j c1313j) {
        AbstractC1664a.f(c1313j == this.f14763d);
        g gVar = (g) c1313j;
        if (gVar.f(Integer.MIN_VALUE)) {
            gVar.t();
            this.f14760a.add(gVar);
        } else {
            long j = this.f14765f;
            this.f14765f = 1 + j;
            gVar.f14759A = j;
            this.f14762c.add(gVar);
        }
        this.f14763d = null;
    }

    public abstract R4.c e();

    public abstract void f(g gVar);

    @Override // D1.d
    public void flush() {
        ArrayDeque arrayDeque;
        this.f14765f = 0L;
        this.f14764e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.f14762c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.f14760a;
            if (isEmpty) {
                break;
            }
            g gVar = (g) priorityQueue.poll();
            int i7 = t.f17153a;
            gVar.t();
            arrayDeque.add(gVar);
        }
        g gVar2 = this.f14763d;
        if (gVar2 != null) {
            gVar2.t();
            arrayDeque.add(gVar2);
            this.f14763d = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
    
        return null;
     */
    @Override // D1.d
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1307d b() {
        ArrayDeque arrayDeque = this.f14761b;
        if (!arrayDeque.isEmpty()) {
            while (true) {
                PriorityQueue priorityQueue = this.f14762c;
                if (!priorityQueue.isEmpty()) {
                    g gVar = (g) priorityQueue.peek();
                    int i7 = t.f17153a;
                    if (gVar.f1699f > this.f14764e) {
                        break;
                    }
                    g gVar2 = (g) priorityQueue.poll();
                    boolean f7 = gVar2.f(4);
                    ArrayDeque arrayDeque2 = this.f14760a;
                    if (f7) {
                        C1307d c1307d = (C1307d) arrayDeque.pollFirst();
                        c1307d.b(4);
                        gVar2.t();
                        arrayDeque2.add(gVar2);
                        return c1307d;
                    }
                    f(gVar2);
                    if (h()) {
                        R4.c e7 = e();
                        C1307d c1307d2 = (C1307d) arrayDeque.pollFirst();
                        c1307d2.y(gVar2.f1699f, e7, Long.MAX_VALUE);
                        gVar2.t();
                        arrayDeque2.add(gVar2);
                        return c1307d2;
                    }
                    gVar2.t();
                    arrayDeque2.add(gVar2);
                } else {
                    break;
                }
            }
        } else {
            return null;
        }
    }

    public abstract boolean h();

    @Override // D1.d
    public void release() {
    }
}
