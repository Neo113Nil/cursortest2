package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzapd implements com.google.android.gms.internal.ads.zzanl {
    private final com.google.android.gms.internal.ads.zzet zza = new com.google.android.gms.internal.ads.zzet();
    private final com.google.android.gms.internal.ads.zzaou zzb = new com.google.android.gms.internal.ads.zzaou();

    @Override // com.google.android.gms.internal.ads.zzanl
    public final void zza(byte[] bArr, int i, int i2, com.google.android.gms.internal.ads.zzank zzankVar, com.google.android.gms.internal.ads.zzdt zzdtVar) {
        com.google.android.gms.internal.ads.zzet zzetVar = this.zza;
        zzetVar.zzb(bArr, i2 + i);
        zzetVar.zzh(i);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            int zzg = zzetVar.zzg();
            java.lang.String zzN = zzetVar.zzN(java.nio.charset.StandardCharsets.UTF_8);
            if (zzN == null || !zzN.startsWith("WEBVTT")) {
                zzetVar.zzh(zzg);
                java.lang.String zzN2 = zzetVar.zzN(java.nio.charset.StandardCharsets.UTF_8);
                java.lang.String.valueOf(zzN2);
                throw com.google.android.gms.internal.ads.zzat.zzb("Expected WEBVTT. Got ".concat(java.lang.String.valueOf(zzN2)), null);
            }
            while (!android.text.TextUtils.isEmpty(zzetVar.zzN(java.nio.charset.StandardCharsets.UTF_8))) {
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            while (true) {
                char c = 65535;
                int i3 = 0;
                while (c == 65535) {
                    i3 = zzetVar.zzg();
                    java.lang.String zzN3 = zzetVar.zzN(java.nio.charset.StandardCharsets.UTF_8);
                    c = zzN3 == null ? (char) 0 : "STYLE".equals(zzN3) ? (char) 2 : zzN3.startsWith("NOTE") ? (char) 1 : (char) 3;
                }
                zzetVar.zzh(i3);
                if (c == 0) {
                    com.google.android.gms.internal.ads.zzanf.zza(new com.google.android.gms.internal.ads.zzapg(arrayList2), zzankVar, zzdtVar);
                    return;
                }
                if (c == 1) {
                    while (!android.text.TextUtils.isEmpty(zzetVar.zzN(java.nio.charset.StandardCharsets.UTF_8))) {
                    }
                } else if (c != 2) {
                    com.google.android.gms.internal.ads.zzaow zza = com.google.android.gms.internal.ads.zzapc.zza(zzetVar, arrayList);
                    if (zza != null) {
                        arrayList2.add(zza);
                    }
                } else {
                    if (!arrayList2.isEmpty()) {
                        throw new java.lang.IllegalArgumentException("A style block was found after the first cue.");
                    }
                    zzetVar.zzN(java.nio.charset.StandardCharsets.UTF_8);
                    arrayList.addAll(this.zzb.zza(zzetVar));
                }
            }
        } catch (com.google.android.gms.internal.ads.zzat e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }
}
