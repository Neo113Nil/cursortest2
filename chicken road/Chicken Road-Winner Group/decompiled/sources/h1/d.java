package h1;

import H.j;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class d extends T0.a {
    public static final Parcelable.Creator<d> CREATOR = new j(26);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4989a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4990b;

    public d(ArrayList arrayList, String str) {
        this.f4989a = arrayList;
        this.f4990b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = F2.b.Q(parcel, 20293);
        ArrayList arrayList = this.f4989a;
        if (arrayList != null) {
            int Q3 = F2.b.Q(parcel, 1);
            parcel.writeStringList(arrayList);
            F2.b.R(parcel, Q3);
        }
        F2.b.N(parcel, 2, this.f4990b);
        F2.b.R(parcel, Q2);
    }
}
