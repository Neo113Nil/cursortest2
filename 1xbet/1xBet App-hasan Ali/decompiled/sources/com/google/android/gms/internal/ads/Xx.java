package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
public final class Xx extends AbstractC1673ux {

    /* renamed from: a, reason: collision with root package name */
    public final String f12259a;

    /* renamed from: b, reason: collision with root package name */
    public final Ix f12260b;

    public Xx(String str, Ix ix) {
        this.f12259a = str;
        this.f12260b = ix;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1314mx
    public final boolean a() {
        return this.f12260b != Ix.f9648q;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Xx)) {
            return false;
        }
        Xx xx = (Xx) obj;
        return xx.f12259a.equals(this.f12259a) && xx.f12260b.equals(this.f12260b);
    }

    public final int hashCode() {
        return Objects.hash(Xx.class, this.f12259a, this.f12260b);
    }

    public final String toString() {
        return "LegacyKmsAead Parameters (keyUri: " + this.f12259a + ", variant: " + this.f12260b.f9653l + ")";
    }
}
