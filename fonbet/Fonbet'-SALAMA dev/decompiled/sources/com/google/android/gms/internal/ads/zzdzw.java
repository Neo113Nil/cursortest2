package com.google.android.gms.internal.ads;

import H2.j;
import android.app.Activity;
import e1.k;

/* loaded from: classes.dex */
final class zzdzw extends zzeas {
    private final Activity zza;
    private final j zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zzdzw(Activity activity, j jVar, String str, String str2, zzdzv zzdzvVar) {
        this.zza = activity;
        this.zzb = jVar;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        j jVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzeas) {
            zzeas zzeasVar = (zzeas) obj;
            if (this.zza.equals(zzeasVar.zza()) && ((jVar = this.zzb) != null ? jVar.equals(zzeasVar.zzb()) : zzeasVar.zzb() == null) && ((str = this.zzc) != null ? str.equals(zzeasVar.zzc()) : zzeasVar.zzc() == null) && ((str2 = this.zzd) != null ? str2.equals(zzeasVar.zzd()) : zzeasVar.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() ^ 1000003;
        j jVar = this.zzb;
        int hashCode2 = ((hashCode * 1000003) ^ (jVar == null ? 0 : jVar.hashCode())) * 1000003;
        String str = this.zzc;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zzd;
        return hashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l7 = k.l("OfflineUtilsParams{activity=", this.zza.toString(), ", adOverlay=", String.valueOf(this.zzb), ", gwsQueryId=");
        l7.append(this.zzc);
        l7.append(", uri=");
        return k.i(l7, this.zzd, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzeas
    public final Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzeas
    public final j zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzeas
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzeas
    public final String zzd() {
        return this.zzd;
    }
}
