package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.b;
import com.google.android.gms.common.api.internal.C0828b;
import com.google.android.gms.tasks.Task;

/* loaded from: classes4.dex */
public interface zzg {
    @NonNull
    /* synthetic */ C0828b getApiKey();

    Task zza(zzbw zzbwVar);

    Task zzb(@NonNull b bVar);

    Task zzc(@NonNull Account account, @NonNull String str, Bundle bundle);

    Task zzd(@NonNull Account account);

    Task zze(@NonNull String str);
}
