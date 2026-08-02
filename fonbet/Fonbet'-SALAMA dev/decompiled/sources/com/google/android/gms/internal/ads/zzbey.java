package com.google.android.gms.internal.ads;

import O2.e;
import O2.f;
import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import y2.C1796A;

/* loaded from: classes.dex */
public final class zzbey extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbey> CREATOR = new zzbez();
    public final int zza;
    public final boolean zzb;
    public final int zzc;
    public final boolean zzd;
    public final int zze;
    public final com.google.android.gms.ads.internal.client.zzfx zzf;
    public final boolean zzg;
    public final int zzh;
    public final int zzi;
    public final boolean zzj;
    public final int zzk;

    public zzbey(int i7, boolean z4, int i8, boolean z7, int i9, com.google.android.gms.ads.internal.client.zzfx zzfxVar, boolean z8, int i10, int i11, boolean z9, int i12) {
        this.zza = i7;
        this.zzb = z4;
        this.zzc = i8;
        this.zzd = z7;
        this.zze = i9;
        this.zzf = zzfxVar;
        this.zzg = z8;
        this.zzh = i10;
        this.zzj = z9;
        this.zzi = i11;
        this.zzk = i12;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if (r1 == 1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static f zza(zzbey zzbeyVar) {
        e eVar = new e();
        if (zzbeyVar == null) {
            return new f(eVar);
        }
        int i7 = zzbeyVar.zza;
        int i8 = 2;
        if (i7 != 2) {
            if (i7 != 3) {
                if (i7 == 4) {
                    eVar.f4985f = zzbeyVar.zzg;
                    eVar.f4981b = zzbeyVar.zzh;
                    int i9 = zzbeyVar.zzi;
                    eVar.f4986g = zzbeyVar.zzj;
                    eVar.f4987h = i9;
                    int i10 = zzbeyVar.zzk;
                    if (i10 != 0) {
                        if (i10 == 2) {
                            i8 = 3;
                        }
                        eVar.f4988i = i8;
                    }
                    i8 = 1;
                    eVar.f4988i = i8;
                }
                eVar.f4980a = zzbeyVar.zzb;
                eVar.f4982c = zzbeyVar.zzd;
                return new f(eVar);
            }
            com.google.android.gms.ads.internal.client.zzfx zzfxVar = zzbeyVar.zzf;
            if (zzfxVar != null) {
                eVar.f4983d = new C1796A(zzfxVar);
            }
        }
        eVar.f4984e = zzbeyVar.zze;
        eVar.f4980a = zzbeyVar.zzb;
        eVar.f4982c = zzbeyVar.zzd;
        return new f(eVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.zza;
        int x02 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(i8);
        boolean z4 = this.zzb;
        D.B0(parcel, 2, 4);
        parcel.writeInt(z4 ? 1 : 0);
        int i9 = this.zzc;
        D.B0(parcel, 3, 4);
        parcel.writeInt(i9);
        boolean z7 = this.zzd;
        D.B0(parcel, 4, 4);
        parcel.writeInt(z7 ? 1 : 0);
        int i10 = this.zze;
        D.B0(parcel, 5, 4);
        parcel.writeInt(i10);
        D.r0(parcel, 6, this.zzf, i7, false);
        boolean z8 = this.zzg;
        D.B0(parcel, 7, 4);
        parcel.writeInt(z8 ? 1 : 0);
        int i11 = this.zzh;
        D.B0(parcel, 8, 4);
        parcel.writeInt(i11);
        int i12 = this.zzi;
        D.B0(parcel, 9, 4);
        parcel.writeInt(i12);
        boolean z9 = this.zzj;
        D.B0(parcel, 10, 4);
        parcel.writeInt(z9 ? 1 : 0);
        int i13 = this.zzk;
        D.B0(parcel, 11, 4);
        parcel.writeInt(i13);
        D.z0(x02, parcel);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zzbey(B2.b bVar) {
        this(4, r2, bVar.f1047b, bVar.f1049d, bVar.f1050e, r0 != null ? new com.google.android.gms.ads.internal.client.zzfx(r0) : null, bVar.f1052g, bVar.f1048c, 0, false, 0);
        boolean z4 = bVar.f1046a;
        C1796A c1796a = bVar.f1051f;
    }
}
