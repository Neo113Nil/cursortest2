package sg.bigo.ads.R0;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.HashMap;
import sg.bigo.ads.K0.A;
import sg.bigo.ads.K0.I;

/* loaded from: classes3.dex */
public final class t extends u implements sg.bigo.ads.U.g {
    public static final long e = 2 * 3600000;
    public long d;
    public ArrayList c = a();
    public long b = e;

    public static ArrayList a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new s("AWS", "https://ad-host-backup-asia.oss-ap-southeast-1.aliyuncs.com/uni/v2/au.pj", "asia", true));
        arrayList.add(new s("AWS", "https://ad-host-backup-europe.oss-eu-central-1.aliyuncs.com/uni/v2/au.pj", "europe", true));
        arrayList.add(new s("AWS", "https://ad-host-backup-america.oss-us-west-1.aliyuncs.com/uni/v2/au.pj", "america", true));
        return arrayList;
    }

    @Override // sg.bigo.ads.U.g
    public final void b(Parcel parcel) {
        synchronized (this) {
            parcel.writeLong(this.b);
            sg.bigo.ads.U.n.a(parcel, this.c);
            parcel.writeLong(this.d);
        }
    }

    @Override // sg.bigo.ads.R0.u
    public final b a(String str) {
        String str2;
        b bVar = null;
        if (A.a(this.c)) {
            return null;
        }
        HashMap hashMap = sg.bigo.ads.Q0.s.f12515a;
        if (I.a((CharSequence) str) || (str2 = (String) sg.bigo.ads.Q0.s.f12515a.get(str.toLowerCase())) == null) {
            str2 = "";
        }
        synchronized (this) {
            if (!A.a(this.c)) {
                s sVar = (s) u.a(A.a(this.c, new n(str2)));
                if (sVar == null) {
                    ArrayList a2 = A.a(this.c, new o(str2));
                    if (A.a(a2)) {
                        a2 = A.a(this.c, new p());
                        if (A.a(a2)) {
                            sVar = (s) u.a(A.a(this.c, new q()));
                            if (sVar != null) {
                            }
                        }
                    }
                    bVar = u.a(a2);
                }
                return sVar;
            }
            return bVar;
        }
    }

    @Override // sg.bigo.ads.U.g
    public final void a(Parcel parcel) {
        synchronized (this) {
            long j = e;
            if (parcel.dataAvail() > 0) {
                j = parcel.readLong();
            }
            this.b = j;
            ArrayList b = sg.bigo.ads.U.n.b(parcel, s.g);
            this.c = b;
            if (A.a(b)) {
                this.c = a();
            }
            this.d = parcel.dataAvail() > 0 ? parcel.readLong() : 0L;
        }
    }
}
