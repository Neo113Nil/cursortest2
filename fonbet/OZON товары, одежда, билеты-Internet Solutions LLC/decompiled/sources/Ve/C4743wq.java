package Ve;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.wq, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4743wq extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f32389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4380k9 f32390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Hp f32391f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Context f32392g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4743wq(C4380k9 c4380k9, kotlin.coroutines.d dVar, Hp hp2, Context context) {
        super(2, dVar);
        this.f32390e = c4380k9;
        this.f32391f = hp2;
        this.f32392g = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4743wq(this.f32390e, dVar, this.f32391f, this.f32392g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4743wq) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f32389d;
        if (i11 == 0) {
            Sc.s.b(obj);
            Xp xp = new Xp(this.f32391f, this.f32392g);
            this.f32389d = 1;
            if (this.f32390e.collect(xp, this) == aVar) {
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
