package com.daon.dmds.views;

/* loaded from: classes7.dex */
public final /* synthetic */ class DMDSScanView$$ExternalSyntheticLambda1 implements java.lang.Runnable {
    public final /* synthetic */ android.graphics.Bitmap f$0;
    public final /* synthetic */ com.daon.dmds.models.DMDSQuadrangle f$1;

    public /* synthetic */ DMDSScanView$$ExternalSyntheticLambda1(android.graphics.Bitmap bitmap, com.daon.dmds.models.DMDSQuadrangle dMDSQuadrangle) {
        this.f$0 = bitmap;
        this.f$1 = dMDSQuadrangle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.daon.dmds.views.DMDSScanView.debugPointsView.setBmpAndRect(this.f$0, this.f$1);
    }
}
