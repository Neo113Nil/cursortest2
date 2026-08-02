package Qj0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.performance.MetricType;

/* renamed from: Qj0.x, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3903x {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final MetricType f23757a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C3887g f23758b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23759c;

    public C3903x(@NotNull MetricType what, @NotNull C3887g with, boolean z11) {
        Intrinsics.checkNotNullParameter(what, "what");
        Intrinsics.checkNotNullParameter(with, "with");
        this.f23757a = what;
        this.f23758b = with;
        this.f23759c = z11;
    }

    public final boolean a() {
        return this.f23759c;
    }

    @NotNull
    public final InterfaceC3892l b() {
        return this.f23757a;
    }

    @NotNull
    public final InterfaceC3892l c() {
        return this.f23758b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3903x)) {
            return false;
        }
        C3903x c3903x = (C3903x) obj;
        return Intrinsics.d(this.f23757a, c3903x.f23757a) && Intrinsics.d(this.f23758b, c3903x.f23758b) && this.f23759c == c3903x.f23759c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23759c) + ((this.f23758b.hashCode() + (this.f23757a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MetricMergeRule(what=");
        sb2.append(this.f23757a);
        sb2.append(", with=");
        sb2.append(this.f23758b);
        sb2.append(", remove=");
        return Pk0.a.a(")", sb2, this.f23759c);
    }
}
