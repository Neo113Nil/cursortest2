package Ve;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.uj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4679uj extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f32220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1 f32221e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f32222f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f32223g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1 f32224h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4679uj(C1 c12, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, C1 c13) {
        super(2, dVar);
        this.f32221e = c12;
        this.f32222f = bVar;
        this.f32223g = c2406m0;
        this.f32224h = c13;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4679uj(this.f32221e, this.f32222f, this.f32223g, dVar, this.f32224h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4679uj) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32220d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4155ce c4155ce = new C4155ce(this.f32223g, null, this.f32224h, 1);
            this.f32220d = 1;
            if (C5412d0.b(this.f32221e, this.f32222f, c4155ce, this) == aVar) {
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
