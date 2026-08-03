package com.google.android.gms.internal.play_games_inputmapping;

/* compiled from: com.google.android.libraries.play.games:inputmapping@@1.0.0-beta */
/* loaded from: classes4.dex */
public class zzez<MessageType extends com.google.android.gms.internal.play_games_inputmapping.zzfc<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.play_games_inputmapping.zzez<MessageType, BuilderType>> extends com.google.android.gms.internal.play_games_inputmapping.zzdx<MessageType, BuilderType> {
    protected com.google.android.gms.internal.play_games_inputmapping.zzfc zza;
    protected boolean zzb = false;
    private final com.google.android.gms.internal.play_games_inputmapping.zzfc zzc;

    protected zzez(MessageType messagetype) {
        this.zzc = messagetype;
        this.zza = (com.google.android.gms.internal.play_games_inputmapping.zzfc) messagetype.zzf(4, null, null);
    }

    private static final void zza(com.google.android.gms.internal.play_games_inputmapping.zzfc zzfcVar, com.google.android.gms.internal.play_games_inputmapping.zzfc zzfcVar2) {
        com.google.android.gms.internal.play_games_inputmapping.zzgm.zza().zzb(zzfcVar.getClass()).zzc(zzfcVar, zzfcVar2);
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdx
    protected final /* synthetic */ com.google.android.gms.internal.play_games_inputmapping.zzdx zze(com.google.android.gms.internal.play_games_inputmapping.zzdy zzdyVar) {
        zzk((com.google.android.gms.internal.play_games_inputmapping.zzfc) zzdyVar);
        return this;
    }

    protected void zzg() {
        com.google.android.gms.internal.play_games_inputmapping.zzfc zzfcVar = (com.google.android.gms.internal.play_games_inputmapping.zzfc) this.zza.zzf(4, null, null);
        zza(zzfcVar, this.zza);
        this.zza = zzfcVar;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzdx
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.play_games_inputmapping.zzez zzd() {
        com.google.android.gms.internal.play_games_inputmapping.zzez zzezVar = (com.google.android.gms.internal.play_games_inputmapping.zzez) this.zzc.zzf(5, null, null);
        zzezVar.zzk(zzl());
        return zzezVar;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgd
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public MessageType zzl() {
        if (this.zzb) {
            return (MessageType) this.zza;
        }
        com.google.android.gms.internal.play_games_inputmapping.zzfc zzfcVar = this.zza;
        com.google.android.gms.internal.play_games_inputmapping.zzgm.zza().zzb(zzfcVar.getClass()).zzf(zzfcVar);
        this.zzb = true;
        return (MessageType) this.zza;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if (r4 != false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final MessageType zzj() {
        MessageType zzl = zzl();
        boolean booleanValue = java.lang.Boolean.TRUE.booleanValue();
        byte byteValue = ((java.lang.Byte) zzl.zzf(1, null, null)).byteValue();
        if (byteValue != 1) {
            if (byteValue != 0) {
                boolean zzg = com.google.android.gms.internal.play_games_inputmapping.zzgm.zza().zzb(zzl.getClass()).zzg(zzl);
                if (booleanValue) {
                    zzl.zzf(2, true != zzg ? null : zzl, null);
                }
            }
            throw new com.google.android.gms.internal.play_games_inputmapping.zzhc(zzl);
        }
        return zzl;
    }

    public final com.google.android.gms.internal.play_games_inputmapping.zzez zzk(com.google.android.gms.internal.play_games_inputmapping.zzfc zzfcVar) {
        if (this.zzb) {
            zzg();
            this.zzb = false;
        }
        zza(this.zza, zzfcVar);
        return this;
    }

    @Override // com.google.android.gms.internal.play_games_inputmapping.zzgf
    public final /* synthetic */ com.google.android.gms.internal.play_games_inputmapping.zzge zzm() {
        return this.zzc;
    }
}
