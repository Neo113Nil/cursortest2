package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzcbv extends zzaqk {
    static final zzcbv zzb = new zzcbv();

    @Override // com.google.android.gms.internal.ads.zzaqk
    public final zzaqo zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzaqq();
        }
        return "mvhd".equals(str) ? new zzaqr() : new zzaqs(str);
    }
}
