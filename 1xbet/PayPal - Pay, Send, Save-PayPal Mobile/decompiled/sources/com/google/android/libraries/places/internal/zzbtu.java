package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbtu {
    private java.util.List zza;
    private int zzb;
    private int zzc;

    public final boolean zza() {
        return this.zzb < this.zza.size();
    }

    public final void zzc() {
        com.google.android.libraries.places.internal.zzbka zzbkaVar = (com.google.android.libraries.places.internal.zzbka) this.zza.get(this.zzb);
        int i = this.zzc + 1;
        this.zzc = i;
        if (i >= zzbkaVar.zza().size()) {
            this.zzb++;
            this.zzc = 0;
        }
    }

    public final java.net.SocketAddress zze() {
        return (java.net.SocketAddress) ((com.google.android.libraries.places.internal.zzbka) this.zza.get(this.zzb)).zza().get(this.zzc);
    }

    public final com.google.android.libraries.places.internal.zzbio zzf() {
        return ((com.google.android.libraries.places.internal.zzbka) this.zza.get(this.zzb)).zzb();
    }

    public final void zzg(java.util.List list) {
        this.zza = list;
        zzd();
    }

    public final boolean zzh(java.net.SocketAddress socketAddress) {
        for (int i = 0; i < this.zza.size(); i++) {
            int indexOf = ((com.google.android.libraries.places.internal.zzbka) this.zza.get(i)).zza().indexOf(socketAddress);
            if (indexOf != -1) {
                this.zzb = i;
                this.zzc = indexOf;
                return true;
            }
        }
        return false;
    }

    public final void zzd() {
        this.zzb = 0;
        this.zzc = 0;
    }

    public final boolean zzb() {
        return this.zzb == 0 && this.zzc == 0;
    }

    public zzbtu(java.util.List list) {
        this.zza = list;
    }
}
