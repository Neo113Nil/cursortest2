package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import java.util.Arrays;
import w1.V0;

/* loaded from: classes.dex */
public final class E {

    /* renamed from: a, reason: collision with root package name */
    public final C0824a f11113a;

    /* renamed from: b, reason: collision with root package name */
    public final Feature f11114b;

    public /* synthetic */ E(C0824a c0824a, Feature feature) {
        this.f11113a = c0824a;
        this.f11114b = feature;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof E)) {
            E e7 = (E) obj;
            if (com.google.android.gms.common.internal.D.m(this.f11113a, e7.f11113a) && com.google.android.gms.common.internal.D.m(this.f11114b, e7.f11114b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11113a, this.f11114b});
    }

    public final String toString() {
        V0 v02 = new V0(this);
        v02.j(this.f11113a, "key");
        v02.j(this.f11114b, "feature");
        return v02.toString();
    }
}
