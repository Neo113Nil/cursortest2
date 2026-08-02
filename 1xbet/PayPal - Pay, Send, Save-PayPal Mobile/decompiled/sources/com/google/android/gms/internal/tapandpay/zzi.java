package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
public abstract class zzi extends com.google.android.gms.internal.tapandpay.zzb implements com.google.android.gms.internal.tapandpay.zzj {
    public zzi() {
        super("com.google.android.gms.tapandpay.internal.ITapAndPayServiceCallbacks");
    }

    @Override // com.google.android.gms.internal.tapandpay.zzb
    protected final boolean dispatchTransaction(int i, android.os.Parcel parcel, android.os.Parcel parcel2, int i2) throws android.os.RemoteException {
        switch (i) {
            case 2:
                com.google.android.gms.common.api.Status status = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzc(status);
                return true;
            case 3:
                com.google.android.gms.common.api.Status status2 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                android.os.Bundle bundle = (android.os.Bundle) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, android.os.Bundle.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzd(status2, bundle);
                return true;
            case 4:
                com.google.android.gms.common.api.Status status3 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzr zzrVar = (com.google.android.gms.tapandpay.firstparty.zzr) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzr.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zze(status3, zzrVar);
                return true;
            case 5:
                com.google.android.gms.common.api.Status status4 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzf(status4);
                return true;
            case 6:
                com.google.android.gms.common.api.Status status5 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzg(status5);
                return true;
            case 7:
            case 16:
            case 26:
            case 31:
            case 32:
            case 33:
            case 34:
            case 36:
            case 37:
            case 54:
            case 65:
            default:
                return false;
            case 8:
                com.google.android.gms.common.api.Status status6 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzn zznVar = (com.google.android.gms.tapandpay.firstparty.zzn) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzn.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzh(status6, zznVar);
                return true;
            case 9:
                com.google.android.gms.common.api.Status status7 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zza(status7);
                return true;
            case 10:
                zzb();
                return true;
            case 11:
                com.google.android.gms.common.api.Status status8 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                boolean zza = com.google.android.gms.internal.tapandpay.zzc.zza(parcel);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzi(status8, zza);
                return true;
            case 12:
                com.google.android.gms.common.api.Status status9 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzj(status9);
                return true;
            case 13:
                com.google.android.gms.common.api.Status status10 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                boolean zza2 = com.google.android.gms.internal.tapandpay.zzc.zza(parcel);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzk(status10, zza2);
                return true;
            case 14:
                com.google.android.gms.common.api.Status status11 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzl(status11);
                return true;
            case 15:
                com.google.android.gms.common.api.Status status12 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzp zzpVar = (com.google.android.gms.tapandpay.firstparty.zzp) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzp.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzm(status12, zzpVar);
                return true;
            case 17:
                com.google.android.gms.common.api.Status status13 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse retrieveInAppPaymentCredentialResponse = (com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.RetrieveInAppPaymentCredentialResponse.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzn(status13, retrieveInAppPaymentCredentialResponse);
                return true;
            case 18:
                com.google.android.gms.common.api.Status status14 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                java.lang.String readString = parcel.readString();
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzo(status14, readString);
                return true;
            case 19:
                com.google.android.gms.common.api.Status status15 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                java.lang.String readString2 = parcel.readString();
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzp(status15, readString2);
                return true;
            case 20:
                com.google.android.gms.common.api.Status status16 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.tapandpay.issuer.TokenStatus tokenStatus = (com.google.android.gms.tapandpay.issuer.TokenStatus) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.tapandpay.issuer.TokenStatus.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzq(status16, tokenStatus);
                return true;
            case 21:
                com.google.android.gms.common.api.Status status17 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                boolean zza3 = com.google.android.gms.internal.tapandpay.zzc.zza(parcel);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzr(status17, zza3);
                return true;
            case 22:
                com.google.android.gms.common.api.Status status18 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzs(status18);
                return true;
            case 23:
                com.google.android.gms.common.api.Status status19 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                java.lang.String readString3 = parcel.readString();
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzt(status19, readString3);
                return true;
            case 24:
                com.google.android.gms.common.api.Status status20 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                java.lang.String readString4 = parcel.readString();
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzu(status20, readString4);
                return true;
            case 25:
                com.google.android.gms.common.api.Status status21 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzv(status21);
                return true;
            case 27:
                com.google.android.gms.common.api.Status status22 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzaj zzajVar = (com.google.android.gms.tapandpay.firstparty.zzaj) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzaj.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzw(status22, zzajVar);
                return true;
            case 28:
                com.google.android.gms.common.api.Status status23 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzab zzabVar = (com.google.android.gms.tapandpay.firstparty.zzab) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzab.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzx(status23, zzabVar);
                return true;
            case 29:
                com.google.android.gms.common.api.Status status24 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzy(status24);
                return true;
            case 30:
                com.google.android.gms.common.api.Status status25 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzt zztVar = (com.google.android.gms.tapandpay.firstparty.zzt) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzt.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzz(status25, zztVar);
                return true;
            case 35:
                com.google.android.gms.common.api.Status status26 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzah zzahVar = (com.google.android.gms.tapandpay.firstparty.zzah) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzah.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzA(status26, zzahVar);
                return true;
            case 38:
                com.google.android.gms.common.api.Status status27 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzB(status27);
                return true;
            case 39:
                com.google.android.gms.common.api.Status status28 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzx zzxVar = (com.google.android.gms.tapandpay.firstparty.zzx) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzx.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzC(status28, zzxVar);
                return true;
            case 40:
                com.google.android.gms.common.api.Status status29 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzD(status29);
                return true;
            case 41:
                com.google.android.gms.common.api.Status status30 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzba zzbaVar = (com.google.android.gms.tapandpay.firstparty.zzba) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzba.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzE(status30, zzbaVar);
                return true;
            case 42:
                com.google.android.gms.common.api.Status status31 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse getGlobalActionCardsResponse = (com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.tapandpay.globalactions.GetGlobalActionCardsResponse.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzF(status31, getGlobalActionCardsResponse);
                return true;
            case 43:
                com.google.android.gms.common.api.Status status32 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                java.lang.String readString5 = parcel.readString();
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzG(status32, readString5);
                return true;
            case 44:
                com.google.android.gms.common.api.Status status33 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzH(status33);
                return true;
            case 45:
                com.google.android.gms.common.api.Status status34 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzI(status34);
                return true;
            case 46:
                com.google.android.gms.common.api.Status status35 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzz zzzVar = (com.google.android.gms.tapandpay.firstparty.zzz) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzz.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzJ(status35, zzzVar);
                return true;
            case 47:
                com.google.android.gms.common.api.Status status36 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig quickAccessWalletConfig = (com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.tapandpay.quickaccesswallet.QuickAccessWalletConfig.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzK(status36, quickAccessWalletConfig);
                return true;
            case 48:
                com.google.android.gms.common.api.Status status37 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzv zzvVar = (com.google.android.gms.tapandpay.firstparty.zzv) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzv.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzL(status37, zzvVar);
                return true;
            case 49:
                com.google.android.gms.common.api.Status status38 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                boolean zza4 = com.google.android.gms.internal.tapandpay.zzc.zza(parcel);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzM(status38, zza4);
                return true;
            case 50:
                com.google.android.gms.common.api.Status status39 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.tapandpay.issuer.TokenInfo[] tokenInfoArr = (com.google.android.gms.tapandpay.issuer.TokenInfo[]) parcel.createTypedArray(com.google.android.gms.tapandpay.issuer.TokenInfo.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzN(status39, tokenInfoArr);
                return true;
            case 51:
                com.google.android.gms.common.api.Status status40 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzk zzkVar = (com.google.android.gms.tapandpay.firstparty.zzk) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzk.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzO(status40, zzkVar);
                return true;
            case 52:
                com.google.android.gms.common.api.Status status41 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                byte[] createByteArray = parcel.createByteArray();
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzP(status41, createByteArray);
                return true;
            case 53:
                com.google.android.gms.common.api.Status status42 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext pushProvisionSessionContext = (com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzQ(status42, pushProvisionSessionContext);
                return true;
            case 55:
                com.google.android.gms.common.api.Status status43 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                boolean zza5 = com.google.android.gms.internal.tapandpay.zzc.zza(parcel);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzR(status43, zza5);
                return true;
            case 56:
                com.google.android.gms.common.api.Status status44 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzal zzalVar = (com.google.android.gms.tapandpay.firstparty.zzal) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzal.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzS(status44, zzalVar);
                return true;
            case 57:
                com.google.android.gms.common.api.Status status45 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzT(status45);
                return true;
            case 58:
                com.google.android.gms.common.api.Status status46 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                java.lang.String readString6 = parcel.readString();
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzU(status46, readString6);
                return true;
            case 59:
                com.google.android.gms.common.api.Status status47 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                boolean zza6 = com.google.android.gms.internal.tapandpay.zzc.zza(parcel);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzV(status47, zza6);
                return true;
            case 60:
                com.google.android.gms.common.api.Status status48 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.tapandpay.issuer.ReachableDeviceWalletInfo[] reachableDeviceWalletInfoArr = (com.google.android.gms.tapandpay.issuer.ReachableDeviceWalletInfo[]) parcel.createTypedArray(com.google.android.gms.tapandpay.issuer.ReachableDeviceWalletInfo.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzW(status48, reachableDeviceWalletInfoArr);
                return true;
            case 61:
                com.google.android.gms.common.api.Status status49 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                boolean zza7 = com.google.android.gms.internal.tapandpay.zzc.zza(parcel);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzX(status49, zza7);
                return true;
            case 62:
                com.google.android.gms.common.api.Status status50 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                android.content.Intent intent = (android.content.Intent) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, android.content.Intent.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzY(status50, intent);
                return true;
            case 63:
                com.google.android.gms.common.api.Status status51 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                boolean zza8 = com.google.android.gms.internal.tapandpay.zzc.zza(parcel);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzZ(status51, zza8);
                return true;
            case 64:
                com.google.android.gms.common.api.Status status52 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzaa(status52);
                return true;
            case 66:
                com.google.android.gms.common.api.Status status53 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzaf zzafVar = (com.google.android.gms.tapandpay.firstparty.zzaf) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzaf.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzab(status53, zzafVar);
                return true;
            case 67:
                com.google.android.gms.common.api.Status status54 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzac(status54);
                return true;
            case 68:
                com.google.android.gms.common.api.Status status55 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzas zzasVar = (com.google.android.gms.tapandpay.firstparty.zzas) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzas.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzad(status55, zzasVar);
                return true;
            case 69:
                com.google.android.gms.common.api.Status status56 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzbq zzbqVar = (com.google.android.gms.tapandpay.firstparty.zzbq) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzbq.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzae(status56, zzbqVar);
                return true;
            case 70:
                com.google.android.gms.common.api.Status status57 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                boolean zza9 = com.google.android.gms.internal.tapandpay.zzc.zza(parcel);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzaf(status57, zza9);
                return true;
            case 71:
                com.google.android.gms.common.api.Status status58 = (com.google.android.gms.common.api.Status) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.common.api.Status.CREATOR);
                com.google.android.gms.tapandpay.firstparty.zzad zzadVar = (com.google.android.gms.tapandpay.firstparty.zzad) com.google.android.gms.internal.tapandpay.zzc.zzb(parcel, com.google.android.gms.tapandpay.firstparty.zzad.CREATOR);
                com.google.android.gms.internal.tapandpay.zzc.zze(parcel);
                zzag(status58, zzadVar);
                return true;
        }
    }
}
