package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import android.text.Layout;

/* JADX INFO: loaded from: classes.dex */
final class zzali {
    public CharSequence zzc;
    public long zza = 0;
    public long zzb = 0;
    public int zzd = 2;
    public float zze = -3.4028235E38f;
    public int zzf = 1;
    public int zzg = 0;
    public float zzh = -3.4028235E38f;
    public int zzi = Integer.MIN_VALUE;
    public float zzj = 1.0f;
    public int zzk = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    public final zzcl zza() {
        Layout.Alignment alignment;
        float f7 = this.zzh;
        float f8 = -3.4028235E38f;
        if (f7 == -3.4028235E38f) {
            int i7 = this.zzd;
            if (i7 != 4) {
                f7 = i7 != 5 ? 0.5f : 1.0f;
            } else {
                f7 = 0.0f;
            }
        }
        int i8 = this.zzi;
        if (i8 == Integer.MIN_VALUE) {
            int i9 = this.zzd;
            if (i9 == 1) {
                i8 = 0;
            } else if (i9 == 3) {
                i8 = 2;
            } else if (i9 == 4) {
                i8 = 0;
            } else if (i9 != 5) {
                i8 = 1;
            } else {
                i8 = 2;
            }
        }
        zzcl zzclVar = new zzcl();
        int i10 = this.zzd;
        if (i10 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i10 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i10 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i10 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i10 != 5) {
            AbstractC0486a1.k(i10, "Unknown textAlignment: ", "WebvttCueParser");
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        zzclVar.zzm(alignment);
        float f9 = this.zze;
        int i11 = this.zzf;
        if (f9 != -3.4028235E38f && i11 == 0 && (f9 < 0.0f || f9 > 1.0f)) {
            f8 = 1.0f;
        } else if (f9 != -3.4028235E38f) {
            f8 = f9;
        } else if (i11 == 0) {
            f8 = 1.0f;
        }
        zzclVar.zze(f8, i11);
        zzclVar.zzf(this.zzg);
        zzclVar.zzh(f7);
        zzclVar.zzi(i8);
        float f10 = this.zzj;
        if (i8 == 0) {
            f7 = 1.0f - f7;
        } else if (i8 != 1) {
            if (i8 != 2) {
                throw new IllegalStateException(String.valueOf(i8));
            }
        } else if (f7 <= 0.5f) {
            f7 += f7;
        } else {
            float f11 = 1.0f - f7;
            f7 = f11 + f11;
        }
        zzclVar.zzk(Math.min(f10, f7));
        zzclVar.zzo(this.zzk);
        CharSequence charSequence = this.zzc;
        if (charSequence != null) {
            zzclVar.zzl(charSequence);
        }
        return zzclVar;
    }
}
