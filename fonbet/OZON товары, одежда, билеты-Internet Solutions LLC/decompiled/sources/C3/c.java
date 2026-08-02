package C3;

import C3.a;
import F3.InterfaceC3018x;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.exoplayer.AbstractC5444f;
import androidx.media3.exoplayer.k0;
import j3.C7272n;
import j3.t;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import m3.N;
import t3.C9730B;

/* loaded from: classes.dex */
public final class c extends AbstractC5444f implements Handler.Callback {

    /* renamed from: A, reason: collision with root package name */
    private t f4381A;

    /* renamed from: B, reason: collision with root package name */
    private long f4382B;

    /* renamed from: s, reason: collision with root package name */
    private final a f4383s;

    /* renamed from: t, reason: collision with root package name */
    private final b f4384t;

    /* renamed from: u, reason: collision with root package name */
    private final Handler f4385u;

    /* renamed from: v, reason: collision with root package name */
    private final W3.a f4386v;

    /* renamed from: w, reason: collision with root package name */
    private W3.b f4387w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f4388x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f4389y;

    /* renamed from: z, reason: collision with root package name */
    private long f4390z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, Looper looper) {
        super(5);
        Handler handler;
        a aVar = a.f4380a;
        this.f4384t = bVar;
        if (looper == null) {
            handler = null;
        } else {
            int i11 = N.f74289a;
            handler = new Handler(looper, this);
        }
        this.f4385u = handler;
        this.f4383s = aVar;
        this.f4386v = new W3.a(1);
        this.f4382B = -9223372036854775807L;
    }

    private void a0(t tVar, ArrayList arrayList) {
        for (int i11 = 0; i11 < tVar.e(); i11++) {
            C7272n c11 = tVar.d(i11).c();
            if (c11 != null) {
                a.C0107a c0107a = (a.C0107a) this.f4383s;
                if (c0107a.b(c11)) {
                    W3.b a11 = c0107a.a(c11);
                    byte[] b11 = tVar.d(i11).b();
                    b11.getClass();
                    W3.a aVar = this.f4386v;
                    aVar.f();
                    aVar.o(b11.length);
                    ByteBuffer byteBuffer = aVar.f98184d;
                    int i12 = N.f74289a;
                    byteBuffer.put(b11);
                    aVar.p();
                    t a12 = a11.a(aVar);
                    if (a12 != null) {
                        a0(a12, arrayList);
                    }
                }
            }
            arrayList.add(tVar.d(i11));
        }
    }

    private long b0(long j11) {
        G10.a.h(j11 != -9223372036854775807L);
        G10.a.h(this.f4382B != -9223372036854775807L);
        return j11 - this.f4382B;
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f
    protected final void O() {
        this.f4381A = null;
        this.f4387w = null;
        this.f4382B = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f
    protected final void Q(long j11, boolean z11) {
        this.f4381A = null;
        this.f4388x = false;
        this.f4389y = false;
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f
    protected final void W(C7272n[] c7272nArr, long j11, long j12, InterfaceC3018x.b bVar) {
        this.f4387w = ((a.C0107a) this.f4383s).a(c7272nArr[0]);
        t tVar = this.f4381A;
        if (tVar != null) {
            this.f4381A = tVar.c((tVar.f69334b + this.f4382B) - j12);
        }
        this.f4382B = j12;
    }

    @Override // androidx.media3.exoplayer.AbstractC5444f, androidx.media3.exoplayer.j0
    public final boolean a() {
        return this.f4389y;
    }

    @Override // androidx.media3.exoplayer.j0
    public final void c(long j11, long j12) {
        boolean z11 = true;
        while (z11) {
            if (!this.f4388x && this.f4381A == null) {
                W3.a aVar = this.f4386v;
                aVar.f();
                C9730B H11 = H();
                int X9 = X(H11, aVar, 0);
                if (X9 == -4) {
                    if (aVar.i()) {
                        this.f4388x = true;
                    } else if (aVar.f98186f >= I()) {
                        aVar.f33226i = this.f4390z;
                        aVar.p();
                        W3.b bVar = this.f4387w;
                        int i11 = N.f74289a;
                        t a11 = bVar.a(aVar);
                        if (a11 != null) {
                            ArrayList arrayList = new ArrayList(a11.e());
                            a0(a11, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.f4381A = new t(b0(aVar.f98186f), (t.a[]) arrayList.toArray(new t.a[0]));
                            }
                        }
                    }
                } else if (X9 == -5) {
                    C7272n c7272n = H11.f98980b;
                    c7272n.getClass();
                    this.f4390z = c7272n.f69132t;
                }
            }
            t tVar = this.f4381A;
            if (tVar == null || tVar.f69334b > b0(j11)) {
                z11 = false;
            } else {
                t tVar2 = this.f4381A;
                Handler handler = this.f4385u;
                if (handler != null) {
                    handler.obtainMessage(1, tVar2).sendToTarget();
                } else {
                    this.f4384t.m(tVar2);
                }
                this.f4381A = null;
                z11 = true;
            }
            if (this.f4388x && this.f4381A == null) {
                this.f4389y = true;
            }
        }
    }

    @Override // androidx.media3.exoplayer.k0
    public final int e(C7272n c7272n) {
        if (((a.C0107a) this.f4383s).b(c7272n)) {
            return k0.g(c7272n.f69111P == 0 ? 4 : 2, 0, 0, 0);
        }
        return k0.g(0, 0, 0, 0);
    }

    @Override // androidx.media3.exoplayer.j0, androidx.media3.exoplayer.k0
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        this.f4384t.m((t) message.obj);
        return true;
    }

    @Override // androidx.media3.exoplayer.j0
    public final boolean isReady() {
        return true;
    }
}
