package Cd;

import B4.V;
import Kd.C3515l;
import Kd.EnumC3514k;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C3515l f4774a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Collection<EnumC2741b> f4775b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4776c;

    /* JADX WARN: Multi-variable type inference failed */
    public u(@NotNull C3515l nullabilityQualifier, @NotNull Collection<? extends EnumC2741b> qualifierApplicabilityTypes, boolean z11) {
        Intrinsics.checkNotNullParameter(nullabilityQualifier, "nullabilityQualifier");
        Intrinsics.checkNotNullParameter(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f4774a = nullabilityQualifier;
        this.f4775b = qualifierApplicabilityTypes;
        this.f4776c = z11;
    }

    public static u a(u uVar, C3515l nullabilityQualifier) {
        Intrinsics.checkNotNullParameter(nullabilityQualifier, "nullabilityQualifier");
        Collection<EnumC2741b> qualifierApplicabilityTypes = uVar.f4775b;
        Intrinsics.checkNotNullParameter(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        return new u(nullabilityQualifier, qualifierApplicabilityTypes, uVar.f4776c);
    }

    public final boolean b() {
        return this.f4776c;
    }

    @NotNull
    public final C3515l c() {
        return this.f4774a;
    }

    @NotNull
    public final Collection<EnumC2741b> d() {
        return this.f4775b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return Intrinsics.d(this.f4774a, uVar.f4774a) && Intrinsics.d(this.f4775b, uVar.f4775b) && this.f4776c == uVar.f4776c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4776c) + ((this.f4775b.hashCode() + (this.f4774a.hashCode() * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb2.append(this.f4774a);
        sb2.append(", qualifierApplicabilityTypes=");
        sb2.append(this.f4775b);
        sb2.append(", definitelyNotNull=");
        return V.d(sb2, this.f4776c, ')');
    }

    public /* synthetic */ u(C3515l c3515l, Collection collection) {
        this(c3515l, collection, c3515l.b() == EnumC3514k.NOT_NULL);
    }
}
