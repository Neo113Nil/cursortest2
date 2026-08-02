package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import android.text.Layout;

/* loaded from: classes.dex */
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

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0070, code lost:
    
        if (r6 == 0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzcl zza() {
        Layout.Alignment alignment;
        float f7;
        CharSequence charSequence;
        float f8 = this.zzh;
        float f9 = -3.4028235E38f;
        if (f8 == -3.4028235E38f) {
            int i7 = this.zzd;
            f8 = i7 != 4 ? i7 != 5 ? 0.5f : 1.0f : 0.0f;
        }
        int i8 = this.zzi;
        if (i8 == Integer.MIN_VALUE) {
            int i9 = this.zzd;
            if (i9 != 1) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            i8 = 1;
                        }
                    }
                }
                i8 = 2;
            }
            i8 = 0;
        }
        zzcl zzclVar = new zzcl();
        int i10 = this.zzd;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            AbstractC0486a1.k(i10, "Unknown textAlignment: ", "WebvttCueParser");
                            alignment = null;
                        }
                    }
                }
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            zzclVar.zzm(alignment);
            f7 = this.zze;
            int i11 = this.zzf;
            if (f7 != -3.4028235E38f || i11 != 0 || (f7 >= 0.0f && f7 <= 1.0f)) {
                if (f7 == -3.4028235E38f) {
                    f9 = f7;
                }
                zzclVar.zze(f9, i11);
                zzclVar.zzf(this.zzg);
                zzclVar.zzh(f8);
                zzclVar.zzi(i8);
                float f10 = this.zzj;
                if (i8 == 0) {
                    f8 = 1.0f - f8;
                } else if (i8 != 1) {
                    if (i8 != 2) {
                        throw new IllegalStateException(String.valueOf(i8));
                    }
                } else if (f8 <= 0.5f) {
                    f8 += f8;
                } else {
                    float f11 = 1.0f - f8;
                    f8 = f11 + f11;
                }
                zzclVar.zzk(Math.min(f10, f8));
                zzclVar.zzo(this.zzk);
                charSequence = this.zzc;
                if (charSequence != null) {
                    zzclVar.zzl(charSequence);
                }
                return zzclVar;
            }
            f9 = 1.0f;
            zzclVar.zze(f9, i11);
            zzclVar.zzf(this.zzg);
            zzclVar.zzh(f8);
            zzclVar.zzi(i8);
            float f102 = this.zzj;
            if (i8 == 0) {
            }
            zzclVar.zzk(Math.min(f102, f8));
            zzclVar.zzo(this.zzk);
            charSequence = this.zzc;
            if (charSequence != null) {
            }
            return zzclVar;
        }
        alignment = Layout.Alignment.ALIGN_NORMAL;
        zzclVar.zzm(alignment);
        f7 = this.zze;
        int i112 = this.zzf;
        if (f7 != -3.4028235E38f) {
        }
        if (f7 == -3.4028235E38f) {
        }
        zzclVar.zze(f9, i112);
        zzclVar.zzf(this.zzg);
        zzclVar.zzh(f8);
        zzclVar.zzi(i8);
        float f1022 = this.zzj;
        if (i8 == 0) {
        }
        zzclVar.zzk(Math.min(f1022, f8));
        zzclVar.zzo(this.zzk);
        charSequence = this.zzc;
        if (charSequence != null) {
        }
        return zzclVar;
    }
}
