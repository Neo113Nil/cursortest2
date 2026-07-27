package com.startapp.flutter.sdk;

import T1.n;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
class StartAppMethodResultWrapper {
    private final AtomicReference<n> ref;

    public StartAppMethodResultWrapper(n nVar) {
        this.ref = new AtomicReference<>(nVar);
    }

    public void error(String str, String str2) {
        n andSet = this.ref.getAndSet(null);
        if (andSet != null) {
            andSet.b(str, str2, null);
        }
    }

    public void success(Object obj) {
        n andSet = this.ref.getAndSet(null);
        if (andSet != null) {
            andSet.success(obj);
        }
    }
}
