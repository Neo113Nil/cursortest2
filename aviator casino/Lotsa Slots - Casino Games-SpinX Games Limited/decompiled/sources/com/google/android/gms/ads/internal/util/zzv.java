package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public class zzv extends com.google.android.gms.ads.internal.util.zzu {
    @Override // com.google.android.gms.ads.internal.util.zzt, com.google.android.gms.ads.internal.util.zzz
    public final com.google.android.gms.internal.ads.zzclf zzb(com.google.android.gms.internal.ads.zzcku zzckuVar, com.google.android.gms.internal.ads.zzbhp zzbhpVar, boolean z, com.google.android.gms.internal.ads.zzekr zzekrVar) {
        return new com.google.android.gms.internal.ads.zzcmj(zzckuVar, zzbhpVar, z, zzekrVar);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final com.google.android.gms.internal.ads.zzbhv.zzq zzf(android.content.Context context, android.telephony.TelephonyManager telephonyManager) {
        com.google.android.gms.ads.internal.zzt.zzc();
        return com.google.android.gms.ads.internal.util.zzs.zzD(context, "android.permission.ACCESS_NETWORK_STATE") ? telephonyManager.isDataEnabled() ? com.google.android.gms.internal.ads.zzbhv.zzq.ENUM_TRUE : com.google.android.gms.internal.ads.zzbhv.zzq.ENUM_FALSE : com.google.android.gms.internal.ads.zzbhv.zzq.ENUM_FALSE;
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final void zzg(android.content.Context context, java.lang.String str, java.lang.String str2) {
        android.app.NotificationChannel notificationChannel = new android.app.NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjM)).intValue());
        notificationChannel.setShowBadge(false);
        ((android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class)).createNotificationChannel(notificationChannel);
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final boolean zzh(android.content.Context context, java.lang.String str) {
        android.app.NotificationChannel notificationChannel = ((android.app.NotificationManager) context.getSystemService(android.app.NotificationManager.class)).getNotificationChannel("offline_notification_channel");
        return notificationChannel != null && notificationChannel.getImportance() == 0;
    }

    @Override // com.google.android.gms.ads.internal.util.zzz
    public final android.content.Intent zzi(android.app.Activity activity) {
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }
}
