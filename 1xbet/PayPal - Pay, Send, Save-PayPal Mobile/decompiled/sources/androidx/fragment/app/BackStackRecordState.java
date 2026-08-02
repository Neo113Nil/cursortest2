package androidx.fragment.app;

/* loaded from: classes3.dex */
final class BackStackRecordState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.BackStackRecordState> CREATOR = new android.os.Parcelable.Creator<androidx.fragment.app.BackStackRecordState>() { // from class: androidx.fragment.app.BackStackRecordState.1
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ androidx.fragment.app.BackStackRecordState createFromParcel(android.os.Parcel parcel) {
            return new androidx.fragment.app.BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ androidx.fragment.app.BackStackRecordState[] newArray(int i) {
            return new androidx.fragment.app.BackStackRecordState[i];
        }
    };
    final java.lang.CharSequence Camera2StreamConfigurationMap;
    final int getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;
    final java.lang.CharSequence getHighSpeedVideoFpsRangesFor;
    final int[] getHighSpeedVideoSizes;
    final java.util.ArrayList<java.lang.String> getHighSpeedVideoSizesFor;
    final java.lang.String getInputFormats;
    final int getInputSizeshNQ4ISI;
    final int[] getOutputFormats;
    final int[] getOutputMinFrameDuration;
    final int getOutputMinFrameDurationlomOqCM;
    final boolean getOutputSizes;
    final java.util.ArrayList<java.lang.String> getOutputStallDuration;
    final java.util.ArrayList<java.lang.String> getOutputStallDurationlomOqCM;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    BackStackRecordState(androidx.fragment.app.BackStackRecord backStackRecord) {
        int size = backStackRecord.getOutputSizeshNQ4ISI.size();
        this.getOutputMinFrameDuration = new int[size * 6];
        if (!backStackRecord.Camera2StreamConfigurationMap) {
            throw new java.lang.IllegalStateException("Not on back stack");
        }
        this.getHighSpeedVideoSizesFor = new java.util.ArrayList<>(size);
        this.getOutputFormats = new int[size];
        this.getHighSpeedVideoSizes = new int[size];
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            androidx.fragment.app.FragmentTransaction.Op op = backStackRecord.getOutputSizeshNQ4ISI.get(i2);
            this.getOutputMinFrameDuration[i] = op.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoSizesFor.add(op.getHighSpeedVideoFpsRanges != null ? op.getHighSpeedVideoFpsRanges.mWho : null);
            this.getOutputMinFrameDuration[i + 1] = op.getHighSpeedVideoSizesFor ? 1 : 0;
            this.getOutputMinFrameDuration[i + 2] = op.getHighSpeedVideoFpsRangesFor;
            this.getOutputMinFrameDuration[i + 3] = op.getHighSpeedVideoSizes;
            this.getOutputMinFrameDuration[i + 4] = op.getOutputMinFrameDuration;
            this.getOutputMinFrameDuration[i + 5] = op.getInputFormats;
            this.getOutputFormats[i2] = op.getOutputFormats.ordinal();
            this.getHighSpeedVideoSizes[i2] = op.getHighResolutionOutputSizeshNQ4ISI.ordinal();
            i2++;
            i += 6;
        }
        this.getOutputMinFrameDurationlomOqCM = backStackRecord.ArtificialStackFrames;
        this.getInputFormats = backStackRecord.getOutputSizes;
        this.getInputSizeshNQ4ISI = backStackRecord.getHighSpeedVideoFpsRanges;
        this.getHighResolutionOutputSizeshNQ4ISI = backStackRecord.getOutputMinFrameDuration;
        this.getHighSpeedVideoFpsRangesFor = backStackRecord.getInputSizeshNQ4ISI;
        this.getHighSpeedVideoFpsRanges = backStackRecord.getHighSpeedVideoSizesFor;
        this.Camera2StreamConfigurationMap = backStackRecord.getOutputFormats;
        this.getOutputStallDurationlomOqCM = backStackRecord.unwrapAs;
        this.getOutputStallDuration = backStackRecord.isOutputSupportedForhNQ4ISI;
        this.getOutputSizes = backStackRecord.isOutputSupportedFor;
    }

    BackStackRecordState(android.os.Parcel parcel) {
        this.getOutputMinFrameDuration = parcel.createIntArray();
        this.getHighSpeedVideoSizesFor = parcel.createStringArrayList();
        this.getOutputFormats = parcel.createIntArray();
        this.getHighSpeedVideoSizes = parcel.createIntArray();
        this.getOutputMinFrameDurationlomOqCM = parcel.readInt();
        this.getInputFormats = parcel.readString();
        this.getInputSizeshNQ4ISI = parcel.readInt();
        this.getHighResolutionOutputSizeshNQ4ISI = parcel.readInt();
        this.getHighSpeedVideoFpsRangesFor = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.getHighSpeedVideoFpsRanges = parcel.readInt();
        this.Camera2StreamConfigurationMap = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.getOutputStallDurationlomOqCM = parcel.createStringArrayList();
        this.getOutputStallDuration = parcel.createStringArrayList();
        this.getOutputSizes = parcel.readInt() != 0;
    }

    public final androidx.fragment.app.BackStackRecord Camera2StreamConfigurationMap(androidx.fragment.app.FragmentManager fragmentManager) {
        androidx.fragment.app.BackStackRecord backStackRecord = new androidx.fragment.app.BackStackRecord(fragmentManager);
        getHighResolutionOutputSizeshNQ4ISI(backStackRecord);
        backStackRecord.getHighSpeedVideoFpsRanges = this.getInputSizeshNQ4ISI;
        for (int i = 0; i < this.getHighSpeedVideoSizesFor.size(); i++) {
            java.lang.String str = this.getHighSpeedVideoSizesFor.get(i);
            if (str != null) {
                backStackRecord.getOutputSizeshNQ4ISI.get(i).getHighSpeedVideoFpsRanges = fragmentManager.getHighSpeedVideoSizes(str);
            }
        }
        backStackRecord.getHighSpeedVideoSizes(1);
        return backStackRecord;
    }

    final void getHighResolutionOutputSizeshNQ4ISI(androidx.fragment.app.BackStackRecord backStackRecord) {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i < this.getOutputMinFrameDuration.length) {
                androidx.fragment.app.FragmentTransaction.Op op = new androidx.fragment.app.FragmentTransaction.Op();
                int i3 = i + 1;
                op.Camera2StreamConfigurationMap = this.getOutputMinFrameDuration[i];
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                    int i4 = this.getOutputMinFrameDuration[i3];
                }
                op.getOutputFormats = androidx.lifecycle.Lifecycle.State.values()[this.getOutputFormats[i2]];
                op.getHighResolutionOutputSizeshNQ4ISI = androidx.lifecycle.Lifecycle.State.values()[this.getHighSpeedVideoSizes[i2]];
                if (this.getOutputMinFrameDuration[i3] == 0) {
                    z = false;
                }
                op.getHighSpeedVideoSizesFor = z;
                op.getHighSpeedVideoFpsRangesFor = this.getOutputMinFrameDuration[i + 2];
                op.getHighSpeedVideoSizes = this.getOutputMinFrameDuration[i + 3];
                op.getOutputMinFrameDuration = this.getOutputMinFrameDuration[i + 4];
                op.getInputFormats = this.getOutputMinFrameDuration[i + 5];
                backStackRecord.getOutputStallDurationlomOqCM = op.getHighSpeedVideoFpsRangesFor;
                backStackRecord.getOutputStallDuration = op.getHighSpeedVideoSizes;
                backStackRecord.getValidOutputFormatsForInputhNQ4ISI = op.getOutputMinFrameDuration;
                backStackRecord.toString = op.getInputFormats;
                backStackRecord.Camera2StreamConfigurationMap(op);
                i2++;
                i += 6;
            } else {
                backStackRecord.ArtificialStackFrames = this.getOutputMinFrameDurationlomOqCM;
                backStackRecord.getOutputSizes = this.getInputFormats;
                backStackRecord.Camera2StreamConfigurationMap = true;
                backStackRecord.getOutputMinFrameDuration = this.getHighResolutionOutputSizeshNQ4ISI;
                backStackRecord.getInputSizeshNQ4ISI = this.getHighSpeedVideoFpsRangesFor;
                backStackRecord.getHighSpeedVideoSizesFor = this.getHighSpeedVideoFpsRanges;
                backStackRecord.getOutputFormats = this.Camera2StreamConfigurationMap;
                backStackRecord.unwrapAs = this.getOutputStallDurationlomOqCM;
                backStackRecord.isOutputSupportedForhNQ4ISI = this.getOutputStallDuration;
                backStackRecord.isOutputSupportedFor = this.getOutputSizes;
                return;
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeIntArray(this.getOutputMinFrameDuration);
        parcel.writeStringList(this.getHighSpeedVideoSizesFor);
        parcel.writeIntArray(this.getOutputFormats);
        parcel.writeIntArray(this.getHighSpeedVideoSizes);
        parcel.writeInt(this.getOutputMinFrameDurationlomOqCM);
        parcel.writeString(this.getInputFormats);
        parcel.writeInt(this.getInputSizeshNQ4ISI);
        parcel.writeInt(this.getHighResolutionOutputSizeshNQ4ISI);
        android.text.TextUtils.writeToParcel(this.getHighSpeedVideoFpsRangesFor, parcel, 0);
        parcel.writeInt(this.getHighSpeedVideoFpsRanges);
        android.text.TextUtils.writeToParcel(this.Camera2StreamConfigurationMap, parcel, 0);
        parcel.writeStringList(this.getOutputStallDurationlomOqCM);
        parcel.writeStringList(this.getOutputStallDuration);
        parcel.writeInt(this.getOutputSizes ? 1 : 0);
    }
}
