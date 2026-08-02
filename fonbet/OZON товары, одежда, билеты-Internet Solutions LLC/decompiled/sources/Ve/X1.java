package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.RedirectActivity;

/* loaded from: classes10.dex */
public final class X1 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.g f30313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f30314f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f30315g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f30316h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X1(androidx.appcompat.app.g gVar, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, RedirectActivity redirectActivity) {
        super(2, dVar);
        this.f30313e = gVar;
        this.f30314f = bVar;
        this.f30315g = c2406m0;
        this.f30316h = redirectActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new X1(this.f30313e, this.f30314f, this.f30315g, dVar, this.f30316h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((X1) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30312d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4546q1 c4546q1 = new C4546q1(this.f30315g, null, this.f30316h, 0);
            this.f30312d = 1;
            if (C5412d0.b(this.f30313e, this.f30314f, c4546q1, this) == aVar) {
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
