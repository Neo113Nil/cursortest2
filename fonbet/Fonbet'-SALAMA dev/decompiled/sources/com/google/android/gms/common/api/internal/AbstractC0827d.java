package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.common.api.internal.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0827d extends BasePendingResult implements InterfaceC0828e {
    private final com.google.android.gms.common.api.i mApi;
    private final com.google.android.gms.common.api.c mClientKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0827d(com.google.android.gms.common.api.i iVar, com.google.android.gms.common.api.o oVar) {
        super(oVar);
        com.google.android.gms.common.internal.D.j(oVar, "GoogleApiClient must not be null");
        com.google.android.gms.common.internal.D.j(iVar, "Api must not be null");
        this.mClientKey = iVar.f11088b;
        this.mApi = iVar;
    }

    public abstract void doExecute(com.google.android.gms.common.api.b bVar);

    public final com.google.android.gms.common.api.i getApi() {
        return this.mApi;
    }

    public final com.google.android.gms.common.api.c getClientKey() {
        return this.mClientKey;
    }

    public void onSetFailedResult(com.google.android.gms.common.api.s sVar) {
    }

    public final void run(com.google.android.gms.common.api.b bVar) {
        try {
            doExecute(bVar);
        } catch (DeadObjectException e7) {
            setFailedResult(new Status(8, e7.getLocalizedMessage(), null, null));
            throw e7;
        } catch (RemoteException e8) {
            setFailedResult(new Status(8, e8.getLocalizedMessage(), null, null));
        }
    }

    public final void setFailedResult(Status status) {
        com.google.android.gms.common.internal.D.a("Failed result must not be success", !status.j());
        com.google.android.gms.common.api.s createFailedResult = createFailedResult(status);
        setResult((AbstractC0827d) createFailedResult);
        onSetFailedResult(createFailedResult);
    }
}
