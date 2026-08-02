package Ve;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.nl, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4479nl extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4699va f31668e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f31669f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f31670g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ S0 f31671h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ C4699va f31672i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4479nl(C4699va c4699va, AbstractC5434v.b bVar, Ae.M0 m02, kotlin.coroutines.d dVar, S0 s02, C4699va c4699va2) {
        super(2, dVar);
        this.f31668e = c4699va;
        this.f31669f = bVar;
        this.f31670g = m02;
        this.f31671h = s02;
        this.f31672i = c4699va2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4479nl(this.f31668e, this.f31669f, this.f31670g, dVar, this.f31671h, this.f31672i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4479nl) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31667d;
        if (i11 == 0) {
            Sc.s.b(obj);
            Jk jk = new Jk(this.f31670g, null, this.f31671h, this.f31672i);
            this.f31667d = 1;
            if (C5412d0.b(this.f31668e, this.f31669f, jk, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
