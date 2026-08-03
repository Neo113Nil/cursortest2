package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgms {
    private final java.util.concurrent.atomic.AtomicBoolean zza = new java.util.concurrent.atomic.AtomicBoolean(false);
    private com.google.android.gms.internal.ads.zzhek zzb = null;
    private com.google.android.gms.internal.ads.zzhek zzc = null;

    zzgms() {
    }

    public final boolean zza(com.google.android.gms.internal.ads.zzbdm zzbdmVar) {
        com.google.android.gms.internal.ads.zzhek zzhekVar;
        byte[] zzA = zzbdmVar.zza().zzb().zzb().zzA();
        byte[] zzA2 = zzbdmVar.zza().zzd().zzA();
        try {
            try {
                if (!this.zza.getAndSet(true)) {
                    try {
                        com.google.android.gms.internal.ads.zzhxh.zza();
                        this.zzb = (com.google.android.gms.internal.ads.zzhek) com.google.android.gms.internal.ads.zzhem.zza(new java.lang.String(com.google.android.gms.internal.ads.zzgea.zzb("eyJwcmltYXJ5S2V5SWQiOjMzMTUxOTk4MTksImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQVNoRGZwOUM5QjcrMU1nMmJQbHJ5WExPOHVScDd6YWZJMldSYURmR1ZqVmlJaEFJNFZzTmVrcCs0bVY0d2toZlhVb3pQZWs5TjgxcUdIK2plNnhjOFpoQkhQIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMzE1MTk5ODE5LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=", false))).zzh(com.google.android.gms.internal.ads.zzhnr.zza(), com.google.android.gms.internal.ads.zzhek.class);
                        this.zzc = (com.google.android.gms.internal.ads.zzhek) com.google.android.gms.internal.ads.zzhem.zza(new java.lang.String(com.google.android.gms.internal.ads.zzgea.zzb("eyJwcmltYXJ5S2V5SWQiOjMwODI3ODA4ODgsImtleSI6W3sia2V5RGF0YSI6eyJ0eXBlVXJsIjoidHlwZS5nb29nbGVhcGlzLmNvbS9nb29nbGUuY3J5cHRvLnRpbmsuRWNkc2FQdWJsaWNLZXkiLCJ2YWx1ZSI6IkVnWUlBeEFDR0FFYUlRQkEyWW5HaWFpc3pEcGtJcWpjalorUTJ2alFUUldQZjhFcTlkZVlhNFpKa3lJaEFCQWFESTd6QWJkQXVpQmlnOWdHSkJ1VTUzSGg5Z0RCa0t2amswS2tabDhjIiwia2V5TWF0ZXJpYWxUeXBlIjoiQVNZTU1FVFJJQ19QVUJMSUMifSwic3RhdHVzIjoiRU5BQkxFRCIsImtleUlkIjozMDgyNzgwODg4LCJvdXRwdXRQcmVmaXhUeXBlIjoiVElOSyJ9XX0=", false))).zzh(com.google.android.gms.internal.ads.zzhnr.zza(), com.google.android.gms.internal.ads.zzhek.class);
                    } catch (java.lang.Exception e) {
                        throw new java.security.GeneralSecurityException("Failed to verify program", e);
                    }
                }
                zzhekVar = this.zzb;
            } catch (java.security.GeneralSecurityException unused) {
                return false;
            }
        } catch (java.security.GeneralSecurityException unused2) {
            com.google.android.gms.internal.ads.zzhek zzhekVar2 = this.zzc;
            if (zzhekVar2 != null) {
                zzhekVar2.zza(zzA, zzA2);
            }
            return false;
        }
        if (zzhekVar == null) {
            throw new java.security.GeneralSecurityException();
        }
        zzhekVar.zza(zzA, zzA2);
        return true;
    }
}
