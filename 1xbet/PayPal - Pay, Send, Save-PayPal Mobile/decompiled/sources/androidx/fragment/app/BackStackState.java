package androidx.fragment.app;

/* loaded from: classes3.dex */
class BackStackState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.BackStackState> CREATOR = new android.os.Parcelable.Creator<androidx.fragment.app.BackStackState>() { // from class: androidx.fragment.app.BackStackState.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ androidx.fragment.app.BackStackState createFromParcel(android.os.Parcel parcel) {
            return new androidx.fragment.app.BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ androidx.fragment.app.BackStackState[] newArray(int i) {
            return new androidx.fragment.app.BackStackState[i];
        }
    };
    final java.util.List<androidx.fragment.app.BackStackRecordState> getHighResolutionOutputSizeshNQ4ISI;
    final java.util.List<java.lang.String> getHighSpeedVideoFpsRangesFor;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    BackStackState(java.util.List<java.lang.String> list, java.util.List<androidx.fragment.app.BackStackRecordState> list2) {
        this.getHighSpeedVideoFpsRangesFor = list;
        this.getHighResolutionOutputSizeshNQ4ISI = list2;
    }

    BackStackState(android.os.Parcel parcel) {
        this.getHighSpeedVideoFpsRangesFor = parcel.createStringArrayList();
        this.getHighResolutionOutputSizeshNQ4ISI = parcel.createTypedArrayList(androidx.fragment.app.BackStackRecordState.CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeStringList(this.getHighSpeedVideoFpsRangesFor);
        parcel.writeTypedList(this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
