package m3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class m extends AbstractC2187a {
    public static final Parcelable.Creator<m> CREATOR = new C2.a(21);

    /* renamed from: k, reason: collision with root package name */
    public final int f18084k;

    /* renamed from: l, reason: collision with root package name */
    public List f18085l;

    public m(int i, List list) {
        this.f18084k = i;
        this.f18085l = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f18084k);
        AbstractC2036a.j0(parcel, 2, this.f18085l);
        AbstractC2036a.m0(parcel, k02);
    }
}
