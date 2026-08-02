package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public class zzcem {
    final /* synthetic */ com.google.android.libraries.places.internal.zzceo zza;
    private final java.lang.Object zzb;
    private final com.google.android.libraries.places.internal.zzblp zzc;
    private com.google.android.libraries.places.internal.zzbjn zzd;
    private com.google.android.libraries.places.internal.zzbln zze;

    public zzcem(com.google.android.libraries.places.internal.zzceo zzceoVar, java.lang.Object obj, com.google.android.libraries.places.internal.zzble zzbleVar) {
        java.util.Objects.requireNonNull(zzceoVar);
        this.zza = zzceoVar;
        this.zze = new com.google.android.libraries.places.internal.zzblf(com.google.android.libraries.places.internal.zzbli.zzd());
        this.zzb = obj;
        this.zzc = zzbleVar.zza(zza());
        this.zzd = com.google.android.libraries.places.internal.zzbjn.CONNECTING;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzb);
        java.lang.String valueOf2 = java.lang.String.valueOf(this.zzd);
        java.lang.String valueOf3 = java.lang.String.valueOf(this.zze.getClass());
        java.lang.String valueOf4 = java.lang.String.valueOf(this.zzc);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 20 + java.lang.String.valueOf(valueOf2).length() + 15 + java.lang.String.valueOf(valueOf3).length() + 6 + java.lang.String.valueOf(valueOf4).length());
        sb.append("Address = ");
        sb.append(valueOf);
        sb.append(", state = ");
        sb.append(valueOf2);
        sb.append(", picker type: ");
        sb.append(valueOf3);
        sb.append(", lb: ");
        sb.append(valueOf4);
        return sb.toString();
    }

    protected com.google.android.libraries.places.internal.zzcel zza() {
        return new com.google.android.libraries.places.internal.zzcel(this);
    }

    protected final void zzb() {
        java.util.logging.Logger logger;
        this.zzc.zzc();
        this.zzd = com.google.android.libraries.places.internal.zzbjn.SHUTDOWN;
        logger = com.google.android.libraries.places.internal.zzceo.zzi;
        logger.logp(java.util.logging.Level.FINE, "io.grpc.util.MultiChildLoadBalancer$ChildLbState", "shutdown", "Child balancer {0} deleted", this.zzb);
    }

    final /* synthetic */ void zzj(com.google.android.libraries.places.internal.zzbln zzblnVar) {
        this.zze = zzblnVar;
    }

    final /* synthetic */ void zzi(com.google.android.libraries.places.internal.zzbjn zzbjnVar) {
        this.zzd = zzbjnVar;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzbjn zzh() {
        return this.zzd;
    }

    final /* synthetic */ com.google.android.libraries.places.internal.zzblp zzg() {
        return this.zzc;
    }

    public final com.google.android.libraries.places.internal.zzbjn zzf() {
        return this.zzd;
    }

    public final com.google.android.libraries.places.internal.zzbln zze() {
        return this.zze;
    }

    public final com.google.android.libraries.places.internal.zzblp zzd() {
        return this.zzc;
    }

    public final java.lang.Object zzc() {
        return this.zzb;
    }
}
