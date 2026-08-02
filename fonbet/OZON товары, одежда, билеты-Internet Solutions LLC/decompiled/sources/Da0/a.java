package Da0;

import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f6284a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f6285b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f6286c;

    public a(@NotNull String name, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f6284a = name;
        this.f6285b = z11;
        this.f6286c = z12;
    }

    @NotNull
    public final String a() {
        return this.f6284a;
    }

    public final boolean b() {
        return this.f6285b;
    }

    public final boolean c() {
        return this.f6286c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.d(this.f6284a, aVar.f6284a) && this.f6285b == aVar.f6285b && this.f6286c == aVar.f6286c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f6286c) + C3532b.a(this.f6284a.hashCode() * 31, 31, this.f6285b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Env(name=");
        sb2.append(this.f6284a);
        sb2.append(", isSelected=");
        sb2.append(this.f6285b);
        sb2.append(", isUserValue=");
        return Pk0.a.a(")", sb2, this.f6286c);
    }
}
