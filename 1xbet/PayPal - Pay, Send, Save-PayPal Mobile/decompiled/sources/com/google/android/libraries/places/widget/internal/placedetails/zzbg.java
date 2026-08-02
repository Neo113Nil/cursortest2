package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
final class zzbg implements kotlin.jvm.functions.Function1 {
    final /* synthetic */ kotlinx.coroutines.CancellableContinuation zza;

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
        android.net.Uri uri = ((com.google.android.libraries.places.api.net.FetchResolvedPhotoUriResponse) obj).getUri();
        if (uri == null) {
            this.zza.resumeWith(kotlin.Result.m23436constructorimpl(com.google.android.libraries.places.widget.internal.placedetails.zzbp.zza));
        } else {
            this.zza.resumeWith(kotlin.Result.m23436constructorimpl(new com.google.android.libraries.places.widget.internal.placedetails.zzbm(uri)));
        }
        return kotlin.Unit.INSTANCE;
    }

    zzbg(kotlinx.coroutines.CancellableContinuation cancellableContinuation) {
        this.zza = cancellableContinuation;
    }
}
