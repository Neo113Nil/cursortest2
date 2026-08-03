package com.google.android.gms.cloudmessaging;

/* compiled from: com.google.android.gms:play-services-cloud-messaging@@17.2.0 */
/* loaded from: classes3.dex */
public final class zzw {
    private final android.content.Context zza;
    private int zzb;
    private int zzc = 0;

    public zzw(android.content.Context context) {
        this.zza = context;
    }

    public final synchronized int zza() {
        android.content.pm.PackageInfo packageInfo;
        if (this.zzb == 0) {
            try {
                packageInfo = com.google.android.gms.common.wrappers.Wrappers.packageManager(this.zza).getPackageInfo("com.google.android.gms", 0);
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                android.util.Log.w("Metadata", "Failed to find package ".concat(e.toString()));
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.zzb = packageInfo.versionCode;
            }
        }
        return this.zzb;
    }

    public final synchronized int zzb() {
        int i = this.zzc;
        if (i != 0) {
            return i;
        }
        android.content.Context context = this.zza;
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        if (com.google.android.gms.common.wrappers.Wrappers.packageManager(context).checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            android.util.Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (!com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
            android.content.Intent intent = new android.content.Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            java.util.List<android.content.pm.ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
                this.zzc = i2;
                return i2;
            }
        }
        android.content.Intent intent2 = new android.content.Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        java.util.List<android.content.pm.ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
            i2 = 2;
            this.zzc = i2;
            return i2;
        }
        android.util.Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (true == com.google.android.gms.common.util.PlatformVersion.isAtLeastO()) {
            i2 = 2;
        }
        this.zzc = i2;
        return i2;
    }
}
