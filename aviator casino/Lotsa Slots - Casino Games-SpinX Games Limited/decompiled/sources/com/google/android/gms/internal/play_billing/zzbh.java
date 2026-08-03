package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzbh implements java.util.Comparator {
    zzbh() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.play_billing.zzbq zzbqVar = (com.google.android.gms.internal.play_billing.zzbq) obj;
        com.google.android.gms.internal.play_billing.zzbq zzbqVar2 = (com.google.android.gms.internal.play_billing.zzbq) obj2;
        com.google.android.gms.internal.play_billing.zzbg zzbgVar = new com.google.android.gms.internal.play_billing.zzbg(zzbqVar);
        com.google.android.gms.internal.play_billing.zzbg zzbgVar2 = new com.google.android.gms.internal.play_billing.zzbg(zzbqVar2);
        while (zzbgVar.hasNext() && zzbgVar2.hasNext()) {
            int compareTo = java.lang.Integer.valueOf(zzbgVar.zza() & 255).compareTo(java.lang.Integer.valueOf(zzbgVar2.zza() & 255));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return java.lang.Integer.valueOf(zzbqVar.zzd()).compareTo(java.lang.Integer.valueOf(zzbqVar2.zzd()));
    }
}
