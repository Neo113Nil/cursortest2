package com.facetec.sdk;

/* loaded from: classes8.dex */
final class be implements com.facetec.sdk.FaceTecFaceScanResultCallback {
    private final java.lang.ref.WeakReference<com.facetec.sdk.bl> d;

    be(com.facetec.sdk.bl blVar) {
        this.d = new java.lang.ref.WeakReference<>(blVar);
    }

    private com.facetec.sdk.bl c(boolean z) {
        com.facetec.sdk.bl blVar = this.d.get();
        if (z) {
            this.d.clear();
        }
        return blVar;
    }

    @Override // com.facetec.sdk.FaceTecFaceScanResultCallback
    public final void uploadMessageOverride(java.lang.String str) {
        com.facetec.sdk.bl c = c(false);
        if (com.facetec.sdk.ay.b((android.app.Activity) c)) {
            c.c(str);
        }
    }

    @Override // com.facetec.sdk.FaceTecFaceScanResultCallback
    public final void uploadProgress(float f) {
        com.facetec.sdk.bl c = c(false);
        if (com.facetec.sdk.ay.b((android.app.Activity) c)) {
            c.b(f);
        }
    }

    @Override // com.facetec.sdk.FaceTecFaceScanResultCallback
    public final void succeed() {
        succeed(com.facetec.sdk.FaceTecIDScanNextStep.SELECTION_SCREEN);
    }

    @Override // com.facetec.sdk.FaceTecFaceScanResultCallback
    public final void succeed(com.facetec.sdk.FaceTecIDScanNextStep faceTecIDScanNextStep) {
        com.facetec.sdk.FaceTecSDK.b++;
        com.facetec.sdk.bl c = c(true);
        if (com.facetec.sdk.ay.b((android.app.Activity) c)) {
            c.d(faceTecIDScanNextStep);
        }
    }

    @Override // com.facetec.sdk.FaceTecFaceScanResultCallback
    public final void retry() {
        com.facetec.sdk.FaceTecSDK.h++;
        com.facetec.sdk.bl c = c(true);
        if (com.facetec.sdk.ay.b((android.app.Activity) c)) {
            c.u();
        }
    }

    @Override // com.facetec.sdk.FaceTecFaceScanResultCallback
    public final void cancel() {
        com.facetec.sdk.FaceTecSDK.j++;
        com.facetec.sdk.bl c = c(true);
        if (com.facetec.sdk.ay.b((android.app.Activity) c)) {
            c.F = true;
            com.facetec.sdk.t.c(c, com.facetec.sdk.c.DEVELOPER_USED_FACESCAN_CALLBACK, com.paypal.oslo.feature.identity.passwordrecovery.ui.analytics.PasswordRecoveryAnalytics.ITEM_CANCEL, (java.lang.Throwable) null);
            c.e(c.B.getStatus());
        }
    }

    @Override // com.facetec.sdk.FaceTecFaceScanResultCallback
    public final boolean proceedToNextStep(java.lang.String str) {
        return proceedToNextStep(str, com.facetec.sdk.FaceTecIDScanNextStep.SELECTION_SCREEN);
    }

    @Override // com.facetec.sdk.FaceTecFaceScanResultCallback
    public final boolean proceedToNextStep(java.lang.String str, com.facetec.sdk.FaceTecIDScanNextStep faceTecIDScanNextStep) {
        com.facetec.sdk.bl c = c(true);
        if (com.facetec.sdk.ay.b((android.app.Activity) c)) {
            return c.d(str, faceTecIDScanNextStep);
        }
        return false;
    }
}
