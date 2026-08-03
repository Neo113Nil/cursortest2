package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
final class zzew {
    private static final com.google.android.gms.internal.play_games_inputmapping.zzew zzd = new com.google.android.gms.internal.play_games_inputmapping.zzew(true);
    final com.google.android.gms.internal.play_games_inputmapping.zzgz zza = new com.google.android.gms.internal.play_games_inputmapping.zzgs(16);
    private boolean zzb;
    private boolean zzc;

    private zzew() {
    }

    public static com.google.android.gms.internal.play_games_inputmapping.zzew zza() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void zzd(com.google.android.gms.internal.play_games_inputmapping.zzev zzevVar, java.lang.Object obj) {
        boolean z;
        zzevVar.zzb();
        com.google.android.gms.internal.play_games_inputmapping.zzfi.zza(obj);
        com.google.android.gms.internal.play_games_inputmapping.zzhs zzhsVar = com.google.android.gms.internal.play_games_inputmapping.zzhs.DOUBLE;
        com.google.android.gms.internal.play_games_inputmapping.zzht zzhtVar = com.google.android.gms.internal.play_games_inputmapping.zzht.INT;
        switch (r0.zza()) {
            case INT:
                z = obj instanceof java.lang.Integer;
                if (z) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzevVar.zza()), zzevVar.zzb().zza(), obj.getClass().getName()));
            case LONG:
                z = obj instanceof java.lang.Long;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzevVar.zza()), zzevVar.zzb().zza(), obj.getClass().getName()));
            case FLOAT:
                z = obj instanceof java.lang.Float;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzevVar.zza()), zzevVar.zzb().zza(), obj.getClass().getName()));
            case DOUBLE:
                z = obj instanceof java.lang.Double;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzevVar.zza()), zzevVar.zzb().zza(), obj.getClass().getName()));
            case BOOLEAN:
                z = obj instanceof java.lang.Boolean;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzevVar.zza()), zzevVar.zzb().zza(), obj.getClass().getName()));
            case STRING:
                z = obj instanceof java.lang.String;
                if (z) {
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzevVar.zza()), zzevVar.zzb().zza(), obj.getClass().getName()));
            case BYTE_STRING:
                if ((obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzek) || (obj instanceof byte[])) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzevVar.zza()), zzevVar.zzb().zza(), obj.getClass().getName()));
            case ENUM:
                if ((obj instanceof java.lang.Integer) || (obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzfe)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzevVar.zza()), zzevVar.zzb().zza(), obj.getClass().getName()));
            case MESSAGE:
                if ((obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzge) || (obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzfm)) {
                    return;
                }
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzevVar.zza()), zzevVar.zzb().zza(), obj.getClass().getName()));
            default:
                throw new java.lang.IllegalArgumentException(java.lang.String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", java.lang.Integer.valueOf(zzevVar.zza()), zzevVar.zzb().zza(), obj.getClass().getName()));
        }
    }

    public final /* bridge */ /* synthetic */ java.lang.Object clone() throws java.lang.CloneNotSupportedException {
        com.google.android.gms.internal.play_games_inputmapping.zzew zzewVar = new com.google.android.gms.internal.play_games_inputmapping.zzew();
        for (int i = 0; i < this.zza.zzc(); i++) {
            java.util.Map.Entry zzd2 = this.zza.zzd(i);
            zzewVar.zzc((com.google.android.gms.internal.play_games_inputmapping.zzev) zzd2.getKey(), zzd2.getValue());
        }
        for (java.util.Map.Entry entry : this.zza.zze()) {
            zzewVar.zzc((com.google.android.gms.internal.play_games_inputmapping.zzev) entry.getKey(), entry.getValue());
        }
        zzewVar.zzc = this.zzc;
        return zzewVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzew) {
            return this.zza.equals(((com.google.android.gms.internal.play_games_inputmapping.zzew) obj).zza);
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
        this.zza.zza();
        this.zzb = true;
    }

    public final void zzc(com.google.android.gms.internal.play_games_inputmapping.zzev zzevVar, java.lang.Object obj) {
        if (!zzevVar.zzc()) {
            zzd(zzevVar, obj);
        } else {
            if (!(obj instanceof java.util.List)) {
                throw new java.lang.IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll((java.util.List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zzd(zzevVar, arrayList.get(i));
            }
            obj = arrayList;
        }
        if (obj instanceof com.google.android.gms.internal.play_games_inputmapping.zzfm) {
            this.zzc = true;
        }
        this.zza.put(zzevVar, obj);
    }

    private zzew(boolean z) {
        zzb();
        zzb();
    }
}
