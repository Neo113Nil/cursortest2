package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzkm;
import com.google.android.recaptcha.internal.zzks;

/* loaded from: classes.dex */
public class zzkm<MessageType extends zzks<MessageType, BuilderType>, BuilderType extends zzkm<MessageType, BuilderType>> extends zzif<MessageType, BuilderType> {
    protected zzks zza;
    private final zzks zzb;

    public zzkm(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzI()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = messagetype.zzt();
    }

    private static void zzd(Object obj, Object obj2) {
        zzmg.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.recaptcha.internal.zzly
    public final /* synthetic */ zzlx zzac() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzif
    public final /* synthetic */ zzif zzb(zzig zzigVar) {
        zzg((zzks) zzigVar);
        return this;
    }

    @Override // com.google.android.recaptcha.internal.zzif
    /* renamed from: zzf, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final zzkm zza() {
        zzkm zzkmVar = (zzkm) this.zzb.zzh(5, null, null);
        zzkmVar.zza = zzk();
        return zzkmVar;
    }

    public final zzkm zzg(zzks zzksVar) {
        if (!this.zzb.equals(zzksVar)) {
            if (!this.zza.zzI()) {
                zzn();
            }
            zzd(this.zza, zzksVar);
        }
        return this;
    }

    @Override // com.google.android.recaptcha.internal.zzlw
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final MessageType zzj() {
        MessageType zzk = zzk();
        if (zzk.zzo()) {
            return zzk;
        }
        throw new zzna(zzk);
    }

    @Override // com.google.android.recaptcha.internal.zzlw
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public MessageType zzk() {
        if (!this.zza.zzI()) {
            return (MessageType) this.zza;
        }
        this.zza.zzD();
        return (MessageType) this.zza;
    }

    public final void zzm() {
        if (this.zza.zzI()) {
            return;
        }
        zzn();
    }

    public void zzn() {
        zzks zzt = this.zzb.zzt();
        zzd(zzt, this.zza);
        this.zza = zzt;
    }

    @Override // com.google.android.recaptcha.internal.zzly
    public final boolean zzo() {
        return zzks.zzH(this.zza, false);
    }
}
