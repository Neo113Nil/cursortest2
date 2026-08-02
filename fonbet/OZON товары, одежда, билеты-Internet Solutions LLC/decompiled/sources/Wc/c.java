package Wc;

import Sc.s;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.U;

/* loaded from: classes.dex */
public final class c extends kotlin.coroutines.jvm.internal.h {

    /* renamed from: d, reason: collision with root package name */
    private int f33446d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function2 f33447e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.d f33448f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kotlin.coroutines.d dVar, kotlin.coroutines.d dVar2, Function2 function2) {
        super(dVar);
        this.f33447e = function2;
        this.f33448f = dVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected final Object invokeSuspend(Object obj) {
        int i11 = this.f33446d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f33446d = 2;
            s.b(obj);
            return obj;
        }
        this.f33446d = 1;
        s.b(obj);
        Function2 function2 = this.f33447e;
        Intrinsics.g(function2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
        U.g(2, function2);
        return function2.invoke(this.f33448f, this);
    }
}
