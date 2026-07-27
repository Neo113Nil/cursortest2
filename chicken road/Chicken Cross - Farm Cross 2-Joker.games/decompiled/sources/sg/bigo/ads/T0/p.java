package sg.bigo.ads.T0;

import android.os.Parcel;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class p implements sg.bigo.ads.U.g {

    /* renamed from: a, reason: collision with root package name */
    public String f12557a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public String l;
    public boolean m;
    public String n;
    public ArrayList o;
    public String p;
    public String q;
    public q r;
    public int s;
    public int t;
    public boolean u;
    public int v;
    public final l w = new l();

    public String a() {
        return this.p;
    }

    @Override // sg.bigo.ads.U.g
    public final void b(Parcel parcel) {
        parcel.writeString(this.f12557a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k);
        parcel.writeString(this.l);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeString(this.n);
        sg.bigo.ads.U.n.a(parcel, this.o);
        parcel.writeInt(this.s);
        parcel.writeString(this.q);
        q qVar = this.r;
        parcel.writeString(qVar == null ? null : qVar.f12558a.toString());
        parcel.writeInt(this.u ? 1 : 0);
        parcel.writeInt(this.t);
        parcel.writeInt(this.v);
        sg.bigo.ads.U.n.b(parcel, this.w);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        ArrayList arrayList = this.o;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(aVar);
            }
        }
        return "{strategyId=" + this.f12557a + ", adType=" + this.b + ", countdown=" + this.c + ", reqTimeout=" + this.d + ", mediaStrategy=" + this.e + ", webViewEnforceDuration=" + this.f + ", videoDirection=" + this.g + ", videoReplay=" + this.h + ", videoMute=" + this.i + ", bannerAutoRefresh=" + this.j + ", bannerRefreshInterval=" + this.k + ", slotId='" + this.l + "', state=" + this.m + ", placementId='" + this.n + "', express=[" + sb.toString() + "], styleId=" + this.q + ", playable=" + this.s + ", isCompanionRenderSupport=" + this.t + ", aucMode=" + this.v + ", nativeAdClickConfig=" + this.w + AbstractJsonLexerKt.END_OBJ;
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (this.b == 4 && !jSONObject.has("interstitial_video_style")) {
                jSONObject = new JSONObject().put("interstitial_video_style", jSONObject);
            }
            this.r = new q(jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // sg.bigo.ads.U.g
    public final void a(Parcel parcel) {
        this.f12557a = parcel.readString();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt();
        this.e = parcel.readInt();
        this.f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.k = parcel.readInt();
        this.l = parcel.readString();
        this.m = parcel.readInt() != 0;
        this.n = parcel.readString();
        this.o = sg.bigo.ads.U.n.b(parcel, new o());
        this.s = parcel.dataAvail() > 0 ? parcel.readInt() : 0;
        this.q = parcel.dataAvail() > 0 ? parcel.readString() : "";
        a(parcel.dataAvail() > 0 ? parcel.readString() : "");
        this.u = sg.bigo.ads.U.n.a(parcel, true);
        this.t = parcel.dataAvail() > 0 ? parcel.readInt() : 0;
        this.v = parcel.dataAvail() > 0 ? parcel.readInt() : 0;
        sg.bigo.ads.U.n.a(parcel, this.w);
    }
}
