package com.google.android.gms.internal.auth;

import X2.c;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.AbstractC0827d;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;

/* loaded from: classes.dex */
abstract class zzbi extends AbstractC0827d {
    public zzbi(o oVar) {
        super(c.f7470a, oVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ s createFailedResult(Status status) {
        return new zzbu(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0827d
    public final /* bridge */ /* synthetic */ void doExecute(b bVar) {
        zzbe zzbeVar = (zzbe) bVar;
        zza(zzbeVar.getContext(), (zzbh) zzbeVar.getService());
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.InterfaceC0828e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzbi) obj);
    }

    public abstract void zza(Context context, zzbh zzbhVar);
}
