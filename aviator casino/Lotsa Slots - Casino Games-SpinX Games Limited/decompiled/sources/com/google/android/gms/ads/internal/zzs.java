package com.google.android.gms.ads.internal;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes3.dex */
public final class zzs extends com.google.android.gms.ads.internal.client.zzbt {
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zza;
    private final com.google.android.gms.ads.internal.client.zzr zzb;
    private final android.content.Context zzc;
    private final com.google.android.gms.ads.internal.zzr zzd;
    private android.webkit.WebView zze;
    private com.google.android.gms.ads.internal.client.zzbh zzf;
    private android.os.AsyncTask zzg;

    public zzs(android.content.Context context, com.google.android.gms.ads.internal.client.zzr zzrVar, java.lang.String str, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        this.zzc = context;
        this.zza = versionInfoParcel;
        this.zzb = zzrVar;
        this.zze = new android.webkit.WebView(context);
        this.zzd = new com.google.android.gms.ads.internal.zzr(context, str);
        zzM(0);
        this.zze.setVerticalScrollBarEnabled(false);
        this.zze.getSettings().setJavaScriptEnabled(true);
        this.zze.setWebViewClient(new com.google.android.gms.ads.internal.zzo(this));
        this.zze.setOnTouchListener(new com.google.android.gms.ads.internal.zzp(this));
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzA() throws android.os.RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzB() throws android.os.RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzC(com.google.android.gms.internal.ads.zzcbv zzcbvVar) throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzD(java.lang.String str) throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzE(java.lang.String str) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzea zzF() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzG(com.google.android.gms.ads.internal.client.zzfw zzfwVar) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzH(com.google.android.gms.ads.internal.client.zzee zzeeVar) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzI(com.google.android.gms.ads.internal.client.zzx zzxVar) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzJ(com.google.android.gms.internal.ads.zzbgm zzbgmVar) throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzK(boolean z) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    final int zzL(java.lang.String str) {
        java.lang.String queryParameter = android.net.Uri.parse(str).getQueryParameter("height");
        if (android.text.TextUtils.isEmpty(queryParameter)) {
            return 0;
        }
        try {
            com.google.android.gms.ads.internal.client.zzay.zza();
            return com.google.android.gms.ads.internal.util.client.zzf.zzE(this.zzc, java.lang.Integer.parseInt(queryParameter));
        } catch (java.lang.NumberFormatException unused) {
            return 0;
        }
    }

    final void zzM(int i) {
        if (this.zze == null) {
            return;
        }
        this.zze.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, i));
    }

    final java.lang.String zzN() {
        android.net.Uri.Builder builder = new android.net.Uri.Builder();
        builder.scheme("https://").appendEncodedPath((java.lang.String) com.google.android.gms.internal.ads.zzbkc.zzd.zze());
        com.google.android.gms.ads.internal.zzr zzrVar = this.zzd;
        if (zzrVar.zzb() != null) {
            builder.appendQueryParameter(com.google.android.gms.actions.SearchIntents.EXTRA_QUERY, zzrVar.zzb());
        }
        builder.appendQueryParameter("pubId", zzrVar.zzc());
        builder.appendQueryParameter("mappver", zzrVar.zzd());
        java.util.Map zze = zzrVar.zze();
        for (java.lang.String str : zze.keySet()) {
            builder.appendQueryParameter(str, (java.lang.String) zze.get(str));
        }
        android.net.Uri build = builder.build();
        java.lang.String zzO = zzO();
        java.lang.String encodedQuery = build.getEncodedQuery();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(zzO.length() + 1 + java.lang.String.valueOf(encodedQuery).length());
        sb.append(zzO);
        sb.append("#");
        sb.append(encodedQuery);
        return sb.toString();
    }

    final java.lang.String zzO() {
        java.lang.String zza = this.zzd.zza();
        if (true == android.text.TextUtils.isEmpty(zza)) {
            zza = "www.google.com";
        }
        java.lang.String str = (java.lang.String) com.google.android.gms.internal.ads.zzbkc.zzd.zze();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zza).length() + 8 + java.lang.String.valueOf(str).length());
        sb.append("https://");
        sb.append(zza);
        sb.append(str);
        return sb.toString();
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzP(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzQ(com.google.android.gms.ads.internal.client.zzm zzmVar, com.google.android.gms.ads.internal.client.zzbk zzbkVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzR(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzS(com.google.android.gms.ads.internal.client.zzcs zzcsVar) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzT(long j) {
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final long zzU() {
        return 0L;
    }

    final /* synthetic */ void zzV(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
        intent.setData(android.net.Uri.parse(str));
        this.zzc.startActivity(intent);
    }

    final /* synthetic */ android.webkit.WebView zzW() {
        return this.zze;
    }

    final /* synthetic */ com.google.android.gms.ads.internal.client.zzbh zzX() {
        return this.zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzY(com.google.android.gms.ads.internal.client.zzcp zzcpVar) throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.dynamic.IObjectWrapper zzb() throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("getAdFrame must be called on the main UI thread.");
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zze);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzc() throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("destroy must be called on the main UI thread.");
        this.zzg.cancel(true);
        this.zze.destroy();
        this.zze = null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zzd() throws android.os.RemoteException {
        return false;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzdS(com.google.android.gms.ads.internal.client.zzbh zzbhVar) throws android.os.RemoteException {
        this.zzf = zzbhVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final boolean zze(com.google.android.gms.ads.internal.client.zzm zzmVar) throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(this.zze, "This Search Ad has already been torn down");
        this.zzd.zzf(zzmVar, this.zza);
        this.zzg = new com.google.android.gms.ads.internal.zzq(this, null).execute(new java.lang.Void[0]);
        return true;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzf() throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("pause must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzg() throws android.os.RemoteException {
        com.google.android.gms.common.internal.Preconditions.checkMainThread("resume must be called on the main UI thread.");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzi(com.google.android.gms.ads.internal.client.zzcl zzclVar) throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzj(com.google.android.gms.ads.internal.client.zzby zzbyVar) {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final android.os.Bundle zzk() {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzl() throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzm() throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzr zzn() throws android.os.RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzo(com.google.android.gms.ads.internal.client.zzr zzrVar) throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("AdSize must be set before initialization");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzp(com.google.android.gms.internal.ads.zzbzk zzbzkVar) throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzq(com.google.android.gms.internal.ads.zzbzn zzbznVar, java.lang.String str) throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final java.lang.String zzr() throws android.os.RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final java.lang.String zzs() throws android.os.RemoteException {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzdx zzt() {
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final java.lang.String zzu() {
        throw new java.lang.IllegalStateException("getAdUnitId not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzcl zzv() {
        throw new java.lang.IllegalStateException("getIAppEventListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final com.google.android.gms.ads.internal.client.zzbh zzw() {
        throw new java.lang.IllegalStateException("getIAdListener not implemented");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzx(com.google.android.gms.internal.ads.zzbjl zzbjlVar) throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzy(com.google.android.gms.ads.internal.client.zzbe zzbeVar) throws android.os.RemoteException {
        throw new java.lang.IllegalStateException("Unused method");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbu
    public final void zzz(boolean z) throws android.os.RemoteException {
    }
}
