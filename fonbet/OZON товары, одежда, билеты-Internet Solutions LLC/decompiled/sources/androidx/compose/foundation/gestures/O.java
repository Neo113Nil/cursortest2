package androidx.compose.foundation.gestures;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n0.EnumC8372M;
import org.jetbrains.annotations.NotNull;
import r0.C9113N;
import r0.InterfaceC9141u;

@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollableNode$processMouseWheelEvent$2$1", f = "Scrollable.kt", l = {549}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class O extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f39086d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ N f39087e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ long f39088f;

    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollableNode$processMouseWheelEvent$2$1$1", f = "Scrollable.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC9141u, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f39089d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f39090e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(long j11, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f39090e = j11;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f39090e, dVar);
            aVar.f39089d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC9141u interfaceC9141u, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(interfaceC9141u, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            ((InterfaceC9141u) this.f39089d).b(this.f39090e);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    O(N n11, long j11, kotlin.coroutines.d<? super O> dVar) {
        super(2, dVar);
        this.f39087e = n11;
        this.f39088f = j11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        return new O(this.f39087e, this.f39088f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((O) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f39086d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C9113N c9113n = this.f39087e.f39065q;
            EnumC8372M enumC8372M = EnumC8372M.UserInput;
            a aVar2 = new a(this.f39088f, null);
            this.f39086d = 1;
            if (c9113n.t(enumC8372M, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
