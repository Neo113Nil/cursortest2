package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Kn extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ J4 f29366e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f29367f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f29368g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ J4 f29369h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kn(J4 j42, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, J4 j43) {
        super(2, dVar);
        this.f29366e = j42;
        this.f29367f = bVar;
        this.f29368g = c2406m0;
        this.f29369h = j43;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Kn(this.f29366e, this.f29367f, this.f29368g, dVar, this.f29369h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Kn) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29365d;
        if (i11 == 0) {
            Sc.s.b(obj);
            E4 e42 = new E4(this.f29368g, null, this.f29369h, 2);
            this.f29365d = 1;
            if (C5412d0.b(this.f29366e, this.f29367f, e42, this) == aVar) {
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
