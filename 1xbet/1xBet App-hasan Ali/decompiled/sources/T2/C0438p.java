package T2;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* renamed from: T2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0438p extends AbstractC2187a {
    public static final Parcelable.Creator<C0438p> CREATOR = new C2.a(11);

    /* renamed from: k, reason: collision with root package name */
    public final String f5730k;

    /* renamed from: l, reason: collision with root package name */
    public final int f5731l;

    public C0438p(String str, int i) {
        this.f5730k = str == null ? "" : str;
        this.f5731l = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.f0(parcel, 1, this.f5730k);
        AbstractC2036a.n0(parcel, 2, 4);
        parcel.writeInt(this.f5731l);
        AbstractC2036a.m0(parcel, k02);
    }
}
