package x;

import b4.EnumC0510a;
import c4.AbstractC0548i;

/* renamed from: x.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2564J extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public kotlin.jvm.internal.w f20649k;

    /* renamed from: l, reason: collision with root package name */
    public int f20650l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f20651m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.w f20652n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2589k0 f20653o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2564J(kotlin.jvm.internal.w wVar, C2589k0 c2589k0, a4.c cVar) {
        super(2, cVar);
        this.f20652n = wVar;
        this.f20653o = c2589k0;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2564J c2564j = new C2564J(this.f20652n, this.f20653o, cVar);
        c2564j.f20651m = obj;
        return c2564j;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2564J) create((i4.c) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0041 -> B:6:0x0053). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x004d -> B:5:0x0050). Please report as a decompilation issue!!! */
    @Override // c4.AbstractC0540a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        i4.c cVar;
        Object obj2;
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20650l;
        if (i == 0) {
            G4.l.N(obj);
            cVar = (i4.c) this.f20651m;
            r1 = this.f20652n;
            obj2 = r1.f17624k;
            if (obj2 instanceof C2606u) {
            }
            return W3.o.f6046a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.jvm.internal.w wVar = this.f20649k;
        cVar = (i4.c) this.f20651m;
        G4.l.N(obj);
        AbstractC2607v abstractC2607v = (AbstractC2607v) obj;
        wVar.f17624k = abstractC2607v;
        wVar = this.f20652n;
        obj2 = wVar.f17624k;
        if (!(obj2 instanceof C2606u) || (obj2 instanceof r)) {
            return W3.o.f6046a;
        }
        abstractC2607v = null;
        C2603s c2603s = obj2 instanceof C2603s ? (C2603s) obj2 : null;
        if (c2603s != null) {
            cVar.c(c2603s);
        }
        r4.c cVar2 = this.f20653o.f20803E;
        if (cVar2 != null) {
            this.f20651m = cVar;
            this.f20649k = wVar;
            this.f20650l = 1;
            obj = cVar2.c(this);
            if (obj == enumC0510a) {
                return enumC0510a;
            }
            AbstractC2607v abstractC2607v2 = (AbstractC2607v) obj;
        }
        wVar.f17624k = abstractC2607v2;
        wVar = this.f20652n;
        obj2 = wVar.f17624k;
        if (obj2 instanceof C2606u) {
        }
        return W3.o.f6046a;
    }
}
