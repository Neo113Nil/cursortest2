package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public class PG implements android.os.Parcelable.ClassLoaderCreator<com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState> {
    public static byte[] A00;

    static {
        A03();
    }

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 78);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC4, 9, com.google.common.base.Ascii.SYN, -9, com.google.common.base.Ascii.CAN, 5, com.google.common.base.Ascii.CAN, 9, -60, 17, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CAN, -60, 6, 9, -60, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.DLE};
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState createFromParcel(android.os.Parcel parcel) {
        return createFromParcel(parcel, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.ClassLoaderCreator
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState createFromParcel(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
        android.os.Parcelable superState = parcel.readParcelable(classLoader);
        if (superState == null) {
            return com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState.A02;
        }
        throw new java.lang.IllegalStateException(A02(0, 23, 86));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.Parcelable.Creator
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState[] newArray(int i) {
        return new com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState[i];
    }
}
