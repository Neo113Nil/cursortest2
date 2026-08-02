package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class zzv extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzv> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzw();
    final com.google.android.gms.tapandpay.firstparty.ContactlessSetupItem[] zza;

    public zzv(com.google.android.gms.tapandpay.firstparty.ContactlessSetupItem[] contactlessSetupItemArr) {
        this.zza = contactlessSetupItemArr;
    }

    public final java.lang.String toString() {
        com.google.android.gms.common.internal.Objects.ToStringHelper stringHelper = com.google.android.gms.common.internal.Objects.toStringHelper(this);
        for (com.google.android.gms.tapandpay.firstparty.ContactlessSetupItem contactlessSetupItem : this.zza) {
            stringHelper.add("type", java.lang.Integer.valueOf(contactlessSetupItem.zza));
            stringHelper.add("status", java.lang.Integer.valueOf(contactlessSetupItem.zzb));
        }
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 1, this.zza, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
