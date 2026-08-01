package com.inmobi.media;

/* renamed from: com.inmobi.media.vk, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4167vk {

    /* renamed from: a, reason: collision with root package name */
    public final int f7442a;
    public final int b;
    public final int c;

    public C4167vk(int i, int i2, int i3) {
        this.f7442a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4167vk)) {
            return false;
        }
        C4167vk c4167vk = (C4167vk) obj;
        return this.f7442a == c4167vk.f7442a && this.b == c4167vk.b && this.c == c4167vk.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + Hj.a(this.b, Integer.hashCode(this.f7442a) * 31, 31);
    }

    public final String toString() {
        return "SemVer(major=" + this.f7442a + ", minor=" + this.b + ", patch=" + this.c + ")";
    }
}
