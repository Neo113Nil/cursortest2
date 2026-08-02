package Ve;

import Ae.C2406m0;
import android.content.Context;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class r extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31922d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4699va f31923e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f31924f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f31925g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ S0 f31926h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f31927i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C4699va c4699va, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, S0 s02, Context context) {
        super(2, dVar);
        this.f31923e = c4699va;
        this.f31924f = bVar;
        this.f31925g = c2406m0;
        this.f31926h = s02;
        this.f31927i = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new r(this.f31923e, this.f31924f, this.f31925g, dVar, this.f31926h, this.f31927i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((r) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31922d;
        if (i11 == 0) {
            Sc.s.b(obj);
            Hr hr = new Hr(this.f31925g, null, this.f31926h, this.f31927i);
            this.f31922d = 1;
            if (C5412d0.b(this.f31923e, this.f31924f, hr, this) == aVar) {
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
