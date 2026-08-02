package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
final class zzbh implements com.google.android.gms.tasks.OnFailureListener {
    final /* synthetic */ kotlinx.coroutines.CancellableContinuation zza;

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(java.lang.Exception exc) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exc, "");
        exc.printStackTrace();
        kotlin.Unit unit = kotlin.Unit.INSTANCE;
        this.zza.resumeWith(kotlin.Result.m23436constructorimpl(com.google.android.libraries.places.widget.internal.placedetails.zzbl.zza));
    }

    zzbh(kotlinx.coroutines.CancellableContinuation cancellableContinuation) {
        this.zza = cancellableContinuation;
    }
}
