package l;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class o0 extends J.c {
    public static final Parcelable.Creator<o0> CREATOR = new J.b(3);

    /* renamed from: c, reason: collision with root package name */
    public int f9845c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9846d;

    public o0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f9845c = parcel.readInt();
        this.f9846d = parcel.readInt() != 0;
    }

    @Override // J.c, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        super.writeToParcel(parcel, i3);
        parcel.writeInt(this.f9845c);
        parcel.writeInt(this.f9846d ? 1 : 0);
    }
}
