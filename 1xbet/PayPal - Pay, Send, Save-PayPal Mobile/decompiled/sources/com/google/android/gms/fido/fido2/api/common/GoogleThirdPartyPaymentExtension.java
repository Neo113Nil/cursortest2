package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes.dex */
public class GoogleThirdPartyPaymentExtension extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzaf();
    private final boolean zza;

    public GoogleThirdPartyPaymentExtension(boolean z) {
        this.zza = z;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension) && this.zza == ((com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension) obj).getThirdPartyPayment();
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Boolean.valueOf(this.zza));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 1, getThirdPartyPayment());
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public boolean getThirdPartyPayment() {
        return this.zza;
    }
}
