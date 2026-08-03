package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzpn extends com.google.android.gms.internal.consent_sdk.zzpp {
    private int zzb;
    private int zzc;
    private int zzd;

    /* synthetic */ zzpn(byte[] bArr, int i, int i2, boolean z, com.google.android.gms.internal.consent_sdk.zzpo zzpoVar) {
        super(null);
        this.zzd = Integer.MAX_VALUE;
        this.zzb = 0;
    }

    public final int zza(int i) throws com.google.android.gms.internal.consent_sdk.zzqu {
        int i2 = this.zzd;
        this.zzd = 0;
        int i3 = this.zzb + this.zzc;
        this.zzb = i3;
        if (i3 > 0) {
            this.zzc = i3;
            this.zzb = i3 - i3;
        } else {
            this.zzc = 0;
        }
        return i2;
    }
}
