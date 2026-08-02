package K1;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    private final z f14887a;

    /* renamed from: b, reason: collision with root package name */
    private final y f14888b;

    public A(z zVar, y yVar) {
        this.f14887a = zVar;
        this.f14888b = yVar;
    }

    public final y a() {
        return this.f14888b;
    }

    public final z b() {
        return this.f14887a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a11 = (A) obj;
        return Intrinsics.d(this.f14888b, a11.f14888b) && Intrinsics.d(this.f14887a, a11.f14887a);
    }

    public final int hashCode() {
        z zVar = this.f14887a;
        int hashCode = (zVar != null ? zVar.hashCode() : 0) * 31;
        y yVar = this.f14888b;
        return hashCode + (yVar != null ? yVar.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f14887a + ", paragraphSyle=" + this.f14888b + ')';
    }

    public A() {
        this(null, new y(0));
    }
}
