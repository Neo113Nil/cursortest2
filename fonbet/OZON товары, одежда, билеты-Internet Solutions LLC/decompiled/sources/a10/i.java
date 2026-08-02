package a10;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final L00.j f36204a;

    /* renamed from: b, reason: collision with root package name */
    private final C4919g f36205b;

    public i(@NotNull L00.j raw, C4919g c4919g) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        this.f36204a = raw;
        this.f36205b = c4919g;
    }

    public static i a(i iVar, C4919g c4919g) {
        L00.j raw = iVar.f36204a;
        Intrinsics.checkNotNullParameter(raw, "raw");
        return new i(raw, c4919g);
    }

    @NotNull
    public final L00.j b() {
        return this.f36204a;
    }

    public final C4919g c() {
        return this.f36205b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return Intrinsics.d(this.f36204a, iVar.f36204a) && Intrinsics.d(this.f36205b, iVar.f36205b);
    }

    public final int hashCode() {
        int hashCode = this.f36204a.hashCode() * 31;
        C4919g c4919g = this.f36205b;
        return hashCode + (c4919g == null ? 0 : c4919g.hashCode());
    }

    @NotNull
    public final String toString() {
        return "RedirectResponse(raw=" + this.f36204a + ", redirectMetrics=" + this.f36205b + ")";
    }
}
