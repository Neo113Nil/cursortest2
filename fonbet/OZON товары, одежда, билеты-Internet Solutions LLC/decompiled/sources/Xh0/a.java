package Xh0;

import B90.C2618u;
import I0.C3173b;
import N3.C3660k;
import ed.InterfaceC6346b;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final long f34464a;

    /* renamed from: b, reason: collision with root package name */
    private final long f34465b;

    /* renamed from: c, reason: collision with root package name */
    private final long f34466c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final List<b> f34467d;

    @InterfaceC6346b
    /* renamed from: Xh0.a$a, reason: collision with other inner class name */
    public static final class C0624a {
        @NotNull
        public static String a(long j11) {
            return Sh.b.b(j11, "NanosecondsSinceBoot(value=", ")");
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f34468a;

        /* renamed from: b, reason: collision with root package name */
        private final long f34469b;

        public b(String name, long j11) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f34468a = name;
            this.f34469b = j11;
        }

        public final long a() {
            return this.f34469b;
        }

        @NotNull
        public final String b() {
            return this.f34468a;
        }

        @NotNull
        public final String toString() {
            return C3173b.c(new StringBuilder("Step(name='"), this.f34468a, "', duration=", kotlin.time.b.p(this.f34469b), ")");
        }
    }

    public a(long j11, long j12, long j13, List steps) {
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f34464a = j11;
        this.f34465b = j12;
        this.f34466c = j13;
        this.f34467d = steps;
    }

    public final long a() {
        return this.f34466c;
    }

    public final long b() {
        return this.f34465b;
    }

    @NotNull
    public final List<b> c() {
        return this.f34467d;
    }

    @NotNull
    public final String toString() {
        String p11 = kotlin.time.b.p(this.f34464a);
        String a11 = C0624a.a(this.f34465b);
        String a12 = C0624a.a(this.f34466c);
        StringBuilder d11 = C3660k.d("StartupTime(duration=", p11, ", startTimestamp=", a11, ", endTimestamp=");
        d11.append(a12);
        d11.append(", steps=");
        return C2618u.h(d11, this.f34467d, ")");
    }
}
