package Hi;

import java.util.List;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<l> f11013a;

    /* renamed from: b, reason: collision with root package name */
    private final i f11014b;

    public g() {
        this((List) null, 3);
    }

    @NotNull
    public final List<l> a() {
        return this.f11013a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.d(this.f11013a, gVar.f11013a) && Intrinsics.d(this.f11014b, gVar.f11014b);
    }

    public final int hashCode() {
        int hashCode = this.f11013a.hashCode() * 31;
        i iVar = this.f11014b;
        return hashCode + (iVar == null ? 0 : iVar.hashCode());
    }

    @NotNull
    public final String toString() {
        return "GalleryLaunchResult(media=" + this.f11013a + ", restorableState=" + this.f11014b + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@NotNull List<? extends l> media, i iVar) {
        Intrinsics.checkNotNullParameter(media, "media");
        this.f11013a = media;
        this.f11014b = iVar;
    }

    public g(List list, int i11) {
        this((List<? extends l>) ((i11 & 1) != 0 ? K.f71697a : list), (i) null);
    }
}
