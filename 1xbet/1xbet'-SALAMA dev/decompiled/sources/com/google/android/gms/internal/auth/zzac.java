package com.google.android.gms.internal.auth;

import W2.d;
import W2.f;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0783d;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;

/* JADX INFO: loaded from: classes.dex */
final class zzac extends AbstractC0783d {
    final /* synthetic */ boolean zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzac(zzal zzalVar, i iVar, o oVar, boolean z4) {
        super(iVar, oVar);
        this.zza = z4;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final s createFailedResult(Status status) {
        return new zzaj(status);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC0783d
    public final void doExecute(b bVar) {
        f fVar = (f) ((zzam) bVar).getService();
        boolean z4 = this.zza;
        d dVar = (d) fVar;
        Parcel parcelZza = dVar.zza();
        zzc.zzc(parcelZza, z4);
        dVar.zzc(1, parcelZza);
        setResult(new zzaj(Status.f11077e));
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.internal.InterfaceC0784e
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        setResult((s) obj);
    }
}
