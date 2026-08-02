package Pe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class p extends v {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f22298a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f22299b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(String body) {
        super(0);
        Intrinsics.checkNotNullParameter(body, "body");
        this.f22298a = true;
        this.f22299b = body.toString();
    }

    @Override // Pe.v
    @NotNull
    public final String b() {
        return this.f22299b;
    }

    public final boolean c() {
        return this.f22298a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.f22298a == pVar.f22298a && Intrinsics.d(this.f22299b, pVar.f22299b);
    }

    public final int hashCode() {
        return this.f22299b.hashCode() + (Boolean.hashCode(this.f22298a) * 31);
    }

    @Override // Pe.v
    @NotNull
    public final String toString() {
        boolean z11 = this.f22298a;
        String str = this.f22299b;
        if (!z11) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        Qe.n.c(str, sb2);
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }
}
