package sg.bigo.ads.Q0;

import android.content.Context;
import android.os.Parcel;
import java.io.File;
import org.json.JSONObject;
import sg.bigo.ads.R0.t;
import sg.bigo.ads.R0.v;

/* loaded from: classes3.dex */
public final class b extends sg.bigo.ads.U.e {
    public int e;
    public String f;
    public boolean g;
    public boolean h;
    public String i;
    public final sg.bigo.ads.R0.i j;
    public final sg.bigo.ads.R0.h k;
    public final sg.bigo.ads.R0.h l;
    public final t m;
    public final sg.bigo.ads.R0.m n;
    public final v o;
    public final sg.bigo.ads.R0.j p;
    public boolean q;

    public b(Context context, sg.bigo.ads.T0.g gVar) {
        super(context);
        this.f = "";
        this.j = new sg.bigo.ads.R0.i();
        this.k = new sg.bigo.ads.R0.h("rep.maxesads.com");
        this.l = new sg.bigo.ads.R0.h("api.maxesads.com");
        this.m = new t();
        this.n = new sg.bigo.ads.R0.m();
        this.o = new v();
        this.p = new sg.bigo.ads.R0.j(gVar);
        this.i = "SDK";
        this.q = false;
    }

    @Override // sg.bigo.ads.U.e
    public final String a() {
        return "bigoad_antiban_config.dat";
    }

    @Override // sg.bigo.ads.U.e
    public final String b() {
        return "AntiBanConfig";
    }

    public final synchronized String c() {
        return this.f;
    }

    public final String toString() {
        return super.toString();
    }

    public static JSONObject a(JSONObject jSONObject) {
        return jSONObject != null ? jSONObject : new JSONObject();
    }

    @Override // sg.bigo.ads.U.e
    public final void b(Context context) {
        this.b = true;
        if (this.c) {
            try {
                new File(sg.bigo.ads.U.q.a(context), "bigoad_antiban.dat").deleteOnExit();
                new File(sg.bigo.ads.U.q.a(context), "bigoad_api_antiban.dat").deleteOnExit();
            } catch (Exception unused) {
            }
        }
    }

    @Override // sg.bigo.ads.U.g
    public final void a(Parcel parcel) {
        if ((parcel.dataAvail() > 0 ? parcel.readInt() : 5) < 5) {
            return;
        }
        this.e = parcel.dataAvail() > 0 ? parcel.readInt() : 0;
        this.g = sg.bigo.ads.U.n.a(parcel, false);
        this.h = sg.bigo.ads.U.n.a(parcel, false);
        this.i = parcel.dataAvail() > 0 ? parcel.readString() : "SDK";
        sg.bigo.ads.U.n.a(parcel, this.j);
        sg.bigo.ads.U.n.a(parcel, this.k);
        sg.bigo.ads.U.n.a(parcel, this.l);
        sg.bigo.ads.U.n.a(parcel, this.m);
        sg.bigo.ads.U.n.a(parcel, this.n);
        sg.bigo.ads.U.n.a(parcel, this.o);
        sg.bigo.ads.U.n.a(parcel, this.p);
        this.q = sg.bigo.ads.U.n.a(parcel, true);
    }

    @Override // sg.bigo.ads.U.g
    public final void b(Parcel parcel) {
        parcel.writeInt(5);
        parcel.writeInt(this.e);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeString(this.i);
        sg.bigo.ads.U.n.b(parcel, this.j);
        sg.bigo.ads.U.n.b(parcel, this.k);
        sg.bigo.ads.U.n.b(parcel, this.l);
        sg.bigo.ads.U.n.b(parcel, this.m);
        sg.bigo.ads.U.n.b(parcel, this.n);
        sg.bigo.ads.U.n.b(parcel, this.o);
        sg.bigo.ads.U.n.b(parcel, this.p);
        parcel.writeInt(this.q ? 1 : 0);
    }

    public final synchronized void a(String str) {
        this.f = str;
    }
}
