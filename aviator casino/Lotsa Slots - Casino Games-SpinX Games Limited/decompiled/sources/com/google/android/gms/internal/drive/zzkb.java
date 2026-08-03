package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
final class zzkb<FieldDescriptorType extends com.google.android.gms.internal.drive.zzkd<FieldDescriptorType>> {
    private static final com.google.android.gms.internal.drive.zzkb zzov = new com.google.android.gms.internal.drive.zzkb(true);
    private boolean zzot;
    private boolean zzou = false;
    final com.google.android.gms.internal.drive.zzmi<FieldDescriptorType, java.lang.Object> zzos = com.google.android.gms.internal.drive.zzmi.zzav(16);

    private zzkb() {
    }

    private zzkb(boolean z) {
        zzbp();
    }

    public static <T extends com.google.android.gms.internal.drive.zzkd<T>> com.google.android.gms.internal.drive.zzkb<T> zzcn() {
        return zzov;
    }

    public final void zzbp() {
        if (this.zzot) {
            return;
        }
        this.zzos.zzbp();
        this.zzot = true;
    }

    public final boolean isImmutable() {
        return this.zzot;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.drive.zzkb) {
            return this.zzos.equals(((com.google.android.gms.internal.drive.zzkb) obj).zzos);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzos.hashCode();
    }

    public final java.util.Iterator<java.util.Map.Entry<FieldDescriptorType, java.lang.Object>> iterator() {
        if (this.zzou) {
            return new com.google.android.gms.internal.drive.zzkw(this.zzos.entrySet().iterator());
        }
        return this.zzos.entrySet().iterator();
    }

    final java.util.Iterator<java.util.Map.Entry<FieldDescriptorType, java.lang.Object>> descendingIterator() {
        if (this.zzou) {
            return new com.google.android.gms.internal.drive.zzkw(this.zzos.zzet().iterator());
        }
        return this.zzos.zzet().iterator();
    }

    private final java.lang.Object zza(FieldDescriptorType fielddescriptortype) {
        java.lang.Object obj = this.zzos.get(fielddescriptortype);
        return obj instanceof com.google.android.gms.internal.drive.zzkt ? com.google.android.gms.internal.drive.zzkt.zzdp() : obj;
    }

