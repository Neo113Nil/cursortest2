package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzui {
    public final int zza;
    public final com.google.android.gms.internal.ads.zzxk zzb;
    private final java.util.concurrent.CopyOnWriteArrayList zzc;

    public zzui() {
        this(new java.util.concurrent.CopyOnWriteArrayList(), 0, null);
    }

    private zzui(java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList, int i, com.google.android.gms.internal.ads.zzxk zzxkVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzxkVar;
    }

    public final com.google.android.gms.internal.ads.zzui zza(int i, com.google.android.gms.internal.ads.zzxk zzxkVar) {
        return new com.google.android.gms.internal.ads.zzui(this.zzc, 0, zzxkVar);
    }

    public final void zzb(android.os.Handler handler, com.google.android.gms.internal.ads.zzuj zzujVar) {
        this.zzc.add(new com.google.android.gms.internal.ads.zzuh(handler, zzujVar));
    }

    public final void zzc(com.google.android.gms.internal.ads.zzuj zzujVar) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.zzc;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzuh zzuhVar = (com.google.android.gms.internal.ads.zzuh) it.next();
            if (zzuhVar.zza == zzujVar) {
                copyOnWriteArrayList.remove(zzuhVar);
            }
        }
    }
}
