package Ve;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.RedirectActivity;

/* renamed from: Ve.e0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4198e0 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.g f30901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f30902f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f30903g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f30904h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4198e0(androidx.appcompat.app.g gVar, AbstractC5434v.b bVar, Ae.M0 m02, kotlin.coroutines.d dVar, RedirectActivity redirectActivity) {
        super(2, dVar);
        this.f30901e = gVar;
        this.f30902f = bVar;
        this.f30903g = m02;
        this.f30904h = redirectActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4198e0(this.f30901e, this.f30902f, this.f30903g, dVar, this.f30904h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4198e0) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30900d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4716w c4716w = new C4716w(this.f30903g, null, this.f30904h);
            this.f30900d = 1;
            if (C5412d0.b(this.f30901e, this.f30902f, c4716w, this) == aVar) {
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
