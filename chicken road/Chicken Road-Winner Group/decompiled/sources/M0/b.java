package M0;

import H.j;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b extends T0.a {
    public static final Parcelable.Creator<b> CREATOR = new j(1);

    /* renamed from: a, reason: collision with root package name */
    public final String f965a;

    /* renamed from: b, reason: collision with root package name */
    public final int f966b;

    public b(String str, int i3) {
        this.f965a = str;
        this.f966b = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = F2.b.Q(parcel, 20293);
        F2.b.N(parcel, 1, this.f965a);
        F2.b.S(parcel, 2, 4);
        parcel.writeInt(this.f966b);
        F2.b.R(parcel, Q2);
    }
}
