package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
public interface zzg extends com.google.android.gms.common.api.HasApiKey {
    com.google.android.gms.tasks.Task zza(com.google.android.gms.internal.auth.zzbw zzbwVar);

    com.google.android.gms.tasks.Task zzb(com.google.android.gms.auth.AccountChangeEventsRequest accountChangeEventsRequest);

    com.google.android.gms.tasks.Task zzc(android.accounts.Account account, java.lang.String str, android.os.Bundle bundle);

    com.google.android.gms.tasks.Task zzd(android.accounts.Account account);

    com.google.android.gms.tasks.Task zze(java.lang.String str);
}
