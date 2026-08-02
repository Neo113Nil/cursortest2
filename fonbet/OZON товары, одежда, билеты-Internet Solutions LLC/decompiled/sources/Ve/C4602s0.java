package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.s0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4602s0 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4344j2 f31992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f31993f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f31994g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4344j2 f31995h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4602s0(C4344j2 c4344j2, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, C4344j2 c4344j22) {
        super(2, dVar);
        this.f31992e = c4344j2;
        this.f31993f = bVar;
        this.f31994g = c2406m0;
        this.f31995h = c4344j22;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4602s0(this.f31992e, this.f31993f, this.f31994g, dVar, this.f31995h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4602s0) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31991d;
        if (i11 == 0) {
            Sc.s.b(obj);
            K k11 = new K(this.f31994g, null, this.f31995h);
            this.f31991d = 1;
            if (C5412d0.b(this.f31992e, this.f31993f, k11, this) == aVar) {
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
