package Za;

import B3.D;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f35746a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f35747b;

    public a(@NotNull String packageName, @NotNull String pubKey) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(pubKey, "pubKey");
        this.f35746a = packageName;
        this.f35747b = pubKey;
    }

    @NotNull
    public final String a() {
        return this.f35746a;
    }

    @NotNull
    public final String b() {
        return this.f35747b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f35746a, aVar.f35746a) && Intrinsics.d(this.f35747b, aVar.f35747b);
    }

    public final int hashCode() {
        return this.f35747b.hashCode() + (this.f35746a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AppInfo(packageName=");
        sb2.append(this.f35746a);
        sb2.append(", pubKey=");
        return D.c(sb2, this.f35747b, ')');
    }
}
