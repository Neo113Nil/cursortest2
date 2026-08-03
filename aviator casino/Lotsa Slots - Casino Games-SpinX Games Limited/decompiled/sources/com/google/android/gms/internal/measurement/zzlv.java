package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
final class zzlv {
    private static final com.google.android.gms.internal.measurement.zzlv zzd = new com.google.android.gms.internal.measurement.zzlv(true);
    final com.google.android.gms.internal.measurement.zzod zza = new com.google.android.gms.internal.measurement.zznz();
    private boolean zzb;
    private boolean zzc;

    private zzlv() {
    }

    public static com.google.android.gms.internal.measurement.zzlv zza() {
        return zzd;
    }

    static void zzf(com.google.android.gms.internal.measurement.zzll zzllVar, com.google.android.gms.internal.measurement.zzos zzosVar, int i, java.lang.Object obj) throws java.io.IOException {
        if (zzosVar == com.google.android.gms.internal.measurement.zzos.GROUP) {
            com.google.android.gms.internal.measurement.zznl zznlVar = (com.google.android.gms.internal.measurement.zznl) obj;
            com.google.android.gms.internal.measurement.zzmo.zzd(zznlVar);
            zzllVar.zza(i, 3);
            zznlVar.zzcB(zzllVar);
            zzllVar.zza(i, 4);
            return;
        }
        zzllVar.zza(i, zzosVar.zzb());
        com.google.android.gms.internal.measurement.zzot zzotVar = com.google.android.gms.internal.measurement.zzot.INT;
        switch (zzosVar) {
            case DOUBLE:
                zzllVar.zzu(java.lang.Double.doubleToRawLongBits(((java.lang.Double) obj).doubleValue()));
                break;
            case FLOAT:
                zzllVar.zzs(java.lang.Float.floatToRawIntBits(((java.lang.Float) obj).floatValue()));
                break;
            case INT64:
                zzllVar.zzt(((java.lang.Long) obj).longValue());
                break;
            case UINT64:
                zzllVar.zzt(((java.lang.Long) obj).longValue());
                break;
            case INT32:
                zzllVar.zzq(((java.lang.Integer) obj).intValue());
                break;
            case FIXED64:
                zzllVar.zzu(((java.lang.Long) obj).longValue());
                break;
            case FIXED32:
                zzllVar.zzs(((java.lang.Integer) obj).intValue());
                break;
            case BOOL:
                zzllVar.zzp(((java.lang.Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case STRING:
                if (!(obj instanceof com.google.android.gms.internal.measurement.zzlg)) {
                    zzllVar.zzx((java.lang.String) obj);
                    break;
                } else {
                    zzllVar.zzj((com.google.android.gms.internal.measurement.zzlg) obj);
                    break;
                }
            case GROUP:
                ((com.google.android.gms.internal.measurement.zznl) obj).zzcB(zzllVar);
                break;
            case MESSAGE:
                zzllVar.zzo((com.google.android.gms.internal.measurement.zznl) obj);
                break;
            case BYTES:
                if (!(obj instanceof com.google.android.gms.internal.measurement.zzlg)) {
                    byte[] bArr = (byte[]) obj;
                    zzllVar.zzk(bArr, 0, bArr.length);
                    break;
                } else {
                    zzllVar.zzj((com.google.android.gms.internal.measurement.zzlg) obj);
                    break;
                }
            case UINT32:
                zzllVar.zzr(((java.lang.Integer) obj).intValue());
                break;
            case ENUM:
                if (!(obj instanceof com.google.android.gms.internal.measurement.zzmi)) {
                    zzllVar.zzq(((java.lang.Integer) obj).intValue());
                    break;
                } else {
                    zzllVar.zzq(((com.google.android.gms.internal.measurement.zzmi) obj).zza());
                    break;
                }
            case SFIXED32:
                zzllVar.zzs(((java.lang.Integer) obj).intValue());
                break;
            case SFIXED64:
                zzllVar.zzu(((java.lang.Long) obj).longValue());
                break;
            case SINT32:
                int intValue = ((java.lang.Integer) obj).intValue();
                zzllVar.zzr((intValue >> 31) ^ (intValue + intValue));
                break;
            case SINT64:
                long longValue = ((java.lang.Long) obj).longValue();
                zzllVar.zzt((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    static int zzh(com.google.android.gms.internal.measurement.zzos zzosVar, int i, java.lang.Object obj) {
        int zzz = com.google.android.gms.internal.measurement.zzll.zzz(i << 3);
        if (zzosVar == com.google.android.gms.internal.measurement.zzos.GROUP) {
            com.google.android.gms.internal.measurement.zzmo.zzd((com.google.android.gms.internal.measurement.zznl) obj);
            zzz += zzz;
        }
        return zzz + zzi(zzosVar, obj);
    }

    static int zzi(com.google.android.gms.internal.measurement.zzos zzosVar, java.lang.Object obj) {
        int zzc;
        int zzz;
        com.google.android.gms.internal.measurement.zzos zzosVar2 = com.google.android.gms.internal.measurement.zzos.DOUBLE;
        com.google.android.gms.internal.measurement.zzot zzotVar = com.google.android.gms.internal.measurement.zzot.INT;
        switch (zzosVar) {
            case DOUBLE:
                ((java.lang.Double) obj).doubleValue();
                int i = com.google.android.gms.internal.measurement.zzll.zzb;
                return 8;
            case FLOAT:
                ((java.lang.Float) obj).floatValue();
                int i2 = com.google.android.gms.internal.measurement.zzll.zzb;
                return 4;
            case INT64:
                return com.google.android.gms.internal.measurement.zzll.zzA(((java.lang.Long) obj).longValue());
            case UINT64:
                return com.google.android.gms.internal.measurement.zzll.zzA(((java.lang.Long) obj).longValue());
            case INT32:
                return com.google.android.gms.internal.measurement.zzll.zzA(((java.lang.Integer) obj).intValue());
            case FIXED64:
                ((java.lang.Long) obj).longValue();
                int i3 = com.google.android.gms.internal.measurement.zzll.zzb;
                return 8;
            case FIXED32:
                ((java.lang.Integer) obj).intValue();
                int i4 = com.google.android.gms.internal.measurement.zzll.zzb;
                return 4;
            case BOOL:
                ((java.lang.Boolean) obj).booleanValue();
                int i5 = com.google.android.gms.internal.measurement.zzll.zzb;
                return 1;
            case STRING:
                if (!(obj instanceof com.google.android.gms.internal.measurement.zzlg)) {
                    return com.google.android.gms.internal.measurement.zzll.zzB((java.lang.String) obj);
                }
                int i6 = com.google.android.gms.internal.measurement.zzll.zzb;
                zzc = ((com.google.android.gms.internal.measurement.zzlg) obj).zzc();
                zzz = com.google.android.gms.internal.measurement.zzll.zzz(zzc);
                break;
            case GROUP:
                return ((com.google.android.gms.internal.measurement.zznl) obj).zzcn();
            case MESSAGE:
                if (!(obj instanceof com.google.android.gms.internal.measurement.zzmu)) {
                    return com.google.android.gms.internal.measurement.zzll.zzC((com.google.android.gms.internal.measurement.zznl) obj);
                }
                int i7 = com.google.android.gms.internal.measurement.zzll.zzb;
                zzc = ((com.google.android.gms.internal.measurement.zzmu) obj).zzb();
                zzz = com.google.android.gms.internal.measurement.zzll.zzz(zzc);
                break;
            case BYTES:
                if (!(obj instanceof com.google.android.gms.internal.measurement.zzlg)) {
                    int i8 = com.google.android.gms.internal.measurement.zzll.zzb;
                    zzc = ((byte[]) obj).length;
                    zzz = com.google.android.gms.internal.measurement.zzll.zzz(zzc);
                    break;
                } else {
                    int i9 = com.google.android.gms.internal.measurement.zzll.zzb;
                    zzc = ((com.google.android.gms.internal.measurement.zzlg) obj).zzc();
                    zzz = com.google.android.gms.internal.measurement.zzll.zzz(zzc);
                    break;
                }
            case UINT32:
                return com.google.android.gms.internal.measurement.zzll.zzz(((java.lang.Integer) obj).intValue());
            case ENUM:
                return obj instanceof com.google.android.gms.internal.measurement.zzmi ? com.google.android.gms.internal.measurement.zzll.zzA(((com.google.android.gms.internal.measurement.zzmi) obj).zza()) : com.google.android.gms.internal.measurement.zzll.zzA(((java.lang.Integer) obj).intValue());
            case SFIXED32:
                ((java.lang.Integer) obj).intValue();
                int i10 = com.google.android.gms.internal.measurement.zzll.zzb;
                return 4;
            case SFIXED64:
                ((java.lang.Long) obj).longValue();
                int i11 = com.google.android.gms.internal.measurement.zzll.zzb;
                return 8;
            case SINT32:
                int intValue = ((java.lang.Integer) obj).intValue();
                return com.google.android.gms.internal.measurement.zzll.zzz((intValue >> 31) ^ (intValue + intValue));
            case SINT64:
                long longValue = ((java.lang.Long) obj).longValue();
                return com.google.android.gms.internal.measurement.zzll.zzA((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzz + zzc;
    }

    public static int zzj(com.google.android.gms.internal.measurement.zzlu zzluVar, java.lang.Object obj) {
        com.google.android.gms.internal.measurement.zzos zzb = zzluVar.zzb();
        int zza = zzluVar.zza();
        if (!zzluVar.zzd()) {
            return zzh(zzb, zza, obj);
        }
        java.util.List list = (java.util.List) obj;
        int size = list.size();
        int i = 0;
        if (!zzluVar.zze()) {
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
        return com.google.android.gms.internal.measurement.zzll.zzz(zza << 3) + i3 + com.google.android.gms.internal.measurement.zzll.zzz(i3);
    }

    private static boolean zzk(java.util.Map.Entry entry) {
        com.google.android.gms.internal.measurement.zzlu zzluVar = (com.google.android.gms.internal.measurement.zzlu) entry.getKey();
        if (zzluVar.zzc() != com.google.android.gms.internal.measurement.zzot.MESSAGE) {
            return true;
        }
        if (!zzluVar.zzd()) {
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
        if (obj instanceof com.google.android.gms.internal.measurement.zznm) {
            return ((com.google.android.gms.internal.measurement.zznm) obj).zzcD();
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzmu) {
            return true;
        }
        throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(java.util.Map.Entry entry) {
        int i;
        int zzz;
        int zzz2;
        com.google.android.gms.internal.measurement.zzlu zzluVar = (com.google.android.gms.internal.measurement.zzlu) entry.getKey();
        java.lang.Object value = entry.getValue();
        if (zzluVar.zzc() != com.google.android.gms.internal.measurement.zzot.MESSAGE || zzluVar.zzd() || zzluVar.zze()) {
            return zzj(zzluVar, value);
        }
        if (value instanceof com.google.android.gms.internal.measurement.zzmu) {
            int zza = ((com.google.android.gms.internal.measurement.zzlu) entry.getKey()).zza();
            int zzz3 = com.google.android.gms.internal.measurement.zzll.zzz(8);
            i = zzz3 + zzz3;
            zzz = com.google.android.gms.internal.measurement.zzll.zzz(16) + com.google.android.gms.internal.measurement.zzll.zzz(zza);
            int zzz4 = com.google.android.gms.internal.measurement.zzll.zzz(24);
            int zzb = ((com.google.android.gms.internal.measurement.zzmu) value).zzb();
            zzz2 = zzz4 + com.google.android.gms.internal.measurement.zzll.zzz(zzb) + zzb;
        } else {
            int zza2 = ((com.google.android.gms.internal.measurement.zzlu) entry.getKey()).zza();
            int zzz5 = com.google.android.gms.internal.measurement.zzll.zzz(8);
            i = zzz5 + zzz5;
            zzz = com.google.android.gms.internal.measurement.zzll.zzz(16) + com.google.android.gms.internal.measurement.zzll.zzz(zza2);
            zzz2 = com.google.android.gms.internal.measurement.zzll.zzz(24) + com.google.android.gms.internal.measurement.zzll.zzC((com.google.android.gms.internal.measurement.zznl) value);
        }
        return i + zzz + zzz2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzn(com.google.android.gms.internal.measurement.zzlu zzluVar, java.lang.Object obj) {
        boolean z;
        zzluVar.zzb();
        byte[] bArr = com.google.android.gms.internal.measurement.zzmo.zzb;
        obj.getClass();
        com.google.android.gms.internal.measurement.zzos zzosVar = com.google.android.gms.internal.measurement.zzos.DOUBLE;
        com.google.android.gms.internal.measurement.zzot zzotVar = com.google.android.gms.internal.measurement.zzot.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof java.lang.Integer;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z = obj instanceof java.lang.Long;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z = obj instanceof java.lang.Float;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z = obj instanceof java.lang.Double;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z = obj instanceof java.lang.Boolean;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z = obj instanceof java.lang.String;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof com.google.android.gms.internal.measurement.zzlg) || (obj instanceof byte[])) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof java.lang.Integer) || (obj instanceof com.google.android.gms.internal.measurement.zzmi)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof com.google.android.gms.internal.measurement.zznl) || (obj instanceof com.google.android.gms.internal.measurement.zzmu)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzluVar.zza()), zzluVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        com.google.android.gms.internal.measurement.zzlv zzlvVar = new com.google.android.gms.internal.measurement.zzlv();
        com.google.android.gms.internal.measurement.zzod zzodVar = this.zza;
        int zzc = zzodVar.zzc();
        for (int i = 0; i < zzc; i++) {
            java.util.Map.Entry zzd2 = zzodVar.zzd(i);
            zzlvVar.zzd((com.google.android.gms.internal.measurement.zzlu) ((com.google.android.gms.internal.measurement.zzoa) zzd2).zza(), zzd2.getValue());
        }
        for (java.util.Map.Entry entry : zzodVar.zze()) {
            zzlvVar.zzd((com.google.android.gms.internal.measurement.zzlu) entry.getKey(), entry.getValue());
        }
        zzlvVar.zzc = this.zzc;
        return zzlvVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzlv) {
            return this.zza.equals(((com.google.android.gms.internal.measurement.zzlv) obj).zza);
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
        com.google.android.gms.internal.measurement.zzod zzodVar = this.zza;
        int zzc = zzodVar.zzc();
        for (int i = 0; i < zzc; i++) {
            java.lang.Object value = zzodVar.zzd(i).getValue();
            if (value instanceof com.google.android.gms.internal.measurement.zzme) {
                ((com.google.android.gms.internal.measurement.zzme) value).zzcj();
            }
        }
        java.util.Iterator it = zzodVar.zze().iterator();
        while (it.hasNext()) {
            java.lang.Object value2 = ((java.util.Map.Entry) it.next()).getValue();
            if (value2 instanceof com.google.android.gms.internal.measurement.zzme) {
                ((com.google.android.gms.internal.measurement.zzme) value2).zzcj();
            }
        }
        zzodVar.zza();
        this.zzb = true;
    }

    public final java.util.Iterator zzc() {
        com.google.android.gms.internal.measurement.zzod zzodVar = this.zza;
        return zzodVar.isEmpty() ? java.util.Collections.emptyIterator() : this.zzc ? new com.google.android.gms.internal.measurement.zzmt(zzodVar.entrySet().iterator()) : zzodVar.entrySet().iterator();
    }

    public final void zzd(com.google.android.gms.internal.measurement.zzlu zzluVar, java.lang.Object obj) {
        if (!zzluVar.zzd()) {
            zzn(zzluVar, obj);
        } else {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            java.util.List list = (java.util.List) obj;
            int size = list.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i = 0; i < size; i++) {
                java.lang.Object obj2 = list.get(i);
                zzn(zzluVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof com.google.android.gms.internal.measurement.zzmu) {
            this.zzc = true;
        }
        this.zza.put(zzluVar, obj);
    }

    public final boolean zze() {
        com.google.android.gms.internal.measurement.zzod zzodVar = this.zza;
        int zzc = zzodVar.zzc();
        for (int i = 0; i < zzc; i++) {
            if (!zzk(zzodVar.zzd(i))) {
                return false;
            }
        }
        java.util.Iterator it = zzodVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzk((java.util.Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int zzg() {
        com.google.android.gms.internal.measurement.zzod zzodVar = this.zza;
        int zzc = zzodVar.zzc();
        int i = 0;
        for (int i2 = 0; i2 < zzc; i2++) {
            i += zzm(zzodVar.zzd(i2));
        }
        java.util.Iterator it = zzodVar.zze().iterator();
        while (it.hasNext()) {
            i += zzm((java.util.Map.Entry) it.next());
        }
        return i;
    }

    private zzlv(boolean z) {
        zzb();
        zzb();
    }
}
