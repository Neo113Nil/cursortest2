package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.mz, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1316mz {

    /* renamed from: a, reason: collision with root package name */
    public final Class f14557a;

    /* renamed from: b, reason: collision with root package name */
    public final C1419pB f14558b;

    public /* synthetic */ C1316mz(Class cls, C1419pB c1419pB) {
        this.f14557a = cls;
        this.f14558b = c1419pB;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1316mz)) {
            return false;
        }
        C1316mz c1316mz = (C1316mz) obj;
        return c1316mz.f14557a.equals(this.f14557a) && c1316mz.f14558b.equals(this.f14558b);
    }

    public final int hashCode() {
        return Objects.hash(this.f14557a, this.f14558b);
    }

    public final String toString() {
        return AbstractC0467k.v(this.f14557a.getSimpleName(), ", object identifier: ", String.valueOf(this.f14558b));
    }
}
