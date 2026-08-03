package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzqf {
    private static final com.google.android.gms.internal.consent_sdk.zzqf zzd = new com.google.android.gms.internal.consent_sdk.zzqf(true);
    final com.google.android.gms.internal.consent_sdk.zzsi zza = new com.google.android.gms.internal.consent_sdk.zzsd();
    boolean zzb;
    boolean zzc;

    private zzqf() {
    }

    static int zza(com.google.android.gms.internal.consent_sdk.zzsz zzszVar, int i, java.lang.Object obj) {
        int zzC = com.google.android.gms.internal.consent_sdk.zzpv.zzC(i << 3);
        if (zzszVar == com.google.android.gms.internal.consent_sdk.zzsz.GROUP) {
            zzC += zzC;
        }
        return zzC + zzb(zzszVar, obj);
    }

    static int zzb(com.google.android.gms.internal.consent_sdk.zzsz zzszVar, java.lang.Object obj) {
        int zzd2;
        int zzC;
        com.google.android.gms.internal.consent_sdk.zzsz zzszVar2 = com.google.android.gms.internal.consent_sdk.zzsz.DOUBLE;
        com.google.android.gms.internal.consent_sdk.zzta zztaVar = com.google.android.gms.internal.consent_sdk.zzta.INT;
        switch (zzszVar) {
            case DOUBLE:
                ((java.lang.Double) obj).doubleValue();
                int i = com.google.android.gms.internal.consent_sdk.zzpv.zzf;
                return 8;
            case FLOAT:
                ((java.lang.Float) obj).floatValue();
                int i2 = com.google.android.gms.internal.consent_sdk.zzpv.zzf;
                return 4;
            case INT64:
                return com.google.android.gms.internal.consent_sdk.zzpv.zzD(((java.lang.Long) obj).longValue());
            case UINT64:
                return com.google.android.gms.internal.consent_sdk.zzpv.zzD(((java.lang.Long) obj).longValue());
            case INT32:
                return com.google.android.gms.internal.consent_sdk.zzpv.zzD(((java.lang.Integer) obj).intValue());
            case FIXED64:
                ((java.lang.Long) obj).longValue();
                int i3 = com.google.android.gms.internal.consent_sdk.zzpv.zzf;
                return 8;
            case FIXED32:
                ((java.lang.Integer) obj).intValue();
                int i4 = com.google.android.gms.internal.consent_sdk.zzpv.zzf;
                return 4;
            case BOOL:
                ((java.lang.Boolean) obj).booleanValue();
                int i5 = com.google.android.gms.internal.consent_sdk.zzpv.zzf;
                return 1;
            case STRING:
                if (!(obj instanceof com.google.android.gms.internal.consent_sdk.zzpm)) {
                    return com.google.android.gms.internal.consent_sdk.zzpv.zzB((java.lang.String) obj);
                }
                int i6 = com.google.android.gms.internal.consent_sdk.zzpv.zzf;
                zzd2 = ((com.google.android.gms.internal.consent_sdk.zzpm) obj).zzd();
                zzC = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzd2);
                break;
            case GROUP:
                return ((com.google.android.gms.internal.consent_sdk.zzrq) obj).zzn();
            case MESSAGE:
                if (!(obj instanceof com.google.android.gms.internal.consent_sdk.zzqz)) {
                    return com.google.android.gms.internal.consent_sdk.zzpv.zzA((com.google.android.gms.internal.consent_sdk.zzrq) obj);
                }
                zzd2 = ((com.google.android.gms.internal.consent_sdk.zzqz) obj).zza();
                zzC = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzd2);
                break;
            case BYTES:
                if (!(obj instanceof com.google.android.gms.internal.consent_sdk.zzpm)) {
                    int i7 = com.google.android.gms.internal.consent_sdk.zzpv.zzf;
                    zzd2 = ((byte[]) obj).length;
                    zzC = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzd2);
                    break;
                } else {
                    int i8 = com.google.android.gms.internal.consent_sdk.zzpv.zzf;
                    zzd2 = ((com.google.android.gms.internal.consent_sdk.zzpm) obj).zzd();
                    zzC = com.google.android.gms.internal.consent_sdk.zzpv.zzC(zzd2);
                    break;
                }
            case UINT32:
                return com.google.android.gms.internal.consent_sdk.zzpv.zzC(((java.lang.Integer) obj).intValue());
            case ENUM:
                return obj instanceof com.google.android.gms.internal.consent_sdk.zzqo ? com.google.android.gms.internal.consent_sdk.zzpv.zzD(((com.google.android.gms.internal.consent_sdk.zzqo) obj).zza()) : com.google.android.gms.internal.consent_sdk.zzpv.zzD(((java.lang.Integer) obj).intValue());
            case SFIXED32:
                ((java.lang.Integer) obj).intValue();
                int i9 = com.google.android.gms.internal.consent_sdk.zzpv.zzf;
                return 4;
            case SFIXED64:
                ((java.lang.Long) obj).longValue();
                int i10 = com.google.android.gms.internal.consent_sdk.zzpv.zzf;
                return 8;
            case SINT32:
                int intValue = ((java.lang.Integer) obj).intValue();
                return com.google.android.gms.internal.consent_sdk.zzpv.zzC((intValue >> 31) ^ (intValue + intValue));
            case SINT64:
                long longValue = ((java.lang.Long) obj).longValue();
                return com.google.android.gms.internal.consent_sdk.zzpv.zzD((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
        return zzC + zzd2;
    }

    public static int zzc(com.google.android.gms.internal.consent_sdk.zzqe zzqeVar, java.lang.Object obj) {
        com.google.android.gms.internal.consent_sdk.zzsz zzb = zzqeVar.zzb();
        int zza = zzqeVar.zza();
        if (!zzqeVar.zze()) {
            return zza(zzb, zza, obj);
        }
        java.util.List list = (java.util.List) obj;
        int size = list.size();
        int i = 0;
        if (!zzqeVar.zzd()) {
            int i2 = 0;
            while (i < size) {
                i2 += zza(zzb, zza, list.get(i));
                i++;
            }
            return i2;
        }
        if (list.isEmpty()) {
            return 0;
        }
        int i3 = 0;
        while (i < size) {
            i3 += zzb(zzb, list.get(i));
            i++;
        }
        return com.google.android.gms.internal.consent_sdk.zzpv.zzC(zza << 3) + i3 + com.google.android.gms.internal.consent_sdk.zzpv.zzC(i3);
    }

    public static com.google.android.gms.internal.consent_sdk.zzqf zze() {
        return zzd;
    }

    static void zzi(com.google.android.gms.internal.consent_sdk.zzpv zzpvVar, com.google.android.gms.internal.consent_sdk.zzsz zzszVar, int i, java.lang.Object obj) throws java.io.IOException {
        if (zzszVar == com.google.android.gms.internal.consent_sdk.zzsz.GROUP) {
            zzpvVar.zzu(i, 3);
            ((com.google.android.gms.internal.consent_sdk.zzrq) obj).zzB(zzpvVar);
            zzpvVar.zzu(i, 4);
            return;
        }
        zzpvVar.zzu(i, zzszVar.zza());
        com.google.android.gms.internal.consent_sdk.zzta zztaVar = com.google.android.gms.internal.consent_sdk.zzta.INT;
        switch (zzszVar) {
            case DOUBLE:
                zzpvVar.zzm(java.lang.Double.doubleToRawLongBits(((java.lang.Double) obj).doubleValue()));
                break;
            case FLOAT:
                zzpvVar.zzk(java.lang.Float.floatToRawIntBits(((java.lang.Float) obj).floatValue()));
                break;
            case INT64:
                zzpvVar.zzy(((java.lang.Long) obj).longValue());
                break;
            case UINT64:
                zzpvVar.zzy(((java.lang.Long) obj).longValue());
                break;
            case INT32:
                zzpvVar.zzo(((java.lang.Integer) obj).intValue());
                break;
            case FIXED64:
                zzpvVar.zzm(((java.lang.Long) obj).longValue());
                break;
            case FIXED32:
                zzpvVar.zzk(((java.lang.Integer) obj).intValue());
                break;
            case BOOL:
                zzpvVar.zzJ(((java.lang.Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case STRING:
                if (!(obj instanceof com.google.android.gms.internal.consent_sdk.zzpm)) {
                    zzpvVar.zzt((java.lang.String) obj);
                    break;
                } else {
                    zzpvVar.zzi((com.google.android.gms.internal.consent_sdk.zzpm) obj);
                    break;
                }
            case GROUP:
                ((com.google.android.gms.internal.consent_sdk.zzrq) obj).zzB(zzpvVar);
                break;
            case MESSAGE:
                zzpvVar.zzp((com.google.android.gms.internal.consent_sdk.zzrq) obj);
                break;
            case BYTES:
                if (!(obj instanceof com.google.android.gms.internal.consent_sdk.zzpm)) {
                    byte[] bArr = (byte[]) obj;
                    zzpvVar.zzL(bArr, 0, bArr.length);
                    break;
                } else {
                    zzpvVar.zzi((com.google.android.gms.internal.consent_sdk.zzpm) obj);
                    break;
                }
            case UINT32:
                zzpvVar.zzw(((java.lang.Integer) obj).intValue());
                break;
            case ENUM:
                if (!(obj instanceof com.google.android.gms.internal.consent_sdk.zzqo)) {
                    zzpvVar.zzo(((java.lang.Integer) obj).intValue());
                    break;
                } else {
                    zzpvVar.zzo(((com.google.android.gms.internal.consent_sdk.zzqo) obj).zza());
                    break;
                }
            case SFIXED32:
                zzpvVar.zzk(((java.lang.Integer) obj).intValue());
                break;
            case SFIXED64:
                zzpvVar.zzm(((java.lang.Long) obj).longValue());
                break;
            case SINT32:
                int intValue = ((java.lang.Integer) obj).intValue();
                zzpvVar.zzw((intValue >> 31) ^ (intValue + intValue));
                break;
            case SINT64:
                long longValue = ((java.lang.Long) obj).longValue();
                zzpvVar.zzy((longValue >> 63) ^ (longValue + longValue));
                break;
        }
    }

    private static boolean zzk(java.util.Map.Entry entry) {
        com.google.android.gms.internal.consent_sdk.zzqe zzqeVar = (com.google.android.gms.internal.consent_sdk.zzqe) entry.getKey();
        if (zzqeVar.zzc() != com.google.android.gms.internal.consent_sdk.zzta.MESSAGE) {
            return true;
        }
        if (!zzqeVar.zze()) {
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
        if (obj instanceof com.google.android.gms.internal.consent_sdk.zzrr) {
            return ((com.google.android.gms.internal.consent_sdk.zzrr) obj).zzo();
        }
        if (obj instanceof com.google.android.gms.internal.consent_sdk.zzqz) {
            return true;
        }
        throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzm(java.util.Map.Entry entry) {
        int i;
        int zzC;
        int zzC2;
        com.google.android.gms.internal.consent_sdk.zzqe zzqeVar = (com.google.android.gms.internal.consent_sdk.zzqe) entry.getKey();
        java.lang.Object value = entry.getValue();
        if (zzqeVar.zzc() != com.google.android.gms.internal.consent_sdk.zzta.MESSAGE || zzqeVar.zze() || zzqeVar.zzd()) {
            return zzc(zzqeVar, value);
        }
        if (value instanceof com.google.android.gms.internal.consent_sdk.zzqz) {
            int zza = ((com.google.android.gms.internal.consent_sdk.zzqe) entry.getKey()).zza();
            int zzC3 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(8);
            i = zzC3 + zzC3;
            zzC = com.google.android.gms.internal.consent_sdk.zzpv.zzC(16) + com.google.android.gms.internal.consent_sdk.zzpv.zzC(zza);
            int zzC4 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(24);
            int zza2 = ((com.google.android.gms.internal.consent_sdk.zzqz) value).zza();
            zzC2 = zzC4 + com.google.android.gms.internal.consent_sdk.zzpv.zzC(zza2) + zza2;
        } else {
            int zza3 = ((com.google.android.gms.internal.consent_sdk.zzqe) entry.getKey()).zza();
            int zzC5 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(8);
            i = zzC5 + zzC5;
            zzC = com.google.android.gms.internal.consent_sdk.zzpv.zzC(16) + com.google.android.gms.internal.consent_sdk.zzpv.zzC(zza3);
            zzC2 = com.google.android.gms.internal.consent_sdk.zzpv.zzC(24) + com.google.android.gms.internal.consent_sdk.zzpv.zzA((com.google.android.gms.internal.consent_sdk.zzrq) value);
        }
        return i + zzC + zzC2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzn(com.google.android.gms.internal.consent_sdk.zzqe zzqeVar, java.lang.Object obj) {
        boolean z;
        zzqeVar.zzb();
        byte[] bArr = com.google.android.gms.internal.consent_sdk.zzqs.zzb;
        obj.getClass();
        com.google.android.gms.internal.consent_sdk.zzsz zzszVar = com.google.android.gms.internal.consent_sdk.zzsz.DOUBLE;
        com.google.android.gms.internal.consent_sdk.zzta zztaVar = com.google.android.gms.internal.consent_sdk.zzta.INT;
        switch (r0.zzb()) {
            case INT:
                z = obj instanceof java.lang.Integer;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().zzb(), obj.getClass().getName()));
            case LONG:
                z = obj instanceof java.lang.Long;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().zzb(), obj.getClass().getName()));
            case FLOAT:
                z = obj instanceof java.lang.Float;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().zzb(), obj.getClass().getName()));
            case DOUBLE:
                z = obj instanceof java.lang.Double;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().zzb(), obj.getClass().getName()));
            case BOOLEAN:
                z = obj instanceof java.lang.Boolean;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().zzb(), obj.getClass().getName()));
            case STRING:
                z = obj instanceof java.lang.String;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().zzb(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof com.google.android.gms.internal.consent_sdk.zzpm) || (obj instanceof byte[])) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().zzb(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof java.lang.Integer) || (obj instanceof com.google.android.gms.internal.consent_sdk.zzqo)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().zzb(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof com.google.android.gms.internal.consent_sdk.zzrq) || (obj instanceof com.google.android.gms.internal.consent_sdk.zzqz)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().zzb(), obj.getClass().getName()));
            default:
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzqeVar.zza()), zzqeVar.zzb().zzb(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        com.google.android.gms.internal.consent_sdk.zzqf zzqfVar = new com.google.android.gms.internal.consent_sdk.zzqf();
        com.google.android.gms.internal.consent_sdk.zzsi zzsiVar = this.zza;
        int zzc = zzsiVar.zzc();
        for (int i = 0; i < zzc; i++) {
            java.util.Map.Entry zzg = zzsiVar.zzg(i);
            zzqfVar.zzh((com.google.android.gms.internal.consent_sdk.zzqe) ((com.google.android.gms.internal.consent_sdk.zzse) zzg).zza(), zzg.getValue());
        }
        for (java.util.Map.Entry entry : zzsiVar.zzd()) {
            zzqfVar.zzh((com.google.android.gms.internal.consent_sdk.zzqe) entry.getKey(), entry.getValue());
        }
        zzqfVar.zzc = this.zzc;
        return zzqfVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.consent_sdk.zzqf) {
            return this.zza.equals(((com.google.android.gms.internal.consent_sdk.zzqf) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzd() {
        com.google.android.gms.internal.consent_sdk.zzsi zzsiVar = this.zza;
        int zzc = zzsiVar.zzc();
        int i = 0;
        for (int i2 = 0; i2 < zzc; i2++) {
            i += zzm(zzsiVar.zzg(i2));
        }
        java.util.Iterator it = zzsiVar.zzd().iterator();
        while (it.hasNext()) {
            i += zzm((java.util.Map.Entry) it.next());
        }
        return i;
    }

    public final java.util.Iterator zzf() {
        com.google.android.gms.internal.consent_sdk.zzsi zzsiVar = this.zza;
        return zzsiVar.isEmpty() ? java.util.Collections.emptyIterator() : this.zzc ? new com.google.android.gms.internal.consent_sdk.zzqx(zzsiVar.entrySet().iterator()) : zzsiVar.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzb) {
            return;
        }
        com.google.android.gms.internal.consent_sdk.zzsi zzsiVar = this.zza;
        int zzc = zzsiVar.zzc();
        for (int i = 0; i < zzc; i++) {
            java.lang.Object value = zzsiVar.zzg(i).getValue();
            if (value instanceof com.google.android.gms.internal.consent_sdk.zzqm) {
                ((com.google.android.gms.internal.consent_sdk.zzqm) value).zzx();
            }
        }
        java.util.Iterator it = zzsiVar.zzd().iterator();
        while (it.hasNext()) {
            java.lang.Object value2 = ((java.util.Map.Entry) it.next()).getValue();
            if (value2 instanceof com.google.android.gms.internal.consent_sdk.zzqm) {
                ((com.google.android.gms.internal.consent_sdk.zzqm) value2).zzx();
            }
        }
        zzsiVar.zza();
        this.zzb = true;
    }

    public final void zzh(com.google.android.gms.internal.consent_sdk.zzqe zzqeVar, java.lang.Object obj) {
        if (!zzqeVar.zze()) {
            zzn(zzqeVar, obj);
        } else {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            java.util.List list = (java.util.List) obj;
            int size = list.size();
            java.util.ArrayList arrayList = new java.util.ArrayList(size);
            for (int i = 0; i < size; i++) {
                java.lang.Object obj2 = list.get(i);
                zzn(zzqeVar, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        }
        if (obj instanceof com.google.android.gms.internal.consent_sdk.zzqz) {
            this.zzc = true;
        }
        this.zza.put(zzqeVar, obj);
    }

    public final boolean zzj() {
        com.google.android.gms.internal.consent_sdk.zzsi zzsiVar = this.zza;
        int zzc = zzsiVar.zzc();
        for (int i = 0; i < zzc; i++) {
            if (!zzk(zzsiVar.zzg(i))) {
                return false;
            }
        }
        java.util.Iterator it = zzsiVar.zzd().iterator();
        while (it.hasNext()) {
            if (!zzk((java.util.Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzqf(boolean z) {
        zzg();
        zzg();
    }
}
