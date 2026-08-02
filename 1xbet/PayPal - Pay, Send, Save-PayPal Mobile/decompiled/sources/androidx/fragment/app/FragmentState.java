package androidx.fragment.app;

/* loaded from: classes3.dex */
final class FragmentState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.FragmentState> CREATOR = new android.os.Parcelable.Creator<androidx.fragment.app.FragmentState>() { // from class: androidx.fragment.app.FragmentState.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ androidx.fragment.app.FragmentState createFromParcel(android.os.Parcel parcel) {
            return new androidx.fragment.app.FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ androidx.fragment.app.FragmentState[] newArray(int i) {
            return new androidx.fragment.app.FragmentState[i];
        }
    };
    final java.lang.String Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;
    final boolean getHighSpeedVideoFpsRangesFor;
    final boolean getHighSpeedVideoSizes;
    final boolean getHighSpeedVideoSizesFor;
    final boolean getInputFormats;
    final boolean getInputSizeshNQ4ISI;
    final boolean getOutputFormats;
    final int getOutputMinFrameDuration;
    final boolean getOutputMinFrameDurationlomOqCM;
    final java.lang.String getOutputSizes;
    final java.lang.String getOutputSizeshNQ4ISI;
    final int getOutputStallDuration;
    final java.lang.String getOutputStallDurationlomOqCM;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    FragmentState(androidx.fragment.app.Fragment fragment) {
        this.Camera2StreamConfigurationMap = fragment.getClass().getName();
        this.getOutputStallDurationlomOqCM = fragment.mWho;
        this.getHighSpeedVideoFpsRangesFor = fragment.mFromLayout;
        this.getHighSpeedVideoSizesFor = fragment.mInDynamicContainer;
        this.getHighSpeedVideoFpsRanges = fragment.mFragmentId;
        this.getHighResolutionOutputSizeshNQ4ISI = fragment.mContainerId;
        this.getOutputSizeshNQ4ISI = fragment.mTag;
        this.getInputFormats = fragment.mRetainInstance;
        this.getInputSizeshNQ4ISI = fragment.mRemoving;
        this.getHighSpeedVideoSizes = fragment.mDetached;
        this.getOutputFormats = fragment.mHidden;
        this.getOutputMinFrameDuration = fragment.mMaxState.ordinal();
        this.getOutputSizes = fragment.mTargetWho;
        this.getOutputStallDuration = fragment.mTargetRequestCode;
        this.getOutputMinFrameDurationlomOqCM = fragment.mUserVisibleHint;
    }

    FragmentState(android.os.Parcel parcel) {
        this.Camera2StreamConfigurationMap = parcel.readString();
        this.getOutputStallDurationlomOqCM = parcel.readString();
        this.getHighSpeedVideoFpsRangesFor = parcel.readInt() != 0;
        this.getHighSpeedVideoSizesFor = parcel.readInt() != 0;
        this.getHighSpeedVideoFpsRanges = parcel.readInt();
        this.getHighResolutionOutputSizeshNQ4ISI = parcel.readInt();
        this.getOutputSizeshNQ4ISI = parcel.readString();
        this.getInputFormats = parcel.readInt() != 0;
        this.getInputSizeshNQ4ISI = parcel.readInt() != 0;
        this.getHighSpeedVideoSizes = parcel.readInt() != 0;
        this.getOutputFormats = parcel.readInt() != 0;
        this.getOutputMinFrameDuration = parcel.readInt();
        this.getOutputSizes = parcel.readString();
        this.getOutputStallDuration = parcel.readInt();
        this.getOutputMinFrameDurationlomOqCM = parcel.readInt() != 0;
    }

    final androidx.fragment.app.Fragment getHighSpeedVideoSizes(androidx.fragment.app.FragmentFactory fragmentFactory, java.lang.ClassLoader classLoader) {
        androidx.fragment.app.Fragment instantiate = fragmentFactory.instantiate(classLoader, this.Camera2StreamConfigurationMap);
        instantiate.mWho = this.getOutputStallDurationlomOqCM;
        instantiate.mFromLayout = this.getHighSpeedVideoFpsRangesFor;
        instantiate.mInDynamicContainer = this.getHighSpeedVideoSizesFor;
        instantiate.mRestored = true;
        instantiate.mFragmentId = this.getHighSpeedVideoFpsRanges;
        instantiate.mContainerId = this.getHighResolutionOutputSizeshNQ4ISI;
        instantiate.mTag = this.getOutputSizeshNQ4ISI;
        instantiate.mRetainInstance = this.getInputFormats;
        instantiate.mRemoving = this.getInputSizeshNQ4ISI;
        instantiate.mDetached = this.getHighSpeedVideoSizes;
        instantiate.mHidden = this.getOutputFormats;
        instantiate.mMaxState = androidx.lifecycle.Lifecycle.State.values()[this.getOutputMinFrameDuration];
        instantiate.mTargetWho = this.getOutputSizes;
        instantiate.mTargetRequestCode = this.getOutputStallDuration;
        instantiate.mUserVisibleHint = this.getOutputMinFrameDurationlomOqCM;
        return instantiate;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(" (");
        sb.append(this.getOutputStallDurationlomOqCM);
        sb.append(")}:");
        if (this.getHighSpeedVideoFpsRangesFor) {
            sb.append(" fromLayout");
        }
        if (this.getHighSpeedVideoSizesFor) {
            sb.append(" dynamicContainer");
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            sb.append(" id=0x");
            sb.append(java.lang.Integer.toHexString(this.getHighResolutionOutputSizeshNQ4ISI));
        }
        java.lang.String str = this.getOutputSizeshNQ4ISI;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.getOutputSizeshNQ4ISI);
        }
        if (this.getInputFormats) {
            sb.append(" retainInstance");
        }
        if (this.getInputSizeshNQ4ISI) {
            sb.append(" removing");
        }
        if (this.getHighSpeedVideoSizes) {
            sb.append(" detached");
        }
        if (this.getOutputFormats) {
            sb.append(" hidden");
        }
        if (this.getOutputSizes != null) {
            sb.append(" targetWho=");
            sb.append(this.getOutputSizes);
            sb.append(" targetRequestCode=");
            sb.append(this.getOutputStallDuration);
        }
        if (this.getOutputMinFrameDurationlomOqCM) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeString(this.Camera2StreamConfigurationMap);
        parcel.writeString(this.getOutputStallDurationlomOqCM);
        parcel.writeInt(this.getHighSpeedVideoFpsRangesFor ? 1 : 0);
        parcel.writeInt(this.getHighSpeedVideoSizesFor ? 1 : 0);
        parcel.writeInt(this.getHighSpeedVideoFpsRanges);
        parcel.writeInt(this.getHighResolutionOutputSizeshNQ4ISI);
        parcel.writeString(this.getOutputSizeshNQ4ISI);
        parcel.writeInt(this.getInputFormats ? 1 : 0);
        parcel.writeInt(this.getInputSizeshNQ4ISI ? 1 : 0);
        parcel.writeInt(this.getHighSpeedVideoSizes ? 1 : 0);
        parcel.writeInt(this.getOutputFormats ? 1 : 0);
        parcel.writeInt(this.getOutputMinFrameDuration);
        parcel.writeString(this.getOutputSizes);
        parcel.writeInt(this.getOutputStallDuration);
        parcel.writeInt(this.getOutputMinFrameDurationlomOqCM ? 1 : 0);
    }
}
