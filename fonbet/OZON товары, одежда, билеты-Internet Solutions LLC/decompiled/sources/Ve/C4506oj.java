package Ve;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.oj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4506oj extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Mq f31734e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f31735f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f31736g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Mq f31737h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4506oj(Mq mq, AbstractC5434v.b bVar, Ae.M0 m02, kotlin.coroutines.d dVar, Mq mq2) {
        super(2, dVar);
        this.f31734e = mq;
        this.f31735f = bVar;
        this.f31736g = m02;
        this.f31737h = mq2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4506oj(this.f31734e, this.f31735f, this.f31736g, dVar, this.f31737h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C4506oj) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31733d;
        if (i11 == 0) {
            Sc.s.b(obj);
            Li li2 = new Li(this.f31736g, (kotlin.coroutines.d) null, this.f31737h);
            this.f31733d = 1;
            if (C5412d0.b(this.f31734e, this.f31735f, li2, this) == aVar) {
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
