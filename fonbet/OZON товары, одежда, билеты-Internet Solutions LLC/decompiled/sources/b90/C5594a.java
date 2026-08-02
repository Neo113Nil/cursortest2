package b90;

import We.B;
import We.InterfaceC4875q;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.bank.network.FintechCookieJar;

/* renamed from: b90.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5594a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f55739a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f55740b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final FintechCookieJar f55741c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<B> f55742d;

    public C5594a(boolean z11, Map map, @NotNull FintechCookieJar externalCookieJar, Set set) {
        Intrinsics.checkNotNullParameter(externalCookieJar, "externalCookieJar");
        this.f55739a = z11;
        this.f55740b = map;
        this.f55741c = externalCookieJar;
        this.f55742d = set;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map<java.lang.String, java.lang.String>] */
    public final Map<String, String> a() {
        return this.f55740b;
    }

    @NotNull
    public final InterfaceC4875q b() {
        return this.f55741c;
    }

    public final Set<B> c() {
        return this.f55742d;
    }

    public final boolean d() {
        return this.f55739a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5594a)) {
            return false;
        }
        C5594a c5594a = (C5594a) obj;
        return this.f55739a == c5594a.f55739a && this.f55740b.equals(c5594a.f55740b) && Intrinsics.d(this.f55741c, c5594a.f55741c) && Intrinsics.d(this.f55742d, c5594a.f55742d);
    }

    public final int hashCode() {
        int hashCode = (this.f55741c.hashCode() + H00.a.c(Boolean.hashCode(this.f55739a) * 31, 31, this.f55740b)) * 31;
        Set<B> set = this.f55742d;
        return hashCode + (set == null ? 0 : set.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ExternalOkHttpSettings(forceDebug=" + this.f55739a + ", externalAdditionalHeaders=" + this.f55740b + ", externalCookieJar=" + this.f55741c + ", externalNetworkInterceptors=" + this.f55742d + ")";
    }
}
