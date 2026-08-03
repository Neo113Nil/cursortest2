package com.google.android.gms.internal.fido;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes4.dex */
class zzbe extends com.google.android.gms.internal.fido.zzbf {
    final com.google.android.gms.internal.fido.zzbb zzb;

    @javax.annotation.CheckForNull
    final java.lang.Character zzc;

    zzbe(com.google.android.gms.internal.fido.zzbb zzbbVar, @javax.annotation.CheckForNull java.lang.Character ch) {
        this.zzb = zzbbVar;
        if (ch != null) {
            ch.charValue();
            if (zzbbVar.zzb(com.ironsource.B5.U)) {
                throw new java.lang.IllegalArgumentException(com.google.android.gms.internal.fido.zzan.zza("Padding character %s was already in alphabet", ch));
            }
        }
        this.zzc = ch;
    }

    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.fido.zzbe) {
            com.google.android.gms.internal.fido.zzbe zzbeVar = (com.google.android.gms.internal.fido.zzbe) obj;
            if (this.zzb.equals(zzbeVar.zzb)) {
                java.lang.Character ch = this.zzc;
                java.lang.Character ch2 = zzbeVar.zzc;
                if (ch == ch2) {
                    return true;
                }
                if (ch != null && ch.equals(ch2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zzb.hashCode();
        java.lang.Character ch = this.zzc;
        return hashCode ^ (ch == null ? 0 : ch.hashCode());
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

    @Override // com.google.android.gms.internal.fido.zzbf
    void zza(java.lang.Appendable appendable, byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = 0;
        com.google.android.gms.internal.fido.zzam.zze(0, i2, bArr.length);
        while (i3 < i2) {
            zzc(appendable, bArr, i3, java.lang.Math.min(this.zzb.zzd, i2 - i3));
            i3 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.gms.internal.fido.zzbf
    final int zzb(int i) {
        com.google.android.gms.internal.fido.zzbb zzbbVar = this.zzb;
        return zzbbVar.zzc * com.google.android.gms.internal.fido.zzbh.zza(i, zzbbVar.zzd, java.math.RoundingMode.CEILING);
    }

    final void zzc(java.lang.Appendable appendable, byte[] bArr, int i, int i2) throws java.io.IOException {
        com.google.android.gms.internal.fido.zzam.zze(i, i + i2, bArr.length);
        int i3 = 0;
        com.google.android.gms.internal.fido.zzam.zzc(i2 <= this.zzb.zzd);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | (bArr[i + i4] & 255)) << 8;
        }
        int i5 = ((i2 + 1) * 8) - this.zzb.zzb;
        while (i3 < i2 * 8) {
            com.google.android.gms.internal.fido.zzbb zzbbVar = this.zzb;
            appendable.append(zzbbVar.zza(zzbbVar.zza & ((int) (j >>> (i5 - i3)))));
            i3 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i3 < this.zzb.zzd * 8) {
                this.zzc.charValue();
                appendable.append(com.ironsource.B5.U);
                i3 += this.zzb.zzb;
            }
        }
    }

    zzbe(java.lang.String str, java.lang.String str2, @javax.annotation.CheckForNull java.lang.Character ch) {
        this(new com.google.android.gms.internal.fido.zzbb(str, str2.toCharArray()), ch);
    }
}
