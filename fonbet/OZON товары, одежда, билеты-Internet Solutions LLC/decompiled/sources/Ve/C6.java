package Ve;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.RedirectActivity;

/* loaded from: classes10.dex */
public final class C6 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f28738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.g f28739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f28740f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f28741g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f28742h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6(androidx.appcompat.app.g gVar, AbstractC5434v.b bVar, Ae.M0 m02, kotlin.coroutines.d dVar, RedirectActivity redirectActivity) {
        super(2, dVar);
        this.f28739e = gVar;
        this.f28740f = bVar;
        this.f28741g = m02;
        this.f28742h = redirectActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C6(this.f28739e, this.f28740f, this.f28741g, dVar, this.f28742h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C6) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f28738d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4688v c4688v = new C4688v(this.f28741g, null, this.f28742h, 1);
            this.f28738d = 1;
            if (C5412d0.b(this.f28739e, this.f28740f, c4688v, this) == aVar) {
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
