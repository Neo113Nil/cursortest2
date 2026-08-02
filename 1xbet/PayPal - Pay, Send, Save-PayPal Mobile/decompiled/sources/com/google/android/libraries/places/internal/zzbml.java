package com.google.android.libraries.places.internal;

/* loaded from: classes.dex */
public final class zzbml {
    private final com.google.android.libraries.places.internal.zzbmj zza;
    private final java.lang.String zzb;

    @javax.annotation.Nullable
    private final java.lang.String zzc;
    private final com.google.android.libraries.places.internal.zzbmi zzd;
    private final com.google.android.libraries.places.internal.zzbmi zze;
    private final boolean zzf;

    /* synthetic */ zzbml(com.google.android.libraries.places.internal.zzbmj zzbmjVar, java.lang.String str, com.google.android.libraries.places.internal.zzbmi zzbmiVar, com.google.android.libraries.places.internal.zzbmi zzbmiVar2, java.lang.Object obj, boolean z, boolean z2, boolean z3, byte[] bArr) {
        new java.util.concurrent.atomic.AtomicReferenceArray(2);
        this.zza = (com.google.android.libraries.places.internal.zzbmj) com.google.common.base.Preconditions.checkNotNull(zzbmjVar, "type");
        this.zzb = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str, "fullMethodName");
        int lastIndexOf = ((java.lang.String) com.google.common.base.Preconditions.checkNotNull(str, "fullMethodName")).lastIndexOf(47);
        this.zzc = lastIndexOf == -1 ? null : str.substring(0, lastIndexOf);
        this.zzd = (com.google.android.libraries.places.internal.zzbmi) com.google.common.base.Preconditions.checkNotNull(zzbmiVar, "requestMarshaller");
        this.zze = (com.google.android.libraries.places.internal.zzbmi) com.google.common.base.Preconditions.checkNotNull(zzbmiVar2, "responseMarshaller");
        this.zzf = z3;
    }

    public static java.lang.String zzh(java.lang.String str, java.lang.String str2) {
        java.lang.String str3 = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str, "fullServiceName");
        java.lang.String str4 = (java.lang.String) com.google.common.base.Preconditions.checkNotNull(str2, "methodName");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str3).length() + 1 + java.lang.String.valueOf(str4).length());
        sb.append(str3);
        sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
        sb.append(str4);
        return sb.toString();
    }

    public static com.google.android.libraries.places.internal.zzbmh zzi(com.google.android.libraries.places.internal.zzbmi zzbmiVar, com.google.android.libraries.places.internal.zzbmi zzbmiVar2) {
        com.google.android.libraries.places.internal.zzbmh zzbmhVar = new com.google.android.libraries.places.internal.zzbmh(null);
        zzbmhVar.zza(null);
        zzbmhVar.zzb(null);
        return zzbmhVar;
    }

    public final java.lang.String toString() {
        return com.google.common.base.MoreObjects.toStringHelper(this).add("fullMethodName", this.zzb).add("type", this.zza).add("idempotent", false).add("safe", false).add("sampledToLocalTracing", this.zzf).add("requestMarshaller", this.zzd).add("responseMarshaller", this.zze).add("schemaDescriptor", (java.lang.Object) null).omitNullValues().toString();
    }

    public final java.lang.Object zzd(java.io.InputStream inputStream) {
        return this.zze.zzb(inputStream);
    }

    public final java.io.InputStream zze(java.lang.Object obj) {
        return this.zzd.zza(obj);
    }

    public final com.google.android.libraries.places.internal.zzbmi zzg() {
        return this.zze;
    }

    public final com.google.android.libraries.places.internal.zzbmi zzf() {
        return this.zzd;
    }

    @javax.annotation.Nullable
    public final java.lang.String zzc() {
        return this.zzc;
    }

    public final java.lang.String zzb() {
        return this.zzb;
    }

    public final com.google.android.libraries.places.internal.zzbmj zza() {
        return this.zza;
    }
}
