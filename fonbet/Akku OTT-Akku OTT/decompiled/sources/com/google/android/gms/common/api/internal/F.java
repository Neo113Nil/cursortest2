package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ComponentCallbacks2C0829c;
import com.google.android.gms.internal.base.zau;

/* loaded from: classes4.dex */
public final class F implements ComponentCallbacks2C0829c.a {
    public final /* synthetic */ C0833g a;

    public F(C0833g c0833g) {
        this.a = c0833g;
    }

    @Override // com.google.android.gms.common.api.internal.ComponentCallbacks2C0829c.a
    public final void onBackgroundStateChanged(boolean z) {
        zau zauVar = this.a.p;
        zauVar.sendMessage(zauVar.obtainMessage(1, Boolean.valueOf(z)));
    }
}
