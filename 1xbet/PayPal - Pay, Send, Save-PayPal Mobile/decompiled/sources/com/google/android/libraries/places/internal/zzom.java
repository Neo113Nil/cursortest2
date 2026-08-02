package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzom implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.google.android.libraries.places.internal.zzom> CREATOR = new com.google.android.libraries.places.internal.zzol();
    private final com.google.android.libraries.places.internal.zzow zza;
    private final com.google.android.libraries.places.widget.model.AutocompleteUiCustomization zzb;
    private com.google.android.libraries.places.internal.zzok zzc;
    private final com.google.android.libraries.places.internal.zzor zzd;
    private final com.google.android.libraries.places.widget.model.AutocompleteActivityMode zze;
    private final com.google.android.libraries.places.api.model.AutocompleteSessionToken zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private java.lang.String zzp;
    private int zzq;
    private int zzr;
    private boolean zzs;
    private int zzt;
    private long zzu;
    private final com.google.android.libraries.places.internal.zzef zzv;

    /* synthetic */ zzom(android.os.Parcel parcel, byte[] bArr) {
        this.zza = (com.google.android.libraries.places.internal.zzow) parcel.readParcelable(com.google.android.libraries.places.internal.zzow.class.getClassLoader());
        this.zzb = (com.google.android.libraries.places.widget.model.AutocompleteUiCustomization) parcel.readParcelable(com.google.android.libraries.places.widget.model.AutocompleteUiCustomization.class.getClassLoader());
        this.zzc = (com.google.android.libraries.places.internal.zzok) parcel.readParcelable(com.google.android.libraries.places.internal.zzok.class.getClassLoader());
        this.zzd = (com.google.android.libraries.places.internal.zzor) parcel.readParcelable(com.google.android.libraries.places.internal.zzor.class.getClassLoader());
        this.zze = (com.google.android.libraries.places.widget.model.AutocompleteActivityMode) parcel.readParcelable(com.google.android.libraries.places.widget.model.AutocompleteActivityMode.class.getClassLoader());
        this.zzf = (com.google.android.libraries.places.api.model.AutocompleteSessionToken) parcel.readParcelable(com.google.android.libraries.places.api.model.AutocompleteSessionToken.class.getClassLoader());
        this.zzn = zzH(parcel);
        this.zzg = zzH(parcel);
        this.zzh = zzH(parcel);
        this.zzm = parcel.readInt();
        this.zzi = parcel.readInt();
        this.zzj = parcel.readInt();
        this.zzk = parcel.readInt();
        this.zzo = zzH(parcel);
        this.zzl = parcel.readInt();
        this.zzp = com.google.common.base.Strings.nullToEmpty(parcel.readString());
        this.zzq = parcel.readInt();
        this.zzr = parcel.readInt();
        this.zzs = zzH(parcel);
        this.zzt = parcel.readInt();
        this.zzu = parcel.readLong();
        this.zzv = new com.google.android.libraries.places.internal.zzei();
    }

    private static boolean zzH(android.os.Parcel parcel) {
        return parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        parcel.writeParcelable(this.zza, i);
        parcel.writeParcelable(this.zzb, i);
        parcel.writeParcelable(this.zzc, i);
        parcel.writeParcelable(this.zzd, i);
        parcel.writeParcelable(this.zze, i);
        parcel.writeParcelable(this.zzf, i);
        parcel.writeInt(this.zzn ? 1 : 0);
        parcel.writeInt(this.zzg ? 1 : 0);
        parcel.writeInt(this.zzh ? 1 : 0);
        parcel.writeInt(this.zzm);
        parcel.writeInt(this.zzi);
        parcel.writeInt(this.zzj);
        parcel.writeInt(this.zzk);
        parcel.writeInt(this.zzo ? 1 : 0);
        parcel.writeInt(this.zzl);
        parcel.writeString(this.zzp);
        parcel.writeInt(this.zzq);
        parcel.writeInt(this.zzr);
        parcel.writeInt(this.zzs ? 1 : 0);
        parcel.writeInt(this.zzt);
        parcel.writeLong(this.zzu);
    }

    public final void zzF() {
        if (zzI()) {
            return;
        }
        this.zzu = this.zzv.zzb();
    }

    public final void zzG() {
        if (zzI()) {
            this.zzt += (int) (this.zzv.zzb() - this.zzu);
            this.zzu = -1L;
        }
    }

    public zzom(com.google.android.libraries.places.internal.zzow zzowVar, com.google.android.libraries.places.widget.model.AutocompleteUiCustomization autocompleteUiCustomization, com.google.android.libraries.places.internal.zzor zzorVar, com.google.android.libraries.places.widget.model.AutocompleteActivityMode autocompleteActivityMode, java.lang.String str, com.google.android.libraries.places.api.model.AutocompleteSessionToken autocompleteSessionToken, com.google.android.libraries.places.internal.zzef zzefVar) {
        this.zza = zzowVar;
        this.zzb = autocompleteUiCustomization;
        this.zzd = zzorVar;
        this.zze = autocompleteActivityMode;
        if (autocompleteSessionToken == null) {
            this.zzf = com.google.android.libraries.places.api.model.AutocompleteSessionToken.newInstance();
        } else {
            this.zzf = autocompleteSessionToken;
        }
        com.google.android.libraries.places.api.model.AutocompleteSessionToken.newInstance();
        this.zzp = com.google.common.base.Strings.nullToEmpty(str);
        this.zzm = -1;
        this.zzu = -1L;
        this.zzv = zzefVar;
    }

    public final void zzz() {
        this.zzk++;
    }

    public final void zzy() {
        this.zzj++;
    }

    public final void zzx() {
        this.zzi++;
    }

    public final void zzw() {
        if (this.zzg || this.zzo) {
            return;
        }
        this.zzh = true;
    }

    public final void zzv() {
        this.zzg = true;
    }

    public final void zzu(int i) {
        this.zzn = true;
        this.zzm = i;
    }

    public final int zzt() {
        return this.zzt;
    }

    public final boolean zzs() {
        return this.zzs;
    }

    public final int zzr() {
        return this.zzr;
    }

    public final int zzq() {
        return this.zzq;
    }

    public final java.lang.String zzp() {
        return this.zzp;
    }

    public final int zzo() {
        return this.zzl;
    }

    public final int zzn() {
        return this.zzk;
    }

    public final int zzm() {
        return this.zzj;
    }

    public final int zzl() {
        return this.zzi;
    }

    public final int zzk() {
        return this.zzm;
    }

    public final boolean zzj() {
        return this.zzh;
    }

    public final boolean zzi() {
        return this.zzg;
    }

    public final boolean zzh() {
        return this.zzn;
    }

    public final com.google.android.libraries.places.api.model.AutocompleteSessionToken zzg() {
        return this.zzf;
    }

    public final com.google.android.libraries.places.widget.model.AutocompleteActivityMode zzf() {
        return this.zze;
    }

    public final com.google.android.libraries.places.internal.zzor zze() {
        return this.zzd;
    }

    public final void zzd(com.google.android.libraries.places.internal.zzok zzokVar) {
        this.zzc = zzokVar;
    }

    public final com.google.android.libraries.places.internal.zzok zzc() {
        return this.zzc;
    }

    public final com.google.android.libraries.places.widget.model.AutocompleteUiCustomization zzb() {
        return this.zzb;
    }

    public final com.google.android.libraries.places.internal.zzow zza() {
        return this.zza;
    }

    public final void zzE() {
        this.zzs = true;
    }

    public final void zzD() {
        this.zzr++;
    }

    public final void zzC(java.lang.String str) {
        this.zzq++;
        this.zzp = str;
    }

    public final void zzB() {
        this.zzl++;
    }

    public final void zzA() {
        this.zzo = true;
    }

    private final boolean zzI() {
        return this.zzu != -1;
    }
}
