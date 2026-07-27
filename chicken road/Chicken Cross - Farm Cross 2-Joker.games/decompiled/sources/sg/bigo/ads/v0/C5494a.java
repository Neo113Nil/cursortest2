package sg.bigo.ads.v0;

import android.os.Parcel;
import sg.bigo.ads.U.g;

/* renamed from: sg.bigo.ads.v0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5494a implements g {

    /* renamed from: a, reason: collision with root package name */
    public double f13358a;
    public double b;
    public String c;
    public String d;
    public String e;
    public long f;

    public C5494a() {
        this.f = 0L;
    }

    @Override // sg.bigo.ads.U.g
    public final void a(Parcel parcel) {
        this.f13358a = parcel.readDouble();
        this.b = parcel.readDouble();
        this.c = parcel.readString();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = parcel.readLong();
    }

    @Override // sg.bigo.ads.U.g
    public final void b(Parcel parcel) {
        parcel.writeDouble(this.f13358a);
        parcel.writeDouble(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeLong(this.f);
    }

    public final String toString() {
        return "{longitude=" + this.f13358a + ", latitude=" + this.b + ", countryCode='" + this.c + "', state='" + this.d + "', city='" + this.e + "', updateTime='" + this.f + "'}";
    }

    public C5494a(Parcel parcel) {
        a(parcel);
    }
}
