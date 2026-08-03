package F;

/* renamed from: F.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0012l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ H1.a f483a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.n f484b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.p f485c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ F.P f486d;

    public C0012l(H1.a aVar, kotlin.jvm.internal.n nVar, kotlin.jvm.internal.p pVar, F.P p2) {
        this.f483a = aVar;
        this.f484b = nVar;
        this.f485c = pVar;
        this.f486d = p2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:46:0x00d9, B:47:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9 A[Catch: all -> 0x00d6, TRY_ENTER, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:46:0x00d9, B:47:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [H1.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(F.C0008h c0008h, m1.AbstractC0931b abstractC0931b) {
        F.C0011k c0011k;
        int i2;
        F.P p2;
        H1.d dVar;
        kotlin.jvm.internal.n nVar;
        kotlin.jvm.internal.p pVar;
        s1.p pVar2;
        H1.a aVar;
        H1.a aVar2;
        F.P p3;
        java.lang.Object obj;
        kotlin.jvm.internal.p pVar3;
        try {
            if (abstractC0931b instanceof F.C0011k) {
                c0011k = (F.C0011k) abstractC0931b;
                int i3 = c0011k.f481k;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    c0011k.f481k = i3 - Integer.MIN_VALUE;
                    java.lang.Object obj2 = c0011k.f479i;
                    l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
                    i2 = c0011k.f481k;
                    if (i2 != 0) {
                        a.AbstractC0059a.A(obj2);
                        c0011k.f474d = c0008h;
                        H1.a aVar3 = this.f483a;
                        c0011k.f475e = aVar3;
                        kotlin.jvm.internal.n nVar2 = this.f484b;
                        c0011k.f476f = nVar2;
                        kotlin.jvm.internal.p pVar4 = this.f485c;
                        c0011k.f477g = pVar4;
                        p2 = this.f486d;
                        c0011k.f478h = p2;
                        c0011k.f481k = 1;
                        dVar = (H1.d) aVar3;
                        if (dVar.c(c0011k) == enumC0927a) {
                            return enumC0927a;
                        }
                        nVar = nVar2;
                        pVar = pVar4;
                        pVar2 = c0008h;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                obj = c0011k.f476f;
                                pVar3 = (kotlin.jvm.internal.p) c0011k.f475e;
                                aVar = (H1.a) c0011k.f474d;
                                try {
                                    a.AbstractC0059a.A(obj2);
                                    pVar3.f7960a = obj;
                                    pVar = pVar3;
                                    java.lang.Object obj3 = pVar.f7960a;
                                    ((H1.d) aVar).e(null);
                                    return obj3;
                                } catch (java.lang.Throwable th) {
                                    th = th;
                                    ((H1.d) aVar).e(null);
                                    throw th;
                                }
                            }
                            p3 = (F.P) c0011k.f476f;
                            pVar = (kotlin.jvm.internal.p) c0011k.f475e;
                            aVar2 = (H1.a) c0011k.f474d;
                            try {
                                a.AbstractC0059a.A(obj2);
                                if (!kotlin.jvm.internal.i.a(obj2, pVar.f7960a)) {
                                    aVar = aVar2;
                                    java.lang.Object obj32 = pVar.f7960a;
                                    ((H1.d) aVar).e(null);
                                    return obj32;
                                }
                                c0011k.f474d = aVar2;
                                c0011k.f475e = pVar;
                                c0011k.f476f = obj2;
                                c0011k.f481k = 3;
                                if (p3.j(obj2, false, c0011k) == enumC0927a) {
                                    return enumC0927a;
                                }
                                obj = obj2;
                                pVar3 = pVar;
                                aVar = aVar2;
                                pVar3.f7960a = obj;
                                pVar = pVar3;
                                java.lang.Object obj322 = pVar.f7960a;
                                ((H1.d) aVar).e(null);
                                return obj322;
                            } catch (java.lang.Throwable th2) {
                                th = th2;
                                aVar = aVar2;
                                ((H1.d) aVar).e(null);
                                throw th;
                            }
                        }
                        F.P p4 = c0011k.f478h;
                        pVar = c0011k.f477g;
                        nVar = (kotlin.jvm.internal.n) c0011k.f476f;
                        ?? r7 = (H1.a) c0011k.f475e;
                        s1.p pVar5 = (s1.p) c0011k.f474d;
                        a.AbstractC0059a.A(obj2);
                        dVar = r7;
                        p2 = p4;
                        pVar2 = pVar5;
                    }
                    if (!nVar.f7958a) {
                        throw new java.lang.IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    java.lang.Object obj4 = pVar.f7960a;
                    c0011k.f474d = dVar;
                    c0011k.f475e = pVar;
                    c0011k.f476f = p2;
                    c0011k.f477g = null;
                    c0011k.f478h = null;
                    c0011k.f481k = 2;
                    java.lang.Object invoke = pVar2.invoke(obj4, c0011k);
                    if (invoke == enumC0927a) {
                        return enumC0927a;
                    }
                    aVar2 = dVar;
                    obj2 = invoke;
                    p3 = p2;
                    if (!kotlin.jvm.internal.i.a(obj2, pVar.f7960a)) {
                    }
                }
            }
            if (!nVar.f7958a) {
            }
        } catch (java.lang.Throwable th3) {
            th = th3;
            aVar = dVar;
            ((H1.d) aVar).e(null);
            throw th;
        }
        c0011k = new F.C0011k(this, abstractC0931b);
        java.lang.Object obj22 = c0011k.f479i;
        l1.EnumC0927a enumC0927a2 = l1.EnumC0927a.f8017a;
        i2 = c0011k.f481k;
        if (i2 != 0) {
        }
    }
}
