package G;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;
import p4.U;

/* loaded from: classes.dex */
public final class m extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f1736k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ U f1737l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ o f1738m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(U u5, o oVar, a4.c cVar) {
        super(2, cVar);
        this.f1737l = u5;
        this.f1738m = oVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new m(this.f1737l, this.f1738m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        ((m) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
        return EnumC0510a.f7289k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        if (p4.AbstractC2282w.f(500, r9) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0040, code lost:
    
        if (r10 == r0) goto L29;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x005e -> B:8:0x0043). Please report as a decompilation issue!!! */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f1736k;
        o oVar = this.f1738m;
        try {
            if (i == 0) {
                G4.l.N(obj);
                U u5 = this.f1737l;
                if (u5 != null) {
                    this.f1736k = 1;
                    u5.d(null);
                    Object h3 = u5.h(this);
                    if (h3 != enumC0510a) {
                        h3 = W3.o.f6046a;
                    }
                }
            } else if (i == 1) {
                G4.l.N(obj);
            } else if (i == 2) {
                G4.l.N(obj);
                oVar.f1742b.i(0.0f);
                this.f1736k = 3;
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                G4.l.N(obj);
            }
            oVar.f1742b.i(1.0f);
            this.f1736k = 2;
            if (AbstractC2282w.f(500L, this) == enumC0510a) {
                return enumC0510a;
            }
            oVar.f1742b.i(0.0f);
            this.f1736k = 3;
        } catch (Throwable th) {
            oVar.f1742b.i(0.0f);
            throw th;
        }
    }
}
