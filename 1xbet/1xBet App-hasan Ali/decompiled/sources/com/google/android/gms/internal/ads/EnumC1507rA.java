package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rA, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC1507rA implements OB {
    f15267l("UNKNOWN_HASH"),
    f15268m("SHA1"),
    f15269n("SHA384"),
    f15270o("SHA256"),
    f15271p("SHA512"),
    f15272q("SHA224"),
    f15273r("UNRECOGNIZED");


    /* renamed from: k, reason: collision with root package name */
    public final int f15275k;

    EnumC1507rA(String str) {
        this.f15275k = r2;
    }

    public final int a() {
        if (this != f15273r) {
            return this.f15275k;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
