package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.common.api.internal.C0824a;
import com.google.android.gms.tasks.Task;

/* loaded from: classes.dex */
public interface zzg {
    /* synthetic */ C0824a getApiKey();

    Task zza(zzbw zzbwVar);

    Task zzb(AccountChangeEventsRequest accountChangeEventsRequest);

    Task zzc(Account account, String str, Bundle bundle);

    Task zzd(Account account);

    Task zze(String str);
}
