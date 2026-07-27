package sg.bigo.ads.R0;

import android.os.Parcel;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class e implements sg.bigo.ads.U.g {

    /* renamed from: a, reason: collision with root package name */
    public String f12518a;
    public int b;
    public String c;

    public e(String str, int i, String str2) {
        this.f12518a = TextUtils.isEmpty(str) ? "all" : str.toLowerCase();
        this.b = i;
        this.c = TextUtils.isEmpty(str2) ? "all" : str2.toLowerCase();
    }

    @Override // sg.bigo.ads.U.g
    public final void a(Parcel parcel) {
        this.f12518a = parcel.dataAvail() > 0 ? parcel.readString() : "";
        this.b = parcel.dataAvail() > 0 ? parcel.readInt() : 0;
        this.c = parcel.dataAvail() > 0 ? parcel.readString() : "all";
    }

    @Override // sg.bigo.ads.U.g
    public final void b(Parcel parcel) {
        parcel.writeString(this.f12518a);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return TextUtils.equals(this.f12518a, eVar.f12518a) && this.b == eVar.b && TextUtils.equals(this.c, eVar.c);
    }

    public final int hashCode() {
        return (this.f12518a + "_" + this.b + "_" + this.c).hashCode();
    }

    public final String toString() {
        return super.toString();
    }
}
