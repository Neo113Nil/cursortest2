package Ve;

import Ae.C2406m0;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.sc, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4614sc extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f32038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f32039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4668u8 f32040f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f32041g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4614sc(C2406m0 c2406m0, kotlin.coroutines.d dVar, C4668u8 c4668u8, Context context) {
        super(2, dVar);
        this.f32039e = c2406m0;
        this.f32040f = c4668u8;
        this.f32041g = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4614sc(this.f32039e, dVar, this.f32040f, this.f32041g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4614sc) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32038d;
        if (i11 == 0) {
            Sc.s.b(obj);
            Nb nb2 = new Nb(this.f32040f, this.f32041g);
            this.f32038d = 1;
            if (this.f32039e.collect(nb2, this) == aVar) {
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
