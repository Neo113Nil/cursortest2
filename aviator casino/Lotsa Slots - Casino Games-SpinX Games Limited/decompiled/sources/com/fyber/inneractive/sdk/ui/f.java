package com.fyber.inneractive.sdk.ui;

/* loaded from: classes3.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.ui.IAmraidWebViewController f4279a;

    public f(com.fyber.inneractive.sdk.ui.IAmraidWebViewController iAmraidWebViewController) {
        this.f4279a = iAmraidWebViewController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.fyber.inneractive.sdk.web.m mVar = this.f4279a.b;
        if (mVar != null) {
            try {
                mVar.invalidate();
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
