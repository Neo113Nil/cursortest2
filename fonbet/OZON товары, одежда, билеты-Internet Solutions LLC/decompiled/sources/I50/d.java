package I50;

import G.g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f11995a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f11996b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f11997c;

    public d(@NotNull String url, @NotNull String title, boolean z11) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f11995a = url;
        this.f11996b = title;
        this.f11997c = z11;
    }

    public static d a(d dVar, String url) {
        String title = dVar.f11996b;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(title, "title");
        return new d(url, title, dVar.f11997c);
    }

    @NotNull
    public final String b() {
        return this.f11996b;
    }

    @NotNull
    public final String c() {
        return this.f11995a;
    }

    public final boolean d() {
        return this.f11997c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f11995a, dVar.f11995a) && Intrinsics.d(this.f11996b, dVar.f11996b) && this.f11997c == dVar.f11997c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f11997c) + g.a(this.f11995a.hashCode() * 31, 31, this.f11996b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WebViewOptions(url=");
        sb2.append(this.f11995a);
        sb2.append(", title=");
        sb2.append(this.f11996b);
        sb2.append(", isClean=");
        return Pk0.a.a(")", sb2, this.f11997c);
    }
}
