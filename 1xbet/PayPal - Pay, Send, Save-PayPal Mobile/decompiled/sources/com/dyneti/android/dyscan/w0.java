package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.dyneti.android.dyscan.DyScanActivity f3349a;

    public w0(com.dyneti.android.dyscan.DyScanActivity dyScanActivity) {
        this.f3349a = dyScanActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        this.f3349a.setResult(5, new android.content.Intent());
        this.f3349a.finish();
    }
}
