package com.google.android.gms.internal.p001authapiphone;

/* loaded from: classes8.dex */
final /* synthetic */ class zzn implements com.google.android.gms.common.api.internal.RemoteCall {
    static final /* synthetic */ com.google.android.gms.internal.p001authapiphone.zzn zza = new com.google.android.gms.internal.p001authapiphone.zzn();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = (com.google.android.gms.tasks.TaskCompletionSource) obj2;
        com.google.android.gms.internal.p001authapiphone.zzag zzagVar = (com.google.android.gms.internal.p001authapiphone.zzag) obj;
        int i = com.google.android.gms.internal.p001authapiphone.zzr.zza;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzagVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taskCompletionSource, "");
        ((com.google.android.gms.internal.p001authapiphone.zzh) zzagVar.getService()).zzd(new com.google.android.gms.internal.p001authapiphone.zzq(taskCompletionSource));
    }

    private /* synthetic */ zzn() {
    }
}
