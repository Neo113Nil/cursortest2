package sg.bigo.ads.R0;

import android.os.Parcel;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class j implements sg.bigo.ads.U.g {

    /* renamed from: a, reason: collision with root package name */
    public int f12521a = 3;
    public int b = 2;
    public int c = 12;
    public int d = 3;
    public int e = 3;
    public int f = 10;
    public int g = 5;
    public final sg.bigo.ads.T0.g h;

    public j(sg.bigo.ads.T0.g gVar) {
        this.h = gVar;
    }

    public final boolean a(int i) {
        sg.bigo.ads.T0.g gVar = this.h;
        sg.bigo.ads.P.q qVar = gVar != null ? gVar.B : null;
        if (qVar != null) {
            return qVar.a(i);
        }
        return false;
    }

    @Override // sg.bigo.ads.U.g
    public final void b(Parcel parcel) {
        synchronized (this) {
            parcel.writeInt(this.f12521a);
            parcel.writeInt(this.b);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }
    }

    public final String toString() {
        return super.toString();
    }

    @Override // sg.bigo.ads.U.g
    public final void a(Parcel parcel) {
        this.f12521a = parcel.dataAvail() > 0 ? parcel.readInt() : 3;
        this.b = parcel.dataAvail() > 0 ? parcel.readInt() : 2;
        this.c = parcel.dataAvail() > 0 ? parcel.readInt() : 12;
        this.d = parcel.dataAvail() > 0 ? parcel.readInt() : 3;
        this.e = parcel.dataAvail() > 0 ? parcel.readInt() : 3;
        this.f = parcel.dataAvail() > 0 ? parcel.readInt() : 10;
        this.g = parcel.dataAvail() > 0 ? parcel.readInt() : 5;
    }

    public final void a(JSONObject jSONObject) {
        synchronized (this) {
            this.f12521a = jSONObject.optInt("sdk_config", 3);
            this.b = jSONObject.optInt("report", 2);
            this.c = jSONObject.optInt("config_ad", 12);
            this.d = jSONObject.optInt("callback", 3);
            this.e = jSONObject.optInt("vast_wrapper", 3);
            this.f = jSONObject.optInt("tracker", 10);
            this.g = jSONObject.optInt("creative", 5);
        }
    }
}
