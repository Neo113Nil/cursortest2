package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
public final class zzam {
    private final com.google.android.play.core.splitcompat.zze zza;
    private final com.google.android.play.core.splitinstall.internal.zzah zzb;
    private final android.content.Context zzc;
    private final com.google.android.play.core.splitinstall.internal.zzal zzd;
    private android.content.pm.PackageInfo zze;

    public zzam(android.content.Context context, com.google.android.play.core.splitcompat.zze zzeVar, com.google.android.play.core.splitinstall.internal.zzah zzahVar) {
        com.google.android.play.core.splitinstall.internal.zzal zzalVar = new com.google.android.play.core.splitinstall.internal.zzal(new com.google.android.play.core.splitcompat.zza(zzeVar));
        this.zza = zzeVar;
        this.zzb = zzahVar;
        this.zzc = context;
        this.zzd = zzalVar;
    }

    private final android.content.pm.PackageInfo zzd() {
        if (this.zze == null) {
            try {
                this.zze = this.zzc.getPackageManager().getPackageInfo(this.zzc.getPackageName(), 64);
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return this.zze;
    }

    private static java.security.cert.X509Certificate zze(android.content.pm.Signature signature) {
        try {
            return (java.security.cert.X509Certificate) java.security.cert.CertificateFactory.getInstance("X509").generateCertificate(new java.io.ByteArrayInputStream(signature.toByteArray()));
        } catch (java.security.cert.CertificateException unused) {
            return null;
        }
    }

    public final boolean zza(java.io.File[] fileArr) throws java.io.IOException, org.xmlpull.v1.XmlPullParserException {
        long longVersionCode = android.os.Build.VERSION.SDK_INT >= 28 ? zzd().getLongVersionCode() : r0.versionCode;
        android.content.res.AssetManager assetManager = (android.content.res.AssetManager) com.google.android.play.core.splitinstall.internal.zzbk.zzc(android.content.res.AssetManager.class);
        int length = fileArr.length;
        do {
            length--;
            if (length < 0) {
                return true;
            }
            this.zzd.zzb(assetManager, fileArr[length]);
        } while (longVersionCode == this.zzd.zza());
        return false;
    }

    public final boolean zzb(java.util.List list) throws java.io.IOException {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!this.zza.zzg(((android.content.Intent) it.next()).getStringExtra("split_id")).exists()) {
                return false;
            }
        }
        return true;
    }

    public final boolean zzc(java.io.File[] fileArr) {
        android.content.pm.PackageInfo zzd = zzd();
        java.util.ArrayList<java.security.cert.X509Certificate> arrayList = null;
        if (zzd != null && zzd.signatures != null) {
            arrayList = new java.util.ArrayList();
            for (android.content.pm.Signature signature : zzd.signatures) {
                java.security.cert.X509Certificate zze = zze(signature);
                if (zze != null) {
                    arrayList.add(zze);
                }
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int length = fileArr.length;
        loop1: while (true) {
            length--;
            if (length < 0) {
                return true;
            }
            try {
                java.security.cert.X509Certificate[][] zza = com.google.android.play.core.splitinstall.internal.zzi.zza(fileArr[length].getAbsolutePath());
                if (zza == null || zza.length == 0 || zza[0].length == 0 || arrayList.isEmpty()) {
                    break;
                }
                for (java.security.cert.X509Certificate x509Certificate : arrayList) {
                    for (java.security.cert.X509Certificate[] x509CertificateArr : zza) {
                        int i = x509CertificateArr[0].equals(x509Certificate) ? 0 : i + 1;
                    }
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return false;
    }
}
