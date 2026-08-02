package C;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.K;
import androidx.camera.core.impl.N0;
import androidx.camera.core.impl.Z0;

/* loaded from: classes8.dex */
public interface a0 {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public static final K.b f4153a = new K.b(6000);

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final a0 f4154a;

        /* renamed from: b, reason: collision with root package name */
        private long f4155b;

        public a(@NonNull a0 a0Var) {
            this.f4154a = a0Var;
            this.f4155b = a0Var.a();
        }

        @NonNull
        public final a0 a() {
            a0 a0Var = this.f4154a;
            boolean z11 = a0Var instanceof N0;
            long j11 = this.f4155b;
            return z11 ? ((N0) a0Var).b(j11) : new Z0(j11, a0Var);
        }
    }

    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        @NonNull
        public static final b f4156d = new b(0, false, false);

        /* renamed from: e, reason: collision with root package name */
        @NonNull
        public static final b f4157e = new b(500, true, false);

        /* renamed from: f, reason: collision with root package name */
        @NonNull
        public static b f4158f;

        /* renamed from: a, reason: collision with root package name */
        private final long f4159a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f4160b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f4161c;

        static {
            new b(100L, true, false);
            f4158f = new b(0L, false, true);
        }

        private b(long j11, boolean z11, boolean z12) {
            this.f4160b = z11;
            this.f4159a = j11;
            if (z12) {
                x2.i.a("shouldRetry must be false when completeWithoutFailure is set to true", !z11);
            }
            this.f4161c = z12;
        }

        public final long a() {
            return this.f4159a;
        }

        public final boolean b() {
            return this.f4161c;
        }

        public final boolean c() {
            return this.f4160b;
        }
    }

    static {
        new androidx.camera.core.impl.K(6000L);
    }

    default long a() {
        return 0L;
    }

    @NonNull
    b c(@NonNull androidx.camera.core.impl.J j11);
}
