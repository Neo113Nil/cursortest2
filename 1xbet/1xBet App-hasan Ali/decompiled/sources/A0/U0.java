package A0;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import java.util.concurrent.CancellationException;
import p4.InterfaceC2280u;
import r.C2322H;

/* loaded from: classes.dex */
public final class U0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public r4.p f395k;

    /* renamed from: l, reason: collision with root package name */
    public r4.b f396l;

    /* renamed from: m, reason: collision with root package name */
    public int f397m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ r4.c f398n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U0(r4.c cVar, a4.c cVar2) {
        super(2, cVar2);
        this.f398n = cVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new U0(this.f398n, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((U0) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0033 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c A[Catch: all -> 0x0012, TryCatch #0 {all -> 0x0012, blocks: (B:6:0x000e, B:7:0x0034, B:9:0x003c, B:10:0x004a, B:17:0x005b, B:19:0x0027, B:23:0x005e, B:26:0x0062, B:27:0x0063, B:34:0x0021, B:12:0x004b, B:14:0x0051), top: B:2:0x0006, inners: #1 }] */
    /* JADX WARN: Type inference failed for: r4v4, types: [r4.p] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0031 -> B:7:0x0034). Please report as a decompilation issue!!! */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r4.c cVar;
        r4.b bVar;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f397m;
        try {
            if (i == 0) {
                G4.l.N(obj);
                cVar = this.f398n;
                bVar = new r4.b(cVar);
                this.f395k = cVar;
                this.f396l = bVar;
                this.f397m = 1;
                obj = bVar.a(this);
                cVar = cVar;
                if (obj == enumC0510a) {
                }
                if (((Boolean) obj).booleanValue()) {
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = this.f396l;
                ?? r42 = this.f395k;
                G4.l.N(obj);
                cVar = r42;
                if (((Boolean) obj).booleanValue()) {
                    boolean z3 = false;
                    V0.f400b.set(false);
                    synchronized (Z.l.f6208c) {
                        C2322H c2322h = Z.l.f6213j.f6178h;
                        if (c2322h != null && c2322h.h()) {
                            z3 = true;
                        }
                    }
                    if (z3) {
                        Z.l.a();
                    }
                    this.f395k = cVar;
                    this.f396l = bVar;
                    this.f397m = 1;
                    obj = bVar.a(this);
                    cVar = cVar;
                    if (obj == enumC0510a) {
                        return enumC0510a;
                    }
                    if (((Boolean) obj).booleanValue()) {
                        cVar.d(null);
                        return W3.o.f6046a;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CancellationException cancellationException = th instanceof CancellationException ? th : null;
                if (cancellationException == null) {
                    cancellationException = new CancellationException("Channel was consumed, consumer had failed");
                    cancellationException.initCause(th);
                }
                cVar.d(cancellationException);
                throw th2;
            }
        }
    }
}
