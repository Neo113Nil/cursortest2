package Ma0;

import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f17788a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f17789b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f17790c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f17791d;

    public a(@NotNull String name, boolean z11, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f17788a = name;
        this.f17789b = z11;
        this.f17790c = z12;
        this.f17791d = z13;
    }

    @NotNull
    public final String a() {
        return this.f17788a;
    }

    public final boolean b() {
        return this.f17791d;
    }

    public final boolean c() {
        return this.f17789b;
    }

    public final boolean d() {
        return this.f17790c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f17788a, aVar.f17788a) && this.f17789b == aVar.f17789b && this.f17790c == aVar.f17790c && this.f17791d == aVar.f17791d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f17791d) + C3532b.a(C3532b.a(this.f17788a.hashCode() * 31, 31, this.f17789b), 31, this.f17790c);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AppEnvironment(name=");
        sb2.append(this.f17788a);
        sb2.append(", isSelected=");
        sb2.append(this.f17789b);
        sb2.append(", isUserValue=");
        sb2.append(this.f17790c);
        sb2.append(", isLast=");
        return Pk0.a.a(")", sb2, this.f17791d);
    }
}
