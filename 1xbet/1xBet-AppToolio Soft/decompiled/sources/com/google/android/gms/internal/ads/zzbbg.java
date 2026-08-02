package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbbi;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzbbg<FieldDescriptorType extends zzbbi<FieldDescriptorType>> {
    private static final zzbbg zzdra = new zzbbg(true);
    private boolean zzdqy;
    private boolean zzdqz = false;
    private final zzbdp<FieldDescriptorType, Object> zzdqx = zzbdp.zzcx(16);

    private zzbbg() {
    }

    private zzbbg(boolean z) {
        zzaaz();
    }

    static int zza(zzbes zzbesVar, int i, Object obj) {
        int zzcd = zzbav.zzcd(i);
        if (zzbesVar == zzbes.zzeaj) {
            zzbbq.zzi((zzbcu) obj);
            zzcd <<= 1;
        }
        return zzcd + zzb(zzbesVar, obj);
    }

    private final Object zza(FieldDescriptorType fielddescriptortype) {
        Object obj = this.zzdqx.get(fielddescriptortype);
        return obj instanceof zzbbx ? zzbbx.zzadu() : obj;
    }

    static void zza(zzbav zzbavVar, zzbes zzbesVar, int i, Object obj) throws IOException {
        if (zzbesVar == zzbes.zzeaj) {
            zzbcu zzbcuVar = (zzbcu) obj;
            zzbbq.zzi(zzbcuVar);
            zzbavVar.zzl(i, 3);
            zzbcuVar.zzb(zzbavVar);
            zzbavVar.zzl(i, 4);
        }
        zzbavVar.zzl(i, zzbesVar.zzagm());
        switch (zzbbh.zzdql[zzbesVar.ordinal()]) {
            case 1:
                zzbavVar.zzb(((Double) obj).doubleValue());
                break;
            case 2:
                zzbavVar.zzb(((Float) obj).floatValue());
                break;
            case 3:
                zzbavVar.zzm(((Long) obj).longValue());
                break;
            case 4:
                zzbavVar.zzm(((Long) obj).longValue());
                break;
            case 5:
                zzbavVar.zzbz(((Integer) obj).intValue());
                break;
            case 6:
                zzbavVar.zzo(((Long) obj).longValue());
                break;
            case 7:
                zzbavVar.zzcc(((Integer) obj).intValue());
                break;
            case 8:
                zzbavVar.zzap(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((zzbcu) obj).zzb(zzbavVar);
                break;
            case 10:
                zzbavVar.zze((zzbcu) obj);
                break;
            case 11:
                if (!(obj instanceof zzbah)) {
                    zzbavVar.zzen((String) obj);
                    break;
                } else {
                    zzbavVar.zzan((zzbah) obj);
                    break;
                }
            case 12:
                if (!(obj instanceof zzbah)) {
                    byte[] bArr = (byte[]) obj;
                    zzbavVar.zze(bArr, 0, bArr.length);
                    break;
                } else {
                    zzbavVar.zzan((zzbah) obj);
                    break;
                }
            case 13:
                zzbavVar.zzca(((Integer) obj).intValue());
                break;
            case 14:
                zzbavVar.zzcc(((Integer) obj).intValue());
                break;
            case 15:
                zzbavVar.zzo(((Long) obj).longValue());
                break;
            case 16:
                zzbavVar.zzcb(((Integer) obj).intValue());
                break;
            case 17:
                zzbavVar.zzn(((Long) obj).longValue());
                break;
            case 18:
                if (!(obj instanceof zzbbr)) {
                    zzbavVar.zzbz(((Integer) obj).intValue());
                    break;
                } else {
                    zzbavVar.zzbz(((zzbbr) obj).zzhq());
                    break;
                }
        }
    }

    private final void zza(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.zzada()) {
            zza(fielddescriptortype.zzacy(), obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList2.get(i);
                i++;
                zza(fielddescriptortype.zzacy(), obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof zzbbx) {
            this.zzdqz = true;
        }
        this.zzdqx.zza((zzbdp<FieldDescriptorType, Object>) fielddescriptortype, (FieldDescriptorType) obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if ((r3 instanceof com.google.android.gms.internal.ads.zzbbr) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001b, code lost:
    
        if ((r3 instanceof com.google.android.gms.internal.ads.zzbbx) == false) goto L27;
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zza(zzbes zzbesVar, Object obj) {
        boolean z;
        zzbbq.checkNotNull(obj);
        boolean z2 = false;
        switch (zzbbh.zzdrb[zzbesVar.zzagl().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                z2 = z;
                break;
            case 2:
                z = obj instanceof Long;
                z2 = z;
                break;
            case 3:
                z = obj instanceof Float;
                z2 = z;
                break;
            case 4:
                z = obj instanceof Double;
                z2 = z;
                break;
            case 5:
                z = obj instanceof Boolean;
                z2 = z;
                break;
            case 6:
                z = obj instanceof String;
                z2 = z;
                break;
            case 7:
                if (!(obj instanceof zzbah)) {
                    break;
                }
                z2 = true;
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
                z2 = true;
                break;
            case 9:
                if (!(obj instanceof zzbcu)) {
                    break;
                }
                z2 = true;
                break;
        }
        if (!z2) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public static <T extends zzbbi<T>> zzbbg<T> zzacv() {
        return zzdra;
    }

    private static int zzb(zzbbi<?> zzbbiVar, Object obj) {
        zzbes zzacy = zzbbiVar.zzacy();
        int zzhq = zzbbiVar.zzhq();
        if (!zzbbiVar.zzada()) {
            return zza(zzacy, zzhq, obj);
        }
        int i = 0;
        if (zzbbiVar.zzadb()) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                i += zzb(zzacy, it.next());
            }
            return zzbav.zzcd(zzhq) + i + zzbav.zzcl(i);
        }
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            i += zza(zzacy, zzhq, it2.next());
        }
        return i;
    }

    private static int zzb(zzbes zzbesVar, Object obj) {
        switch (zzbbh.zzdql[zzbesVar.ordinal()]) {
            case 1:
                return zzbav.zzc(((Double) obj).doubleValue());
            case 2:
                return zzbav.zzc(((Float) obj).floatValue());
            case 3:
                return zzbav.zzp(((Long) obj).longValue());
            case 4:
                return zzbav.zzq(((Long) obj).longValue());
            case 5:
                return zzbav.zzce(((Integer) obj).intValue());
            case 6:
                return zzbav.zzs(((Long) obj).longValue());
            case 7:
                return zzbav.zzch(((Integer) obj).intValue());
            case 8:
                return zzbav.zzaq(((Boolean) obj).booleanValue());
            case 9:
                return zzbav.zzg((zzbcu) obj);
            case 10:
                return obj instanceof zzbbx ? zzbav.zza((zzbbx) obj) : zzbav.zzf((zzbcu) obj);
            case 11:
                return obj instanceof zzbah ? zzbav.zzao((zzbah) obj) : zzbav.zzeo((String) obj);
            case 12:
                return obj instanceof zzbah ? zzbav.zzao((zzbah) obj) : zzbav.zzr((byte[]) obj);
            case 13:
                return zzbav.zzcf(((Integer) obj).intValue());
            case 14:
                return zzbav.zzci(((Integer) obj).intValue());
            case 15:
                return zzbav.zzt(((Long) obj).longValue());
            case 16:
                return zzbav.zzcg(((Integer) obj).intValue());
            case 17:
                return zzbav.zzr(((Long) obj).longValue());
            case 18:
                return obj instanceof zzbbr ? zzbav.zzcj(((zzbbr) obj).zzhq()) : zzbav.zzcj(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static boolean zzb(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.zzacz() == zzbex.MESSAGE) {
            if (key.zzada()) {
                Iterator it = ((List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((zzbcu) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                Object value = entry.getValue();
                if (!(value instanceof zzbcu)) {
                    if (value instanceof zzbbx) {
                        return true;
                    }
                    throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
                if (!((zzbcu) value).isInitialized()) {
                    return false;
                }
            }
        }
        return true;
    }

    private final void zzc(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof zzbbx) {
            value = zzbbx.zzadu();
        }
        if (key.zzada()) {
            Object zza = zza((zzbbg<FieldDescriptorType>) key);
            if (zza == null) {
                zza = new ArrayList();
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                ((List) zza).add(zzp(it.next()));
            }
            this.zzdqx.zza((zzbdp<FieldDescriptorType, Object>) key, (FieldDescriptorType) zza);
            return;
        }
        if (key.zzacz() != zzbex.MESSAGE) {
            this.zzdqx.zza((zzbdp<FieldDescriptorType, Object>) key, (FieldDescriptorType) zzp(value));
            return;
        }
        Object zza2 = zza((zzbbg<FieldDescriptorType>) key);
        if (zza2 == null) {
            this.zzdqx.zza((zzbdp<FieldDescriptorType, Object>) key, (FieldDescriptorType) zzp(value));
        } else {
            this.zzdqx.zza((zzbdp<FieldDescriptorType, Object>) key, (FieldDescriptorType) (zza2 instanceof zzbdb ? key.zza((zzbdb) zza2, (zzbdb) value) : key.zza(((zzbcu) zza2).zzade(), (zzbcu) value).zzadk()));
        }
    }

    private static int zzd(Map.Entry<FieldDescriptorType, Object> entry) {
        FieldDescriptorType key = entry.getKey();
        Object value = entry.getValue();
        return (key.zzacz() != zzbex.MESSAGE || key.zzada() || key.zzadb()) ? zzb((zzbbi<?>) key, value) : value instanceof zzbbx ? zzbav.zzb(entry.getKey().zzhq(), (zzbbx) value) : zzbav.zzb(entry.getKey().zzhq(), (zzbcu) value);
    }

    private static Object zzp(Object obj) {
        if (obj instanceof zzbdb) {
            return ((zzbdb) obj).zzaek();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzbbg zzbbgVar = new zzbbg();
        for (int i = 0; i < this.zzdqx.zzafs(); i++) {
            Map.Entry<FieldDescriptorType, Object> zzcy = this.zzdqx.zzcy(i);
            zzbbgVar.zza((zzbbg) zzcy.getKey(), zzcy.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zzdqx.zzaft()) {
            zzbbgVar.zza((zzbbg) entry.getKey(), entry.getValue());
        }
        zzbbgVar.zzdqz = this.zzdqz;
        return zzbbgVar;
    }

    final Iterator<Map.Entry<FieldDescriptorType, Object>> descendingIterator() {
        return this.zzdqz ? new zzbca(this.zzdqx.zzafu().iterator()) : this.zzdqx.zzafu().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzbbg) {
            return this.zzdqx.equals(((zzbbg) obj).zzdqx);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzdqx.hashCode();
    }

    final boolean isEmpty() {
        return this.zzdqx.isEmpty();
    }

    public final boolean isImmutable() {
        return this.zzdqy;
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zzdqx.zzafs(); i++) {
            if (!zzb(this.zzdqx.zzcy(i))) {
                return false;
            }
        }
        Iterator<Map.Entry<FieldDescriptorType, Object>> it = this.zzdqx.zzaft().iterator();
        while (it.hasNext()) {
            if (!zzb(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final Iterator<Map.Entry<FieldDescriptorType, Object>> iterator() {
        return this.zzdqz ? new zzbca(this.zzdqx.entrySet().iterator()) : this.zzdqx.entrySet().iterator();
    }

    public final void zza(zzbbg<FieldDescriptorType> zzbbgVar) {
        for (int i = 0; i < zzbbgVar.zzdqx.zzafs(); i++) {
            zzc(zzbbgVar.zzdqx.zzcy(i));
        }
        Iterator<Map.Entry<FieldDescriptorType, Object>> it = zzbbgVar.zzdqx.zzaft().iterator();
        while (it.hasNext()) {
            zzc(it.next());
        }
    }

    public final void zzaaz() {
        if (this.zzdqy) {
            return;
        }
        this.zzdqx.zzaaz();
        this.zzdqy = true;
    }

    public final int zzacw() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzdqx.zzafs(); i2++) {
            Map.Entry<FieldDescriptorType, Object> zzcy = this.zzdqx.zzcy(i2);
            i += zzb((zzbbi<?>) zzcy.getKey(), zzcy.getValue());
        }
        for (Map.Entry<FieldDescriptorType, Object> entry : this.zzdqx.zzaft()) {
            i += zzb((zzbbi<?>) entry.getKey(), entry.getValue());
        }
        return i;
    }

    public final int zzacx() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzdqx.zzafs(); i2++) {
            i += zzd(this.zzdqx.zzcy(i2));
        }
        Iterator<Map.Entry<FieldDescriptorType, Object>> it = this.zzdqx.zzaft().iterator();
        while (it.hasNext()) {
            i += zzd(it.next());
        }
        return i;
    }
}
