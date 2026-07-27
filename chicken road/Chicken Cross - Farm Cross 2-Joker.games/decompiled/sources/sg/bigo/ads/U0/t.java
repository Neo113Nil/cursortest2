package sg.bigo.ads.U0;

import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f12582a;
    public final int b;
    public boolean c = false;
    public final long d;
    public final long e;
    public long f;

    public t(JSONObject jSONObject) {
        this.f12582a = jSONObject.optInt("play_ad_downloading", 0) == 1;
        this.b = jSONObject.optInt("play_ad_threshold", 50);
        this.d = jSONObject.optLong("play_ad_min_second", 6L) * 1000;
        this.e = jSONObject.optLong("threshold_max_second", 15L) * 1000;
    }

    public final int a() {
        if (!this.f12582a) {
            return 100;
        }
        long j = this.f;
        if (j <= this.d) {
            return 100;
        }
        long j2 = this.e;
        return j <= j2 ? this.b : j < (3 * j2) / 2 ? (int) ((this.b * j2) / j) : (this.b * 2) / 3;
    }
}
