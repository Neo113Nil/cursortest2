package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.auth.account.f;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.AbstractC0830d;
import com.google.android.gms.common.api.l;

/* loaded from: classes4.dex */
final class zzac extends AbstractC0830d {
    final /* synthetic */ boolean zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzal zzalVar, a aVar, h hVar, boolean z) {
        super((a<?>) aVar, hVar);
        this.zza = z;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final l createFailedResult(Status status) {
        return new zzaj(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0830d
    public final /* bridge */ /* synthetic */ void doExecute(a.b bVar) throws RemoteException {
        ((f) ((zzam) bVar).getService()).j(this.zza);
        setResult((zzac) new zzaj(Status.e));
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0830d, com.google.android.gms.common.api.internal.InterfaceC0831e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((zzac) obj);
    }
}
