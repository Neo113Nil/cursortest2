package R2;

import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3", f = "DataStoreImpl.kt", l = {387, 388, 390}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class B extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Serializable f24257d;

    /* renamed from: e, reason: collision with root package name */
    int f24258e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.M<Object> f24259f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C3922p<Object> f24260g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.K f24261h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    B(kotlin.jvm.internal.M<Object> m11, C3922p<Object> c3922p, kotlin.jvm.internal.K k11, kotlin.coroutines.d<? super B> dVar) {
        super(1, dVar);
        this.f24259f = m11;
        this.f24260g = c3922p;
        this.f24261h = k11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
        return new B(this.f24259f, this.f24260g, this.f24261h, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
        return ((B) create(dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        if (r9 != r0) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        Object obj2;
        kotlin.jvm.internal.M<Object> m11;
        T t2;
        kotlin.jvm.internal.K k11;
        Object obj3;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f24258e;
        kotlin.jvm.internal.K k12 = this.f24261h;
        kotlin.jvm.internal.M<Object> m12 = this.f24259f;
        C3922p<Object> c3922p = this.f24260g;
        try {
        } catch (C3909c unused) {
            Object obj4 = m12.f71787a;
            this.f24257d = k12;
            this.f24258e = 3;
            Object s11 = c3922p.s(obj4, true, this);
            obj2 = s11;
        }
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f24257d = m12;
            this.f24258e = 1;
            Object m13 = C3922p.m(c3922p, this);
            if (m13 == aVar) {
                return aVar;
            }
            m11 = m12;
            t2 = m13;
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    k11 = (kotlin.jvm.internal.K) this.f24257d;
                    Sc.s.b(obj);
                    obj3 = obj;
                    k11.f71785a = ((Number) obj3).intValue();
                    return Unit.f71690a;
                }
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k12 = (kotlin.jvm.internal.K) this.f24257d;
                Sc.s.b(obj);
                obj2 = obj;
                k12.f71785a = ((Number) obj2).intValue();
                return Unit.f71690a;
            }
            m11 = (kotlin.jvm.internal.M) this.f24257d;
            Sc.s.b(obj);
            t2 = obj;
        }
        m11.f71787a = t2;
        U p11 = c3922p.p();
        this.f24257d = k12;
        this.f24258e = 2;
        Integer version = p11.getVersion();
        if (version == aVar) {
            return aVar;
        }
        k11 = k12;
        obj3 = version;
        k11.f71785a = ((Number) obj3).intValue();
        return Unit.f71690a;
    }
}
