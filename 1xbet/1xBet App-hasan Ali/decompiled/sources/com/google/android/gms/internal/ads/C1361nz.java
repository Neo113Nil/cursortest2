package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.nz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1361nz {

    /* renamed from: a, reason: collision with root package name */
    public final Class f14735a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f14736b;

    public /* synthetic */ C1361nz(Class cls, Class cls2) {
        this.f14735a = cls;
        this.f14736b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1361nz)) {
            return false;
        }
        C1361nz c1361nz = (C1361nz) obj;
        return c1361nz.f14735a.equals(this.f14735a) && c1361nz.f14736b.equals(this.f14736b);
    }

    public final int hashCode() {
        return Objects.hash(this.f14735a, this.f14736b);
    }

    public final String toString() {
        return AbstractC0467k.v(this.f14735a.getSimpleName(), " with serialization type: ", this.f14736b.getSimpleName());
    }
}
