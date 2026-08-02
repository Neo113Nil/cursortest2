package Df0;

import B0.C2454a;
import Kk.C3532b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f6702a;

    public g() {
        this(0);
    }

    public final boolean a() {
        return this.f6702a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.getClass();
        return this.f6702a == gVar.f6702a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + C2454a.a(0, C3532b.a(Boolean.hashCode(false) * 31, 31, this.f6702a), 31);
    }

    @NotNull
    public final String toString() {
        return Pk0.a.a(", maxServerConfigs=0, cacheConnection=false)", new StringBuilder("CronetSettings(enableHints=false, disableTlsZeroRtt="), this.f6702a);
    }

    public g(int i11) {
        this.f6702a = true;
    }
}
