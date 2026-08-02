package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C0703b(1);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f9320a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f9321b;

    public BackStackState(Parcel parcel) {
        this.f9320a = parcel.createStringArrayList();
        this.f9321b = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        parcel.writeStringList(this.f9320a);
        parcel.writeTypedList(this.f9321b);
    }
}
