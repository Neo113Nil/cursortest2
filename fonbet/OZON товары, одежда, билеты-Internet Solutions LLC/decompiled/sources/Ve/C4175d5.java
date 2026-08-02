package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.d5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4175d5 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30851d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ S7 f30852e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f30853f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f30854g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ S7 f30855h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4175d5(S7 s72, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, S7 s73) {
        super(2, dVar);
        this.f30852e = s72;
        this.f30853f = bVar;
        this.f30854g = c2406m0;
        this.f30855h = s73;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4175d5(this.f30852e, this.f30853f, this.f30854g, dVar, this.f30855h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4175d5) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30851d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4721w4 c4721w4 = new C4721w4(this.f30854g, null, this.f30855h);
            this.f30851d = 1;
            if (C5412d0.b(this.f30852e, this.f30853f, c4721w4, this) == aVar) {
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
