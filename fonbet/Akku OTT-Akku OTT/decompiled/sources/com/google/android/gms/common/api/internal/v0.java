package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* loaded from: classes4.dex */
public final class v0 implements Runnable {
    public final /* synthetic */ C0836j a;
    public final /* synthetic */ String b;
    public final /* synthetic */ w0 c;

    public v0(w0 w0Var, C0836j c0836j, String str) {
        this.a = c0836j;
        this.b = str;
        this.c = w0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w0 w0Var = this.c;
        int i = w0Var.b;
        C0836j c0836j = this.a;
        if (i > 0) {
            Bundle bundle = w0Var.c;
            c0836j.onCreate(bundle != null ? bundle.getBundle(this.b) : null);
        }
        if (w0Var.b >= 2) {
            c0836j.onStart();
        }
        if (w0Var.b >= 3) {
            c0836j.onResume();
        }
        if (w0Var.b >= 4) {
            c0836j.onStop();
        }
        if (w0Var.b >= 5) {
            c0836j.onDestroy();
        }
    }
}
