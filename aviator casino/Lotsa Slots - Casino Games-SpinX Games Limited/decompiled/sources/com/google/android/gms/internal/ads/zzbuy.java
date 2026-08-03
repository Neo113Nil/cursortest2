package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbuy extends com.google.android.gms.internal.ads.zzbvb {
    @Override // com.google.android.gms.internal.ads.zzbvc
    public final com.google.android.gms.internal.ads.zzbvf zzb(java.lang.String str) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbwd zzbwdVar;
        try {
            try {
                java.lang.Class<?> cls = java.lang.Class.forName(str, false, com.google.android.gms.internal.ads.zzbuy.class.getClassLoader());
                if (com.google.android.gms.ads.mediation.MediationAdapter.class.isAssignableFrom(cls)) {
                    return new com.google.android.gms.internal.ads.zzbwd((com.google.android.gms.ads.mediation.MediationAdapter) cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
                }
                if (com.google.android.gms.ads.mediation.Adapter.class.isAssignableFrom(cls)) {
                    return new com.google.android.gms.internal.ads.zzbwd((com.google.android.gms.ads.mediation.Adapter) cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 64);
                sb.append("Could not instantiate mediation adapter: ");
                sb.append(str);
                sb.append(" (not a valid adapter).");
                com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
                throw new android.os.RemoteException();
            } catch (java.lang.Throwable th) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 43);
                sb2.append("Could not instantiate mediation adapter: ");
                sb2.append(str);
                sb2.append(". ");
                com.google.android.gms.ads.internal.util.client.zzo.zzj(sb2.toString(), th);
                throw new android.os.RemoteException();
            }
        } catch (java.lang.Throwable unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Reflection failed, retrying using direct instantiation");
            if (!"com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    zzbwdVar = new com.google.android.gms.internal.ads.zzbwd(new com.google.android.gms.ads.mediation.customevent.CustomEventAdapter());
                }
                throw new android.os.RemoteException();
            }
            zzbwdVar = new com.google.android.gms.internal.ads.zzbwd(new com.google.ads.mediation.admob.AdMobAdapter());
            return zzbwdVar;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final boolean zzc(java.lang.String str) throws android.os.RemoteException {
        try {
            return com.google.android.gms.ads.mediation.customevent.CustomEvent.class.isAssignableFrom(java.lang.Class.forName(str, false, com.google.android.gms.internal.ads.zzbuy.class.getClassLoader()));
        } catch (java.lang.Throwable unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 88);
            sb.append("Could not load custom event implementation class: ");
            sb.append(str);
            sb.append(", trying Adapter implementation class.");
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final boolean zzd(java.lang.String str) throws android.os.RemoteException {
        try {
            return com.google.android.gms.ads.mediation.Adapter.class.isAssignableFrom(java.lang.Class.forName(str, false, com.google.android.gms.internal.ads.zzbuy.class.getClassLoader()));
        } catch (java.lang.Throwable unused) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 104);
            sb.append("Could not load custom event implementation class as Adapter: ");
            sb.append(str);
            sb.append(", assuming old custom event implementation.");
            com.google.android.gms.ads.internal.util.client.zzo.zzi(sb.toString());
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvc
    public final com.google.android.gms.internal.ads.zzbxb zze(java.lang.String str) throws android.os.RemoteException {
        return new com.google.android.gms.internal.ads.zzbxo((com.google.android.gms.ads.mediation.rtb.RtbAdapter) java.lang.Class.forName(str, false, com.google.android.gms.internal.ads.zzbxf.class.getClassLoader()).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]));
    }
}
