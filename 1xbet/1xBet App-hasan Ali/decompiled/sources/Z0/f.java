package Z0;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* loaded from: classes.dex */
public final class f extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f6272k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f6273l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ j f6274m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f6275n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(boolean z3, j jVar, long j5, a4.c cVar) {
        super(2, cVar);
        this.f6273l = z3;
        this.f6274m = jVar;
        this.f6275n = j5;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new f(this.f6273l, this.f6274m, this.f6275n, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        if (r11 == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004a, code lost:
    
        if (r11 == r0) goto L18;
     */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f6272k;
        if (i == 0) {
            G4.l.N(obj);
            j jVar = this.f6274m;
            if (this.f6273l) {
                this.f6272k = 2;
                obj = jVar.f6294k.a(this.f6275n, 0L, this);
            } else {
                this.f6272k = 1;
                obj = jVar.f6294k.a(0L, this.f6275n, this);
            }
            return enumC0510a;
        }
        if (i == 1) {
            G4.l.N(obj);
            ((W0.q) obj).getClass();
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
            ((W0.q) obj).getClass();
        }
        return W3.o.f6046a;
    }
}
