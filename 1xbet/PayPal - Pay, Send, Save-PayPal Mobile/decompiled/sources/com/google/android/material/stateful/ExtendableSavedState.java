package com.google.android.material.stateful;

/* loaded from: classes8.dex */
public class ExtendableSavedState extends androidx.customview.view.AbsSavedState {
    public static final android.os.Parcelable.Creator<com.google.android.material.stateful.ExtendableSavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<com.google.android.material.stateful.ExtendableSavedState>() { // from class: com.google.android.material.stateful.ExtendableSavedState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.ClassLoaderCreator
        public com.google.android.material.stateful.ExtendableSavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            return new com.google.android.material.stateful.ExtendableSavedState(parcel, classLoader);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public com.google.android.material.stateful.ExtendableSavedState createFromParcel(android.os.Parcel parcel) {
            return new com.google.android.material.stateful.ExtendableSavedState(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        public com.google.android.material.stateful.ExtendableSavedState[] newArray(int i) {
            return new com.google.android.material.stateful.ExtendableSavedState[i];
        }
    };
    public final androidx.collection.SimpleArrayMap<java.lang.String, android.os.Bundle> extendableStates;

    public ExtendableSavedState(android.os.Parcelable parcelable) {
        super(parcelable);
        this.extendableStates = new androidx.collection.SimpleArrayMap<>();
    }

    private ExtendableSavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        java.lang.String[] strArr = new java.lang.String[readInt];
        parcel.readStringArray(strArr);
        android.os.Bundle[] bundleArr = new android.os.Bundle[readInt];
        parcel.readTypedArray(bundleArr, android.os.Bundle.CREATOR);
        this.extendableStates = new androidx.collection.SimpleArrayMap<>(readInt);
        for (int i = 0; i < readInt; i++) {
            this.extendableStates.put(strArr[i], bundleArr[i]);
        }
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int camera2StreamConfigurationMap = this.extendableStates.getCamera2StreamConfigurationMap();
        parcel.writeInt(camera2StreamConfigurationMap);
        java.lang.String[] strArr = new java.lang.String[camera2StreamConfigurationMap];
        android.os.Bundle[] bundleArr = new android.os.Bundle[camera2StreamConfigurationMap];
        for (int i2 = 0; i2 < camera2StreamConfigurationMap; i2++) {
            strArr[i2] = this.extendableStates.keyAt(i2);
            bundleArr[i2] = this.extendableStates.valueAt(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ExtendableSavedState{");
        sb.append(java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)));
        sb.append(" states=");
        sb.append(this.extendableStates);
        sb.append("}");
        return sb.toString();
    }
}
