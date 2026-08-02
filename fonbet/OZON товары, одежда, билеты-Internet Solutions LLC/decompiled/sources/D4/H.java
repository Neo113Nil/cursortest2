package D4;

import B4.C2581j;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m0.C7989f0;

@kotlin.coroutines.jvm.internal.e(c = "androidx.navigation.compose.NavHostKt$NavHost$29$1$1$1", f = "NavHost.kt", l = {634, 638}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class H extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f5808d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ float f5809e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C7989f0<C2581j> f5810f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C2581j f5811g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    H(float f7, C7989f0<C2581j> c7989f0, C2581j c2581j, kotlin.coroutines.d<? super H> dVar) {
        super(2, dVar);
        this.f5809e = f7;
        this.f5810f = c7989f0;
        this.f5811g = c2581j;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new H(this.f5809e, this.f5810f, this.f5811g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((H) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r2.Q(r7.f5811g, r7) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        if (m0.C7989f0.K(r2, r3, r7) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f5808d;
        C7989f0<C2581j> c7989f0 = this.f5810f;
        float f7 = this.f5809e;
        if (i11 == 0) {
            Sc.s.b(obj);
            if (f7 > 0.0f) {
                this.f5808d = 1;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return Unit.f71690a;
            }
            Sc.s.b(obj);
        }
        if (f7 == 0.0f) {
            this.f5808d = 2;
        }
        return Unit.f71690a;
    }
}
