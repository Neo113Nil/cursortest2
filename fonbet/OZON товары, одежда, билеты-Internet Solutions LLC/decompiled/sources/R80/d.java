package R80;

import Kk.C3532b;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f24797a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Pattern> f24798b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<String> f24799c;

    public d(@NotNull String deeplink, Set set, Set set2) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f24797a = deeplink;
        this.f24798b = set;
        this.f24799c = set2;
    }

    public static d a(d dVar, String deeplink) {
        dVar.getClass();
        Set<Pattern> set = dVar.f24798b;
        Set<String> set2 = dVar.f24799c;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        return new d(deeplink, set, set2);
    }

    @NotNull
    public final String b() {
        return this.f24797a;
    }

    public final Set<Pattern> c() {
        return this.f24798b;
    }

    public final Set<String> d() {
        return this.f24799c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f24797a, dVar.f24797a) && Intrinsics.d(this.f24798b, dVar.f24798b) && Intrinsics.d(this.f24799c, dVar.f24799c);
    }

    public final int hashCode() {
        int a11 = C3532b.a(this.f24797a.hashCode() * 31, 31, false);
        Set<Pattern> set = this.f24798b;
        int hashCode = (a11 + (set == null ? 0 : set.hashCode())) * 31;
        Set<String> set2 = this.f24799c;
        return hashCode + (set2 != null ? set2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "DeeplinkValidatorParams(deeplink=" + this.f24797a + ", andGo=false, urlPatterns=" + this.f24798b + ", validSchemes=" + this.f24799c + ")";
    }
}
