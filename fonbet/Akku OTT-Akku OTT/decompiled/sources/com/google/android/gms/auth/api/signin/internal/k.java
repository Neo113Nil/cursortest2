package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.internal.p000authapi.zbc;
import okhttp3.internal.http.HttpStatusCodesKt;

/* loaded from: classes4.dex */
public final class k extends l {
    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.l createFailedResult(Status status) {
        return status;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.AbstractC0830d
    public final void doExecute(a.b bVar) throws RemoteException {
        g gVar = (g) bVar;
        r rVar = (r) gVar.getService();
        j jVar = new j(this);
        GoogleSignInOptions googleSignInOptions = gVar.a;
        Parcel zba = rVar.zba();
        zbc.zbc(zba, jVar);
        zbc.zbb(zba, googleSignInOptions);
        rVar.zbb(HttpStatusCodesKt.HTTP_EARLY_HINTS, zba);
    }
}
