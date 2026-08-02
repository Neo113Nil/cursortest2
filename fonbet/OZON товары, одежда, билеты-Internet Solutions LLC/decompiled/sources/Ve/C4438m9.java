package Ve;

import Ae.C2406m0;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.m9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4438m9 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2406m0 f31570e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4400l0 f31571f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f31572g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4438m9(C2406m0 c2406m0, kotlin.coroutines.d dVar, C4400l0 c4400l0, Context context) {
        super(2, dVar);
        this.f31570e = c2406m0;
        this.f31571f = c4400l0;
        this.f31572g = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4438m9(this.f31570e, dVar, this.f31571f, this.f31572g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4438m9) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31569d;
        if (i11 == 0) {
            Sc.s.b(obj);
            J8 j82 = new J8(this.f31571f, this.f31572g);
            this.f31569d = 1;
            if (this.f31570e.collect(j82, this) == aVar) {
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
