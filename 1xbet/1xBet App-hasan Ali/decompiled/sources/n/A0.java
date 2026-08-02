package n;

import android.os.Parcel;
import android.os.Parcelable;
import u1.AbstractC2482b;

/* loaded from: classes.dex */
public final class A0 extends AbstractC2482b {
    public static final Parcelable.Creator<A0> CREATOR = new Z.o(1);

    /* renamed from: m, reason: collision with root package name */
    public int f18118m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f18119n;

    public A0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f18118m = parcel.readInt();
        this.f18119n = parcel.readInt() != 0;
    }

    @Override // u1.AbstractC2482b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f18118m);
        parcel.writeInt(this.f18119n ? 1 : 0);
    }
}
