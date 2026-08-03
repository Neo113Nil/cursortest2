package androidx.fragment.app;

/* loaded from: classes2.dex */
final class BackStackRecordState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.BackStackRecordState> CREATOR = new android.os.Parcelable.Creator<androidx.fragment.app.BackStackRecordState>() { // from class: androidx.fragment.app.BackStackRecordState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.fragment.app.BackStackRecordState createFromParcel(android.os.Parcel parcel) {
            return new androidx.fragment.app.BackStackRecordState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.fragment.app.BackStackRecordState[] newArray(int i) {
            return new androidx.fragment.app.BackStackRecordState[i];
        }
    };
    private static final java.lang.String TAG = "FragmentManager";
    final int mBreadCrumbShortTitleRes;
    final java.lang.CharSequence mBreadCrumbShortTitleText;
    final int mBreadCrumbTitleRes;
    final java.lang.CharSequence mBreadCrumbTitleText;
    final int[] mCurrentMaxLifecycleStates;
    final java.util.ArrayList<java.lang.String> mFragmentWhos;
    final int mIndex;
    final java.lang.String mName;
    final int[] mOldMaxLifecycleStates;
    final int[] mOps;
    final boolean mReorderingAllowed;
    final java.util.ArrayList<java.lang.String> mSharedElementSourceNames;
    final java.util.ArrayList<java.lang.String> mSharedElementTargetNames;
    final int mTransition;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    BackStackRecordState(androidx.fragment.app.BackStackRecord backStackRecord) {
        int size = backStackRecord.mOps.size();
        this.mOps = new int[size * 6];
        if (!backStackRecord.mAddToBackStack) {
            throw new java.lang.IllegalStateException("Not on back stack");
        }
        this.mFragmentWhos = new java.util.ArrayList<>(size);
        this.mOldMaxLifecycleStates = new int[size];
        this.mCurrentMaxLifecycleStates = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            androidx.fragment.app.FragmentTransaction.Op op = backStackRecord.mOps.get(i2);
            int i3 = i + 1;
            this.mOps[i] = op.mCmd;
            this.mFragmentWhos.add(op.mFragment != null ? op.mFragment.mWho : null);
            this.mOps[i3] = op.mFromExpandedOp ? 1 : 0;
            this.mOps[i + 2] = op.mEnterAnim;
            this.mOps[i + 3] = op.mExitAnim;
            int i4 = i + 5;
            this.mOps[i + 4] = op.mPopEnterAnim;
            i += 6;
            this.mOps[i4] = op.mPopExitAnim;
            this.mOldMaxLifecycleStates[i2] = op.mOldMaxState.ordinal();
            this.mCurrentMaxLifecycleStates[i2] = op.mCurrentMaxState.ordinal();
        }
        this.mTransition = backStackRecord.mTransition;
        this.mName = backStackRecord.mName;
        this.mIndex = backStackRecord.mIndex;
        this.mBreadCrumbTitleRes = backStackRecord.mBreadCrumbTitleRes;
        this.mBreadCrumbTitleText = backStackRecord.mBreadCrumbTitleText;
        this.mBreadCrumbShortTitleRes = backStackRecord.mBreadCrumbShortTitleRes;
        this.mBreadCrumbShortTitleText = backStackRecord.mBreadCrumbShortTitleText;
        this.mSharedElementSourceNames = backStackRecord.mSharedElementSourceNames;
        this.mSharedElementTargetNames = backStackRecord.mSharedElementTargetNames;
        this.mReorderingAllowed = backStackRecord.mReorderingAllowed;
    }

    BackStackRecordState(android.os.Parcel parcel) {
        this.mOps = parcel.createIntArray();
        this.mFragmentWhos = parcel.createStringArrayList();
        this.mOldMaxLifecycleStates = parcel.createIntArray();
        this.mCurrentMaxLifecycleStates = parcel.createIntArray();
        this.mTransition = parcel.readInt();
        this.mName = parcel.readString();
        this.mIndex = parcel.readInt();
        this.mBreadCrumbTitleRes = parcel.readInt();
        this.mBreadCrumbTitleText = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mBreadCrumbShortTitleRes = parcel.readInt();
        this.mBreadCrumbShortTitleText = (java.lang.CharSequence) android.text.TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.mSharedElementSourceNames = parcel.createStringArrayList();
        this.mSharedElementTargetNames = parcel.createStringArrayList();
        this.mReorderingAllowed = parcel.readInt() != 0;
    }

    public androidx.fragment.app.BackStackRecord instantiate(androidx.fragment.app.FragmentManager fragmentManager) {
        androidx.fragment.app.BackStackRecord backStackRecord = new androidx.fragment.app.BackStackRecord(fragmentManager);
        fillInBackStackRecord(backStackRecord);
        backStackRecord.mIndex = this.mIndex;
        for (int i = 0; i < this.mFragmentWhos.size(); i++) {
            java.lang.String str = this.mFragmentWhos.get(i);
            if (str != null) {
                backStackRecord.mOps.get(i).mFragment = fragmentManager.findActiveFragment(str);
            }
        }
        backStackRecord.bumpBackStackNesting(1);
        return backStackRecord;
    }

    public androidx.fragment.app.BackStackRecord instantiate(androidx.fragment.app.FragmentManager fragmentManager, java.util.Map<java.lang.String, androidx.fragment.app.Fragment> map) {
        androidx.fragment.app.BackStackRecord backStackRecord = new androidx.fragment.app.BackStackRecord(fragmentManager);
        fillInBackStackRecord(backStackRecord);
        for (int i = 0; i < this.mFragmentWhos.size(); i++) {
            java.lang.String str = this.mFragmentWhos.get(i);
            if (str != null) {
                androidx.fragment.app.Fragment fragment = map.get(str);
                if (fragment != null) {
                    backStackRecord.mOps.get(i).mFragment = fragment;
                } else {
                    throw new java.lang.IllegalStateException("Restoring FragmentTransaction " + this.mName + " failed due to missing saved state for Fragment (" + str + ")");
                }
            }
        }
        return backStackRecord;
    }

    private void fillInBackStackRecord(androidx.fragment.app.BackStackRecord backStackRecord) {
        int i = 0;
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (i < this.mOps.length) {
                androidx.fragment.app.FragmentTransaction.Op op = new androidx.fragment.app.FragmentTransaction.Op();
                int i3 = i + 1;
                op.mCmd = this.mOps[i];
                if (androidx.fragment.app.FragmentManager.isLoggingEnabled(2)) {
                    android.util.Log.v("FragmentManager", "Instantiate " + backStackRecord + " op #" + i2 + " base fragment #" + this.mOps[i3]);
                }
                op.mOldMaxState = androidx.lifecycle.Lifecycle.State.values()[this.mOldMaxLifecycleStates[i2]];
                op.mCurrentMaxState = androidx.lifecycle.Lifecycle.State.values()[this.mCurrentMaxLifecycleStates[i2]];
                int i4 = i + 2;
                if (this.mOps[i3] == 0) {
                    z = false;
                }
                op.mFromExpandedOp = z;
                op.mEnterAnim = this.mOps[i4];
                op.mExitAnim = this.mOps[i + 3];
                int i5 = i + 5;
                op.mPopEnterAnim = this.mOps[i + 4];
                i += 6;
                op.mPopExitAnim = this.mOps[i5];
                backStackRecord.mEnterAnim = op.mEnterAnim;
                backStackRecord.mExitAnim = op.mExitAnim;
                backStackRecord.mPopEnterAnim = op.mPopEnterAnim;
                backStackRecord.mPopExitAnim = op.mPopExitAnim;
                backStackRecord.addOp(op);
                i2++;
            } else {
                backStackRecord.mTransition = this.mTransition;
                backStackRecord.mName = this.mName;
                backStackRecord.mAddToBackStack = true;
                backStackRecord.mBreadCrumbTitleRes = this.mBreadCrumbTitleRes;
                backStackRecord.mBreadCrumbTitleText = this.mBreadCrumbTitleText;
                backStackRecord.mBreadCrumbShortTitleRes = this.mBreadCrumbShortTitleRes;
                backStackRecord.mBreadCrumbShortTitleText = this.mBreadCrumbShortTitleText;
                backStackRecord.mSharedElementSourceNames = this.mSharedElementSourceNames;
                backStackRecord.mSharedElementTargetNames = this.mSharedElementTargetNames;
                backStackRecord.mReorderingAllowed = this.mReorderingAllowed;
                return;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeIntArray(this.mOps);
        parcel.writeStringList(this.mFragmentWhos);
        parcel.writeIntArray(this.mOldMaxLifecycleStates);
        parcel.writeIntArray(this.mCurrentMaxLifecycleStates);
        parcel.writeInt(this.mTransition);
        parcel.writeString(this.mName);
        parcel.writeInt(this.mIndex);
        parcel.writeInt(this.mBreadCrumbTitleRes);
        android.text.TextUtils.writeToParcel(this.mBreadCrumbTitleText, parcel, 0);
        parcel.writeInt(this.mBreadCrumbShortTitleRes);
        android.text.TextUtils.writeToParcel(this.mBreadCrumbShortTitleText, parcel, 0);
        parcel.writeStringList(this.mSharedElementSourceNames);
        parcel.writeStringList(this.mSharedElementTargetNames);
        parcel.writeInt(this.mReorderingAllowed ? 1 : 0);
    }
}
