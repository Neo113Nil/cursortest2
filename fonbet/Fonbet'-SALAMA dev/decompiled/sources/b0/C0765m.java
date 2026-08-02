package b0;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import w1.F0;

/* renamed from: b0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0765m extends AbstractC1362i implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public Object f10074a;

    /* renamed from: b, reason: collision with root package name */
    public Serializable f10075b;

    /* renamed from: c, reason: collision with root package name */
    public Object f10076c;

    /* renamed from: d, reason: collision with root package name */
    public Object f10077d;

    /* renamed from: e, reason: collision with root package name */
    public Iterator f10078e;

    /* renamed from: f, reason: collision with root package name */
    public int f10079f;

    /* renamed from: x, reason: collision with root package name */
    public int f10080x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ O f10081y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ F0 f10082z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0765m(O o7, F0 f02, InterfaceC1287d interfaceC1287d) {
        super(1, interfaceC1287d);
        this.f10081y = o7;
        this.f10082z = f02;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(InterfaceC1287d interfaceC1287d) {
        return new C0765m(this.f10081y, this.f10082z, interfaceC1287d);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0765m) create((InterfaceC1287d) obj)).invokeSuspend(C1116i.f13008a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    @Override // k6.AbstractC1354a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        M6.a a2;
        t6.n nVar;
        t6.p pVar;
        t6.p pVar2;
        M6.a aVar;
        Iterator it;
        M6.a aVar2;
        t6.n nVar2;
        t6.p pVar3;
        C0764l c0764l;
        t6.p pVar4;
        t6.n nVar3;
        Object obj2;
        Integer a4;
        int i7;
        j6.a aVar3 = j6.a.f14642a;
        int i8 = this.f10080x;
        F0 f02 = this.f10082z;
        O o7 = this.f10081y;
        if (i8 == 0) {
            AbstractC0603a.p0(obj);
            a2 = M6.e.a();
            nVar = new t6.n();
            pVar = new t6.p();
            this.f10074a = a2;
            this.f10075b = nVar;
            this.f10076c = pVar;
            this.f10077d = pVar;
            this.f10080x = 1;
            obj = O.f(o7, true, this);
            if (obj == aVar3) {
                return aVar3;
            }
            pVar2 = pVar;
        } else if (i8 == 1) {
            pVar = (t6.p) this.f10077d;
            pVar2 = (t6.p) this.f10076c;
            nVar = (t6.n) this.f10075b;
            a2 = (M6.a) this.f10074a;
            AbstractC0603a.p0(obj);
        } else {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i7 = this.f10079f;
                    obj2 = this.f10074a;
                    AbstractC0603a.p0(obj);
                    return new C0756d(obj2, i7, ((Number) obj).intValue());
                }
                aVar = (M6.a) this.f10076c;
                pVar4 = (t6.p) this.f10075b;
                nVar3 = (t6.n) this.f10074a;
                AbstractC0603a.p0(obj);
                try {
                    nVar3.f16470a = true;
                    aVar.b(null);
                    obj2 = pVar4.f16472a;
                    int hashCode = obj2 == null ? obj2.hashCode() : 0;
                    h0 g3 = o7.g();
                    this.f10074a = obj2;
                    this.f10075b = null;
                    this.f10076c = null;
                    this.f10079f = hashCode;
                    this.f10080x = 4;
                    a4 = g3.a();
                    if (a4 != aVar3) {
                        return aVar3;
                    }
                    i7 = hashCode;
                    obj = a4;
                    return new C0756d(obj2, i7, ((Number) obj).intValue());
                } catch (Throwable th) {
                    aVar.b(null);
                    throw th;
                }
            }
            it = this.f10078e;
            c0764l = (C0764l) this.f10077d;
            pVar3 = (t6.p) this.f10076c;
            nVar2 = (t6.n) this.f10075b;
            aVar2 = (M6.a) this.f10074a;
            AbstractC0603a.p0(obj);
            while (it.hasNext()) {
                Function2 function2 = (Function2) it.next();
                this.f10074a = aVar2;
                this.f10075b = nVar2;
                this.f10076c = pVar3;
                this.f10077d = c0764l;
                this.f10078e = it;
                this.f10080x = 2;
                if (function2.invoke(c0764l, this) == aVar3) {
                    return aVar3;
                }
            }
            pVar2 = pVar3;
            nVar = nVar2;
            aVar = aVar2;
            f02.f17375d = null;
            this.f10074a = nVar;
            this.f10075b = pVar2;
            this.f10076c = aVar;
            this.f10077d = null;
            this.f10078e = null;
            this.f10080x = 3;
            if (aVar.a(this) == aVar3) {
                return aVar3;
            }
            pVar4 = pVar2;
            nVar3 = nVar;
            nVar3.f16470a = true;
            aVar.b(null);
            obj2 = pVar4.f16472a;
            if (obj2 == null) {
            }
            h0 g32 = o7.g();
            this.f10074a = obj2;
            this.f10075b = null;
            this.f10076c = null;
            this.f10079f = hashCode;
            this.f10080x = 4;
            a4 = g32.a();
            if (a4 != aVar3) {
            }
        }
        pVar.f16472a = ((C0756d) obj).f10021b;
        C0764l c0764l2 = new C0764l(a2, nVar, pVar2, o7);
        List list = (List) f02.f17375d;
        if (list != null) {
            it = list.iterator();
            aVar2 = a2;
            nVar2 = nVar;
            pVar3 = pVar2;
            c0764l = c0764l2;
            while (it.hasNext()) {
            }
            pVar2 = pVar3;
            nVar = nVar2;
            aVar = aVar2;
            f02.f17375d = null;
            this.f10074a = nVar;
            this.f10075b = pVar2;
            this.f10076c = aVar;
            this.f10077d = null;
            this.f10078e = null;
            this.f10080x = 3;
            if (aVar.a(this) == aVar3) {
            }
        } else {
            aVar = a2;
            f02.f17375d = null;
            this.f10074a = nVar;
            this.f10075b = pVar2;
            this.f10076c = aVar;
            this.f10077d = null;
            this.f10078e = null;
            this.f10080x = 3;
            if (aVar.a(this) == aVar3) {
            }
        }
    }
}
