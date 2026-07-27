package K;

import h2.EnumC0326a;
import i2.AbstractC0343b;

/* renamed from: K.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0044l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E2.a f871a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.o f872b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.q f873c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f874d;

    public C0044l(E2.a aVar, kotlin.jvm.internal.o oVar, kotlin.jvm.internal.q qVar, O o3) {
        this.f871a = aVar;
        this.f872b = oVar;
        this.f873c = qVar;
        this.f874d = o3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d9, B:46:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9 A[Catch: all -> 0x00d6, TRY_ENTER, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d9, B:46:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [E2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C0040h c0040h, AbstractC0343b abstractC0343b) {
        C0043k c0043k;
        int i3;
        O o3;
        E2.d dVar;
        kotlin.jvm.internal.o oVar;
        kotlin.jvm.internal.q qVar;
        o2.p pVar;
        E2.a aVar;
        E2.a aVar2;
        O o4;
        Object obj;
        kotlin.jvm.internal.q qVar2;
        try {
            if (abstractC0343b instanceof C0043k) {
                c0043k = (C0043k) abstractC0343b;
                int i4 = c0043k.f869k;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    c0043k.f869k = i4 - Integer.MIN_VALUE;
                    Object obj2 = c0043k.f867i;
                    EnumC0326a enumC0326a = EnumC0326a.f4994a;
                    i3 = c0043k.f869k;
                    if (i3 != 0) {
                        X0.a.L(obj2);
                        c0043k.f863d = c0040h;
                        E2.a aVar3 = this.f871a;
                        c0043k.f864e = aVar3;
                        kotlin.jvm.internal.o oVar2 = this.f872b;
                        c0043k.f = oVar2;
                        kotlin.jvm.internal.q qVar3 = this.f873c;
                        c0043k.f865g = qVar3;
                        o3 = this.f874d;
                        c0043k.f866h = o3;
                        c0043k.f869k = 1;
                        dVar = (E2.d) aVar3;
                        if (dVar.c(c0043k) != enumC0326a) {
                            oVar = oVar2;
                            qVar = qVar3;
                            pVar = c0040h;
                        }
                        return enumC0326a;
                    }
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = c0043k.f;
                            qVar2 = (kotlin.jvm.internal.q) c0043k.f864e;
                            aVar = (E2.a) c0043k.f863d;
                            try {
                                X0.a.L(obj2);
                                qVar2.f9672a = obj;
                                qVar = qVar2;
                                Object obj3 = qVar.f9672a;
                                ((E2.d) aVar).e(null);
                                return obj3;
                            } catch (Throwable th) {
                                th = th;
                                ((E2.d) aVar).e(null);
                                throw th;
                            }
                        }
                        o4 = (O) c0043k.f;
                        qVar = (kotlin.jvm.internal.q) c0043k.f864e;
                        aVar2 = (E2.a) c0043k.f863d;
                        try {
                            X0.a.L(obj2);
                            if (!kotlin.jvm.internal.j.a(obj2, qVar.f9672a)) {
                                aVar = aVar2;
                                Object obj32 = qVar.f9672a;
                                ((E2.d) aVar).e(null);
                                return obj32;
                            }
                            c0043k.f863d = aVar2;
                            c0043k.f864e = qVar;
                            c0043k.f = obj2;
                            c0043k.f869k = 3;
                            if (o4.j(obj2, false, c0043k) != enumC0326a) {
                                obj = obj2;
                                qVar2 = qVar;
                                aVar = aVar2;
                                qVar2.f9672a = obj;
                                qVar = qVar2;
                                Object obj322 = qVar.f9672a;
                                ((E2.d) aVar).e(null);
                                return obj322;
                            }
                            return enumC0326a;
                        } catch (Throwable th2) {
                            th = th2;
                            aVar = aVar2;
                            ((E2.d) aVar).e(null);
                            throw th;
                        }
                    }
                    O o5 = c0043k.f866h;
                    qVar = c0043k.f865g;
                    oVar = (kotlin.jvm.internal.o) c0043k.f;
                    ?? r7 = (E2.a) c0043k.f864e;
                    o2.p pVar2 = (o2.p) c0043k.f863d;
                    X0.a.L(obj2);
                    o3 = o5;
                    pVar = pVar2;
                    dVar = r7;
                    if (!oVar.f9670a) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = qVar.f9672a;
                    c0043k.f863d = dVar;
                    c0043k.f864e = qVar;
                    c0043k.f = o3;
                    c0043k.f865g = null;
                    c0043k.f866h = null;
                    c0043k.f869k = 2;
                    Object invoke = pVar.invoke(obj4, c0043k);
                    if (invoke != enumC0326a) {
                        aVar2 = dVar;
                        obj2 = invoke;
                        o4 = o3;
                        if (!kotlin.jvm.internal.j.a(obj2, qVar.f9672a)) {
                        }
                    }
                    return enumC0326a;
                }
            }
            if (!oVar.f9670a) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar = dVar;
            ((E2.d) aVar).e(null);
            throw th;
        }
        c0043k = new C0043k(this, abstractC0343b);
        Object obj22 = c0043k.f867i;
        EnumC0326a enumC0326a2 = EnumC0326a.f4994a;
        i3 = c0043k.f869k;
        if (i3 != 0) {
        }
    }
}
