package com.google.android.gms.common.internal;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public final class zzah {
    private static final android.net.Uri zza = new android.net.Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    static android.content.Intent zza(android.content.Context context, com.google.android.gms.common.internal.zzn zznVar) throws com.google.android.gms.common.internal.zzaf {
        android.os.Bundle bundle;
        android.content.ContentProviderClient acquireUnstableContentProviderClient;
        java.lang.String zza2 = zznVar.zza();
        if (zza2 == null) {
            return new android.content.Intent().setComponent(zznVar.zzc());
        }
        android.content.Intent intent = null;
        if (zznVar.zzd()) {
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putString("serviceActionBundleKey", zza2);
            try {
                acquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(zza);
            } catch (android.os.RemoteException | java.lang.IllegalArgumentException e) {
                android.util.Log.w("ServiceBindIntentUtils", "Dynamic intent resolution failed: ".concat(e.toString()));
                bundle = null;
            }
            if (acquireUnstableContentProviderClient == null) {
                throw new android.os.RemoteException("Failed to acquire ContentProviderClient");
            }
            try {
                bundle = acquireUnstableContentProviderClient.call("serviceIntentCall", null, bundle2);
                acquireUnstableContentProviderClient.release();
                if (bundle != null) {
                    android.content.Intent intent2 = (android.content.Intent) bundle.getParcelable("serviceResponseIntentKey");
                    if (intent2 != null) {
                        intent = intent2;
                    } else {
                        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) bundle.getParcelable("serviceMissingResolutionIntentKey");
                        if (pendingIntent != null) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder(zza2.length() + 72);
                            sb.append("Dynamic lookup for intent failed for action ");
                            sb.append(zza2);
                            sb.append(" but has possible resolution");
                            android.util.Log.w("ServiceBindIntentUtils", sb.toString());
                            throw new com.google.android.gms.common.internal.zzaf(new com.google.android.gms.common.ConnectionResult(25, pendingIntent));
                        }
                    }
                }
                if (intent == null) {
                    android.util.Log.w("ServiceBindIntentUtils", "Dynamic lookup for intent failed for action: ".concat(zza2));
                }
            } catch (java.lang.Throwable th) {
                acquireUnstableContentProviderClient.release();
                throw th;
            }
        }
        return intent == null ? new android.content.Intent(zza2).setPackage(zznVar.zzb()) : intent;
    }
}
