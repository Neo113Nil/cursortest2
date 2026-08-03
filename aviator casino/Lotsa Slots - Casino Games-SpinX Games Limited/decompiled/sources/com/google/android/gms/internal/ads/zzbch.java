package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbch extends com.google.android.gms.internal.ads.zzbdf {
    public zzbch(com.google.android.gms.internal.ads.zzbbs zzbbsVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzaxm zzaxmVar, int i, int i2) {
        super(zzbbsVar, "m7g/XX2t5caOhtOM/ogmEO9Vkwmhkxe5gTS2qje4vP8HJASoqVE/26NLNeDuMz/t", "+Weh9OuqHFyRkOD06GxXjljhJF/GsDXbBDxKrn8yplc=", zzaxmVar, i, 5);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        com.google.android.gms.internal.ads.zzaxm zzaxmVar = this.zzd;
        zzaxmVar.zzd(-1L);
        zzaxmVar.zze(-1L);
        int[] iArr = (int[]) this.zze.invoke(null, this.zza.zzb());
        synchronized (zzaxmVar) {
            zzaxmVar.zzd(iArr[0]);
            zzaxmVar.zze(iArr[1]);
            int i = iArr[2];
            if (i != Integer.MIN_VALUE) {
                zzaxmVar.zzO(i);
            }
        }
    }
}
