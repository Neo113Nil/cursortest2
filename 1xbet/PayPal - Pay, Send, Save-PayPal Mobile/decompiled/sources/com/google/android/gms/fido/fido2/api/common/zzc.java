package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public final class zzc implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.fido.fido2.api.common.UvmEntries uvmEntries = null;
        com.google.android.gms.fido.fido2.api.common.zzf zzfVar = null;
        com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = null;
        com.google.android.gms.fido.fido2.api.common.zzh zzhVar = null;
        java.lang.String str = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            int fieldId = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                uvmEntries = (com.google.android.gms.fido.fido2.api.common.UvmEntries) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.UvmEntries.CREATOR);
            } else if (fieldId == 2) {
                zzfVar = (com.google.android.gms.fido.fido2.api.common.zzf) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.zzf.CREATOR);
            } else if (fieldId == 3) {
                authenticationExtensionsCredPropsOutputs = (com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs.CREATOR);
            } else if (fieldId == 4) {
                zzhVar = (com.google.android.gms.fido.fido2.api.common.zzh) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.zzh.CREATOR);
            } else if (fieldId != 5) {
                com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                str = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(parcel, readHeader);
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs(uvmEntries, zzfVar, authenticationExtensionsCredPropsOutputs, zzhVar, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs[i];
    }
}
