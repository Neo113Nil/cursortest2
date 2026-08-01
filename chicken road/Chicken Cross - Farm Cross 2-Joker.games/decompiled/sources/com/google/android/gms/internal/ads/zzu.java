package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final /* synthetic */ class zzu implements zzgub {
    static final /* synthetic */ zzu zza = new zzu();

    private /* synthetic */ zzu() {
    }

    @Override // com.google.android.gms.internal.ads.zzgub
    public final /* synthetic */ Object apply(Object obj) {
        zzx zzxVar = (zzx) obj;
        int i = zzv.zzR;
        String str = zzxVar.zza;
        String str2 = zzxVar.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": ");
        sb.append(str2);
        return sb.toString();
    }
}
