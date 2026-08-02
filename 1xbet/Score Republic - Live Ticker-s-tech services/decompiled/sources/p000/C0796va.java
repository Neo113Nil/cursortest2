package p000;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: renamed from: va */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0796va implements Parcelable {
    public static final Parcelable.Creator<C0796va> CREATOR = new C0936z2(3);

    /* JADX INFO: renamed from: j */
    public final ArrayList f8146j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f8147k;

    public C0796va(Parcel parcel) {
        this.f8146j = parcel.createStringArrayList();
        this.f8147k = parcel.createTypedArrayList(C0759ua.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f8146j);
        parcel.writeTypedList(this.f8147k);
    }
}
