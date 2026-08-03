package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
public interface zzg extends com.google.android.gms.common.api.HasApiKey {
    com.google.android.gms.tasks.Task zza(com.google.android.gms.internal.auth.zzbw zzbwVar);

    com.google.android.gms.tasks.Task zzb(com.google.android.gms.auth.AccountChangeEventsRequest accountChangeEventsRequest);

    com.google.android.gms.tasks.Task zzc(android.accounts.Account account, java.lang.String str, android.os.Bundle bundle);

    com.google.android.gms.tasks.Task zzd(android.accounts.Account account);

    com.google.android.gms.tasks.Task zze(java.lang.String str);
}
