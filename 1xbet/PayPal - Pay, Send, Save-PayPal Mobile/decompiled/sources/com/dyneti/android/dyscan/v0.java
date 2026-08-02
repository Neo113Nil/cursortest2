package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.dyneti.android.dyscan.DyScanActivity f3346a;

    public v0(com.dyneti.android.dyscan.DyScanActivity dyScanActivity) {
        this.f3346a = dyScanActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.dyneti.android.dyscan.DyScanActivity dyScanActivity = this.f3346a;
        if (dyScanActivity.f && !dyScanActivity.c()) {
            dyScanActivity.a();
        } else {
            if (dyScanActivity.f || !dyScanActivity.c()) {
                return;
            }
            dyScanActivity.a(!dyScanActivity.h.isTorchEnabled());
        }
    }
}
