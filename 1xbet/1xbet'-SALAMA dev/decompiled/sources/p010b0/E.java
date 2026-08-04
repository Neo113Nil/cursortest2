package p010b0;

import j6.a;
import kotlin.jvm.functions.Function2;
import p065i6.d;
import p077k6.i;

/* JADX INFO: loaded from: classes.dex */
public final class E extends i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f9925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f9926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f9927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f9928d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9929e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(O o7, int i7, d dVar) {
        super(2, dVar);
        this.f9928d = o7;
        this.f9929e = i7;
    }

    @Override // p077k6.a
    public final d create(Object obj, d dVar) {
        E e7 = new E(this.f9928d, this.f9929e, dVar);
        e7.f9927c = ((Boolean) obj).booleanValue();
        return e7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((E) create(bool, (d) obj2)).invokeSuspend(p044f6.i.f13014a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        boolean z4;
        Object obj2;
        int iIntValue;
        int iHashCode;
        a aVar = a.f14648a;
        int i7 = this.f9926b;
        O o7 = this.f9928d;
        if (i7 != 0) {
            if (i7 == 1) {
                z4 = this.f9927c;
                p003a.a.p0(obj);
            } else {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f9925a;
                p003a.a.p0(obj);
            }
            iIntValue = ((Number) obj).intValue();
            if (obj2 != null) {
                iHashCode = obj2.hashCode();
            } else {
                iHashCode = 0;
            }
            return new C0733d(obj2, iHashCode, iIntValue);
        }
        p003a.a.p0(obj);
        z4 = this.f9927c;
        this.f9927c = z4;
        this.f9926b = 1;
        obj = o7.i(this);
        if (obj == aVar) {
            return aVar;
        }
        if (z4) {
            h0 h0VarG = o7.g();
            this.f9925a = obj;
            this.f9926b = 2;
            Integer numA = h0VarG.a();
            if (numA == aVar) {
                return aVar;
            }
            obj2 = obj;
            obj = numA;
            iIntValue = ((Number) obj).intValue();
        } else {
            obj2 = obj;
            iIntValue = this.f9929e;
        }
        if (obj2 != null) {
            iHashCode = obj2.hashCode();
        } else {
            iHashCode = 0;
        }
        return new C0733d(obj2, iHashCode, iIntValue);
    }
}
