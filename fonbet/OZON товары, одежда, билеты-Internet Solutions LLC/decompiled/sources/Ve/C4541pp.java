package Ve;

import Ae.C2406m0;
import android.content.Context;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.pp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4541pp extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Cr f31813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f31814f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f31815g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Cr f31816h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f31817i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4541pp(Cr cr, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, Cr cr2, Context context) {
        super(2, dVar);
        this.f31813e = cr;
        this.f31814f = bVar;
        this.f31815g = c2406m0;
        this.f31816h = cr2;
        this.f31817i = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4541pp(this.f31813e, this.f31814f, this.f31815g, dVar, this.f31816h, this.f31817i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4541pp) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31812d;
        if (i11 == 0) {
            Sc.s.b(obj);
            Po po = new Po(this.f31815g, null, this.f31816h, this.f31817i);
            this.f31812d = 1;
            if (C5412d0.b(this.f31813e, this.f31814f, po, this) == aVar) {
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
