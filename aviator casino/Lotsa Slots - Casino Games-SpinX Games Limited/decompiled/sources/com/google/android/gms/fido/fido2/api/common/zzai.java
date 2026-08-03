package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzai extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.zzai> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzaj();
    private final byte[][] zza;

    public zzai(byte[][] bArr) {
        com.google.android.gms.common.internal.Preconditions.checkArgument(bArr != null);
        com.google.android.gms.common.internal.Preconditions.checkArgument(1 == ((bArr.length & 1) ^ 1));
        int i = 0;
        while (i < bArr.length) {
            com.google.android.gms.common.internal.Preconditions.checkArgument(i == 0 || bArr[i] != null);
            int i2 = i + 1;
            com.google.android.gms.common.internal.Preconditions.checkArgument(bArr[i2] != null);
            int length = bArr[i2].length;
            com.google.android.gms.common.internal.Preconditions.checkArgument(length == 32 || length == 64);
            i += 2;
        }
        this.zza = bArr;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.fido.fido2.api.common.zzai) {
            return java.util.Arrays.deepEquals(this.zza, ((com.google.android.gms.fido.fido2.api.common.zzai) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        for (byte[] bArr : this.zza) {
            i ^= com.google.android.gms.common.internal.Objects.hashCode(bArr);
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArrayArray(parcel, 1, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
