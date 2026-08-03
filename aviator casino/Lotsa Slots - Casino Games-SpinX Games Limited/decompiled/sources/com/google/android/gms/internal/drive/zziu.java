package com.google.android.gms.internal.drive;

/* loaded from: classes4.dex */
public abstract class zziu<MessageType extends com.google.android.gms.internal.drive.zzit<MessageType, BuilderType>, BuilderType extends com.google.android.gms.internal.drive.zziu<MessageType, BuilderType>> implements com.google.android.gms.internal.drive.zzlr {
    protected abstract BuilderType zza(MessageType messagetype);

    @Override // 
    /* renamed from: zzbn, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.drive.zzlr
    public final /* synthetic */ com.google.android.gms.internal.drive.zzlr zza(com.google.android.gms.internal.drive.zzlq zzlqVar) {
        if (!zzda().getClass().isInstance(zzlqVar)) {
            throw new java.lang.IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        return zza((com.google.android.gms.internal.drive.zziu<MessageType, BuilderType>) zzlqVar);
    }
}
