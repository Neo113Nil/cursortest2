package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgbi {
    public static final com.google.android.gms.internal.ads.zzgbg zza(final java.util.concurrent.ExecutorService executorService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executorService, "executorService");
        return new com.google.android.gms.internal.ads.zzgbg() { // from class: com.google.android.gms.internal.ads.zzgbh
            @Override // com.google.android.gms.internal.ads.zzgbg
            public final /* synthetic */ kotlinx.coroutines.CoroutineScope zza() {
                return kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.ExecutorsKt.from(executorService));
            }
        };
    }
}
