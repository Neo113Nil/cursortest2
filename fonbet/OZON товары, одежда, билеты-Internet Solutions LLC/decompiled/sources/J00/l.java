package J00;

import A00.a;
import Ae.InterfaceC2397i;
import J00.b;
import Sc.s;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l20.C7854a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.middleware.MiddlewareImpl$multiFetchFlow$1", f = "Middleware.kt", l = {278, 278}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class l extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC2397i<? super P00.k<C7854a>>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f13638d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f13639e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ b<C7854a> f13640f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ a.s f13641g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ b.a f13642h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ A00.e f13643i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ Function1<P00.k<C7854a>, Boolean> f13644j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    l(b<C7854a> bVar, a.s sVar, b.a aVar, A00.e eVar, Function1<? super P00.k<C7854a>, Boolean> function1, kotlin.coroutines.d<? super l> dVar) {
        super(2, dVar);
        this.f13640f = bVar;
        this.f13641g = sVar;
        this.f13642h = aVar;
        this.f13643i = eVar;
        this.f13644j = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        l lVar = new l(this.f13640f, this.f13641g, this.f13642h, this.f13643i, this.f13644j, dVar);
        lVar.f13639e = obj;
        return lVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<? super P00.k<C7854a>> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        return ((l) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
    
        if (r1.emit(r11, r10) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        if (r11 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2397i interfaceC2397i;
        l lVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f13638d;
        if (i11 == 0) {
            s.b(obj);
            interfaceC2397i = (InterfaceC2397i) this.f13639e;
            int d11 = this.f13643i.d() + 1;
            this.f13639e = interfaceC2397i;
            this.f13638d = 1;
            lVar = this;
            obj = b.b(this.f13640f, this.f13641g, this.f13642h, d11, this.f13644j, lVar);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                return Unit.f71690a;
            }
            interfaceC2397i = (InterfaceC2397i) this.f13639e;
            s.b(obj);
            lVar = this;
        }
        lVar.f13639e = null;
        lVar.f13638d = 2;
    }
}
