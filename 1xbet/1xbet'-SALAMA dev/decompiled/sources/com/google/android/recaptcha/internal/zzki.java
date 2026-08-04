package com.google.android.recaptcha.internal;

import W5.AbstractC0486a1;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzki {
    private static final zzki zzb = new zzki(true);
    final zzmu zza = new zzmn(16);
    private boolean zzc;
    private boolean zzd;

    private zzki() {
    }

    public static int zza(zzkh zzkhVar, Object obj) {
        int iZzd;
        int iZzx;
        zznm zznmVarZzd = zzkhVar.zzd();
        int iZza = zzkhVar.zza();
        zzkhVar.zzg();
        int iZzx2 = zzjg.zzx(iZza << 3);
        if (zznmVarZzd == zznm.zzj) {
            byte[] bArr = zzla.zzb;
            if (((zzlx) obj) instanceof zzih) {
                throw null;
            }
            iZzx2 += iZzx2;
        }
        zznn zznnVar = zznn.INT;
        int iZzy = 4;
        switch (zznmVarZzd.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                iZzy = 8;
                return iZzx2 + iZzy;
            case 1:
                ((Float) obj).getClass();
                return iZzx2 + iZzy;
            case 2:
                iZzy = zzjg.zzy(((Long) obj).longValue());
                return iZzx2 + iZzy;
            case 3:
                iZzy = zzjg.zzy(((Long) obj).longValue());
                return iZzx2 + iZzy;
            case 4:
                iZzy = zzjg.zzy(((Integer) obj).intValue());
                return iZzx2 + iZzy;
            case 5:
                ((Long) obj).getClass();
                iZzy = 8;
                return iZzx2 + iZzy;
            case 6:
                ((Integer) obj).getClass();
                return iZzx2 + iZzy;
            case 7:
                ((Boolean) obj).getClass();
                iZzy = 1;
                return iZzx2 + iZzy;
            case 8:
                if (obj instanceof zziv) {
                    iZzd = ((zziv) obj).zzd();
                    iZzx = zzjg.zzx(iZzd);
                    iZzy = iZzx + iZzd;
                } else {
                    iZzy = zzjg.zzw((String) obj);
                }
                return iZzx2 + iZzy;
            case 9:
                iZzy = ((zzlx) obj).zzn();
                return iZzx2 + iZzy;
            case 10:
                if (obj instanceof zzlh) {
                    iZzd = ((zzlh) obj).zza();
                    iZzx = zzjg.zzx(iZzd);
                    iZzy = iZzx + iZzd;
                } else {
                    iZzy = zzjg.zzu((zzlx) obj);
                }
                return iZzx2 + iZzy;
            case 11:
                if (obj instanceof zziv) {
                    iZzd = ((zziv) obj).zzd();
                    iZzx = zzjg.zzx(iZzd);
                } else {
                    iZzd = ((byte[]) obj).length;
                    iZzx = zzjg.zzx(iZzd);
                }
                iZzy = iZzx + iZzd;
                return iZzx2 + iZzy;
            case 12:
                iZzy = zzjg.zzx(((Integer) obj).intValue());
                return iZzx2 + iZzy;
            case 13:
                iZzy = obj instanceof zzku ? zzjg.zzy(((zzku) obj).zza()) : zzjg.zzy(((Integer) obj).intValue());
                return iZzx2 + iZzy;
            case 14:
                ((Integer) obj).getClass();
                return iZzx2 + iZzy;
            case 15:
                ((Long) obj).getClass();
                iZzy = 8;
                return iZzx2 + iZzy;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                iZzy = zzjg.zzx((iIntValue >> 31) ^ (iIntValue + iIntValue));
                return iZzx2 + iZzy;
            case 17:
                long jLongValue = ((Long) obj).longValue();
                iZzy = zzjg.zzy((jLongValue >> 63) ^ (jLongValue + jLongValue));
                return iZzx2 + iZzy;
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
        zzlx zzlxVarZzj;
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
        Object objZze = zze(zzkhVar);
        if (objZze == null) {
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
        if (objZze instanceof zzmc) {
            zzlxVarZzj = zzkhVar.zzc((zzmc) objZze, (zzmc) value);
        } else {
            zzlw zzlwVarZzab = ((zzlx) objZze).zzab();
            zzkhVar.zzb(zzlwVarZzab, (zzlx) value);
            zzlxVarZzj = zzlwVarZzab.zzj();
        }
        this.zza.put(zzkhVar, zzlxVarZzj);
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
        int iZzx;
        int iZzu;
        zzkh zzkhVar = (zzkh) entry.getKey();
        Object value = entry.getValue();
        if (zzkhVar.zze() != zznn.MESSAGE) {
            return zza(zzkhVar, value);
        }
        zzkhVar.zzg();
        zzkhVar.zzf();
        if (value instanceof zzlh) {
            int iZza = ((zzkh) entry.getKey()).zza();
            int iZzx2 = zzjg.zzx(8);
            i7 = iZzx2 + iZzx2;
            iZzx = zzjg.zzx(iZza) + zzjg.zzx(16);
            int iZzx3 = zzjg.zzx(24);
            int iZza2 = ((zzlh) value).zza();
            iZzu = AbstractC0486a1.r(iZza2, iZza2, iZzx3);
        } else {
            int iZza3 = ((zzkh) entry.getKey()).zza();
            int iZzx4 = zzjg.zzx(8);
            i7 = iZzx4 + iZzx4;
            iZzx = zzjg.zzx(iZza3) + zzjg.zzx(16);
            iZzu = zzjg.zzu((zzlx) value) + zzjg.zzx(24);
        }
        return i7 + iZzx + iZzu;
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
        int iZzo = 0;
        for (int i7 = 0; i7 < this.zza.zzb(); i7++) {
            iZzo += zzo(this.zza.zzg(i7));
        }
        Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            iZzo += zzo((Map.Entry) it.next());
        }
        return iZzo;
    }

    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzki clone() {
        zzki zzkiVar = new zzki();
        for (int i7 = 0; i7 < this.zza.zzb(); i7++) {
            Map.Entry entryZzg = this.zza.zzg(i7);
            zzkiVar.zzi((zzkh) entryZzg.getKey(), entryZzg.getValue());
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
            Map.Entry entryZzg = this.zza.zzg(i7);
            if (entryZzg.getValue() instanceof zzks) {
                ((zzks) entryZzg.getValue()).zzD();
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
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
    
        if ((r4 instanceof com.google.android.recaptcha.internal.zzku) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r0 != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if ((r4 instanceof com.google.android.recaptcha.internal.zzlh) == false) goto L32;
     */
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
                    this.zzd = true;
                }
                this.zza.put(zzkhVar, obj);
                return;
            case MESSAGE:
                if (!(obj instanceof zzlx)) {
                    break;
                }
                if (obj instanceof zzlh) {
                    this.zzd = true;
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
