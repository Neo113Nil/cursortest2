package U;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class L implements Parcelable {
    public static final Parcelable.Creator<L> CREATOR = new H.j(17);

    /* renamed from: a, reason: collision with root package name */
    public int f1501a;

    /* renamed from: b, reason: collision with root package name */
    public int f1502b;

    /* renamed from: c, reason: collision with root package name */
    public int f1503c;

    /* renamed from: d, reason: collision with root package name */
    public int[] f1504d;

    /* renamed from: e, reason: collision with root package name */
    public int f1505e;
    public int[] f;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f1506g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1507h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1508i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f1509j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        parcel.writeInt(this.f1501a);
        parcel.writeInt(this.f1502b);
        parcel.writeInt(this.f1503c);
        if (this.f1503c > 0) {
            parcel.writeIntArray(this.f1504d);
        }
        parcel.writeInt(this.f1505e);
        if (this.f1505e > 0) {
            parcel.writeIntArray(this.f);
        }
        parcel.writeInt(this.f1507h ? 1 : 0);
        parcel.writeInt(this.f1508i ? 1 : 0);
        parcel.writeInt(this.f1509j ? 1 : 0);
        parcel.writeList(this.f1506g);
    }
}
