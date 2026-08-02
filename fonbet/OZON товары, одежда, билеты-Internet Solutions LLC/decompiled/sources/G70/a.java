package G70;

import B0.C2454a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f9759a;

    /* renamed from: b, reason: collision with root package name */
    private final int f9760b;

    /* renamed from: c, reason: collision with root package name */
    private final C7735q f9761c;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@NotNull String title, int i11, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f9759a = title;
        this.f9760b = i11;
        this.f9761c = (C7735q) function0;
    }

    public final int a() {
        return this.f9760b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.jvm.internal.q] */
    public final Function0<Unit> b() {
        return this.f9761c;
    }

    @NotNull
    public final String c() {
        return this.f9759a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f9759a, aVar.f9759a) && this.f9760b == aVar.f9760b && this.f9761c.equals(aVar.f9761c);
    }

    public final int hashCode() {
        return this.f9761c.hashCode() + C2454a.a(this.f9760b, this.f9759a.hashCode() * 31, 31);
    }

    @NotNull
    public final String toString() {
        return "ActionCard(title=" + this.f9759a + ", icon=" + this.f9760b + ", onCardClick=" + this.f9761c + ")";
    }
}
