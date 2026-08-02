package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
class zzge extends com.google.android.gms.internal.fido.zzgf {

    @javax.annotation.CheckForNull
    private volatile com.google.android.gms.internal.fido.zzgf zza;
    final com.google.android.gms.internal.fido.zzgb zzb;

    @javax.annotation.CheckForNull
    final java.lang.Character zzc;

    zzge(com.google.android.gms.internal.fido.zzgb zzgbVar, @javax.annotation.CheckForNull java.lang.Character ch) {
        this.zzb = zzgbVar;
        if (ch != null) {
            ch.charValue();
            if (zzgbVar.zzc('=')) {
                throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.fido.zzbo.zza("Padding character %s was already in alphabet", ch));
            }
        }
        this.zzc = ch;
    }

    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.internal.fido.zzge)) {
            return false;
        }
        com.google.android.gms.internal.fido.zzge zzgeVar = (com.google.android.gms.internal.fido.zzge) obj;
        return this.zzb.equals(zzgeVar.zzb) && java.util.Objects.equals(this.zzc, zzgeVar.zzc);
    }

    public final int hashCode() {
        java.lang.Character ch = this.zzc;
        return java.util.Objects.hashCode(ch) ^ this.zzb.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BaseEncoding.");
        sb.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzc);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    com.google.android.gms.internal.fido.zzgf zza(com.google.android.gms.internal.fido.zzgb zzgbVar, @javax.annotation.CheckForNull java.lang.Character ch) {
        return new com.google.android.gms.internal.fido.zzge(zzgbVar, ch);
    }

    @Override // com.google.android.gms.internal.fido.zzgf
    void zzb(java.lang.Appendable appendable, byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = 0;
        com.google.android.gms.internal.fido.zzbm.zze(0, i2, bArr.length);
        while (i3 < i2) {
            zze(appendable, bArr, i3, java.lang.Math.min(this.zzb.zzd, i2 - i3));
            i3 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzgf
    final int zzc(int i) {
        com.google.android.gms.internal.fido.zzgb zzgbVar = this.zzb;
        return zzgbVar.zzc * com.google.android.gms.internal.fido.zzgh.zza(i, zzgbVar.zzd, java.math.RoundingMode.CEILING);
    }

    @Override // com.google.android.gms.internal.fido.zzgf
    public final com.google.android.gms.internal.fido.zzgf zzd() {
        com.google.android.gms.internal.fido.zzgf zzgfVar = this.zza;
        if (zzgfVar == null) {
            com.google.android.gms.internal.fido.zzgb zzgbVar = this.zzb;
            com.google.android.gms.internal.fido.zzgb zzb = zzgbVar.zzb();
            zzgfVar = zzb == zzgbVar ? this : zza(zzb, this.zzc);
            this.zza = zzgfVar;
        }
        return zzgfVar;
    }

    final void zze(java.lang.Appendable appendable, byte[] bArr, int i, int i2) throws java.io.IOException {
        com.google.android.gms.internal.fido.zzbm.zze(i, i + i2, bArr.length);
        int i3 = 0;
        com.google.android.gms.internal.fido.zzbm.zzc(i2 <= this.zzb.zzd);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | (bArr[i + i4] & 255)) << 8;
        }
        com.google.android.gms.internal.fido.zzgb zzgbVar = this.zzb;
        while (i3 < i2 * 8) {
            int i5 = zzgbVar.zzb;
            com.google.android.gms.internal.fido.zzgb zzgbVar2 = this.zzb;
            appendable.append(zzgbVar2.zza(((int) (j >>> ((((i2 + 1) * 8) - i5) - i3))) & zzgbVar2.zza));
            i3 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i3 < this.zzb.zzd * 8) {
                this.zzc.charValue();
                appendable.append('=');
                i3 += this.zzb.zzb;
            }
        }
    }

    zzge(java.lang.String str, java.lang.String str2, @javax.annotation.CheckForNull java.lang.Character ch) {
        this(new com.google.android.gms.internal.fido.zzgb(str, str2.toCharArray()), ch);
    }
}
