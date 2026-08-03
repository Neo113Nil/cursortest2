package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbhx {
    private final android.content.Context zza;

    public zzbhx(android.content.Context context) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context, "Context can not be null");
        this.zza = context;
    }

    public final boolean zza() {
        android.content.Context context = this.zza;
        return ((java.lang.Boolean) com.google.android.gms.ads.internal.util.zzcb.zza(context, com.google.android.gms.internal.ads.zzbhw.zza)).booleanValue() && com.google.android.gms.common.wrappers.Wrappers.packageManager(context).checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public final boolean zzb() {
        return zzc(new android.content.Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event"));
    }

    public final boolean zzc(android.content.Intent intent) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(intent, "Intent can not be null");
        return !this.zza.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
    }
}
