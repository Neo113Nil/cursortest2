package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzqo implements java.util.Comparator {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzqo zza = new com.google.android.gms.internal.ads.zzqo();

    private /* synthetic */ zzqo() {
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(java.lang.Object obj, java.lang.Object obj2) {
        return java.lang.Integer.bitCount(((java.lang.Integer) obj2).intValue()) - java.lang.Integer.bitCount(((java.lang.Integer) obj).intValue());
    }
}
