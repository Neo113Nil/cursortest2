package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import spay.sdk.SPaySdkApp;

/* loaded from: classes10.dex */
public final class Sk extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.M f29985d;

    /* renamed from: e, reason: collision with root package name */
    public int f29986e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.M f29987f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SPaySdkApp f29988g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function1 f29989h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sk(kotlin.jvm.internal.M m11, SPaySdkApp sPaySdkApp, Function1 function1, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f29987f = m11;
        this.f29988g = sPaySdkApp;
        this.f29989h = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Sk(this.f29987f, this.f29988g, this.f29989h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Sk) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        kotlin.jvm.internal.M m11;
        T t2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29986e;
        if (i11 == 0) {
            Sc.s.b(obj);
            kotlin.jvm.internal.M m12 = this.f29987f;
            this.f29985d = m12;
            this.f29986e = 1;
            a11 = this.f29988g.a(this.f29989h, this);
            if (a11 == aVar) {
                return aVar;
            }
            m11 = m12;
            t2 = a11;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m11 = this.f29985d;
            Sc.s.b(obj);
            t2 = obj;
        }
        m11.f71787a = t2;
        return Unit.f71690a;
    }
}
