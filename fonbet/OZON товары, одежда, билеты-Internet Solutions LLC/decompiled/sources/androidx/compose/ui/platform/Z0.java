package androidx.compose.ui.platform;

import S0.C3961h0;
import androidx.compose.ui.platform.Y0;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class Z0 {

    /* JADX INFO: Add missing generic type declarations: [R] */
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.ui.platform.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", l = {RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH}, m = "invokeSuspend")
    static final class a<R> extends kotlin.coroutines.jvm.internal.j implements Function1<kotlin.coroutines.d<? super R>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f40802d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function1<Long, R> f40803e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super Long, ? extends R> function1, kotlin.coroutines.d<? super a> dVar) {
            super(1, dVar);
            this.f40803e = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final kotlin.coroutines.d<Unit> create(@NotNull kotlin.coroutines.d<?> dVar) {
            return new a(this.f40803e, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return ((a) create((kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f40802d;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
                return obj;
            }
            Sc.s.b(obj);
            this.f40802d = 1;
            Object v11 = C3961h0.a(getContext()).v(this.f40803e, this);
            return v11 == aVar ? aVar : v11;
        }
    }

    public static final <R> Object a(@NotNull Function1<? super Long, ? extends R> function1, @NotNull kotlin.coroutines.d<? super R> dVar) {
        CoroutineContext context = dVar.getContext();
        Y0.a aVar = Y0.f40783d0;
        Y0 y02 = (Y0) context.get(Y0.a.f40784a);
        if (y02 == null) {
            return C3961h0.a(dVar.getContext()).v(function1, dVar);
        }
        new a(function1, null);
        return y02.R();
    }
}
