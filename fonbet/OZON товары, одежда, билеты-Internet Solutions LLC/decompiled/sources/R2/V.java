package R2;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.InterfaceC10750u;

/* loaded from: classes.dex */
public abstract class V<T> {

    public static final class a<T> extends V<T> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final kotlin.coroutines.jvm.internal.j f24324a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final InterfaceC10750u<T> f24325b;

        /* renamed from: c, reason: collision with root package name */
        private final g0<T> f24326c;

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final CoroutineContext f24327d;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Function2<? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> transform, @NotNull InterfaceC10750u<T> ack, g0<T> g0Var, @NotNull CoroutineContext callerContext) {
            Intrinsics.checkNotNullParameter(transform, "transform");
            Intrinsics.checkNotNullParameter(ack, "ack");
            Intrinsics.checkNotNullParameter(callerContext, "callerContext");
            this.f24324a = (kotlin.coroutines.jvm.internal.j) transform;
            this.f24325b = ack;
            this.f24326c = g0Var;
            this.f24327d = callerContext;
        }

        @NotNull
        public final InterfaceC10750u<T> a() {
            return this.f24325b;
        }

        @NotNull
        public final CoroutineContext b() {
            return this.f24327d;
        }

        public final g0<T> c() {
            return this.f24326c;
        }

        @NotNull
        public final Function2<T, kotlin.coroutines.d<? super T>, Object> d() {
            return (Function2<T, kotlin.coroutines.d<? super T>, Object>) this.f24324a;
        }
    }
}
