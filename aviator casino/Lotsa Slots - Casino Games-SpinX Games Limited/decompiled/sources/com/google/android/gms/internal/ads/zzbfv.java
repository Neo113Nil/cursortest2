package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbfv {
    private final int zza;
    private final com.google.android.gms.internal.ads.zzbfs zzb = new com.google.android.gms.internal.ads.zzbfx();

    public zzbfv(int i) {
        this.zza = i;
    }

    public final java.lang.String zza(java.util.ArrayList arrayList) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((java.lang.String) arrayList.get(i)).toLowerCase(java.util.Locale.US));
            sb.append('\n');
        }
        java.lang.String[] split = sb.toString().split("\n");
        if (split.length == 0) {
            return "";
        }
        com.google.android.gms.internal.ads.zzbfu zzbfuVar = new com.google.android.gms.internal.ads.zzbfu();
        int i2 = this.zza;
        java.util.PriorityQueue priorityQueue = new java.util.PriorityQueue(i2, new com.google.android.gms.internal.ads.zzbft(this));
        for (java.lang.String str : split) {
            java.lang.String[] zzb = com.google.android.gms.internal.ads.zzbfw.zzb(str, false);
            if (zzb.length != 0) {
                com.google.android.gms.internal.ads.zzbfz.zza(zzb, i2, 6, priorityQueue);
            }
        }
        java.util.Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                zzbfuVar.zzb.write(this.zzb.zza(((com.google.android.gms.internal.ads.zzbfy) it.next()).zzb));
            } catch (java.io.IOException e) {
                int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error while writing hash to byteStream", e);
            }
        }
        return zzbfuVar.toString();
    }
}
