package b4;

import G4.l;
import c4.AbstractC0546g;
import kotlin.jvm.internal.z;

/* renamed from: b4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0511b extends AbstractC0546g {

    /* renamed from: k, reason: collision with root package name */
    public int f7293k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i4.e f7294l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a4.c f7295m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0511b(a4.c cVar, a4.c cVar2, i4.e eVar) {
        super(cVar);
        this.f7294l = eVar;
        this.f7295m = cVar2;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        int i = this.f7293k;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f7293k = 2;
            l.N(obj);
            return obj;
        }
        this.f7293k = 1;
        l.N(obj);
        i4.e eVar = this.f7294l;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>", eVar);
        z.b(2, eVar);
        return eVar.invoke(this.f7295m, this);
    }
}
