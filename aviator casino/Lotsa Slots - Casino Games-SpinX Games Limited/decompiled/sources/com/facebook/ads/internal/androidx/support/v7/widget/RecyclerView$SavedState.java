package com.facebook.ads.internal.androidx.support.v7.widget;

/* loaded from: assets/audience_network/classes2.dex */
public class RecyclerView$SavedState extends com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState {
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState> CREATOR = new com.facebook.ads.redexgen.core.RC();
    public android.os.Parcelable A00;

    public RecyclerView$SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = parcel.readParcelable(classLoader == null ? com.facebook.ads.redexgen.core.R2.class.getClassLoader() : classLoader);
    }

    public RecyclerView$SavedState(android.os.Parcelable parcelable) {
        super(parcelable);
    }

    public final void A03(com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState recyclerView$SavedState) {
        this.A00 = recyclerView$SavedState.A00;
    }

    @Override // com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, 0);
    }
}
