package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;

/* loaded from: classes.dex */
public final class w implements com.google.android.datatransport.runtime.dagger.internal.b<v> {
    public final javax.inject.a<Context> a;

    public w(javax.inject.a aVar) {
        this.a = aVar;
    }

    @Override // javax.inject.a
    public final Object get() {
        return new v(this.a.get(), Integer.valueOf(v.d).intValue(), "com.google.android.datatransport.events");
    }
}
