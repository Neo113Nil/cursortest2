package D20;

import C.o0;
import G.g;
import Kk.C3532b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f5605a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f5606b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f5607c;

    /* renamed from: d, reason: collision with root package name */
    private final String f5608d;

    public d(@NotNull String key, @NotNull String value, boolean z11, String str) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f5605a = key;
        this.f5606b = value;
        this.f5607c = z11;
        this.f5608d = str;
    }

    @NotNull
    public final String a() {
        return this.f5605a;
    }

    public final String b() {
        return this.f5608d;
    }

    public final boolean c() {
        return this.f5607c;
    }

    @NotNull
    public final String d() {
        return this.f5606b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.d(this.f5605a, dVar.f5605a) && Intrinsics.d(this.f5606b, dVar.f5606b) && this.f5607c == dVar.f5607c && Intrinsics.d(this.f5608d, dVar.f5608d);
    }

    public final int hashCode() {
        int a11 = C3532b.a(g.a(this.f5605a.hashCode() * 31, 31, this.f5606b), 31, this.f5607c);
        String str = this.f5608d;
        return a11 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocalizationResourceRaw(key=");
        sb2.append(this.f5605a);
        sb2.append(", value=");
        sb2.append(this.f5606b);
        sb2.append(", translatable=");
        sb2.append(this.f5607c);
        sb2.append(", pluralQuantifier=");
        return o0.c(sb2, this.f5608d, ")");
    }
}
