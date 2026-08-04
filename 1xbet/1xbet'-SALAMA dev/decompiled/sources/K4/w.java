package K4;

import A1.C0043s0;
import A1.C0050y;
import G4.C0279l;
import U5.k0;
import U5.l0;
import Y4.M0;
import Y4.O0;
import com.google.protobuf.C0865j;
import java.util.ArrayDeque;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0043s0 f4071a;

    public w(C0043s0 c0043s0) {
        this.f4071a = c0043s0;
    }

    @Override // K4.y
    public final void a() {
        H h6 = (H) this.f4071a.j;
        p113p3.f.O("Writing handshake requires an opened stream", h6.c(), new Object[0]);
        p113p3.f.O("Handshake already completed", !h6.f3987s, new Object[0]);
        M0 m0Z = O0.z();
        String str = (String) h6.f3986r.f17515c;
        m0Z.d();
        O0.v((O0) m0Z.f12096b, str);
        h6.i((O0) m0Z.b());
    }

    @Override // K4.y
    public final void b(l0 l0Var) {
        C0043s0 c0043s0 = this.f4071a;
        c0043s0.getClass();
        if (l0Var.e()) {
            p113p3.f.O("Write stream was stopped gracefully while still needed.", !c0043s0.o(), new Object[0]);
        }
        boolean zE = l0Var.e();
        H h6 = (H) c0043s0.j;
        if (!zE) {
            ArrayDeque arrayDeque = (ArrayDeque) c0043s0.f561l;
            if (!arrayDeque.isEmpty()) {
                boolean z4 = h6.f3987s;
                k0 k0Var = l0Var.f6547a;
                if (z4) {
                    p113p3.f.O("Handling write error with status OK.", true ^ l0Var.e(), new Object[0]);
                    HashSet hashSet = j.f4023d;
                    if (j.a((B4.H) B4.H.f1087D.get(k0Var.f6531a, B4.H.UNKNOWN)) && !k0Var.equals(k0.ABORTED)) {
                        I4.i iVar = (I4.i) arrayDeque.poll();
                        h6.b();
                        int i7 = iVar.f3673a;
                        E4.H hE = ((E4.z) ((p033e3.h) c0043s0.f554d).f12673a).e();
                        hE.a("handleRejectedWrite");
                        C0279l c0279l = hE.f2111a;
                        p075k4.c cVar = (p075k4.c) c0279l.f2991a.G("Reject batch", new C0050y(c0279l, i7));
                        if (!cVar.isEmpty()) {
                            E4.H.e(l0Var, "Write failed at %s", ((H4.h) cVar.z()).f3318a);
                        }
                        hE.f(i7, l0Var);
                        hE.j(i7);
                        hE.b(cVar, null);
                        c0043s0.f();
                    }
                } else {
                    p113p3.f.O("Handling write error with status OK.", !l0Var.e(), new Object[0]);
                    HashSet hashSet2 = j.f4023d;
                    if (j.a((B4.H) B4.H.f1087D.get(k0Var.f6531a, B4.H.UNKNOWN))) {
                        Q0.a.v(1, "RemoteStore", "RemoteStore error before completed handshake; resetting stream token %s: %s", L4.r.i(h6.f3988t), l0Var);
                        C0865j c0865j = H.f3985u;
                        c0865j.getClass();
                        h6.f3988t = c0865j;
                        C0279l c0279l2 = (C0279l) c0043s0.f555e;
                        c0279l2.f2991a.H(new A0.f(14, c0279l2, c0865j), "Set stream token");
                    }
                }
            }
        }
        if (c0043s0.o()) {
            p113p3.f.O("startWriteStream() called when shouldStartWriteStream() is false.", c0043s0.o(), new Object[0]);
            h6.g();
        }
    }
}
