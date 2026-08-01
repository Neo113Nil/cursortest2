package sg.bigo.ads.R0;

import android.os.Parcel;
import android.webkit.URLUtil;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.K0.A;

/* loaded from: classes3.dex */
public final class m extends u implements sg.bigo.ads.U.g {
    public static final long g = 1 * 86400000;
    public static final long h = 30 * 60000;
    public long b;
    public long c;
    public ArrayList d;
    public long e;
    public long f;

    public m() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new b("google", "https://drive.google.com/uc?export=download&id=1ms4F7Cn_aInE9oFMMaZEiwMIuMKt1DZc", true));
        this.d = arrayList;
        this.b = g;
        this.c = h;
    }

    public final boolean a() {
        long j = this.e;
        long j2 = this.f;
        if (j == j2) {
            return true;
        }
        long currentTimeMillis = System.currentTimeMillis();
        return j > j2 ? Math.abs(currentTimeMillis - this.e) > this.c : Math.abs(currentTimeMillis - this.f) > this.b;
    }

    @Override // sg.bigo.ads.U.g
    public final void b(Parcel parcel) {
        synchronized (this) {
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
            sg.bigo.ads.U.n.a(parcel, this.d);
            parcel.writeLong(this.e);
            parcel.writeLong(this.f);
        }
    }

    @Override // sg.bigo.ads.R0.u
    public final b a(String str) {
        synchronized (this) {
            if (A.a(this.d)) {
                return null;
            }
            b a2 = u.a(A.a(this.d, new k()));
            if (a2 != null) {
                return a2;
            }
            b a3 = u.a(A.a(this.d, new l()));
            if (a3 != null) {
                return a3;
            }
            return null;
        }
    }

    @Override // sg.bigo.ads.U.g
    public final void a(Parcel parcel) {
        synchronized (this) {
            long j = g;
            if (parcel.dataAvail() > 0) {
                j = parcel.readLong();
            }
            this.b = j;
            long j2 = h;
            if (parcel.dataAvail() > 0) {
                j2 = parcel.readLong();
            }
            this.c = j2;
            ArrayList b = sg.bigo.ads.U.n.b(parcel, b.e);
            this.d = b;
            if (A.a(b)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new b("google", "https://drive.google.com/uc?export=download&id=1ms4F7Cn_aInE9oFMMaZEiwMIuMKt1DZc", true));
                this.d = arrayList;
            }
            this.e = parcel.dataAvail() > 0 ? parcel.readLong() : 0L;
            this.f = parcel.dataAvail() > 0 ? parcel.readLong() : 0L;
        }
    }

    public final void a(JSONObject jSONObject) {
        synchronized (this) {
            long optLong = jSONObject.optLong("suc_interval", g / 1000) * 1000;
            long j = u.f12524a;
            long max = Math.max(optLong, j);
            long max2 = Math.max(jSONObject.optLong("fail_interval", h / 1000) * 1000, j);
            ArrayList arrayList = new ArrayList();
            arrayList.add(new b("google", "https://drive.google.com/uc?export=download&id=1ms4F7Cn_aInE9oFMMaZEiwMIuMKt1DZc", true));
            JSONArray optJSONArray = jSONObject.optJSONArray("urls");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    String optString = optJSONObject.optString("name", "");
                    String optString2 = optJSONObject.optString("url", "");
                    if (URLUtil.isNetworkUrl(optString2)) {
                        arrayList.add(new b(optString, optString2, false));
                    }
                }
            }
            this.b = max;
            this.c = max2;
            this.d = arrayList;
        }
    }
}
