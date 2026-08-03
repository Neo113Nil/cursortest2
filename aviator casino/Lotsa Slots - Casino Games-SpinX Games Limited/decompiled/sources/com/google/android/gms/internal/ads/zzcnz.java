package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcnz implements com.google.android.gms.internal.ads.zzimu {
    private zzcnz(com.google.android.gms.internal.ads.zzcnl zzcnlVar) {
    }

    public static com.google.android.gms.internal.ads.zzcnz zza(com.google.android.gms.internal.ads.zzcnl zzcnlVar) {
        return new com.google.android.gms.internal.ads.zzcnz(zzcnlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    public final /* synthetic */ java.lang.Object zzb() {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setPackage("com.android.vending");
        intent.setData(android.net.Uri.parse("https://play.google.com/d"));
        return intent;
    }
}
