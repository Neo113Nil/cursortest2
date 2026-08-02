package com.google.android.libraries.places.internal;

/* loaded from: classes.dex */
public final class zzbmg {
    private java.lang.Object[] zzd;
    private int zze;
    private static final java.util.logging.Logger zzc = java.util.logging.Logger.getLogger(com.google.android.libraries.places.internal.zzbmg.class.getName());
    public static final com.google.android.libraries.places.internal.zzbmb zza = new com.google.android.libraries.places.internal.zzblz();
    static final com.google.common.io.BaseEncoding zzb = com.google.common.io.BaseEncoding.base64().omitPadding();

    private final byte[] zzh(int i) {
        return (byte[]) this.zzd[i + i];
    }

    private final java.lang.Object zzi(int i) {
        return this.zzd[i + i + 1];
    }

    private final byte[] zzj(int i) {
        java.lang.Object zzi = zzi(i);
        if (zzi instanceof byte[]) {
            return (byte[]) zzi;
        }
        throw null;
    }

    private final void zzm(int i) {
        java.lang.Object[] objArr = new java.lang.Object[i];
        if (!zzl()) {
            java.lang.Object[] objArr2 = this.zzd;
            int i2 = this.zze;
            java.lang.System.arraycopy(objArr2, 0, objArr, 0, i2 + i2);
        }
        this.zzd = objArr;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Metadata(");
        for (int i = 0; i < this.zze; i++) {
            if (i != 0) {
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            }
            java.lang.String str = new java.lang.String(zzh(i), java.nio.charset.StandardCharsets.US_ASCII);
            sb.append(str);
            sb.append('=');
            if (str.endsWith("-bin")) {
                sb.append(zzb.encode(zzj(i)));
            } else {
                sb.append(new java.lang.String(zzj(i), java.nio.charset.StandardCharsets.US_ASCII));
            }
        }
        sb.append(')');
        return sb.toString();
    }

    @javax.annotation.Nullable
    public final java.lang.Object zzb(com.google.android.libraries.places.internal.zzbmc zzbmcVar) {
        int i = this.zze;
        do {
            i--;
            if (i < 0) {
                return null;
            }
        } while (!java.util.Arrays.equals(zzbmcVar.zze(), zzh(i)));
        java.lang.Object zzi = zzi(i);
        if (zzi instanceof byte[]) {
            return zzbmcVar.zzb((byte[]) zzi);
        }
        throw null;
    }

    public final void zzc(com.google.android.libraries.places.internal.zzbmc zzbmcVar, java.lang.Object obj) {
        com.google.common.base.Preconditions.checkNotNull(zzbmcVar, "key");
        com.google.common.base.Preconditions.checkNotNull(obj, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE);
        int i = this.zze;
        int i2 = i + i;
        if (i2 == 0 || i2 == zzk()) {
            zzm(java.lang.Math.max(i2 + i2, 8));
        }
        int i3 = this.zze;
        this.zzd[i3 + i3] = zzbmcVar.zze();
        int i4 = this.zze;
        this.zzd[i4 + i4 + 1] = zzbmcVar.zza(obj);
        this.zze++;
    }

    public final void zzd(com.google.android.libraries.places.internal.zzbmc zzbmcVar) {
        if (zzl()) {
            return;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = this.zze;
            if (i >= i3) {
                java.util.Arrays.fill(this.zzd, i2 + i2, i3 + i3, (java.lang.Object) null);
                this.zze = i2;
                return;
            }
            if (!java.util.Arrays.equals(zzbmcVar.zze(), zzh(i))) {
                int i4 = i2 + i2;
                this.zzd[i4] = zzh(i);
                java.lang.Object zzi = zzi(i);
                if (this.zzd instanceof byte[][]) {
                    zzm(zzk());
                }
                this.zzd[i4 + 1] = zzi;
                i2++;
            }
            i++;
        }
    }

    @javax.annotation.Nullable
    final byte[][] zze() {
        int i = this.zze;
        int i2 = i + i;
        byte[][] bArr = new byte[i2][];
        java.lang.Object[] objArr = this.zzd;
        if (objArr instanceof byte[][]) {
            java.lang.System.arraycopy(objArr, 0, bArr, 0, i2);
            return bArr;
        }
        for (int i3 = 0; i3 < this.zze; i3++) {
            int i4 = i3 + i3;
            bArr[i4] = zzh(i3);
            bArr[i4 + 1] = zzj(i3);
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if ((r0 - r1) < (r2 + r2)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(com.google.android.libraries.places.internal.zzbmg zzbmgVar) {
        if (zzbmgVar.zzl()) {
            return;
        }
        int zzk = zzk();
        int i = this.zze;
        int i2 = i + i;
        if (!zzl()) {
            int i3 = zzbmgVar.zze;
        }
        int i4 = zzbmgVar.zze;
        zzm(i2 + i4 + i4);
        java.lang.Object[] objArr = zzbmgVar.zzd;
        java.lang.Object[] objArr2 = this.zzd;
        int i5 = this.zze;
        int i6 = zzbmgVar.zze;
        java.lang.System.arraycopy(objArr, 0, objArr2, i5 + i5, i6 + i6);
        this.zze += zzbmgVar.zze;
    }

    final int zza() {
        return this.zze;
    }

    private final boolean zzl() {
        return this.zze == 0;
    }

    private final int zzk() {
        java.lang.Object[] objArr = this.zzd;
        if (objArr != null) {
            return objArr.length;
        }
        return 0;
    }

    zzbmg(int i, java.lang.Object[] objArr) {
        this.zze = i;
        this.zzd = objArr;
    }

    public zzbmg() {
    }
}
