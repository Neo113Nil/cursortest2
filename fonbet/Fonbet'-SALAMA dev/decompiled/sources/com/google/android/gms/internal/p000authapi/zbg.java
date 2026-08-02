package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import com.google.android.gms.auth.api.credentials.CredentialRequest;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;

/* loaded from: classes.dex */
final class zbg extends zbm {
    final /* synthetic */ CredentialRequest zba;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbg(zbl zblVar, o oVar, CredentialRequest credentialRequest) {
        super(oVar);
        this.zba = credentialRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ s createFailedResult(Status status) {
        return new zbe(status, null);
    }

    @Override // com.google.android.gms.internal.p000authapi.zbm
    public final void zba(Context context, zbt zbtVar) {
        zbtVar.zbd(new zbf(this), this.zba);
    }
}
