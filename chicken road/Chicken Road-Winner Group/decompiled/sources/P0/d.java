package P0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends T0.a {
    public static final Parcelable.Creator<d> CREATOR = new H.j(4);

    /* renamed from: a, reason: collision with root package name */
    public final String f1128a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1129b;

    /* renamed from: c, reason: collision with root package name */
    public final long f1130c;

    public d(String str) {
        this.f1128a = str;
        this.f1130c = 1L;
        this.f1129b = -1;
    }

    public final long a() {
        long j3 = this.f1130c;
        return j3 == -1 ? this.f1129b : j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            String str = this.f1128a;
            if (((str != null && str.equals(dVar.f1128a)) || (str == null && dVar.f1128a == null)) && a() == dVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1128a, Long.valueOf(a())});
    }

    public final String toString() {
        a1.e eVar = new a1.e(this);
        eVar.u(this.f1128a, "name");
        eVar.u(Long.valueOf(a()), "version");
        return eVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = F2.b.Q(parcel, 20293);
        F2.b.N(parcel, 1, this.f1128a);
        F2.b.S(parcel, 2, 4);
        parcel.writeInt(this.f1129b);
        long a3 = a();
        F2.b.S(parcel, 3, 8);
        parcel.writeLong(a3);
        F2.b.R(parcel, Q2);
    }

    public d(String str, int i3, long j3) {
        this.f1128a = str;
        this.f1129b = i3;
        this.f1130c = j3;
    }
}
