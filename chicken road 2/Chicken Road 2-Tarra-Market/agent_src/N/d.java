package N;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends R.a {
    public static final Parcelable.Creator<d> CREATOR = new K.c(3);

    /* renamed from: a, reason: collision with root package name */
    public final String f237a;

    /* renamed from: b, reason: collision with root package name */
    public final int f238b;

    /* renamed from: c, reason: collision with root package name */
    public final long f239c;

    public d(String str) {
        this.f237a = str;
        this.f239c = 1L;
        this.f238b = -1;
    }

    public final long a() {
        long j2 = this.f239c;
        return j2 == -1 ? this.f238b : j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f237a;
            if (((str != null && str.equals(dVar.f237a)) || (str == null && dVar.f237a == null)) && a() == dVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f237a, Long.valueOf(a())});
    }

    public final String toString() {
        Y.e eVar = new Y.e(this);
        eVar.m(this.f237a, "name");
        eVar.m(Long.valueOf(a()), "version");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int L = V.a.L(parcel, 20293);
        V.a.I(parcel, 1, this.f237a);
        V.a.N(parcel, 2, 4);
        parcel.writeInt(this.f238b);
        long a2 = a();
        V.a.N(parcel, 3, 8);
        parcel.writeLong(a2);
        V.a.M(parcel, L);
    }

    public d(String str, int i2, long j2) {
        this.f237a = str;
        this.f238b = i2;
        this.f239c = j2;
    }
}
