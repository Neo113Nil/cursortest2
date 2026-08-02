package Ve;

import Ae.C2406m0;
import android.content.Context;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.on, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4510on extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31741d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4699va f31742e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f31743f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f31744g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ S0 f31745h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f31746i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ C4699va f31747j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4510on(C4699va c4699va, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, S0 s02, Context context, C4699va c4699va2) {
        super(2, dVar);
        this.f31742e = c4699va;
        this.f31743f = bVar;
        this.f31744g = c2406m0;
        this.f31745h = s02;
        this.f31746i = context;
        this.f31747j = c4699va2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4510on(this.f31742e, this.f31743f, this.f31744g, dVar, this.f31745h, this.f31746i, this.f31747j);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4510on) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31741d;
        if (i11 == 0) {
            Sc.s.b(obj);
            Gj gj2 = new Gj(this.f31744g, null, this.f31745h, this.f31746i, this.f31747j);
            this.f31741d = 1;
            if (C5412d0.b(this.f31742e, this.f31743f, gj2, this) == aVar) {
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
