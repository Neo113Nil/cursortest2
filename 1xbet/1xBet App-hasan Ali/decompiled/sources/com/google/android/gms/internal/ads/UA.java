package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public enum UA implements OB {
    f11742l("UNKNOWN_PREFIX"),
    f11743m("TINK"),
    f11744n("LEGACY"),
    f11745o("RAW"),
    f11746p("CRUNCHY"),
    f11747q("UNRECOGNIZED");


    /* renamed from: k, reason: collision with root package name */
    public final int f11749k;

    UA(String str) {
        this.f11749k = r2;
    }

    public static UA b(int i) {
        if (i == 0) {
            return f11742l;
        }
        if (i == 1) {
            return f11743m;
        }
        if (i == 2) {
            return f11744n;
        }
        if (i == 3) {
            return f11745o;
        }
        if (i != 4) {
            return null;
        }
        return f11746p;
    }

    public final int a() {
        if (this != f11747q) {
            return this.f11749k;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
