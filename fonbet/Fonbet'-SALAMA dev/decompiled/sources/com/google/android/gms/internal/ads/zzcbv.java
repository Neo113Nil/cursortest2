package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcbv extends zzaqk {
    static final zzcbv zzb = new zzcbv();

    @Override // com.google.android.gms.internal.ads.zzaqk
    public final zzaqo zza(String str, byte[] bArr, String str2) {
        return "moov".equals(str) ? new zzaqq() : "mvhd".equals(str) ? new zzaqr() : new zzaqs(str);
    }
}
