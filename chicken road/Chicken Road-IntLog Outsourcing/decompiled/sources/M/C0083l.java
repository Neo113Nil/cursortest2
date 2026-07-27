package M;

import l4.EnumC1260a;
import m4.AbstractC1295c;
import t4.InterfaceC1445p;

/* renamed from: M.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0083l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ L4.a f1718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.q f1719b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.s f1720c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P f1721d;

    public C0083l(L4.a aVar, kotlin.jvm.internal.q qVar, kotlin.jvm.internal.s sVar, P p5) {
        this.f1718a = aVar;
        this.f1719b = qVar;
        this.f1720c = sVar;
        this.f1721d = p5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:46:0x00d9, B:47:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9 A[Catch: all -> 0x00d6, TRY_ENTER, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:46:0x00d9, B:47:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [L4.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C0079h c0079h, AbstractC1295c abstractC1295c) {
        C0082k c0082k;
        int i2;
        P p5;
        L4.d dVar;
        kotlin.jvm.internal.q qVar;
        kotlin.jvm.internal.s sVar;
        InterfaceC1445p interfaceC1445p;
        L4.a aVar;
        L4.a aVar2;
        P p6;
        Object obj;
        kotlin.jvm.internal.s sVar2;
        try {
            if (abstractC1295c instanceof C0082k) {
                c0082k = (C0082k) abstractC1295c;
                int i3 = c0082k.f1716h;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    c0082k.f1716h = i3 - Integer.MIN_VALUE;
                    Object obj2 = c0082k.f1714f;
                    EnumC1260a enumC1260a = EnumC1260a.f11058a;
                    i2 = c0082k.f1716h;
                    if (i2 != 0) {
                        e5.g.y(obj2);
                        c0082k.f1709a = c0079h;
                        L4.a aVar3 = this.f1718a;
                        c0082k.f1710b = aVar3;
                        kotlin.jvm.internal.q qVar2 = this.f1719b;
                        c0082k.f1711c = qVar2;
                        kotlin.jvm.internal.s sVar3 = this.f1720c;
                        c0082k.f1712d = sVar3;
                        p5 = this.f1721d;
                        c0082k.f1713e = p5;
                        c0082k.f1716h = 1;
                        dVar = (L4.d) aVar3;
                        if (dVar.c(c0082k) == enumC1260a) {
                            return enumC1260a;
                        }
                        qVar = qVar2;
                        sVar = sVar3;
                        interfaceC1445p = c0079h;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                obj = c0082k.f1711c;
                                sVar2 = (kotlin.jvm.internal.s) c0082k.f1710b;
                                aVar = (L4.a) c0082k.f1709a;
                                try {
                                    e5.g.y(obj2);
                                    sVar2.f10741a = obj;
                                    sVar = sVar2;
                                    Object obj3 = sVar.f10741a;
                                    ((L4.d) aVar).e(null);
                                    return obj3;
                                } catch (Throwable th) {
                                    th = th;
                                    ((L4.d) aVar).e(null);
                                    throw th;
                                }
                            }
                            p6 = (P) c0082k.f1711c;
                            sVar = (kotlin.jvm.internal.s) c0082k.f1710b;
                            aVar2 = (L4.a) c0082k.f1709a;
                            try {
                                e5.g.y(obj2);
                                if (!kotlin.jvm.internal.i.a(obj2, sVar.f10741a)) {
                                    aVar = aVar2;
                                    Object obj32 = sVar.f10741a;
                                    ((L4.d) aVar).e(null);
                                    return obj32;
                                }
                                c0082k.f1709a = aVar2;
                                c0082k.f1710b = sVar;
                                c0082k.f1711c = obj2;
                                c0082k.f1716h = 3;
                                if (p6.j(obj2, false, c0082k) == enumC1260a) {
                                    return enumC1260a;
                                }
                                obj = obj2;
                                sVar2 = sVar;
                                aVar = aVar2;
                                sVar2.f10741a = obj;
                                sVar = sVar2;
                                Object obj322 = sVar.f10741a;
                                ((L4.d) aVar).e(null);
                                return obj322;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar = aVar2;
                                ((L4.d) aVar).e(null);
                                throw th;
                            }
                        }
                        P p7 = c0082k.f1713e;
                        sVar = c0082k.f1712d;
                        qVar = (kotlin.jvm.internal.q) c0082k.f1711c;
                        ?? r7 = (L4.a) c0082k.f1710b;
                        InterfaceC1445p interfaceC1445p2 = (InterfaceC1445p) c0082k.f1709a;
                        e5.g.y(obj2);
                        dVar = r7;
                        p5 = p7;
                        interfaceC1445p = interfaceC1445p2;
                    }
                    if (!qVar.f10739a) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = sVar.f10741a;
                    c0082k.f1709a = dVar;
                    c0082k.f1710b = sVar;
                    c0082k.f1711c = p5;
                    c0082k.f1712d = null;
                    c0082k.f1713e = null;
                    c0082k.f1716h = 2;
                    Object invoke = interfaceC1445p.invoke(obj4, c0082k);
                    if (invoke == enumC1260a) {
                        return enumC1260a;
                    }
                    aVar2 = dVar;
                    obj2 = invoke;
                    p6 = p5;
                    if (!kotlin.jvm.internal.i.a(obj2, sVar.f10741a)) {
                    }
                }
            }
            if (!qVar.f10739a) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar = dVar;
            ((L4.d) aVar).e(null);
            throw th;
        }
        c0082k = new C0082k(this, abstractC1295c);
        Object obj22 = c0082k.f1714f;
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = c0082k.f1716h;
        if (i2 != 0) {
        }
    }
}
