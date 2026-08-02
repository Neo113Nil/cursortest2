package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzne implements com.google.android.libraries.places.internal.zznf {
    private static final java.lang.Integer zza = 79508299;
    private final com.google.android.datatransport.Transport zzb;
    private final com.google.android.libraries.places.internal.zzex zzc;

    public static com.google.android.datatransport.Transport zza(android.content.Context context) {
        com.google.android.datatransport.runtime.TransportRuntime.initialize(context.getApplicationContext());
        return com.google.android.datatransport.runtime.TransportRuntime.getInstance().newFactory("cct").getTransport("LE", com.google.android.libraries.places.internal.zzxp.class, com.google.android.datatransport.Encoding.of("proto"), com.google.android.libraries.places.internal.zznd.zza);
    }

    @Override // com.google.android.libraries.places.internal.zznf
    public final void zzb(com.google.android.libraries.places.internal.zzaoc zzaocVar) {
        com.google.common.util.concurrent.Futures.addCallback(this.zzc.zza(), new com.google.android.libraries.places.internal.zznc(this, zzaocVar), com.google.common.util.concurrent.MoreExecutors.directExecutor());
    }

    final /* synthetic */ void zzc(com.google.android.libraries.places.internal.zzaoc zzaocVar) {
        com.google.android.libraries.places.internal.zzaoj zzaojVar = (com.google.android.libraries.places.internal.zzaoj) zzaocVar.zzG();
        com.google.android.libraries.places.internal.zzxn zza2 = com.google.android.libraries.places.internal.zzxp.zza();
        zza2.zzb(1);
        zza2.zza(zzaojVar);
        this.zzb.send(com.google.android.datatransport.Event.ofData((com.google.android.libraries.places.internal.zzxp) zza2.zzG(), com.google.android.datatransport.ProductData.withProductId(zza)));
    }

    public zzne(com.google.android.datatransport.Transport transport, com.google.android.libraries.places.internal.zzex zzexVar) {
        this.zzb = transport;
        this.zzc = zzexVar;
    }
}
