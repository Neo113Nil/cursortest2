package w2;

import G4.l;
import L4.C0223f;
import W3.o;
import c4.AbstractC0548i;
import java.io.IOException;
import p4.InterfaceC2280u;

/* renamed from: w2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2547e extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C2548f f20506k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2547e(C2548f c2548f, a4.c cVar) {
        super(2, cVar);
        this.f20506k = c2548f;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C2547e(this.f20506k, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2547e) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        l.N(obj);
        C2548f c2548f = this.f20506k;
        synchronized (c2548f) {
            if (!c2548f.f20519v || c2548f.f20520w) {
                return o.f6046a;
            }
            try {
                c2548f.r();
            } catch (IOException unused) {
                c2548f.f20521x = true;
            }
            try {
                if (c2548f.f20516s >= 2000) {
                    c2548f.t();
                }
            } catch (IOException unused2) {
                c2548f.f20522y = true;
                c2548f.f20517t = N4.b.j(new C0223f());
            }
            return o.f6046a;
        }
    }
}
