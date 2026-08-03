package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
final class zzat implements android.os.Parcelable.Creator {
    zzat() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
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
}
