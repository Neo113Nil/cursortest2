package Qj0;

import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import ru.ozon.tracker.process.lifecycle.a;
import ze.C11115c;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.tracker.performance.TraceControllerImpl$addTrace$1", f = "TraceController.kt", l = {320, 325, 328}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class Z extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Tc.b f23601d;

    /* renamed from: e, reason: collision with root package name */
    Tc.b f23602e;

    /* renamed from: f, reason: collision with root package name */
    int f23603f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Y f23604g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ U f23605h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Z(Y y11, U u11, kotlin.coroutines.d<? super Z> dVar) {
        super(2, dVar);
        this.f23604g = y11;
        this.f23605h = u11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new Z(this.f23604g, this.f23605h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((Z) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x006c, code lost:
    
        if (Qj0.Y.t(r3, r8, r7) == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0083, code lost:
    
        if (r1.n(r8, r7) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Tc.b bVar;
        ru.ozon.tracker.performance.d dVar;
        Tc.b bVar2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f23603f;
        Y y11 = this.f23604g;
        if (i11 == 0) {
            Sc.s.b(obj);
            bVar = new Tc.b(1);
            dVar = y11.f23550a;
            this.f23601d = bVar;
            this.f23602e = bVar;
            this.f23603f = 1;
            obj = dVar.b(this.f23605h, this);
            if (obj != aVar) {
                bVar2 = bVar;
            }
            return aVar;
        }
        if (i11 != 1) {
            if (i11 != 2 && i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
            return Unit.f71690a;
        }
        bVar = this.f23602e;
        bVar2 = this.f23601d;
        Sc.s.b(obj);
        bVar.add(obj);
        Tc.b x11 = C7714v.x(bVar2);
        int i12 = a.C2149a.f97837a[ru.ozon.tracker.process.lifecycle.a.b(y11.f23556g).b().ordinal()];
        if (i12 == 1) {
            C11115c c11115c = y11.f23563n;
            this.f23601d = null;
            this.f23602e = null;
            this.f23603f = 2;
        } else {
            if (i12 != 2) {
                throw new Sc.o();
            }
            this.f23601d = null;
            this.f23602e = null;
            this.f23603f = 3;
        }
    }
}
