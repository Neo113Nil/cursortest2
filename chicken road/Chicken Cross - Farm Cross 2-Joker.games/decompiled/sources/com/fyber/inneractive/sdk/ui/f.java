package com.fyber.inneractive.sdk.ui;

import com.fyber.inneractive.sdk.web.m;

/* loaded from: classes4.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAmraidWebViewController f5936a;

    public f(IAmraidWebViewController iAmraidWebViewController) {
        this.f5936a = iAmraidWebViewController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar = this.f5936a.b;
        if (mVar != null) {
            try {
                mVar.invalidate();
            } catch (Throwable unused) {
            }
        }
    }
}
