package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final /* synthetic */ class zzgsn extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2, kotlin.coroutines.jvm.internal.SuspendFunction {
    public static final com.google.android.gms.internal.ads.zzgsn zza = new com.google.android.gms.internal.ads.zzgsn();

    zzgsn() {
        super(2, com.google.android.gms.internal.ads.zzgsp.class, "lockWithoutOwner", "lockWithoutOwner(Lkotlinx/coroutines/sync/Mutex;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object zzd;
        zzd = com.google.android.gms.internal.ads.zzgsp.zzd((kotlinx.coroutines.sync.Mutex) obj, (kotlin.coroutines.Continuation) obj2);
        return zzd;
    }
}
