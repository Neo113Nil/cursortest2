package Ve;

import Ae.C2406m0;
import android.content.Context;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.x6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4751x6 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f32464d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4699va f32465e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f32466f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f32467g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ S0 f32468h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f32469i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4751x6(C4699va c4699va, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, S0 s02, Context context) {
        super(2, dVar);
        this.f32465e = c4699va;
        this.f32466f = bVar;
        this.f32467g = c2406m0;
        this.f32468h = s02;
        this.f32469i = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4751x6(this.f32465e, this.f32466f, this.f32467g, dVar, this.f32468h, this.f32469i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4751x6) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32464d;
        if (i11 == 0) {
            Sc.s.b(obj);
            W5 w52 = new W5(this.f32467g, null, this.f32468h, this.f32469i);
            this.f32464d = 1;
            if (C5412d0.b(this.f32465e, this.f32466f, w52, this) == aVar) {
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
