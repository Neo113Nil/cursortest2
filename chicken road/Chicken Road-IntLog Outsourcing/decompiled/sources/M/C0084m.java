package M;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import t4.InterfaceC1441l;
import t4.InterfaceC1445p;

/* renamed from: M.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0084m extends m4.h implements InterfaceC1441l {

    /* renamed from: a, reason: collision with root package name */
    public Object f1723a;

    /* renamed from: b, reason: collision with root package name */
    public Serializable f1724b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1725c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1726d;

    /* renamed from: e, reason: collision with root package name */
    public Iterator f1727e;

    /* renamed from: f, reason: collision with root package name */
    public int f1728f;

    /* renamed from: g, reason: collision with root package name */
    public int f1729g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ P f1730h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ f2.t f1731i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0084m(P p5, f2.t tVar, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.f1730h = p5;
        this.f1731i = tVar;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new C0084m(this.f1730h, this.f1731i, interfaceC1218d);
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(Object obj) {
        return ((C0084m) create((InterfaceC1218d) obj)).invokeSuspend(f4.v.f5689a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0100 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d9  */
    @Override // m4.AbstractC1293a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        L4.a a6;
        kotlin.jvm.internal.q qVar;
        kotlin.jvm.internal.s sVar;
        kotlin.jvm.internal.s sVar2;
        Iterator it;
        L4.a aVar;
        kotlin.jvm.internal.q qVar2;
        kotlin.jvm.internal.s sVar3;
        C0083l c0083l;
        L4.d dVar;
        kotlin.jvm.internal.s sVar4;
        kotlin.jvm.internal.q qVar3;
        Object obj2;
        Object obj3;
        Integer a7;
        int i2;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i3 = this.f1729g;
        f2.t tVar = this.f1731i;
        P p5 = this.f1730h;
        if (i3 == 0) {
            e5.g.y(obj);
            a6 = L4.e.a();
            qVar = new kotlin.jvm.internal.q();
            sVar = new kotlin.jvm.internal.s();
            this.f1723a = a6;
            this.f1724b = qVar;
            this.f1725c = sVar;
            this.f1726d = sVar;
            this.f1729g = 1;
            obj = P.f(p5, true, this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
            sVar2 = sVar;
        } else if (i3 == 1) {
            sVar = (kotlin.jvm.internal.s) this.f1726d;
            sVar2 = (kotlin.jvm.internal.s) this.f1725c;
            qVar = (kotlin.jvm.internal.q) this.f1724b;
            a6 = (L4.a) this.f1723a;
            e5.g.y(obj);
        } else {
            if (i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i2 = this.f1728f;
                    obj3 = this.f1723a;
                    e5.g.y(obj);
                    return new C0075d(i2, ((Number) obj).intValue(), obj3);
                }
                Object obj4 = (L4.a) this.f1725c;
                sVar4 = (kotlin.jvm.internal.s) this.f1724b;
                qVar3 = (kotlin.jvm.internal.q) this.f1723a;
                e5.g.y(obj);
                obj2 = obj4;
                try {
                    qVar3.f10739a = true;
                    ((L4.d) obj2).e(null);
                    obj3 = sVar4.f10741a;
                    int hashCode = obj3 == null ? obj3.hashCode() : 0;
                    j0 g6 = p5.g();
                    this.f1723a = obj3;
                    this.f1724b = null;
                    this.f1725c = null;
                    this.f1728f = hashCode;
                    this.f1729g = 4;
                    a7 = g6.a();
                    if (a7 != enumC1260a) {
                        return enumC1260a;
                    }
                    i2 = hashCode;
                    obj = a7;
                    return new C0075d(i2, ((Number) obj).intValue(), obj3);
                } catch (Throwable th) {
                    ((L4.d) obj2).e(null);
                    throw th;
                }
            }
            it = this.f1727e;
            c0083l = (C0083l) this.f1726d;
            sVar3 = (kotlin.jvm.internal.s) this.f1725c;
            qVar2 = (kotlin.jvm.internal.q) this.f1724b;
            aVar = (L4.a) this.f1723a;
            e5.g.y(obj);
            while (it.hasNext()) {
                InterfaceC1445p interfaceC1445p = (InterfaceC1445p) it.next();
                this.f1723a = aVar;
                this.f1724b = qVar2;
                this.f1725c = sVar3;
                this.f1726d = c0083l;
                this.f1727e = it;
                this.f1729g = 2;
                if (interfaceC1445p.invoke(c0083l, this) == enumC1260a) {
                    return enumC1260a;
                }
            }
            sVar2 = sVar3;
            qVar = qVar2;
            a6 = aVar;
            tVar.f5638c = null;
            this.f1723a = qVar;
            this.f1724b = sVar2;
            this.f1725c = a6;
            this.f1726d = null;
            this.f1727e = null;
            this.f1729g = 3;
            dVar = (L4.d) a6;
            if (dVar.c(this) != enumC1260a) {
                return enumC1260a;
            }
            sVar4 = sVar2;
            qVar3 = qVar;
            obj2 = dVar;
            qVar3.f10739a = true;
            ((L4.d) obj2).e(null);
            obj3 = sVar4.f10741a;
            if (obj3 == null) {
            }
            j0 g62 = p5.g();
            this.f1723a = obj3;
            this.f1724b = null;
            this.f1725c = null;
            this.f1728f = hashCode;
            this.f1729g = 4;
            a7 = g62.a();
            if (a7 != enumC1260a) {
            }
        }
        sVar.f10741a = ((C0075d) obj).f1667b;
        C0083l c0083l2 = new C0083l(a6, qVar, sVar2, p5);
        List list = (List) tVar.f5638c;
        if (list != null) {
            it = list.iterator();
            aVar = a6;
            qVar2 = qVar;
            sVar3 = sVar2;
            c0083l = c0083l2;
            while (it.hasNext()) {
            }
            sVar2 = sVar3;
            qVar = qVar2;
            a6 = aVar;
        }
        tVar.f5638c = null;
        this.f1723a = qVar;
        this.f1724b = sVar2;
        this.f1725c = a6;
        this.f1726d = null;
        this.f1727e = null;
        this.f1729g = 3;
        dVar = (L4.d) a6;
        if (dVar.c(this) != enumC1260a) {
        }
    }
}
