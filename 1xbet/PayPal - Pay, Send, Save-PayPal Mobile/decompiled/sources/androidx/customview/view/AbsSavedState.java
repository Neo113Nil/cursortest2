package androidx.customview.view;

/* loaded from: classes3.dex */
public abstract class AbsSavedState implements android.os.Parcelable {
    private final android.os.Parcelable mSuperState;
    public static final androidx.customview.view.AbsSavedState EMPTY_STATE = new androidx.customview.view.AbsSavedState() { // from class: androidx.customview.view.AbsSavedState.1
    };
    public static final android.os.Parcelable.Creator<androidx.customview.view.AbsSavedState> CREATOR = new android.os.Parcelable.ClassLoaderCreator<androidx.customview.view.AbsSavedState>() { // from class: androidx.customview.view.AbsSavedState.2
        @Override // android.os.Parcelable.Creator
        public /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
            if (parcel.readParcelable(null) != null) {
                throw new java.lang.IllegalStateException("superState must be null");
            }
            return androidx.customview.view.AbsSavedState.EMPTY_STATE;
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public /* synthetic */ androidx.customview.view.AbsSavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) != null) {
                throw new java.lang.IllegalStateException("superState must be null");
            }
            return androidx.customview.view.AbsSavedState.EMPTY_STATE;
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ java.lang.Object[] newArray(int i) {
            return new androidx.customview.view.AbsSavedState[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AbsSavedState() {
        this.mSuperState = null;
    }

    public AbsSavedState(android.os.Parcelable parcelable) {
        if (parcelable == null) {
            throw new java.lang.IllegalArgumentException("superState must not be null");
        }
        this.mSuperState = parcelable == EMPTY_STATE ? null : parcelable;
    }

    protected AbsSavedState(android.os.Parcel parcel) {
        this(parcel, null);
    }

    public AbsSavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        android.os.Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.mSuperState = readParcelable == null ? EMPTY_STATE : readParcelable;
    }

    public final android.os.Parcelable getSuperState() {
        return this.mSuperState;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.mSuperState, i);
    }
}
