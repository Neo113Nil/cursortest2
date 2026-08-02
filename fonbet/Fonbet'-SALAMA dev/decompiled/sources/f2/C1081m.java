package f2;

import A1.C0045t0;
import A1.X;
import C1.C0095a;
import F1.u;
import F1.v;
import android.os.Handler;
import c2.S;
import c2.V;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import u2.InterfaceC1633j;
import u2.r;
import v2.t;
import w1.V0;

/* renamed from: f2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1081m implements v {

    /* renamed from: a, reason: collision with root package name */
    public final V f12886a;

    /* renamed from: b, reason: collision with root package name */
    public final V0 f12887b = new V0(1, false);

    /* renamed from: c, reason: collision with root package name */
    public final S1.c f12888c = new S1.c(1);

    /* renamed from: d, reason: collision with root package name */
    public long f12889d = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1082n f12890e;

    public C1081m(C1082n c1082n, r rVar) {
        this.f12890e = c1082n;
        this.f12886a = new V(rVar, null, null);
    }

    @Override // F1.v
    public final void a(X x4) {
        this.f12886a.a(x4);
    }

    @Override // F1.v
    public final void c(int i7, C0095a c0095a) {
        this.f12886a.c(i7, c0095a);
    }

    @Override // F1.v
    public final int d(InterfaceC1633j interfaceC1633j, int i7, boolean z4) {
        return this.f12886a.b(interfaceC1633j, i7, z4);
    }

    @Override // F1.v
    public final void e(long j, int i7, int i8, int i9, u uVar) {
        long f7;
        long j3;
        this.f12886a.e(j, i7, i8, i9, uVar);
        while (this.f12886a.s(false)) {
            S1.c cVar = this.f12888c;
            cVar.t();
            if (this.f12886a.x(this.f12887b, cVar, 0, false) == -4) {
                cVar.A();
            } else {
                cVar = null;
            }
            if (cVar != null) {
                long j7 = cVar.f1699f;
                Metadata n2 = this.f12890e.f12893c.n(cVar);
                if (n2 != null) {
                    EventMessage eventMessage = (EventMessage) n2.f10562a[0];
                    String str = eventMessage.f10577a;
                    String str2 = eventMessage.f10578b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j3 = t.H(t.n(eventMessage.f10581e));
                        } catch (C0045t0 unused) {
                            j3 = -9223372036854775807L;
                        }
                        if (j3 != -9223372036854775807L) {
                            C1080l c1080l = new C1080l(j7, j3);
                            Handler handler = this.f12890e.f12894d;
                            handler.sendMessage(handler.obtainMessage(1, c1080l));
                        }
                    }
                }
            }
        }
        V v6 = this.f12886a;
        S s7 = v6.f10268a;
        synchronized (v6) {
            int i10 = v6.f10285s;
            f7 = i10 == 0 ? -1L : v6.f(i10);
        }
        s7.b(f7);
    }
}
