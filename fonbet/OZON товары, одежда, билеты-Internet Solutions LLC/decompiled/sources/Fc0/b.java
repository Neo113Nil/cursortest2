package Fc0;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f9332a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9333b;

    public b(boolean z11, boolean z12) {
        this.f9332a = z11;
        this.f9333b = z12;
    }

    public final boolean a() {
        return this.f9333b;
    }

    public final boolean b() {
        return this.f9332a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f9332a == bVar.f9332a && this.f9333b == bVar.f9333b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9333b) + (Boolean.hashCode(this.f9332a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CameraPreviewState(preview=");
        sb2.append(this.f9332a);
        sb2.append(", backCamera=");
        return Pk0.a.a(")", sb2, this.f9333b);
    }
}
