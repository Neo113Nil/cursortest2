package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzwb implements com.google.android.gms.internal.ads.zzwe {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzwb zza = new com.google.android.gms.internal.ads.zzwb();

    private /* synthetic */ zzwb() {
    }

    @Override // com.google.android.gms.internal.ads.zzwe
    public final /* synthetic */ int zza(java.lang.Object obj) {
        int i = com.google.android.gms.internal.ads.zzwf.zza;
        java.lang.String str = ((com.google.android.gms.internal.ads.zzvm) obj).zza;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (android.os.Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }
}
