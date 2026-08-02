package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
final class zzgp implements java.util.Comparator {
    @Override // java.util.Comparator
    public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.fido.zzgx zzgxVar = (com.google.android.gms.internal.fido.zzgx) obj;
        com.google.android.gms.internal.fido.zzgx zzgxVar2 = (com.google.android.gms.internal.fido.zzgx) obj2;
        com.google.android.gms.internal.fido.zzgo zzgoVar = new com.google.android.gms.internal.fido.zzgo(zzgxVar);
        com.google.android.gms.internal.fido.zzgo zzgoVar2 = new com.google.android.gms.internal.fido.zzgo(zzgxVar2);
        while (zzgoVar.hasNext() && zzgoVar2.hasNext()) {
            int compareTo = java.lang.Integer.valueOf(zzgoVar.zza() & 255).compareTo(java.lang.Integer.valueOf(zzgoVar2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return java.lang.Integer.valueOf(zzgxVar.zzd()).compareTo(java.lang.Integer.valueOf(zzgxVar2.zzd()));
    }

    zzgp() {
    }
}
