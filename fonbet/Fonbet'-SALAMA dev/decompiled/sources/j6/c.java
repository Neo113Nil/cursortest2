package j6;

import a.AbstractC0603a;
import i6.InterfaceC1287d;
import i6.InterfaceC1292i;
import k6.AbstractC1356c;
import kotlin.jvm.functions.Function2;
import t6.h;
import t6.s;

/* loaded from: classes2.dex */
public final class c extends AbstractC1356c {

    /* renamed from: a, reason: collision with root package name */
    public int f14647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f14648b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1287d f14649c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC1287d interfaceC1287d, InterfaceC1292i interfaceC1292i, Function2 function2, InterfaceC1287d interfaceC1287d2) {
        super(interfaceC1287d, interfaceC1292i);
        this.f14648b = function2;
        this.f14649c = interfaceC1287d2;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f14647a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f14647a = 2;
            AbstractC0603a.p0(obj);
            return obj;
        }
        this.f14647a = 1;
        AbstractC0603a.p0(obj);
        Function2 function2 = this.f14648b;
        h.c(function2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        s.a(2, function2);
        return function2.invoke(this.f14649c, this);
    }
}
