package b4;

import G4.l;
import a4.h;
import c4.AbstractC0542c;
import kotlin.jvm.internal.z;

/* renamed from: b4.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0512c extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public int f7296k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i4.e f7297l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ a4.c f7298m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0512c(a4.c cVar, h hVar, i4.e eVar, a4.c cVar2) {
        super(cVar, hVar);
        this.f7297l = eVar;
        this.f7298m = cVar2;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        int i = this.f7296k;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f7296k = 2;
            l.N(obj);
            return obj;
        }
        this.f7296k = 1;
        l.N(obj);
        i4.e eVar = this.f7297l;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>", eVar);
        z.b(2, eVar);
        return eVar.invoke(this.f7298m, this);
    }
}
