package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzax {
    private com.google.android.gms.internal.ads.zzecr zzg;
    private final java.lang.Object zzb = new java.lang.Object();
    private java.lang.String zzc = "";
    private java.lang.String zzd = "";
    private boolean zze = false;
    private boolean zzf = false;
    protected java.lang.String zza = "";

    /* JADX WARN: Multi-variable type inference failed */
    protected static final java.lang.String zzo(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(com.google.common.net.HttpHeaders.USER_AGENT, com.google.android.gms.ads.internal.zzt.zzc().zze(context, str2));
        com.google.common.util.concurrent.ListenableFuture zzb = new com.google.android.gms.ads.internal.util.zzbl(context).zzb(0, str, hashMap, null);
        try {
            return (java.lang.String) zzb.get(((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfW)).intValue(), java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException e) {
            java.lang.String.valueOf(str);
            java.lang.String valueOf = java.lang.String.valueOf(str);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Interrupted while retrieving a response from: ".concat(valueOf), e);
            zzb.cancel(true);
            return null;
        } catch (java.util.concurrent.TimeoutException e2) {
            java.lang.String.valueOf(str);
            java.lang.String valueOf2 = java.lang.String.valueOf(str);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Timeout while retrieving a response from: ".concat(valueOf2), e2);
            zzb.cancel(true);
            return null;
        } catch (java.lang.Exception e3) {
            java.lang.String.valueOf(str);
            java.lang.String valueOf3 = java.lang.String.valueOf(str);
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error retrieving a response from: ".concat(valueOf3), e3);
            return null;
        }
    }

    private final android.net.Uri zzp(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        java.lang.String str5;
        android.net.Uri.Builder buildUpon = android.net.Uri.parse(str).buildUpon();
        synchronized (this.zzb) {
            if (android.text.TextUtils.isEmpty(this.zzc)) {
                com.google.android.gms.ads.internal.zzt.zzc();
                try {
                    str5 = new java.lang.String(com.google.android.gms.common.util.IOUtils.readInputStreamFully(context.openFileInput("debug_signals_id.txt"), true), java.nio.charset.StandardCharsets.UTF_8);
                } catch (java.io.IOException unused) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Error reading from internal storage.");
                    str5 = "";
                }
                this.zzc = str5;
                if (android.text.TextUtils.isEmpty(str5)) {
                    com.google.android.gms.ads.internal.zzt.zzc();
                    this.zzc = java.util.UUID.randomUUID().toString();
                    com.google.android.gms.ads.internal.zzt.zzc();
                    java.lang.String str6 = this.zzc;
                    try {
                        java.io.FileOutputStream openFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        openFileOutput.write(str6.getBytes(java.nio.charset.StandardCharsets.UTF_8));
                        openFileOutput.close();
                    } catch (java.lang.Exception e) {
                        int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Error writing to file in internal storage.", e);
                    }
                }
            }
            str4 = this.zzc;
        }
        buildUpon.appendQueryParameter("linkedDeviceId", str4);
        buildUpon.appendQueryParameter("adSlotPath", str2);
        buildUpon.appendQueryParameter("afmaVersion", str3);
        return buildUpon.build();
    }

    public final void zza(com.google.android.gms.internal.ads.zzecr zzecrVar) {
        this.zzg = zzecrVar;
    }

    public final com.google.android.gms.internal.ads.zzecr zzb() {
        return this.zzg;
    }

    public final void zzc(android.content.Context context) {
        com.google.android.gms.internal.ads.zzecr zzecrVar;
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkD)).booleanValue() || (zzecrVar = this.zzg) == null) {
            return;
        }
        zzecrVar.zzo(new com.google.android.gms.ads.internal.util.zzau(this, context), com.google.android.gms.internal.ads.zzecq.DEBUG_MENU);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final boolean zzd(android.content.Context context, java.lang.String str, java.lang.String str2) {
        boolean z;
        java.lang.String zzo = zzo(context, zzp(context, (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfT), str, str2).toString(), str2);
        if (android.text.TextUtils.isEmpty(zzo)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Not linked for in app preview.");
            return false;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(zzo.trim());
            java.lang.String optString = jSONObject.optString("gct");
            this.zza = jSONObject.optString("status");
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkD)).booleanValue()) {
                java.lang.String str3 = this.zza;
                if (!"0".equals(str3) && !"2".equals(str3)) {
                    z = false;
                    zzj(z);
                    com.google.android.gms.ads.internal.util.zzg zzo2 = com.google.android.gms.ads.internal.zzt.zzh().zzo();
                    if (!z) {
                        str = "";
                    }
                    zzo2.zzM(str);
                }
                z = true;
                zzj(z);
                com.google.android.gms.ads.internal.util.zzg zzo22 = com.google.android.gms.ads.internal.zzt.zzh().zzo();
                if (!z) {
                }
                zzo22.zzM(str);
            }
            synchronized (this.zzb) {
                this.zzd = optString;
            }
            return true;
        } catch (org.json.JSONException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to get in app preview response json.", e);
            return false;
        }
    }

    public final boolean zze(android.content.Context context, java.lang.String str, java.lang.String str2) {
        java.lang.String zzo = zzo(context, zzp(context, (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfU), str, str2).toString(), str2);
        if (android.text.TextUtils.isEmpty(zzo)) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Not linked for debug signals.");
            return false;
        }
        try {
            boolean equals = "1".equals(new org.json.JSONObject(zzo.trim()).optString("debug_mode"));
            zzj(equals);
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkD)).booleanValue()) {
                com.google.android.gms.ads.internal.util.zzg zzo2 = com.google.android.gms.ads.internal.zzt.zzh().zzo();
                if (true != equals) {
                    str = "";
                }
                zzo2.zzM(str);
            }
            return equals;
        } catch (org.json.JSONException e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to get debug mode response json.", e);
            return false;
        }
    }

    public final void zzf(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzs.zzZ(context, zzp(context, (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfS), str, str2));
    }

    public final boolean zzg(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        if (android.text.TextUtils.isEmpty(str2) || !zzm()) {
            return false;
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Sending troubleshooting signals to the server.");
        zzh(context, str, str2, str3);
        return true;
    }

    public final void zzh(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        android.net.Uri.Builder buildUpon = zzp(context, (java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfV), str3, str).buildUpon();
        buildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzs.zzO(context, str, buildUpon.build().toString());
    }

    public final java.lang.String zzi() {
        java.lang.String str;
        synchronized (this.zzb) {
            str = this.zzd;
        }
        return str;
    }

    public final void zzj(boolean z) {
        synchronized (this.zzb) {
            this.zzf = z;
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkD)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzo().zzK(z);
                com.google.android.gms.internal.ads.zzecr zzecrVar = this.zzg;
                if (zzecrVar != null) {
                    zzecrVar.zzb(z);
                }
            }
        }
    }

    public final boolean zzk() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zzf;
        }
        return z;
    }

    public final void zzl(boolean z) {
        synchronized (this.zzb) {
            this.zze = z;
        }
    }

    public final boolean zzm() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zze;
        }
        return z;
    }

    protected final void zzn(android.content.Context context, java.lang.String str, boolean z, boolean z2) {
        if (context instanceof android.app.Activity) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new com.google.android.gms.ads.internal.util.zzaw(this, context, str, z, z2));
        } else {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Can not create dialog without Activity Context");
        }
    }
}
