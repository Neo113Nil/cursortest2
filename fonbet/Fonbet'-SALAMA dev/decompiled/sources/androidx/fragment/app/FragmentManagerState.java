package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C0703b(3);

    /* renamed from: a, reason: collision with root package name */
    public ArrayList f9332a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f9333b;

    /* renamed from: c, reason: collision with root package name */
    public BackStackRecordState[] f9334c;

    /* renamed from: d, reason: collision with root package name */
    public int f9335d;

    /* renamed from: e, reason: collision with root package name */
    public String f9336e;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f9337f;

    /* renamed from: x, reason: collision with root package name */
    public ArrayList f9338x;

    /* renamed from: y, reason: collision with root package name */
    public ArrayList f9339y;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.f9332a);
        parcel.writeStringList(this.f9333b);
        parcel.writeTypedArray(this.f9334c, i7);
        parcel.writeInt(this.f9335d);
        parcel.writeString(this.f9336e);
        parcel.writeStringList(this.f9337f);
        parcel.writeTypedList(this.f9338x);
        parcel.writeTypedList(this.f9339y);
    }
}