    private final void zza(FieldDescriptorType fielddescriptortype, java.lang.Object obj) {
        if (fielddescriptortype.zzcs()) {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll((java.util.List) obj);
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                java.lang.Object obj2 = arrayList.get(i);
                i++;
                zza(fielddescriptortype.zzcq(), obj2);
            }
            obj = arrayList;
        } else {
            zza(fielddescriptortype.zzcq(), obj);
        }
        if (obj instanceof com.google.android.gms.internal.drive.zzkt) {
            this.zzou = true;
        }
        this.zzos.zza((com.google.android.gms.internal.drive.zzmi<FieldDescriptorType, java.lang.Object>) fielddescriptortype, (FieldDescriptorType) obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zza(com.google.android.gms.internal.drive.zznm zznmVar, java.lang.Object obj) {
        boolean z;
        com.google.android.gms.internal.drive.zzkm.checkNotNull(obj);
        switch (com.google.android.gms.internal.drive.zzkc.zzow[zznmVar.zzfj().ordinal()]) {
            case 1:
                z = obj instanceof java.lang.Integer;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 2:
                z = obj instanceof java.lang.Long;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 3:
                z = obj instanceof java.lang.Float;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 4:
                z = obj instanceof java.lang.Double;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 5:
                z = obj instanceof java.lang.Boolean;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 6:
                z = obj instanceof java.lang.String;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 7:
                if ((obj instanceof com.google.android.gms.internal.drive.zzjc) || (obj instanceof byte[])) {
                    return;
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 8:
                if ((obj instanceof java.lang.Integer) || (obj instanceof com.google.android.gms.internal.drive.zzkn)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            case 9:
                if ((obj instanceof com.google.android.gms.internal.drive.zzlq) || (obj instanceof com.google.android.gms.internal.drive.zzkt)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            default:
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    public final boolean isInitialized() {
        for (int i = 0; i < this.zzos.zzer(); i++) {
            if (!zzb(this.zzos.zzaw(i))) {
                return false;
            }
        }
        java.util.Iterator<java.util.Map.Entry<FieldDescriptorType, java.lang.Object>> it = this.zzos.zzes().iterator();
        while (it.hasNext()) {
            if (!zzb(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean zzb(java.util.Map.Entry<FieldDescriptorType, java.lang.Object> entry) {
        FieldDescriptorType key = entry.getKey();
        if (key.zzcr() == com.google.android.gms.internal.drive.zznr.MESSAGE) {
            if (key.zzcs()) {
                java.util.Iterator it = ((java.util.List) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (!((com.google.android.gms.internal.drive.zzlq) it.next()).isInitialized()) {
                        return false;
                    }
                }
            } else {
                java.lang.Object value = entry.getValue();
                if (value instanceof com.google.android.gms.internal.drive.zzlq) {
                    if (!((com.google.android.gms.internal.drive.zzlq) value).isInitialized()) {
                        return false;
                    }
                } else {
                    if (value instanceof com.google.android.gms.internal.drive.zzkt) {
                        return true;
                    }
                    throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
                }
            }
        }
        return true;
    }

    public final void zza(com.google.android.gms.internal.drive.zzkb<FieldDescriptorType> zzkbVar) {
        for (int i = 0; i < zzkbVar.zzos.zzer(); i++) {
            zzc(zzkbVar.zzos.zzaw(i));
        }
        java.util.Iterator<java.util.Map.Entry<FieldDescriptorType, java.lang.Object>> it = zzkbVar.zzos.zzes().iterator();
        while (it.hasNext()) {
            zzc(it.next());
        }
    }

    private static java.lang.Object zze(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.drive.zzlx) {
            return ((com.google.android.gms.internal.drive.zzlx) obj).zzef();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final void zzc(java.util.Map.Entry<FieldDescriptorType, java.lang.Object> entry) {
        com.google.android.gms.internal.drive.zzlq zzdf;
        FieldDescriptorType key = entry.getKey();
        java.lang.Object value = entry.getValue();
        if (value instanceof com.google.android.gms.internal.drive.zzkt) {
            value = com.google.android.gms.internal.drive.zzkt.zzdp();
        }
        if (key.zzcs()) {
            java.lang.Object zza = zza((com.google.android.gms.internal.drive.zzkb<FieldDescriptorType>) key);
            if (zza == null) {
                zza = new java.util.ArrayList();
            }
            java.util.Iterator it = ((java.util.List) value).iterator();
            while (it.hasNext()) {
                ((java.util.List) zza).add(zze(it.next()));
            }
            this.zzos.zza((com.google.android.gms.internal.drive.zzmi<FieldDescriptorType, java.lang.Object>) key, (FieldDescriptorType) zza);
            return;
        }
        if (key.zzcr() == com.google.android.gms.internal.drive.zznr.MESSAGE) {
            java.lang.Object zza2 = zza((com.google.android.gms.internal.drive.zzkb<FieldDescriptorType>) key);
            if (zza2 == null) {
                this.zzos.zza((com.google.android.gms.internal.drive.zzmi<FieldDescriptorType, java.lang.Object>) key, (FieldDescriptorType) zze(value));
                return;
            }
            if (zza2 instanceof com.google.android.gms.internal.drive.zzlx) {
                zzdf = key.zza((com.google.android.gms.internal.drive.zzlx) zza2, (com.google.android.gms.internal.drive.zzlx) value);
            } else {
                zzdf = key.zza(((com.google.android.gms.internal.drive.zzlq) zza2).zzcy(), (com.google.android.gms.internal.drive.zzlq) value).zzdf();
            }
            this.zzos.zza((com.google.android.gms.internal.drive.zzmi<FieldDescriptorType, java.lang.Object>) key, (FieldDescriptorType) zzdf);
            return;
        }
        this.zzos.zza((com.google.android.gms.internal.drive.zzmi<FieldDescriptorType, java.lang.Object>) key, (FieldDescriptorType) zze(value));
    }

    static void zza(com.google.android.gms.internal.drive.zzjr zzjrVar, com.google.android.gms.internal.drive.zznm zznmVar, int i, java.lang.Object obj) throws java.io.IOException {
        if (zznmVar == com.google.android.gms.internal.drive.zznm.zzxd) {
            com.google.android.gms.internal.drive.zzlq zzlqVar = (com.google.android.gms.internal.drive.zzlq) obj;
            com.google.android.gms.internal.drive.zzkm.zzf(zzlqVar);
            zzjrVar.zzb(i, 3);
            zzlqVar.zzb(zzjrVar);
            zzjrVar.zzb(i, 4);
        }
        zzjrVar.zzb(i, zznmVar.zzfk());
        switch (com.google.android.gms.internal.drive.zzkc.zzox[zznmVar.ordinal()]) {
            case 1:
                zzjrVar.zza(((java.lang.Double) obj).doubleValue());
                break;
            case 2:
                zzjrVar.zza(((java.lang.Float) obj).floatValue());
                break;
            case 3:
                zzjrVar.zzl(((java.lang.Long) obj).longValue());
                break;
            case 4:
                zzjrVar.zzl(((java.lang.Long) obj).longValue());
                break;
            case 5:
                zzjrVar.zzx(((java.lang.Integer) obj).intValue());
                break;
            case 6:
                zzjrVar.zzn(((java.lang.Long) obj).longValue());
                break;
            case 7:
                zzjrVar.zzaa(((java.lang.Integer) obj).intValue());
                break;
            case 8:
                zzjrVar.zzc(((java.lang.Boolean) obj).booleanValue());
                break;
            case 9:
                ((com.google.android.gms.internal.drive.zzlq) obj).zzb(zzjrVar);
                break;
            case 10:
                zzjrVar.zzb((com.google.android.gms.internal.drive.zzlq) obj);
                break;
            case 11:
                if (obj instanceof com.google.android.gms.internal.drive.zzjc) {
                    zzjrVar.zza((com.google.android.gms.internal.drive.zzjc) obj);
                    break;
                } else {
                    zzjrVar.zzl((java.lang.String) obj);
                    break;
                }
            case 12:
                if (obj instanceof com.google.android.gms.internal.drive.zzjc) {
                    zzjrVar.zza((com.google.android.gms.internal.drive.zzjc) obj);
                    break;
                } else {
                    byte[] bArr = (byte[]) obj;
                    zzjrVar.zzd(bArr, 0, bArr.length);
                    break;
                }
            case 13:
                zzjrVar.zzy(((java.lang.Integer) obj).intValue());
                break;
            case 14:
                zzjrVar.zzaa(((java.lang.Integer) obj).intValue());
                break;
            case 15:
                zzjrVar.zzn(((java.lang.Long) obj).longValue());
                break;
            case 16:
                zzjrVar.zzz(((java.lang.Integer) obj).intValue());
                break;
            case 17:
                zzjrVar.zzm(((java.lang.Long) obj).longValue());
                break;
            case 18:
                if (obj instanceof com.google.android.gms.internal.drive.zzkn) {
                    zzjrVar.zzx(((com.google.android.gms.internal.drive.zzkn) obj).zzcp());
                    break;
                } else {
                    zzjrVar.zzx(((java.lang.Integer) obj).intValue());
                    break;
                }
        }
    }

    public final int zzco() {
        int i = 0;
        for (int i2 = 0; i2 < this.zzos.zzer(); i2++) {
            i += zzd(this.zzos.zzaw(i2));
        }
        java.util.Iterator<java.util.Map.Entry<FieldDescriptorType, java.lang.Object>> it = this.zzos.zzes().iterator();
        while (it.hasNext()) {
            i += zzd(it.next());
        }
        return i;
    }

    private static int zzd(java.util.Map.Entry<FieldDescriptorType, java.lang.Object> entry) {
        FieldDescriptorType key = entry.getKey();
        java.lang.Object value = entry.getValue();
        if (key.zzcr() == com.google.android.gms.internal.drive.zznr.MESSAGE && !key.zzcs() && !key.zzct()) {
            if (value instanceof com.google.android.gms.internal.drive.zzkt) {
                return com.google.android.gms.internal.drive.zzjr.zzb(entry.getKey().zzcp(), (com.google.android.gms.internal.drive.zzkt) value);
            }
            return com.google.android.gms.internal.drive.zzjr.zzb(entry.getKey().zzcp(), (com.google.android.gms.internal.drive.zzlq) value);
        }
        return zzb((com.google.android.gms.internal.drive.zzkd<?>) key, value);
    }

    static int zza(com.google.android.gms.internal.drive.zznm zznmVar, int i, java.lang.Object obj) {
        int zzab = com.google.android.gms.internal.drive.zzjr.zzab(i);
        if (zznmVar == com.google.android.gms.internal.drive.zznm.zzxd) {
            com.google.android.gms.internal.drive.zzkm.zzf((com.google.android.gms.internal.drive.zzlq) obj);
            zzab <<= 1;
        }
        return zzab + zzb(zznmVar, obj);
    }

    private static int zzb(com.google.android.gms.internal.drive.zznm zznmVar, java.lang.Object obj) {
        switch (com.google.android.gms.internal.drive.zzkc.zzox[zznmVar.ordinal()]) {
            case 1:
                return com.google.android.gms.internal.drive.zzjr.zzb(((java.lang.Double) obj).doubleValue());
            case 2:
                return com.google.android.gms.internal.drive.zzjr.zzb(((java.lang.Float) obj).floatValue());
            case 3:
                return com.google.android.gms.internal.drive.zzjr.zzo(((java.lang.Long) obj).longValue());
            case 4:
                return com.google.android.gms.internal.drive.zzjr.zzp(((java.lang.Long) obj).longValue());
            case 5:
                return com.google.android.gms.internal.drive.zzjr.zzac(((java.lang.Integer) obj).intValue());
            case 6:
                return com.google.android.gms.internal.drive.zzjr.zzr(((java.lang.Long) obj).longValue());
            case 7:
                return com.google.android.gms.internal.drive.zzjr.zzaf(((java.lang.Integer) obj).intValue());
            case 8:
                return com.google.android.gms.internal.drive.zzjr.zzd(((java.lang.Boolean) obj).booleanValue());
            case 9:
                return com.google.android.gms.internal.drive.zzjr.zzd((com.google.android.gms.internal.drive.zzlq) obj);
            case 10:
                if (obj instanceof com.google.android.gms.internal.drive.zzkt) {
                    return com.google.android.gms.internal.drive.zzjr.zza((com.google.android.gms.internal.drive.zzkt) obj);
                }
                return com.google.android.gms.internal.drive.zzjr.zzc((com.google.android.gms.internal.drive.zzlq) obj);
            case 11:
                if (obj instanceof com.google.android.gms.internal.drive.zzjc) {
                    return com.google.android.gms.internal.drive.zzjr.zzb((com.google.android.gms.internal.drive.zzjc) obj);
                }
                return com.google.android.gms.internal.drive.zzjr.zzm((java.lang.String) obj);
            case 12:
                if (obj instanceof com.google.android.gms.internal.drive.zzjc) {
                    return com.google.android.gms.internal.drive.zzjr.zzb((com.google.android.gms.internal.drive.zzjc) obj);
                }
                return com.google.android.gms.internal.drive.zzjr.zzc((byte[]) obj);
            case 13:
                return com.google.android.gms.internal.drive.zzjr.zzad(((java.lang.Integer) obj).intValue());
            case 14:
                return com.google.android.gms.internal.drive.zzjr.zzag(((java.lang.Integer) obj).intValue());
            case 15:
                return com.google.android.gms.internal.drive.zzjr.zzs(((java.lang.Long) obj).longValue());
            case 16:
                return com.google.android.gms.internal.drive.zzjr.zzae(((java.lang.Integer) obj).intValue());
            case 17:
                return com.google.android.gms.internal.drive.zzjr.zzq(((java.lang.Long) obj).longValue());
            case 18:
                if (obj instanceof com.google.android.gms.internal.drive.zzkn) {
                    return com.google.android.gms.internal.drive.zzjr.zzah(((com.google.android.gms.internal.drive.zzkn) obj).zzcp());
                }
                return com.google.android.gms.internal.drive.zzjr.zzah(((java.lang.Integer) obj).intValue());
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zzb(com.google.android.gms.internal.drive.zzkd<?> zzkdVar, java.lang.Object obj) {
        com.google.android.gms.internal.drive.zznm zzcq = zzkdVar.zzcq();
        int zzcp = zzkdVar.zzcp();
        if (zzkdVar.zzcs()) {
            int i = 0;
            if (zzkdVar.zzct()) {
                java.util.Iterator it = ((java.util.List) obj).iterator();
                while (it.hasNext()) {
                    i += zzb(zzcq, it.next());
                }
                return com.google.android.gms.internal.drive.zzjr.zzab(zzcp) + i + com.google.android.gms.internal.drive.zzjr.zzaj(i);
            }
            java.util.Iterator it2 = ((java.util.List) obj).iterator();
            while (it2.hasNext()) {
                i += zza(zzcq, zzcp, it2.next());
            }
            return i;
        }
        return zza(zzcq, zzcp, obj);
    }

    public final /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        com.google.android.gms.internal.drive.zzkb zzkbVar = new com.google.android.gms.internal.drive.zzkb();
        for (int i = 0; i < this.zzos.zzer(); i++) {
            java.util.Map.Entry<FieldDescriptorType, java.lang.Object> zzaw = this.zzos.zzaw(i);
            zzkbVar.zza((com.google.android.gms.internal.drive.zzkb) zzaw.getKey(), zzaw.getValue());
        }
        for (java.util.Map.Entry<FieldDescriptorType, java.lang.Object> entry : this.zzos.zzes()) {
            zzkbVar.zza((com.google.android.gms.internal.drive.zzkb) entry.getKey(), entry.getValue());
        }
        zzkbVar.zzou = this.zzou;
        return zzkbVar;
    }
}
