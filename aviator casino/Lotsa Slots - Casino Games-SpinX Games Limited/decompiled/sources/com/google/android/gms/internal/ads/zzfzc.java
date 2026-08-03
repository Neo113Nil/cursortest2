package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfzc {
    final com.google.android.gms.internal.ads.zzfzf zza;
    final boolean zzb;

    private zzfzc(com.google.android.gms.internal.ads.zzfzf zzfzfVar) {
        this.zza = zzfzfVar;
        this.zzb = zzfzfVar != null;
    }

    public static com.google.android.gms.internal.ads.zzfzc zzb(android.content.Context context, java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzfzf zzfzdVar;
        try {
            try {
                try {
                    android.os.IBinder instantiate = com.google.android.gms.dynamite.DynamiteModule.load(context, com.google.android.gms.dynamite.DynamiteModule.PREFER_REMOTE, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    android.os.IBinder iBinder = instantiate;
                    if (instantiate == null) {
                        zzfzdVar = null;
                    } else {
                        android.os.IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzfzdVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzfzf ? (com.google.android.gms.internal.ads.zzfzf) queryLocalInterface : new com.google.android.gms.internal.ads.zzfzd(instantiate);
                    }
                    com.google.android.gms.internal.ads.zzfzf zzfzfVar = zzfzdVar;
                    zzfzdVar.zzj(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, null);
                    android.util.Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new com.google.android.gms.internal.ads.zzfzc(zzfzdVar);
                } catch (java.lang.Exception e) {
                    throw new com.google.android.gms.internal.ads.zzfyf(e);
                }
            } catch (java.lang.Exception e2) {
                throw new com.google.android.gms.internal.ads.zzfyf(e2);
            }
        } catch (android.os.RemoteException | com.google.android.gms.internal.ads.zzfyf | java.lang.NullPointerException | java.lang.SecurityException unused) {
            android.util.Log.d("GASS", "Cannot dynamite load clearcut");
            return new com.google.android.gms.internal.ads.zzfzc(new com.google.android.gms.internal.ads.zzfzg());
        }
    }

    public static com.google.android.gms.internal.ads.zzfzc zzc() {
        com.google.android.gms.internal.ads.zzfzg zzfzgVar = new com.google.android.gms.internal.ads.zzfzg();
        android.util.Log.d("GASS", "Clearcut logging disabled");
        return new com.google.android.gms.internal.ads.zzfzc(zzfzgVar);
    }

    public final com.google.android.gms.internal.ads.zzfzb zza(byte[] bArr) {
        return new com.google.android.gms.internal.ads.zzfzb(this, bArr, null);
    }
}
