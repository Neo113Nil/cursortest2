package com.google.android.gms.internal.firebase_auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Strings;
import com.google.android.gms.internal.firebase_auth.zzg;

@SafeParcelable.Class(creator = "VerifyCustomTokenResponseCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public final class zzbj extends AbstractSafeParcelable implements com.google.firebase.auth.api.internal.zzcg<zzbj, zzg.zzh> {
    public static final Parcelable.Creator<zzbj> CREATOR = new zzbk();

    @SafeParcelable.Field(getter = "getIdToken", id = 2)
    private String zzaf;

    @SafeParcelable.Field(getter = "getRefreshToken", id = 3)
    private String zzai;

    @SafeParcelable.Field(getter = "getExpiresIn", id = 4)
    private long zzaj;

    @SafeParcelable.Field(getter = "isNewUser", id = 5)
    private boolean zzak;

    public zzbj() {
    }

    @SafeParcelable.Constructor
    zzbj(@SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @SafeParcelable.Param(id = 4) long j, @SafeParcelable.Param(id = 5) boolean z) {
        this.zzaf = str;
        this.zzai = str2;
        this.zzaj = j;
        this.zzak = z;
    }

    public final String getIdToken() {
        return this.zzaf;
    }

    public final boolean isNewUser() {
        return this.zzak;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zzaf, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzai, false);
        SafeParcelWriter.writeLong(parcel, 4, this.zzaj);
        SafeParcelWriter.writeBoolean(parcel, 5, this.zzak);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // com.google.firebase.auth.api.internal.zzcg
    public final /* synthetic */ zzbj zza(zzg.zzh zzhVar) {
        zzg.zzh zzhVar2 = zzhVar;
        this.zzaf = Strings.emptyToNull(zzhVar2.zzaf);
        this.zzai = Strings.emptyToNull(zzhVar2.zzai);
        this.zzaj = zzhVar2.zzaj;
        this.zzak = zzhVar2.zzak;
        return this;
    }

    @Override // com.google.firebase.auth.api.internal.zzcg
    public final Class<zzg.zzh> zzag() {
        return zzg.zzh.class;
    }

    @NonNull
    public final String zzap() {
        return this.zzai;
    }

    public final long zzaq() {
        return this.zzaj;
    }
}
