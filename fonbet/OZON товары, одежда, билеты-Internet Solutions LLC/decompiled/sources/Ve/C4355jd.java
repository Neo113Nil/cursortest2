package Ve;

import android.content.Context;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.jd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4355jd extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Pm f31360e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f31361f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f31362g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4400l0 f31363h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Pm f31364i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Context f31365j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4355jd(Pm pm, AbstractC5434v.b bVar, Ae.M0 m02, kotlin.coroutines.d dVar, C4400l0 c4400l0, Pm pm2, Context context) {
        super(2, dVar);
        this.f31360e = pm;
        this.f31361f = bVar;
        this.f31362g = m02;
        this.f31363h = c4400l0;
        this.f31364i = pm2;
        this.f31365j = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4355jd(this.f31360e, this.f31361f, this.f31362g, dVar, this.f31363h, this.f31364i, this.f31365j);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4355jd) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31359d;
        if (i11 == 0) {
            Sc.s.b(obj);
            Fc fc2 = new Fc(this.f31362g, null, this.f31363h, this.f31364i, this.f31365j);
            this.f31359d = 1;
            if (C5412d0.b(this.f31360e, this.f31361f, fc2, this) == aVar) {
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
