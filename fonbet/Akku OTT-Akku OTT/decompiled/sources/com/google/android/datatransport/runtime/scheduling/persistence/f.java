package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;

/* loaded from: classes.dex */
public final class f implements com.google.android.datatransport.runtime.dagger.internal.b<String> {
    public final javax.inject.a<Context> a;

    public f(javax.inject.a<Context> aVar) {
        this.a = aVar;
    }

    @Override // javax.inject.a
    public final Object get() {
        String packageName = this.a.get().getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
