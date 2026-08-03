package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzci {
    private static final com.google.android.gms.internal.play_billing.zzci zzb = new com.google.android.gms.internal.play_billing.zzci(true);
    final com.google.android.gms.internal.play_billing.zzfb zza = new com.google.android.gms.internal.play_billing.zzer(16);
    private boolean zzc;
    private boolean zzd;

    private zzci() {
    }

    static int zza(com.google.android.gms.internal.play_billing.zzfv zzfvVar, int i, java.lang.Object obj) {
        com.google.android.gms.internal.play_billing.zzby.zzw(i << 3);
        if (com.google.android.gms.internal.play_billing.zzfv.GROUP == null) {
            com.google.android.gms.internal.play_billing.zzec zzecVar = (com.google.android.gms.internal.play_billing.zzec) obj;
            byte[] bArr = com.google.android.gms.internal.play_billing.zzda.zzd;
            if (zzecVar instanceof com.google.android.gms.internal.play_billing.zzaz) {
                throw null;
            }
        }
        com.google.android.gms.internal.play_billing.zzfw zzfwVar = com.google.android.gms.internal.play_billing.zzfw.INT;
        throw null;
    }

    public static int zzb(com.google.android.gms.internal.play_billing.zzch zzchVar, java.lang.Object obj) {
        com.google.android.gms.internal.play_billing.zzfv zzd = zzchVar.zzd();
        int zza = zzchVar.zza();
        if (!zzchVar.zzg()) {
            return zza(zzd, zza, obj);
        }
        java.util.List list = (java.util.List) obj;
        int i = 0;
        if (!zzchVar.zzf()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                i += zza(zzd, zza, it.next());
            }
            return i;
        }
        if (list.isEmpty()) {
            return 0;
        }
        java.util.Iterator it2 = list.iterator();
        if (!it2.hasNext()) {
            return com.google.android.gms.internal.play_billing.zzby.zzw(zza << 3) + com.google.android.gms.internal.play_billing.zzby.zzw(0);
        }
        it2.next();
        com.google.android.gms.internal.play_billing.zzfv zzfvVar = com.google.android.gms.internal.play_billing.zzfv.DOUBLE;
        com.google.android.gms.internal.play_billing.zzfw zzfwVar = com.google.android.gms.internal.play_billing.zzfw.INT;
        throw null;
    }

    public static com.google.android.gms.internal.play_billing.zzci zzd() {
        return zzb;
    }

    private static java.lang.Object zzk(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.play_billing.zzeh) {
            return ((com.google.android.gms.internal.play_billing.zzeh) obj).zzd();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    private final void zzl(java.util.Map.Entry entry) {
        com.google.android.gms.internal.play_billing.zzch zzchVar = (com.google.android.gms.internal.play_billing.zzch) entry.getKey();
        java.lang.Object value = entry.getValue();
        boolean z = value instanceof com.google.android.gms.internal.play_billing.zzdh;
        if (zzchVar.zzg()) {
            if (z) {
                throw new java.lang.IllegalStateException("Lazy fields can not be repeated");
            }
            java.lang.Object zze = zze(zzchVar);
            if (zze == null) {
                zze = new java.util.ArrayList();
            }
            java.util.Iterator it = ((java.util.List) value).iterator();
            while (it.hasNext()) {
                ((java.util.List) zze).add(zzk(it.next()));
            }
            this.zza.put(zzchVar, zze);
            return;
        }
        if (zzchVar.zze() != com.google.android.gms.internal.play_billing.zzfw.MESSAGE) {
            if (z) {
                throw new java.lang.IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zzchVar, zzk(value));
            return;
        }
        java.lang.Object zze2 = zze(zzchVar);
        if (zze2 == null) {
            this.zza.put(zzchVar, zzk(value));
            if (z) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z) {
            throw null;
        }
        this.zza.put(zzchVar, zze2 instanceof com.google.android.gms.internal.play_billing.zzeh ? zzchVar.zzc((com.google.android.gms.internal.play_billing.zzeh) zze2, (com.google.android.gms.internal.play_billing.zzeh) value) : zzchVar.zzb(((com.google.android.gms.internal.play_billing.zzec) zze2).zzF(), (com.google.android.gms.internal.play_billing.zzec) value).zzf());
    }

    private static boolean zzm(java.util.Map.Entry entry) {
        com.google.android.gms.internal.play_billing.zzch zzchVar = (com.google.android.gms.internal.play_billing.zzch) entry.getKey();
        if (zzchVar.zze() != com.google.android.gms.internal.play_billing.zzfw.MESSAGE) {
            return true;
        }
        if (!zzchVar.zzg()) {
            return zzn(entry.getValue());
        }
        java.util.Iterator it = ((java.util.List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!zzn(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzn(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.play_billing.zzed) {
            return ((com.google.android.gms.internal.play_billing.zzed) obj).zzk();
        }
        if (obj instanceof com.google.android.gms.internal.play_billing.zzdh) {
            return true;
        }
        throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static final int zzo(java.util.Map.Entry entry) {
        int i;
        int zzw;
        int zzw2;
        int zzf;
        int zzw3;
        com.google.android.gms.internal.play_billing.zzch zzchVar = (com.google.android.gms.internal.play_billing.zzch) entry.getKey();
        java.lang.Object value = entry.getValue();
        if (zzchVar.zze() != com.google.android.gms.internal.play_billing.zzfw.MESSAGE || zzchVar.zzg() || zzchVar.zzf()) {
            return zzb(zzchVar, value);
        }
        if (value instanceof com.google.android.gms.internal.play_billing.zzdh) {
            int zza = ((com.google.android.gms.internal.play_billing.zzch) entry.getKey()).zza();
            int zzw4 = com.google.android.gms.internal.play_billing.zzby.zzw(8);
            i = zzw4 + zzw4;
            zzw = com.google.android.gms.internal.play_billing.zzby.zzw(16) + com.google.android.gms.internal.play_billing.zzby.zzw(zza);
            zzw2 = com.google.android.gms.internal.play_billing.zzby.zzw(24);
            zzf = ((com.google.android.gms.internal.play_billing.zzdh) value).zza();
            zzw3 = com.google.android.gms.internal.play_billing.zzby.zzw(zzf);
        } else {
            int zza2 = ((com.google.android.gms.internal.play_billing.zzch) entry.getKey()).zza();
            int zzw5 = com.google.android.gms.internal.play_billing.zzby.zzw(8);
            i = zzw5 + zzw5;
            zzw = com.google.android.gms.internal.play_billing.zzby.zzw(16) + com.google.android.gms.internal.play_billing.zzby.zzw(zza2);
            zzw2 = com.google.android.gms.internal.play_billing.zzby.zzw(24);
            zzf = ((com.google.android.gms.internal.play_billing.zzec) value).zzf();
            zzw3 = com.google.android.gms.internal.play_billing.zzby.zzw(zzf);
        }
        return i + zzw + zzw2 + zzw3 + zzf;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzp(com.google.android.gms.internal.play_billing.zzch zzchVar, java.lang.Object obj) {
        boolean z;
        zzchVar.zzd();
        byte[] bArr = com.google.android.gms.internal.play_billing.zzda.zzd;
        obj.getClass();
        com.google.android.gms.internal.play_billing.zzfv zzfvVar = com.google.android.gms.internal.play_billing.zzfv.DOUBLE;
        com.google.android.gms.internal.play_billing.zzfw zzfwVar = com.google.android.gms.internal.play_billing.zzfw.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof java.lang.Integer;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzchVar.zza()), zzchVar.zzd().zza(), obj.getClass().getName()));
            case LONG:
                z = obj instanceof java.lang.Long;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzchVar.zza()), zzchVar.zzd().zza(), obj.getClass().getName()));
            case FLOAT:
                z = obj instanceof java.lang.Float;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzchVar.zza()), zzchVar.zzd().zza(), obj.getClass().getName()));
            case DOUBLE:
                z = obj instanceof java.lang.Double;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzchVar.zza()), zzchVar.zzd().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z = obj instanceof java.lang.Boolean;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzchVar.zza()), zzchVar.zzd().zza(), obj.getClass().getName()));
            case STRING:
                z = obj instanceof java.lang.String;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzchVar.zza()), zzchVar.zzd().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof com.google.android.gms.internal.play_billing.zzbq) || (obj instanceof byte[])) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzchVar.zza()), zzchVar.zzd().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof java.lang.Integer) || (obj instanceof com.google.android.gms.internal.play_billing.zzcu)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzchVar.zza()), zzchVar.zzd().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof com.google.android.gms.internal.play_billing.zzec) || (obj instanceof com.google.android.gms.internal.play_billing.zzdh)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzchVar.zza()), zzchVar.zzd().zza(), obj.getClass().getName()));
            default:
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzchVar.zza()), zzchVar.zzd().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        com.google.android.gms.internal.play_billing.zzci zzciVar = new com.google.android.gms.internal.play_billing.zzci();
        for (int i = 0; i < this.zza.zzb(); i++) {
            java.util.Map.Entry zzg = this.zza.zzg(i);
            zzciVar.zzi((com.google.android.gms.internal.play_billing.zzch) zzg.getKey(), zzg.getValue());
        }
        for (java.util.Map.Entry entry : this.zza.zzc()) {
            zzciVar.zzi((com.google.android.gms.internal.play_billing.zzch) entry.getKey(), entry.getValue());
        }
        zzciVar.zzd = this.zzd;
        return zzciVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.play_billing.zzci) {
            return this.zza.equals(((com.google.android.gms.internal.play_billing.zzci) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final int zzc() {
        int i = 0;
        for (int i2 = 0; i2 < this.zza.zzb(); i2++) {
            i += zzo(this.zza.zzg(i2));
        }
        java.util.Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            i += zzo((java.util.Map.Entry) it.next());
        }
        return i;
    }

    public final java.lang.Object zze(com.google.android.gms.internal.play_billing.zzch zzchVar) {
        java.lang.Object obj = this.zza.get(zzchVar);
        if (!(obj instanceof com.google.android.gms.internal.play_billing.zzdh)) {
            return obj;
        }
        throw null;
    }

    public final java.util.Iterator zzf() {
        return this.zzd ? new com.google.android.gms.internal.play_billing.zzdg(this.zza.entrySet().iterator()) : this.zza.entrySet().iterator();
    }

    public final void zzg() {
        if (this.zzc) {
            return;
        }
        for (int i = 0; i < this.zza.zzb(); i++) {
            java.util.Map.Entry zzg = this.zza.zzg(i);
            if (zzg.getValue() instanceof com.google.android.gms.internal.play_billing.zzcs) {
                ((com.google.android.gms.internal.play_billing.zzcs) zzg.getValue()).zzr();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzh(com.google.android.gms.internal.play_billing.zzci zzciVar) {
        for (int i = 0; i < zzciVar.zza.zzb(); i++) {
            zzl(zzciVar.zza.zzg(i));
        }
        java.util.Iterator it = zzciVar.zza.zzc().iterator();
        while (it.hasNext()) {
            zzl((java.util.Map.Entry) it.next());
        }
    }

    public final void zzi(com.google.android.gms.internal.play_billing.zzch zzchVar, java.lang.Object obj) {
        if (!zzchVar.zzg()) {
            zzp(zzchVar, obj);
        } else {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll((java.util.List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zzp(zzchVar, arrayList.get(i));
            }
            obj = arrayList;
        }
        if (obj instanceof com.google.android.gms.internal.play_billing.zzdh) {
            this.zzd = true;
        }
        this.zza.put(zzchVar, obj);
    }

    public final boolean zzj() {
        for (int i = 0; i < this.zza.zzb(); i++) {
            if (!zzm(this.zza.zzg(i))) {
                return false;
            }
        }
        java.util.Iterator it = this.zza.zzc().iterator();
        while (it.hasNext()) {
            if (!zzm((java.util.Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    private zzci(boolean z) {
        zzg();
        zzg();
    }
}
