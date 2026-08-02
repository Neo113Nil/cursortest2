package com.facetec.sdk;

/* loaded from: classes8.dex */
public final class bs implements com.facetec.sdk.FaceTecIDScanResultCallback {
    public static int b;
    public static int c;
    private final java.lang.ref.WeakReference<com.facetec.sdk.bl> d;

    bs(com.facetec.sdk.bl blVar) {
        this.d = new java.lang.ref.WeakReference<>(blVar);
    }

    @Override // com.facetec.sdk.FaceTecIDScanResultCallback
    public final boolean proceedToNextStep(java.lang.String str) {
        com.facetec.sdk.bl blVar = this.d.get();
        if (com.facetec.sdk.ay.b((android.app.Activity) blVar)) {
            return blVar.e(str);
        }
        return false;
    }

    @Override // com.facetec.sdk.FaceTecIDScanResultCallback
    public final void uploadMessageOverride(java.lang.String str) {
        com.facetec.sdk.bl blVar = this.d.get();
        if (com.facetec.sdk.ay.b((android.app.Activity) blVar)) {
            blVar.c(str);
        }
    }

    @Override // com.facetec.sdk.FaceTecIDScanResultCallback
    public final void uploadProgress(float f) {
        com.facetec.sdk.bl blVar = this.d.get();
        if (com.facetec.sdk.ay.b((android.app.Activity) blVar)) {
            blVar.b(f);
        }
    }

    @Override // com.facetec.sdk.FaceTecIDScanResultCallback
    public final void cancel() {
        com.facetec.sdk.bl blVar = this.d.get();
        if (com.facetec.sdk.ay.b((android.app.Activity) blVar)) {
            this.d.clear();
            blVar.F = true;
            blVar.C();
        }
    }

    public static int d() {
        int i = c;
        c = i + 1;
        if (i % 7802364 != 0) {
            return b;
        }
        int myPid = android.os.Process.myPid();
        b = myPid;
        return myPid;
    }
}
