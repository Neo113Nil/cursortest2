package com.google.android.gms.common.wrappers;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public class Wrappers {
    private static final com.google.android.gms.common.wrappers.Wrappers zzb = new com.google.android.gms.common.wrappers.Wrappers();
    private com.google.android.gms.common.wrappers.PackageManagerWrapper zza = null;

    public static com.google.android.gms.common.wrappers.PackageManagerWrapper packageManager(android.content.Context context) {
        return zzb.zza(context);
    }

    public final synchronized com.google.android.gms.common.wrappers.PackageManagerWrapper zza(android.content.Context context) {
        if (this.zza == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.zza = new com.google.android.gms.common.wrappers.PackageManagerWrapper(context);
        }
        return this.zza;
    }
}
