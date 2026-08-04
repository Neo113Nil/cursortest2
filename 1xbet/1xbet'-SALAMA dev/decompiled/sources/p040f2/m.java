package p040f2;

import A1.C0045t0;
import A1.X;
import C1.C0095a;
import F1.u;
import F1.v;
import S1.c;
import android.os.Handler;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import p018c2.S;
import p018c2.V;
import p146u2.InterfaceC0951j;
import p146u2.r;
import p151v2.t;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class m implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f12892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V0 f12893b = new V0(1, false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f12894c = new c(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f12895d = -9223372036854775807L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f12896e;

    public m(n nVar, r rVar) {
        this.f12896e = nVar;
        this.f12892a = new V(rVar, null, null);
    }

    @Override // F1.v
    public final void a(X x4) {
        this.f12892a.a(x4);
    }

    @Override // F1.v
    public final void c(int i7, C0095a c0095a) {
        this.f12892a.c(i7, c0095a);
    }

    @Override // F1.v
    public final int d(InterfaceC0951j interfaceC0951j, int i7, boolean z4) {
        return this.f12892a.b(interfaceC0951j, i7, z4);
    }

    @Override // F1.v
    public final void e(long j, int i7, int i8, int i9, u uVar) {
        long jF;
        long jH;
        this.f12892a.e(j, i7, i8, i9, uVar);
        while (this.f12892a.s(false)) {
            c cVar = this.f12894c;
            cVar.t();
            if (this.f12892a.x(this.f12893b, cVar, 0, false) == -4) {
                cVar.A();
            } else {
                cVar = null;
            }
            if (cVar != null) {
                long j3 = cVar.f1699f;
                Metadata metadataN = this.f12896e.f12899c.n(cVar);
                if (metadataN != null) {
                    EventMessage eventMessage = (EventMessage) metadataN.f10562a[0];
                    String str = eventMessage.f10577a;
                    String str2 = eventMessage.f10578b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jH = t.H(t.n(eventMessage.f10581e));
                        } catch (C0045t0 unused) {
                            jH = -9223372036854775807L;
                        }
                        if (jH != -9223372036854775807L) {
                            l lVar = new l(j3, jH);
                            Handler handler = this.f12896e.f12900d;
                            handler.sendMessage(handler.obtainMessage(1, lVar));
                        }
                    }
                }
            }
        }
        V v6 = this.f12892a;
        S s7 = v6.f10268a;
        synchronized (v6) {
            int i10 = v6.f10285s;
            jF = i10 == 0 ? -1L : v6.f(i10);
        }
        s7.b(jF);
    }
}
