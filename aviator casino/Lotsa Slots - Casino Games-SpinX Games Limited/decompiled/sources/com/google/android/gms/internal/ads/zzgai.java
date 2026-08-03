package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgai extends com.google.android.gms.internal.ads.zzfzw {
    private com.google.android.gms.internal.ads.zzgub<java.lang.Integer> zza;
    private com.google.android.gms.internal.ads.zzgub<java.lang.Integer> zzb;
    private com.google.android.gms.internal.ads.zzfzy zzc;
    private java.net.HttpURLConnection zzd;

    zzgai() {
        this(com.google.android.gms.internal.ads.zzgah.zza, com.google.android.gms.internal.ads.zzfzz.zza, null);
    }

    zzgai(com.google.android.gms.internal.ads.zzgub<java.lang.Integer> zzgubVar, com.google.android.gms.internal.ads.zzgub<java.lang.Integer> zzgubVar2, com.google.android.gms.internal.ads.zzfzy zzfzyVar) {
        this.zza = zzgubVar;
        this.zzb = zzgubVar2;
        this.zzc = zzfzyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Integer zzA() {
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.lang.Integer zzB() {
        return -1;
    }

    public static void zzi(java.net.HttpURLConnection httpURLConnection) {
        com.google.android.gms.internal.ads.zzfzx.zzb();
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ java.net.URLConnection zzy(java.net.URL url) throws java.io.IOException {
        int i = com.google.android.gms.internal.ads.zzfzr.zzb;
        return url.openConnection();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        zzi(this.zzd);
    }

    public java.net.URLConnection zzf(final java.net.URL url, final int i) throws java.io.IOException {
        this.zza = new com.google.android.gms.internal.ads.zzgub() { // from class: com.google.android.gms.internal.ads.zzgaa
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ java.lang.Object zza() {
                java.lang.Integer valueOf;
                valueOf = java.lang.Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzc = new com.google.android.gms.internal.ads.zzfzy() { // from class: com.google.android.gms.internal.ads.zzgab
            @Override // com.google.android.gms.internal.ads.zzfzy
            public final /* synthetic */ java.net.URLConnection zza() {
                java.net.URLConnection zzy;
                zzy = com.google.android.gms.internal.ads.zzgai.zzy(url);
                return zzy;
            }
        };
        return zzj();
    }

    public java.net.HttpURLConnection zzg(final android.net.Network network, final java.net.URL url, final int i, final int i2) throws java.io.IOException {
        this.zza = new com.google.android.gms.internal.ads.zzgub() { // from class: com.google.android.gms.internal.ads.zzgac
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ java.lang.Object zza() {
                java.lang.Integer valueOf;
                valueOf = java.lang.Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzb = new com.google.android.gms.internal.ads.zzgub() { // from class: com.google.android.gms.internal.ads.zzgad
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ java.lang.Object zza() {
                java.lang.Integer valueOf;
                valueOf = java.lang.Integer.valueOf(i2);
                return valueOf;
            }
        };
        this.zzc = new com.google.android.gms.internal.ads.zzfzy() { // from class: com.google.android.gms.internal.ads.zzgae
            @Override // com.google.android.gms.internal.ads.zzfzy
            public final /* synthetic */ java.net.URLConnection zza() {
                java.net.URLConnection openConnection;
                openConnection = network.openConnection(url);
                return openConnection;
            }
        };
        return zzj();
    }

    public java.net.HttpURLConnection zzh(com.google.android.gms.internal.ads.zzfzy zzfzyVar, final int i, final int i2) throws java.io.IOException {
        this.zza = new com.google.android.gms.internal.ads.zzgub() { // from class: com.google.android.gms.internal.ads.zzgaf
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ java.lang.Object zza() {
                java.lang.Integer valueOf;
                valueOf = java.lang.Integer.valueOf(i);
                return valueOf;
            }
        };
        this.zzb = new com.google.android.gms.internal.ads.zzgub() { // from class: com.google.android.gms.internal.ads.zzgag
            @Override // com.google.android.gms.internal.ads.zzgub
            public final /* synthetic */ java.lang.Object zza() {
                java.lang.Integer valueOf;
                valueOf = java.lang.Integer.valueOf(i2);
                return valueOf;
            }
        };
        this.zzc = zzfzyVar;
        return zzj();
    }

    public java.net.HttpURLConnection zzj() throws java.io.IOException {
        com.google.android.gms.internal.ads.zzfzx.zza(((java.lang.Integer) this.zza.zza()).intValue(), ((java.lang.Integer) this.zzb.zza()).intValue());
        com.google.android.gms.internal.ads.zzfzy zzfzyVar = this.zzc;
        zzfzyVar.getClass();
        java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) zzfzyVar.zza();
        this.zzd = httpURLConnection;
        return httpURLConnection;
    }
}
