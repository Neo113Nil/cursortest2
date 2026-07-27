package K;

import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import w2.InterfaceC1241u;

/* loaded from: classes.dex */
public final class I extends i2.g implements o2.p {

    /* renamed from: e, reason: collision with root package name */
    public int f763e;
    public final /* synthetic */ O f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(O o3, InterfaceC0319c interfaceC0319c) {
        super(2, interfaceC0319c);
        this.f = o3;
    }

    @Override // i2.AbstractC0343b
    public final InterfaceC0319c b(InterfaceC0319c interfaceC0319c, Object obj) {
        return new I(this.f, interfaceC0319c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r6 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
    
        if (r4.h(r5) == r0) goto L22;
     */
    @Override // i2.AbstractC0343b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i3 = this.f763e;
        O o3 = this.f;
        try {
            if (i3 == 0) {
                X0.a.L(obj);
                if (o3.f786h.u() instanceof a0) {
                    return o3.f786h.u();
                }
                this.f763e = 1;
            } else {
                if (i3 != 1) {
                    if (i3 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    X0.a.L(obj);
                    return (j0) obj;
                }
                X0.a.L(obj);
            }
            this.f763e = 2;
            obj = O.e(o3, false, this);
        } catch (Throwable th) {
            return new c0(th, -1);
        }
    }

    @Override // o2.p
    public final Object invoke(Object obj, Object obj2) {
        return ((I) b((InterfaceC0319c) obj2, (InterfaceC1241u) obj)).g(C0279i.f4852a);
    }
}
