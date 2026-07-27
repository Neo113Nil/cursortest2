package com.startapp.sdk.internal;

import android.os.Handler;

/* loaded from: classes.dex */
public final class w5 implements i7 {
    @Override // com.startapp.sdk.internal.i7
    public final Object a() {
        l8 l8Var = new l8("startapp-".concat("db"));
        l8Var.start();
        return new k8(new Handler(l8Var.getLooper()));
    }
}
