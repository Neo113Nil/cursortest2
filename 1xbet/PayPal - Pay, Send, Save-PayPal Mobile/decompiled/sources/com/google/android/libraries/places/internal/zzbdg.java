package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbdg {
    private static final com.google.android.libraries.places.internal.zzbdg zzd = new com.google.android.libraries.places.internal.zzbdg(true);
    final com.google.android.libraries.places.internal.zzbfs zza = new com.google.android.libraries.places.internal.zzbfo();
    boolean zzb;
    boolean zzc;

    private zzbdg() {
    }

    public static int zzj(com.google.android.libraries.places.internal.zzbdf zzbdfVar, java.lang.Object obj) {
        int zzz;
        int zzc;
        int zzy;
        com.google.android.libraries.places.internal.zzbgj zzb = zzbdfVar.zzb();
        zzbdfVar.zza();
        zzbdfVar.zzd();
        int zzy2 = com.google.android.libraries.places.internal.zzbcu.zzy(-94933856);
        if (zzb == com.google.android.libraries.places.internal.zzbgj.GROUP) {
            zzy2 += zzy2;
        }
        switch (zzb) {
            case DOUBLE:
                zzz = 8;
                return zzy2 + zzz;
            case FLOAT:
                zzz = 4;
                return zzy2 + zzz;
            case INT64:
                zzz = com.google.android.libraries.places.internal.zzbcu.zzz(((java.lang.Long) obj).longValue());
                return zzy2 + zzz;
            case UINT64:
                zzz = com.google.android.libraries.places.internal.zzbcu.zzz(((java.lang.Long) obj).longValue());
                return zzy2 + zzz;
            case INT32:
                zzz = com.google.android.libraries.places.internal.zzbcu.zzz(((java.lang.Integer) obj).intValue());
                return zzy2 + zzz;
            case FIXED64:
                zzz = 8;
                return zzy2 + zzz;
            case FIXED32:
                zzz = 4;
                return zzy2 + zzz;
            case BOOL:
                zzz = 1;
                return zzy2 + zzz;
            case STRING:
                if (!(obj instanceof com.google.android.libraries.places.internal.zzbcl)) {
                    zzz = com.google.android.libraries.places.internal.zzbcu.zzA((java.lang.String) obj);
                    return zzy2 + zzz;
                }
                zzc = ((com.google.android.libraries.places.internal.zzbcl) obj).zzc();
                zzy = com.google.android.libraries.places.internal.zzbcu.zzy(zzc);
                zzz = zzc + zzy;
                return zzy2 + zzz;
            case GROUP:
                zzz = ((com.google.android.libraries.places.internal.zzbex) obj).zzbx();
                return zzy2 + zzz;
            case MESSAGE:
                if (!(obj instanceof com.google.android.libraries.places.internal.zzbeh)) {
                    zzz = com.google.android.libraries.places.internal.zzbcu.zzB((com.google.android.libraries.places.internal.zzbex) obj);
                    return zzy2 + zzz;
                }
                zzc = ((com.google.android.libraries.places.internal.zzbeh) obj).zzb();
                zzy = com.google.android.libraries.places.internal.zzbcu.zzy(zzc);
                zzz = zzc + zzy;
                return zzy2 + zzz;
            case BYTES:
                if (obj instanceof com.google.android.libraries.places.internal.zzbcl) {
                    zzc = ((com.google.android.libraries.places.internal.zzbcl) obj).zzc();
                    zzy = com.google.android.libraries.places.internal.zzbcu.zzy(zzc);
                } else {
                    zzc = ((byte[]) obj).length;
                    zzy = com.google.android.libraries.places.internal.zzbcu.zzy(zzc);
                }
                zzz = zzc + zzy;
                return zzy2 + zzz;
            case UINT32:
                zzz = com.google.android.libraries.places.internal.zzbcu.zzy(((java.lang.Integer) obj).intValue());
                return zzy2 + zzz;
            case ENUM:
                zzz = obj instanceof com.google.android.libraries.places.internal.zzbdu ? com.google.android.libraries.places.internal.zzbcu.zzz(((com.google.android.libraries.places.internal.zzbdu) obj).zza()) : com.google.android.libraries.places.internal.zzbcu.zzz(((java.lang.Integer) obj).intValue());
                return zzy2 + zzz;
            case SFIXED32:
                zzz = 4;
                return zzy2 + zzz;
            case SFIXED64:
                zzz = 8;
                return zzy2 + zzz;
            case SINT32:
                int intValue = ((java.lang.Integer) obj).intValue();
                zzz = com.google.android.libraries.places.internal.zzbcu.zzy((intValue + intValue) ^ (intValue >> 31));
                return zzy2 + zzz;
            case SINT64:
                long longValue = ((java.lang.Long) obj).longValue();
                zzz = com.google.android.libraries.places.internal.zzbcu.zzz((longValue + longValue) ^ (longValue >> 63));
                return zzy2 + zzz;
            default:
                throw new java.lang.RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    private static boolean zzk(java.util.Map.Entry entry) {
        com.google.android.libraries.places.internal.zzbdf zzbdfVar = (com.google.android.libraries.places.internal.zzbdf) entry.getKey();
        if (zzbdfVar.zzc() != com.google.android.libraries.places.internal.zzbgk.MESSAGE) {
            return true;
        }
        zzbdfVar.zzd();
        java.lang.Object value = entry.getValue();
        if (value instanceof com.google.android.libraries.places.internal.zzbey) {
            return ((com.google.android.libraries.places.internal.zzbey) value).zzbM();
        }
        if (value instanceof com.google.android.libraries.places.internal.zzbeh) {
            return true;
        }
        throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    private static java.lang.Object zzl(java.lang.Object obj) {
        if (obj instanceof com.google.android.libraries.places.internal.zzbfc) {
            return ((com.google.android.libraries.places.internal.zzbfc) obj).zzc();
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

    private final void zzm(java.util.Map.Entry entry) {
        com.google.android.libraries.places.internal.zzbdf zzbdfVar = (com.google.android.libraries.places.internal.zzbdf) entry.getKey();
        java.lang.Object value = entry.getValue();
        boolean z = value instanceof com.google.android.libraries.places.internal.zzbeh;
        zzbdfVar.zzd();
        if (zzbdfVar.zzc() != com.google.android.libraries.places.internal.zzbgk.MESSAGE) {
            if (z) {
                throw new java.lang.IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.put(zzbdfVar, zzl(value));
            return;
        }
        java.lang.Object zze = zze(zzbdfVar);
        if (zze == null) {
            this.zza.put(zzbdfVar, zzl(value));
            if (z) {
                this.zzc = true;
                return;
            }
            return;
        }
        if (z) {
            throw null;
        }
        if (!zzbdfVar.zzf(zze)) {
            zzbdfVar.zzg(zze, value);
            return;
        }
        com.google.android.libraries.places.internal.zzbew zzbJ = ((com.google.android.libraries.places.internal.zzbex) zze).zzbJ();
        zzbdfVar.zzg(zzbJ, value);
        this.zza.put(zzbdfVar, zzbJ.zzG());
    }

    private static final int zzn(java.util.Map.Entry entry) {
        int i;
        int zzy;
        int zzy2;
        com.google.android.libraries.places.internal.zzbdf zzbdfVar = (com.google.android.libraries.places.internal.zzbdf) entry.getKey();
        java.lang.Object value = entry.getValue();
        if (zzbdfVar.zzc() != com.google.android.libraries.places.internal.zzbgk.MESSAGE) {
            return zzj(zzbdfVar, value);
        }
        zzbdfVar.zzd();
        zzbdfVar.zze();
        if (value instanceof com.google.android.libraries.places.internal.zzbeh) {
            ((com.google.android.libraries.places.internal.zzbdf) entry.getKey()).zza();
            int zzy3 = com.google.android.libraries.places.internal.zzbcu.zzy(8);
            i = zzy3 + zzy3;
            zzy = com.google.android.libraries.places.internal.zzbcu.zzy(16) + com.google.android.libraries.places.internal.zzbcu.zzy(525004180);
            int zzy4 = com.google.android.libraries.places.internal.zzbcu.zzy(24);
            int zzb = ((com.google.android.libraries.places.internal.zzbeh) value).zzb();
            zzy2 = zzy4 + com.google.android.libraries.places.internal.zzbcu.zzy(zzb) + zzb;
        } else {
            ((com.google.android.libraries.places.internal.zzbdf) entry.getKey()).zza();
            int zzy5 = com.google.android.libraries.places.internal.zzbcu.zzy(8);
            i = zzy5 + zzy5;
            zzy = com.google.android.libraries.places.internal.zzbcu.zzy(16) + com.google.android.libraries.places.internal.zzbcu.zzy(525004180);
            zzy2 = com.google.android.libraries.places.internal.zzbcu.zzy(24) + com.google.android.libraries.places.internal.zzbcu.zzB((com.google.android.libraries.places.internal.zzbex) value);
        }
        return i + zzy + zzy2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.libraries.places.internal.zzbdg) {
            return this.zza.equals(((com.google.android.libraries.places.internal.zzbdg) obj).zza);
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
        com.google.android.libraries.places.internal.zzbfs zzbfsVar = this.zza;
        int zzc = zzbfsVar.zzc();
        for (int i = 0; i < zzc; i++) {
            java.lang.Object value = zzbfsVar.zzd(i).getValue();
            if (value instanceof com.google.android.libraries.places.internal.zzbdq) {
                ((com.google.android.libraries.places.internal.zzbdq) value).zzbu();
            }
        }
        java.util.Iterator it = zzbfsVar.zze().iterator();
        while (it.hasNext()) {
            java.lang.Object value2 = ((java.util.Map.Entry) it.next()).getValue();
            if (value2 instanceof com.google.android.libraries.places.internal.zzbdq) {
                ((com.google.android.libraries.places.internal.zzbdq) value2).zzbu();
            }
        }
        zzbfsVar.zza();
        this.zzb = true;
    }

    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final com.google.android.libraries.places.internal.zzbdg clone() {
        com.google.android.libraries.places.internal.zzbdg zzbdgVar = new com.google.android.libraries.places.internal.zzbdg();
        com.google.android.libraries.places.internal.zzbfs zzbfsVar = this.zza;
        int zzc = zzbfsVar.zzc();
        for (int i = 0; i < zzc; i++) {
            java.util.Map.Entry zzd2 = zzbfsVar.zzd(i);
            zzbdgVar.zzf((com.google.android.libraries.places.internal.zzbdf) ((com.google.android.libraries.places.internal.zzbfp) zzd2).zza(), zzd2.getValue());
        }
        for (java.util.Map.Entry entry : zzbfsVar.zze()) {
            zzbdgVar.zzf((com.google.android.libraries.places.internal.zzbdf) entry.getKey(), entry.getValue());
        }
        zzbdgVar.zzc = this.zzc;
        return zzbdgVar;
    }

    public final java.util.Iterator zzd() {
        com.google.android.libraries.places.internal.zzbfs zzbfsVar = this.zza;
        return zzbfsVar.isEmpty() ? java.util.Collections.emptyIterator() : this.zzc ? new com.google.android.libraries.places.internal.zzbeg(zzbfsVar.entrySet().iterator()) : zzbfsVar.entrySet().iterator();
    }

    public final java.lang.Object zze(com.google.android.libraries.places.internal.zzbdf zzbdfVar) {
        java.lang.Object obj = this.zza.get(zzbdfVar);
        if (!(obj instanceof com.google.android.libraries.places.internal.zzbeh)) {
            return obj;
        }
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0022, code lost:
    
        if ((r3 instanceof com.google.android.libraries.places.internal.zzbdu) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002b, code lost:
    
        if ((r3 instanceof byte[]) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        if (r0 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if ((r3 instanceof com.google.android.libraries.places.internal.zzbeh) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzf(com.google.android.libraries.places.internal.zzbdf zzbdfVar, java.lang.Object obj) {
        boolean z;
        zzbdfVar.zzd();
        switch (zzbdfVar.zzb().zza()) {
            case INT:
                z = obj instanceof java.lang.Integer;
                break;
            case LONG:
                z = obj instanceof java.lang.Long;
                break;
            case FLOAT:
                z = obj instanceof java.lang.Float;
                break;
            case DOUBLE:
                z = obj instanceof java.lang.Double;
                break;
            case BOOLEAN:
                z = obj instanceof java.lang.Boolean;
                break;
            case STRING:
                z = obj instanceof java.lang.String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof com.google.android.libraries.places.internal.zzbcl)) {
                    break;
                }
                if (obj instanceof com.google.android.libraries.places.internal.zzbeh) {
                    this.zzc = true;
                }
                this.zza.put(zzbdfVar, obj);
                return;
            case ENUM:
                if (!(obj instanceof java.lang.Integer)) {
                    break;
                }
                if (obj instanceof com.google.android.libraries.places.internal.zzbeh) {
                }
                this.zza.put(zzbdfVar, obj);
                return;
            case MESSAGE:
                if (!(obj instanceof com.google.android.libraries.places.internal.zzbex)) {
                    break;
                }
                if (obj instanceof com.google.android.libraries.places.internal.zzbeh) {
                }
                this.zza.put(zzbdfVar, obj);
                return;
            default:
                zzbdfVar.zza();
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", 525004180, zzbdfVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final boolean zzg() {
        com.google.android.libraries.places.internal.zzbfs zzbfsVar = this.zza;
        int zzc = zzbfsVar.zzc();
        for (int i = 0; i < zzc; i++) {
            if (!zzk(zzbfsVar.zzd(i))) {
                return false;
            }
        }
        java.util.Iterator it = zzbfsVar.zze().iterator();
        while (it.hasNext()) {
            if (!zzk((java.util.Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void zzh(com.google.android.libraries.places.internal.zzbdg zzbdgVar) {
        com.google.android.libraries.places.internal.zzbfs zzbfsVar = zzbdgVar.zza;
        int zzc = zzbfsVar.zzc();
        for (int i = 0; i < zzc; i++) {
            zzm(zzbfsVar.zzd(i));
        }
        java.util.Iterator it = zzbfsVar.zze().iterator();
        while (it.hasNext()) {
            zzm((java.util.Map.Entry) it.next());
        }
    }

    public final int zzi() {
        com.google.android.libraries.places.internal.zzbfs zzbfsVar = this.zza;
        int zzc = zzbfsVar.zzc();
        int i = 0;
        for (int i2 = 0; i2 < zzc; i2++) {
            i += zzn(zzbfsVar.zzd(i2));
        }
        java.util.Iterator it = zzbfsVar.zze().iterator();
        while (it.hasNext()) {
            i += zzn((java.util.Map.Entry) it.next());
        }
        return i;
    }

    private zzbdg(boolean z) {
        zzb();
        zzb();
    }

    public static com.google.android.libraries.places.internal.zzbdg zza() {
        return zzd;
    }
}
