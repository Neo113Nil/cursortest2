package com.google.android.libraries.places.widget.internal.placedetails;

/* loaded from: classes8.dex */
final class zzch extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2 {
    public static final /* synthetic */ int zzf = 0;
    int zza;
    final /* synthetic */ com.google.android.libraries.places.widget.internal.placedetails.zzci zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ com.google.android.libraries.places.widget.internal.placedetails.zzcf zzd;
    final /* synthetic */ android.graphics.drawable.Drawable zze;

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.google.android.libraries.places.widget.internal.placedetails.zzch) create((kotlinx.coroutines.CoroutineScope) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000b, code lost:
    
        r8 = r7.zzb.zzg;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.google.android.libraries.places.internal.zzpm zzpmVar;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.zza;
        kotlin.ResultKt.throwOnFailure(obj);
        if (i == 0 && zzpmVar != null) {
            java.lang.String str = this.zzc;
            final com.google.android.libraries.places.widget.internal.placedetails.zzcf zzcfVar = this.zzd;
            final android.graphics.drawable.Drawable drawable = this.zze;
            this.zza = 1;
            if (zzpmVar.zza(android.net.Uri.parse(str), new com.google.android.libraries.places.internal.zzpo(zzcfVar.zzb(), new kotlin.jvm.functions.Function1() { // from class: com.google.android.libraries.places.widget.internal.placedetails.zzcg
                @Override // kotlin.jvm.functions.Function1
                public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj2) {
                    com.google.android.libraries.places.widget.internal.placedetails.zzcf.this.zzb().setImageDrawable(drawable);
                    return kotlin.Unit.INSTANCE;
                }
            }), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.google.android.libraries.places.widget.internal.placedetails.zzch(this.zzb, this.zzc, this.zzd, this.zze, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzch(com.google.android.libraries.places.widget.internal.placedetails.zzci zzciVar, java.lang.String str, com.google.android.libraries.places.widget.internal.placedetails.zzcf zzcfVar, android.graphics.drawable.Drawable drawable, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.zzb = zzciVar;
        this.zzc = str;
        this.zzd = zzcfVar;
        this.zze = drawable;
    }
}
