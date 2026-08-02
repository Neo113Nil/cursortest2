package com.google.android.gms.auth.api.phone;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.tasks.Task;

/* loaded from: classes4.dex */
public abstract class a extends g<a.d.c> {
    private static final a.g zza;
    private static final a.AbstractC0110a zzb;
    private static final com.google.android.gms.common.api.a zzc;

    static {
        a.g gVar = new a.g();
        zza = gVar;
        b bVar = new b();
        zzb = bVar;
        zzc = new com.google.android.gms.common.api.a("SmsRetriever.API", bVar, gVar);
    }

    public a(@NonNull Activity activity) {
        super(activity, (com.google.android.gms.common.api.a<a.d.c>) zzc, a.d.g, g.a.c);
    }

    @NonNull
    public abstract Task<Void> startSmsRetriever();

    @NonNull
    public abstract Task<Void> startSmsUserConsent(@Nullable String str);

    public a(@NonNull Context context) {
        super(context, (com.google.android.gms.common.api.a<a.d.c>) zzc, a.d.g, g.a.c);
    }
}
