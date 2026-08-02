package D3;

import C2.ExecutorC2715j;
import D3.q;
import D3.r;
import android.net.Uri;
import j3.C7250F;
import j3.C7251G;
import j3.C7275q;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import m3.AbstractRunnableFutureC8051D;
import m3.N;
import p3.i;
import q3.InterfaceC8980a;
import q3.c;
import q3.i;

/* loaded from: classes8.dex */
public abstract class v<M extends r<M>> implements q {

    /* renamed from: a, reason: collision with root package name */
    public final long f5735a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5736b;

    /* renamed from: c, reason: collision with root package name */
    private final p3.i f5737c;

    /* renamed from: d, reason: collision with root package name */
    private final z3.i f5738d;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayList<C7251G> f5739e;

    /* renamed from: f, reason: collision with root package name */
    private final c.a f5740f;

    /* renamed from: g, reason: collision with root package name */
    private final InterfaceC8980a f5741g;

    /* renamed from: h, reason: collision with root package name */
    private final Pk0.f f5742h;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f5743i;

    /* renamed from: j, reason: collision with root package name */
    private final long f5744j;

    /* renamed from: k, reason: collision with root package name */
    private final ArrayList<AbstractRunnableFutureC8051D<?, ?>> f5745k;

    /* renamed from: l, reason: collision with root package name */
    private volatile boolean f5746l;

    /* JADX INFO: Access modifiers changed from: protected */
    public static abstract class a<M extends r<M>> implements w {

        /* renamed from: a, reason: collision with root package name */
        protected final c.a f5747a;

        /* renamed from: b, reason: collision with root package name */
        protected z3.i f5748b;

        /* renamed from: d, reason: collision with root package name */
        protected long f5750d;

        /* renamed from: c, reason: collision with root package name */
        protected Executor f5749c = new ExecutorC2715j();

        /* renamed from: e, reason: collision with root package name */
        protected long f5751e = -9223372036854775807L;

        public a(c.a aVar, z3.i iVar) {
            this.f5747a = aVar;
            this.f5748b = iVar;
        }

        public final void c(ExecutorService executorService) {
            this.f5749c = executorService;
        }

        public final void d(long j11) {
            this.f5750d = j11;
        }
    }

    private static final class b implements i.a {

        /* renamed from: a, reason: collision with root package name */
        private final q.a f5752a;

        /* renamed from: b, reason: collision with root package name */
        private final long f5753b;

        /* renamed from: c, reason: collision with root package name */
        private final int f5754c;

        /* renamed from: d, reason: collision with root package name */
        private long f5755d;

        /* renamed from: e, reason: collision with root package name */
        private int f5756e;

        public b(q.a aVar, long j11, int i11, long j12, int i12) {
            this.f5752a = aVar;
            this.f5753b = j11;
            this.f5754c = i11;
            this.f5755d = j12;
            this.f5756e = i12;
        }

        private float b() {
            long j11 = this.f5753b;
            if (j11 != -1 && j11 != 0) {
                return N.U(this.f5755d, j11);
            }
            int i11 = this.f5754c;
            if (i11 != 0) {
                return N.U(this.f5756e, i11);
            }
            return -1.0f;
        }

        @Override // q3.i.a
        public final void a(long j11, long j12, long j13) {
            long j14 = this.f5755d + j13;
            this.f5755d = j14;
            this.f5752a.a(this.f5753b, j14, b());
        }

        public final void c() {
            this.f5756e++;
            this.f5752a.a(this.f5753b, this.f5755d, b());
        }
    }

    protected static class c implements Comparable<c> {

        /* renamed from: a, reason: collision with root package name */
        public final long f5757a;

        /* renamed from: b, reason: collision with root package name */
        public final p3.i f5758b;

        public c(long j11, p3.i iVar) {
            this.f5757a = j11;
            this.f5758b = iVar;
        }

        @Override // java.lang.Comparable
        public final int compareTo(c cVar) {
            return Long.compare(this.f5757a, cVar.f5757a);
        }
    }

    private static final class d extends AbstractRunnableFutureC8051D<Void, IOException> {

        /* renamed from: h, reason: collision with root package name */
        public final c f5759h;

        /* renamed from: i, reason: collision with root package name */
        public final q3.c f5760i;

        /* renamed from: j, reason: collision with root package name */
        private final b f5761j;

        /* renamed from: k, reason: collision with root package name */
        public final byte[] f5762k;

        /* renamed from: l, reason: collision with root package name */
        private final q3.i f5763l;

