package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.C0875q;

/* loaded from: classes4.dex */
public final class zzbv implements l {
    private final Status zza;
    private final String zzb;

    public zzbv(Status status) {
        C0875q.g(status);
        this.zza = status;
        this.zzb = "";
    }

    public final String getSpatulaHeader() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.l
    public final Status getStatus() {
        return this.zza;
    }

    public zzbv(String str) {
        C0875q.g(str);
        this.zzb = str;
        this.zza = Status.e;
    }
}
