package sg.bigo.ads.R0;

import android.os.Parcel;
import android.text.TextUtils;

/* loaded from: classes3.dex */
public final class g implements sg.bigo.ads.U.g {
    public static final f h = new f();

    /* renamed from: a, reason: collision with root package name */
    public String f12519a;
    public String b;
    public int c;
    public boolean d = true;
    public int e = 0;
    public long f = 0;
    public int g = 0;

    public g(String str, int i, String str2) {
        this.f12519a = str;
        this.b = str2;
        this.c = i;
    }

    @Override // sg.bigo.ads.U.g
    public final void a(Parcel parcel) {
        this.f12519a = parcel.dataAvail() > 0 ? parcel.readString() : "";
        this.c = parcel.dataAvail() > 0 ? parcel.readInt() : 1;
        this.d = sg.bigo.ads.U.n.a(parcel, true);
        this.b = parcel.dataAvail() > 0 ? parcel.readString() : "";
        this.e = parcel.dataAvail() > 0 ? parcel.readInt() : 0;
        this.f = parcel.dataAvail() > 0 ? parcel.readLong() : 0L;
        this.g = parcel.dataAvail() > 0 ? parcel.readInt() : 0;
    }

    @Override // sg.bigo.ads.U.g
    public final void b(Parcel parcel) {
        parcel.writeString(this.f12519a);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeString(this.b);
        parcel.writeInt(this.e);
        parcel.writeLong(this.f);
        parcel.writeInt(this.g);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            return TextUtils.equals(this.f12519a, ((g) obj).f12519a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f12519a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return super.toString();
    }
}
