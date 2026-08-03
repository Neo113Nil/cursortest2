package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
final class zzeq {
    private static final com.google.android.gms.internal.auth.zzeq zzb = new com.google.android.gms.internal.auth.zzeq(true);
    final com.google.android.gms.internal.auth.zzgv zza = new com.google.android.gms.internal.auth.zzgl(16);
    private boolean zzc;
    private boolean zzd;

    private zzeq() {
    }

    public static com.google.android.gms.internal.auth.zzeq zza() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzd(com.google.android.gms.internal.auth.zzep zzepVar, java.lang.Object obj) {
        boolean z;
        zzepVar.zzb();
        byte[] bArr = com.google.android.gms.internal.auth.zzfa.zzd;
        obj.getClass();
        com.google.android.gms.internal.auth.zzho zzhoVar = com.google.android.gms.internal.auth.zzho.DOUBLE;
        com.google.android.gms.internal.auth.zzhp zzhpVar = com.google.android.gms.internal.auth.zzhp.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof java.lang.Integer;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzepVar.zza()), zzepVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z = obj instanceof java.lang.Long;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzepVar.zza()), zzepVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z = obj instanceof java.lang.Float;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzepVar.zza()), zzepVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z = obj instanceof java.lang.Double;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzepVar.zza()), zzepVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z = obj instanceof java.lang.Boolean;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzepVar.zza()), zzepVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z = obj instanceof java.lang.String;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzepVar.zza()), zzepVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof com.google.android.gms.internal.auth.zzef) || (obj instanceof byte[])) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzepVar.zza()), zzepVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof java.lang.Integer) || (obj instanceof com.google.android.gms.internal.auth.zzex)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzepVar.zza()), zzepVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof com.google.android.gms.internal.auth.zzfx) || (obj instanceof com.google.android.gms.internal.auth.zzfc)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzepVar.zza()), zzepVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzepVar.zza()), zzepVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        com.google.android.gms.internal.auth.zzeq zzeqVar = new com.google.android.gms.internal.auth.zzeq();
        for (int i = 0; i < this.zza.zzb(); i++) {
            java.util.Map.Entry zzg = this.zza.zzg(i);
            zzeqVar.zzc((com.google.android.gms.internal.auth.zzep) zzg.getKey(), zzg.getValue());
        }
        for (java.util.Map.Entry entry : this.zza.zzc()) {
            zzeqVar.zzc((com.google.android.gms.internal.auth.zzep) entry.getKey(), entry.getValue());
        }
        zzeqVar.zzd = this.zzd;
        return zzeqVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.auth.zzeq) {
            return this.zza.equals(((com.google.android.gms.internal.auth.zzeq) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (this.zzc) {
            return;
        }
        for (int i = 0; i < this.zza.zzb(); i++) {
            java.util.Map.Entry zzg = this.zza.zzg(i);
            if (zzg.getValue() instanceof com.google.android.gms.internal.auth.zzev) {
                ((com.google.android.gms.internal.auth.zzev) zzg.getValue()).zzi();
            }
        }
        this.zza.zza();
        this.zzc = true;
    }

    public final void zzc(com.google.android.gms.internal.auth.zzep zzepVar, java.lang.Object obj) {
        if (!zzepVar.zzc()) {
            zzd(zzepVar, obj);
        } else {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll((java.util.List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zzd(zzepVar, arrayList.get(i));
            }
            obj = arrayList;
        }
        if (obj instanceof com.google.android.gms.internal.auth.zzfc) {
            this.zzd = true;
        }
        this.zza.put(zzepVar, obj);
    }

    private zzeq(boolean z) {
        zzb();
        zzb();
    }
}
