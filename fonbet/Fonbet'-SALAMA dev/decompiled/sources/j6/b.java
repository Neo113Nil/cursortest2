package j6;

import a.AbstractC0603a;
import i6.InterfaceC1287d;
import k6.AbstractC1360g;
import kotlin.jvm.functions.Function2;
import t6.h;
import t6.s;

/* loaded from: classes2.dex */
public final class b extends AbstractC1360g {

    /* renamed from: a, reason: collision with root package name */
    public int f14644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function2 f14645b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1287d f14646c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC1287d interfaceC1287d, InterfaceC1287d interfaceC1287d2, Function2 function2) {
        super(interfaceC1287d);
        this.f14645b = function2;
        this.f14646c = interfaceC1287d2;
    }

    @Override // k6.AbstractC1354a
    public final Object invokeSuspend(Object obj) {
        int i7 = this.f14644a;
        if (i7 != 0) {
            if (i7 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f14644a = 2;
            AbstractC0603a.p0(obj);
            return obj;
        }
        this.f14644a = 1;
        AbstractC0603a.p0(obj);
        Function2 function2 = this.f14645b;
        h.c(function2, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
        s.a(2, function2);
        return function2.invoke(this.f14646c, this);
    }
}
