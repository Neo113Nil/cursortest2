package com.google.android.gms.common.api.internal;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes3.dex */
public final class zae extends com.google.android.gms.common.api.internal.zai {
    protected final com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl zaa;

    public zae(int i, com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl apiMethodImpl) {
        super(i);
        this.zaa = (com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl) com.google.android.gms.common.internal.Preconditions.checkNotNull(apiMethodImpl, "Null methods are not runnable.");
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zad(com.google.android.gms.common.api.Status status) {
        try {
            this.zaa.setFailedResult(status);
        } catch (java.lang.IllegalStateException e) {
            android.util.Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zae(java.lang.Exception exc) {
        try {
            this.zaa.setFailedResult(new com.google.android.gms.common.api.Status(10, exc.getClass().getSimpleName() + ": " + exc.getLocalizedMessage()));
        } catch (java.lang.IllegalStateException e) {
            android.util.Log.w("ApiCallRunner", "Exception reporting failure", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zaf(com.google.android.gms.common.api.internal.zabq zabqVar) throws android.os.DeadObjectException {
        try {
            this.zaa.run(zabqVar.zaf());
        } catch (java.lang.RuntimeException e) {
            zae(e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.zai
    public final void zag(com.google.android.gms.common.api.internal.zaad zaadVar, boolean z) {
        zaadVar.zac(this.zaa, z);
    }
}
