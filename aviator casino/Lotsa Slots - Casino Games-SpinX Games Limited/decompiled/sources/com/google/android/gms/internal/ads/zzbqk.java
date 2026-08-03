package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbqk implements com.google.android.gms.internal.ads.zzbpq {
    private final android.content.Context zza;

    public zzbqk(android.content.Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbpq
    public final void zza(java.lang.Object obj, java.util.Map map) {
        if (!map.containsKey("text") || android.text.TextUtils.isEmpty((java.lang.CharSequence) map.get("text"))) {
            return;
        }
        java.lang.String str = (java.lang.String) map.get("text");
        java.lang.String.valueOf(str);
        com.google.android.gms.ads.internal.util.zze.zza("Opening Share Sheet with text: ".concat(java.lang.String.valueOf(str)));
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.intent.action.SEND");
        intent.setType(androidx.webkit.internal.AssetHelper.DEFAULT_MIME_TYPE);
        intent.putExtra("android.intent.extra.TEXT", (java.lang.String) map.get("text"));
        if (map.containsKey("title")) {
            intent.putExtra("android.intent.extra.TITLE", (java.lang.String) map.get("title"));
        }
        try {
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzY(this.zza, intent);
        } catch (java.lang.RuntimeException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to open Share Sheet", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "ShareSheetGmsgHandler.onGmsg");
        }
    }
}
