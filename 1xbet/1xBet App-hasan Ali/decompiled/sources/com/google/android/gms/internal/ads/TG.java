package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class TG {

    /* renamed from: d, reason: collision with root package name */
    public static final TG f11645d = new TG(new C1292mb[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f11646a;

    /* renamed from: b, reason: collision with root package name */
    public final C1761wv f11647b;

    /* renamed from: c, reason: collision with root package name */
    public int f11648c;

    static {
        Integer.toString(0, 36);
    }

    public TG(C1292mb... c1292mbArr) {
        this.f11647b = AbstractC1044gv.m(c1292mbArr);
        this.f11646a = c1292mbArr.length;
        int i = 0;
        while (i < this.f11647b.f16186n) {
            int i5 = i + 1;
            int i6 = i5;
            while (true) {
                C1761wv c1761wv = this.f11647b;
                if (i6 < c1761wv.f16186n) {
                    if (((C1292mb) c1761wv.get(i)).equals(this.f11647b.get(i6))) {
                        JB.g("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                    i6++;
                }
            }
            i = i5;
        }
    }

    public final C1292mb a(int i) {
        return (C1292mb) this.f11647b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TG.class != obj.getClass()) {
            return false;
        }
        TG tg = (TG) obj;
        return this.f11646a == tg.f11646a && this.f11647b.equals(tg.f11647b);
    }

    public final int hashCode() {
        int i = this.f11648c;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f11647b.hashCode();
        this.f11648c = hashCode;
        return hashCode;
    }
}
