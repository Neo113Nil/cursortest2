package p010b0;

import D6.E;
import j6.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;
import t6.h;

/* JADX INFO: loaded from: classes.dex */
public final class I extends i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f9940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ O f9942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p065i6.i f9943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f9944e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I(O o7, p065i6.i iVar, Function2 function2, d dVar) {
        super(1, dVar);
        this.f9942c = o7;
        this.f9943d = iVar;
        this.f9944e = (i) function2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [k6.i, kotlin.jvm.functions.Function2] */
    @Override // p077k6.a
    public final d create(d dVar) {
        return new I(this.f9942c, this.f9943d, this.f9944e, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((I) create((d) obj)).invokeSuspend(p044f6.i.f13014a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /* JADX WARN: Code duplicated, block: B:24:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:28:0x006f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x0070  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v0, types: [k6.i, kotlin.jvm.functions.Function2] */
    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0733d c0733d;
        Object obj2;
        int iHashCode;
        Object obj3;
        a aVar = a.f14648a;
        int i7 = this.f9941b;
        O o7 = this.f9942c;
        if (i7 != 0) {
            if (i7 == 1) {
                p003a.a.p0(obj);
            } else if (i7 == 2) {
                c0733d = (C0733d) this.f9940a;
                p003a.a.p0(obj);
                obj2 = c0733d.f10021b;
                if (obj2 != null) {
                    iHashCode = obj2.hashCode();
                } else {
                    iHashCode = 0;
                }
                if (iHashCode == c0733d.f10022c) {
                    throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                }
                if (!h.a(c0733d.f10021b, obj)) {
                    return obj;
                }
                this.f9940a = obj;
                this.f9941b = 3;
                if (o7.j(obj, true, this) == aVar) {
                    return aVar;
                }
                obj3 = obj;
            } else {
                if (i7 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj3 = this.f9940a;
                p003a.a.p0(obj);
            }
            return obj3;
        }
        p003a.a.p0(obj);
        this.f9941b = 1;
        obj = O.f(o7, true, this);
        if (obj == aVar) {
            return aVar;
        }
        c0733d = (C0733d) obj;
        H h6 = new H(this.f9944e, c0733d, null);
        this.f9940a = c0733d;
        this.f9941b = 2;
        obj = E.x(this.f9943d, h6, this);
        if (obj == aVar) {
            return aVar;
        }
        obj2 = c0733d.f10021b;
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        if (iHashCode == c0733d.f10022c) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
        if (!h.a(c0733d.f10021b, obj)) {
            return obj;
        }
        this.f9940a = obj;
        this.f9941b = 3;
        if (o7.j(obj, true, this) == aVar) {
            return aVar;
        }
        obj3 = obj;
        return obj3;
    }
}
