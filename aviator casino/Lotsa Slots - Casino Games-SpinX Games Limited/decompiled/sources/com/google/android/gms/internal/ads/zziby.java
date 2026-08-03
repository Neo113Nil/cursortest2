package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zziby implements java.lang.CharSequence {
    private char[] zza;
    private java.lang.String zzb;

    private zziby() {
        throw null;
    }

    /* synthetic */ zziby(byte[] bArr) {
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.zza[i];
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.zza.length;
    }

    @Override // java.lang.CharSequence
    public final java.lang.CharSequence subSequence(int i, int i2) {
        return new java.lang.String(this.zza, i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public final java.lang.String toString() {
        if (this.zzb == null) {
            this.zzb = new java.lang.String(this.zza);
        }
        return this.zzb;
    }

    final void zza(char[] cArr) {
        this.zza = cArr;
        this.zzb = null;
    }
}
