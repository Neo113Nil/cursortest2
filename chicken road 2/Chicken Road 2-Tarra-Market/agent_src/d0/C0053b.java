package d0;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: d0.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053b extends R.a {
    public static final Parcelable.Creator<C0053b> CREATOR = new K.c(14);

    /* renamed from: a, reason: collision with root package name */
    public final int f893a;

    /* renamed from: b, reason: collision with root package name */
    public final int f894b;

    /* renamed from: c, reason: collision with root package name */
    public final Intent f895c;

    public C0053b(int i2, int i3, Intent intent) {
        this.f893a = i2;
        this.f894b = i3;
        this.f895c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int L = V.a.L(parcel, 20293);
        V.a.N(parcel, 1, 4);
        parcel.writeInt(this.f893a);
        V.a.N(parcel, 2, 4);
        parcel.writeInt(this.f894b);
        V.a.H(parcel, 3, this.f895c, i2);
        V.a.M(parcel, L);
    }
}
