package C;

/* loaded from: classes.dex */
public final class m extends android.view.View.BaseSavedState {
    public static final android.os.Parcelable.Creator<C.m> CREATOR = new C.l(0);

    /* renamed from: a, reason: collision with root package name */
    public int f90a;

    public final java.lang.String toString() {
        return "HorizontalScrollView.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " scrollPosition=" + this.f90a + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f90a);
    }
}
