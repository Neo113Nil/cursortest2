package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class Ny {

    /* renamed from: a, reason: collision with root package name */
    public final C1091hx f10875a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10876b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10877c;

    /* renamed from: d, reason: collision with root package name */
    public final String f10878d;

    public /* synthetic */ Ny(C1091hx c1091hx, int i, String str, String str2) {
        this.f10875a = c1091hx;
        this.f10876b = i;
        this.f10877c = str;
        this.f10878d = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Ny)) {
            return false;
        }
        Ny ny = (Ny) obj;
        return this.f10875a == ny.f10875a && this.f10876b == ny.f10876b && this.f10877c.equals(ny.f10877c) && this.f10878d.equals(ny.f10878d);
    }

    public final int hashCode() {
        return Objects.hash(this.f10875a, Integer.valueOf(this.f10876b), this.f10877c, this.f10878d);
    }

    public final String toString() {
        return "(status=" + this.f10875a + ", keyId=" + this.f10876b + ", keyType='" + this.f10877c + "', keyPrefix='" + this.f10878d + "')";
    }
}
