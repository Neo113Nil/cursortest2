package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* loaded from: classes.dex */
public final class l implements com.google.android.datatransport.runtime.dagger.internal.b<k> {
    public final com.google.android.datatransport.runtime.dagger.internal.c a;
    public final j b;

    public l(com.google.android.datatransport.runtime.dagger.internal.c cVar, j jVar) {
        this.a = cVar;
        this.b = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.a
    public final Object get() {
        return new k((Context) this.a.a, (i) this.b.get());
    }
}
