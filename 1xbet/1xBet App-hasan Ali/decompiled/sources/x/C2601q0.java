package x;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import s0.C2355d;

/* renamed from: x.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2601q0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public long f20853k;

    /* renamed from: l, reason: collision with root package name */
    public int f20854l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ long f20855m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2604s0 f20856n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2601q0(C2604s0 c2604s0, a4.c cVar) {
        super(2, cVar);
        this.f20856n = c2604s0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2601q0 c2601q0 = new C2601q0(this.f20856n, cVar);
        c2601q0.f20855m = ((W0.q) obj).f6024a;
        return c2601q0;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        long j5 = ((W0.q) obj).f6024a;
        C2601q0 c2601q0 = new C2601q0(this.f20856n, (a4.c) obj2);
        c2601q0.f20855m = j5;
        return c2601q0.invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if (r15 == r0) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        long j5;
        long j6;
        long j7;
        long j8;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20854l;
        C2604s0 c2604s0 = this.f20856n;
        if (i == 0) {
            G4.l.N(obj);
            j5 = this.f20855m;
            C2355d c2355d = c2604s0.f;
            this.f20855m = j5;
            this.f20854l = 1;
            obj = c2355d.b(j5, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j8 = this.f20853k;
                    j7 = this.f20855m;
                    G4.l.N(obj);
                    return new W0.q(W0.q.d(j7, W0.q.d(j8, ((W0.q) obj).f6024a)));
                }
                j6 = this.f20853k;
                j5 = this.f20855m;
                G4.l.N(obj);
                long j9 = ((W0.q) obj).f6024a;
                C2355d c2355d2 = c2604s0.f;
                long d5 = W0.q.d(j6, j9);
                this.f20855m = j5;
                this.f20853k = j9;
                this.f20854l = 3;
                obj = c2355d2.a(d5, j9, this);
                if (obj != enumC0510a) {
                    j7 = j5;
                    j8 = j9;
                    return new W0.q(W0.q.d(j7, W0.q.d(j8, ((W0.q) obj).f6024a)));
                }
                return enumC0510a;
            }
            j5 = this.f20855m;
            G4.l.N(obj);
        }
        long d6 = W0.q.d(j5, ((W0.q) obj).f6024a);
        this.f20855m = j5;
        this.f20853k = d6;
        this.f20854l = 2;
        obj = c2604s0.b(d6, this);
        if (obj != enumC0510a) {
            j6 = d6;
            long j92 = ((W0.q) obj).f6024a;
            C2355d c2355d22 = c2604s0.f;
            long d52 = W0.q.d(j6, j92);
            this.f20855m = j5;
            this.f20853k = j92;
            this.f20854l = 3;
            obj = c2355d22.a(d52, j92, this);
            if (obj != enumC0510a) {
            }
        }
        return enumC0510a;
    }
}
