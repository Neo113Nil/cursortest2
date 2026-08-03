package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbdi {
    public static java.lang.String zza(android.content.Context context, java.lang.String str, java.util.List list, java.util.concurrent.Executor executor) throws java.security.cert.CertificateEncodingException, android.content.pm.PackageManager.NameNotFoundException, java.lang.InterruptedException, java.util.concurrent.ExecutionException {
        if (android.os.Build.VERSION.SDK_INT <= 30 && !android.os.Build.VERSION.CODENAME.equals(androidx.exifinterface.media.ExifInterface.LATITUDE_SOUTH)) {
            return null;
        }
        final com.google.android.gms.internal.ads.zzhcp zze = com.google.android.gms.internal.ads.zzhcp.zze();
        context.getPackageManager().requestChecksums(str, false, 8, list, new android.content.pm.PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzbdh
            @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
            public final /* synthetic */ void onChecksumsReady(java.util.List list2) {
                com.google.android.gms.internal.ads.zzhcp zzhcpVar = com.google.android.gms.internal.ads.zzhcp.this;
                if (list2 == null) {
                    zzhcpVar.zza((java.lang.Object) null);
                    return;
                }
                try {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        android.content.pm.ApkChecksum apkChecksum = (android.content.pm.ApkChecksum) list2.get(i);
                        if (apkChecksum.getType() == 8) {
                            zzhcpVar.zza(com.google.android.gms.internal.ads.zzbbv.zza(apkChecksum.getValue()));
                            return;
                        }
                    }
                    zzhcpVar.zza((java.lang.Object) null);
                } catch (java.lang.Throwable unused) {
                    zzhcpVar.zza((java.lang.Object) null);
                }
            }
        });
        return (java.lang.String) zze.get();
    }
}
