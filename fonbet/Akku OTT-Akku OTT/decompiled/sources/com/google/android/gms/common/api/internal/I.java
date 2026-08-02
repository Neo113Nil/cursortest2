package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;

/* loaded from: classes4.dex */
public final class I implements Runnable {
    public final /* synthetic */ J a;

    public I(J j) {
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.f fVar = this.a.a.b;
        fVar.disconnect(fVar.getClass().getName().concat(" disconnecting because it was signed out."));
    }
}
