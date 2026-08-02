package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class ContactlessSetupItem extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.ContactlessSetupItem> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzm();
    final int zza;
    final int zzb;

    public ContactlessSetupItem(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.tapandpay.firstparty.ContactlessSetupItem)) {
            return false;
        }
        com.google.android.gms.tapandpay.firstparty.ContactlessSetupItem contactlessSetupItem = (com.google.android.gms.tapandpay.firstparty.ContactlessSetupItem) obj;
        return this.zza == contactlessSetupItem.zza && this.zzb == contactlessSetupItem.zzb;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(java.lang.Integer.valueOf(this.zza), java.lang.Integer.valueOf(this.zzb));
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("type", java.lang.Integer.valueOf(this.zza)).add("status", java.lang.Integer.valueOf(this.zzb)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 1, this.zza);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
