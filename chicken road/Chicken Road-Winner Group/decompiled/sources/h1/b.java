package h1;

import H.j;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b extends T0.a {
    public static final Parcelable.Creator<b> CREATOR = new j(25);

    /* renamed from: a, reason: collision with root package name */
    public final int f4986a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4987b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f4988c;

    public b(int i3, int i4, Intent intent) {
        this.f4986a = i3;
        this.f4987b = i4;
        this.f4988c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int Q2 = F2.b.Q(parcel, 20293);
        F2.b.S(parcel, 1, 4);
        parcel.writeInt(this.f4986a);
        F2.b.S(parcel, 2, 4);
        parcel.writeInt(this.f4987b);
        F2.b.M(parcel, 3, this.f4988c, i3);
        F2.b.R(parcel, Q2);
    }
}
