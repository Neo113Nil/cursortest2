package com.google.android.gms.common.api.internal;

import android.support.annotation.NonNull;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [TResult] */
/* loaded from: classes.dex */
final class zzac<TResult> implements OnCompleteListener<TResult> {
    private final /* synthetic */ zzaa zzgz;
    private final /* synthetic */ TaskCompletionSource zzha;

    zzac(zzaa zzaaVar, TaskCompletionSource taskCompletionSource) {
        this.zzgz = zzaaVar;
        this.zzha = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(@NonNull Task<TResult> task) {
        Map map;
        map = this.zzgz.zzgx;
        map.remove(this.zzha);
    }
}
