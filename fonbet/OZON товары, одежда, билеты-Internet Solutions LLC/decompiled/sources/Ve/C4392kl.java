package Ve;

import We.B;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.kl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4392kl extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public We.L f31449d;

    /* renamed from: e, reason: collision with root package name */
    public int f31450e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ B.a f31451f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4589rg f31452g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Fl0.b f31453h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4392kl(B.a aVar, InterfaceC4589rg interfaceC4589rg, Fl0.b bVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f31451f = aVar;
        this.f31452g = interfaceC4589rg;
        this.f31453h = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4392kl(this.f31451f, this.f31452g, this.f31453h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4392kl) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r7 == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31450e;
        B.a chain = this.f31451f;
        InterfaceC4589rg interfaceC4589rg = this.f31452g;
        if (i11 == 0) {
            Sc.s.b(obj);
            We.G request = chain.request();
            this.f31450e = 1;
            obj = ((C4819zi) interfaceC4589rg).b(request, this);
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                We.L l11 = this.f31449d;
                Sc.s.b(obj);
                return l11;
            }
            Sc.s.b(obj);
        }
        We.G request2 = (We.G) obj;
        M1.b.h(request2);
        Intrinsics.checkNotNullParameter(chain, "chain");
        Intrinsics.checkNotNullParameter(request2, "request");
        We.L proceed = chain.proceed(request2);
        M1.b.i(proceed);
        this.f31449d = proceed;
        this.f31450e = 2;
        return ((C4819zi) interfaceC4589rg).c(proceed, this) == aVar ? aVar : proceed;
    }
}
