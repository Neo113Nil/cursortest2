package p010b0;

import M6.a;
import M6.e;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;
import p155w1.F0;
import t6.n;
import t6.p;

/* JADX INFO: renamed from: b0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0742m extends i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f10074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Serializable f10075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f10076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f10077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Iterator f10078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10079f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10080x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ O f10081y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ F0 f10082z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0742m(O o7, F0 f7, d dVar) {
        super(1, dVar);
        this.f10081y = o7;
        this.f10082z = f7;
    }

    @Override // p077k6.a
    public final d create(d dVar) {
        return new C0742m(this.f10081y, this.f10082z, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C0742m) create((d) obj)).invokeSuspend(p044f6.i.f13014a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00dc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:39:0x0102 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0103  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:? A[LOOP:0: B:21:0x00a1->B:51:?, LOOP_END, SYNTHETIC] */
    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        a aVarA;
        n nVar;
        p pVar;
        p pVar2;
        a aVar;
        Iterator it;
        a aVar2;
        n nVar2;
        p pVar3;
        C0741l c0741l;
        p pVar4;
        n nVar3;
        Function2 function2;
        Object obj2;
        int iHashCode;
        Integer numA;
        int i7;
        j6.a aVar3 = j6.a.f14648a;
        int i8 = this.f10080x;
        F0 f7 = this.f10082z;
        O o7 = this.f10081y;
        if (i8 != 0) {
            if (i8 == 1) {
                pVar = (p) this.f10077d;
                pVar2 = (p) this.f10076c;
                nVar = (n) this.f10075b;
                aVarA = (a) this.f10074a;
                p003a.a.p0(obj);
            } else if (i8 == 2) {
                it = this.f10078e;
                c0741l = (C0741l) this.f10077d;
                pVar3 = (p) this.f10076c;
                nVar2 = (n) this.f10075b;
                aVar2 = (a) this.f10074a;
                p003a.a.p0(obj);
                while (it.hasNext()) {
                    function2 = (Function2) it.next();
                    this.f10074a = aVar2;
                    this.f10075b = nVar2;
                    this.f10076c = pVar3;
                    this.f10077d = c0741l;
                    this.f10078e = it;
                    this.f10080x = 2;
                    if (function2.invoke(c0741l, this) == aVar3) {
                        return aVar3;
                    }
                }
                pVar2 = pVar3;
                nVar = nVar2;
                aVar = aVar2;
                f7.f17381d = null;
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
                nVar3.f16476a = true;
                aVar.b(null);
                obj2 = pVar4.f16478a;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                h0 h0VarG = o7.g();
                this.f10074a = obj2;
                this.f10075b = null;
                this.f10076c = null;
                this.f10079f = iHashCode;
                this.f10080x = 4;
                numA = h0VarG.a();
                if (numA == aVar3) {
                    return aVar3;
                }
                i7 = iHashCode;
                obj = numA;
            } else if (i8 == 3) {
                aVar = (a) this.f10076c;
                pVar4 = (p) this.f10075b;
                nVar3 = (n) this.f10074a;
                p003a.a.p0(obj);
                try {
                    nVar3.f16476a = true;
                    aVar.b(null);
                    obj2 = pVar4.f16478a;
                    if (obj2 != null) {
                        iHashCode = obj2.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    h0 h0VarG2 = o7.g();
                    this.f10074a = obj2;
                    this.f10075b = null;
                    this.f10076c = null;
                    this.f10079f = iHashCode;
                    this.f10080x = 4;
                    numA = h0VarG2.a();
                    if (numA == aVar3) {
                        return aVar3;
                    }
                    i7 = iHashCode;
                    obj = numA;
                } catch (Throwable th) {
                    aVar.b(null);
                    throw th;
                }
            } else {
                if (i8 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i7 = this.f10079f;
                obj2 = this.f10074a;
                p003a.a.p0(obj);
            }
            return new C0733d(obj2, i7, ((Number) obj).intValue());
        }
        p003a.a.p0(obj);
        aVarA = e.a();
        nVar = new n();
        pVar = new p();
        this.f10074a = aVarA;
        this.f10075b = nVar;
        this.f10076c = pVar;
        this.f10077d = pVar;
        this.f10080x = 1;
        obj = O.f(o7, true, this);
        if (obj == aVar3) {
            return aVar3;
        }
        pVar2 = pVar;
        pVar.f16478a = ((C0733d) obj).f10021b;
        C0741l c0741l2 = new C0741l(aVarA, nVar, pVar2, o7);
        List list = (List) f7.f17381d;
        if (list != null) {
            it = list.iterator();
            aVar2 = aVarA;
            nVar2 = nVar;
            pVar3 = pVar2;
            c0741l = c0741l2;
            while (it.hasNext()) {
                function2 = (Function2) it.next();
                this.f10074a = aVar2;
                this.f10075b = nVar2;
                this.f10076c = pVar3;
                this.f10077d = c0741l;
                this.f10078e = it;
                this.f10080x = 2;
                if (function2.invoke(c0741l, this) == aVar3) {
                    return aVar3;
                }
            }
            pVar2 = pVar3;
            nVar = nVar2;
            aVar = aVar2;
        } else {
            aVar = aVarA;
        }
        f7.f17381d = null;
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
        nVar3.f16476a = true;
        aVar.b(null);
        obj2 = pVar4.f16478a;
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        h0 h0VarG3 = o7.g();
        this.f10074a = obj2;
        this.f10075b = null;
        this.f10076c = null;
        this.f10079f = iHashCode;
        this.f10080x = 4;
        numA = h0VarG3.a();
        if (numA == aVar3) {
            return aVar3;
        }
        i7 = iHashCode;
        obj = numA;
        return new C0733d(obj2, i7, ((Number) obj).intValue());
    }
}
