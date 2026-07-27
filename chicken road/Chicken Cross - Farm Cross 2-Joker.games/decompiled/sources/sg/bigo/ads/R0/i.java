package sg.bigo.ads.R0;

import android.os.Parcel;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class i extends h {
    public static final long n = 1 * 3600000;
    public static final long o = 5 * 60000;
    public static final long p = 30 * 1000;
    public long k;
    public long l;
    public long m;

    public i() {
        super("cfg.sonicsads.com");
        this.k = n;
    }

    @Override // sg.bigo.ads.R0.h, sg.bigo.ads.U.g
    public final void a(Parcel parcel) {
        super.a(parcel);
        long j = n;
        if (parcel.dataAvail() > 0) {
            j = parcel.readLong();
        }
        this.k = j;
        this.l = parcel.dataAvail() > 0 ? parcel.readLong() : 0L;
        this.m = parcel.dataAvail() > 0 ? parcel.readLong() : 0L;
    }

    @Override // sg.bigo.ads.R0.h, sg.bigo.ads.U.g
    public final void b(Parcel parcel) {
        super.b(parcel);
        parcel.writeLong(this.k);
        parcel.writeLong(this.l);
        parcel.writeLong(this.m);
    }

    public final boolean c() {
        long j = this.l;
        long j2 = this.m;
        if (j == j2) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        return j > j2 ? Math.abs(currentTimeMillis - this.l) > o : Math.abs(currentTimeMillis - this.m) > this.k;
    }

    @Override // sg.bigo.ads.R0.h
    public final void a(JSONObject jSONObject, boolean z, String str, int i) {
        super.a(jSONObject, z, str, i);
        this.k = Math.max(jSONObject.optLong("interval", n / 1000) * 1000, p);
    }
}
