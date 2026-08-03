package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
final class zzdx implements java.util.Comparator {
    zzdx() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.auth.zzef zzefVar = (com.google.android.gms.internal.auth.zzef) obj;
        com.google.android.gms.internal.auth.zzef zzefVar2 = (com.google.android.gms.internal.auth.zzef) obj2;
        com.google.android.gms.internal.auth.zzdw zzdwVar = new com.google.android.gms.internal.auth.zzdw(zzefVar);
        com.google.android.gms.internal.auth.zzdw zzdwVar2 = new com.google.android.gms.internal.auth.zzdw(zzefVar2);
        while (zzdwVar.hasNext() && zzdwVar2.hasNext()) {
            int compareTo = java.lang.Integer.valueOf(zzdwVar.zza() & 255).compareTo(java.lang.Integer.valueOf(zzdwVar2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return java.lang.Integer.valueOf(zzefVar.zzd()).compareTo(java.lang.Integer.valueOf(zzefVar2.zzd()));
    }
}
