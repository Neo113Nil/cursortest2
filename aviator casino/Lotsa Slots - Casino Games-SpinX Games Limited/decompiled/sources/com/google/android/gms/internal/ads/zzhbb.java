package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzhbb extends com.google.android.gms.internal.ads.zzhaz {
    private zzhbb() {
        throw null;
    }

    /* synthetic */ zzhbb(byte[] bArr) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    final void zza(com.google.android.gms.internal.ads.zzhbc zzhbcVar, java.util.Set set, java.util.Set set2) {
        synchronized (zzhbcVar) {
            if (zzhbcVar.seenExceptionsField == null) {
                zzhbcVar.seenExceptionsField = set2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaz
    final int zzb(com.google.android.gms.internal.ads.zzhbc zzhbcVar) {
        int i;
        synchronized (zzhbcVar) {
            i = zzhbcVar.remainingField - 1;
            zzhbcVar.remainingField = i;
        }
        return i;
    }
}
