package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5086c0;

/* renamed from: androidx.camera.core.impl.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5089e extends InterfaceC5086c0.a {

    /* renamed from: a, reason: collision with root package name */
    private final int f38280a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38281b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38282c;

    /* renamed from: d, reason: collision with root package name */
    private final int f38283d;

    /* renamed from: e, reason: collision with root package name */
    private final int f38284e;

    /* renamed from: f, reason: collision with root package name */
    private final int f38285f;

    C5089e(String str, int i11, int i12, int i13, int i14, int i15) {
        this.f38280a = i11;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f38281b = str;
        this.f38282c = i12;
        this.f38283d = i13;
        this.f38284e = i14;
        this.f38285f = i15;
    }

    @Override // androidx.camera.core.impl.InterfaceC5086c0.a
    public final int b() {
        return this.f38282c;
    }

    @Override // androidx.camera.core.impl.InterfaceC5086c0.a
    public final int c() {
        return this.f38284e;
    }

    @Override // androidx.camera.core.impl.InterfaceC5086c0.a
    public final int d() {
        return this.f38280a;
    }

    @Override // androidx.camera.core.impl.InterfaceC5086c0.a
    @NonNull
    public final String e() {
        return this.f38281b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC5086c0.a)) {
            return false;
        }
        InterfaceC5086c0.a aVar = (InterfaceC5086c0.a) obj;
        return this.f38280a == aVar.d() && this.f38281b.equals(aVar.e()) && this.f38282c == aVar.b() && this.f38283d == aVar.g() && this.f38284e == aVar.c() && this.f38285f == aVar.f();
    }

    @Override // androidx.camera.core.impl.InterfaceC5086c0.a
    public final int f() {
        return this.f38285f;
    }

    @Override // androidx.camera.core.impl.InterfaceC5086c0.a
    public final int g() {
        return this.f38283d;
    }

    public final int hashCode() {
        return ((((((((((this.f38280a ^ 1000003) * 1000003) ^ this.f38281b.hashCode()) * 1000003) ^ this.f38282c) * 1000003) ^ this.f38283d) * 1000003) ^ this.f38284e) * 1000003) ^ this.f38285f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AudioProfileProxy{codec=");
        sb2.append(this.f38280a);
        sb2.append(", mediaType=");
        sb2.append(this.f38281b);
        sb2.append(", bitrate=");
        sb2.append(this.f38282c);
        sb2.append(", sampleRate=");
        sb2.append(this.f38283d);
        sb2.append(", channels=");
        sb2.append(this.f38284e);
        sb2.append(", profile=");
        return K00.b.e(this.f38285f, "}", sb2);
    }
}
