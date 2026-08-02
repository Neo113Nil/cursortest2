package RZ;

import P4.f;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final String f24899a;

    /* renamed from: b, reason: collision with root package name */
    private final String f24900b;

    /* renamed from: c, reason: collision with root package name */
    private final long f24901c;

    public b(String str, String str2, long j11) {
        this.f24899a = str;
        this.f24900b = str2;
        this.f24901c = j11;
    }

    public final long a() {
        return this.f24901c;
    }

    public final String b() {
        return this.f24899a;
    }

    public final String d() {
        return this.f24900b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.d(this.f24899a, bVar.f24899a) && Intrinsics.d(this.f24900b, bVar.f24900b);
    }

    public final int hashCode() {
        String str = this.f24899a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f24900b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PageAnalyticsInfo(pageToken=");
        sb2.append(this.f24899a);
        sb2.append(", userToken=");
        sb2.append(this.f24900b);
        sb2.append(", pageTimestamp=");
        return f.a(this.f24901c, ")", sb2);
    }
}
