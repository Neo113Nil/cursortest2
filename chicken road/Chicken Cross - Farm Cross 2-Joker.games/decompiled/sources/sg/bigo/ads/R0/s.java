package sg.bigo.ads.R0;

import android.os.Parcel;

/* loaded from: classes3.dex */
public final class s extends b {
    public static final r g = new r();
    public String f;

    public s() {
    }

    @Override // sg.bigo.ads.R0.b, sg.bigo.ads.U.g
    public final void a(Parcel parcel) {
        super.a(parcel);
        this.f = parcel.dataAvail() > 0 ? parcel.readString() : "";
    }

    @Override // sg.bigo.ads.R0.b, sg.bigo.ads.U.g
    public final void b(Parcel parcel) {
        super.b(parcel);
        parcel.writeString(this.f);
    }

    public s(String str, String str2, String str3, boolean z) {
        super(str, str2, z);
        this.f = str3;
    }
}
