package com.google.android.gms.wallet.contract;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C0874p;

/* loaded from: classes4.dex */
public class ApiTaskResult<T> {

    @Nullable
    private final Object zza;
    private final Status zzb;

    public ApiTaskResult(@Nullable T t, @NonNull Status status) {
        this.zza = t;
        this.zzb = status;
    }

    @Nullable
    public T getResult() {
        return (T) this.zza;
    }

    @NonNull
    public Status getStatus() {
        return this.zzb;
    }

    @NonNull
    public String toString() {
        C0874p.a aVar = new C0874p.a(this);
        aVar.a(this.zzb, NotificationCompat.CATEGORY_STATUS);
        aVar.a(this.zza, "result");
        return aVar.toString();
    }

    public ApiTaskResult(@NonNull Status status) {
        this(null, status);
    }
}
