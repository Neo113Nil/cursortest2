package com.google.android.gms.ads.internal.util.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzs {
    public static java.lang.Object zza(android.content.Context context, java.lang.String str, com.google.android.gms.ads.internal.util.client.zzq zzqVar) throws com.google.android.gms.ads.internal.util.client.zzr {
        try {
            return zzqVar.zza(zzc(context).instantiate(str));
        } catch (java.lang.Exception e) {
            throw new com.google.android.gms.ads.internal.util.client.zzr(e);
        }
    }

    public static android.content.Context zzb(android.content.Context context) throws com.google.android.gms.ads.internal.util.client.zzr {
        return zzc(context).getModuleContext();
    }

    private static com.google.android.gms.dynamite.DynamiteModule zzc(android.content.Context context) throws com.google.android.gms.ads.internal.util.client.zzr {
        try {
            return com.google.android.gms.dynamite.DynamiteModule.load(context, com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_ID);
        } catch (java.lang.Exception e) {
            throw new com.google.android.gms.ads.internal.util.client.zzr(e);
        }
    }
}
