package Ve;

import android.content.Context;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.yb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4784yb extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f32561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Pm f32562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f32563f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f32564g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4400l0 f32565h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f32566i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4784yb(Pm pm, AbstractC5434v.b bVar, Ae.M0 m02, kotlin.coroutines.d dVar, C4400l0 c4400l0, Context context) {
        super(2, dVar);
        this.f32562e = pm;
        this.f32563f = bVar;
        this.f32564g = m02;
        this.f32565h = c4400l0;
        this.f32566i = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4784yb(this.f32562e, this.f32563f, this.f32564g, dVar, this.f32565h, this.f32566i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4784yb) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32561d;
        if (i11 == 0) {
            Sc.s.b(obj);
            Ua ua = new Ua(this.f32564g, null, this.f32565h, this.f32566i);
            this.f32561d = 1;
            if (C5412d0.b(this.f32562e, this.f32563f, ua, this) == aVar) {
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
