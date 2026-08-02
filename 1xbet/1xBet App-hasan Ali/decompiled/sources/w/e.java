package w;

import b4.EnumC0510a;
import c4.AbstractC0547h;
import t0.E;
import t0.F;
import t0.s;
import x.Q0;

/* loaded from: classes.dex */
public final class e extends AbstractC0547h implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public int f20459l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f20460m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ F f20461n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(F f, a4.c cVar) {
        super(cVar);
        this.f20461n = f;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        e eVar = new e(this.f20461n, cVar);
        eVar.f20460m = obj;
        return eVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((E) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r8 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if (r8 == r0) goto L15;
     */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        E e3;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20459l;
        if (i == 0) {
            G4.l.N(obj);
            e3 = (E) this.f20460m;
            this.f20460m = e3;
            this.f20459l = 1;
            obj = v1.d.a(e3, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                G4.l.N(obj);
                s sVar = (s) obj;
                if (sVar != null) {
                    sVar.a();
                }
                return W3.o.f6046a;
            }
            e3 = (E) this.f20460m;
            G4.l.N(obj);
        }
        s sVar2 = (s) obj;
        sVar2.a();
        F f = this.f20461n;
        ((m) f.f19446m).f20478a.setValue(new k(sVar2.f19502c));
        this.f20460m = null;
        this.f20459l = 2;
        obj = Q0.d(e3, t0.k.f19490l, this);
    }
}
