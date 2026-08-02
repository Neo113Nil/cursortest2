package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class u0 implements android.view.View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.dyneti.android.dyscan.DyScanActivity f3344a;

    public u0(com.dyneti.android.dyscan.DyScanActivity dyScanActivity) {
        this.f3344a = dyScanActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        this.f3344a.a(!r2.h.isTorchEnabled());
    }
}
