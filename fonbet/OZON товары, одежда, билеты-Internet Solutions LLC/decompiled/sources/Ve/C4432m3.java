package Ve;

import Ae.C2406m0;
import android.content.Context;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.m3, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4432m3 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4407l7 f31552e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f31553f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f31554g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4378k7 f31555h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f31556i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4432m3(C4407l7 c4407l7, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, C4378k7 c4378k7, Context context) {
        super(2, dVar);
        this.f31552e = c4407l7;
        this.f31553f = bVar;
        this.f31554g = c2406m0;
        this.f31555h = c4378k7;
        this.f31556i = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4432m3(this.f31552e, this.f31553f, this.f31554g, dVar, this.f31555h, this.f31556i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4432m3) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31551d;
        if (i11 == 0) {
            Sc.s.b(obj);
            I2 i22 = new I2(this.f31554g, null, this.f31555h, this.f31556i);
            this.f31551d = 1;
            if (C5412d0.b(this.f31552e, this.f31553f, i22, this) == aVar) {
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
