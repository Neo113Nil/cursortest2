package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class M8 {

    /* renamed from: a, reason: collision with root package name */
    public final WG f10604a;

    static {
        new Sm().b();
        Integer.toString(0, 36);
    }

    public /* synthetic */ M8(WG wg) {
        this.f10604a = wg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof M8) {
            return this.f10604a.equals(((M8) obj).f10604a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10604a.hashCode();
    }
}
