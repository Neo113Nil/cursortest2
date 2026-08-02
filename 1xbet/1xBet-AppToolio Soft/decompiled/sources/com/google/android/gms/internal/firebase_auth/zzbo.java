package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzbn;
import com.google.android.gms.internal.firebase_auth.zzbo;

/* loaded from: classes.dex */
public abstract class zzbo<MessageType extends zzbn<MessageType, BuilderType>, BuilderType extends zzbo<MessageType, BuilderType>> implements zzei {
    protected abstract BuilderType zza(MessageType messagetype);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.firebase_auth.zzei
    public final /* synthetic */ zzei zza(zzeh zzehVar) {
        if (zzeb().getClass().isInstance(zzehVar)) {
            return zza((zzbo<MessageType, BuilderType>) zzehVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    @Override // 
    /* renamed from: zzbq, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();
}
