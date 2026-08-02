package j3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class d extends AbstractC2187a {
    public static final Parcelable.Creator<d> CREATOR = new C2.a(18);

    /* renamed from: k, reason: collision with root package name */
    public final String f17508k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17509l;

    /* renamed from: m, reason: collision with root package name */
    public final long f17510m;

    public d(int i, long j5, String str) {
        this.f17508k = str;
        this.f17509l = i;
        this.f17510m = j5;
    }

    public final long a() {
        long j5 = this.f17510m;
        return j5 == -1 ? this.f17509l : j5;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f17508k;
            if (((str != null && str.equals(dVar.f17508k)) || (str == null && dVar.f17508k == null)) && a() == dVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17508k, Long.valueOf(a())});
    }

    public final String toString() {
        v3.g gVar = new v3.g(this);
        gVar.s("name", this.f17508k);
        gVar.s("version", Long.valueOf(a()));
        return gVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.f0(parcel, 1, this.f17508k);
        AbstractC2036a.n0(parcel, 2, 4);
        parcel.writeInt(this.f17509l);
        long a5 = a();
        AbstractC2036a.n0(parcel, 3, 8);
        parcel.writeLong(a5);
        AbstractC2036a.m0(parcel, k02);
    }

    public d(String str) {
        this.f17508k = str;
        this.f17510m = 1L;
        this.f17509l = -1;
    }
}
