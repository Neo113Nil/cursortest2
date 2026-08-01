package sg.bigo.ads.R0;

import android.os.Parcel;

/* loaded from: classes3.dex */
public class b implements sg.bigo.ads.U.g {
    public static final a e = new a();

    /* renamed from: a, reason: collision with root package name */
    public String f12517a;
    public String b;
    public boolean c;
    public boolean d = true;

    public b() {
    }

    @Override // sg.bigo.ads.U.g
    public void a(Parcel parcel) {
        this.f12517a = parcel.dataAvail() > 0 ? parcel.readString() : "";
        this.b = parcel.dataAvail() > 0 ? parcel.readString() : "";
        this.c = sg.bigo.ads.U.n.a(parcel, false);
    }

    @Override // sg.bigo.ads.U.g
    public void b(Parcel parcel) {
        parcel.writeString(this.f12517a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }

    public final String toString() {
        return super.toString();
    }

    public b(String str, String str2, boolean z) {
        this.f12517a = str;
        this.b = str2;
        this.c = z;
    }
}
