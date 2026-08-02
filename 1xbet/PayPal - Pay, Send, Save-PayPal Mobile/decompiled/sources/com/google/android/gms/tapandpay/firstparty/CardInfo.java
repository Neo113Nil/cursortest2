package com.google.android.gms.tapandpay.firstparty;

/* loaded from: classes8.dex */
public final class CardInfo extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.CardInfo> CREATOR = new com.google.android.gms.tapandpay.firstparty.zzh();
    final boolean zzA;
    final long zzB;
    final long zzC;
    final boolean zzD;
    final long zzE;
    final java.lang.String zzF;
    final java.lang.String zzG;
    final com.google.android.gms.tapandpay.firstparty.zzi zzH;
    final int zzI;
    final boolean zzJ;
    final java.lang.String zzK;
    final int zzL;
    final boolean zzM;
    final long zzN;
    final java.lang.String zzO;
    final int zzP;
    final java.util.List zzQ;
    final com.google.android.gms.tapandpay.firstparty.zzbf zzR;
    final java.lang.String zzS;
    final java.lang.String zzT;
    final java.lang.String zzU;
    final long zzV;
    final int zzW;
    final int zzX;
    final int zzY;
    final byte[] zzZ;
    final java.lang.String zza;
    final java.lang.String zzb;
    final byte[] zzc;
    final java.lang.String zzd;
    final java.lang.String zze;
    final int zzf;
    final com.google.android.gms.tapandpay.firstparty.TokenStatus zzg;
    final java.lang.String zzh;
    final android.net.Uri zzi;
    final int zzj;
    final int zzk;
    final com.google.android.gms.tapandpay.firstparty.zzau zzl;
    final java.lang.String zzm;
    final com.google.android.gms.tapandpay.firstparty.zzbo zzn;
    final java.lang.String zzo;
    final byte[] zzp;
    final int zzq;
    final int zzr;
    final int zzs;
    final com.google.android.gms.tapandpay.firstparty.zzaq zzt;
    final com.google.android.gms.tapandpay.firstparty.zzao zzu;
    final java.lang.String zzv;
    final com.google.android.gms.tapandpay.firstparty.zzay[] zzw;
    final boolean zzx;
    final java.util.List zzy;
    final boolean zzz;

    static {
        com.google.android.gms.internal.tapandpay.zzbz.zzf(10, 9);
    }

    CardInfo(java.lang.String str, java.lang.String str2, byte[] bArr, java.lang.String str3, java.lang.String str4, int i, com.google.android.gms.tapandpay.firstparty.TokenStatus tokenStatus, java.lang.String str5, android.net.Uri uri, int i2, int i3, com.google.android.gms.tapandpay.firstparty.zzau zzauVar, java.lang.String str6, com.google.android.gms.tapandpay.firstparty.zzbo zzboVar, java.lang.String str7, byte[] bArr2, int i4, int i5, int i6, com.google.android.gms.tapandpay.firstparty.zzaq zzaqVar, com.google.android.gms.tapandpay.firstparty.zzao zzaoVar, java.lang.String str8, com.google.android.gms.tapandpay.firstparty.zzay[] zzayVarArr, boolean z, java.util.List list, boolean z2, boolean z3, long j, long j2, boolean z4, long j3, java.lang.String str9, java.lang.String str10, com.google.android.gms.tapandpay.firstparty.zzi zziVar, int i7, boolean z5, java.lang.String str11, int i8, boolean z6, long j4, java.lang.String str12, int i9, java.util.List list2, com.google.android.gms.tapandpay.firstparty.zzbf zzbfVar, java.lang.String str13, java.lang.String str14, java.lang.String str15, long j5, int i10, int i11, int i12, byte[] bArr3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bArr;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = i;
        this.zzg = tokenStatus;
        this.zzh = str5;
        this.zzi = uri;
        this.zzj = i2;
        this.zzk = i3;
        this.zzl = zzauVar;
        this.zzm = str6;
        this.zzn = zzboVar;
        this.zzo = str7;
        this.zzp = bArr2;
        this.zzq = i4;
        this.zzr = i5;
        this.zzs = i6;
        this.zzt = zzaqVar;
        this.zzu = zzaoVar;
        this.zzv = str8;
        this.zzw = zzayVarArr;
        this.zzx = z;
        this.zzy = list;
        this.zzz = z2;
        this.zzA = z3;
        this.zzB = j;
        this.zzC = j2;
        this.zzD = z4;
        this.zzE = j3;
        this.zzF = str9;
        this.zzG = str10;
        this.zzH = zziVar;
        this.zzI = i7;
        this.zzJ = z5;
        this.zzK = str11;
        this.zzL = i8;
        this.zzM = z6;
        this.zzN = j4;
        this.zzO = str12;
        this.zzP = i9;
        this.zzQ = list2;
        this.zzR = zzbfVar;
        this.zzS = str13;
        this.zzT = str14;
        this.zzU = str15;
        this.zzV = j5;
        this.zzW = i10;
        this.zzX = i11;
        this.zzY = i12;
        this.zzZ = bArr3;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.tapandpay.firstparty.CardInfo)) {
            return false;
        }
        com.google.android.gms.tapandpay.firstparty.CardInfo cardInfo = (com.google.android.gms.tapandpay.firstparty.CardInfo) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, cardInfo.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, cardInfo.zzb) && java.util.Arrays.equals(this.zzc, cardInfo.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, cardInfo.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, cardInfo.zze) && this.zzf == cardInfo.zzf && com.google.android.gms.common.internal.Objects.equal(this.zzg, cardInfo.zzg) && com.google.android.gms.common.internal.Objects.equal(this.zzh, cardInfo.zzh) && com.google.android.gms.common.internal.Objects.equal(this.zzi, cardInfo.zzi) && this.zzj == cardInfo.zzj && this.zzk == cardInfo.zzk && com.google.android.gms.common.internal.Objects.equal(this.zzl, cardInfo.zzl) && com.google.android.gms.common.internal.Objects.equal(this.zzm, cardInfo.zzm) && com.google.android.gms.common.internal.Objects.equal(this.zzn, cardInfo.zzn) && this.zzq == cardInfo.zzq && this.zzr == cardInfo.zzr && this.zzs == cardInfo.zzs && com.google.android.gms.common.internal.Objects.equal(this.zzt, cardInfo.zzt) && com.google.android.gms.common.internal.Objects.equal(this.zzu, cardInfo.zzu) && com.google.android.gms.common.internal.Objects.equal(this.zzv, cardInfo.zzv) && java.util.Arrays.equals(this.zzw, cardInfo.zzw) && this.zzx == cardInfo.zzx && com.google.android.gms.common.internal.Objects.equal(this.zzy, cardInfo.zzy) && this.zzz == cardInfo.zzz && this.zzA == cardInfo.zzA && this.zzB == cardInfo.zzB && this.zzD == cardInfo.zzD && this.zzE == cardInfo.zzE && com.google.android.gms.common.internal.Objects.equal(this.zzF, cardInfo.zzF) && com.google.android.gms.common.internal.Objects.equal(this.zzG, cardInfo.zzG) && com.google.android.gms.common.internal.Objects.equal(this.zzH, cardInfo.zzH) && this.zzI == cardInfo.zzI && this.zzJ == cardInfo.zzJ && this.zzL == cardInfo.zzL && this.zzM == cardInfo.zzM && this.zzP == cardInfo.zzP && this.zzN == cardInfo.zzN && com.google.android.gms.common.internal.Objects.equal(this.zzO, cardInfo.zzO) && com.google.android.gms.common.internal.Objects.equal(this.zzQ, cardInfo.zzQ) && com.google.android.gms.common.internal.Objects.equal(this.zzR, cardInfo.zzR) && com.google.android.gms.common.internal.Objects.equal(this.zzS, cardInfo.zzS) && com.google.android.gms.common.internal.Objects.equal(this.zzT, cardInfo.zzT) && com.google.android.gms.common.internal.Objects.equal(this.zzU, cardInfo.zzU) && this.zzV == cardInfo.zzV && this.zzW == cardInfo.zzW && this.zzX == cardInfo.zzX && this.zzY == cardInfo.zzY && java.util.Arrays.equals(this.zzZ, cardInfo.zzZ);
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        java.lang.String str2 = this.zzb;
        byte[] bArr = this.zzc;
        java.lang.String str3 = this.zzd;
        java.lang.String str4 = this.zze;
        int i = this.zzf;
        com.google.android.gms.tapandpay.firstparty.TokenStatus tokenStatus = this.zzg;
        java.lang.String str5 = this.zzh;
        android.net.Uri uri = this.zzi;
        int i2 = this.zzj;
        int i3 = this.zzk;
        java.lang.String str6 = this.zzm;
        com.google.android.gms.tapandpay.firstparty.zzbo zzboVar = this.zzn;
        int i4 = this.zzq;
        int i5 = this.zzr;
        int i6 = this.zzs;
        com.google.android.gms.tapandpay.firstparty.zzaq zzaqVar = this.zzt;
        com.google.android.gms.tapandpay.firstparty.zzao zzaoVar = this.zzu;
        java.lang.String str7 = this.zzv;
        com.google.android.gms.tapandpay.firstparty.zzay[] zzayVarArr = this.zzw;
        boolean z = this.zzx;
        java.util.List list = this.zzy;
        boolean z2 = this.zzz;
        boolean z3 = this.zzA;
        long j = this.zzB;
        boolean z4 = this.zzD;
        long j2 = this.zzE;
        java.lang.String str8 = this.zzF;
        java.lang.String str9 = this.zzG;
        com.google.android.gms.tapandpay.firstparty.zzi zziVar = this.zzH;
        int i7 = this.zzI;
        boolean z5 = this.zzJ;
        int i8 = this.zzL;
        boolean z6 = this.zzM;
        long j3 = this.zzN;
        java.lang.String str10 = this.zzO;
        int i9 = this.zzP;
        java.util.List list2 = this.zzQ;
        com.google.android.gms.tapandpay.firstparty.zzbf zzbfVar = this.zzR;
        java.lang.String str11 = this.zzS;
        java.lang.String str12 = this.zzT;
        java.lang.String str13 = this.zzU;
        long j4 = this.zzV;
        int i10 = this.zzW;
        int i11 = this.zzX;
        int i12 = this.zzY;
        return com.google.android.gms.common.internal.Objects.hashCode(str, str2, bArr, str3, str4, java.lang.Integer.valueOf(i), tokenStatus, str5, uri, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), str6, zzboVar, java.lang.Integer.valueOf(i4), java.lang.Integer.valueOf(i5), java.lang.Integer.valueOf(i6), zzaqVar, zzaoVar, str7, zzayVarArr, java.lang.Boolean.valueOf(z), list, java.lang.Boolean.valueOf(z2), java.lang.Boolean.valueOf(z3), java.lang.Long.valueOf(j), java.lang.Boolean.valueOf(z4), java.lang.Long.valueOf(j2), str8, str9, zziVar, java.lang.Integer.valueOf(i7), java.lang.Boolean.valueOf(z5), java.lang.Integer.valueOf(i8), java.lang.Boolean.valueOf(z6), java.lang.Long.valueOf(j3), str10, java.lang.Integer.valueOf(i9), list2, zzbfVar, str11, str12, str13, java.lang.Long.valueOf(j4), java.lang.Integer.valueOf(i10), java.lang.Integer.valueOf(i11), java.lang.Integer.valueOf(i12), this.zzZ);
    }

    public final java.lang.String toString() {
        com.google.android.gms.common.internal.Objects.ToStringHelper add = com.google.android.gms.common.internal.Objects.toStringHelper(this).add("billingCardId", this.zza).add("auxClientTokenId", this.zzb);
        byte[] bArr = this.zzc;
        com.google.android.gms.common.internal.Objects.ToStringHelper add2 = add.add("serverToken", bArr == null ? null : java.util.Arrays.toString(bArr)).add("cardholderName", this.zzd).add("displayName", this.zze).add("cardNetwork", java.lang.Integer.valueOf(this.zzf)).add(com.visa.cbp.getTicketMetaData$6672$ReplenishAckRequest.values.getTokenInfo, this.zzg).add(com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_LAST_4_DIGITS, this.zzh).add("cardImageUrl", this.zzi).add("cardColor", java.lang.Integer.valueOf(this.zzj)).add("overlayTextColor", java.lang.Integer.valueOf(this.zzk));
        com.google.android.gms.tapandpay.firstparty.zzau zzauVar = this.zzl;
        com.google.android.gms.common.internal.Objects.ToStringHelper add3 = add2.add("issuerInfo", zzauVar == null ? null : zzauVar.toString()).add("tokenLastDigits", this.zzm).add("transactionInfo", this.zzn).add("issuerTokenId", this.zzo);
        byte[] bArr2 = this.zzp;
        com.google.android.gms.common.internal.Objects.ToStringHelper add4 = add3.add("inAppCardToken", bArr2 == null ? null : java.util.Arrays.toString(bArr2)).add("cachedEligibility", java.lang.Integer.valueOf(this.zzq)).add("paymentProtocol", java.lang.Integer.valueOf(this.zzr)).add("tokenType", java.lang.Integer.valueOf(this.zzs)).add("inStoreCvmConfig", this.zzt).add("inAppCvmConfig", this.zzu).add("tokenDisplayName", this.zzv);
        com.google.android.gms.tapandpay.firstparty.zzay[] zzayVarArr = this.zzw;
        com.google.android.gms.common.internal.Objects.ToStringHelper add5 = add4.add("onlineAccountCardLinkInfos", zzayVarArr == null ? null : java.util.Arrays.toString(zzayVarArr)).add("allowAidSelection", java.lang.Boolean.valueOf(this.zzx));
        java.lang.String join = android.text.TextUtils.join(", ", this.zzy);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(join).length() + 2);
        sb.append("[");
        sb.append(join);
        sb.append("]");
        com.google.android.gms.common.internal.Objects.ToStringHelper add6 = add5.add("badges", sb.toString()).add("upgradeAvailable", java.lang.Boolean.valueOf(this.zzz)).add("requiresSignature", java.lang.Boolean.valueOf(this.zzA)).add("googleTokenId", java.lang.Long.valueOf(this.zzB)).add("isTransit", java.lang.Boolean.valueOf(this.zzD)).add("googleWalletId", java.lang.Long.valueOf(this.zzE)).add("devicePaymentMethodId", this.zzF).add("cloudPaymentMethodId", this.zzG).add("auxiliaryGoogleTokenId", java.lang.Long.valueOf(this.zzN)).add("auxiliaryIssuerTokenId", this.zzO).add("auxiliaryNetwork", java.lang.Integer.valueOf(this.zzP));
        java.util.List list = this.zzQ;
        return add6.add("cobadgedDefaultOrderOfPaymentNetwork", list != null ? list.toString() : null).add("seInfo", this.zzR).add("rawPrevPanLastDigits", this.zzS).add("prevPanDisplayName", this.zzT).add("cardDisplayName", this.zzU).add("BillingCustomerNumber", java.lang.Long.valueOf(this.zzV)).add("applicationPriorityIndicatorOverride", java.lang.Integer.valueOf(this.zzW)).add("auxiliaryApplicationPriorityIndicatorOverride", java.lang.Integer.valueOf(this.zzX)).add("tokenizationMethod", java.lang.Integer.valueOf(this.zzY)).add("financialAccountDetailsBytes", this.zzZ).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zza;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 3, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 6, this.zzf);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, this.zzg, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zzh, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 9, this.zzi, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 10, this.zzj);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 11, this.zzk);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 12, this.zzl, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 13, this.zzm, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 15, this.zzn, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 16, this.zzo, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 17, this.zzp, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 18, this.zzq);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 20, this.zzr);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 21, this.zzs);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 22, this.zzt, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 23, this.zzu, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 24, this.zzv, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedArray(parcel, 25, this.zzw, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 26, this.zzx);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeTypedList(parcel, 27, this.zzy, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 28, this.zzz);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 29, this.zzA);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 30, this.zzB);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 31, this.zzC);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 32, this.zzD);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 33, this.zzE);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 34, this.zzF, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 35, this.zzG, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 36, this.zzH, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 37, this.zzI);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 38, this.zzJ);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 39, this.zzK, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 40, this.zzL);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 41, this.zzM);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 42, this.zzN);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 43, this.zzO, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 44, this.zzP);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 45, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeIntegerList(parcel, 47, this.zzQ, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 48, this.zzR, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 49, this.zzS, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 50, this.zzT, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 51, this.zzU, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeLong(parcel, 52, this.zzV);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 53, this.zzW);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 54, this.zzX);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(parcel, 55, this.zzY);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeByteArray(parcel, 56, this.zzZ, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
