package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzidt {
    private static final com.google.android.gms.internal.ads.zzidt zzd = new com.google.android.gms.internal.ads.zzidt(true);
    final com.google.android.gms.internal.ads.zzign zza = new com.google.android.gms.internal.ads.zzigj();
    boolean zzb;
    boolean zzc;

    private zzidt() {
    }

    public static com.google.android.gms.internal.ads.zzidt zza() {
        return zzd;
    }

    static void zzf(com.google.android.gms.internal.ads.zzidj zzidjVar, com.google.android.gms.internal.ads.zzihg zzihgVar, int i, java.lang.Object obj) throws java.io.IOException {
        if (zzihgVar == com.google.android.gms.internal.ads.zzihg.GROUP) {
            zzidjVar.zzb(i, 3);
            ((com.google.android.gms.internal.ads.zzifp) obj).zzcX(zzidjVar);
            zzidjVar.zzb(i, 4);
            return;
        }
        zzidjVar.zzb(i, zzihgVar.zzb());
        com.google.android.gms.internal.ads.zzihh zzihhVar = com.google.android.gms.internal.ads.zzihh.INT;
        switch (zzihgVar) {
            case DOUBLE:
                zzidjVar.zzu(java.lang.Double.doubleToRawLongBits(((java.lang.Double) obj).doubleValue()));
                break;
            case FLOAT:
                zzidjVar.zzs(java.lang.Float.floatToRawIntBits(((java.lang.Float) obj).floatValue()));
                break;
            case INT64:
                zzidjVar.zzt(((java.lang.Long) obj).longValue());
                break;
            case UINT64:
                zzidjVar.zzt(((java.lang.Long) obj).longValue());
                break;
            case INT32:
                zzidjVar.zzq(((java.lang.Integer) obj).intValue());
                break;
            case FIXED64:
                zzidjVar.zzu(((java.lang.Long) obj).longValue());
                break;
            case FIXED32:
                zzidjVar.zzs(((java.lang.Integer) obj).intValue());
                break;
            case BOOL:
                zzidjVar.zzp(((java.lang.Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case STRING:
                if (!(obj instanceof com.google.android.gms.internal.ads.zzida)) {
                    zzidjVar.zzw((java.lang.String) obj);
                    break;
                } else {
                    zzidjVar.zzk((com.google.android.gms.internal.ads.zzida) obj);
                    break;
                }
            case GROUP:
                ((com.google.android.gms.internal.ads.zzifp) obj).zzcX(zzidjVar);
                break;
            case MESSAGE:
                zzidjVar.zzo((com.google.android.gms.internal.ads.zzifp) obj);
                break;
            case BYTES:
                if (!(obj instanceof com.google.android.gms.internal.ads.zzida)) {
                    byte[] bArr = (byte[]) obj;
                    zzidjVar.zzl(bArr, 0, bArr.length);
                    break;
                } else {
                    zzidjVar.zzk((com.google.android.gms.internal.ads.zzida) obj);
                    break;
                }
            case UINT32:
                zzidjVar.zzr(((java.lang.Integer) obj).intValue());
                break;
            case ENUM:
                if (!(obj instanceof com.google.android.gms.internal.ads.zziei)) {
                    zzidjVar.zzq(((java.lang.Integer) obj).intValue());
                    break;
                } else {
                    zzidjVar.zzq(((com.google.android.gms.internal.ads.zziei) obj).zza());
                    break;
                }
            case SFIXED32:
                zzidjVar.zzs(((java.lang.Integer) obj).intValue());
                break;
            case SFIXED64:
                zzidjVar.zzu(((java.lang.Long) obj).longValue());
                break;
            case SINT32:
                int intValue = ((java.lang.Integer) obj).intValue();
                zzidjVar.zzr((intValue >> 31) ^ (intValue + intValue));
                break;
            case SINT64:
                long longValue = ((java.lang.Long) obj).longValue();
                zzidjVar.zzt((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    static int zzh(com.google.android.gms.internal.ads.zzihg zzihgVar, int i, java.lang.Object obj) {
        int zzF = com.google.android.gms.internal.ads.zzidj.zzF(i << 3);
        if (zzihgVar == com.google.android.gms.internal.ads.zzihg.GROUP) {
            zzF += zzF;
        }
        return zzF + zzi(zzihgVar, obj);
    }

    static int zzi(com.google.android.gms.internal.ads.zzihg zzihgVar, java.lang.Object obj) {
        int zzc;
        int zzF;
        com.google.android.gms.internal.ads.zzihg zzihgVar2 = com.google.android.gms.internal.ads.zzihg.DOUBLE;
        com.google.android.gms.internal.ads.zzihh zzihhVar = com.google.android.gms.internal.ads.zzihh.INT;
        switch (zzihgVar) {
            case DOUBLE:
                ((java.lang.Double) obj).doubleValue();
                int i = com.google.android.gms.internal.ads.zzidj.zzb;
                return 8;
            case FLOAT:
                ((java.lang.Float) obj).floatValue();
                int i2 = com.google.android.gms.internal.ads.zzidj.zzb;
                return 4;
            case INT64:
                return com.google.android.gms.internal.ads.zzidj.zzG(((java.lang.Long) obj).longValue());
            case UINT64:
                return com.google.android.gms.internal.ads.zzidj.zzG(((java.lang.Long) obj).longValue());
            case INT32:
                return com.google.android.gms.internal.ads.zzidj.zzG(((java.lang.Integer) obj).intValue());
            case FIXED64:
                ((java.lang.Long) obj).longValue();
                int i3 = com.google.android.gms.internal.ads.zzidj.zzb;
                return 8;
            case FIXED32:
                ((java.lang.Integer) obj).intValue();
                int i4 = com.google.android.gms.internal.ads.zzidj.zzb;
                return 4;
            case BOOL:
                ((java.lang.Boolean) obj).booleanValue();
                int i5 = com.google.android.gms.internal.ads.zzidj.zzb;
                return 1;
            case STRING:
                if (!(obj instanceof com.google.android.gms.internal.ads.zzida)) {
                    int i6 = com.google.android.gms.internal.ads.zzidj.zzb;
                    zzc = com.google.android.gms.internal.ads.zzihf.zzc((java.lang.String) obj);
                    zzF = com.google.android.gms.internal.ads.zzidj.zzF(zzc);
                    break;
                } else {
                    int i7 = com.google.android.gms.internal.ads.zzidj.zzb;
                    zzc = ((com.google.android.gms.internal.ads.zzida) obj).zzb();
                    zzF = com.google.android.gms.internal.ads.zzidj.zzF(zzc);
                    break;
                }
            case GROUP:
                return ((com.google.android.gms.internal.ads.zzifp) obj).zzbr();
            case MESSAGE:
                if (!(obj instanceof com.google.android.gms.internal.ads.zziey)) {
                    return com.google.android.gms.internal.ads.zzidj.zzH((com.google.android.gms.internal.ads.zzifp) obj);
                }
                zzc = ((com.google.android.gms.internal.ads.zziey) obj).zzb();
                zzF = com.google.android.gms.internal.ads.zzidj.zzF(zzc);
                break;
            case BYTES:
                if (!(obj instanceof com.google.android.gms.internal.ads.zzida)) {
                    int i8 = com.google.android.gms.internal.ads.zzidj.zzb;
                    zzc = ((byte[]) obj).length;
                    zzF = com.google.android.gms.internal.ads.zzidj.zzF(zzc);
                    break;
                } else {
                    int i9 = com.google.android.gms.internal.ads.zzidj.zzb;
                    zzc = ((com.google.android.gms.internal.ads.zzida) obj).zzb();
                    zzF = com.google.android.gms.internal.ads.zzidj.zzF(zzc);
                    break;
                }
            case UINT32:
                return com.google.android.gms.internal.ads.zzidj.zzF(((java.lang.Integer) obj).intValue());
            case ENUM:
                return obj instanceof com.google.android.gms.internal.ads.zziei ? com.google.android.gms.internal.ads.zzidj.zzG(((com.google.android.gms.internal.ads.zziei) obj).zza()) : com.google.android.gms.internal.ads.zzidj.zzG(((java.lang.Integer) obj).intValue());
            case SFIXED32:
                ((java.lang.Integer) obj).intValue();
                int i10 = com.google.android.gms.internal.ads.zzidj.zzb;
                return 4;
            case SFIXED64:
                ((java.lang.Long) obj).longValue();
                int i11 = com.google.android.gms.internal.ads.zzidj.zzb;
                return 8;
            case SINT32:
                int intValue = ((java.lang.Integer) obj).intValue();
                return com.google.android.gms.internal.ads.zzidj.zzF((intValue >> 31) ^ (intValue + intValue));
            case SINT64:
                long longValue = ((java.lang.Long) obj).longValue();
                return com.google.android.gms.internal.ads.zzidj.zzG((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzF + zzc;
    }

    public static int zzj(com.google.android.gms.internal.ads.zzids zzidsVar, java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzihg zzb = zzidsVar.zzb();
        int zza = zzidsVar.zza();
        if (!zzidsVar.zzd()) {
            return zzh(zzb, zza, obj);
        }
        java.util.List list = (java.util.List) obj;
        int size = list.size();
        int i = 0;
        if (!zzidsVar.zze()) {
            int i2 = 0;
            while (i < size) {
                i2 += zzh(zzb, zza, list.get(i));
                i++;
            }
            return i2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i3 = 0;
        while (i < size) {
            i3 += zzi(zzb, list.get(i));
            i++;
        }
        return com.google.android.gms.internal.ads.zzidj.zzF(zza << 3) + i3 + com.google.android.gms.internal.ads.zzidj.zzF(i3);
    }

    private static boolean zzk(java.util.Map.Entry entry) {
        com.google.android.gms.internal.ads.zzids zzidsVar = (com.google.android.gms.internal.ads.zzids) entry.getKey();
        if (zzidsVar.zzc() != com.google.android.gms.internal.ads.zzihh.MESSAGE) {
            return true;
        }
        if (!zzidsVar.zzd()) {
            return zzl(entry.getValue());
        }
        java.util.List list = (java.util.List) entry.getValue();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!zzl(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzl(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.ads.zzifq) {
            return ((com.google.android.gms.internal.ads.zzifq) obj).zzbi();
        }
        if (obj instanceof com.google.android.gms.internal.ads.zziey) {
            return true;
        }
        throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(java.util.Map.Entry entry) {
        int i;
        int zzF;
        int zzF2;
        com.google.android.gms.internal.ads.zzids zzidsVar = (com.google.android.gms.internal.ads.zzids) entry.getKey();
        java.lang.Object value = entry.getValue();
        if (zzidsVar.zzc() != com.google.android.gms.internal.ads.zzihh.MESSAGE || zzidsVar.zzd() || zzidsVar.zze()) {
            return zzj(zzidsVar, value);
        }
        if (value instanceof com.google.android.gms.internal.ads.zziey) {
            int zza = ((com.google.android.gms.internal.ads.zzids) entry.getKey()).zza();
            int zzF3 = com.google.android.gms.internal.ads.zzidj.zzF(8);
            i = zzF3 + zzF3;
            zzF = com.google.android.gms.internal.ads.zzidj.zzF(16) + com.google.android.gms.internal.ads.zzidj.zzF(zza);
            int zzF4 = com.google.android.gms.internal.ads.zzidj.zzF(24);
            int zzb = ((com.google.android.gms.internal.ads.zziey) value).zzb();
            zzF2 = zzF4 + com.google.android.gms.internal.ads.zzidj.zzF(zzb) + zzb;
        } else {
            int zza2 = ((com.google.android.gms.internal.ads.zzids) entry.getKey()).zza();
            int zzF5 = com.google.android.gms.internal.ads.zzidj.zzF(8);
            i = zzF5 + zzF5;
            zzF = com.google.android.gms.internal.ads.zzidj.zzF(16) + com.google.android.gms.internal.ads.zzidj.zzF(zza2);
            zzF2 = com.google.android.gms.internal.ads.zzidj.zzF(24) + com.google.android.gms.internal.ads.zzidj.zzH((com.google.android.gms.internal.ads.zzifp) value);
        }
        return i + zzF + zzF2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzn(com.google.android.gms.internal.ads.zzids zzidsVar, java.lang.Object obj) {
        boolean z;
        zzidsVar.zzb();
        obj.getClass();
        com.google.android.gms.internal.ads.zzihg zzihgVar = com.google.android.gms.internal.ads.zzihg.DOUBLE;
        com.google.android.gms.internal.ads.zzihh zzihhVar = com.google.android.gms.internal.ads.zzihh.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof java.lang.Integer;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzidsVar.zza()), zzidsVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z = obj instanceof java.lang.Long;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzidsVar.zza()), zzidsVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z = obj instanceof java.lang.Float;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzidsVar.zza()), zzidsVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z = obj instanceof java.lang.Double;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzidsVar.zza()), zzidsVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z = obj instanceof java.lang.Boolean;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzidsVar.zza()), zzidsVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z = obj instanceof java.lang.String;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzidsVar.zza()), zzidsVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof com.google.android.gms.internal.ads.zzida) || (obj instanceof byte[])) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzidsVar.zza()), zzidsVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof java.lang.Integer) || (obj instanceof com.google.android.gms.internal.ads.zziei)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzidsVar.zza()), zzidsVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof com.google.android.gms.internal.ads.zzifp) || (obj instanceof com.google.android.gms.internal.ads.zziey)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzidsVar.zza()), zzidsVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzidsVar.zza()), zzidsVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        com.google.android.gms.internal.ads.zzidt zzidtVar = new com.google.android.gms.internal.ads.zzidt();
        com.google.android.gms.internal.ads.zzign zzignVar = this.zza;
        int zzc = zzignVar.zzc();
        for (int i = 0; i < zzc; i++) {
            java.util.Map.Entry zzd2 = zzignVar.zzd(i);
            zzidtVar.zzd((com.google.android.gms.internal.ads.zzids) ((com.google.android.gms.internal.ads.zzigk) zzd2).zza(), zzd2.getValue());
        }
        for (java.util.Map.Entry entry : zzignVar.zze()) {
            zzidtVar.zzd((com.google.android.gms.internal.ads.zzids) entry.getKey(), entry.getValue());
        }
        zzidtVar.zzc = this.zzc;
        return zzidtVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzidt) {
            return this.zza.equals(((com.google.android.gms.internal.ads.zzidt) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzb) {
            return;
        }
        com.google.android.gms.internal.ads.zzign zzignVar = this.zza;
        int zzc = zzignVar.zzc();
        for (int i = 0; i < zzc; i++) {
            java.lang.Object value = zzignVar.zzd(i).getValue();
            if (value instanceof com.google.android.gms.internal.ads.zziee) {
                ((com.google.android.gms.internal.ads.zziee) value).zzbm();
            }
        }
        java.util.Iterator it = zzignVar.zze().iterator();
        while (it.hasNext()) {
            java.lang.Object value2 = ((java.util.Map.Entry) it.next()).getValue();
            if (value2 instanceof com.google.android.gms.internal.ads.zziee) {
                ((com.google.android.gms.internal.ads.zziee) value2).zzbm();
            }
        }
        zzignVar.zza();
        this.zzb = true;
    }

    public final java.util.Iterator zzc() {
        com.google.android.gms.internal.ads.zzign zzignVar = this.zza;
        return zzignVar.isEmpty() ? java.util.Collections.emptyIterator() : this.zzc ? new com.google.android.gms.internal.ads.zziex(zzignVar.entrySet().iterator()) : zzignVar.entrySet().iterator();
    }

    public final void zzd(com.google.android.gms.internal.ads.zzids zzidsVar, java.lang.Object obj) {
        if (!zzidsVar.zzd()) {
            zzn(zzidsVar, obj);
        } else {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            java.util.List list = (java.util.List) obj;
            int size = list.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i = 0; i < size; i++) {
                java.lang.Object obj2 = list.get(i);
                zzn(zzidsVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zziey) {
            this.zzc = true;
        }
        this.zza.put(zzidsVar, obj);
    }

    public final boolean zze() {
        com.google.android.gms.internal.ads.zzign zzignVar = this.zza;
        int zzc = zzignVar.zzc();
        for (int i = 0; i < zzc; i++) {
            if (!zzk(zzignVar.zzd(i))) {
                return false;
            }
        }
        java.util.Iterator it = zzignVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzk((java.util.Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int zzg() {
        com.google.android.gms.internal.ads.zzign zzignVar = this.zza;
        int zzc = zzignVar.zzc();
        int i = 0;
        for (int i2 = 0; i2 < zzc; i2++) {
            i += zzm(zzignVar.zzd(i2));
        }
        java.util.Iterator it = zzignVar.zze().iterator();
        while (it.hasNext()) {
            i += zzm((java.util.Map.Entry) it.next());
        }
        return i;
    }

    private zzidt(boolean z) {
        zzb();
        zzb();
    }
}
