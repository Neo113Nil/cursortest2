package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzfns extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfns> CREATOR = new zzfnt();

    @Nullable
    public final Context zza;
    public final zzfnp zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfnp[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfns(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        zzfnp[] values = zzfnp.values();
        this.zzh = values;
        int[] zza = zzfnq.zza();
        this.zzl = zza;
        int[] zza2 = zzfnr.zza();
        this.zzm = zza2;
        this.zza = null;
        this.zzi = i;
        this.zzb = values[i];
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        this.zzj = i5;
        this.zzg = zza[i5];
        this.zzk = i6;
        int i7 = zza2[i6];
    }

    @Nullable
    public static zzfns zza(zzfnp zzfnpVar, Context context) {
        if (zzfnpVar == zzfnp.Rewarded) {
            return new zzfns(context, zzfnpVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhu)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhA)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhC)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhE), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhw), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhy));
        }
        if (zzfnpVar == zzfnp.Interstitial) {
            return new zzfns(context, zzfnpVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhv)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhB)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhD)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhF), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhx), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhz));
        }
        if (zzfnpVar != zzfnp.AppOpen) {
            return null;
        }
        return new zzfns(context, zzfnpVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhI)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhK)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhL)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhG), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhH), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhJ));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zzi;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzfns(@Nullable Context context, zzfnp zzfnpVar, int i, int i2, int i3, String str, String str2, String str3) {
        this.zzh = zzfnp.values();
        this.zzl = zzfnq.zza();
        this.zzm = zzfnr.zza();
        this.zza = context;
        this.zzi = zzfnpVar.ordinal();
        this.zzb = zzfnpVar;
        this.zzc = i;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = str;
        int i4 = "oldest".equals(str2) ? 1 : (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        this.zzg = i4;
        this.zzj = i4 - 1;
        this.zzk = 0;
    }
}
