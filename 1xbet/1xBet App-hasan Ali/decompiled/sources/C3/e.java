package C3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* loaded from: classes.dex */
public final class e extends AbstractC2187a {
    public static final Parcelable.Creator<e> CREATOR = new C2.a(2);

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f843k;

    /* renamed from: l, reason: collision with root package name */
    public final String f844l;

    public e(ArrayList arrayList, String str) {
        this.f843k = arrayList;
        this.f844l = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.h0(parcel, 1, this.f843k);
        AbstractC2036a.f0(parcel, 2, this.f844l);
        AbstractC2036a.m0(parcel, k02);
    }
}
