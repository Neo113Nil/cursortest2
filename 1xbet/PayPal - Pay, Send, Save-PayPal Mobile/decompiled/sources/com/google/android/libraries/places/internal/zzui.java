package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzui extends com.google.android.libraries.places.internal.zzww implements com.google.android.libraries.places.internal.zzws {
    protected final java.lang.Object[] zza;
    protected final java.lang.StringBuilder zzb;
    private int zzc;

    protected zzui(com.google.android.libraries.places.internal.zzvp zzvpVar, java.lang.Object[] objArr, java.lang.StringBuilder sb) {
        super(zzvpVar);
        this.zzc = 0;
        this.zza = objArr;
        this.zzb = sb;
    }

    public static java.lang.StringBuilder zza(com.google.android.libraries.places.internal.zzun zzunVar, java.lang.StringBuilder sb) {
        if (zzunVar.zzh() == null) {
            sb.append(com.google.android.libraries.places.internal.zzur.zza(zzunVar.zzj()));
            return sb;
        }
        com.google.android.libraries.places.internal.zzui zzuiVar = new com.google.android.libraries.places.internal.zzui(zzunVar.zzh(), zzunVar.zzi(), sb);
        java.lang.StringBuilder sb2 = (java.lang.StringBuilder) zzuiVar.zzl();
        zzunVar.zzi();
        if (zzuiVar.zzj() <= 0) {
            sb2.append(" [ERROR: UNUSED LOG ARGUMENTS]");
        }
        return sb2;
    }

    private static void zzm(java.lang.StringBuilder sb, java.lang.Object obj, java.lang.String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(com.google.android.libraries.places.internal.zzur.zza(obj));
        sb.append("]");
    }

    @Override // com.google.android.libraries.places.internal.zzww
    public final void zzb(int i, int i2, com.google.android.libraries.places.internal.zzwr zzwrVar) {
        zzh().zzd(this.zzb, zzi(), this.zzc, i);
        zzwrVar.zze(this, this.zza);
        this.zzc = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if ((r6 instanceof java.math.BigDecimal) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0037, code lost:
    
        if ((r6 instanceof java.math.BigInteger) == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0059, code lost:
    
        if (r0 == false) goto L41;
     */
    @Override // com.google.android.libraries.places.internal.zzws
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(java.lang.Object obj, com.google.android.libraries.places.internal.zzuj zzujVar, com.google.android.libraries.places.internal.zzuk zzukVar) {
        boolean z;
        int ordinal = zzujVar.zzc().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                z = obj instanceof java.lang.Boolean;
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw null;
                    }
                    if (!(obj instanceof java.lang.Double)) {
                        if (!(obj instanceof java.lang.Float)) {
                        }
                    }
                } else if (!(obj instanceof java.lang.Integer)) {
                    if (!(obj instanceof java.lang.Long)) {
                        if (!(obj instanceof java.lang.Byte)) {
                            if (!(obj instanceof java.lang.Short)) {
                            }
                        }
                    }
                }
            } else if (!(obj instanceof java.lang.Character)) {
                if ((obj instanceof java.lang.Integer) || (obj instanceof java.lang.Byte) || (obj instanceof java.lang.Short)) {
                    z = java.lang.Character.isValidCodePoint(((java.lang.Number) obj).intValue());
                }
                zzm(this.zzb, obj, zzujVar.zze());
                return;
            }
        }
        java.lang.StringBuilder sb = this.zzb;
        int ordinal2 = zzujVar.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    if (ordinal2 != 3) {
                        if (ordinal2 == 5 && zzukVar.zzd(128, false, false).equals(zzukVar)) {
                            com.google.android.libraries.places.internal.zzur.zzc(sb, (java.lang.Number) obj, zzukVar);
                            return;
                        }
                    }
                } else if (zzukVar.zze()) {
                    if (obj instanceof java.lang.Character) {
                        sb.append(obj);
                        return;
                    }
                    int intValue = ((java.lang.Number) obj).intValue();
                    if ((intValue >>> 16) == 0) {
                        sb.append((char) intValue);
                        return;
                    } else {
                        sb.append(java.lang.Character.toChars(intValue));
                        return;
                    }
                }
            }
            if (zzukVar.zze()) {
                sb.append(obj);
                return;
            }
        } else if (obj instanceof java.util.Formattable) {
            com.google.android.libraries.places.internal.zzur.zzb((java.util.Formattable) obj, sb, zzukVar);
            return;
        } else if (zzukVar.zze()) {
            sb.append(com.google.android.libraries.places.internal.zzur.zza(obj));
            return;
        }
        java.lang.String zze = zzujVar.zze();
        if (!zzukVar.zze()) {
            int zzb = zzujVar.zzb();
            if (zzukVar.zzk()) {
                zzb &= 65503;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("%");
            zzukVar.zzl(sb2);
            sb2.append((char) zzb);
            zze = sb2.toString();
        }
        sb.append(java.lang.String.format(com.google.android.libraries.places.internal.zzur.zza, zze, obj));
    }

    @Override // com.google.android.libraries.places.internal.zzws
    public final void zzd(java.lang.Object obj, com.google.android.libraries.places.internal.zzwp zzwpVar, com.google.android.libraries.places.internal.zzuk zzukVar) {
        if ((obj instanceof java.util.Date) || (obj instanceof java.util.Calendar) || (obj instanceof java.lang.Long)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("%");
            zzukVar.zzl(sb);
            sb.append(true != zzukVar.zzk() ? 't' : 'T');
            sb.append(zzwpVar.zzb());
            this.zzb.append(java.lang.String.format(com.google.android.libraries.places.internal.zzur.zza, sb.toString(), obj));
            return;
        }
        java.lang.StringBuilder sb2 = this.zzb;
        char zzb = zzwpVar.zzb();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(java.lang.String.valueOf(zzb).length() + 2);
        sb3.append("%t");
        sb3.append(zzb);
        zzm(sb2, obj, sb3.toString());
    }

    @Override // com.google.android.libraries.places.internal.zzws
    public final void zze() {
        this.zzb.append("[ERROR: MISSING LOG ARGUMENT]");
    }

    @Override // com.google.android.libraries.places.internal.zzws
    public final void zzf() {
        this.zzb.append("null");
    }

    @Override // com.google.android.libraries.places.internal.zzww
    public final /* synthetic */ java.lang.Object zzg() {
        com.google.android.libraries.places.internal.zzwx zzh = zzh();
        java.lang.String zzi = zzi();
        int i = this.zzc;
        int length = zzi().length();
        java.lang.StringBuilder sb = this.zzb;
        zzh.zzd(sb, zzi, i, length);
        return sb;
    }
}
