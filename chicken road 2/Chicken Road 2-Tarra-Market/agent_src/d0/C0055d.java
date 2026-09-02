package d0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: d0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0055d extends R.a {
    public static final Parcelable.Creator<C0055d> CREATOR = new K.c(15);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f896a;

    /* renamed from: b, reason: collision with root package name */
    public final String f897b;

    public C0055d(ArrayList arrayList, String str) {
        this.f896a = arrayList;
        this.f897b = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int L = V.a.L(parcel, 20293);
        ArrayList arrayList = this.f896a;
        if (arrayList != null) {
            int L2 = V.a.L(parcel, 1);
            parcel.writeStringList(arrayList);
            V.a.M(parcel, L2);
        }
        V.a.I(parcel, 2, this.f897b);
        V.a.M(parcel, L);
    }
}
