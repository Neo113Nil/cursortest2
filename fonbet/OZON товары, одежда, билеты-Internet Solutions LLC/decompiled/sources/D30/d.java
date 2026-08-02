package D30;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final String f5776a;

    /* renamed from: b, reason: collision with root package name */
    private final String f5777b;

    public d() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f5776a, dVar.f5776a) && Intrinsics.d(this.f5777b, dVar.f5777b);
    }

    public final int hashCode() {
        String str = this.f5776a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5777b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{iv: ");
        sb2.append(this.f5776a);
        sb2.append(", data: ");
        return o0.c(sb2, this.f5777b, "}");
    }

    public d(String str, String str2) {
        this.f5776a = str;
        this.f5777b = str2;
    }
}
