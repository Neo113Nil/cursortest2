package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1532rr implements InterfaceC1443pr {

    /* renamed from: a, reason: collision with root package name */
    public final String f15386a;

    public C1532rr(String str) {
        this.f15386a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1532rr) {
            return this.f15386a.equals(((C1532rr) obj).f15386a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15386a.hashCode();
    }

    public final String toString() {
        return this.f15386a;
    }
}
