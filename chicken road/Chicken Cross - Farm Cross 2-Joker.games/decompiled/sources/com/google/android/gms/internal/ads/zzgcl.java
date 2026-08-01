package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzgcl {
    public static final zzgcj zza(final ExecutorService executorService) {
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        return new zzgcj() { // from class: com.google.android.gms.internal.ads.zzgck
            @Override // com.google.android.gms.internal.ads.zzgcj
            public final /* synthetic */ CoroutineScope zza() {
                return CoroutineScopeKt.CoroutineScope(ExecutorsKt.from(executorService));
            }
        };
    }
}
