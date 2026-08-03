package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzfxf implements com.google.android.gms.tasks.Continuation {
    static final /* synthetic */ com.google.android.gms.internal.ads.zzfxf zza = new com.google.android.gms.internal.ads.zzfxf();

    private /* synthetic */ zzfxf() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ java.lang.Object then(com.google.android.gms.tasks.Task task) {
        return new java.lang.Boolean(task.isSuccessful());
    }
}
