package com.fyber.inneractive.sdk.web;

/* loaded from: classes3.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.web.i0 f4355a;

    public s(com.fyber.inneractive.sdk.web.i0 i0Var) {
        this.f4355a = i0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.fyber.inneractive.sdk.web.i0 i0Var = this.f4355a;
            if (i0Var.V != null) {
                i0Var.getClass();
                com.fyber.inneractive.sdk.util.IAlog.a("%sunregistering orientation broadcast receiver", com.fyber.inneractive.sdk.util.IAlog.a(i0Var));
                this.f4355a.V.a();
            }
        } catch (java.lang.IllegalArgumentException e) {
            if (e.getMessage() != null && !e.getMessage().contains("Receiver not registered")) {
                throw e;
            }
        }
        this.f4355a.V = null;
    }
}
