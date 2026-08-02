package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* loaded from: classes.dex */
public final class j implements com.google.android.datatransport.runtime.dagger.internal.b<i> {
    public final com.google.android.datatransport.runtime.dagger.internal.c a;

    public j(com.google.android.datatransport.runtime.dagger.internal.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.a
    public final Object get() {
        return new i((Context) this.a.a, new com.baseflow.permissionhandler.a(), new com.google.android.datatransport.runtime.time.b());
    }
}
