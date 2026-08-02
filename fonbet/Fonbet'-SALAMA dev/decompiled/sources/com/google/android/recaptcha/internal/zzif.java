package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.internal.zzif;
import com.google.android.recaptcha.internal.zzig;

/* loaded from: classes.dex */
public abstract class zzif<MessageType extends zzig<MessageType, BuilderType>, BuilderType extends zzif<MessageType, BuilderType>> implements zzlw {
    @Override // 
    public abstract zzif zza();

    public abstract zzif zzb(zzig zzigVar);

    @Override // com.google.android.recaptcha.internal.zzlw
    public final /* bridge */ /* synthetic */ zzlw zzc(zzlx zzlxVar) {
        if (zzac().getClass().isInstance(zzlxVar)) {
            return zzb((zzig) zzlxVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
