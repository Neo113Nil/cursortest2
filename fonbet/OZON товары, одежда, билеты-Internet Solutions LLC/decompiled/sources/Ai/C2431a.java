package Ai;

import Kk.C3532b;
import org.jetbrains.annotations.NotNull;

/* renamed from: Ai.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C2431a {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f1228a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f1229b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f1230c;

    public C2431a() {
        this(false, false, false);
    }

    public final boolean a() {
        return this.f1230c;
    }

    public final boolean b() {
        return this.f1229b;
    }

    public final boolean c() {
        return this.f1228a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2431a)) {
            return false;
        }
        C2431a c2431a = (C2431a) obj;
        c2431a.getClass();
        return this.f1228a == c2431a.f1228a && this.f1229b == c2431a.f1229b && this.f1230c == c2431a.f1230c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f1230c) + C3532b.a(C3532b.a(Boolean.hashCode(false) * 31, 31, this.f1228a), 31, this.f1229b);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CameraPermissionConfig(requireAudioAtEntry=false, requireReadImagesAtEntry=");
        sb2.append(this.f1228a);
        sb2.append(", requireLegacyExternalWrite=");
        sb2.append(this.f1229b);
        sb2.append(", legacyExternalWriteOnAndroidQ=");
        return Pk0.a.a(")", sb2, this.f1230c);
    }

    public C2431a(boolean z11, boolean z12, boolean z13) {
        this.f1228a = z11;
        this.f1229b = z12;
        this.f1230c = z13;
    }
}
