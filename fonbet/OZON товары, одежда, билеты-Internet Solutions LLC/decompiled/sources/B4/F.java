package B4;

import B4.A;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final A.a f2498a = new A.a();

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private Map<kotlin.reflect.q, ? extends W<?>> f2499b = kotlin.collections.U.c();

    /* renamed from: c, reason: collision with root package name */
    private String f2500c;

    /* renamed from: d, reason: collision with root package name */
    private String f2501d;

    /* renamed from: e, reason: collision with root package name */
    private String f2502e;

    @NotNull
    public final A a() {
        String str = this.f2500c;
        if (str == null && this.f2501d == null && this.f2502e == null) {
            throw new IllegalStateException("The NavDeepLink must have an uri, action, and/or mimeType.");
        }
        A.a aVar = this.f2498a;
        if (str != null) {
            aVar.d(str);
        }
        String str2 = this.f2501d;
        if (str2 != null) {
            aVar.b(str2);
        }
        String str3 = this.f2502e;
        if (str3 != null) {
            aVar.c(str3);
        }
        return aVar.a();
    }

    public final void b(String str) {
        if (str != null && str.length() == 0) {
            throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.");
        }
        this.f2501d = str;
    }

    public final void c(String str) {
        this.f2502e = str;
    }

    public final void d(String str) {
        this.f2500c = str;
    }
}
