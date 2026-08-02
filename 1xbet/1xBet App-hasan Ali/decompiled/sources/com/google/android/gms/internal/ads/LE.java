package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class LE {

    /* renamed from: c, reason: collision with root package name */
    public static final LE f10330c;

    /* renamed from: a, reason: collision with root package name */
    public final long f10331a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10332b;

    static {
        LE le = new LE(0L, 0L);
        new LE(Long.MAX_VALUE, Long.MAX_VALUE);
        new LE(Long.MAX_VALUE, 0L);
        new LE(0L, Long.MAX_VALUE);
        f10330c = le;
    }

    public LE(long j5, long j6) {
        AbstractC1668us.S(j5 >= 0);
        AbstractC1668us.S(j6 >= 0);
        this.f10331a = j5;
        this.f10332b = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && LE.class == obj.getClass()) {
            LE le = (LE) obj;
            if (this.f10331a == le.f10331a && this.f10332b == le.f10332b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f10331a) * 31) + ((int) this.f10332b);
    }
}
