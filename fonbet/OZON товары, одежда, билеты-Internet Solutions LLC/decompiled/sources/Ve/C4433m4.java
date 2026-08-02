package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.RedirectActivity;

/* renamed from: Ve.m4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4433m4 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31557d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.g f31558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f31559f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f31560g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RedirectActivity f31561h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4433m4(androidx.appcompat.app.g gVar, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, RedirectActivity redirectActivity) {
        super(2, dVar);
        this.f31558e = gVar;
        this.f31559f = bVar;
        this.f31560g = c2406m0;
        this.f31561h = redirectActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4433m4(this.f31558e, this.f31559f, this.f31560g, dVar, this.f31561h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4433m4) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31557d;
        if (i11 == 0) {
            Sc.s.b(obj);
            I3 i32 = new I3(this.f31560g, null, this.f31561h, 0);
            this.f31557d = 1;
            if (C5412d0.b(this.f31558e, this.f31559f, i32, this) == aVar) {
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
