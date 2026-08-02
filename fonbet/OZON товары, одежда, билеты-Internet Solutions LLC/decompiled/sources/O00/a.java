package O00;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f19818a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, String> f19819b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final C0390a f19820c;

    /* renamed from: O00.a$a, reason: collision with other inner class name */
    public static final class C0390a {

        /* renamed from: a, reason: collision with root package name */
        private final long f19821a;

        /* renamed from: b, reason: collision with root package name */
        private final long f19822b;

        public C0390a(long j11, long j12) {
            this.f19821a = j11;
            this.f19822b = j12;
        }

        public final long a() {
            return this.f19822b;
        }

        public final long b() {
            return this.f19821a;
        }
    }

    public a(T t2, Map<String, String> map, @NotNull C0390a metrics) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        this.f19818a = t2;
        this.f19819b = map;
        this.f19820c = metrics;
    }

    @NotNull
    public final C0390a a() {
        return this.f19820c;
    }

    public final T b() {
        return this.f19818a;
    }

    public final Map<String, String> c() {
        return this.f19819b;
    }
}
