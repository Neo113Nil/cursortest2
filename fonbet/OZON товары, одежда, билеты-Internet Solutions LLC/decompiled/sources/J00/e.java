package J00;

import A00.a;
import Ae.InterfaceC2397i;
import J00.b;
import Sc.r;
import Sc.s;
import i10.C6997c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l20.C7854a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.middleware.MiddlewareImpl$fetchFlow$1", f = "Middleware.kt", l = {233, 238, 243}, m = "invokeSuspend")
/* loaded from: classes7.dex */
final class e extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC2397i<? super A00.a>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    Object f13580d;

    /* renamed from: e, reason: collision with root package name */
    int f13581e;

    /* renamed from: f, reason: collision with root package name */
    private /* synthetic */ Object f13582f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ b<C7854a> f13583g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ a.InterfaceC0008a<? extends A00.a> f13584h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ b.a f13585i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ L00.i f13586j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ C6997c<C7854a> f13587k;

    /* renamed from: l, reason: collision with root package name */
    final /* synthetic */ A00.a f13588l;

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ String f13589m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    e(b<C7854a> bVar, a.InterfaceC0008a<? extends A00.a> interfaceC0008a, b.a aVar, L00.i iVar, C6997c<C7854a> c6997c, A00.a aVar2, String str, kotlin.coroutines.d<? super e> dVar) {
        super(2, dVar);
        this.f13583g = bVar;
        this.f13584h = interfaceC0008a;
        this.f13585i = aVar;
        this.f13586j = iVar;
        this.f13587k = c6997c;
        this.f13588l = aVar2;
        this.f13589m = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        e eVar = new e(this.f13583g, this.f13584h, this.f13585i, this.f13586j, this.f13587k, this.f13588l, this.f13589m, dVar);
        eVar.f13582f = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<? super A00.a> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        return ((e) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x009f, code lost:
    
        if (r13.emit(r7, r12) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
    
        if (r1 == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2397i interfaceC2397i;
        Object n11;
        InterfaceC2397i interfaceC2397i2;
        Throwable b11;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f13581e;
        L00.i iVar = this.f13586j;
        A00.a aVar2 = this.f13588l;
        C6997c<C7854a> c6997c = this.f13587k;
        a.InterfaceC0008a<? extends A00.a> interfaceC0008a = this.f13584h;
        b<C7854a> bVar = this.f13583g;
        if (i11 == 0) {
            s.b(obj);
            interfaceC2397i = (InterfaceC2397i) this.f13582f;
            L00.g b12 = this.f13585i.b();
            this.f13582f = interfaceC2397i;
            this.f13581e = 1;
            n11 = bVar.n(interfaceC0008a, b12, iVar, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                n11 = this.f13580d;
                interfaceC2397i2 = (InterfaceC2397i) this.f13582f;
                s.b(obj);
                interfaceC2397i = interfaceC2397i2;
                b11 = r.b(n11);
                if (b11 != null) {
                    a.p pVar = new a.p(aVar2, this.f13589m, b11);
                    b.h(bVar, pVar, iVar, c6997c);
                    this.f13582f = n11;
                    this.f13580d = null;
                    this.f13581e = 3;
                }
                return Unit.f71690a;
            }
            InterfaceC2397i interfaceC2397i3 = (InterfaceC2397i) this.f13582f;
            s.b(obj);
            n11 = ((r) obj).getF26106a();
            interfaceC2397i = interfaceC2397i3;
        }
        r.Companion companion = r.INSTANCE;
        if (!(n11 instanceof r.b)) {
            P00.k kVar = (P00.k) n11;
            b.i(bVar, kVar, interfaceC0008a, c6997c);
            a.o oVar = new a.o(aVar2, kVar.g().i(), kVar);
            b.g(bVar, oVar, iVar);
            this.f13582f = interfaceC2397i;
            this.f13580d = n11;
            this.f13581e = 2;
            if (interfaceC2397i.emit(oVar, this) != aVar) {
                interfaceC2397i2 = interfaceC2397i;
                interfaceC2397i = interfaceC2397i2;
            }
            return aVar;
        }
        b11 = r.b(n11);
        if (b11 != null) {
        }
        return Unit.f71690a;
    }
}
