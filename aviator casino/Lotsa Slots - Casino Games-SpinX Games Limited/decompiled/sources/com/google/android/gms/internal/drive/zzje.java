package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
final class zzje implements java.util.Comparator<com.google.android.gms.internal.drive.zzjc> {
    zzje() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(com.google.android.gms.internal.drive.zzjc zzjcVar, com.google.android.gms.internal.drive.zzjc zzjcVar2) {
        int zza;
        int zza2;
        com.google.android.gms.internal.drive.zzjc zzjcVar3 = zzjcVar;
        com.google.android.gms.internal.drive.zzjc zzjcVar4 = zzjcVar2;
        com.google.android.gms.internal.drive.zzjj zzjjVar = (com.google.android.gms.internal.drive.zzjj) zzjcVar3.iterator();
        com.google.android.gms.internal.drive.zzjj zzjjVar2 = (com.google.android.gms.internal.drive.zzjj) zzjcVar4.iterator();
        while (zzjjVar.hasNext() && zzjjVar2.hasNext()) {
            zza = com.google.android.gms.internal.drive.zzjc.zza(zzjjVar.nextByte());
            zza2 = com.google.android.gms.internal.drive.zzjc.zza(zzjjVar2.nextByte());
            int compare = java.lang.Integer.compare(zza, zza2);
            if (compare != 0) {
                return compare;
            }
        }
        return java.lang.Integer.compare(zzjcVar3.size(), zzjcVar4.size());
    }
}
