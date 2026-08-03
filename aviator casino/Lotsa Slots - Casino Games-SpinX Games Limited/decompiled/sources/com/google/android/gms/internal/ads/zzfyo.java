package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfyo implements com.google.android.gms.internal.ads.zzfxj {
    private final java.lang.Object zza;
    private final com.google.android.gms.internal.ads.zzfyp zzb;
    private final com.google.android.gms.internal.ads.zzfza zzc;
    private final com.google.android.gms.internal.ads.zzfxg zzd;
    private final boolean zze;

    zzfyo(java.lang.Object obj, com.google.android.gms.internal.ads.zzfyp zzfypVar, com.google.android.gms.internal.ads.zzfza zzfzaVar, com.google.android.gms.internal.ads.zzfxg zzfxgVar, boolean z) {
        this.zza = obj;
        this.zzb = zzfypVar;
        this.zzc = zzfzaVar;
        this.zzd = zzfxgVar;
        this.zze = z;
    }

    private static java.lang.String zzi(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        com.google.android.gms.internal.ads.zzaze zza = com.google.android.gms.internal.ads.zzazf.zza();
        zza.zzd(5);
        zza.zza(com.google.android.gms.internal.ads.zzida.zzt(bArr, 0, bArr.length));
        return android.util.Base64.encodeToString(((com.google.android.gms.internal.ads.zzazf) zza.zzbu()).zzaN(), 11);
    }

    private final synchronized byte[] zzj(java.util.Map map, java.util.Map map2) {
        java.lang.Object obj;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        try {
            obj = this.zza;
        } catch (java.lang.Exception e) {
            this.zzd.zzc(2007, java.lang.System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) obj.getClass().getDeclaredMethod("xss", java.util.Map.class, java.util.Map.class).invoke(obj, null, map2);
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final synchronized java.lang.String zza(android.content.Context context, java.lang.String str) {
        byte[] zzj;
        java.util.Map zzb = this.zzc.zzb();
        zzb.put(com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE, "q");
        zzb.put("ctx", context);
        zzb.put(com.ironsource.C3293ta.b, null);
        zzj = zzj(null, zzb);
        if (this.zze) {
            zzb.clear();
        }
        return zzi(zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final synchronized java.lang.String zzb(android.content.Context context, java.lang.String str, android.view.View view, android.app.Activity activity) {
        byte[] zzj;
        java.util.Map zzc = this.zzc.zzc();
        zzc.put(com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE, "v");
        zzc.put("ctx", context);
        zzc.put(com.ironsource.C3293ta.b, null);
        zzc.put(com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, view);
        zzc.put("act", activity);
        zzj = zzj(null, zzc);
        if (this.zze) {
            zzc.clear();
        }
        return zzi(zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final synchronized java.lang.String zzc(android.content.Context context, java.lang.String str, java.lang.String str2, android.view.View view, android.app.Activity activity) {
        byte[] zzj;
        java.util.Map zzd = this.zzc.zzd();
        zzd.put(com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE, "c");
        zzd.put("ctx", context);
        zzd.put("cs", str2);
        zzd.put(com.ironsource.C3293ta.b, null);
        zzd.put(com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, view);
        zzd.put("act", activity);
        zzj = zzj(null, zzd);
        if (this.zze) {
            zzd.clear();
        }
        return zzi(zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzfxj
    public final synchronized void zzd(java.lang.String str, android.view.MotionEvent motionEvent) throws com.google.android.gms.internal.ads.zzfyy {
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.Map zze = this.zzc.zze();
            zze.put(com.ironsource.C3293ta.b, null);
            zze.put("evt", motionEvent);
            java.lang.Object obj = this.zza;
            obj.getClass().getDeclaredMethod("he", java.util.Map.class).invoke(obj, zze);
            this.zzd.zzb(3003, java.lang.System.currentTimeMillis() - currentTimeMillis);
        } catch (java.lang.Exception e) {
            throw new com.google.android.gms.internal.ads.zzfyy(2005, e);
        }
    }

    final com.google.android.gms.internal.ads.zzfyp zze() {
        return this.zzb;
    }

    final synchronized boolean zzf() throws com.google.android.gms.internal.ads.zzfyy {
        java.lang.Object obj;
        try {
            obj = this.zza;
        } catch (java.lang.Exception e) {
            throw new com.google.android.gms.internal.ads.zzfyy(2001, e);
        }
        return ((java.lang.Boolean) obj.getClass().getDeclaredMethod(com.ironsource.X3.a.f, new java.lang.Class[0]).invoke(obj, new java.lang.Object[0])).booleanValue();
    }

    public final synchronized void zzg() throws com.google.android.gms.internal.ads.zzfyy {
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.Object obj = this.zza;
            obj.getClass().getDeclaredMethod("close", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]);
            this.zzd.zzb(3001, java.lang.System.currentTimeMillis() - currentTimeMillis);
        } catch (java.lang.Exception e) {
            throw new com.google.android.gms.internal.ads.zzfyy(2003, e);
        }
    }

    public final synchronized int zzh() throws com.google.android.gms.internal.ads.zzfyy {
        java.lang.Object obj;
        try {
            obj = this.zza;
        } catch (java.lang.Exception e) {
            throw new com.google.android.gms.internal.ads.zzfyy(2006, e);
        }
        return ((java.lang.Integer) obj.getClass().getDeclaredMethod("lcs", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0])).intValue();
    }
}
