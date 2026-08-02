package Fc0;

import Kk.C3532b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f9329a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f9330b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9331c;

    public a(boolean z11, boolean z12, boolean z13) {
        this.f9329a = z11;
        this.f9330b = z12;
        this.f9331c = z13;
    }

    public final boolean a() {
        return this.f9330b;
    }

    public final boolean b() {
        return this.f9331c;
    }

    public final boolean c() {
        return this.f9329a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f9329a == aVar.f9329a && this.f9330b == aVar.f9330b && this.f9331c == aVar.f9331c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f9331c) + C3532b.a(Boolean.hashCode(this.f9329a) * 31, 31, this.f9330b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CameraPermissionState(permissionGranted=");
        sb2.append(this.f9329a);
        sb2.append(", needRationale=");
        sb2.append(this.f9330b);
        sb2.append(", needSettings=");
        return Pk0.a.a(")", sb2, this.f9331c);
    }
}
