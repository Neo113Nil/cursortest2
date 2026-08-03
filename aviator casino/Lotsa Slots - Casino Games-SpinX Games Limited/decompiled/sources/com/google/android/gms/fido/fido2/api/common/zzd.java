package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
public final class zzd implements android.os.Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel parcel) {
        int validateObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(parcel);
        com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension fidoAppIdExtension = null;
        com.google.android.gms.fido.fido2.api.common.zzs zzsVar = null;
        com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension userVerificationMethodExtension = null;
        com.google.android.gms.fido.fido2.api.common.zzz zzzVar = null;
        com.google.android.gms.fido.fido2.api.common.zzab zzabVar = null;
        com.google.android.gms.fido.fido2.api.common.zzad zzadVar = null;
        com.google.android.gms.fido.fido2.api.common.zzu zzuVar = null;
        com.google.android.gms.fido.fido2.api.common.zzag zzagVar = null;
        com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension = null;
        com.google.android.gms.fido.fido2.api.common.zzai zzaiVar = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(parcel);
            switch (com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    fidoAppIdExtension = (com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension.CREATOR);
                    break;
                case 3:
                    zzsVar = (com.google.android.gms.fido.fido2.api.common.zzs) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.zzs.CREATOR);
                    break;
                case 4:
                    userVerificationMethodExtension = (com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension.CREATOR);
                    break;
                case 5:
                    zzzVar = (com.google.android.gms.fido.fido2.api.common.zzz) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.zzz.CREATOR);
                    break;
                case 6:
                    zzabVar = (com.google.android.gms.fido.fido2.api.common.zzab) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.zzab.CREATOR);
                    break;
                case 7:
                    zzadVar = (com.google.android.gms.fido.fido2.api.common.zzad) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.zzad.CREATOR);
                    break;
                case 8:
                    zzuVar = (com.google.android.gms.fido.fido2.api.common.zzu) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.zzu.CREATOR);
                    break;
                case 9:
                    zzagVar = (com.google.android.gms.fido.fido2.api.common.zzag) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.zzag.CREATOR);
                    break;
                case 10:
                    googleThirdPartyPaymentExtension = (com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension.CREATOR);
                    break;
                case 11:
                    zzaiVar = (com.google.android.gms.fido.fido2.api.common.zzai) com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(parcel, readHeader, com.google.android.gms.fido.fido2.api.common.zzai.CREATOR);
                    break;
                default:
                    com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions(fidoAppIdExtension, zzsVar, userVerificationMethodExtension, zzzVar, zzabVar, zzadVar, zzuVar, zzagVar, googleThirdPartyPaymentExtension, zzaiVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int i) {
        return new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions[i];
    }
}
