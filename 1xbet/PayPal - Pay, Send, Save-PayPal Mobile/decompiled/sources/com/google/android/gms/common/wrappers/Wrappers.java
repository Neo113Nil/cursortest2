package com.google.android.gms.common.wrappers;

/* loaded from: classes4.dex */
public class Wrappers {
    private static final com.google.android.gms.common.wrappers.Wrappers zzb = new com.google.android.gms.common.wrappers.Wrappers();
    private com.google.android.gms.common.wrappers.PackageManagerWrapper zza = null;

    public static com.google.android.gms.common.wrappers.PackageManagerWrapper packageManager(android.content.Context context) {
        return zzb.zza(context);
    }

    public final com.google.android.gms.common.wrappers.PackageManagerWrapper zza(android.content.Context context) {
        com.google.android.gms.common.wrappers.PackageManagerWrapper packageManagerWrapper;
        synchronized (this) {
            if (this.zza == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.zza = new com.google.android.gms.common.wrappers.PackageManagerWrapper(context);
            }
            packageManagerWrapper = this.zza;
        }
        return packageManagerWrapper;
    }
}
