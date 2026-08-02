package com.google.android.libraries.places.widget.internal.photoviewer;

/* loaded from: classes8.dex */
final class zzk extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    public static final /* synthetic */ int zzc = 0;
    int zza;
    final /* synthetic */ com.google.android.libraries.places.widget.internal.photoviewer.zzl zzb;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.google.android.libraries.places.widget.internal.photoviewer.zzk) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.google.android.libraries.places.widget.internal.photoviewer.zzd zzdVar;
        android.widget.ImageView imageView;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        kotlin.ResultKt.throwOnFailure(obj);
        if (i == 0) {
            final com.google.android.libraries.places.widget.internal.photoviewer.zzl zzlVar = this.zzb;
            zzdVar = zzlVar.zze;
            android.widget.ImageView imageView2 = null;
            if (zzdVar == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                zzdVar = null;
            }
            android.net.Uri parse = android.net.Uri.parse(zzdVar.zza());
            com.google.android.libraries.places.internal.zzpt zza = zzlVar.zza();
            if (zza != null) {
                com.google.android.libraries.places.internal.zzpm zze = zza.zze();
                imageView = zzlVar.zzc;
                if (imageView == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                } else {
                    imageView2 = imageView;
                }
                com.google.android.libraries.places.internal.zzpo zzpoVar = new com.google.android.libraries.places.internal.zzpo(imageView2, new kotlin.jvm.functions.Function1() { // from class: com.google.android.libraries.places.widget.internal.photoviewer.zzj
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                        com.google.android.libraries.places.widget.internal.photoviewer.zzl.zzd(com.google.android.libraries.places.widget.internal.photoviewer.zzl.this);
                        return kotlin.Unit.INSTANCE;
                    }
                });
                this.zza = 1;
                if (zze.zza(parse, zzpoVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.google.android.libraries.places.widget.internal.photoviewer.zzk(this.zzb, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzk(com.google.android.libraries.places.widget.internal.photoviewer.zzl zzlVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.zzb = zzlVar;
    }
}
