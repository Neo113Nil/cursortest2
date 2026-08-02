package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.dz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0913dz {

    /* renamed from: a, reason: collision with root package name */
    public final Class f13212a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f13213b;

    public /* synthetic */ C0913dz(Class cls, Class cls2) {
        this.f13212a = cls;
        this.f13213b = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0913dz)) {
            return false;
        }
        C0913dz c0913dz = (C0913dz) obj;
        return c0913dz.f13212a.equals(this.f13212a) && c0913dz.f13213b.equals(this.f13213b);
    }

    public final int hashCode() {
        return Objects.hash(this.f13212a, this.f13213b);
    }

    public final String toString() {
        return AbstractC0467k.v(this.f13212a.getSimpleName(), " with primitive type: ", this.f13213b.getSimpleName());
    }
}
