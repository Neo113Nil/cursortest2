package Ve;

import Ae.C2406m0;
import android.content.Context;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.y1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4774y1 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f32526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4407l7 f32527e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f32528f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f32529g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4378k7 f32530h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f32531i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4774y1(C4407l7 c4407l7, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, C4378k7 c4378k7, Context context) {
        super(2, dVar);
        this.f32527e = c4407l7;
        this.f32528f = bVar;
        this.f32529g = c2406m0;
        this.f32530h = c4378k7;
        this.f32531i = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4774y1(this.f32527e, this.f32528f, this.f32529g, dVar, this.f32530h, this.f32531i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4774y1) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32526d;
        if (i11 == 0) {
            Sc.s.b(obj);
            T0 t02 = new T0(this.f32529g, null, this.f32530h, this.f32531i);
            this.f32526d = 1;
            if (C5412d0.b(this.f32527e, this.f32528f, t02, this) == aVar) {
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
