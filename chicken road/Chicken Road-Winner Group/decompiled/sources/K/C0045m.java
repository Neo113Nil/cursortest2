package K;

import d2.C0279i;
import g2.InterfaceC0319c;
import h2.EnumC0326a;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* renamed from: K.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0045m extends i2.g implements o2.l {

    /* renamed from: e, reason: collision with root package name */
    public Object f876e;
    public Serializable f;

    /* renamed from: g, reason: collision with root package name */
    public Object f877g;

    /* renamed from: h, reason: collision with root package name */
    public Object f878h;

    /* renamed from: i, reason: collision with root package name */
    public Iterator f879i;

    /* renamed from: j, reason: collision with root package name */
    public int f880j;

    /* renamed from: k, reason: collision with root package name */
    public int f881k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O f882l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ D0.a f883m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0045m(O o3, D0.a aVar, InterfaceC0319c interfaceC0319c) {
        super(1, interfaceC0319c);
        this.f882l = o3;
        this.f883m = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    @Override // i2.AbstractC0343b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        E2.a dVar;
        kotlin.jvm.internal.o oVar;
        kotlin.jvm.internal.q qVar;
        kotlin.jvm.internal.q qVar2;
        Iterator it;
        E2.a aVar;
        kotlin.jvm.internal.o oVar2;
        kotlin.jvm.internal.q qVar3;
        C0044l c0044l;
        E2.d dVar2;
        kotlin.jvm.internal.q qVar4;
        kotlin.jvm.internal.o oVar3;
        Object obj2;
        Object obj3;
        Integer a3;
        int i3;
        EnumC0326a enumC0326a = EnumC0326a.f4994a;
        int i4 = this.f881k;
        D0.a aVar2 = this.f883m;
        O o3 = this.f882l;
        if (i4 == 0) {
            X0.a.L(obj);
            dVar = new E2.d();
            oVar = new kotlin.jvm.internal.o();
            qVar = new kotlin.jvm.internal.q();
            this.f876e = dVar;
            this.f = oVar;
            this.f877g = qVar;
            this.f878h = qVar;
            this.f881k = 1;
            obj = O.f(o3, true, this);
            if (obj != enumC0326a) {
                qVar2 = qVar;
            }
            return enumC0326a;
        }
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i3 = this.f880j;
                    obj3 = this.f876e;
                    X0.a.L(obj);
                    return new C0036d(i3, ((Number) obj).intValue(), obj3);
                }
                Object obj4 = (E2.a) this.f877g;
                qVar4 = (kotlin.jvm.internal.q) this.f;
                oVar3 = (kotlin.jvm.internal.o) this.f876e;
                X0.a.L(obj);
                obj2 = obj4;
                try {
                    oVar3.f9670a = true;
                    ((E2.d) obj2).e(null);
                    obj3 = qVar4.f9672a;
                    int hashCode = obj3 == null ? obj3.hashCode() : 0;
                    i0 g3 = o3.g();
                    this.f876e = obj3;
                    this.f = null;
                    this.f877g = null;
                    this.f880j = hashCode;
                    this.f881k = 4;
                    a3 = g3.a();
                    if (a3 != enumC0326a) {
                        i3 = hashCode;
                        obj = a3;
                        return new C0036d(i3, ((Number) obj).intValue(), obj3);
                    }
                    return enumC0326a;
                } catch (Throwable th) {
                    ((E2.d) obj2).e(null);
                    throw th;
                }
            }
            it = this.f879i;
            c0044l = (C0044l) this.f878h;
            qVar3 = (kotlin.jvm.internal.q) this.f877g;
            oVar2 = (kotlin.jvm.internal.o) this.f;
            aVar = (E2.a) this.f876e;
            X0.a.L(obj);
            while (it.hasNext()) {
                o2.p pVar = (o2.p) it.next();
                this.f876e = aVar;
                this.f = oVar2;
                this.f877g = qVar3;
                this.f878h = c0044l;
                this.f879i = it;
                this.f881k = 2;
                if (pVar.invoke(c0044l, this) == enumC0326a) {
                    break;
                }
            }
            qVar2 = qVar3;
            oVar = oVar2;
            dVar = aVar;
            aVar2.f263c = null;
            this.f876e = oVar;
            this.f = qVar2;
            this.f877g = dVar;
            this.f878h = null;
            this.f879i = null;
            this.f881k = 3;
            dVar2 = (E2.d) dVar;
            if (dVar2.c(this) != enumC0326a) {
                qVar4 = qVar2;
                oVar3 = oVar;
                obj2 = dVar2;
                oVar3.f9670a = true;
                ((E2.d) obj2).e(null);
                obj3 = qVar4.f9672a;
                if (obj3 == null) {
                }
                i0 g32 = o3.g();
                this.f876e = obj3;
                this.f = null;
                this.f877g = null;
                this.f880j = hashCode;
                this.f881k = 4;
                a3 = g32.a();
                if (a3 != enumC0326a) {
                }
            }
            return enumC0326a;
        }
        qVar = (kotlin.jvm.internal.q) this.f878h;
        qVar2 = (kotlin.jvm.internal.q) this.f877g;
        oVar = (kotlin.jvm.internal.o) this.f;
        dVar = (E2.a) this.f876e;
        X0.a.L(obj);
        qVar.f9672a = ((C0036d) obj).f829b;
        C0044l c0044l2 = new C0044l(dVar, oVar, qVar2, o3);
        List list = (List) aVar2.f263c;
        if (list != null) {
            it = list.iterator();
            aVar = dVar;
            oVar2 = oVar;
            qVar3 = qVar2;
            c0044l = c0044l2;
            while (it.hasNext()) {
            }
            qVar2 = qVar3;
            oVar = oVar2;
            dVar = aVar;
        }
        aVar2.f263c = null;
        this.f876e = oVar;
        this.f = qVar2;
        this.f877g = dVar;
        this.f878h = null;
        this.f879i = null;
        this.f881k = 3;
        dVar2 = (E2.d) dVar;
        if (dVar2.c(this) != enumC0326a) {
        }
        return enumC0326a;
    }

    @Override // o2.l
    public final Object invoke(Object obj) {
        return new C0045m(this.f882l, this.f883m, (InterfaceC0319c) obj).g(C0279i.f4852a);
    }
}
