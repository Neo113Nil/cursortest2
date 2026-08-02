package Ve;

import Ae.C2406m0;
import android.content.Context;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class vr extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f32322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4344j2 f32323e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f32324f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f32325g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C4794yl f32326h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f32327i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr(C4344j2 c4344j2, AbstractC5434v.b bVar, C2406m0 c2406m0, kotlin.coroutines.d dVar, C4794yl c4794yl, Context context) {
        super(2, dVar);
        this.f32323e = c4344j2;
        this.f32324f = bVar;
        this.f32325g = c2406m0;
        this.f32326h = c4794yl;
        this.f32327i = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new vr(this.f32323e, this.f32324f, this.f32325g, dVar, this.f32326h, this.f32327i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((vr) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32322d;
        if (i11 == 0) {
            Sc.s.b(obj);
            Sq sq2 = new Sq(this.f32325g, null, this.f32326h, this.f32327i);
            this.f32322d = 1;
            if (C5412d0.b(this.f32323e, this.f32324f, sq2, this) == aVar) {
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
