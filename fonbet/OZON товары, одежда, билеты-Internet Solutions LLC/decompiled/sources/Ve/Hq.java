package Ve;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import xe.C10727i;

/* loaded from: classes10.dex */
public final class Hq extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f29184d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Context f29185e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Function1 f29186f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ spay.sdk.d f29187g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Hq(Context context, Function1 function1, spay.sdk.d dVar, kotlin.coroutines.d dVar2) {
        super(2, dVar2);
        this.f29185e = context;
        this.f29186f = function1;
        this.f29187g = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        Hq hq = new Hq(this.f29185e, this.f29186f, this.f29187g, dVar);
        hq.f29184d = obj;
        return hq;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Hq) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        C10727i.c((xe.M) this.f29184d, null, null, new spay.sdk.b(this.f29185e, this.f29186f, this.f29187g, null), 3);
        return Unit.f71690a;
    }
}
