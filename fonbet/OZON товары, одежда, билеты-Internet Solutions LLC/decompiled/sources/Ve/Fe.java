package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Fe extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f28996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4357jf f28997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f28998f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f28999g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4668u8 f29000h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fe(C4357jf c4357jf, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, C4668u8 c4668u8) {
        super(2, dVar);
        this.f28997e = c4357jf;
        this.f28998f = bVar;
        this.f28999g = c2406m0;
        this.f29000h = c4668u8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Fe(this.f28997e, this.f28998f, this.f28999g, dVar, this.f29000h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Fe) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f28996d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4155ce c4155ce = new C4155ce(this.f28999g, null, this.f29000h, 0);
            this.f28996d = 1;
            if (C5412d0.b(this.f28997e, this.f28998f, c4155ce, this) == aVar) {
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
