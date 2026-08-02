package b0;

import a.AbstractC0603a;
import f6.C1116i;
import i6.InterfaceC1287d;
import k6.AbstractC1362i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class E extends AbstractC1362i implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public Object f9925a;

    /* renamed from: b, reason: collision with root package name */
    public int f9926b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ boolean f9927c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ O f9928d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f9929e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(O o7, int i7, InterfaceC1287d interfaceC1287d) {
        super(2, interfaceC1287d);
        this.f9928d = o7;
        this.f9929e = i7;
    }

    @Override // k6.AbstractC1354a
    public final InterfaceC1287d create(Object obj, InterfaceC1287d interfaceC1287d) {
        E e7 = new E(this.f9928d, this.f9929e, interfaceC1287d);
        e7.f9927c = ((Boolean) obj).booleanValue();
        return e7;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((E) create(bool, (InterfaceC1287d) obj2)).invokeSuspend(C1116i.f13008a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // k6.AbstractC1354a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        boolean z4;
        Object obj2;
        int i7;
        j6.a aVar = j6.a.f14642a;
        int i8 = this.f9926b;
        O o7 = this.f9928d;
        if (i8 == 0) {
            AbstractC0603a.p0(obj);
            z4 = this.f9927c;
            this.f9927c = z4;
            this.f9926b = 1;
            obj = o7.i(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f9925a;
                AbstractC0603a.p0(obj);
                i7 = ((Number) obj).intValue();
                return new C0756d(obj2, obj2 != null ? obj2.hashCode() : 0, i7);
            }
            z4 = this.f9927c;
            AbstractC0603a.p0(obj);
        }
        if (!z4) {
            obj2 = obj;
            i7 = this.f9929e;
            return new C0756d(obj2, obj2 != null ? obj2.hashCode() : 0, i7);
        }
        h0 g3 = o7.g();
        this.f9925a = obj;
        this.f9926b = 2;
        Integer a2 = g3.a();
        if (a2 == aVar) {
            return aVar;
        }
        obj2 = obj;
        obj = a2;
        i7 = ((Number) obj).intValue();
        return new C0756d(obj2, obj2 != null ? obj2.hashCode() : 0, i7);
    }
}
