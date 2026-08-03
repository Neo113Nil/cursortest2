package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public final class zzav extends com.google.android.gms.internal.play_games_inputmapping.zzdn implements com.google.android.gms.internal.play_games_inputmapping.zzdj {
    protected final java.lang.Object[] zza;
    protected final java.lang.StringBuilder zzb;
    private int zzc;

    protected zzav(com.google.android.gms.internal.play_games_inputmapping.zzcf zzcfVar, java.lang.Object[] objArr, java.lang.StringBuilder sb) {
        super(zzcfVar);
        this.zzc = 0;
        this.zza = (java.lang.Object[]) com.google.android.gms.internal.play_games_inputmapping.zzds.zza(objArr, "arguments");
        this.zzb = sb;
    }

    public static java.lang.StringBuilder zza(com.google.android.gms.internal.play_games_inputmapping.zzba zzbaVar, java.lang.StringBuilder sb) {
        java.lang.Object obj;
        if (zzbaVar.zzh() != null) {
            com.google.android.gms.internal.play_games_inputmapping.zzav zzavVar = new com.google.android.gms.internal.play_games_inputmapping.zzav(zzbaVar.zzh(), zzbaVar.zzi(), sb);
            java.lang.Object zzl = zzavVar.zzl();
            int length = zzbaVar.zzi().length;
            obj = zzl;
            if (zzavVar.zzj() <= 0) {
                java.lang.StringBuilder sb2 = (java.lang.StringBuilder) zzl;
                sb2.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                return sb2;
            }
        } else {
            sb.append(com.google.android.gms.internal.play_games_inputmapping.zzbe.zza(zzbaVar.zzj()));
            obj = sb;
        }
        return (java.lang.StringBuilder) obj;
    }

    private static void zzm(java.lang.StringBuilder sb, java.lang.Object obj, java.lang.String str) {
        sb.append("[INVALID: format=");
        sb.append(str);
        sb.append(", type=");
        sb.append(obj.getClass().getCanonicalName());
        sb.append(", value=");
        sb.append(com.google.android.gms.internal.play_games_inputmapping.zzbe.zza(obj));
        sb.append(com.ironsource.X3.j.e);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdn
    public final void zzb(int i, int i2, com.google.android.gms.internal.play_games_inputmapping.zzdi zzdiVar) {
        zzh().zzb(this.zzb, zzi(), this.zzc, i);
        zzdiVar.zze(this, this.zza);
        this.zzc = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if ((r7 instanceof java.math.BigDecimal) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0037, code lost:
    
        if ((r7 instanceof java.math.BigInteger) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0059, code lost:
    
        if (r0 != false) goto L44;
     */
    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(java.lang.Object obj, com.google.android.gms.internal.play_games_inputmapping.zzaw zzawVar, com.google.android.gms.internal.play_games_inputmapping.zzax zzaxVar) {
        boolean z;
        int ordinal = zzawVar.zzc().ordinal();
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
                zzm(this.zzb, obj, zzawVar.zze());
                return;
            }
        }
        java.lang.StringBuilder sb = this.zzb;
        int ordinal2 = zzawVar.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    if (ordinal2 != 3) {
                        if (ordinal2 == 5 && zzaxVar.zzd(128, false, false).equals(zzaxVar)) {
                            com.google.android.gms.internal.play_games_inputmapping.zzbe.zzc(sb, (java.lang.Number) obj, zzaxVar);
                            return;
                        }
                    }
                } else if (zzaxVar.zze()) {
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
            if (zzaxVar.zze()) {
                sb.append(obj);
                return;
            }
        } else if (obj instanceof java.util.Formattable) {
            com.google.android.gms.internal.play_games_inputmapping.zzbe.zzb((java.util.Formattable) obj, sb, zzaxVar);
            return;
        } else if (zzaxVar.zze()) {
            sb.append(com.google.android.gms.internal.play_games_inputmapping.zzbe.zza(obj));
            return;
        }
        java.lang.String zze = zzawVar.zze();
        if (!zzaxVar.zze()) {
            int zzb = zzawVar.zzb();
            if (zzaxVar.zzk()) {
                zzb &= 65503;
            }
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("%");
            zzaxVar.zzl(sb2);
            sb2.append((char) zzb);
            zze = sb2.toString();
        }
        sb.append(java.lang.String.format(com.google.android.gms.internal.play_games_inputmapping.zzbe.zza, zze, obj));
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdj
    public final void zzd(java.lang.Object obj, com.google.android.gms.internal.play_games_inputmapping.zzdg zzdgVar, com.google.android.gms.internal.play_games_inputmapping.zzax zzaxVar) {
        if ((obj instanceof java.util.Date) || (obj instanceof java.util.Calendar) || (obj instanceof java.lang.Long)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("%");
            zzaxVar.zzl(sb);
            sb.append(true != zzaxVar.zzk() ? 't' : 'T');
            sb.append(zzdgVar.zzb());
            this.zzb.append(java.lang.String.format(com.google.android.gms.internal.play_games_inputmapping.zzbe.zza, sb.toString(), obj));
            return;
        }
        java.lang.StringBuilder sb2 = this.zzb;
        char zzb = zzdgVar.zzb();
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(3);
        sb3.append("%t");
        sb3.append(zzb);
        zzm(sb2, obj, sb3.toString());
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdj
    public final void zze() {
        this.zzb.append("[ERROR: MISSING LOG ARGUMENT]");
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdj
    public final void zzf() {
        this.zzb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdn
    public final /* bridge */ /* synthetic */ java.lang.Object zzg() {
        zzh().zzb(this.zzb, zzi(), this.zzc, zzi().length());
        return this.zzb;
    }
}
