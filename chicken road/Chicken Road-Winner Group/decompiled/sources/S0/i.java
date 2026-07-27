package S0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class i extends T0.a {
    public static final Parcelable.Creator<i> CREATOR = new H.j(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f1335a;

    /* renamed from: b, reason: collision with root package name */
    public List f1336b;

    public i(int i3, List list) {
        this.f1335a = i3;
        this.f1336b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = F2.b.Q(parcel, 20293);
        F2.b.S(parcel, 1, 4);
        parcel.writeInt(this.f1335a);
        F2.b.P(parcel, 2, this.f1336b);
        F2.b.R(parcel, Q2);
    }
}
