package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeeb {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.internal.util.client.VersionInfoParcel zzb;
    private final java.util.concurrent.Executor zzc;
    private final java.util.concurrent.atomic.AtomicReference zzd = new java.util.concurrent.atomic.AtomicReference("");

    zzeeb(android.content.Context context, com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel, java.util.concurrent.Executor executor) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = executor;
    }

    private final java.lang.String zzc() {
        java.lang.String str;
        com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel = this.zzb;
        java.lang.String str2 = null;
        if (versionInfoParcel.isClientJar) {
            str = com.google.android.gms.internal.ads.zzclf.class.getName();
        } else {
            try {
                str = (java.lang.String) new org.json.JSONObject(zzd((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpM))).get(java.lang.Integer.toString(versionInfoParcel.clientJarVersion));
            } catch (java.lang.ClassCastException | java.lang.IllegalArgumentException | java.lang.NullPointerException | org.json.JSONException e) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpL)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "SdkIE");
                }
                str = null;
            }
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return "2";
        }
        try {
            str2 = zzd((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpN));
        } catch (java.lang.IllegalArgumentException e2) {
            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpL)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "SdkIE");
            }
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            return androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D;
        }
        try {
            for (java.lang.reflect.Method method : this.zza.getClassLoader().loadClass(str).getDeclaredMethods()) {
                if (method.getName().matches(str2)) {
                    return "1";
                }
            }
            return "0";
        } catch (java.lang.ClassNotFoundException unused) {
            return "4";
        } catch (java.lang.NoClassDefFoundError unused2) {
            return "6";
        } catch (java.lang.SecurityException unused3) {
            return com.ironsource.Fc.e;
        } catch (java.util.regex.PatternSyntaxException unused4) {
            return "5";
        }
    }

    private static final java.lang.String zzd(java.lang.String str) throws java.lang.IllegalArgumentException {
        java.lang.String str2 = new java.lang.String(android.util.Base64.decode((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpO), 10), java.nio.charset.StandardCharsets.UTF_8);
        java.lang.String str3 = new java.lang.String(android.util.Base64.decode(str, 0));
        com.google.android.gms.internal.ads.zzgam zzgamVar = com.google.android.gms.ads.internal.util.zzs.zza;
        char[] charArray = str3.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] ^ str2.charAt(i % str2.length()));
        }
        return new java.lang.String(charArray);
    }

    public final java.lang.String zza() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpK)).booleanValue()) {
            if (!((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpM)).isEmpty()) {
                if (!((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpN)).isEmpty()) {
                    if (!((java.lang.String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzpO)).isEmpty()) {
                        java.lang.String str = (java.lang.String) this.zzd.get();
                        if (!str.isEmpty()) {
                            return str;
                        }
                        this.zzc.execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzeea
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                com.google.android.gms.internal.ads.zzeeb.this.zzb();
                            }
                        });
                        return null;
                    }
                }
            }
        }
        return null;
    }

    final /* synthetic */ void zzb() {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzd;
        synchronized (atomicReference) {
            if (((java.lang.String) atomicReference.get()).isEmpty()) {
                atomicReference.set(zzc());
            }
        }
    }
}
