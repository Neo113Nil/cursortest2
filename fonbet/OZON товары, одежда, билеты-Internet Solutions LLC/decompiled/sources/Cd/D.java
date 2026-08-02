package Cd;

import Sc.InterfaceC4008j;
import java.util.Map;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class D {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final L f4683a;

    /* renamed from: b, reason: collision with root package name */
    private final L f4684b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Map<Sd.c, L> f4685c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f4686d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f4687e;

    public D() {
        throw null;
    }

    public D(L globalLevel, L l11) {
        Map<Sd.c, L> userDefinedLevelForSpecificAnnotation = U.c();
        Intrinsics.checkNotNullParameter(globalLevel, "globalLevel");
        Intrinsics.checkNotNullParameter(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.f4683a = globalLevel;
        this.f4684b = l11;
        this.f4685c = userDefinedLevelForSpecificAnnotation;
        this.f4686d = Sc.k.b(new C(this));
        L l12 = L.IGNORE;
        this.f4687e = globalLevel == l12 && l11 == l12;
    }

    static String[] a(D d11) {
        Tc.b builder = C7714v.B();
        builder.add(d11.f4683a.a());
        L l11 = d11.f4684b;
        if (l11 != null) {
            builder.add("under-migration:" + l11.a());
        }
        for (Map.Entry<Sd.c, L> entry : d11.f4685c.entrySet()) {
            builder.add("@" + entry.getKey() + ':' + entry.getValue().a());
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return (String[]) builder.B().toArray(new String[0]);
    }

    @NotNull
    public final L b() {
        return this.f4683a;
    }

    public final L c() {
        return this.f4684b;
    }

    @NotNull
    public final Map<Sd.c, L> d() {
        return this.f4685c;
    }

    public final boolean e() {
        return this.f4687e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d11 = (D) obj;
        return this.f4683a == d11.f4683a && this.f4684b == d11.f4684b && Intrinsics.d(this.f4685c, d11.f4685c);
    }

    public final int hashCode() {
        int hashCode = this.f4683a.hashCode() * 31;
        L l11 = this.f4684b;
        return this.f4685c.hashCode() + ((hashCode + (l11 == null ? 0 : l11.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.f4683a + ", migrationLevel=" + this.f4684b + ", userDefinedLevelForSpecificAnnotation=" + this.f4685c + ')';
    }
}