        public d(c cVar, q3.c cVar2, b bVar, byte[] bArr) {
            this.f5759h = cVar;
            this.f5760i = cVar2;
            this.f5761j = bVar;
            this.f5762k = bArr;
            this.f5763l = new q3.i(cVar2, cVar.f5758b, bArr, bVar);
        }

        @Override // m3.AbstractRunnableFutureC8051D
        protected final void d() {
            this.f5763l.b();
        }

        @Override // m3.AbstractRunnableFutureC8051D
        protected final Void e() throws Exception {
            this.f5763l.a();
            b bVar = this.f5761j;
            if (bVar == null) {
                return null;
            }
            bVar.c();
            return null;
        }
    }

    public v(C7275q c7275q, z3.i iVar, c.a aVar, Executor executor, long j11, long j12) {
        C7275q.f fVar = c7275q.f69184b;
        fVar.getClass();
        this.f5737c = d(fVar.f69240a);
        this.f5738d = iVar;
        this.f5739e = new ArrayList<>(fVar.f69243d);
        this.f5740f = aVar;
        this.f5743i = executor;
        this.f5735a = j11;
        this.f5736b = j12;
        InterfaceC8980a e11 = aVar.e();
        e11.getClass();
        this.f5741g = e11;
        this.f5742h = q3.g.f81433j0;
        this.f5745k = new ArrayList<>();
        this.f5744j = N.Q(20000L);
    }

