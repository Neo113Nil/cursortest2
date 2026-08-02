package Qi0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f23488a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f23489b;

    public e(@NotNull String locator, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(locator, "locator");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f23488a = locator;
        this.f23489b = onClick;
    }

    @NotNull
    public final String a() {
        return this.f23488a;
    }

    @NotNull
    public final Function0<Unit> b() {
        return this.f23489b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.d(this.f23488a, eVar.f23488a) && Intrinsics.d(this.f23489b, eVar.f23489b);
    }

    public final int hashCode() {
        return this.f23489b.hashCode() + (this.f23488a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "SendButtonVO(locator=" + this.f23488a + ", onClick=" + this.f23489b + ")";
    }
}
