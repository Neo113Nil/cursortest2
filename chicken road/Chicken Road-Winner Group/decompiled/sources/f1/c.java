package f1;

import H.j;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class c extends T0.a {
    public static final Parcelable.Creator<c> CREATOR = new j(24);

    /* renamed from: a, reason: collision with root package name */
    public final int f4882a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4883b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4884c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4885d;

    public c(int i3, int i4, long j3, long j4) {
        this.f4882a = i3;
        this.f4883b = i4;
        this.f4884c = j3;
        this.f4885d = j4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (this.f4882a == cVar.f4882a && this.f4883b == cVar.f4883b && this.f4884c == cVar.f4884c && this.f4885d == cVar.f4885d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f4883b), Integer.valueOf(this.f4882a), Long.valueOf(this.f4885d), Long.valueOf(this.f4884c)});
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f4882a + " Cell status: " + this.f4883b + " elapsed time NS: " + this.f4885d + " system time ms: " + this.f4884c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = F2.b.Q(parcel, 20293);
        F2.b.S(parcel, 1, 4);
        parcel.writeInt(this.f4882a);
        F2.b.S(parcel, 2, 4);
        parcel.writeInt(this.f4883b);
        F2.b.S(parcel, 3, 8);
        parcel.writeLong(this.f4884c);
        F2.b.S(parcel, 4, 8);
        parcel.writeLong(this.f4885d);
        F2.b.R(parcel, Q2);
    }
}
