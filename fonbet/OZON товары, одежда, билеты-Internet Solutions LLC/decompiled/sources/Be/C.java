package Be;

import Ae.InterfaceC2397i;
import fd.InterfaceC6511n;
import kotlin.Unit;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.U;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final InterfaceC6511n<InterfaceC2397i<Object>, Object, kotlin.coroutines.d<? super Unit>, Object> f3554a;

    /* synthetic */ class a extends C7735q implements InterfaceC6511n<InterfaceC2397i<? super Object>, Object, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f3555a = new a(3, InterfaceC2397i.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);

        @Override // fd.InterfaceC6511n
        public final Object invoke(InterfaceC2397i<? super Object> interfaceC2397i, Object obj, kotlin.coroutines.d<? super Unit> dVar) {
            return interfaceC2397i.emit(obj, dVar);
        }
    }

    static {
        a aVar = a.f3555a;
        Intrinsics.g(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        U.g(3, aVar);
        f3554a = aVar;
    }
}
