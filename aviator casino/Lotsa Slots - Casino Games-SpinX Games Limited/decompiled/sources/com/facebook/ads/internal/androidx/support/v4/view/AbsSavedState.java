package com.facebook.ads.internal.androidx.support.v4.view;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbsSavedState implements android.os.Parcelable {
    public static byte[] A01;
    public static final com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState A02;
    public static final android.os.Parcelable.Creator<com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState> CREATOR;

    @javax.annotation.Nullable
    public final android.os.Parcelable A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 106);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{85, 83, 86, 67, 84, 117, 82, 71, 82, 67, 6, 75, 83, 85, 82, 6, 72, 73, 82, 6, 68, 67, 6, 72, 83, 74, 74};
    }

    static {
        A01();
        A02 = new com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState() { // from class: com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState.1
        };
        CREATOR = new com.facebook.ads.redexgen.core.PG();
    }

    public AbsSavedState() {
        this.A00 = null;
    }

    public AbsSavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        android.os.Parcelable superState = parcel.readParcelable(classLoader);
        this.A00 = superState == null ? A02 : superState;
    }

    public AbsSavedState(android.os.Parcelable parcelable) {
        if (parcelable != null) {
            this.A00 = parcelable == A02 ? null : parcelable;
            return;
        }
        throw new java.lang.IllegalArgumentException(A00(0, 27, 76));
    }

    @javax.annotation.Nullable
    public final android.os.Parcelable A02() {
        return this.A00;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }
}
