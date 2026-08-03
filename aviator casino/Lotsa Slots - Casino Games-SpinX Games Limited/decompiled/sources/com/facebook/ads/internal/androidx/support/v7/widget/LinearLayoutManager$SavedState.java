package com.facebook.ads.internal.androidx.support.v7.widget;

/* loaded from: assets/audience_network/classes2.dex */
public class LinearLayoutManager$SavedState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState> CREATOR = new com.facebook.ads.redexgen.core.C0977Qi();
    public int A00;
    public int A01;
    public boolean A02;

    public LinearLayoutManager$SavedState() {
    }

    public LinearLayoutManager$SavedState(android.os.Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt() == 1;
    }

    public LinearLayoutManager$SavedState(com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState linearLayoutManager$SavedState) {
        this.A01 = linearLayoutManager$SavedState.A01;
        this.A00 = linearLayoutManager$SavedState.A00;
        this.A02 = linearLayoutManager$SavedState.A02;
    }

    public final void A00() {
        this.A01 = -1;
    }

    public final boolean A01() {
        return this.A01 >= 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }
}
