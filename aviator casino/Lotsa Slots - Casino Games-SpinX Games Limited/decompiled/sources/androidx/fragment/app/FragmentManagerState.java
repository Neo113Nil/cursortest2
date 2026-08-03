package androidx.fragment.app;

/* loaded from: classes2.dex */
final class FragmentManagerState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.FragmentManagerState> CREATOR = new android.os.Parcelable.Creator<androidx.fragment.app.FragmentManagerState>() { // from class: androidx.fragment.app.FragmentManagerState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.fragment.app.FragmentManagerState createFromParcel(android.os.Parcel parcel) {
            return new androidx.fragment.app.FragmentManagerState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.fragment.app.FragmentManagerState[] newArray(int i) {
            return new androidx.fragment.app.FragmentManagerState[i];
        }
    };
    java.util.ArrayList<java.lang.String> mActive;
    java.util.ArrayList<java.lang.String> mAdded;
    androidx.fragment.app.BackStackRecordState[] mBackStack;
    int mBackStackIndex;
    java.util.ArrayList<java.lang.String> mBackStackStateKeys;
    java.util.ArrayList<androidx.fragment.app.BackStackState> mBackStackStates;
    java.util.ArrayList<androidx.fragment.app.FragmentManager.LaunchedFragmentInfo> mLaunchedFragments;
    java.lang.String mPrimaryNavActiveWho;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public FragmentManagerState() {
        this.mPrimaryNavActiveWho = null;
        this.mBackStackStateKeys = new java.util.ArrayList<>();
        this.mBackStackStates = new java.util.ArrayList<>();
    }

    public FragmentManagerState(android.os.Parcel parcel) {
        this.mPrimaryNavActiveWho = null;
        this.mBackStackStateKeys = new java.util.ArrayList<>();
        this.mBackStackStates = new java.util.ArrayList<>();
        this.mActive = parcel.createStringArrayList();
        this.mAdded = parcel.createStringArrayList();
        this.mBackStack = (androidx.fragment.app.BackStackRecordState[]) parcel.createTypedArray(androidx.fragment.app.BackStackRecordState.CREATOR);
        this.mBackStackIndex = parcel.readInt();
        this.mPrimaryNavActiveWho = parcel.readString();
        this.mBackStackStateKeys = parcel.createStringArrayList();
        this.mBackStackStates = parcel.createTypedArrayList(androidx.fragment.app.BackStackState.CREATOR);
        this.mLaunchedFragments = parcel.createTypedArrayList(androidx.fragment.app.FragmentManager.LaunchedFragmentInfo.CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeStringList(this.mActive);
        parcel.writeStringList(this.mAdded);
        parcel.writeTypedArray(this.mBackStack, i);
        parcel.writeInt(this.mBackStackIndex);
        parcel.writeString(this.mPrimaryNavActiveWho);
        parcel.writeStringList(this.mBackStackStateKeys);
        parcel.writeTypedList(this.mBackStackStates);
        parcel.writeTypedList(this.mLaunchedFragments);
    }
}
