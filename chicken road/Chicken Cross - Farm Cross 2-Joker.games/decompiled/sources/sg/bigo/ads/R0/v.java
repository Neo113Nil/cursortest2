package sg.bigo.ads.R0;

import android.os.Parcel;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class v implements sg.bigo.ads.U.g {

    /* renamed from: a, reason: collision with root package name */
    public long f12525a;
    public long b;
    public long c;
    public long d;
    public long e;

    @Override // sg.bigo.ads.U.g
    public final void a(Parcel parcel) {
        synchronized (this) {
            this.f12525a = parcel.dataAvail() > 0 ? parcel.readLong() : 0L;
            this.b = parcel.dataAvail() > 0 ? parcel.readLong() : 0L;
            this.c = parcel.dataAvail() > 0 ? parcel.readLong() : 0L;
            this.d = parcel.dataAvail() > 0 ? parcel.readLong() : 0L;
            this.e = parcel.dataAvail() > 0 ? parcel.readLong() : 0L;
        }
    }

    @Override // sg.bigo.ads.U.g
    public final void b(Parcel parcel) {
        synchronized (this) {
            parcel.writeLong(this.f12525a);
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
            parcel.writeLong(this.d);
            parcel.writeLong(this.e);
        }
    }

    public final String toString() {
        return super.toString();
    }

    public final void a(JSONObject jSONObject) {
        synchronized (this) {
            this.f12525a = jSONObject.optLong("getsdkconfig", 0L) * 1000;
            this.b = jSONObject.optLong("getuniad", 0L) * 1000;
            this.c = jSONObject.optLong("unicallback", 0L) * 1000;
            this.d = jSONObject.optLong("getuniconfig", 0L) * 1000;
            this.e = jSONObject.optLong("reportunibaina", 0L) * 1000;
        }
    }
}
