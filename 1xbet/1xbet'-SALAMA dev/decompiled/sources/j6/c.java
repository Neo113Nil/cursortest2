package j6;

import kotlin.jvm.functions.Function2;
import p065i6.d;
import p065i6.i;
import t6.h;
import t6.s;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends p077k6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f14654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f14655c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, i iVar, Function2 function2, d dVar2) {
        super(dVar, iVar);
        this.f14654b = function2;
        this.f14655c = dVar2;
    }

    @Override // p077k6.a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f14653a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f14653a = 2;
            p003a.a.p0(obj);
            return obj;
        }
        this.f14653a = 1;
        p003a.a.p0(obj);
        Function2 function2 = this.f14654b;
        h.c(function2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        s.a(2, function2);
        return function2.invoke(this.f14655c, this);
    }
}
