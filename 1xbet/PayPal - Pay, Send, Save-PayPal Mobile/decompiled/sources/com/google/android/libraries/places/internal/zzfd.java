package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzfd implements com.google.common.util.concurrent.FutureCallback {
    final /* synthetic */ com.google.android.libraries.places.internal.zzfe zza;

    @Override // com.google.common.util.concurrent.FutureCallback
    public final void onFailure(java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
    }

    @Override // com.google.common.util.concurrent.FutureCallback
    public final /* synthetic */ void onSuccess(java.lang.Object obj) {
        com.google.android.libraries.places.internal.zzex zzexVar;
        com.google.android.libraries.places.internal.zzbhg zzbhgVar = (com.google.android.libraries.places.internal.zzbhg) obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zzbhgVar, "");
        java.lang.String zzc = zzbhgVar.zzc();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzc, "");
        if (zzc.length() > 0) {
            zzexVar = this.zza.zzc;
            java.lang.String zzc2 = zzbhgVar.zzc();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(zzc2, "");
            zzexVar.zzb(zzc2);
        }
    }

    zzfd(com.google.android.libraries.places.internal.zzfe zzfeVar) {
        this.zza = zzfeVar;
    }
}
