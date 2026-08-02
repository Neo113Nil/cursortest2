package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzawo extends zzaxe {
    private final zzavj zzh;

    public zzawo(zzavr zzavrVar, String str, String str2, zzarr zzarrVar, int i7, int i8, zzavj zzavjVar) {
        super(zzavrVar, "YKQeaDOOJVYHYUK9Ci1tFvlnBAOpZht8/yLFuhAxLhcKuJay9vHjP+2zexHIKVEK", "wbzNkREEDJTKf6ocL1NI4RyoZkRM8VXZy0kVyFaQp5o=", zzarrVar, i7, 94);
        this.zzh = zzavjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxe
    public final void zza() {
        int intValue = ((Integer) this.zze.invoke(null, this.zzh.zza())).intValue();
        synchronized (this.zzd) {
            this.zzd.zzab(zzasd.zza(intValue));
        }
    }
}
