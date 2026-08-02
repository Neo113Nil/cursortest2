package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Mm {

    /* renamed from: b, reason: collision with root package name */
    public static final Mm f10718b = new Mm();

    /* renamed from: a, reason: collision with root package name */
    public Mt f10719a;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public final Mt a() {
        if (this.f10719a == null) {
            this.f10719a = new Mt(12);
        }
        return this.f10719a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Mm.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 486696559;
    }
}
