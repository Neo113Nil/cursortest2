package l;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class m0 extends K.c {
    public static final Parcelable.Creator<m0> CREATOR = new K.b(3);

    /* renamed from: c, reason: collision with root package name */
    public int f10906c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10907d;

    public m0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f10906c = parcel.readInt();
        this.f10907d = parcel.readInt() != 0;
    }

    @Override // K.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f10906c);
        parcel.writeInt(this.f10907d ? 1 : 0);
    }
}
