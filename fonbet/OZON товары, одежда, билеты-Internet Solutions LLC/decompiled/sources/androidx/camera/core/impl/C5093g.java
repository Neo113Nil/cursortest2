package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.InterfaceC5086c0;

/* renamed from: androidx.camera.core.impl.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C5093g extends InterfaceC5086c0.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f38292a;

    /* renamed from: b, reason: collision with root package name */
    private final String f38293b;

    /* renamed from: c, reason: collision with root package name */
    private final int f38294c;

    /* renamed from: d, reason: collision with root package name */
    private final int f38295d;

    /* renamed from: e, reason: collision with root package name */
    private final int f38296e;

    /* renamed from: f, reason: collision with root package name */
    private final int f38297f;

    /* renamed from: g, reason: collision with root package name */
    private final int f38298g;

    /* renamed from: h, reason: collision with root package name */
    private final int f38299h;

    /* renamed from: i, reason: collision with root package name */
    private final int f38300i;

    /* renamed from: j, reason: collision with root package name */
    private final int f38301j;

    C5093g(int i11, String str, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f38292a = i11;
        if (str == null) {
            throw new NullPointerException("Null mediaType");
        }
        this.f38293b = str;
        this.f38294c = i12;
        this.f38295d = i13;
        this.f38296e = i14;
        this.f38297f = i15;
        this.f38298g = i16;
        this.f38299h = i17;
        this.f38300i = i18;
        this.f38301j = i19;
    }

    @Override // androidx.camera.core.impl.InterfaceC5086c0.c
    public final int b() {
        return this.f38299h;
    }

    @Override // androidx.camera.core.impl.InterfaceC5086c0.c
    public final int c() {
        return this.f38294c;
    }

    @Override // androidx.camera.core.impl.InterfaceC5086c0.c
    public final int d() {
        return this.f38300i;
    }

    @Override // androidx.camera.core.impl.InterfaceC5086c0.c
    public final int e() {
        return this.f38292a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InterfaceC5086c0.c)) {
            return false;
        }
        InterfaceC5086c0.c cVar = (InterfaceC5086c0.c) obj;
        return this.f38292a == cVar.e() && this.f38293b.equals(cVar.i()) && this.f38294c == cVar.c() && this.f38295d == cVar.f() && this.f38296e == cVar.k() && this.f38297f == cVar.h() && this.f38298g == cVar.j() && this.f38299h == cVar.b() && this.f38300i == cVar.d() && this.f38301j == cVar.g();
    }

    @Override // androidx.camera.core.impl.InterfaceC5086c0.c
    public final int f() {
        return this.f38295d;
    }

    @Override // androidx.camera.core.impl.InterfaceC5086c0.c
    public final int g() {
        return this.f38301j;
    }

    @Override // androidx.camera.core.impl.InterfaceC5086c0.c
    public final int h() {
        return this.f38297f;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.f38292a ^ 1000003) * 1000003) ^ this.f38293b.hashCode()) * 1000003) ^ this.f38294c) * 1000003) ^ this.f38295d) * 1000003) ^ this.f38296e) * 1000003) ^ this.f38297f) * 1000003) ^ this.f38298g) * 1000003) ^ this.f38299h) * 1000003) ^ this.f38300i) * 1000003) ^ this.f38301j;
    }

    @Override // androidx.camera.core.impl.InterfaceC5086c0.c
    @NonNull
    public final String i() {
        return this.f38293b;
    }

    @Override // androidx.camera.core.impl.InterfaceC5086c0.c
    public final int j() {
        return this.f38298g;
    }

    @Override // androidx.camera.core.impl.InterfaceC5086c0.c
    public final int k() {
        return this.f38296e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoProfileProxy{codec=");
        sb2.append(this.f38292a);
        sb2.append(", mediaType=");
        sb2.append(this.f38293b);
        sb2.append(", bitrate=");
        sb2.append(this.f38294c);
        sb2.append(", frameRate=");
        sb2.append(this.f38295d);
        sb2.append(", width=");
        sb2.append(this.f38296e);
        sb2.append(", height=");
        sb2.append(this.f38297f);
        sb2.append(", profile=");
        sb2.append(this.f38298g);
        sb2.append(", bitDepth=");
        sb2.append(this.f38299h);
        sb2.append(", chromaSubsampling=");
        sb2.append(this.f38300i);
        sb2.append(", hdrFormat=");
        return K00.b.e(this.f38301j, "}", sb2);
    }
}
