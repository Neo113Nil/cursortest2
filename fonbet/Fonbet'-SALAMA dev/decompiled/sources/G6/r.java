package G6;

import a.AbstractC0603a;
import b0.C0768p;
import f6.C1116i;
import i6.InterfaceC1287d;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class r implements h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3121a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f3122b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f3123c;

    public r(h hVar, I0.c cVar) {
        this.f3122b = hVar;
        this.f3123c = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b0  */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.lang.Object] */
    @Override // G6.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, InterfaceC1287d interfaceC1287d) {
        q qVar;
        int i7;
        boolean z4;
        Object obj2;
        Object obj3;
        r rVar;
        I0.a aVar;
        int i8;
        X0.c cVar;
        switch (this.f3121a) {
            case 0:
                if (interfaceC1287d instanceof q) {
                    qVar = (q) interfaceC1287d;
                    int i9 = qVar.f3118c;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        qVar.f3118c = i9 - Integer.MIN_VALUE;
                        Object obj4 = qVar.f3117b;
                        j6.a aVar2 = j6.a.f14642a;
                        i7 = qVar.f3118c;
                        z4 = true;
                        if (i7 != 0) {
                            AbstractC0603a.p0(obj4);
                            qVar.f3116a = this;
                            qVar.f3120e = obj;
                            qVar.f3118c = 1;
                            Object invoke = ((C0768p) this.f3123c).invoke(obj, qVar);
                            if (invoke == aVar2) {
                                return aVar2;
                            }
                            obj2 = invoke;
                            obj3 = obj;
                            rVar = this;
                        } else {
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                rVar = qVar.f3116a;
                                AbstractC0603a.p0(obj4);
                                if (z4) {
                                    return C1116i.f13008a;
                                }
                                throw new H6.a(rVar);
                            }
                            Object obj5 = qVar.f3120e;
                            r rVar2 = qVar.f3116a;
                            AbstractC0603a.p0(obj4);
                            obj3 = obj5;
                            rVar = rVar2;
                            obj2 = obj4;
                        }
                        if (((Boolean) obj2).booleanValue()) {
                            z4 = false;
                        } else {
                            h hVar = rVar.f3122b;
                            qVar.f3116a = rVar;
                            qVar.f3120e = null;
                            qVar.f3118c = 2;
                            if (hVar.c(obj3, qVar) == aVar2) {
                                return aVar2;
                            }
                        }
                        if (z4) {
                        }
                    }
                }
                qVar = new q(this, interfaceC1287d);
                Object obj42 = qVar.f3117b;
                j6.a aVar22 = j6.a.f14642a;
                i7 = qVar.f3118c;
                z4 = true;
                if (i7 != 0) {
                }
                if (((Boolean) obj2).booleanValue()) {
                }
                if (z4) {
                }
            default:
                if (interfaceC1287d instanceof I0.a) {
                    aVar = (I0.a) interfaceC1287d;
                    int i10 = aVar.f3486b;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        aVar.f3486b = i10 - Integer.MIN_VALUE;
                        Object obj6 = aVar.f3485a;
                        j6.a aVar3 = j6.a.f14642a;
                        i8 = aVar.f3486b;
                        if (i8 != 0) {
                            AbstractC0603a.p0(obj6);
                            ((I0.c) this.f3123c).getClass();
                            Iterator it = ((X0.l) obj).f7455a.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    cVar = it.next();
                                    if (((X0.c) cVar) != null) {
                                    }
                                } else {
                                    cVar = 0;
                                }
                            }
                            X0.c cVar2 = cVar instanceof X0.c ? cVar : null;
                            if (cVar2 != null) {
                                aVar.f3486b = 1;
                                if (this.f3122b.c(cVar2, aVar) == aVar3) {
                                    return aVar3;
                                }
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC0603a.p0(obj6);
                        }
                        return C1116i.f13008a;
                    }
                }
                aVar = new I0.a(this, interfaceC1287d);
                Object obj62 = aVar.f3485a;
                j6.a aVar32 = j6.a.f14642a;
                i8 = aVar.f3486b;
                if (i8 != 0) {
                }
                return C1116i.f13008a;
        }
    }

    public r(C0768p c0768p, h hVar) {
        this.f3123c = c0768p;
        this.f3122b = hVar;
    }
}
