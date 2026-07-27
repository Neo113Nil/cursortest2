package sg.bigo.ads.T0;

import android.os.Parcel;

/* loaded from: classes3.dex */
public final class a implements sg.bigo.ads.U.g {

    /* renamed from: a, reason: collision with root package name */
    public long f12547a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;

    @Override // sg.bigo.ads.U.g
    public final void a(Parcel parcel) {
        this.f12547a = parcel.readLong();
        this.b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readString();
        this.g = parcel.readString();
    }

    @Override // sg.bigo.ads.U.g
    public final void b(Parcel parcel) {
        parcel.writeLong(this.f12547a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
    }

    public final String toString() {
        return sg.bigo.ads.U.o.a(new StringBuilder("{expressId=").append(this.f12547a).append(", name='").append(this.b).append("', url='").append(this.c).append("', md5='").append(this.d).append("', style='").append(this.e).append("', adTypes='").append(this.f).append("', fileId='"), this.g, "'}");
    }
}
