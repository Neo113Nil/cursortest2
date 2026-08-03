package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzbhw implements java.util.concurrent.Callable {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzbhw zza = new com.google.android.gms.internal.ads.zzbhw();

    private /* synthetic */ zzbhw() {
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ java.lang.Object call() {
        return java.lang.Boolean.valueOf("mounted".equals(android.os.Environment.getExternalStorageState()));
    }
}
