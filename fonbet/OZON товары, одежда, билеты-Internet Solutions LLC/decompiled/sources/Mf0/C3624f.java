package Mf0;

import org.jetbrains.annotations.NotNull;

/* renamed from: Mf0.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C3624f {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f18031a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f18032b;

    public C3624f(boolean z11, boolean z12) {
        this.f18031a = z11;
        this.f18032b = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3624f)) {
            return false;
        }
        C3624f c3624f = (C3624f) obj;
        return this.f18031a == c3624f.f18031a && this.f18032b == c3624f.f18032b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f18032b) + (Boolean.hashCode(this.f18031a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkConfigKey(cronetEnabled=");
        sb2.append(this.f18031a);
        sb2.append(", gostTlsEnabled=");
        return Pk0.a.a(")", sb2, this.f18032b);
    }
}
