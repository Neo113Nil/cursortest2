package com.google.android.gms.fido.u2f.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
final class zza implements android.os.Parcelable.Creator {
    zza() {
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        try {
            return com.google.android.gms.fido.u2f.api.common.ChannelIdValue.toChannelIdValueType(parcel.readInt());
        } catch (com.google.android.gms.fido.u2f.api.common.ChannelIdValue.UnsupportedChannelIdValueTypeException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.fido.u2f.api.common.ChannelIdValue.ChannelIdValueType[i];
    }
}
