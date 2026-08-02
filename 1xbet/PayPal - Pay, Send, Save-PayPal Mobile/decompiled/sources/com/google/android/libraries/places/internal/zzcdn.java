package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcdn {
    private final java.lang.String zza;
    private final int zzb;
    private final java.lang.String zzc;

    /* synthetic */ zzcdn(com.google.android.libraries.places.internal.zzcdm zzcdmVar, byte[] bArr) {
        this.zza = zzcdmVar.zzb;
        this.zzb = zzcdmVar.zzd();
        this.zzc = zzcdmVar.toString();
    }

    public static int zzc(java.lang.String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    static int zzd(char c) {
        if (c >= '0' && c <= '9') {
            return c - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c < 'A' || c > 'F') {
            return -1;
        }
        return c - '7';
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof com.google.android.libraries.places.internal.zzcdn) && ((com.google.android.libraries.places.internal.zzcdn) obj).zzc.equals(this.zzc);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final int zzb() {
        return this.zzb;
    }

    public final java.lang.String zza() {
        return this.zza;
    }

    public final java.lang.String toString() {
        return this.zzc;
    }
}
