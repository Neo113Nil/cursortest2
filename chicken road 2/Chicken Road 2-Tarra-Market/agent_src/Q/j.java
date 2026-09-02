package Q;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public final class j extends R.a {
    public static final Parcelable.Creator<j> CREATOR = new K.c(6);

    /* renamed from: a, reason: collision with root package name */
    public final int f445a;

    /* renamed from: b, reason: collision with root package name */
    public List f446b;

    public j(int i2, List list) {
        this.f445a = i2;
        this.f446b = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int L = V.a.L(parcel, 20293);
        V.a.N(parcel, 1, 4);
        parcel.writeInt(this.f445a);
        V.a.K(parcel, 2, this.f446b);
        V.a.M(parcel, L);
    }
}
