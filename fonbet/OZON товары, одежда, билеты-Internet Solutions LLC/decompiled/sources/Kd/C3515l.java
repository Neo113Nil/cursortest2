package Kd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Kd.l, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C3515l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final EnumC3514k f15919a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f15920b;

    public C3515l(@NotNull EnumC3514k qualifier, boolean z11) {
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        this.f15919a = qualifier;
        this.f15920b = z11;
    }

    public static C3515l a(C3515l c3515l, EnumC3514k qualifier, boolean z11, int i11) {
        if ((i11 & 1) != 0) {
            qualifier = c3515l.f15919a;
        }
        if ((i11 & 2) != 0) {
            z11 = c3515l.f15920b;
        }
        c3515l.getClass();
        Intrinsics.checkNotNullParameter(qualifier, "qualifier");
        return new C3515l(qualifier, z11);
    }

    @NotNull
    public final EnumC3514k b() {
        return this.f15919a;
    }

    public final boolean c() {
        return this.f15920b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3515l)) {
            return false;
        }
        C3515l c3515l = (C3515l) obj;
        return this.f15919a == c3515l.f15919a && this.f15920b == c3515l.f15920b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15920b) + (this.f15919a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb2.append(this.f15919a);
        sb2.append(", isForWarningOnly=");
        return B4.V.d(sb2, this.f15920b, ')');
    }
}
