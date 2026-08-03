package androidx.fragment.app;

/* loaded from: classes2.dex */
class BackStackState implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<androidx.fragment.app.BackStackState> CREATOR = new android.os.Parcelable.Creator<androidx.fragment.app.BackStackState>() { // from class: androidx.fragment.app.BackStackState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.fragment.app.BackStackState createFromParcel(android.os.Parcel parcel) {
            return new androidx.fragment.app.BackStackState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public androidx.fragment.app.BackStackState[] newArray(int i) {
            return new androidx.fragment.app.BackStackState[i];
        }
    };
    final java.util.List<java.lang.String> mFragments;
    final java.util.List<androidx.fragment.app.BackStackRecordState> mTransactions;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    BackStackState(java.util.List<java.lang.String> list, java.util.List<androidx.fragment.app.BackStackRecordState> list2) {
        this.mFragments = list;
        this.mTransactions = list2;
    }

    BackStackState(android.os.Parcel parcel) {
        this.mFragments = parcel.createStringArrayList();
        this.mTransactions = parcel.createTypedArrayList(androidx.fragment.app.BackStackRecordState.CREATOR);
    }

    java.util.List<androidx.fragment.app.BackStackRecord> instantiate(androidx.fragment.app.FragmentManager fragmentManager, java.util.Map<java.lang.String, androidx.fragment.app.Fragment> map) {
        java.util.HashMap hashMap = new java.util.HashMap(this.mFragments.size());
        for (java.lang.String str : this.mFragments) {
            androidx.fragment.app.Fragment fragment = map.get(str);
            if (fragment != null) {
                hashMap.put(fragment.mWho, fragment);
            } else {
                androidx.fragment.app.FragmentState savedState = fragmentManager.getFragmentStore().setSavedState(str, null);
                if (savedState != null) {
                    androidx.fragment.app.Fragment instantiate = savedState.instantiate(fragmentManager.getFragmentFactory(), fragmentManager.getHost().getContext().getClassLoader());
                    hashMap.put(instantiate.mWho, instantiate);
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.fragment.app.BackStackRecordState> it = this.mTransactions.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().instantiate(fragmentManager, hashMap));
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeStringList(this.mFragments);
        parcel.writeTypedList(this.mTransactions);
    }
}
