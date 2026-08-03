package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzaah implements java.util.Comparator {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzaah zza = new com.google.android.gms.internal.ads.zzaah();

    private /* synthetic */ zzaah() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Integer num = (java.lang.Integer) obj2;
        java.lang.Integer num2 = (java.lang.Integer) obj;
        int i = com.google.android.gms.internal.ads.zzaay.zzb;
        if (num2.intValue() == -1) {
            return num.intValue() == -1 ? 0 : -1;
        }
        if (num.intValue() == -1) {
            return 1;
        }
        return num2.intValue() - num.intValue();
    }
}
