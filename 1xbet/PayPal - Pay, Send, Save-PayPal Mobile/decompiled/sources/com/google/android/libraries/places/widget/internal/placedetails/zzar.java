package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
final class zzar extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    public static final /* synthetic */ int zzg = 0;
    int zza;
    final /* synthetic */ com.google.android.libraries.places.widget.internal.placedetails.zzas zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ com.google.android.libraries.places.widget.internal.placedetails.zzbq zze;
    final /* synthetic */ android.widget.ImageView zzf;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.google.android.libraries.places.widget.internal.placedetails.zzar) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.google.android.libraries.places.internal.zzpt zzptVar;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        kotlin.ResultKt.throwOnFailure(obj);
        if (i == 0) {
            final com.google.android.libraries.places.widget.internal.placedetails.zzas zzasVar = this.zzb;
            zzasVar.zzh(this.zzc, this.zzd);
            zzptVar = zzasVar.zzb;
            if (zzptVar != null) {
                com.google.android.libraries.places.widget.internal.placedetails.zzbq zzbqVar = this.zze;
                com.google.android.libraries.places.internal.zzpm zze = zzptVar.zze();
                android.net.Uri zza = ((com.google.android.libraries.places.widget.internal.placedetails.zzbm) zzbqVar).zza();
                final android.widget.ImageView imageView = this.zzf;
                kotlin.jvm.internal.Intrinsics.checkNotNull(imageView);
                this.zza = 1;
                if (zze.zza(zza, new com.google.android.libraries.places.internal.zzpo(imageView, new kotlin.jvm.functions.Function1() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzaq
                    @Override // kotlin.jvm.functions.Function1
                    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                        com.google.android.libraries.places.widget.internal.placedetails.zzas zzasVar2 = com.google.android.libraries.places.widget.internal.placedetails.zzas.this;
                        android.widget.ImageView imageView2 = imageView;
                        kotlin.jvm.internal.Intrinsics.checkNotNull(imageView2);
                        zzasVar2.zzi(imageView2);
                        return kotlin.Unit.INSTANCE;
                    }
                }), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.google.android.libraries.places.widget.internal.placedetails.zzar(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzar(com.google.android.libraries.places.widget.internal.placedetails.zzas zzasVar, boolean z, int i, com.google.android.libraries.places.widget.internal.placedetails.zzbq zzbqVar, android.widget.ImageView imageView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.zzb = zzasVar;
        this.zzc = z;
        this.zzd = i;
        this.zze = zzbqVar;
        this.zzf = imageView;
    }
}
