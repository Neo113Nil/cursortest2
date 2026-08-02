package com.google.android.gms.common.internal;

/* loaded from: classes8.dex */
final class zzh implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        return new com.google.android.gms.common.internal.BinderWrapper(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.common.internal.BinderWrapper[i];
    }

    zzh() {
    }
}
