package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzgy extends com.google.android.gms.measurement.internal.zzor {
    public zzgy(com.google.android.gms.measurement.internal.zzpf zzpfVar) {
        super(zzpfVar);
    }

    public final boolean zzb() {
        zzay();
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) this.zzu.zzaY().getSystemService("connectivity");
        android.net.NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (java.lang.SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    @Override // com.google.android.gms.measurement.internal.zzor
    protected final boolean zzbb() {
        return false;
    }

    public final void zzc(java.lang.String str, com.google.android.gms.measurement.internal.zzos zzosVar, com.google.android.gms.internal.measurement.zzib zzibVar, com.google.android.gms.measurement.internal.zzgv zzgvVar) {
        zzg();
        zzay();
        try {
            java.net.URL url = new java.net.URI(zzosVar.zza()).toURL();
            this.zzg.zzp();
            this.zzu.zzaW().zzm(new com.google.android.gms.measurement.internal.zzgx(this, str, url, zzibVar.zzcc(), zzosVar.zzb(), zzgvVar));
        } catch (java.lang.IllegalArgumentException | java.net.MalformedURLException | java.net.URISyntaxException unused) {
            this.zzu.zzaV().zzb().zzc("Failed to parse URL. Not uploading MeasurementBatch. appId", com.google.android.gms.measurement.internal.zzgt.zzl(str), zzosVar.zza());
        }
    }

    public final void zzd(com.google.android.gms.measurement.internal.zzh zzhVar, java.util.Map map, com.google.android.gms.measurement.internal.zzgv zzgvVar) {
        zzg();
        zzay();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzhVar);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzgvVar);
        com.google.android.gms.measurement.internal.zzot zzf = this.zzg.zzf();
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        java.lang.String zzf2 = zzhVar.zzf();
        android.net.Uri.Builder encodedAuthority = builder.scheme((java.lang.String) com.google.android.gms.measurement.internal.zzfx.zze.zzb(null)).encodedAuthority((java.lang.String) com.google.android.gms.measurement.internal.zzfx.zzf.zzb(null));
        java.lang.String.valueOf(zzf2);
        android.net.Uri.Builder appendQueryParameter = encodedAuthority.path("config/app/".concat(java.lang.String.valueOf(zzf2))).appendQueryParameter(com.ironsource.M6.H, "android");
        zzf.zzu.zzc().zzi();
        appendQueryParameter.appendQueryParameter("gmp_version", java.lang.String.valueOf(130000L)).appendQueryParameter("runtime_version", "0");
        java.lang.String uri = builder.build().toString();
        try {
            this.zzu.zzaW().zzm(new com.google.android.gms.measurement.internal.zzgx(this, zzhVar.zzc(), new java.net.URI(uri).toURL(), null, map, zzgvVar));
        } catch (java.lang.IllegalArgumentException | java.net.MalformedURLException | java.net.URISyntaxException unused) {
            this.zzu.zzaV().zzb().zzc("Failed to parse config URL. Not fetching. appId", com.google.android.gms.measurement.internal.zzgt.zzl(zzhVar.zzc()), uri);
        }
    }
}
