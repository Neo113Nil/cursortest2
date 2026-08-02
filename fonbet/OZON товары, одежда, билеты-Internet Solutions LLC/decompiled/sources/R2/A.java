package R2;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$2", f = "DataStoreImpl.kt", l = {370, 371}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class A extends kotlin.coroutines.jvm.internal.j implements Function2<Boolean, kotlin.coroutines.d<? super C3911e<Object>>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Object f24252d;

    /* renamed from: e, reason: collision with root package name */
    int f24253e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ boolean f24254f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C3922p<Object> f24255g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ int f24256h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    A(C3922p<Object> c3922p, int i11, kotlin.coroutines.d<? super A> dVar) {
        super(2, dVar);
        this.f24255g = c3922p;
        this.f24256h = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        A a11 = new A(this.f24255g, this.f24256h, dVar);
        a11.f24254f = ((Boolean) obj).booleanValue();
        return a11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, kotlin.coroutines.d<? super C3911e<Object>> dVar) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((A) create(bool2, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
    
        if (r7 == r0) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0055  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean z11;
        Object obj2;
        int i11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i12 = this.f24253e;
        C3922p<Object> c3922p = this.f24255g;
        if (i12 == 0) {
            Sc.s.b(obj);
            z11 = this.f24254f;
            this.f24254f = z11;
            this.f24253e = 1;
            obj = C3922p.m(c3922p, this);
        } else {
            if (i12 != 1) {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj2 = this.f24252d;
                Sc.s.b(obj);
                i11 = ((Number) obj).intValue();
                return new C3911e(obj2 != null ? obj2.hashCode() : 0, i11, obj2);
            }
            z11 = this.f24254f;
            Sc.s.b(obj);
        }
        if (!z11) {
            obj2 = obj;
            i11 = this.f24256h;
            return new C3911e(obj2 != null ? obj2.hashCode() : 0, i11, obj2);
        }
        U p11 = c3922p.p();
        this.f24252d = obj;
        this.f24253e = 2;
        Integer version = p11.getVersion();
        if (version != aVar) {
            obj2 = obj;
            obj = version;
            i11 = ((Number) obj).intValue();
            return new C3911e(obj2 != null ? obj2.hashCode() : 0, i11, obj2);
        }
        return aVar;
    }
}
