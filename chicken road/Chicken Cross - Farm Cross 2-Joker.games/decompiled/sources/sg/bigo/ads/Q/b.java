package sg.bigo.ads.Q;

import android.text.TextUtils;
import sg.bigo.ads.P.s;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdBid;

/* loaded from: classes3.dex */
public abstract class b implements Ad {
    public final sg.bigo.ads.N.d d;
    public sg.bigo.ads.D0.a e;
    public b g;

    /* renamed from: a, reason: collision with root package name */
    public int f12498a = 0;
    public int b = 0;
    public int c = 0;
    public int f = 0;
    public int h = 0;
    public final s i = new s();

    public b(sg.bigo.ads.N.d dVar) {
        this.d = dVar;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Ad ad) {
        if (ad == null) {
            return 1;
        }
        return g() >= (ad instanceof b ? ((b) ad).g() : 0.0d) ? 1 : -1;
    }

    public abstract void a(int i, int i2, String str);

    public void a(String str, int i, String str2) {
    }

    public abstract void a(c cVar);

    public void b(int i) {
        this.b = i;
    }

    public abstract sg.bigo.ads.P.c e();

    public abstract long f();

    public double g() {
        AdBid bid = getBid();
        if (bid != null) {
            return bid.getPrice();
        }
        String h = h();
        long f = f();
        long j = 0;
        if (!TextUtils.isEmpty(h) && f != 0) {
            try {
                long longValue = Long.valueOf(h).longValue();
                int hashCode = String.valueOf(f).hashCode();
                j = ((f ^ longValue) ^ Math.abs(hashCode)) >> 20;
            } catch (Exception unused) {
            }
        }
        return (j * 1.0d) / 1.0E8d;
    }

    public abstract String h();

    public s i() {
        return this.i;
    }

    public abstract void j();

    public abstract void k();

    public int l() {
        int i = this.h + 1;
        this.h = i;
        return i;
    }

    public void a(int i) {
        this.c = i;
    }

    public void a(boolean z, boolean z2) {
        this.f12498a = z2 ? 1 : !z ? 2 : 3;
    }
}
