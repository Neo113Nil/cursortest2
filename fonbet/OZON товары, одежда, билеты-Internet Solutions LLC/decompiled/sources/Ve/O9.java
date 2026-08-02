package Ve;

import Ae.C2406m0;
import android.content.Context;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class O9 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Pm f29601e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f29602f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f29603g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4400l0 f29604h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f29605i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O9(Pm pm, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, C4400l0 c4400l0, Context context) {
        super(2, dVar);
        this.f29601e = pm;
        this.f29602f = bVar;
        this.f29603g = c2406m0;
        this.f29604h = c4400l0;
        this.f29605i = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new O9(this.f29601e, this.f29602f, this.f29603g, dVar, this.f29604h, this.f29605i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((O9) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29600d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4438m9 c4438m9 = new C4438m9(this.f29603g, null, this.f29604h, this.f29605i);
            this.f29600d = 1;
            if (C5412d0.b(this.f29601e, this.f29602f, c4438m9, this) == aVar) {
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
