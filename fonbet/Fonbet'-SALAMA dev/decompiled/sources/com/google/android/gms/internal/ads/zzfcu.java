package com.google.android.gms.internal.ads;

import F2.C0254t;
import Y4.D;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zzfcu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfcu> CREATOR = new zzfcv();
    public final Context zza;
    public final zzfcr zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfcr[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    public zzfcu(int i7, int i8, int i9, int i10, String str, int i11, int i12) {
        zzfcr[] values = zzfcr.values();
        this.zzh = values;
        int[] zza = zzfcs.zza();
        this.zzl = zza;
        int[] zza2 = zzfct.zza();
        this.zzm = zza2;
        this.zza = null;
        this.zzi = i7;
        this.zzb = values[i7];
        this.zzc = i8;
        this.zzd = i9;
        this.zze = i10;
        this.zzf = str;
        this.zzj = i11;
        this.zzg = zza[i11];
        this.zzk = i12;
        int i13 = zza2[i12];
    }

    public static zzfcu zza(zzfcr zzfcrVar, Context context) {
        if (zzfcrVar == zzfcr.Rewarded) {
            zzbbp zzbbpVar = zzbby.zzgn;
            C0254t c0254t = C0254t.f2723d;
            return new zzfcu(context, zzfcrVar, ((Integer) c0254t.f2726c.zzb(zzbbpVar)).intValue(), ((Integer) c0254t.f2726c.zzb(zzbby.zzgt)).intValue(), ((Integer) c0254t.f2726c.zzb(zzbby.zzgv)).intValue(), (String) c0254t.f2726c.zzb(zzbby.zzgx), (String) c0254t.f2726c.zzb(zzbby.zzgp), (String) c0254t.f2726c.zzb(zzbby.zzgr));
        }
        if (zzfcrVar == zzfcr.Interstitial) {
            zzbbp zzbbpVar2 = zzbby.zzgo;
            C0254t c0254t2 = C0254t.f2723d;
            return new zzfcu(context, zzfcrVar, ((Integer) c0254t2.f2726c.zzb(zzbbpVar2)).intValue(), ((Integer) c0254t2.f2726c.zzb(zzbby.zzgu)).intValue(), ((Integer) c0254t2.f2726c.zzb(zzbby.zzgw)).intValue(), (String) c0254t2.f2726c.zzb(zzbby.zzgy), (String) c0254t2.f2726c.zzb(zzbby.zzgq), (String) c0254t2.f2726c.zzb(zzbby.zzgs));
        }
        if (zzfcrVar != zzfcr.AppOpen) {
            return null;
        }
        zzbbp zzbbpVar3 = zzbby.zzgB;
        C0254t c0254t3 = C0254t.f2723d;
        return new zzfcu(context, zzfcrVar, ((Integer) c0254t3.f2726c.zzb(zzbbpVar3)).intValue(), ((Integer) c0254t3.f2726c.zzb(zzbby.zzgD)).intValue(), ((Integer) c0254t3.f2726c.zzb(zzbby.zzgE)).intValue(), (String) c0254t3.f2726c.zzb(zzbby.zzgz), (String) c0254t3.f2726c.zzb(zzbby.zzgA), (String) c0254t3.f2726c.zzb(zzbby.zzgC));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.zzi;
        int x02 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(i8);
        int i9 = this.zzc;
        D.B0(parcel, 2, 4);
        parcel.writeInt(i9);
        int i10 = this.zzd;
        D.B0(parcel, 3, 4);
        parcel.writeInt(i10);
        int i11 = this.zze;
        D.B0(parcel, 4, 4);
        parcel.writeInt(i11);
        D.s0(parcel, 5, this.zzf, false);
        int i12 = this.zzj;
        D.B0(parcel, 6, 4);
        parcel.writeInt(i12);
        int i13 = this.zzk;
        D.B0(parcel, 7, 4);
        parcel.writeInt(i13);
        D.z0(x02, parcel);
    }

    private zzfcu(Context context, zzfcr zzfcrVar, int i7, int i8, int i9, String str, String str2, String str3) {
        int i10;
        this.zzh = zzfcr.values();
        this.zzl = zzfcs.zza();
        this.zzm = zzfct.zza();
        this.zza = context;
        this.zzi = zzfcrVar.ordinal();
        this.zzb = zzfcrVar;
        this.zzc = i7;
        this.zzd = i8;
        this.zze = i9;
        this.zzf = str;
        if ("oldest".equals(str2)) {
            i10 = 1;
        } else {
            i10 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.zzg = i10;
        this.zzj = i10 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
