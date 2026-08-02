package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* renamed from: com.google.android.gms.internal.ads.aF, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0752aF {

    /* renamed from: d, reason: collision with root package name */
    public static final C0752aF f12648d;

    /* renamed from: a, reason: collision with root package name */
    public final int f12649a;

    /* renamed from: b, reason: collision with root package name */
    public final int f12650b;

    /* renamed from: c, reason: collision with root package name */
    public final AbstractC1177jv f12651c;

    static {
        C0752aF c0752aF;
        if (AbstractC1260lo.f14419a >= 33) {
            C1132iv c1132iv = new C1132iv(4);
            for (int i = 1; i <= 10; i++) {
                c1132iv.f(Integer.valueOf(AbstractC1260lo.m(i)));
            }
            c0752aF = new C0752aF(2, c1132iv.h());
        } else {
            c0752aF = new C0752aF(2, 10);
        }
        f12648d = c0752aF;
    }

    public C0752aF(int i, int i5) {
        this.f12649a = i;
        this.f12650b = i5;
        this.f12651c = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0752aF)) {
            return false;
        }
        C0752aF c0752aF = (C0752aF) obj;
        return this.f12649a == c0752aF.f12649a && this.f12650b == c0752aF.f12650b && Objects.equals(this.f12651c, c0752aF.f12651c);
    }

    public final int hashCode() {
        AbstractC1177jv abstractC1177jv = this.f12651c;
        return (((this.f12649a * 31) + this.f12650b) * 31) + (abstractC1177jv == null ? 0 : abstractC1177jv.hashCode());
    }

    public final String toString() {
        return "AudioProfile[format=" + this.f12649a + ", maxChannelCount=" + this.f12650b + ", channelMasks=" + String.valueOf(this.f12651c) + "]";
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r2.h() == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0752aF(int i, Set set) {
        AbstractC1177jv m5;
        this.f12649a = i;
        Set set2 = set;
        int i5 = AbstractC1177jv.f14189m;
        if ((set2 instanceof AbstractC1177jv) && !(set2 instanceof SortedSet)) {
            m5 = (AbstractC1177jv) set2;
        }
        Object[] array = set2.toArray();
        m5 = AbstractC1177jv.m(array.length, array);
        this.f12651c = m5;
        Lv g5 = m5.g();
        int i6 = 0;
        while (g5.hasNext()) {
            i6 = Math.max(i6, Integer.bitCount(((Integer) g5.next()).intValue()));
        }
        this.f12650b = i6;
    }
}
