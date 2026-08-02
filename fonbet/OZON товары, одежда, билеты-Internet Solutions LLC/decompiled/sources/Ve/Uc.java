package Ve;

import Ae.C2406m0;
import android.content.Context;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Uc extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4357jf f30114e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f30115f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f30116g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4668u8 f30117h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f30118i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uc(C4357jf c4357jf, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, C4668u8 c4668u8, Context context) {
        super(2, dVar);
        this.f30114e = c4357jf;
        this.f30115f = bVar;
        this.f30116g = c2406m0;
        this.f30117h = c4668u8;
        this.f30118i = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Uc(this.f30114e, this.f30115f, this.f30116g, dVar, this.f30117h, this.f30118i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Uc) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30113d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4614sc c4614sc = new C4614sc(this.f30116g, null, this.f30117h, this.f30118i);
            this.f30113d = 1;
            if (C5412d0.b(this.f30114e, this.f30115f, c4614sc, this) == aVar) {
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
