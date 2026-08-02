package androidx.compose.ui.platform;

import Sc.C4005g;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2", f = "PlatformTextInputModifierNode.kt", l = {252}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class E0 extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC5289u1, kotlin.coroutines.d<?>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f40634d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f40635e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ kotlin.coroutines.jvm.internal.j f40636f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ F0 f40637g;

    public static final class a implements InterfaceC5289u1 {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ InterfaceC5289u1 f40638a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC5289u1 f40639b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AtomicReference f40640c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ F0 f40641d;

        a(InterfaceC5289u1 interfaceC5289u1, AtomicReference atomicReference, F0 f02) {
            this.f40639b = interfaceC5289u1;
            this.f40640c = atomicReference;
            this.f40641d = f02;
            this.f40638a = interfaceC5289u1;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // androidx.compose.ui.platform.InterfaceC5286t1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Wc.a a(@NotNull InterfaceC5272o1 interfaceC5272o1, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
            B0 b02;
            int i11;
            if (cVar instanceof B0) {
                b02 = (B0) cVar;
                int i12 = b02.f40609f;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    b02.f40609f = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = b02.f40607d;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = b02.f40609f;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        D0 d02 = new D0(this.f40641d, interfaceC5272o1, this.f40639b, null);
                        b02.f40609f = 1;
                        if (e1.h.b(this.f40640c, C0.f40611b, d02, b02) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Sc.s.b(obj);
                    }
                    throw new C4005g();
                }
            }
            b02 = new B0(this, cVar);
            Object obj2 = b02.f40607d;
            Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
            i11 = b02.f40609f;
            if (i11 != 0) {
            }
            throw new C4005g();
        }

        @Override // xe.M
        @NotNull
        public final CoroutineContext getCoroutineContext() {
            return this.f40638a.getCoroutineContext();
        }

        @Override // androidx.compose.ui.platform.InterfaceC5286t1
        @NotNull
        public final View getView() {
            return this.f40638a.getView();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    E0(Function2<? super InterfaceC5289u1, ? super kotlin.coroutines.d<?>, ? extends Object> function2, F0 f02, kotlin.coroutines.d<? super E0> dVar) {
        super(2, dVar);
        this.f40636f = (kotlin.coroutines.jvm.internal.j) function2;
        this.f40637g = f02;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        E0 e02 = new E0(this.f40636f, this.f40637g, dVar);
        e02.f40635e = obj;
        return e02;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC5289u1 interfaceC5289u1, kotlin.coroutines.d<?> dVar) {
        return ((E0) create(interfaceC5289u1, dVar)).invokeSuspend(Unit.f71690a);
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f40634d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a((InterfaceC5289u1) this.f40635e, new AtomicReference(null), this.f40637g);
            this.f40634d = 1;
            if (this.f40636f.invoke(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        throw new C4005g();
    }
}
