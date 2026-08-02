package androidx.fragment.app;

/* loaded from: classes3.dex */
final class FragmentManagerState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.FragmentManagerState> CREATOR = new android.os.Parcelable.Creator<androidx.fragment.app.FragmentManagerState>() { // from class: androidx.fragment.app.FragmentManagerState.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ androidx.fragment.app.FragmentManagerState createFromParcel(android.os.Parcel parcel) {
            return new androidx.fragment.app.FragmentManagerState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ androidx.fragment.app.FragmentManagerState[] newArray(int i) {
            return new androidx.fragment.app.FragmentManagerState[i];
        }
    };
    int Camera2StreamConfigurationMap;
    androidx.fragment.app.BackStackRecordState[] getHighResolutionOutputSizeshNQ4ISI;
    java.util.ArrayList<java.lang.String> getHighSpeedVideoFpsRanges;
    java.util.ArrayList<java.lang.String> getHighSpeedVideoFpsRangesFor;
    java.util.ArrayList<java.lang.String> getHighSpeedVideoSizes;
    java.util.ArrayList<androidx.fragment.app.FragmentManager.LaunchedFragmentInfo> getHighSpeedVideoSizesFor;
    java.util.ArrayList<androidx.fragment.app.BackStackState> getInputSizeshNQ4ISI;
    java.lang.String getOutputFormats;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public FragmentManagerState() {
        this.getOutputFormats = null;
        this.getHighSpeedVideoSizes = new java.util.ArrayList<>();
        this.getInputSizeshNQ4ISI = new java.util.ArrayList<>();
    }

    public FragmentManagerState(android.os.Parcel parcel) {
        this.getOutputFormats = null;
        this.getHighSpeedVideoSizes = new java.util.ArrayList<>();
        this.getInputSizeshNQ4ISI = new java.util.ArrayList<>();
        this.getHighSpeedVideoFpsRangesFor = parcel.createStringArrayList();
        this.getHighSpeedVideoFpsRanges = parcel.createStringArrayList();
        this.getHighResolutionOutputSizeshNQ4ISI = (androidx.fragment.app.BackStackRecordState[]) parcel.createTypedArray(androidx.fragment.app.BackStackRecordState.CREATOR);
        this.Camera2StreamConfigurationMap = parcel.readInt();
        this.getOutputFormats = parcel.readString();
        this.getHighSpeedVideoSizes = parcel.createStringArrayList();
        this.getInputSizeshNQ4ISI = parcel.createTypedArrayList(androidx.fragment.app.BackStackState.CREATOR);
        this.getHighSpeedVideoSizesFor = parcel.createTypedArrayList(androidx.fragment.app.FragmentManager.LaunchedFragmentInfo.CREATOR);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeStringList(this.getHighSpeedVideoFpsRangesFor);
        parcel.writeStringList(this.getHighSpeedVideoFpsRanges);
        parcel.writeTypedArray(this.getHighResolutionOutputSizeshNQ4ISI, i);
        parcel.writeInt(this.Camera2StreamConfigurationMap);
        parcel.writeString(this.getOutputFormats);
        parcel.writeStringList(this.getHighSpeedVideoSizes);
        parcel.writeTypedList(this.getInputSizeshNQ4ISI);
        parcel.writeTypedList(this.getHighSpeedVideoSizesFor);
    }
}