    private <T> void c(AbstractRunnableFutureC8051D<T, ?> abstractRunnableFutureC8051D) throws InterruptedException {
        synchronized (this.f5745k) {
            try {
                if (this.f5746l) {
                    throw new InterruptedException();
                }
                this.f5745k.add(abstractRunnableFutureC8051D);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected static p3.i d(Uri uri) {
        i.a aVar = new i.a();
        aVar.i(uri);
        aVar.b(1);
        return aVar.a();
    }

    private static void g(ArrayList arrayList, Pk0.f fVar, long j11) {
        HashMap hashMap = new HashMap();
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            c cVar = (c) arrayList.get(i12);
            String a11 = fVar.a(cVar.f5758b);
            Integer num = (Integer) hashMap.get(a11);
            c cVar2 = num == null ? null : (c) arrayList.get(num.intValue());
            if (cVar2 != null) {
                long j12 = cVar2.f5757a;
                if (cVar.f5757a <= j12 + j11) {
                    p3.i iVar = cVar2.f5758b;
                    Uri uri = iVar.f80066a;
                    p3.i iVar2 = cVar.f5758b;
                    if (uri.equals(iVar2.f80066a)) {
                        long j13 = iVar.f80072g;
                        if (j13 != -1 && iVar.f80071f + j13 == iVar2.f80071f && Objects.equals(iVar.f80073h, iVar2.f80073h) && iVar.f80074i == iVar2.f80074i && iVar.f80068c == iVar2.f80068c && iVar.f80070e.equals(iVar2.f80070e)) {
                            long j14 = iVar2.f80072g;
                            p3.i d11 = iVar.d(0L, j14 != -1 ? j13 + j14 : -1L);
                            num.getClass();
                            arrayList.set(num.intValue(), new c(j12, d11));
                        }
                    }
                }
            }
            hashMap.put(a11, Integer.valueOf(i11));
            arrayList.set(i11, cVar);
            i11++;
        }
        N.W(arrayList, i11, arrayList.size());
    }

    private void h(int i11) {
        synchronized (this.f5745k) {
            this.f5745k.remove(i11);
        }
    }

    private void i(AbstractRunnableFutureC8051D<?, ?> abstractRunnableFutureC8051D) {
        synchronized (this.f5745k) {
            this.f5745k.remove(abstractRunnableFutureC8051D);
        }
    }

    @Override // D3.q
    public final void a(q.a aVar) throws IOException, InterruptedException {
        q3.c b11;
        byte[] bArr;
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayDeque arrayDeque2 = new ArrayDeque();
        try {
            q3.c b12 = this.f5740f.b();
            r e11 = e(b12, this.f5737c, false);
            if (!this.f5739e.isEmpty()) {
                e11 = (r) e11.a(this.f5739e);
            }
            ArrayList f7 = f(b12, e11, false);
            Collections.sort(f7);
            g(f7, this.f5742h, this.f5744j);
            int size = f7.size();
            int i11 = 0;
            long j11 = 0;
            long j12 = 0;
            for (int size2 = f7.size() - 1; size2 >= 0; size2--) {
                p3.i iVar = ((c) f7.get(size2)).f5758b;
                String a11 = this.f5742h.a(iVar);
                long j13 = iVar.f80072g;
                if (j13 == -1) {
                    long c11 = this.f5741g.a(a11).c();
                    if (c11 != -1) {
                        j13 = c11 - iVar.f80071f;
                    }
                }
                long j14 = j13;
                long c12 = this.f5741g.c(a11, iVar.f80071f, j14);
                j12 += c12;
                if (j14 != -1) {
                    if (j14 == c12) {
                        i11++;
                        f7.remove(size2);
                    }
                    if (j11 != -1) {
                        j11 += j14;
                    }
                } else {
                    j11 = -1;
                }
            }
            b bVar = new b(aVar, j11, size, j12, i11);
            arrayDeque.addAll(f7);
            while (!this.f5746l && !arrayDeque.isEmpty()) {
                if (arrayDeque2.isEmpty()) {
                    b11 = this.f5740f.b();
                    bArr = new byte[131072];
                } else {
                    d dVar = (d) arrayDeque2.removeFirst();
                    b11 = dVar.f5760i;
                    bArr = dVar.f5762k;
                }
                d dVar2 = new d((c) arrayDeque.removeFirst(), b11, bVar, bArr);
                c(dVar2);
                this.f5743i.execute(dVar2);
                for (int size3 = this.f5745k.size() - 1; size3 >= 0; size3--) {
                    d dVar3 = (d) this.f5745k.get(size3);
                    if (arrayDeque.isEmpty() || dVar3.isDone()) {
                        try {
                            dVar3.get();
                            h(size3);
                            arrayDeque2.addLast(dVar3);
                        } catch (ExecutionException e12) {
                            Throwable cause = e12.getCause();
                            cause.getClass();
                            if (!(cause instanceof C7250F)) {
                                if (!(cause instanceof IOException)) {
                                    throw cause;
                                }
                                throw ((IOException) cause);
                            }
                            arrayDeque.addFirst(dVar3.f5759h);
                            h(size3);
                            arrayDeque2.addLast(dVar3);
                        }
                    }
                }
                dVar2.c();
            }
            for (int i12 = 0; i12 < this.f5745k.size(); i12++) {
                this.f5745k.get(i12).cancel(true);
            }
            for (int size4 = this.f5745k.size() - 1; size4 >= 0; size4--) {
                this.f5745k.get(size4).b();
                h(size4);
            }
        } catch (Throwable th2) {
            for (int i13 = 0; i13 < this.f5745k.size(); i13++) {
                this.f5745k.get(i13).cancel(true);
            }
            for (int size5 = this.f5745k.size() - 1; size5 >= 0; size5--) {
                this.f5745k.get(size5).b();
                h(size5);
            }
            throw th2;
        }
    }

    @Override // D3.q
    public final void cancel() {
        synchronized (this.f5745k) {
            try {
                this.f5746l = true;
                for (int i11 = 0; i11 < this.f5745k.size(); i11++) {
                    this.f5745k.get(i11).cancel(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected final r e(q3.c cVar, p3.i iVar, boolean z11) throws InterruptedException, IOException {
        r<Object> rVar;
        u uVar = new u(this, cVar, iVar);
        if (!z11) {
            while (!this.f5746l) {
                c(uVar);
                this.f5743i.execute(uVar);
                try {
                    rVar = uVar.get();
                } catch (ExecutionException e11) {
                    Throwable cause = e11.getCause();
                    cause.getClass();
                    if (!(cause instanceof C7250F)) {
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        int i11 = N.f74289a;
                        throw e11;
                    }
                } finally {
                    uVar.b();
                    i(uVar);
                }
            }
            throw new InterruptedException();
        }
        uVar.run();
        try {
            rVar = uVar.get();
        } catch (ExecutionException e12) {
            Throwable cause2 = e12.getCause();
            cause2.getClass();
            if (cause2 instanceof IOException) {
                throw ((IOException) cause2);
            }
            int i12 = N.f74289a;
            throw e12;
        }
        return rVar;
    }

    protected abstract ArrayList f(q3.c cVar, r rVar, boolean z11) throws IOException, InterruptedException;

    @Override // D3.q
    public final void remove() {
        Pk0.f fVar = this.f5742h;
        InterfaceC8980a interfaceC8980a = this.f5741g;
        p3.i iVar = this.f5737c;
        q3.c c11 = this.f5740f.c();
        try {
            try {
                ArrayList f7 = f(c11, e(c11, iVar, true), true);
                for (int i11 = 0; i11 < f7.size(); i11++) {
                    interfaceC8980a.b(fVar.a(((c) f7.get(i11)).f5758b));
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception unused2) {
            }
        } finally {
            interfaceC8980a.b(fVar.a(iVar));
        }
    }
}
