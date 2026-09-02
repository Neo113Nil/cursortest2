package h;

/* loaded from: classes.dex */
public final class a0 extends E.c {
    public static final android.os.Parcelable.Creator<h.a0> CREATOR = new E.b(2);

    /* renamed from: c, reason: collision with root package name */
    public boolean f3118c;

    public a0(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3118c = ((java.lang.Boolean) parcel.readValue(null)).booleanValue();
    }

    public final java.lang.String toString() {
        return "SearchView.SavedState{" + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " isIconified=" + this.f3118c + "}";
    }

    @Override // E.c, android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeValue(java.lang.Boolean.valueOf(this.f3118c));
    }
}
