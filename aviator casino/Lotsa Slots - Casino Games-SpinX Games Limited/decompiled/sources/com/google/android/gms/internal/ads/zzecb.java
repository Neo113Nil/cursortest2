package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzecb {
    private final android.content.Context zza;
    private final android.content.pm.ApplicationInfo zzb;
    private java.lang.String zze = "";
    private final int zzc = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkB)).intValue();
    private final int zzd = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkC)).intValue();

    public zzecb(android.content.Context context) {
        this.zza = context;
        this.zzb = context.getApplicationInfo();
    }

    public final org.json.JSONObject zza() throws org.json.JSONException {
        java.lang.String str;
        java.lang.String encodeToString;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            android.content.Context context = this.zza;
            java.lang.String str2 = this.zzb.packageName;
            com.google.android.gms.internal.ads.zzgam zzgamVar = com.google.android.gms.ads.internal.util.zzs.zza;
            jSONObject.put("name", com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationLabel(str2));
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        jSONObject.put("packageName", this.zzb.packageName);
        com.google.android.gms.ads.internal.zzt.zzc();
        android.graphics.drawable.Drawable drawable = null;
        try {
            str = com.google.android.gms.ads.internal.util.zzs.zzr(this.zza);
        } catch (android.os.RemoteException unused2) {
            str = null;
        }
        jSONObject.put("adMobAppId", str);
        if (this.zze.isEmpty()) {
            try {
                drawable = com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zza).getApplicationLabelAndIcon(this.zzb.packageName).second;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused3) {
            }
            if (drawable == null) {
                encodeToString = "";
            } else {
                int i = this.zzc;
                int i2 = this.zzd;
                drawable.setBounds(0, 0, i, i2);
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(i, i2, android.graphics.Bitmap.Config.ARGB_8888);
                drawable.draw(new android.graphics.Canvas(createBitmap));
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                createBitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                encodeToString = android.util.Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            }
            this.zze = encodeToString;
        }
        if (!this.zze.isEmpty()) {
            jSONObject.put("icon", this.zze);
            jSONObject.put("iconWidthPx", this.zzc);
            jSONObject.put("iconHeightPx", this.zzd);
        }
        return jSONObject;
    }
}
