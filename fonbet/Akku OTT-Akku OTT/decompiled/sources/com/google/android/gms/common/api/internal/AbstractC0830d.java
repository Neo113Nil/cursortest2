package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.C0875q;

/* renamed from: com.google.android.gms.common.api.internal.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC0830d<R extends com.google.android.gms.common.api.l, A extends a.b> extends BasePendingResult<R> implements InterfaceC0831e<R> {

    @Nullable
    private final com.google.android.gms.common.api.a<?> api;
    private final a.c<A> clientKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public AbstractC0830d(@NonNull a.c<A> cVar, @NonNull com.google.android.gms.common.api.h hVar) {
        super(hVar);
        C0875q.h(hVar, "GoogleApiClient must not be null");
        C0875q.g(cVar);
        this.clientKey = cVar;
        this.api = null;
    }

    private void setFailedResult(@NonNull RemoteException remoteException) {
        setFailedResult(new Status(8, remoteException.getLocalizedMessage(), null, null));
    }

    public abstract void doExecute(@NonNull A a) throws RemoteException;

    @Nullable
    public final com.google.android.gms.common.api.a<?> getApi() {
        return this.api;
    }

    @NonNull
    public final a.c<A> getClientKey() {
        return this.clientKey;
    }

    public void onSetFailedResult(@NonNull R r) {
    }

    public final void run(@NonNull A a) throws DeadObjectException {
        try {
            doExecute(a);
        } catch (DeadObjectException e) {
            setFailedResult(e);
            throw e;
        } catch (RemoteException e2) {
            setFailedResult(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* bridge */ /* synthetic */ void setResult(@NonNull Object obj) {
        setResult((AbstractC0830d<R, A>) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0830d(@NonNull com.google.android.gms.common.api.a<?> aVar, @NonNull com.google.android.gms.common.api.h hVar) {
        super(hVar);
        C0875q.h(hVar, "GoogleApiClient must not be null");
        C0875q.h(aVar, "Api must not be null");
        this.clientKey = aVar.b;
        this.api = aVar;
    }

    public final void setFailedResult(@NonNull Status status) {
        C0875q.b(!status.l(), "Failed result must not be success");
        R createFailedResult = createFailedResult(status);
        setResult((AbstractC0830d<R, A>) createFailedResult);
        onSetFailedResult(createFailedResult);
    }

    @VisibleForTesting
    public AbstractC0830d(@NonNull BasePendingResult.a<R> aVar) {
        super(aVar);
        this.clientKey = new a.c<>();
        this.api = null;
    }
}
