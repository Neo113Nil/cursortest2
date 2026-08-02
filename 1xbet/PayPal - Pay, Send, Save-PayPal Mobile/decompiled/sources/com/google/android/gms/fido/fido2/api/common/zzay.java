package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
final class zzay implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        try {
            return com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus.fromString(parcel.readString());
        } catch (com.google.android.gms.fido.fido2.api.common.TokenBinding.UnsupportedTokenBindingStatusException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.fido.fido2.api.common.TokenBinding.TokenBindingStatus[i];
    }

    zzay() {
    }
}
