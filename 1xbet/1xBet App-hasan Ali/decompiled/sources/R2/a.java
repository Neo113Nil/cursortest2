package R2;

import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class a extends AbstractC2187a {
    public static final Parcelable.Creator<a> CREATOR = new C2.a(8);

    /* renamed from: k, reason: collision with root package name */
    public final String f5172k;

    /* renamed from: l, reason: collision with root package name */
    public final String f5173l;

    /* renamed from: m, reason: collision with root package name */
    public final String f5174m;

    public a(String str, String str2, String str3) {
        this.f5172k = str;
        this.f5173l = str2;
        this.f5174m = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.f0(parcel, 1, this.f5172k);
        AbstractC2036a.f0(parcel, 2, this.f5173l);
        AbstractC2036a.f0(parcel, 3, this.f5174m);
        AbstractC2036a.m0(parcel, k02);
    }
}
