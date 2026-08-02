package b0;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import java.util.concurrent.atomic.AtomicReference;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;
import p4.U;

/* loaded from: classes.dex */
public final class t extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f7178k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f7179l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.m f7180m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f7181n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ AbstractC0548i f7182o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(i4.c cVar, AtomicReference atomicReference, i4.e eVar, a4.c cVar2) {
        super(2, cVar2);
        this.f7180m = (kotlin.jvm.internal.m) cVar;
        this.f7181n = atomicReference;
        this.f7182o = (AbstractC0548i) eVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [c4.i, i4.e] */
    /* JADX WARN: Type inference failed for: r3v0, types: [i4.c, kotlin.jvm.internal.m] */
    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        t tVar = new t(this.f7180m, this.f7181n, this.f7182o, cVar);
        tVar.f7179l = obj;
        return tVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x005d, code lost:
    
        if (r9 == r0) goto L24;
     */
    /* JADX WARN: Type inference failed for: r7v0, types: [i4.c, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r9v11, types: [c4.i, i4.e] */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        s sVar;
        s sVar2;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f7178k;
        AtomicReference atomicReference = this.f7181n;
        try {
            if (i == 0) {
                G4.l.N(obj);
                InterfaceC2280u interfaceC2280u = (InterfaceC2280u) this.f7179l;
                sVar = new s(AbstractC2282w.j(interfaceC2280u.i()), this.f7180m.c(interfaceC2280u));
                s sVar3 = (s) atomicReference.getAndSet(sVar);
                if (sVar3 != null) {
                    U u5 = sVar3.f7176a;
                    this.f7179l = sVar;
                    this.f7178k = 1;
                    u5.d(null);
                    Object h3 = u5.h(this);
                    if (h3 != enumC0510a) {
                        h3 = W3.o.f6046a;
                    }
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar2 = (s) this.f7179l;
                    try {
                        G4.l.N(obj);
                        while (!atomicReference.compareAndSet(sVar2, null) && atomicReference.get() == sVar2) {
                        }
                        return obj;
                    } catch (Throwable th) {
                        th = th;
                        while (!atomicReference.compareAndSet(sVar2, null) && atomicReference.get() == sVar2) {
                        }
                        throw th;
                    }
                }
                sVar = (s) this.f7179l;
                G4.l.N(obj);
            }
            ?? r9 = this.f7182o;
            Object obj2 = sVar.f7177b;
            this.f7179l = sVar;
            this.f7178k = 2;
            obj = r9.invoke(obj2, this);
            if (obj != enumC0510a) {
                sVar2 = sVar;
                while (!atomicReference.compareAndSet(sVar2, null)) {
                }
                return obj;
            }
            return enumC0510a;
        } catch (Throwable th2) {
            th = th2;
            sVar2 = sVar;
            while (!atomicReference.compareAndSet(sVar2, null)) {
            }
            throw th;
        }
    }
}
