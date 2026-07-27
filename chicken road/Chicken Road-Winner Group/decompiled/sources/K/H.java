package K;

import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import java.io.Serializable;
import w2.AbstractC1242v;

/* loaded from: classes.dex */
public final class H extends i2.g implements o2.l {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f758e = 1;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O f759g;

    /* renamed from: h, reason: collision with root package name */
    public Object f760h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f761i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Serializable f762j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H(O o3, g2.h hVar, o2.p pVar, InterfaceC0319c interfaceC0319c) {
        super(1, interfaceC0319c);
        this.f759g = o3;
        this.f761i = hVar;
        this.f762j = (i2.g) pVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0061  */
    /* JADX WARN: Type inference failed for: r6v2, types: [i2.g, o2.p] */
    @Override // i2.AbstractC0343b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        kotlin.jvm.internal.q qVar;
        kotlin.jvm.internal.p pVar;
        C0036d c0036d;
        Object obj2;
        switch (this.f758e) {
            case 0:
                EnumC0326a enumC0326a = EnumC0326a.f4994a;
                int i3 = this.f;
                kotlin.jvm.internal.p pVar2 = (kotlin.jvm.internal.p) this.f762j;
                kotlin.jvm.internal.q qVar2 = (kotlin.jvm.internal.q) this.f761i;
                O o3 = this.f759g;
                try {
                } catch (C0035c unused) {
                    Object obj3 = qVar2.f9672a;
                    this.f760h = pVar2;
                    this.f = 3;
                    obj = o3.j(obj3, true, this);
                    if (obj == enumC0326a) {
                        return enumC0326a;
                    }
                }
                if (i3 == 0) {
                    X0.a.L(obj);
                    this.f760h = qVar2;
                    this.f = 1;
                    obj = o3.i(this);
                    if (obj == enumC0326a) {
                        return enumC0326a;
                    }
                    qVar = qVar2;
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            pVar = (kotlin.jvm.internal.p) ((Serializable) this.f760h);
                            X0.a.L(obj);
                            pVar.f9671a = ((Number) obj).intValue();
                            return C0279i.f4852a;
                        }
                        if (i3 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        pVar2 = (kotlin.jvm.internal.p) ((Serializable) this.f760h);
                        X0.a.L(obj);
                        pVar2.f9671a = ((Number) obj).intValue();
                        return C0279i.f4852a;
                    }
                    qVar = (kotlin.jvm.internal.q) ((Serializable) this.f760h);
                    X0.a.L(obj);
                }
                qVar.f9672a = obj;
                i0 g3 = o3.g();
                this.f760h = pVar2;
                this.f = 2;
                obj = g3.a();
                if (obj == enumC0326a) {
                    return enumC0326a;
                }
                pVar = pVar2;
                pVar.f9671a = ((Number) obj).intValue();
                return C0279i.f4852a;
            default:
                EnumC0326a enumC0326a2 = EnumC0326a.f4994a;
                int i4 = this.f;
                O o4 = this.f759g;
                if (i4 == 0) {
                    X0.a.L(obj);
                    this.f = 1;
                    obj = O.f(o4, true, this);
                    if (obj == enumC0326a2) {
                        return enumC0326a2;
                    }
                } else {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Object obj4 = this.f760h;
                            X0.a.L(obj);
                            return obj4;
                        }
                        c0036d = (C0036d) this.f760h;
                        X0.a.L(obj);
                        obj2 = c0036d.f829b;
                        if ((obj2 == null ? obj2.hashCode() : 0) == c0036d.f830c) {
                            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                        }
                        if (!kotlin.jvm.internal.j.a(c0036d.f829b, obj)) {
                            this.f760h = obj;
                            this.f = 3;
                            if (o4.j(obj, true, this) == enumC0326a2) {
                                return enumC0326a2;
                            }
                        }
                        return obj;
                    }
                    X0.a.L(obj);
                }
                c0036d = (C0036d) obj;
                J j3 = new J((i2.g) this.f762j, c0036d, null);
                this.f760h = c0036d;
                this.f = 2;
                obj = AbstractC1242v.n((g2.h) this.f761i, j3, this);
                if (obj == enumC0326a2) {
                    return enumC0326a2;
                }
                obj2 = c0036d.f829b;
                if ((obj2 == null ? obj2.hashCode() : 0) == c0036d.f830c) {
                }
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [i2.g, o2.p] */
    @Override // o2.l
    public final Object invoke(Object obj) {
        InterfaceC0319c interfaceC0319c = (InterfaceC0319c) obj;
        switch (this.f758e) {
            case 0:
                return new H((kotlin.jvm.internal.q) this.f761i, this.f759g, (kotlin.jvm.internal.p) this.f762j, interfaceC0319c).g(C0279i.f4852a);
            default:
                return new H(this.f759g, (g2.h) this.f761i, (o2.p) this.f762j, interfaceC0319c).g(C0279i.f4852a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(kotlin.jvm.internal.q qVar, O o3, kotlin.jvm.internal.p pVar, InterfaceC0319c interfaceC0319c) {
        super(1, interfaceC0319c);
        this.f761i = qVar;
        this.f759g = o3;
        this.f762j = pVar;
    }
}
