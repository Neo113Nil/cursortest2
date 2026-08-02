package com.google.android.recaptcha.internal;

import W5.AbstractC0486a1;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
final class zzki {
    private static final zzki zzb = new zzki(true);
    final zzmu zza = new zzmn(16);
    private boolean zzc;
    private boolean zzd;

    private zzki() {
    }

    public static int zza(zzkh zzkhVar, Object obj) {
        int zzd;
        int zzx;
        zznm zzd2 = zzkhVar.zzd();
        int zza = zzkhVar.zza();
        zzkhVar.zzg();
        int zzx2 = zzjg.zzx(zza << 3);
        if (zzd2 == zznm.zzj) {
            byte[] bArr = zzla.zzb;
            if (((zzlx) obj) instanceof zzih) {
                throw null;
            }
            zzx2 += zzx2;
        }
        zznn zznnVar = zznn.INT;
        int i7 = 4;
        switch (zzd2.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                i7 = 8;
                return zzx2 + i7;
            case 1:
                ((Float) obj).getClass();
                return zzx2 + i7;
            case 2:
                i7 = zzjg.zzy(((Long) obj).longValue());
                return zzx2 + i7;
            case 3:
                i7 = zzjg.zzy(((Long) obj).longValue());
                return zzx2 + i7;
            case 4:
                i7 = zzjg.zzy(((Integer) obj).intValue());
                return zzx2 + i7;
            case 5:
                ((Long) obj).getClass();
                i7 = 8;
                return zzx2 + i7;
            case 6:
                ((Integer) obj).getClass();
                return zzx2 + i7;
            case 7:
                ((Boolean) obj).getClass();
                i7 = 1;
                return zzx2 + i7;
            case 8:
                if (!(obj instanceof zziv)) {
                    i7 = zzjg.zzw((String) obj);
                    return zzx2 + i7;
                }
                zzd = ((zziv) obj).zzd();
                zzx = zzjg.zzx(zzd);
                i7 = zzx + zzd;
                return zzx2 + i7;
            case 9:
                i7 = ((zzlx) obj).zzn();
                return zzx2 + i7;
            case 10:
                if (!(obj instanceof zzlh)) {
                    i7 = zzjg.zzu((zzlx) obj);
                    return zzx2 + i7;
                }
                zzd = ((zzlh) obj).zza();
                zzx = zzjg.zzx(zzd);
                i7 = zzx + zzd;
                return zzx2 + i7;
            case 11:
                if (obj instanceof zziv) {
                    zzd = ((zziv) obj).zzd();
                    zzx = zzjg.zzx(zzd);
                } else {
                    zzd = ((byte[]) obj).length;
                    zzx = zzjg.zzx(zzd);
                }
                i7 = zzx + zzd;
                return zzx2 + i7;
            case 12:
                i7 = zzjg.zzx(((Integer) obj).intValue());
                return zzx2 + i7;
            case 13:
                i7 = obj instanceof zzku ? zzjg.zzy(((zzku) obj).zza()) : zzjg.zzy(((Integer) obj).intValue());
                return zzx2 + i7;
            case 14:
                ((Integer) obj).getClass();
                return zzx2 + i7;
            case 15:
                ((Long) obj).getClass();
                i7 = 8;
                return zzx2 + i7;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i7 = zzjg.zzx((intValue >> 31) ^ (intValue + intValue));
                return zzx2 + i7;
            case 17:
                long longValue = ((Long) obj).longValue();
                i7 = zzjg.zzy((longValue >> 63) ^ (longValue + longValue));
                return zzx2 + i7;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static zzki zzd() {
        return zzb;
    }

    private static Object zzl(Object obj) {
        if (obj instanceof zzmc) {
            return ((zzmc) obj).zzd();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzm(Map.Entry entry) {
        zzlx zzj;
        zzkh zzkhVar = (zzkh) entry.getKey();
        Object value = entry.getValue();
        boolean z4 = value instanceof zzlh;
        zzkhVar.zzg();
        if (zzkhVar.zze() != zznn.MESSAGE) {
            if (z4) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zzkhVar, zzl(value));
            return;
        }
        Object zze = zze(zzkhVar);
        if (zze == null) {
            this.zza.put(zzkhVar, zzl(value));
            if (z4) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z4) {
            throw null;
        }
        if (zze instanceof zzmc) {
            zzj = zzkhVar.zzc((zzmc) zze, (zzmc) value);
        } else {
            zzlw zzab = ((zzlx) zze).zzab();
            zzkhVar.zzb(zzab, (zzlx) value);
            zzj = zzab.zzj();
        }
        this.zza.put(zzkhVar, zzj);
    }

    private static boolean zzn(Map.Entry entry) {
        zzkh zzkhVar = (zzkh) entry.getKey();
        if (zzkhVar.zze() != zznn.MESSAGE) {
            return true;
        }
        zzkhVar.zzg();
        Object value = entry.getValue();
        if (value instanceof zzly) {
            return ((zzly) value).zzo();
        }
        if (value instanceof zzlh) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(Map.Entry entry) {
        int i7;
        int zzx;
        int zzu;
        zzkh zzkhVar = (zzkh) entry.getKey();
        Object value = entry.getValue();
        if (zzkhVar.zze() != zznn.MESSAGE) {
            return zza(zzkhVar, value);
        }
        zzkhVar.zzg();
        zzkhVar.zzf();
        if (value instanceof zzlh) {
            int zza = ((zzkh) entry.getKey()).zza();
            int zzx2 = zzjg.zzx(8);
            i7 = zzx2 + zzx2;
            zzx = zzjg.zzx(zza) + zzjg.zzx(16);
            int zzx3 = zzjg.zzx(24);
            int zza2 = ((zzlh) value).zza();
            zzu = AbstractC0486a1.r(zza2, zza2, zzx3);
        } else {
            int zza3 = ((zzkh) entry.getKey()).zza();
            int zzx4 = zzjg.zzx(8);
            i7 = zzx4 + zzx4;
            zzx = zzjg.zzx(zza3) + zzjg.zzx(16);
            zzu = zzjg.zzu((zzlx) value) + zzjg.zzx(24);
        }
        return i7 + zzx + zzu;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzki) {
            return this.zza.equals(((zzki) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzb() {
        int i7 = 0;
        for (int i8 = 0; i8 < this.zza.zzb(); i8++) {
            i7 += zzo(this.zza.zzg(i8));
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            i7 += zzo((Map.Entry) it.next());
        }
        return i7;
    }

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzki clone() {
        zzki zzkiVar = new zzki();
        for (int i7 = 0; i7 < this.zza.zzb(); i7++) {
            Map.Entry zzg = this.zza.zzg(i7);
            zzkiVar.zzi((zzkh) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzkiVar.zzi((zzkh) entry.getKey(), entry.getValue());
        }
        zzkiVar.zzd = this.zzd;
        return zzkiVar;
    }

    public final Object zze(zzkh zzkhVar) {
        Object obj = this.zza.get(zzkhVar);
        if (obj instanceof zzlh) {
            throw null;
        }
        return obj;
    }

    public final Iterator zzf() {
        return this.zzd ? new zzlg(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        for (int i7 = 0; i7 < this.zza.zzb(); i7++) {
            Map.Entry zzg = this.zza.zzg(i7);
            if (zzg.getValue() instanceof zzks) {
                ((zzks) zzg.getValue()).zzD();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(zzki zzkiVar) {
        for (int i7 = 0; i7 < zzkiVar.zza.zzb(); i7++) {
            zzm(zzkiVar.zza.zzg(i7));
        }
        Iterator it = zzkiVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzm((Map.Entry) it.next());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002b, code lost:
    
        if ((r4 instanceof com.google.android.recaptcha.internal.zzku) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0034, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if ((r4 instanceof com.google.android.recaptcha.internal.zzlh) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzi(zzkh zzkhVar, Object obj) {
        boolean z4;
        zzkhVar.zzg();
        zzkhVar.zzd();
        byte[] bArr = zzla.zzb;
        obj.getClass();
        zznm zznmVar = zznm.zza;
        zznn zznnVar = zznn.INT;
        switch (r0.zza()) {
            case INT:
                z4 = obj instanceof Integer;
                break;
            case LONG:
                z4 = obj instanceof Long;
                break;
            case FLOAT:
                z4 = obj instanceof Float;
                break;
            case DOUBLE:
                z4 = obj instanceof Double;
                break;
            case BOOLEAN:
                z4 = obj instanceof Boolean;
                break;
            case STRING:
                z4 = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof zziv)) {
                    break;
                }
                if (obj instanceof zzlh) {
                    this.zzd = true;
                }
                this.zza.put(zzkhVar, obj);
                return;
            case ENUM:
                if (!(obj instanceof Integer)) {
                    break;
                }
                if (obj instanceof zzlh) {
                }
                this.zza.put(zzkhVar, obj);
                return;
            case MESSAGE:
                if (!(obj instanceof zzlx)) {
                    break;
                }
                if (obj instanceof zzlh) {
                }
                this.zza.put(zzkhVar, obj);
                return;
            default:
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(zzkhVar.zza()), zzkhVar.zzd().zza(), obj.getClass().getName()));
        }
    }

    public final boolean zzj() {
        return this.zzc;
    }

    public final boolean zzk() {
        for (int i7 = 0; i7 < this.zza.zzb(); i7++) {
            if (!zzn(this.zza.zzg(i7))) {
                return false;
            }
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzn((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzki(boolean z4) {
        zzg();
        zzg();
    }
}
