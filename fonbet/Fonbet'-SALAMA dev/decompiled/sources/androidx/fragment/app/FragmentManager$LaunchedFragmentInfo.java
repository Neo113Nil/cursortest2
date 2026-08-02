package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
class FragmentManager$LaunchedFragmentInfo implements Parcelable {
    public static final Parcelable.Creator<FragmentManager$LaunchedFragmentInfo> CREATOR = new C0703b(2);

    /* renamed from: a, reason: collision with root package name */
    public String f9330a;

    /* renamed from: b, reason: collision with root package name */
    public int f9331b;

    public FragmentManager$LaunchedFragmentInfo(String str, int i7) {
        this.f9330a = str;
        this.f9331b = i7;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f9330a);
        parcel.writeInt(this.f9331b);
    }
}
